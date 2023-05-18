package com.simpli;

public class OuterClass2 {


		private String msg = "Inside OuterClass2. Welcome to Innerclasses!";

		void display() {
			
			class Inner {
				void msg() {
					System.out.println(msg);
				}
			}

			Inner l = new Inner();
			l.msg();
		}

	}
