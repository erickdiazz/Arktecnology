package com.arktecno.humandefender.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arktecno.humandefender.entity.MessageControl;


@RestController
public class WSController {

	@RequestMapping(value="/")
	public ResponseEntity<MessageControl> update(@RequestBody MessageControl messageControl){
		
		return new ResponseEntity<MessageControl>(messageControl, HttpStatus.OK);
	}
}
