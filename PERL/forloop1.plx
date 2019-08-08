#!/usr/bin/perl
## forloop1.plx

use warnings;
use strict;


my @Array_Countries = qw(American Asia Eurpoe Africa);

my $element;

for $element (@Array_Countries)
	{
		print $element, "\n";
	}
