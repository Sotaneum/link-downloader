package SystemOutPut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class CopysFile {
	
	public static String GetFileName(String Url)
	{
		String temp=null;
		
		 StringTokenizer tokens = new StringTokenizer( Url, "\\" );
         
         for(; tokens.hasMoreElements();)
         {
        	 temp=tokens.nextToken();
         }
		return temp;
	}
	
	public static void Set(String pathS, String pathD)
    {
		try {
			Path source = Paths.get(pathS);
			Path destination = Paths.get(pathD + "/" + GetFileName(pathS));
			Files.copy(source, destination);
			MsgBox.infoBox("정상적으로 복사가 되었습니다.", "처리를 완료 했습니다.");
		} catch (IOException e) {
			MsgBox.infoBox("(" + e.getMessage() + ")가 이미 존재 하는 듯 합니다.", "오마이 갓");
		} catch (InvalidPathException e){
			MsgBox.infoBox("알수 없는 경로("+e.getMessage()+")입니다.", "뭐지?");
		}
		
    }
}
