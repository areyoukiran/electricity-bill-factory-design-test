package firstpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class MyTest {

	public static void main(String[] args) {
		compareLists();

	}

	public static void compareLists() {
		List<String> appRoles = new ArrayList<String>(Arrays.asList("SUPER_ADMIN", "APP_ADMIN", "DEVICE_USER",
				"OFFICE_SUPERVISOR_ROLE", "DASHBOARD_ROLE", "TARIFF_TESTER"));
		List<String> roleCodes = new ArrayList<String>(
				Arrays.asList("APP_ADMIN", "DASHBOARD_ROLE", "DEVICE_USER", "OFFICE_SUPERVISOR_ROLE", "SUPER_ADMIN"));
		// appRoles.removeAll(roleCodes);
		List<String> differences = new ArrayList<>((CollectionUtils.removeAll(appRoles, roleCodes)));
		System.out.println("Original List Size: " + appRoles.size());
		System.out.println("Second List Size: " + roleCodes.size());
		System.out.println("Original List Contents: " + appRoles.toString());
		System.out.println("Second List Contents: " + roleCodes.toString());		
		System.out.println("Remainder List Size: " + differences.size());
		System.out.println("Remainder Roles: " + differences.toString());
		/*
		 * System.out.println("Remainder Roles: " + appRoles.toString());
		 * System.out.println("Main List Size: " + appRoles.size());
		 * System.out.println("Main List Content: " + appRoles.get(0));
		 */
	}

}
