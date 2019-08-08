#!usr/bin/Perl
#countdown.plx

use warnings;
use strict;

my @count;

@count = (1..5);

for (reverse(@count))
{
	print "$_...\n";
	sleep 1;
}

print "Fuck off\n";

