# commoncode

"testData.xlsx" should be available in root directory of your project, before executing the script.

For executing here are the steps:

# If you're running this from console / terminal - 

1. Maven should be installed on your server / machine where the script is going execute.
2. This command needs to execute the script - mvn test -DSITEURL={your_site_url_here}

# if you're running from eclipse - 

Right Click on your Project Name > Run As > Maven Build... > Goals should be set as "test -DSITEURL={your_site_url_here}" > cLick "Apply" > click "Run"
