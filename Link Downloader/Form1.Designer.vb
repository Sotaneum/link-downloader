<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Copy
    Inherits System.Windows.Forms.Form

    'Form은 Dispose를 재정의하여 구성 요소 목록을 정리합니다.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Windows Form 디자이너에 필요합니다.
    Private components As System.ComponentModel.IContainer

    '참고: 다음 프로시저는 Windows Form 디자이너에 필요합니다.
    '수정하려면 Windows Form 디자이너를 사용하십시오.  
    '코드 편집기를 사용하여 수정하지 마십시오.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Copy))
        Me.URL_1 = New System.Windows.Forms.TextBox()
        Me.URL_0 = New System.Windows.Forms.Label()
        Me.COPY_0 = New System.Windows.Forms.Label()
        Me.COPY_1 = New System.Windows.Forms.TextBox()
        Me.Make = New System.Windows.Forms.LinkLabel()
        Me.Make2 = New System.Windows.Forms.LinkLabel()
        Me.Downloader = New System.Windows.Forms.Label()
        Me.NME22 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'URL_1
        '
        Me.URL_1.Location = New System.Drawing.Point(46, 47)
        Me.URL_1.Name = "URL_1"
        Me.URL_1.Size = New System.Drawing.Size(340, 21)
        Me.URL_1.TabIndex = 0
        '
        'URL_0
        '
        Me.URL_0.AutoSize = True
        Me.URL_0.Location = New System.Drawing.Point(12, 50)
        Me.URL_0.Name = "URL_0"
        Me.URL_0.Size = New System.Drawing.Size(28, 12)
        Me.URL_0.TabIndex = 1
        Me.URL_0.Text = "URL"
        '
        'COPY_0
        '
        Me.COPY_0.AutoSize = True
        Me.COPY_0.Location = New System.Drawing.Point(12, 77)
        Me.COPY_0.Name = "COPY_0"
        Me.COPY_0.Size = New System.Drawing.Size(35, 12)
        Me.COPY_0.TabIndex = 2
        Me.COPY_0.Text = "Copy"
        '
        'COPY_1
        '
        Me.COPY_1.Location = New System.Drawing.Point(53, 74)
        Me.COPY_1.Name = "COPY_1"
        Me.COPY_1.Size = New System.Drawing.Size(333, 21)
        Me.COPY_1.TabIndex = 3
        '
        'Make
        '
        Me.Make.AutoSize = True
        Me.Make.Location = New System.Drawing.Point(12, 98)
        Me.Make.Name = "Make"
        Me.Make.Size = New System.Drawing.Size(81, 12)
        Me.Make.TabIndex = 4
        Me.Make.TabStop = True
        Me.Make.Text = "제작 홈페이지"
        '
        'Make2
        '
        Me.Make2.AutoSize = True
        Me.Make2.Location = New System.Drawing.Point(99, 98)
        Me.Make2.Name = "Make2"
        Me.Make2.Size = New System.Drawing.Size(69, 12)
        Me.Make2.TabIndex = 5
        Me.Make2.TabStop = True
        Me.Make2.Text = "제작 블로그"
        '
        'Downloader
        '
        Me.Downloader.AutoSize = True
        Me.Downloader.Location = New System.Drawing.Point(333, 98)
        Me.Downloader.Name = "Downloader"
        Me.Downloader.Size = New System.Drawing.Size(53, 12)
        Me.Downloader.TabIndex = 6
        Me.Downloader.Text = "다운로드"
        '
        'NME22
        '
        Me.NME22.AutoSize = True
        Me.NME22.Location = New System.Drawing.Point(84, 15)
        Me.NME22.Name = "NME22"
        Me.NME22.Size = New System.Drawing.Size(237, 12)
        Me.NME22.TabIndex = 7
        Me.NME22.Text = "Copyright 2013 이동건 All rights reserved."
        '
        'Copy
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 12.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(398, 120)
        Me.Controls.Add(Me.NME22)
        Me.Controls.Add(Me.Downloader)
        Me.Controls.Add(Me.Make2)
        Me.Controls.Add(Me.Make)
        Me.Controls.Add(Me.COPY_1)
        Me.Controls.Add(Me.COPY_0)
        Me.Controls.Add(Me.URL_0)
        Me.Controls.Add(Me.URL_1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Copy"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "링크 파일 다운로드"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents URL_1 As System.Windows.Forms.TextBox
    Friend WithEvents URL_0 As System.Windows.Forms.Label
    Friend WithEvents COPY_0 As System.Windows.Forms.Label
    Friend WithEvents COPY_1 As System.Windows.Forms.TextBox
    Friend WithEvents Make As System.Windows.Forms.LinkLabel
    Friend WithEvents Make2 As System.Windows.Forms.LinkLabel
    Friend WithEvents Downloader As System.Windows.Forms.Label
    Friend WithEvents NME22 As System.Windows.Forms.Label

End Class
