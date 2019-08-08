#A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
#
#For example, in array A such that:
#
#  A[0] = 9  A[1] = 3  A[2] = 9
#  A[3] = 3  A[4] = 9  A[5] = 7
#  A[6] = 9
#the elements at indexes 0 and 2 have value 9,
#the elements at indexes 1 and 3 have value 3,
#the elements at indexes 4 and 6 have value 9,
#the element at index 5 has value 7 and is unpaired.
#Write a function:
#
#def solution(A)
#
#that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
#
#For example, given array A such that:
#
#  A[0] = 9  A[1] = 3  A[2] = 9
#  A[3] = 3  A[4] = 9  A[5] = 7
#  A[6] = 9
#the function should return 7, as explained in the example above.
#
#Write an efficient algorithm for the following assumptions:
#
#N is an odd integer within the range [1..1,000,000];
#each element of array A is an integer within the range [1..1,000,000,000];
#all but one of the values in A occur an even number of times

#####solution starts######

def solution(A):
    # write your code in Python 3.6
    B=sorted(A) #sort the list
    p=0 #initalise counter
    while p<len(B):
        n=0
        while B[p]==B[p+n]: #count number of elements =B[p]
           n=n+1
           if p+n+1>len(B): #ensure we won't make an out of bound error
               break
        if n%2==0: #the number of times B[p] appears is even and it is not /ourguy/
            p=p+n
        else: #B[p] appears odd number of times so he is /ourguy/
            break
    return(B[p])