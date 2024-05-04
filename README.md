# Obfuscate-Proguard-Exploration

So sánh AfterObfuscate.java và SimpleGUI.java(file gốc) để thấy sự khác biệt nha anh.

Sau khi build .jar và obfuscate thông qua file config và 2 file batch thì sinh ra -> SimpleGUI_proguard.jar
=> vẫn chạy như bình thường, nhưng trong code trở nên cực hình và khó hiểu hơn. 

Tên biến: Các tên biến đã được thay đổi thành các chữ cái đơn hoặc tên đơn giản (a, b, c, v.v.), trong khi phiên bản gốc có các tên mô tả chi tiết hơn (applicationTitleLabel, logTextArea, inputTextField, v.v.).
Khởi tạo các GUI: Cách khởi tạo và thêm các thành phần GUI vào khung khác nhau giữa hai phiên bản. Trong phiên bản được obfuscate, một số thành phần được khởi tạo như (JButton)new JTextArea() hoặc (JButton)new JScrollPane(this.a), điều này không có ý nghĩa và có khả năng chỉ là công đoạn làm mờ.
Nghe event: Cách thêm trình nghe sự kiện vào các nút khác nhau. Trong phiên bản gốc, các biểu thức lambda được sử dụng (event -> addToLog(), event -> resetLog(), v.v.), trong khi phiên bản được obfuscate sử dụng các lớp nội danh không tên (paramActionEvent - { ... }).
