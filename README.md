# BankAccountApplication
Backend Java Application that handles new customer bank account requests
Reads a .CSV file of name's, social security numbers, account types, and initial deposits
Uses a proper data structure to hold all of these data accounts
Both Savings & Checking accounts store the following properties: Deposit, Withdraw, Transfer, and ShowInfo
11 digit account number generated with following process: 1 or 2 depending on it being Checking or Savings, last two digits are the Social Security Number, a unique 5 digit number, and a random 3 digit number
Savings Account Holders are given a Safety Deposit Box, identified by a 3 digit number, and accessed by a 4 digit pin
Checking Account holders are assigned a debit card with a 12 digit number, and a 4 digit pin
Both accounts use an interface that determines base interest rate; Savings= .25 points less than base rate; Checking= 15% of base rate

