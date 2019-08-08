#!/usr/bin/perl
#bin_dec_conv.plx

use warnings;
use strict;

print "Please enter a decimal number less than
256\n";

my $dec_no = <STDIN>;
my $i = 0;
my $binstr;

while ($i<8)
{	
	if ($dec_no&(2*$i) == 1)
       	{		
		$binstr = "1" . "$binstr";
	}

	else
	{
		$binstr = "0" . "$binstr";
	}
	$i++;
}
print $dec_no, " converted to binary is $binstr\n";

