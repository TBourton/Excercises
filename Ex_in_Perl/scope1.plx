#!/usr/bin/perl
#scope1.plx

use warnings;
use strict;

our $record = 4;

print "At record ", $record, "\n";

{
	my $record1;
	$record1 = 7;
	print "Inside block record = ", $record1, "\n";
}

print "record = ", $record, "\n";
