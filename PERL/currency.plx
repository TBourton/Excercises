#!/usr/bin/perl
#currency.plx

use warnings;
use strict;

print "Curreny Convertor \n\nPlease enter exchange rate of yen:";
my $yen = <STDIN>;

print "49518 Yen is ", (49_518/$yen), " pounds\n";

print "360 Yen is ", (360/$yen), "pounds\n";
print "30510 Yen is ", (30_510/$yen), " pounds\n";
