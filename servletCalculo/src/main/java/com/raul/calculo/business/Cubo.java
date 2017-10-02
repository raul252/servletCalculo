package com.raul.calculo.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Cubo implements IntGeometry {

	private static final float PI = 3.1416f;
	private float a;
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
	
	public Cubo()
	{
		
	}
	public Cubo ( float a)
	{
		this.a = a;
	}
	
	public void setA(float a){
		this.a =a;
	}
	
	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return 6*a*a;
	}

	@Override
	public float computeVolume() {
		// TODO Auto-generated method stub
		return a*a*a;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return desc;
	}
	
}
