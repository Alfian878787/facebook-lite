class Post implements IDisplay {
	private Stack posts;
	private boolean isPostsVisible;

	public Post() {
		posts = new Stack(5);
		isPostsVisible = true;
	}
	public void addPost (String postName) {
		posts.push(postName);
	}
	public void removePost () {
		posts.pop();
	}
	public void removeAllPosts() {
		posts.reset();
	}
	public void display() {
		if(isPostsVisible && !posts.isEmpty()) {
			Util.println("-----Posts-----");
			posts.println();
		}
	}
	public void toggleVisibility() {
		isPostsVisible = !isPostsVisible;
	}
	public Stack getStack() {
		return posts;
	}
}