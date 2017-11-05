# Android

This is the project to hold all the experimental work related to Android

Each work is maintained as separate project and has its own README file, detailing about it.



| SL No | Project Name      | Description                              |
| ----- | ----------------- | ---------------------------------------- |
| 1     | GeoQuiz           | A simple project with one activity, to demonstrate how to create a project in Android. |
| 2     | MultiQuestionQuiz | A multi question Quiz with the option of selecting the answer and also to traverse between questions. |
| 3     | ActivityLifecycle | To understand the Android application Activity Lifecycle, its behavior during device rotation and how to use logs to monitor the activity. |



#  Debugging Tools

### Lint

Android Lint (or just “Lint”) is a static analyzer for Android code. A static analyzer is a program that examines your code to find defects without running it. Lint uses its knowledge of the Android frameworks to look deeper into your code and find problems that the compiler cannot. In most cases, Lint’s advice is worth taking.

> Example: mTrueButton = (Button)findViewById(R.id.question_text_view); 
>
> Here the code is to map a TextView to Button which compiler wont complain but Lint can foresee this problem.

Use Analyze ==> Inspect Code to trigger Lint Manually

### Handling issue with R class

If there are issues related to R class , which is auto generated , then do the following

1. Check the validity of XML in the resource folder.  Correcting the XML and saving it will result in regenerating the R file.
2. Clean your project using Build ==> Clean Project
3. If changes are made to build.gradle file, we need to synch those changes to update the project build settings. Use Tools → Android → Sync Project with Gradle Files
4. Run Android Lint for warnings.

### Use Allocation Tracker to monitor performance Issues

The Allocation Tracker tool creates detailed reports for the frequency and number of memory allocation calls in your program and is useful for performance-tuning your app. In the Android Monitor tool window, click the Allocation Tracker button

This will begin recording memory allocations as you interact with your app. Once you have performed the interaction you are profiling, click the button again to stop allocation tracking. This will display the allocation report

## Useful References

1. [The list of configuration qualifiers that Android recognizes and the pieces of the device configuration that they refer](developer.android.com/guide/topics/resources/providing-resources.html)

   ​

