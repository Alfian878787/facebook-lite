import java.util.Scanner;

class FaceBookLite {
	private static Profile[] profileArray;
	private static boolean isRunning;
	private static int profileArrayTop;
	private static int opt;
	
	public FaceBookLite() {
		this.profileArray = new Profile[5];
		isRunning = true;
		profileArrayTop = -1;
	}
	public void exit() {
		isRunning = false;
	}
	public void createProfile(String name, String last, int age) {
		profileArrayTop++;
		profileArray[profileArrayTop] = new Profile(name, last, age);
	}
	public void deleteLastProfile() {
		profileArray[profileArrayTop] = null;
		profileArrayTop--;
	}
	public void deleteAllProfiles() {
		for (Profile profile : profileArray) {
			profile = null;
			profileArrayTop--;
		}
	}
	public static void displayOptions() {
		Util.println("1-Exit\n2-Create a profile\n3-Delete last profile\n4-Delete all profiles\n5-Switch profile\n6-Add a friend\n7-Remove last friend\n8-Remove all friends\n9-Add a post\n10-Remove last post"+
			"\n11-Toggle age visibility\n12-Toggle friend visibility\n13-Toggle post visibility\n14-Toggle profile visibility\n15-Set status\n16-Display profile");
	}
	public void switchProfile() {}
	public static Profile[] getProfileArray() {
		return profileArray;
	}
	public static void main(String[] args) {
		FaceBookLite faceBookLite = new FaceBookLite();
		IO io = new IO();
		io.read();
		io.apply();
		displayOptions();
		int index = 0;
		Scanner sc = new Scanner(System.in);
		while(isRunning) {
			try {
			    opt = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				Util.println("Please enter a valid number.");
				continue;
			}
			switch(opt) {
			    case 1: //exit
			        io.write();
			        faceBookLite.exit();
			        break;
			    case 2: //createProfile
			        Util.print("Enter first name: ");
			        String first = sc.nextLine();
			        while (first.length() <= 2) {
			        	Util.println("Enter a string with more than 2 characters.");
			        	first = sc.nextLine();
			        }
			        Util.print("Enter last name: ");
			        String last = sc.nextLine();
			        while (last.length() <= 2) {
			        	Util.println("Enter a string with more than 2 characters.");
			        	last = sc.nextLine();
			        }
			        Util.print("Enter age: ");
			        int age = 0;
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        faceBookLite.createProfile(first, last, age);
			        break;
			    case 3: //deleteLastProfile
			        faceBookLite.deleteLastProfile();
			        break;
			    case 4: //deleteAllProfiles
			        faceBookLite.deleteAllProfiles();
			        break;
			    case 5: //switchProfile
			        break;
			    case 6: //addFriend
			        Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            index = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        Util.print("Enter friend name: ");
			        String friend = sc.nextLine();
			        while (friend.length() <= 2) {
			        	Util.println("Enter a string with more than 2 characters.");
			        	friend = sc.nextLine();
			        }
			        profileArray[index].addFriend(friend);
			        break;
			    case 7: //removeLastFriend
			        Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        profileArray[index].removeLastFriend();
			        break;
			    case 8: //removeAllFriends
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        profileArray[index].removeAllFriends();
			        break;
			    case 9: //addPost
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        Util.print("Enter post: ");
			        String post = sc.nextLine();
			        while (post.length() <= 2) {
			        	Util.println("Enter a string with more than 2 characters.");
			        	post = sc.nextLine();
			        }
			        profileArray[index].addPost(post);
			        break;
			    case 10: //removeLastPost
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			        profileArray[index].removeLastPost();
			        break;
			    case 11: //toggleAgeVisibility
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			    	profileArray[index].toggleAgeVisibility();
			    	break;
			    case 12: //toggleFriendVisibility
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			    	profileArray[index].toggleFriendVisibility();
			    	break;
			    case 13: //togglePostVisibility
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			    	profileArray[index].togglePostVisibility();
			    	break;
			    case 14: //toggleProfileVisibility
			    	Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			    	profileArray[index].toggleVisibility();
			    	break;
			    case 15: //setStatus
			        Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
			    	Util.print("Enter status: ");
			    	String status = sc.nextLine();
			        while (status.length() <= 2) {
			        	Util.println("Enter a string with more than 2 characters.");
			        	status = sc.nextLine();
			        }
			    	profileArray[index].setStatus(status);
			    	break;
			    case 16: //Display Profile
			        Util.print("Enter profile index: ");
			        for (int i = 0; i == 0;) {
				        try {
				            age = Integer.parseInt(sc.nextLine());
				            i = 1;
				        } catch (Exception e) {
					        Util.println("Please enter a valid number.");
					    }
					}
					try {
			    	    profileArray[index].display();
					} catch (Exception e) {
						Util.println("Profile doesn't exist!");
					}
			    default:
			}
		}
	}
}