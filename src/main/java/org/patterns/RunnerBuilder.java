package org.patterns;

public class RunnerBuilder {

	private Runner runner;
	private Component component;

	public RunnerBuilder(Runner runner) {
		this.runner = runner;
	}

	public static RunnerBuilder forStrategy(Strategy strategy) {
		RunnerBuilder builder = new RunnerBuilder(RunnerFactory.create());
		builder.runner.addTarget(new Adapter(strategy));
		return builder;
	}

	public RunnerBuilder andStrategy(Strategy strategy) {
		runner.addTarget(new Adapter(strategy));
		return this;
	}

	public RunnerBuilder andHelloPatternsCommand(Command command) {
		runner.addHandler(new HelloPatternsHandler(command));
		return this;
	}

	public RunnerBuilder andHandler(Handler handler) {
		runner.addHandler(handler);
		return this;
	}

	public RunnerBuilder andDecorator(Class<? extends Component> decoratorClass) {
		if (component == null) {
			component = runner;
		}
		try {
			component = decoratorClass.getConstructor(Component.class).newInstance(component);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Component create() {
		return component;
	}

}
