Feature: JDoodle Automation Test
Purpose of this file is to test End to End Jdoodle 
Background: Customer open the WebSite 
Given User is on Home Page
#


Scenario: Verify User is able to expand the screen 
Given User sees the expand button
When User clicks on expand button
And menu list item also not showing up


Scenario Outline: Check Font size selection from dropdown and validate font size in coding pan
Given User sees the font size dropdown
When User selects "<fontSize>" from dropdown
And User validate font size in coding pan should be same as "<fontSize>" 

Examples:
|fontSize|
|11|

Scenario: Verify User is able to expand the screen 
Given User sees the expand button
When User clicks on expand button
And menu list item also not showing up


Scenario: Verify menu items from left side is hidden when click on red button on top left corner of coding pan
Given User sees the red cross button
When User click on red cross button
And User sees red Play icon to see the left side menu

@regression
Scenario: Verify user able to upload input files 
Given User sees Upload Files Tab
When User clicks on Upload Files Tab
Then User drag and drop a file for upload
##

