#Assignment problem
#      J1     J2      J3
#x1     15    10      9
#x2     9     15      10
#x3     10    12      8

library(lpSolve)
costs<-matrix(c(15,10,9,9,15,10,10,12,8),nrow=3,byrow=TRUE)
costs
lp.assign(costs)
lp.assign(costs)$solution