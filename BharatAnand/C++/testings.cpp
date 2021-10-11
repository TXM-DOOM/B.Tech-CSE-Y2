

/*int main()
{
    int a, b, c = 0;
    cout << "Please enter the number a : " << endl;
    cin >> a;
    cout << "Please enter the number b : " << endl;
    cin >> b;
    c = a + b;

    cout << c << endl;
    cout << 6 + 8 << endl;
    cout << "hhe";
    return 0; 
}
    #include<iostream>
    #include<stdio.h>
    #include<string.h>
    using namespace std; 
    int main()
    {   
       char str[20];   
       cout<<"Enter the string? ";  
       gets(str);  
       strupr(str);  
       puts(str);
       return 0;
    }   
    */
#include <iostream>
#include <string>
using namespace std;

int main ()
{
  string mystr;
  cout << "What's your name? ";
  getline (cin, mystr);
  cout << "Hello " << mystr << ".\n";
  cout << "What is your favorite team? ";
  getline (cin, mystr);
  cout << "I like " << mystr << " too!\n";
  return 0;
}