class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        t=numBottles
        while numBottles>=numExchange:
            nb=numBottles//numExchange
            r=numBottles%numExchange
            t+=nb
            numBottles=nb+r
        return t

        
