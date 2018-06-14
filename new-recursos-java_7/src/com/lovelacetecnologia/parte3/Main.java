package com.lovelacetecnologia.parte3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<String>nomesCliente = new ArrayList<>();
		
		nomesCliente.add("João");
		nomesCliente.add("Normandes");
		
		Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
		carrosPorMontadora.put("Chevrolet", new HashSet<String>());
		carrosPorMontadora.get("Chevrolet").add("Cruze");
		
		
	}

}
