class Profile implements IDisplay {
	private User user;
	private Friend friends;
	private Post posts;
	private boolean isProfileVisible;
	
	public Profile(String name, String last, int age) {
		user = new User(name, last, age);
		friends = new Friend();
		posts = new Post();
		isProfileVisible = true;
	}
	public void display() {
		if(isProfileVisible) {
			user.display();
			friends.display();
			posts.display();
		}
	}
	public void addFriend(String name) {
	    friends.addFriend(name);
	}
	public void removeLastFriend() {
		friends.removeFriend();
	}
	public void removeAllFriends() {
		friends.removeAllFriends();
	}
	public void addPost(String post) {
	    posts.addPost(post);
	}
	public void removeLastPost() {
		posts.removePost();
	}
	public void removeAllPosts() {
		posts.removeAllPosts();
	}
	public void setStatus(String status) {
		user.setStatus(status);
	}
	public void toggleAgeVisibility() {
	    user.toggleVisibility();
	}
	public void toggleFriendVisibility() {
		friends.toggleVisibility();
	}
	public void togglePostVisibility() {
		posts.toggleVisibility();
	}
	public void toggleVisibility() {
		isProfileVisible = !isProfileVisible;
	}
	public User getUser() {
		return user;
	}
	public Friend getFriend() {
		return friends;
	}
	public Post getPost() {
		return posts;
	}
}