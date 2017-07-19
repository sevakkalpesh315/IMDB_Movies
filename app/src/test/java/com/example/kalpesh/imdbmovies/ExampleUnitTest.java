package com.example.kalpesh.imdbmovies;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static final String TASK_ID = "1";
//
//    /**
//     * {@link IntentsTestRule} is an {@link ActivityTestRule} which inits and releases Espresso
//     * Intents before and after each test run.
//     *
//     * <p>
//     * Rules are interceptors which are executed for each test method and are important building
//     * blocks of Junit tests.
//     */
//    @Rule
//    public ActivityTestRule<AddEditTaskActivity> mActivityTestRule =
//            new ActivityTestRule<>(AddEditTaskActivity.class, false, false);
//
//    @Test
//    public void emptyTask_isNotSaved() {
//        // Launch activity to add a new task
//        launchNewTaskActivity(null);
//
//        // Add invalid title and description combination
//        onView(withId(R.id.add_task_title)).perform(clearText());
//        onView(withId(R.id.add_task_description)).perform(clearText());
//        // Try to save the task
//        onView(withId(R.id.fab_edit_task_done)).perform(click());
//
//        // Verify that the activity is still displayed (a correct task would close it).
//        onView(withId(R.id.add_task_title)).check(matches(isDisplayed()));
//    }
//
//    @Test
//    public void toolbarTitle_newTask_persistsRotation() {
//        // Launch activity to add a new task
//        launchNewTaskActivity(null);
//
//        // Check that the toolbar shows the correct title
//        onView(withId(toolbar)).check(matches(withToolbarTitle(R.string.add_task)));
//
//        // Rotate activity
//        TestUtils.rotateOrientation(mActivityTestRule.getActivity());
//
//        // Check that the toolbar title is persisted
//        onView(withId(toolbar)).check(matches(withToolbarTitle(R.string.add_task)));
//    }
//
//    @Test
//    public void toolbarTitle_editTask_persistsRotation() {
//        // Put a task in the repository and start the activity to edit it
//        TasksRepository.destroyInstance();
//        FakeTasksRemoteDataSource.getInstance().addTasks(new Task("Title1", "", TASK_ID, false));
//        launchNewTaskActivity(TASK_ID);
//
//        // Check that the toolbar shows the correct title
//        onView(withId(toolbar)).check(matches(withToolbarTitle(R.string.edit_task)));
//
//        // Rotate activity
//        TestUtils.rotateOrientation(mActivityTestRule.getActivity());
//
//        // check that the toolbar title is persisted
//        onView(withId(toolbar)).check(matches(withToolbarTitle(R.string.edit_task)));
//    }
//
//    /**
//     * @param taskId is null if used to add a new task, otherwise it edits the task.
//     */
//    private void launchNewTaskActivity(@Nullable String taskId) {
//        Intent intent = new Intent(InstrumentationRegistry.getInstrumentation()
//                .getTargetContext(), AddEditTaskActivity.class);
//
//        intent.putExtra(AddEditTaskFragment.ARGUMENT_EDIT_TASK_ID, taskId);
//        mActivityTestRule.launchActivity(intent);
//    }
//
//    /**
//     * Matches the toolbar title with a specific string resource.
//     *
//     * @param resourceId the ID of the string resource to match
//     */
//    public static Matcher<View> withToolbarTitle(final int resourceId) {
//        return new BoundedMatcher<View, Toolbar>(Toolbar.class) {
//
//            @Override
//            public void describeTo(Description description) {
//                description.appendText("with toolbar title from resource id: ");
//                description.appendValue(resourceId);
//            }
//
//            @Override
//            protected boolean matchesSafely(Toolbar toolbar) {
//                CharSequence expectedText = "";
//                try {
//                    expectedText = toolbar.getResources().getString(resourceId);
//                } catch (Resources.NotFoundException ignored) {
//                    /* view could be from a context unaware of the resource id. */
//                }
//                CharSequence actualText = toolbar.getTitle();
//                return expectedText.equals(actualText);
//            }
//        };
//    }

}