# solid-design-pattern-demo-template
This application just only contain app structure demo template considering SOLID Design pattern.
This app has structure like payment gateway, which process payment for Credit card and Debit Card only but by considering SOLID principle "Open for extension and Close modification", we can add processing for wallets or other payment method as well.
In case of Credit card payment functionality, before making payment it checks for Credit Card limit (don't compare with real world functionality).
In case of Debit card payment functionality, before making payment it checks for Debit Card account bank balance (don't compare with real world functionality).
In Point no. 4 and 5, i have added extra functionality (like checkCreditLimit, checkBankBalance) intentionally to cross check Single Responsibilty Principle.
Please verify this app follow SOLID pattern or not, in case of any modification create new branch and modify structure it.
I welcome your suggestion.
