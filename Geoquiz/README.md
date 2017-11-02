# GeoQuiz

This is my first android app project

##Objective

1. To learn how to create a simple android app (equivalent to a Hello World App)
2. Understand the basic components of an android app
3. How they interact with each other
4. How to compile and execute the App


# What I have learned?

## Activity

An Activity manages the user interaction of a screen in the mobile application. 
It manages the user interface.
To create a user interface we need to define a class which is derived (subclassed) from Activity.

> Example:
> > UserActivity - A class derived from Activity

## Layout

A Layout defines a set of UI objects and their position on the screen. 
It is defined in an XML format.
There will be an XML Layout file corresponding to each Activity

> Example:
> > activity_user.xml : The Layout definition for UserActivity

*The layout name reverses the order of the activity name, is all lowercase, and has underscores between words. This naming style is recommended for layouts as well as other resources that you will learn about later*

** An Activity manages what the Layout defines **

# Creating an Android Project
1. Open Android Studio
2. Select "Start a new Android studio Project"
3. Specify the Application Name, package name as Company Domain and Project Location.
4. Select the targetted devices for the App.
5. Select Empty Activity from the Activity Template List
6. Specify the Activity name (QuizActivity) and Layout name (activity_quiz.xml)

This will result in creating an Android project in Android Studio

# Define Layout

**Widgets** are building blocks to compose a UI. It consists of  **Buttons, TextView etc** using which user can interact. It also contains layouts like **RelativeLayout, LinearLayout etc** to hold other widgets. 

A Layout can hold widgets and other Layouts.

> Example: LinearLayout
> > A LinearLayout has Vertical and Horizontal orientations which can be used to align widgets vertically or horizontally

#View Hierarchy
Widgets exist in a hierarchy of View objects called the view hierarchy.
> Example
> > Let us consider a UI as follows
> > The UI contains a Linear 