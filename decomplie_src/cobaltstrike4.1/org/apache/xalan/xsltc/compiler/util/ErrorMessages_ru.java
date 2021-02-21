package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;

public class ErrorMessages_ru extends ListResourceBundle {
   public Object[][] getContents() {
      return new Object[][]{{"MULTIPLE_STYLESHEET_ERR", "В файле определено несколько таблиц стилей. "}, {"TEMPLATE_REDEF_ERR", "Шаблон ''{0}'' уже определен в этой таблице стилей. "}, {"TEMPLATE_UNDEF_ERR", "Шаблон ''{0}'' не определен в этой таблице стилей. "}, {"VARIABLE_REDEF_ERR", "Переменная ''{0}'' определена в одной области действия несколько раз. "}, {"VARIABLE_UNDEF_ERR", "Переменная или параметр ''{0}'' не определены. "}, {"CLASS_NOT_FOUND_ERR", "Не найден класс ''{0}''."}, {"METHOD_NOT_FOUND_ERR", "Не найден внешний метод ''{0}'' (должен быть public)."}, {"ARGUMENT_CONVERSION_ERR", "Невозможно преобразовать тип аргумента/возврата в вызове метода ''{0}''"}, {"FILE_NOT_FOUND_ERR", "Не найден файл или URI ''{0}''."}, {"INVALID_URI_ERR", "Недопустимый URI ''{0}''."}, {"FILE_ACCESS_ERR", "Невозможно открыть файл или URI ''{0}''."}, {"MISSING_ROOT_ERR", "Ожидался элемент <xsl:stylesheet> или <xsl:transform>."}, {"NAMESPACE_UNDEF_ERR", "Префикс ''{0}'' пространства имен не объявлен."}, {"FUNCTION_RESOLVE_ERR", "Невозможно преобразовать вызов функции ''{0}''."}, {"NEED_LITERAL_ERR", "Аргумент ''{0}'' должен быть литеральной строкой."}, {"XPATH_PARSER_ERR", "Ошибка при анализе выражения XPath ''{0}''."}, {"REQUIRED_ATTR_ERR", "Отсутствует обязательный атрибут ''{0}''."}, {"ILLEGAL_CHAR_ERR", "Недопустимый символ ''{0}'' в выражении XPath."}, {"ILLEGAL_PI_ERR", "Недопустимое имя ''{0}'' для инструкции обработки."}, {"STRAY_ATTRIBUTE_ERR", "Атрибут ''{0}'' вне элемента."}, {"ILLEGAL_ATTRIBUTE_ERR", "Недопустимый атрибут ''{0}''."}, {"CIRCULAR_INCLUDE_ERR", "Циклический импорт/включение. Таблица стилей ''{0}'' уже загружена."}, {"RESULT_TREE_SORT_ERR", "Невозможно отсортировать фрагменты дерева результатов (элементы <xsl:sort> игнорируются). При создании дерева результатов необходимо отсортировать узлы. "}, {"SYMBOLS_REDEF_ERR", "Десятичное форматирование ''{0}'' уже определено."}, {"XSL_VERSION_ERR", "Версия XSL ''{0}'' не поддерживается XSLTC."}, {"CIRCULAR_VARIABLE_ERR", "Циклическая ссылка на параметр/переменную в ''{0}''."}, {"ILLEGAL_BINARY_OP_ERR", "Неизвестный оператор в двоичном выражении."}, {"ILLEGAL_ARG_ERR", "Недопустимые аргументы в вызове функции."}, {"DOCUMENT_ARG_ERR", "Второй аргумент в функции document() должен быть набором узлов."}, {"MISSING_WHEN_ERR", "В <xsl:choose> необходим по крайней мере один элемент <xsl:when>."}, {"MULTIPLE_OTHERWISE_ERR", "<xsl:choose> разрешен только один элемент <xsl:otherwise>."}, {"STRAY_OTHERWISE_ERR", "<xsl:otherwise> может применяться только в <xsl:choose>."}, {"STRAY_WHEN_ERR", "<xsl:when> может применяться только в <xsl:choose>."}, {"WHEN_ELEMENT_ERR", "В <xsl:choose> разрешены только элементы <xsl:when> и <xsl:otherwise>."}, {"UNNAMED_ATTRIBSET_ERR", "В <xsl:attribute-set> отсутствует атрибут 'name'."}, {"ILLEGAL_CHILD_ERR", "Недопустимый дочерний элемент."}, {"ILLEGAL_ELEM_NAME_ERR", "Нельзя вызывать элемент ''{0}''"}, {"ILLEGAL_ATTR_NAME_ERR", "Нельзя вызывать атрибут ''{0}''"}, {"ILLEGAL_TEXT_NODE_ERR", "Текстовые данные вне элемента верхнего уровня <xsl:stylesheet>. "}, {"SAX_PARSER_CONFIG_ERR", "Неправильно настроен анализатор JAXP"}, {"INTERNAL_ERR", "Неустранимая внутренняя ошибка XSLTC: ''{0}''"}, {"UNSUPPORTED_XSL_ERR", "Неподдерживаемый элемент XSL ''{0}''."}, {"UNSUPPORTED_EXT_ERR", "Нераспознанное расширение XSLTC ''{0}''."}, {"MISSING_XSLT_URI_ERR", "Исходный документ не является таблицей стилей (пространство имен XSL не объявлено в корневом элементе)."}, {"MISSING_XSLT_TARGET_ERR", "Не найден целевой документ таблицы стилей ''{0}''."}, {"NOT_IMPLEMENTED_ERR", "Не реализовано: ''{0}''."}, {"NOT_STYLESHEET_ERR", "Исходный документ не содержит таблицу стилей XSL."}, {"ELEMENT_PARSE_ERR", "Невозможно проанализировать элемент ''{0}''"}, {"KEY_USE_ATTR_ERR", "Атрибут use <key> должен быть node, node-set, string или number."}, {"OUTPUT_VERSION_ERR", "Документ XML должен использовать версию 1.0"}, {"ILLEGAL_RELAT_OP_ERR", "Неизвестный оператор в выражении сравнения."}, {"ATTRIBSET_UNDEF_ERR", "Попытка воспользоваться несуществующим набором атрибутов ''{0}''."}, {"ATTR_VAL_TEMPLATE_ERR", "Невозможно проанализировать шаблон значения атрибута ''{0}''."}, {"UNKNOWN_SIG_TYPE_ERR", "Неизвестный тип данных в сигнатуре класса ''{0}''."}, {"DATA_CONVERSION_ERR", "Невозможно преобразовать тип данных ''{0}'' в ''{1}''."}, {"NO_TRANSLET_CLASS_ERR", "В классе Templates нет допустимого определения класса процедур преобразования."}, {"NO_MAIN_TRANSLET_ERR", "В классе Templates нет класса с именем ''{0}''."}, {"TRANSLET_CLASS_ERR", "Невозможно загрузить класс процедур преобразования ''{0}''."}, {"TRANSLET_OBJECT_ERR", "Класс процедур преобразования загружен, однако создать экземпляр процедуры невозможно."}, {"ERROR_LISTENER_NULL_ERR", "Попытка присвоить значение null интерфейсу ErrorListener для ''{0}''"}, {"JAXP_UNKNOWN_SOURCE_ERR", "XSLTC поддерживает только StreamSource, SAXSource и DOMSource"}, {"JAXP_NO_SOURCE_ERR", "Исходный объект, переданный ''{0}'', пуст."}, {"JAXP_COMPILE_ERR", "Невозможно откомпилировать таблицу стилей"}, {"JAXP_INVALID_ATTR_ERR", "TransformerFactory не распознает атрибут ''{0}''."}, {"JAXP_SET_RESULT_ERR", "Перед startDocument() необходимо вызвать setResult()."}, {"JAXP_NO_TRANSLET_ERR", "В интерфейсе Transformer нет инкапсулированного объекта процедуры преобразования."}, {"JAXP_NO_HANDLER_ERR", "Для результатов преобразования не определен обработчик вывода."}, {"JAXP_NO_RESULT_ERR", "Объект Result, переданный ''{0}'', недопустим."}, {"JAXP_UNKNOWN_PROP_ERR", "Попытка обратиться к недопустимому свойству Transformer ''{0}''."}, {"SAX2DOM_ADAPTER_ERR", "Невозможно создать адаптер SAX2DOM: ''{0}''."}, {"XSLTC_SOURCE_ERR", "XSLTCSource.build() вызван без предварительной установки systemId. "}, {"COMPILE_STDIN_ERR", "Опция -i должна применяться вместе с опцией -o."}, {"COMPILE_USAGE_STR", "Формат\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <вывод>]\n [-d <каталог>] [-j <файл-jar>] [-p <пакет>]\n      [-n] [-x] [-s] [-u] [-v] [-h] { <таблица-стилей> | -i }\n\nOPTIONS\n   -o <вывод> присваивает созданной процедуре преобразования имя <вывод>\n  По умолчанию имя процедуры преобразования\n берется из имени <таблицы-стилей>. При компиляции нескольких таблиц стилей\n                  эта опция игнорируется.\n-d <каталог> задает целевой каталог для процедуры преобразования\n   -j <файл-jar> упаковывает классы процедуры преобразования \n                  в <файл-jar> с указанным именем\n   -p <пакет>   задает префикс имени пакета для всех созданных\n                  классов процедуры преобразования\n -n             разрешает копирование строк шаблона (обычно способ, применяемый по умолчанию,\n работает лучше).\n   -x             включает вывод отладочных сообщений\n   -s  выключает вызов System.exit\n   -u             интерпретирует аргументы <таблицы-стилей>  как URL\n   -i             указывает, что компилятор должен считывать таблицу стилей из стандартного ввода\n   -v             выводит информацию о версии компилятора\n   -h выводит данное сообщение\n"}, {"TRANSFORM_USAGE_STR", "Формат\n   java org.apache.xalan.xsltc.cmdline.Transform [-j <файл-jar>]\n      [-x] [-s] [-n <счетчик>]  {-u <url-документа> | <документ>}\n  <класс> [<параметр1>=<значение1> ...]\n\n применяет <класс> процедуры преобразования для преобразования \n <документа> XML с указанным именем. <Класс> процедуры преобразования должен быть доступен либо \n   с помощью CLASSPATH пользователя, либо с помощью указанного <файла-jar>.\nОпции\n   -j <файл-jar>    задает файл jar, из которого загружается процедура преобразования\n  -x              включает отладочные сообщения\n   -s  выключает вызов System.exit\n   -n <итерации> выполняет преобразование <счетчик> раз и\n                   показывает информацию профилирования\n  -u <url-документа> задает исходный документ XML в виде URL\n"}, {"STRAY_SORT_ERR", "<xsl:sort> может применяться только в <xsl:for-each> или <xsl:apply-templates>."}, {"UNSUPPORTED_ENCODING", "Целевая кодировка ''{0}'' не поддерживается этой JVM."}, {"SYNTAX_ERR", "Синтаксическая ошибка в ''{0}''."}, {"CONSTRUCTOR_NOT_FOUND", "Не найден внешний конструктор ''{0}''."}, {"NO_JAVA_FUNCT_THIS_REF", "Первый аргумент в не статической функции Java ''{0}'' не является допустимой ссылкой на объект."}, {"TYPE_CHECK_ERR", "Ошибка при проверке типа выражения ''{0}''."}, {"TYPE_CHECK_UNK_LOC_ERR", "Ошибка при проверке типа выражения в неизвестном расположении."}, {"ILLEGAL_CMDLINE_OPTION_ERR", "Недопустимая опция командной строки ''{0}''."}, {"CMDLINE_OPT_MISSING_ARG_ERR", "Не указан обязательный аргумент опции командной строки ''{0}''. "}, {"WARNING_PLUS_WRAPPED_MSG", "Предупреждение:  ''{0}''\n       :{1}"}, {"WARNING_MSG", "Предупреждение:  ''{0}''"}, {"FATAL_ERR_PLUS_WRAPPED_MSG", "Критическая ошибка:  ''{0}''\n           :{1}"}, {"FATAL_ERR_MSG", "Критическая ошибка:  ''{0}''"}, {"ERROR_PLUS_WRAPPED_MSG", "Ошибка:  ''{0}''\n     :{1}"}, {"ERROR_MSG", "Ошибка:  ''{0}''"}, {"TRANSFORM_WITH_TRANSLET_STR", "Преобразование с помощью процедуры ''{0}'' "}, {"TRANSFORM_WITH_JAR_STR", "Преобразование с помощью процедуры ''{0}'' из файла jar ''{1}''"}, {"COULD_NOT_CREATE_TRANS_FACT", "Невозможно создать экземпляр класса TransformerFactory ''{0}''."}, {"COMPILER_ERROR_KEY", "Ошибки компилятора:"}, {"COMPILER_WARNING_KEY", "Предупреждения компилятора:"}, {"RUNTIME_ERROR_KEY", "Ошибки процедуры преобразования:"}};
   }
}