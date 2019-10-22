package Network;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

import SystemOutPut.MsgBox; 

public class HttpDownloader {
	
	public static String GetFileName(String Url)
	{
		String temp=null;
		
		 StringTokenizer tokens = new StringTokenizer( Url, "/" );
         
         for(; tokens.hasMoreElements();)
         {
        	 temp=tokens.nextToken();
         }
         StringTokenizer tokens2 = new StringTokenizer( temp, "?" );
         String temps = new String();
         temps=tokens2.nextToken();
		
		return temps;
	}
	
    public static void download(String sourceUrl, String targetFilename) {
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            URL url = new URL(sourceUrl);
            URLConnection urlConnection = url.openConnection();
            is = urlConnection.getInputStream();
            byte[] buffer = new byte[1024];
            int readBytes;
            
            String FileNames = new String();
            FileNames=url.getFile();
            FileNames=GetFileName(FileNames);
            fos = new FileOutputStream(targetFilename+ "\\"+FileNames);
            while ((readBytes = is.read(buffer)) != -1) {
                fos.write(buffer, 0, readBytes);
            }
            
            MsgBox.infoBox("다운로드를 성공적으로 했습니다.", "완료");
        } catch (FileNotFoundException e) {
        	MsgBox.infoBox("지정된 경로(" + e.getMessage() + ")를 찾을 수 없습니다", "시도는 했지만 실패");
        } catch (MalformedURLException e) {
        	MsgBox.infoBox("Url이 잘못된거 같습니다.", "시도는 했지만 실패");
        } catch (IOException e) {
        	MsgBox.infoBox("작업을 처리할 수 없습니다.", "시도는 했지만 실패");
        } catch (IllegalArgumentException e) {
        	MsgBox.infoBox("잘못된 형태를 입력하셨습니다.", "시도는 했지만 실패");
        } catch (NullPointerException e) {
        	MsgBox.infoBox("잘못된 형태를 입력하셨습니다.", "시도는 했지만 실패");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
            	MsgBox.infoBox("입출력 시스텝에 문제가 생겼습니다.", "시도는 했지만 실패");
                e.printStackTrace();
            }
        }
    }
}
