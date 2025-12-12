#testing code always start with the word TEST
from app import some_something

def test_sum_something(): #def function always start with the word TEST
    a,b=1,2

    assert sum_something(a,b)==3 #assert asks wether. the code is TRUE or FALSE

