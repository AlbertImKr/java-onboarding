package onboarding.problem7;

import java.util.List;

public class SNSSystem {
	private final UsersList users;

	public SNSSystem() {
		this.users = new UsersList();
	}

	public void add(List<String> friendsList) {
		users.add(friendsList);
	}

	public List<String> getSecondFriends(String name) {
		return users.getSecondFriends(name);
	}

	public boolean isFriends(String user, String visitor) {
		return users.isFriends(user, visitor);
	}
}
