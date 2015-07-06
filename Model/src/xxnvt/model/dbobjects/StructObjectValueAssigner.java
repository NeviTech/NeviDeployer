package xxnvt.model.dbobjects;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import java.beans.SimpleBeanInfo;

import java.lang.reflect.Constructor;

import oracle.sql.STRUCT;
import java.lang.reflect.Field;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class StructObjectValueAssigner 
{
    public StructObjectValueAssigner() {
        super();
    }
    
    /*public static Object assignObjectValues(String   pObjectName,
                                            Object[] pObjectValues) throws Exception
    {
        Object instance = new Object();
        try
        {
            Class<?> cls    = Class.forName(pObjectName);
        
            instance = cls.newInstance();
            
            BeanInfo info = Introspector.getBeanInfo(cls);
            int i = 0;
            
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) 
            {
            
                if (pd.getWriteMethod() == null) continue;
                String readMethod = pd.getReadMethod().getName();
                Class<?> columnClass  = pd.getPropertyType();
                Constructor<?>[] constructors = columnClass.getConstructors();
                int constlength = constructors.length;
                String constructorName = constructors[0].getName();
                Class<?>[] paramClasses = constructors[0].getParameterTypes();
                
                String ParameterTypeName = paramClasses[0].getName();
                
                Object columnValue    = columnClass.newInstance();
                String columnDataType = columnClass.getName();
                BeanInfo info2 = Introspector.getBeanInfo(columnClass);
                for(PropertyDescriptor pd2 : info2.getPropertyDescriptors())
                {
                    if (pd2.getWriteMethod() == null) continue;
                    pd.getWriteMethod().invoke(columnValue, 432);
                }
                
                System.out.println("\tSetting " + pd.getName());
                pd.getWriteMethod().invoke(instance, columnValue);
                
            }
        }
        catch(Exception e)
        {
            StackTraceElement[] stackTrace = e.getStackTrace();
            String errorMessage = e.getMessage();
            for(int k=0;
                k < stackTrace.length;
                k++)
            {
                errorMessage = errorMessage + " " + stackTrace[k].toString();
            }
            
            String y = new String();
        }
        
        return instance;
    }*/
    
    public static Object assignObjectValues(String   pObjectName,
                                            Object   pObjectValues)
    {
        Object instance         = new Object();
        String[] primitiveTypes = {"byte","short","int","long","float","double","char","boolean","java.lang.String"};
        try
        {
            Class<?>         cls               = Class.forName(pObjectName);
            Constructor<?>[] constructors      = cls.getConstructors();
            Object[]         paramList;
            
            try
            {
                paramList         = (Object[]) pObjectValues;
            }
            catch(Exception e)
            {
                paramList         = new Object[1];
                paramList[0]      = pObjectValues;
            }
            
            int constructorIdx = 0;
            for(int i = 0;
                i < constructors.length;
                i++)
            {
                if(constructors[i].getParameterTypes().length == paramList.length)
                {
                    if(constructors[i].getParameterTypes()[0].getClass().getName().equals
                       (
                            pObjectName
                       )
                      )
                    {
                        constructorIdx = i;
                        break;
                    }
                }
            }
            
            Class<?>[]       paramClasses      = constructors[constructorIdx].getParameterTypes();
            Object[]         constructorParams = new Object[paramClasses.length];
            
            for(int i = 0;
                i < paramClasses.length;
                i++)
            {
                
                if(paramList[i] == null)
                {
                    continue;
                }
                
                Class<?> fd = paramList[i].getClass();
                String valueClassName = fd.getName();
                String abc = paramList[i].toString();
                
                String ParamClassName = paramClasses[i].getName();
                Object currentParam   = paramList[i];
                
                if(!Arrays.asList(primitiveTypes).contains(paramClasses[i].getName()))
                {
                    constructorParams[i] = assignObjectValues(paramClasses[i].getName(),
                                                              currentParam);
                }
                else
                {
                    constructorParams[i] = currentParam; 
                }
            }
            
            instance = constructors[0].newInstance(constructorParams);
        }
        catch(Exception e)
        {
            StackTraceElement[] stackTrace   = e.getStackTrace();
            String              errorMessage = e.getMessage();
            
            for(int k=0;
                k < stackTrace.length;
                k++)
            {
                errorMessage = errorMessage + " " + stackTrace[k].toString();
            }
            
            return instance;
        }
        
        return instance;
    }
    
}