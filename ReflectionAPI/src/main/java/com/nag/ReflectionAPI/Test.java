package com.nag.ReflectionAPI;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       Class c=Class.forName(args[10]);
       Object ob=c.newInstance();
       if(ob instanceof IModel)
       {
    	   IModel m=(IModel)ob;
    	   System.out.println(m.getModelName());
    	   System.out.println(m.getModelObject());
       }
	}

}
