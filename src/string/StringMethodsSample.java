package string;

public class StringMethodsSample {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());//7
		
		String st="welcome";
		char[] s4=st.toCharArray();
		System.out.println(s4.length);//7
		
		String s5="welcome";
		System.out.println(s5.charAt(1));//e
		
		String s6="welcome";
		System.out.println(s6.indexOf('e'));//1
		
		String s1="hi";
		String s2="hello";
		String s3="welcome";//hihellowelcome
		System.out.println(s1.concat(s2).concat(s3));
		
		String a1="hi";
		String a2="hello";
		String a3="welcome";
		String joined=String.join(" ", a1,a2,a3);
		System.out.println(joined);
		
		String a="welcome";
		System.out.println(a.contains("lc"));
		
		String b="welcome";
		System.out.println(b.startsWith("we"));
		
		String c="welcome";
		System.out.println(s.endsWith("me"));
		
		String b1="welcome";
		String b2="";
		System.out.println(b2.isBlank());//true
		
		String c1="welcome";
		String c2="";
		System.out.println(c2.isEmpty());//false
		
		String d1="  hi hello welcome    ";
		System.out.println(d1.trim());//used to remove space
		
		String e1="welcome";
		System.out.println(e1.substring(0,3));
	
		String f1="hi hello welcome";
		String[] f=f1.split(" ");
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
		
		String g="hi";
		String g1="hi";
		System.out.println(g.equals(g1));
		
		String h="hi hello welcome";
		System.out.println(h.replace(" ",""));
		
		String i="welcome";
		System.out.println(i.toLowerCase());
		
		String j="hi hello welcome";
		System.out.println(j.toUpperCase());
		

	}

}
