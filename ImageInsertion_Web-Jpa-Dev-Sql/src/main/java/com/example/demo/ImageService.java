package com.example.demo;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	
	@Autowired
	ImageRepo repo;
	
	public String insertImage(MultipartFile file, String name, String descp) throws IOException {
		ImageData img = new ImageData();
		img.setName(name);
		img.setDesc(descp);
		img.setImage(file.getBytes());
		repo.save(img);
		
		return "Image inserted Succesfully";
	}
	
//	public byte[] downloadImg(int id) {
//		
//		Optional<ImageData> img1 = repo.findById(id);
//		byte[] images = img1.get().getImage();
//		
//		return images;
//	}
	
	public byte[] downloadImage(int id) {
		
		Optional<ImageData> img = repo.findById(id);
		if(img.isPresent()) {
			
			return img.get().getImage();
		}
		else {
			
			throw new RuntimeException("Image Not Found");
		}
	}
}
