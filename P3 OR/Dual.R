#Solve the following LPP using Dual Simplex method.
# Max z=40x1+50x2
# subject to
# 2x1+3x2<=3
# 8x1+4x2<=5
#x1,x2>=0

library(lpSolve)
f.obj<-c(40,50)
f.com<-matrix(c(2,3,8,4),nrow=2,byrow=TRUE)
f.dir<-c("<=","<=")
f.rhs<-c(3,5)
lp("max",f.obj,f.com,f.dir,f.rhs)
lp("max",f.obj,f.com,f.dir,f.rhs)$solution
lp("max",f.obj,f.com,f.dir,f.rhs,compute.sens=TRUE)$sens.coef.from
lp("max",f.obj,f.com,f.dir,f.rhs,compute.sens=TRUE)$sens.coef.to
lp("max",f.obj,f.com,f.dir,f.rhs,compute.sens=TRUE)$duals
lp("max",f.obj,f.com,f.dir,f.rhs,compute.sens=TRUE)$duals.from
lp("max",f.obj,f.com,f.dir,f.rhs,compute.sens=TRUE)$duals.to
