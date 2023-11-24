package Main;

public class HtmlTag implements AutoCloseable{
	String command = "";
	public HtmlTag(String command) {
		this.command = command;
		System.out.println("<" + command + ">");
	}
	
	public void body(Object body) {
		System.out.println(body);
	}

	@Override
	public void close() throws Exception {
		System.out.println("</" + command + ">");
		
	}
	public static void main(String[] args) throws Exception {

		try(
			HtmlTag h1 = new HtmlTag("h1");
			HtmlTag em = new HtmlTag("em")
				
		){
			h1.body("lol");
		}
	}
}
