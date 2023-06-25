package HomeWork2;


//Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Task3 {

    public static void main(String[] args) throws IOException, ParseException {

        parse();

        }
        static void parse() throws IOException, ParseException {

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("task3.json"));
            JSONArray jsonArray = (JSONArray) obj;
            for(Iterator iterator = jsonArray.iterator(); iterator.hasNext(); ) {
                JSONObject item = (JSONObject) iterator.next();
                System.out.printf("Студент %s получил %s по предмету %s.\n", item.get("фамилия"), item.get("оценка"), item.get("предмет"));
            }
        }
    }

