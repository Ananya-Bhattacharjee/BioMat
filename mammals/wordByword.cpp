#include <bits/stdc++.h>
using namespace std;
bool is_number(const std::string &s) {
  return !s.empty() && std::all_of(s.begin(), s.end(), ::isdigit);
}
// driver code
int main()
{
    // filestream variable file
    fstream file;
    string word, t, q, filename;

    // filename of the file
    filename = "calc.txt";

    // opening file
    file.open(filename.c_str());

    int n;
    float x=0,y=0,z=0,zz=0;
    int c=0;
    scanf("%d",&n);


    // extracting words from the file
    while (file >> word)
    {
        // displaying content
//        cout << word << endl;
        if(n==0){
            if(is_number(word))
            {
                c++;
                if(c%3==1) x+=atof(word.c_str());
                if(c%3==2) y+=atof(word.c_str());
                if(c%3==0) z+=atof(word.c_str());

            }
        }
        else{
                            if(is_number(word))
            {
                c++;
                if(c%4==1) x+=atof(word.c_str());
                if(c%4==2) y+=atof(word.c_str());
                if(c%4==3) z+=atof(word.c_str());
                if(c%4==0) zz+=atof(word.c_str());

            }


        }


    }

    cout<<x/680<<endl<<y/680<<endl<<z/680<<endl<<zz/680;

    return 0;
}

