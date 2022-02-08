package capgemini.day5;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {
		String str = "Java";
		str = str.concat("Programming Language");
		System.out.println(str);
		StringBuffer sbf = new StringBuffer("Java");
		
		sbf.append("Programming Language");
		System.out.println(sbf);
		
		sbf.delete(2, 5);
		System.out.println(sbf);
		
		StringBuilder sb=new StringBuilder("Hello Java");
        System.out.println(sb);
        sb.append(" Programming Language");
        System.out.println(sb);
        
        sb.deleteCharAt(5);
        System.out.println(sb);

	}

}
