/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.dao;

import java.util.List;

import com.springinpractice.ch04.domain.Event;
import com.springinpractice.ch04.domain.Registration;
import com.springinpractice.dao.Dao;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface EventDao extends Dao<Event> {
	
	void create(Event event);
	
	Event findById(String id);
	
    List<Event> findAllBreakouts();
    
    List<Event> findAllActivities();
    
}
