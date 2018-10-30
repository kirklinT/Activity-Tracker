import java.util.ArrayList;

public class Manager {

	User current;
	Database database;
	
	void createUser()
	{
		database.addUser(new User());
	}
	
	void removeUser()
	{
		database.removeUser(current);
		current = null;
	}
	
	
	void accessUser(User x)
	{
		if (x!= null) {
			current = x;
		}	
	}
	
	void addFriend(User friend)
	{
		friend.addRequest(current);
	}
	
	User search(String user)
	{
		return database.search(user);
	}
	
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
