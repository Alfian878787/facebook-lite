import java.io.*;
import java.util.Scanner;

class IO {
	String[] readFile;
	String[] writeFile;
	
	public void read() {
		int lineCount = 0;
        try {   
            Scanner counter = new Scanner( new File("save.txt") );
            while( counter.hasNextLine() ) {    
            	lineCount++;
            	counter.nextLine();
            }
            counter.close();
            readFile = new String[lineCount];
            Scanner s = new Scanner( new File("save.txt") );
            for (int i = 0; i < lineCount; i++) {
            	readFile[i] = s.nextLine();
            }
            s.close();
      	}
        catch(IOException e) {    
            System.out.println(e);
        }
	}
	public void apply() {
        for(int i = 0; i < readFile.length; i++) {
        	if (readFile[i].contains("---Profile")) {
        		String[] profileArr = readFile[i].split(":", 2);
        		int index = Integer.parseInt(profileArr[1]);
        		i++;
        		String[] firstArr = readFile[i].split(":", 2);
        		String first = firstArr[1];
        		i++;
        		String[] lastArr = readFile[i].split(":", 2);
        		String last = lastArr[1];
        		i++;
        		String[] ageArr = readFile[i].split(":", 2);
        		int age = Integer.parseInt(ageArr[1]);
        		i++;
        		Profile[] profileArray = FaceBookLite.getProfileArray();
        		profileArray[index] = new Profile(first, last, age);
        		String[] statusArr = readFile[i].split(":", 2);
        		profileArray[index].setStatus(statusArr[1]);
        		i++;
        		String[] wholeFriendsArr = readFile[i].split(":", 2);
        		if (wholeFriendsArr[0] != "" || wholeFriendsArr[0] != null) {
	        		String[] friendsArr = wholeFriendsArr[1].split(",");
	        		for (String friend : friendsArr) {
	        		    profileArray[index].addFriend(friend);
	        		}
	        	}
        		i++;
        		String[] wholePostsArr = readFile[i].split(":", 2);
        		if (wholePostsArr[0] != "" || wholePostsArr[0] != null) {
	        		String[] postsArr = wholePostsArr[1].split(",");
	        		for (String post : postsArr) {
	        		    profileArray[index].addPost(post);
	        		}
	        	}
        	}
        }
	}
	public void write() {
        Profile[] profileArray = FaceBookLite.getProfileArray();
        try {
	        PrintStream writer = new PrintStream( new File("save.txt"));
	        int index = -1;
	        for (Profile profile : profileArray) {
	        	if (profile != null) {
		        	index++;
		            writer.println("---Profile:" + index);
		            writer.println("First:" + profile.getUser().getName());
		            writer.println("Last:" + profile.getUser().getLast());
		            writer.println("Age:" + profile.getUser().getAge());
		            writer.println("Status:" + profile.getUser().getStatus());
		            writer.print("Friends:");
		            writer.println(profile.getFriend().getStack().list());
		            writer.print("Posts:");
		            writer.println(profile.getPost().getStack().list());
		        }
	        } 
		} catch(Exception e) {}
	}
}