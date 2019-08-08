#!usr/bin/perl
use warnings;
use strict;

our @list=("a","a","a","a","b","c","c","a","a","d","e","e","e","e");
our $listSize=@list;
our $counter=0;
our $newlab=0;
our @newList;

for (my $x=0; $x<$listSize; $x++){
  if ($list[$x] eq $list[$x+1]){
  $counter=$counter+1;
  }
  elsif ($list[$x] ne $list[$x+1]){
  $newlab=$x-$counter+1;
  $newList[$newlab]=$list[$x];
  $counter=0;
  $newlab=0;
  }
}
print "@newList\n";
