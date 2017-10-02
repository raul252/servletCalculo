

import org.junit.Assert;
import org.junit.Test;

import com.raul.calculo.business.Cilinder;

public class TestCalculo {
	@Test
	public void calCalculo()
	{
		Cilinder c = new Cilinder(2, 1);
		Assert.assertEquals(37.69, c.computeArea(), 0.01);
		Assert.assertEquals(12.56, c.computeVolume(), 0.01);
	}
}
