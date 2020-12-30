#Transportation Problem
#     Customer 1    Customer 2    Customer 3    Customer 4    SUPPLY
#1    10            2             20            11            15
#2    12            7             9             20            25
#3    4             14            16            18            10
#Dem. 5             15            15            15

libray(lpSolve)
costs<-matrix(c(10,2,20,11
                ,12,7,9,20
                ,4,14,16,18),nrow=3,byrow=TRUE)
colnames(costs)<-c("Customer 1", "Customer 2","Customer 3","Customer 4")
rownames(costs)<-c("Supplier 1", "Supplier 2","Supplier 3")

row.signs<-rep("<=",3)
row.rhs<-c(15,25,10)
col.signs<-rep(">=",4)
col.rhs<-c(5,15,15,15)
TotalCost<-lp.transport(costs,"min",row.signs,row.rhs,col.signs,col.rhs)
lp.transport(costs,"min",row.signs,row.rhs,col.signs,col.rhs)$solution
print(TotalCost)
