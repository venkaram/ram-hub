package com.test;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

public class NewTest {
	
	public static void main(String[] args) {
		Date date = new Date();
		String dateScan = String.valueOf(date.getTime());
		System.out.println(dateScan);
		String sourcePath = "D:\\tiff_test\\";
		String destFolderName = "D:\\tiff_test\\split\\"+dateScan;
		
		//List<String> docList = (List) Arrays.asList(new String[]{"ApplicationCombBW102193921.tif","NBApplication form.tif"});
		String fileName = "ApplicationCombBW102193921.tif";
		String docName = fileName.substring(0, fileName.indexOf(".tif"));
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		String txtfile = "";
		
		try{
			
			String[] writers = ImageIO.getWriterFormatNames();
			System.out.println("writers : ");
			for(String str : writers){
				System.out.println(str);
			}
			
			ImageWriter imageWriter = (ImageWriter) ImageIO.getImageWritersByFormatName("tif").next();
			//ImageWriter imageWriter = (ImageWriter) ImageIO.getImageWritersByMIMEType("image/tiff").next();
			ImageWriteParam param = imageWriter.getDefaultWriteParam();
			
			ImageInputStream is = ImageIO.createImageInputStream(new File(sourcePath+fileName));
			if (is == null || is.length() == 0){
			  // handle error
			}
			Iterator<ImageReader> iterator = ImageIO.getImageReaders(is);
			//Iterator<ImageReader> iterator = ImageIO.getImageReadersByFormatName("tif");
			if (iterator == null || !iterator.hasNext()) {
			  throw new IOException("Image file format not supported by ImageIO: " + sourcePath+fileName);
			}
			
			// We are just looking for the first reader compatible:
			ImageReader reader = (ImageReader) iterator.next();
			//iterator = null;
			reader.setInput(is);
			
			int nbPages = reader.getNumImages(true);
			
			File file = new File(destFolderName);
			if(!file.exists()){
				file.mkdirs();
				txtfile = destFolderName+"\\"+dateScan+".txt";
                File f = new File(txtfile);
                if(!f.exists()){
                	f.createNewFile();
                }
			}
			
			fw = new FileWriter(txtfile, true);
			bw = new BufferedWriter(fw);
			for(int i = 0; i < nbPages; i++){
				IIOMetadata metaData = reader.getImageMetadata(0);
				BufferedImage image = reader.read(i);
				//metaData.getAsTree("javax_imageio_jpeg_image_1.0").getElementsByTagName("app0JFIF");
				//Element tree = (Element) metaData.getAsTree("com_sun_media_imageio_plugins_tiff_image_1.0");
				/* String[] strArr = metaData.getMetadataFormatNames();
				NodeList list = tree.getChildNodes();
				for(int j=0;i<list.getLength();j++){
					System.out.println("::"+list.item(j).getNodeName());
				}*/
				/*Element jfif = (Element) tree.getElementsByTagName("TIFFIFD").item(0);
				jfif.setAttribute("Xdensity", Integer.toString(400));
				jfif.setAttribute("Ydensity", Integer.toString(400));
				metaData.setFromTree("com_sun_media_imageio_plugins_tiff_image_1.0", tree);*/
				
				FileOutputStream os = new FileOutputStream(destFolderName+"\\"+docName+"_"+i+".tif");
		        final ImageOutputStream stream = ImageIO.createImageOutputStream(os);
				imageWriter.setOutput(stream);
				imageWriter.write(metaData, new IIOImage(image, null, metaData), param);
				//File outputfile = new File(destFolderName+"\\"+i+".tif");
				//ImageIO.write(image, "jpg", outputfile);
				stream.close();
				bw.write(nbPages+"|"+docName+"_"+(i+1)+".tif"+System.lineSeparator());
			}
			bw.close();
			fw.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
