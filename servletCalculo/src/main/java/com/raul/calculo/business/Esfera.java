package com.raul.calculo.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Esfera implements IntGeometry {

	private static final float PI = 3.1416f;
	private float r;
	private String desc = "En geometría, una superficie esférica es una superficie "
			+ "de revolución formada por el conjunto de los puntos del espacio "
			+ "que equidistan de un punto llamado centro.Los puntos cuya distancia "
			+ "es menor que la longitud del radio forman el interior de la superficie "
			+ "esférica. La unión del interior y la superficie esférica se llama bola "
			+ "cerrada en topología, o esfera, como en geometría elemental del espacio."
			+ "​Obviamente, la esfera es un sólido geométrico.La esfera, "
			+ "como sólido de revolución, se genera haciendo girar una superficie "
			+ "semicircular alrededor de su diámetro (Euclides, L. XI, def. 14)."
			+ "Esfera proviene del término griego σφαῖρα, sphaîra, que significa "
			+ "pelota (para jugar). Coloquialmente hablando, se emplea la palabra "
			+ "bola, para describir al cuerpo delimitado por una esfera.";
	
	public Esfera() {
		
	}
	public Esfera(float r)
	{
		this.r =r;
	}
	
	public void setRadio(float r)
	{
		this.r = r;
	}
	
	public float computeArea() {

		return 4*PI*r*r;
	}

	public float computeVolume() {

		return ((float)4/3)*PI*r*r*r;
	}

	public String description() {

		return desc;
	}

}
