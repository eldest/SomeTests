/*
 * Copyright (C) 2008-2009 Eremenko EremenkoAA@ics-ware.com
 * 
 * Information Corporative Systems, ICS LLC
 * TelaDictum LLC
 *
 * IntegerUserMapAdapter
 * 
 * Created: 12.10.2009
 * History: 
 *    
 *
 * $Id$
 * 
 */
package com.eldest.webservice.cxf;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author EremenkoAA
 * 
 */
public class IntegerUserMapAdapter extends
		XmlAdapter<IntegerUserMap, Map<Integer, User>> {

	@Override
	public IntegerUserMap marshal(Map<Integer, User> v) throws Exception {
		IntegerUserMap map = new IntegerUserMap();
		for (Map.Entry<Integer, User> e : v.entrySet()) {
			IntegerUserMap.IntegerUserEntry iue = new IntegerUserMap.IntegerUserEntry();
			iue.setUser(e.getValue());
			iue.setId(e.getKey());
			map.getEntries().add(iue);
		}
		return map;
	}

	@Override
	public Map<Integer, User> unmarshal(IntegerUserMap v) throws Exception {
		Map<Integer, User> map = new LinkedHashMap<Integer, User>();
		for (IntegerUserMap.IntegerUserEntry e : v.getEntries()) {
			map.put(e.getId(), e.getUser());
		}
		return map;
	}

}
