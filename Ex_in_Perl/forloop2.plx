#!usr/bin/perl
# forloop2.plx

use warnings;
use strict;

my @Num_Array = (10, 20, 30, 40);

print "Before: @Num_Array\n";

for (@Num_Array)
{
	$_ *=2;
}

print "After: @Num_Array\n";
