import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBConnector dbConnector = new DBConnector();
		//dbConnector.printTable("tag");
		//dbConnector.printTable("recipe");
		//dbConnector.printTable("ingredient");
		//dbConnector.printTable("preparation_step");
		
		//dbConnector.deleteIngredient("garlic");

		dbConnector.insertIntoTag(2, "sad");
	}

}