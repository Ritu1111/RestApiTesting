package utility;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {

	public void readWriteJSON() throws InterruptedException, IOException, org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader("PostData.json");
		//Read JSON file
		            Object obj = jsonParser.parse(reader);
		            JSONArray TestList = (JSONArray) obj;
		            System.out.println(TestList); //This prints the entire json file
		            for(int i=0;i<TestList.size();i++) {
		            JSONObject lists = (JSONObject) TestList.get(i);
		            System.out.println(lists);//This prints every block - one json object
		            JSONObject user = (JSONObject) lists.get("lists");
		            System.out.println(user); //This prints each data in the block
		            String title = (String) user.get("title");
		            
		            
		            }
	}
}
