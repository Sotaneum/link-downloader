package GraphicUserInterface;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



import javax.swing.*;

import Network.HttpDownloader;
import SystemOutPut.MsgBox;
import SystemOutPut.CopysFile;

@SuppressWarnings("serial")		//해당 에러 무시
public class FrameSet extends JFrame {		//J프레임을 이용한 윈도우즈 형태 구현

	public FrameSet(){		//해당 클래스 선언시 자동 실행

		this.setTitle("Downloader");		//타이틀 이름
		this.setEnabled(true);				//이용가능함
		this.setSize(700, 220);				//크기
		this.setLayout(null);				//레이아웃을 이용하지 않음 ( 이용시 중앙 정렬됨)
		this.setResizable(false);			//최대화 기능 없앰.
		this.setLocationRelativeTo(null);	//가운데 정렬
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));	//종료 기능 ?

		
		
		
		
		JTextField Rurl = new JTextField();		//텍스트 필드
		Rurl.setText("http://");				//값을 입력
		Rurl.setBounds(100, 90, 550, 20);		//위치 및 크기 설정
		Rurl.setVisible(true);					//보이기
		
		JTextField Rurls = new JTextField();	
		Rurls.setText("C:\\");
		Rurls.setBounds(120, 120, 530, 20);
		Rurls.setVisible(true);
		
		
		
		
		
		JLabel Lurl = new JLabel();				//라벨 생성
		Lurl.setText("원본 Url : ");				//라벨 내용 설정
		Lurl.setBounds(30, 90, 60, 20);			//라벨 위치 및 크기 설정
		Lurl.setVisible(true);					//보이기
		
		JLabel Lurls = new JLabel();
		Lurls.setText("저장될 주소 : ");
		Lurls.setBounds(30, 120, 120, 20);
		Lurls.setVisible(true);
		
		JLabel LCopy = new JLabel();
		String Copys = null;
		Copys=("Developer : gnyontu39@gmail.com");
		LCopy.setText(Copys);
		LCopy.setBounds(280,7,260,30);
		
		JLabel LVer = new JLabel();
		String LVers = null;
		LVers=("Ver 0");
		LVer.setText(LVers);
		LVer.setBounds(330,44,260,30);
		
		
		
		JButton Bdown = new JButton();			//버튼 생성
		Bdown.setText("Download");
		Bdown.setBounds(400, 150, 120, 20);
		Bdown.addActionListener(new ActionListener(){		//클릭에 해당하는 기능 구현
			public void actionPerformed(ActionEvent e){
					HttpDownloader.download(Rurl.getText(),Rurls.getText());					
			}
		});
		
		
		JButton Bexit = new JButton();
		Bexit.setText("Exit");
		Bexit.setBounds(530, 150, 120, 20);
		Bexit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					MsgBox.infoBox("이용해 주셔서 감사합니다.", "정상적으로 종료 되었습니다.");
					setVisible(false); //you can't see me!
					dispose(); //Destroy the JFrame object
			}
		});

		JButton Bcopy = new JButton();
		Bcopy.setText("Copy");
		Bcopy.setBounds(270, 150, 120, 20);
		Bcopy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CopysFile.Set(Rurl.getText(),Rurls.getText());
			}
		});
		
		
		
		JButton Jlogo= new JButton();
		ImageIcon imageLOGO=new ImageIcon(getClass().getResource("/GraphicUserInterface/logo.png"));	//그림 설정
		Jlogo.setIcon(imageLOGO);				//그림 설정
		Jlogo.setBounds(10,10,384,64);			//위치
		Jlogo.setBackground(Color.white);		//배경 하얀색
		Jlogo.setOpaque(false);					//배경 지우기
		Jlogo.setBorderPainted(false);				//틀지우기
		Jlogo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Desktop dt = Desktop.getDesktop();
				try {
					dt.browse(new URI("http://blog.naver.com/cyydo96"));		//브라우저 이동
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		
		
		// 프레임 위에 올리기
		this.add(Lurl);
		this.add(Rurl);
		this.add(Lurls);
		this.add(Rurls);
		this.add(Bdown);
		this.add(Jlogo);
		this.add(Bexit);
		this.add(Bcopy);
		this.add(LCopy);
		this.add(LVer);
		this.setVisible(true);
		
		 this.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e) { 
                     System.exit(0);
             }
     });
	}	
}


