/*************************************************************************
	> File Name: numHasOneCount.c
	> Author: zhuyidi
	> Mail: 1311243087@qq.com
	> Created Time: Sat 17 Mar 2018 05:06:45 PM CST
 ************************************************************************/

#include<stdio.h>

int haveOneCount(int num);

int haveOneCount(int num) {
    int count = 0;

    while (num != 0) {
        num = num & (num-1);
        count++;
    }

    return count;
}

int main(int argc,char *argv[])
{
    printf("%d\n", haveOneCount(7));
}
