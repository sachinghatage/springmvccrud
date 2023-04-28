package com.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


	@Component
	@Scope("prototype")
	public class B {

		@Autowired
		A a;

		
		public A getA() {
			return a;
		}

		public void setA(A a) {
			this.a = a;
		}

		public B(A a) {
			super();
			this.a = a;
		}

		public B() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}


