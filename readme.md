### Описание команд

### **add**

Формат команды: add <описание заметки>

Описание заметки может содержать любые символы, кроме перевода строки. Перевод строки (нажатие клавиши Enter) означает завершение ввода описания заметки

### **print**

Формат команды: print [all]

Выводит на печать список заметок. По-умолчанию выводятся только невыполненные заметки, в случае если команда выполняется с аргументом all - печатаются все заметки. Печатаются следующие поля: идентификатор (номер, в данном случае всегда "1"), который используется в команде toggle, статус заметки (x - выполнена, " " - не выполнена), описание заметки.


### **search**

Формат команды: search <substring>

Выводит на печать список заметок, описание которых содержит substring. Вывод на печать в формате аналогичном команде print.

### **toggle**

Формат команды: toggle <идентификатор заметки>

Переключает состояние заметки (с "выполнена" на "не выполнена" и наоборот) по идентификатору.

### **delete**

Формат команды: delete <идентификатор заметки>

Удаляет заметку из списка заметок.


### **edit**

Формат команды: edit <идентификатор заметки> <новое значение>

Меняет описание заметки.

### **quit**

Формат команды: quit

Завершает работу программы

### **Логирование**

Библиотеку логгирования сконфигурирована таким образом, что логи записываются в файл log.txt