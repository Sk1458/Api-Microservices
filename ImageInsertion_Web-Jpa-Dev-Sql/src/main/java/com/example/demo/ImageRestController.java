package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageRestController {
	
	@Autowired
	ImageService serv;
	
	@PostMapping("/testing/insertimage")
	public String insertImage(@RequestParam("file") MultipartFile file, 
							  @RequestParam("name") String name,
							  @RequestParam("descp") String descp) throws IOException {
	
		return serv.insertImage(file, name, descp);
	}
	
//	@GetMapping("/testing/getimage/{id}")
//	public ResponseEntity<?> getImage(@PathVariable int id) {
//		
//		byte[] pic = serv.downloadImg(id);
//		
//		return ResponseEntity.status(HttpStatus.OK)
//							 .contentType(MediaType.valueOf("image/png"))
//							 .body(pic);
//	}
	
	@GetMapping("/testing/getimage/{id}")
	public ResponseEntity<?> getImage(@PathVariable int id) {
		try {
			byte[] image = serv.downloadImage(id);
			
			return ResponseEntity.status(HttpStatus.OK)
								 .contentType(MediaType.IMAGE_PNG)
								 .body(image);
		}
		catch(Exception e) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
}
