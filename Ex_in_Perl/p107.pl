#!usr/bin/perl
use warnings;
use strict;
use List::Flatten;
my @list=("a", ["b",["c","d"],"e"]);
@list = flat @list;
print "@list";
