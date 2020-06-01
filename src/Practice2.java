import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice2{

	public static void main(String args[]) throws IOException {

		String tmp, inst;
		FileInputStream in = null;
		FileOutputStream out = null;
		int c;
		long start=0,end=0;

		Scanner s = new Scanner(System.in);
		tmp = s.nextLine();
		inst = tmp.split(" ")[0].toUpperCase();

		if (inst.equals("COPY")) {

			try {
				in = new FileInputStream(tmp.split(" ")[1]);
				out = new FileOutputStream(tmp.split(" ")[2]);
				start = System.currentTimeMillis();
				
				while ((c = in.read()) != -1) {
					out.write(c);
					}
				
				end = System.currentTimeMillis();
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			} 
			finally {
				
				if (in != null)
					in.close();
				
				if (out != null)
					out.close();
				}
		}
		System.out.println("동작 시간: "+(end-start)/1000+"."+(end-start)%1000+"(s)");
	}
}
