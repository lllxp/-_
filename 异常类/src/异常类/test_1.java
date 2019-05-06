package “Ï≥£¿‡;
class MyTool{
	public static int parseInt(String str){
		int result=0;
		int i;
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				result=result*10+ch-'0';
		}
		return result;
		
	}
}

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyTool.parseInt("\"111a\""));
	}

}

