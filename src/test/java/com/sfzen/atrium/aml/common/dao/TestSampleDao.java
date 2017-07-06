package com.sfzen.atrium.aml.common.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sfzen.atrium.aml.mapper.common.SampleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application-context.xml")
public class TestSampleDao {

	@Autowired
	public SampleMapper sampleMapper;
	
	
	@Test
	public void getGetWorkArea(){
		String area = sampleMapper.getWorkArea("01");
		assertThat(area, is("은행"));
	}
	
	@Test
	public void testGetWorkAreas(){
		ArrayList<String> areas = sampleMapper.getWorkAreas();
		assertThat(areas.size(), is(4));
	}
	
	
}
