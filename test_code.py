#testing code always start with the word TEST
from app import sum_something, sub_something

def test_sum_something(): #def function always start with the word TEST
    a,b=1,2

    assert sum_something(a,b)==3 #assert asks wether. the code is TRUE or FALSE

def test_sub_something():
    a,b=1,2 

    assert sub_something(a,b)==-1

