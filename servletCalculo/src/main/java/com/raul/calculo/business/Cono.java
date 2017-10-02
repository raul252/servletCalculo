package com.raul.calculo.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Cono implements IntGeometry {

	private static final float PI = 3.1416f;
	private float r;
	private float h;
	private String desc = "En geometría, un cono recto es un sólido de revolución "
			+ "generado por el giro de un triángulo rectángulo alrededor "
			+ "de uno de sus catetos. Al círculo conformado por el otro cateto se "
			+ "denomina base y al punto donde confluyen las generatrices se llama "
			+ "vértice o cúspide.";
	
	public Cono() {
		
	}
	public Cono(float r, float h) {
		this.r = r;
		this.h = h;
	}
	
	public void setRadio(float r)
	{
		this.r = r;
	}
	
	public void setAltura(float h)
	{
		this.h = h;
	}
	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		float g = (float) Math.sqrt(r*r + h*h);
		return PI*r*r+PI*r*g;
	}

	@Override
	public float computeVolume() {
		// TODO Auto-generated method stub
		return (PI*r*r*h)/3;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return desc;
	}

}
