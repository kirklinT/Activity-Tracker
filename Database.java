import java.util.ArrayList;

public class Database {

	Manager manager;
	public ArrayList<User> users=new ArrayList<User>();
	
	//Adding the user in the users array list
	void addUser(User newUser)
	{
		users.add(newUser);
	}
	
	//Removing the user from the users array list
	void removeUser(User user)
	{
		for( int i =0; i< users.size() ; i++)
		   {
			   if(users.get(i)== user)
			   {
				   users.remove(i);
			   }
				   
		   }
	}
	
	//Searching for the user in the database
	User search(String user)
	{
		User found = null;
		int k=0;
	   for( int i =0; i< users.size() ; i++)
	   {
		   if(users.get(i).equals(user))
			   found = users.get(i);
	   }
	   return found;
	   
	}
}