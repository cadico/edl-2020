#include <bits/stdc++.h>
#include <vector>

using namespace std;

vector<string> lista; //criação da lista

int main(){
    string input;
    vector<string>::iterator it = lista.begin(); //criação do ponteiro para a lista
    while(cin >> input){
        lista.push_back(input); //adicionando cada linha ao final da lista
    }
    for (it = lista.begin(); it < lista.end(); it++) 
        cout << *it << endl; //imprimindo lista
    return 0;
}
