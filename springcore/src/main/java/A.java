import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A {
	
	@Autowired
	B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
}
