#!usr/bin/perl
use warnings;
use strict;
print "Enter each element of the list followed by Enter and when you are finished enter the EOF character(CTRL+D)\n";
my @list=<STDIN>;

chomp @list; 
my $listSize=@list;
print "Enter the element number k(in Z) you would like to find (0<k<=$listSize)\n";
my $number=<STDIN>;

if (int($number) != $number){
  print "k must be an integer\n";}
elsif (($number<$listSize) && ($number>0)){
  print "The kth element of yout list is:\n";
  print "$list[($number-1)]\n";}
else {
  print "k must be less than or equal to the number of elements in the list and k must be greater than zero\n";}
