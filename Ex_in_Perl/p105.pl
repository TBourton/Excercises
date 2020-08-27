#!usr/bin/perl
use warnings;
use strict;
print "Enter each element of the list followed by Enter and when you are finished enter the EOF character(CTRL+D)\n";
my @list=<STDIN>;

chomp @list;
@list=reverse @list;

print "The reversed list is: @list\n";
