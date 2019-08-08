#!usr/bin/perl
#use warnings;
use strict;

print "Enter each element of the list followed by Enter and when you are finished enter the EOF character(CTRL+D)\n"; #ask for input
our @list=<STDIN>;
chomp @list; 

my @listRev=reverse @list; #reverse the list
our $listSize = @list; #get number of elements in list
our $isPalin=1; #initialise the isPalin variable

for (my $i=0 ; $i<=$listSize; $i++){
    if ($list[$i] ne $listRev[$i]){
      $isPalin=0; #if element of list does not match the element of the reverse the the list isn't a palindrome
    } 
}

if($isPalin==1){
print "The list is a palindrome\n";
}
elsif($isPalin==0){
print "The list is not a palindrome\n";
} 
