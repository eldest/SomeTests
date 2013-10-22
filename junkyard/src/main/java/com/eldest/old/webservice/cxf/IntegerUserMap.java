/*
 * Copyright (C) 2008-2009 Eremenko EremenkoAA@ics-ware.com
 * 
 * Information Corporative Systems, ICS LLC
 * TelaDictum LLC
 *
 * IntegerUserMap
 * 
 * Created: 12.10.2009
 * History: 
 *    
 *
 * $Id$
 * 
 */
package com.eldest.old.webservice.cxf;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author EremenkoAA
 * 
 */
@XmlType(name = "IntegerUserMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegerUserMap {
	@XmlElement(nillable = false, name = "entry")
	List<IntegerUserEntry> entries = new ArrayList<IntegerUserEntry>();

	public List<IntegerUserEntry> getEntries() {
		return entries;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "IdentifiedUser")
	static class IntegerUserEntry {
		// Map keys cannot be null
		@XmlElement(required = true, nillable = false)
		Integer id;

		User user;

		public void setId(Integer k) {
			id = k;
		}

		public Integer getId() {
			return id;
		}

		public void setUser(User u) {
			user = u;
		}

		public User getUser() {
			return user;
		}
	}
}