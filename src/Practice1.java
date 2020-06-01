import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		String tmp, inst;
		FileReader in = null;
		FileWriter out = null;
		int c;
		long start=0,end=0;
		
		Scanner s = new Scanner(System.in);
		tmp = s.nextLine();

		inst = tmp.split(" ")[0].toUpperCase();
		if (inst.equals("COPY")) {
			try {
				in = new FileReader(tmp.split(" ")[1]);
				out = new FileWriter(tmp.split(" ")[2]); 
				
				start = System.currentTimeMillis();
				while ((c = in.read()) != -1) {
					out.write(c);
				}
				end = System.currentTimeMillis();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null)
					in.close(); 

				if (out != null)
					out.close();
			}
		}
		System.out.println("동작 시간: "+(end-start)/1000+"."+(end-start)%1000+"(s)");
	}
}