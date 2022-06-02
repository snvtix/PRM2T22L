#include<stdio.h>
#include<iostream>
#define TABLE_SIZE 10

char *names[TABLE_SIZE] = {"Jan", "Krystyna", "Barbara", "Pawel", "Luiza", "Stefan", "Monika","Maria", "Tadeusz", "Konrad"};
int times[TABLE_SIZE] = {56, 60, 51, 44, 66, 50, 49, 62, 43, 70};

int main(int argc,char** argv) {

    while(1) {
        printf("Select an option:\n 1 - calculate\n 2 - exit program\n");
        int option;
        scanf("%d" , &option);
        switch(option) {
            case 1:
                for(int i=0; i<TABLE_SIZE; i++){
                    for(int j=0; j<TABLE_SIZE-1; j++){
                        if(times[j]>times[j+1]){
                            std::swap(times[j],times[j+1]);
                            std::swap(names[j],names[j+1]);
                        }
                    }
                }
                std::cout << "Pierwsze miejsce: " << names[0] << " - czas: " << times[0] << "s" << std::endl;
                std::cout << "Drugie miejsce: " << names[1] << " - czas: " << times[1] << "s" << std::endl;
                std::cout << "Trzecie miejsce: " << names[2] << " - czas: " << times[2] << "s" << std::endl;
                break;
            case 2:
                printf("Exiting program\n");
                return 0;
            default:
                printf("Wrong option, choose once again\n");
        }
    }
}
