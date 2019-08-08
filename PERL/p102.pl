#!usr/bin/perl
use warnings;
use strict;
print "Enter each element of the list followed by Enter and when you are finished enter the EOF character(CTRL+D)\n";
my @list=<STDIN>;

chomp @list;
@list=reverse @list;

my $listSize=@list;

if ($listSize<2){
print "Your list is only one element long, hence there does not exist a last but one element\n";
} else{ 
print "The last but one element of yout list is:\n";
print "$list[1]\n";}
