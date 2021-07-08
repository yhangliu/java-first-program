import java.util.Map;

public class Finance {
	
	public final static String BEST_LOAN_RATES = "bestLoanRates";
	public final static String SAVINGS_CALCULATOR = "savingsCalculator";
	public final static String MORTGAGE_CALCULATOR = "mortgageCalculator";
	
	public final static Map<String, String> commandsToUsage = Map.of(BEST_LOAN_RATES, "usage: bestLoanRates",
			SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
			MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");
		
	private static boolean validateCommandArguments(String[] args) {
		
		switch (args.length) {
		case 1: return true;
		case 3: return true;
		case 4: return true;
		}
		
		return false;

	}
}
