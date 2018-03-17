/*************************************************************************
	> File Name: fullPermutation.c
	> Author: zhuyidi
	> Mail: 1311243087@qq.com
	> Created Time: Sat 17 Mar 2018 12:20:03 PM CST
 ************************************************************************/

#include<stdio.h>
#include<string.h>

void dfs(int *arr, int start, int end);
void swap(int *num1, int *num2);

void swap(int *num1, int *num2) {
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

void dfs(int *arr, int start, int end) {
    int i = 0;
    int j = 0;

    if (start >= end) {
        for (j = 0; j < end; j++) {
            printf("%d ", arr[j]);   
        }
        printf("\n");
        return;
    }

    for (i = start; i < end; i++) {
        swap(&arr[start], &arr[i]);
        dfs(arr, start+1, end);
        swap(&arr[start], &arr[i]);
    }
}


int main(int argc,char *argv[])
{
    int arr[] = {1, 2, 3};
    char str[] = "1234";

    dfs(arr, 0, (sizeof(arr))/sizeof(int));
}
