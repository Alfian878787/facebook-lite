class Friend implements IDisplay {
	private Stack friends;
	private boolean isFriendsVisible;

	public Friend() {
		friends = new Stack(5);
		isFriendsVisible = true;
	}
	public void addFriend (String friendName) {
		friends.push(friendName);
	}
	public void removeFriend() {
		friends.pop();
	}
	public void removeAllFriends() {
		friends.reset();
	}
	public void display() {
		if(isFriendsVisible && !friends.isEmpty()) {
			Util.println("-----Friends-----");
			friends.println();
		}
	}
	public void toggleVisibility() {
		isFriendsVisible = !isFriendsVisible;
	}
	public Stack getStack() {
		return friends;
	}
}