import java.util.Random;

Random random = new Random();

// Define arrays for choices
String[] genders = new String[]{"Male", "Female", "Confused"};
String[] marrieds = new String[]{"Married", "Un-Married"};
String[] credit_histories = new String[]{"Unclear Debts", "Clear Debts"};

// Select random values
String selectedGender = genders[random.nextInt(genders.length)];
String selectedMarried = marrieds[random.nextInt(marrieds.length)];
int applicantIncome = random.nextInt(1000000000);
int loanAmount = random.nextInt(1000000000);
String selectedCreditHistory = credit_histories[random.nextInt(credit_histories.length)];

// Store values in JMeter variables
vars.put("gender", selectedGender);
vars.put("married", selectedMarried);
vars.put("applicant_income", Integer.toString(applicantIncome));
vars.put("loan_amount", Integer.toString(loanAmount));
vars.put("credit_history", selectedCreditHistory);



//{
//    "gender": "${gender}",
//    "married": "${married}",
//    "applicant_income": ${applicant_income},
//    "loan_amount": ${loan_amount},
//    "credit_history": "${credit_history}"
//}
