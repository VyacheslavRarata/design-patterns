package org.patterns;

public interface Runner extends Component {

	void addTarget(Target target);

	void addHandler(Handler handler);

}