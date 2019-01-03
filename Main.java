import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {

		DecimalFormat myFormat = new DecimalFormat("###,###.##");

		// System Objects
		Scanner in = new Scanner(System.in);

		// State Program Variables

		// State all asset variables
		double totalAssets; // Total assets amount
		double rrspAmount; // Registered retirement savings plan account amount
		double tfsaAmount; // Tax-free savings accounts (TFSA) amount
		double nrsiAmount; // Non-registered savings and investments amount
		double homeValue; // Total home value
		double realEstateValue; // Total Real Estate portfolio Value excluding primary home
		double vehiclesValue; // Total value of all vehicles
		double otherValuables; // Total value of other valuable assets

		// State all liability variables
		double totalLiabilities;
		double homeMortgage; // Remaining value of primary home mortgage
		double otherMortgage; // Remaining value of Real Estate portfolio
		double creditCardLoans; // Remaining value of Credit Card Loans
		double lineOfCredits; // Remaining value of lines of credit
		double otherLoans; // Remaining value of other loans

		double totalNetWorth; // TOTAL NET WORTH
		double avgCADNetWorth = 243800;
		double compareNetWorth;

		System.out.println("Welcome to Luxotic Financial's Net Worth Calculator.");
		// SKIP TWO LINES
		System.out.println("");
		System.out.println("");

		// Start of calculator below

		// YOUR HOUSEHOLD ASSETS
		// RRSP amount
		System.out.println("Please enter any registered retirement savings.");
		System.out.println("\t(This includes all of your registered accounts such as registered retirement savings plans (RRSP), "
				+ "group RSPs, defined contribution pension plans (DCPP), defined benefit pension plans (DBPP), "
				+ "locked-in RSPs/LIRAs, etc.): ");
		System.out.print("$");
		rrspAmount = in.nextDouble();

		// TFSA amount
		System.out.println("Please enter any tax-free savings.");
		System.out.println("\t(A TFSA lets you save for any purpose, without paying taxes on the investment growth. "
				+ "In this calculator, we’re assuming you’re not putting in more than the annual TFSA limit.): ");
		System.out.print("$");
		tfsaAmount = in.nextDouble();

		// Non-registered savings and investments amount
		System.out.println("Please enter any non-registered savings and investments.");
		System.out.println("\t(This includes other taxable non-registered savings and investment accounts such as cash, "
				+ "chequing and savings accounts, guaranteed investment certificates (GIC), mutual funds, annuities, stocks, "
				+ "bonds, etc.): ");
		System.out.print("$");
		nrsiAmount = in.nextDouble();


		// YOUR PROPERTY AND OTHER ASSETS
		// Home value
		System.out.println("Please enter the current value of your primary home.");
		System.out.println("\t(This includes a detached home, semi-detached home, townhome, apartment or condominium that you own. "
				+ "Enter what it’s worth now, not what you originally paid or think it will be worth in the future.): ");
		System.out.print("$");
		homeValue = in.nextDouble();

		// Real estate value
		System.out.println("Please enter the total value of all the real estate you own.");
		System.out.println("\t(This includes a cottage, rental property or other real estate (excluding your primary home) that "
				+ "you own. "
				+ "Enter what it’s worth now, not what you originally paid or think it will be worth in the future.): ");
		System.out.print("$");
		realEstateValue = in.nextDouble();

		// Vehicle value
		System.out.println("Please enter the total value of any vehicle(s) you own.");
		System.out.println("\t(This includes the current value of vehicles such as cars, trucks, motorcycles, "
				+ "boats and other recreational vehicles such as snowmobiles, ATVs or RVs.): ");
		System.out.print("$");
		vehiclesValue = in.nextDouble();

		// Other Valuables value
		System.out.println("Please enter the total value of any other valuables you own.");
		System.out.println("\t(This includes the current value of items such as jewellery, electronics, furniture and appliances, "
				+ "art and other items that have a high resale value.): ");
		System.out.print("$");
		otherValuables = in.nextDouble();

		// Calculate total assets
		totalAssets = rrspAmount + tfsaAmount + nrsiAmount + homeValue + realEstateValue + vehiclesValue + otherValuables;
		System.out.println("YOUR TOTAL ASSETS: $" + myFormat.format(totalAssets));

		// SKIP TWO LINES
		System.out.println("");
		System.out.println("");

		// YOUR HOUSEHOLD LIABILITIES
		// Household mortgage amount
		System.out.println("Please enter the current amount owing on your primary mortgage.");
		System.out.print("$");
		homeMortgage = in.nextDouble();

		// Other mortgage amount
		System.out.println("Please enter the current amount owing on any other mortgage.");
		System.out.println("\t(This is the current amount owing on any other real estate mortgages you may have. "
				+ "This includes mortgages on cottages, rental properties and any other real estate.): ");
		System.out.print("$");
		otherMortgage = in.nextDouble();

		// Credit card debt value
		System.out.println("Please enter the current amount owing on any credit cards.");
		System.out.print("$");
		creditCardLoans = in.nextDouble();

		// Line of credit debt value
		System.out.println("Please enter the current amount owing on any line of credit loans.");
		System.out.print("$");
		lineOfCredits = in.nextDouble();

		// Loan debt value
		System.out.println("Please enter the current amount owing on any other loans.");
		System.out.println("\t(This includes car loans, student loans, banks loans or other loans.): ");
		System.out.print("$");
		otherLoans = in.nextDouble();

		// Calculate total liabilities
		totalLiabilities = homeMortgage + otherMortgage + creditCardLoans + lineOfCredits + otherLoans;
		System.out.println("YOUR TOTAL LIABILITIES: $" + myFormat.format(totalLiabilities));

		// SKIP TWO LINES
		System.out.println("");
		System.out.println("");

		System.out.println("----------------------------------------------------------------------------------------");

		// SKIP TWO LINES
		System.out.println("");
		System.out.println("");

		// Calculate total net worth
		totalNetWorth = totalAssets - totalLiabilities;
		System.out.println("YOUR TOTAL NET WORTH: $" + myFormat.format(totalNetWorth));
		System.out.println("");

		if (totalNetWorth > avgCADNetWorth) {
			compareNetWorth = totalNetWorth - avgCADNetWorth;
			System.out.println("Your net worth is $" + myFormat.format(compareNetWorth) + " above the average compared to other Canadian households.");
		} else if (totalNetWorth < avgCADNetWorth) {
			compareNetWorth = avgCADNetWorth - totalNetWorth;
			System.out.println("Your net worth is $" + myFormat.format(compareNetWorth) + " below the average compared to other Canadian households.");
		}




	}



}
