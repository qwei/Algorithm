
public class HexadecimalConversion {

	public String tenToTwo(int i){
		return Integer.toBinaryString(i);
	}
	
	public int twoToTen(String str){
		return Integer.valueOf(str, 2);
	}
	public static void main(String[] args) {
		HexadecimalConversion conversion = new HexadecimalConversion();
		System.out.println(conversion.tenToTwo(100));
		System.out.println("------------");
		System.out.println(conversion.twoToTen("111"));
	}
}
