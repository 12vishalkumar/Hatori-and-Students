# Hatori-and-Students

Hatori is the class teacher with 'N' students. He wants to select some students for the Republic Day parade. But out of all the students he chooses, the absolute difference of heights of any two students should not exceed 5.
He wants to pick the maximum number of students. Help him to know the maximum number of students he can choose.
For Example:
Let the heights of students be 'H' = {1, 6, 7, 8, 2, 3, 11}. So at max, he can pick 4 students with heights: 6, 7, 8, and 11.
Input Format :
The first line contains an integer 'T', which denotes the number of test cases to be run. Then the test cases follow.

The first line of each test case contains an integer 'N', denoting the size of the array of heights.

The following line contains 'N' space-separated positive integers that are the heights of students present in the class.
Output Format :
For each test case, print one integer, i.e., the maximum number of students Hatori can pick.
Print the output of each test case in a new line.
Constraints :
1 <= T <= 10
1 <= N <= 10^5
1 <= H[i] <= 10^9

Time Limit: 1 sec
Sample Input 1 :
2
7
3 11 2 1 4 5 9
3
1 7 13
Sample Output 1 :
5
1
Explanation Of Sample Input 1 :
For test  case 1:
He can choose students with heights: 3, 2, 1, 4, and 5.
As here, the maximum difference between any two heights does not exceed 5.

For test case 2:
He can choose only one student at a time, as the difference between two students' heights is greater than 5.
Sample Input 2 :
2
5
109 109 109 109 109
4
9 1 7 2
Sample Output 2 :
5
2
