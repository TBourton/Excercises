#!\usr\bin\perl
#hexoctconv.plx

use warnings;
use strict;

{
print "Please enter a hex number\n";

my $hexno = <STDIN>;


print hex($hexno), "\n";

print "Please enter an Octal number\n";

my $octno = <STDIN>;

print oct($octno), "\n";
}
