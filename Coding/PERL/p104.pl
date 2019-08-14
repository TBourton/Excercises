#!usr/bin/perl
use warnings;
use strict;
print "Enter each element of the list followed by Enter and when you are finished enter the EOF character(CTRL+D)\n";
my @list=<STDIN>;
my $listSize =@list;
chomp @list;
print "The list is @list\n";
print "The number of elements in the list is: $listSize\n";
