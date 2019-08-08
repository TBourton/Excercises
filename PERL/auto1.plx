#!/usr/bin/perl
#auto1.plx

use warnings;

$a=4;
$b=10;

print "Our variables are ", $a, " & ", $b, "\n";
#variables;
$b=$a++;

print "After increment we have ", $a, " & ", $b, "\n";

$b=++$a * 2;

print "Now have ", $a, " & ", $b, "\n";

$a=--$b+4;

print "Finally we have ", $a, " & ", $b, "\n";

