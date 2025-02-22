# Interstate-Highway-Numbers
Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

Example Input and Output:
Input: 90
Output: I-90 is primary, going east/west.

Input: 290
Output: I-290 is auxiliary, serving I-90, going east/west.

Input: 0
Output: 0 is not a valid interstate highway number. 

Input: 200
Output: 200 is not a valid interstate highway number. 
