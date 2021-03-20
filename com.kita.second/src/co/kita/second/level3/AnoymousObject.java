package co.kita.second.level3;

public class AnoymousObject {
	public static void main(String[] args) {
		ParentAO p = new ChildAO(); //업캐스팅
		ChildAO c = (ChildAO)p; //다운캐스팅
		c.childMethod();
		p.parentMethod();
		
		ParentAO p2 = new ParentAO() {
			int childField;
			
			@Override
			void parentMethod(ParentAO p) {}
			
			void childMethod() {}
		};
	}
}

class ParentAO{
	int parentField;
	void parentMethod() {
		
	}
}

class ChildAO extends ParentAO{
	int childField;
	ParentAO pao = new ParentAO() {
		@Override
		void parentMethod() {}
		
		void childMethod() {}
	}
	
	@Override
	void parentMethod() {}
	
	void childMethod(ParentAO p) {}
}

