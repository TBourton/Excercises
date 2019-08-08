#!/usr/bin/perl
use warnings;
use strict;

print "Hello, world.\n";

our $name="tom";
print $name, "\n";

our $num;
$num =20.3;
$num +=11;

print $num, "\n";
{
  my $num;
  $num=20.76;
  print $num, "\n";
}

my  @listy;
@listy=qw(20 60.7 7);
print "@listy \n";
print "$listy[0] \n";
