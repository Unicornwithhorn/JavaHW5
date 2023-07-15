import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    HashMap<String, String> notes = new HashMap<>();
    void addPhoneNote(String note){
        String[] noteArr = note.split(" - ");
        notes.put(noteArr[1], noteArr[0]);
    }
    String findByName(String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        boolean flag = false;
        for (Map.Entry<String, String> entry: notes.entrySet()){
            String currentNumber = entry.getKey();
            String currentName = entry.getValue();
            if (name.equalsIgnoreCase(currentName)){
                stringBuilder.append(" тел.: ");
                stringBuilder.append(currentNumber);
                stringBuilder.append("\n");
                flag = true;
            }
        }
        if (flag == false){
            stringBuilder.append(" - записи в телефонной книге по этому номеру отсутствуют");
        }
        return stringBuilder.toString();
    }
}

