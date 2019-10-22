Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text = "" Then
            MsgBox("텍스트가 비어있습니다.", MsgBoxStyle.Information, "뭐지?")
        Else
            My.Computer.Network.DownloadFile(TextBox1.Text, TextBox2.Text)
        End If
    End Sub
End Class
