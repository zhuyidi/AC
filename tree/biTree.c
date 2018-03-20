/*************************************************************************
	> File Name: biTree.c
	> Author: zhuyidi
	> Mail: 1311243087@qq.com
	> Created Time: Tue 20 Mar 2018 09:22:23 PM CST
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

typedef struct NODE{
    int data;
    struct NODE *left;
    struct NODE *right;
}NODE;

void *Malloc(size_t size);
void createTree(NODE **root);
void printTree(NODE *root);

void printTree(NODE *root) {
    if (NULL == root) {
        return;
    }
    
    printf("%d ", root->data);
    printTree(root->left);
    printTree(root->right);
}

void createTree(NODE **root) {
    int temp = -1;
    scanf("%d", &temp);

    if (-1 == temp) {
        *root = NULL;
        return;
    }

    *root = (NODE *)Malloc(sizeof(NODE));
    (*root)->data = temp;
    createTree(&(*root)->left);
    createTree(&(*root)->right);
}

void *Malloc(size_t size) {
    void *result = NULL;

    result = malloc(size);
    if (NULL == result) {
        printf("内存申请失败!");
        exit(-1);
    }

    return result;
}

int main(int argc,char *argv[])
{
    NODE *root = NULL;

    createTree(&root);

    printf("开始打印\n");

    printTree(root);
}
