#!usr/bin/perl
#months.plx

use warnings;
use strict;

$month = 4;


print qw(
	January   February   March
	April     May        June
	July      August     September
	October   November   December

	)[$month];
