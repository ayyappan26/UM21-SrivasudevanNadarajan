package com.um21.aircraft.factory;

import com.um21.aircraft.dao.*;
public class FileSystemFactory extends AbstractFactory {

	public IDao getDao() {

		return new FileSystemDao();
	}

}
