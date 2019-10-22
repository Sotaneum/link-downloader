Public Class Copy

    Private Sub LinkLabel1_LinkClicked(sender As System.Object, e As System.Windows.Forms.LinkLabelLinkClickedEventArgs) Handles Make.LinkClicked
        Shell("explorer.exe http://duration.digimoon.net")

    End Sub

    Private Sub LinkLabel2_LinkClicked(sender As System.Object, e As System.Windows.Forms.LinkLabelLinkClickedEventArgs) Handles Make2.LinkClicked
        Shell("explorer.exe http://blog.naver.com/cyydo96")
    End Sub

    Private Sub Label3_Click(sender As System.Object, e As System.EventArgs) Handles Downloader.Click
        If URL_1.Text = "" Then
            MsgBox("Error")
        Else
            If COPY_1.Text = "" Then
                MsgBox("Error")
            Else
                My.Computer.Network.DownloadFile(URL_1.Text, COPY_1.Text)
                MsgBox("OK")

            End If
        End If
    End Sub
End Class
