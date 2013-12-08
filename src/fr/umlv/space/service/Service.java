package fr.umlv.space.service;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.World;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Service{
	default public void move(Vec2 x,Vec2 y){
		 throw new NotImplementedException();
	}
	
	default public void getImg(){
		 throw new NotImplementedException();
	}
	
	default public void getType(){
		 throw new NotImplementedException();
	}
	
	public Body createBodyDef(World world);
	public Body getBody();
	
}
