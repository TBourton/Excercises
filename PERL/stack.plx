#!usr/bin/perl
# stack.plx

use warnings;
use strict;

my $hand;
my @pileofstuff = ("letter", "newspaper", "gas bill", "notepad");

print "Here's the stuff: @pileofstuff\n";

print "pick something up from the top of pile.\n";
$hand = pop @pileofstuff;




