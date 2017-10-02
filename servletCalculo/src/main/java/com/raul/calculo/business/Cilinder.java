package com.raul.calculo.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Cilinder implements IntGeometry {

	private static final float PI = 3.1416f;
	private float r;
	private float h;
	private String desc = "En geometría, un cilindro es una superficie de las denominadas "
			+ "cuádricas formada por el desplazamiento paralelo de una recta llamada "
			+ "generatriz a lo largo de una curva plana, denominada directriz "
			+ "del cilindro. Si la directriz es un círculo y la generatriz es "
			+ "perpendicular a él, entonces la superficie obtenida, llamada cilindro "
			+ "circular recto, será de revolución y tendrá por lo tanto todos "
			+ "sus puntos situados a una distancia fija de una línea recta, el eje "
			+ "del cilindro. El sólido encerrado por esta superficie y por dos planos "
			+ "perpendiculares al eje también es llamado cilindro. Este sólido es "
			+ "utilizado como una superficie Gausiana.";
	
	public Cilinder()
	{
		
	}
	public Cilinder(float r, float h)
	{
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
	
	public float computeArea()
	{
		return 2*PI*r*(h+r);
	}

	public float computeVolume() {
		return PI*r*r*h;
	}

	public String description() {
		// TODO Auto-generated method stub
		return desc;
	}
	
}
