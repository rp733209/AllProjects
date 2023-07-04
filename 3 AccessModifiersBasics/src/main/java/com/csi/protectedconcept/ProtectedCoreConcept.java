package com.csi.protectedconcept;

import com.csi.core.BaseApp;
import com.csi.core.CoreConcept;

public class ProtectedCoreConcept extends BaseApp {
	public static void main(String[] args) {

		ProtectedCoreConcept concept = new ProtectedCoreConcept();

		System.out.println("\n Employee Code: " + concept.empCode);

		CoreConcept concept2 = new CoreConcept();

		System.out.println("\n Employee Contact Number: " + concept2.empContactNumber);
	}
}
