/**
 * 
 */
package com.aurotech.common.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TRIPATIKUMAR
 *
 */
public  abstract class AbstractDTO {
		
	@Override
	public String toString() {
		Map<String,String> keyValue = new HashMap<String,String>();
		Method[] methods = this.getClass().getMethods();
		if (methods != null && methods.length > 0) {
			for (Method method : methods) {
				if (method.getName().startsWith("get")) {
					try {
						Object obj = method.invoke(this);
						keyValue.put(method.getName(), obj != null? obj.toString() :"NULL");
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return keyValue.toString();
	}

	
}
