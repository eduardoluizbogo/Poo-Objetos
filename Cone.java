package Poo;

public class Cone {
	
	float z;
	float r;
	int tipo;
	
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double calculoG() {
		double g = (Math.pow(z, 2) + Math.pow(r, 2));
		return Math.sqrt(g);
	}
		
	public double areaTotal() {
		double area = (3.14 * r) * (r+calculoG());	
		return area;
	}
	public double areaLateral() {
		double area = (3.14 * r * calculoG());
		return area;
	}
	public double areaBase() {
		double area = (3.14 * (r * r));
		return area;
	}
	public double calculoLitros() {
		double litros = areaTotal() * 3.45;
		return litros;
	}
	public double calculoLata() {
		double latas = calculoLitros() / 18;
		return Math.ceil(latas);

	}
	public double precoTotal() {
		final float T1 = (float) 238.90;
		final float T2 = (float) 467.98;
		final float T3 = (float) 758.34;
		float preco=0;
		
		switch(tipo) {
		case 1:
			preco = T1;
			break;
		case 2: 
			preco = T2;
			break;
		case 3: 
			preco = T3;
			break;
		}
		double precototal = preco * calculoLata();
		return precototal;
	}
}		
		
	
	

