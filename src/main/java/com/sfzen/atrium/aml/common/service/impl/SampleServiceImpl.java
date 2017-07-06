package com.sfzen.atrium.aml.common.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sfzen.atrium.aml.common.service.SampleService;
import com.sfzen.atrium.aml.mapper.common.SampleMapper;

@Component
@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private SampleMapper sampleMapper;

	@Override
	public String returnString(String param) {
		// TODO Auto-generated method stub
		return param;
	}
	
	@Override
	public ArrayList<String> printWorkAreas(){
		
		ArrayList<String> areas = sampleMapper.getWorkAreas();
		
		return areas;
		
	}

	
}
