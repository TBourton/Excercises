#This is a demo task.
#
#Write a function:
#def solution(A)
#that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
#
#For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
#
#Given A = [1, 2, 3], the function should return 4.
#
#Given A = [−1, −3], the function should return 1.
#
#Write an efficient algorithm for the following assumptions:
#
#N is an integer within the range [1..100,000];
#each element of array A is an integer within the range [−1,000,000..1,000,000].
#
#
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    B=sorted(list(set(A))) #remove duplicates and then sort
    neglist=[]
    poslist=[]
    for n in range(0,len(B)):
        if B[n]<=0:
            neglist.append(B[n])
        else:
            poslist.append(B[n]) #we only really care about positives
    sol=1
    n=0
    while n<len(poslist):
        if poslist[n]!=n+1:
            sol=n+1
            break
        else:
            n=n+1
            sol=n+1
    return sol