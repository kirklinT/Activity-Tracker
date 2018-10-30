import java.util.ArrayList;

public class Manager {

	User current;
	Database database;
	
	//Creating the user
	void createUser()
	{
		database.addUser(new User());
	}
	
	//Removing the user
	void removeUser()
	{
		database.removeUser(current);
		current = null;
	}
	
	//Accessing the user
	void accessUser(User x)
	{
		if (x!= null) {
			current = x;
		}	
	}
	
	//Adding Friend
	void addFriend(User friend)
	{
		friend.addRequest(current);
	}
	
	//Searching a user
	User search(String user)
	{
		return database.search(user);
	}
	
	//Removing the friend
	User removeFriend(User friend)
	{
		current.removeFriend(friend);
		friend.removeFriend(current);
	}
	
	/*
	 * This funtion cannot be implemented now due to lack of data
	void compare(User, User)
	{
		
	}
	*/
	
	//Validating if the user is in the database
	User validate(String username, String password)
	{
		User toReturn;
		for( int i =0; i< database.users.size() ; i++)
		   {
			   if(database.users.get(i).getUsername.equals(username))
				   if (database.users.get(i).getPassword.equals(password))
					    toReturn = database.users.get(i);
				   else
					    toReturn = null;
		   }
		return toReturn;
	}
}
