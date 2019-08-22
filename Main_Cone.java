package Poo;

public class Main_Cone {

	public static void main(String[] args) {		
		
		Cone b = new Cone();
		
		b.setR(6);
		b.setZ(8);
		b.setTipo(1);
		
		System.out.println(b.getR());
		System.out.println(b.getZ());
		System.out.println(b.calculoG());
		System.out.println(b.areaBase());
		System.out.println(b.areaLateral());
		System.out.println(b.areaTotal());
		System.out.println(b.calculoLitros());
		System.out.println(b.calculoLata());
		System.out.println(b.precoTotal());

	}

}
