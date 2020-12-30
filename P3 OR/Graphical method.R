#Max z= 4x1+5x2
#s.t.c
#6x1+6x2<=36
#x1+2x2<=10
#x1<=4
#x1,x2>=0

#As a first step, in order to plot the lines 
#corresponding to each constraint, we must transform them into
#equalities.

# Define constraints
cons.1 <- function(x) 6 - x  
cons.2 <- function(x) 5 - 0.5*x
# cons.3 x1 = 4 (plotted using geom_vline)
# cons.4 x1 = 0 (defined by setting x1 axis limits)
# cons.5 x2 = 0 (defined by setting x2 axis limits)

#Next, the transformed constraints must be plotted
#in a two-dimensional space plot.

# Import ggplot2 package
library(ggplot2)

# Build plot
p <- ggplot(data = data.frame(x = 0), aes(x = x)) +
  
  # Add axes
  geom_vline(xintercept = 0) +
  geom_hline(yintercept = 0) +
  
  # Add constraints lines
  stat_function(colour = "Red", fun = cons.1) +
  stat_function(colour = "Blue", fun = cons.2) +
  geom_vline(xintercept = 4, colour = "Green") +
  
  # Specify axes breaks and limits
  scale_x_continuous(breaks = seq(0, 10, 1), lim = c(0, 10)) +
  scale_y_continuous(breaks = seq(0, 10, 1), lim = c(0, 10)) +
  
  # Define labels
  labs(title = "Optimization Problem",
       subtitle = "Graphical Method",
       x = "x1",
       y = "x2") +
  
  # Add black and white theme
  theme_bw()

# Print plot
print(p)

# Now that the constraints equations have been plotted, 
# the next step consists in defining the feasible region, 
# which is the polygon (i.e. area plot) where all constraints 
# original inequalities are met.

# Define feasible region polygon
feasible_region = data.frame(x = c(0, 4, 4, 2, 0), y = c(0, 0, 2, 4, 5))

# Add feasible region to current plot
p <- p + geom_polygon(data = feasible_region, mapping = aes(x = x, y = y), fill = "#dddddd") +
  geom_point(data = feasible_region, aes(x = x, y = y), color = "Black")

# Print plot
print(p)

# The feasible region above contains all the possible combinations 
# of x1 and x2 that satisfy the given constraints. 
# However, the optimum solution of the problem will 
# be located in one of its corner points, 
# either (0,0), (4,0), (4,2), (2,4) or (0,5).
# To identify the corner point that represents 
# the optimum solution, the objective function 
# needs be plotted next. Once plotted, 
# the objective function line will be gradually
# displaced to the right all the way before exiting 
# the feasible region. The last point the objective function
# line touches before exiting the feasible region represents 
# the optimum solution of the problem (i.e. the combination
# of x1 and x2 values that maximize the value of z).

# Visualize objective function displacement again
z.solution <- function(x) -0.8*x + 5.6   # (the + 5.6 constant is just for displacement visualization purposes)\

# Visualize objective function displacement - solution
p <- p + stat_function(colour = "Black", fun = z.solution, lty=2)

# Print plot
print(p) 