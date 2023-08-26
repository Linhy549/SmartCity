# SmartCity

## Env setup:

- [Eclipse download link](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-06/R/eclipse-inst-jre-win64.exe)

- Java - [jdk.18.0.2.1](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)

## How to run Spring boot application?

- Git downloaded

- In your local workplace create an empty folder, right click open "Git bash here" and run the following commend 
  
  > git clone https://github.com/Linhy549/SmartCity.git

- Open this folder in Eclipse 

- Open "AlbanyPlusApplication.java" file where it is the entry point of spring boot application

- Right click and select "Run as " - "Spring boot App"

- You would see logs info are running in consle, If see something like  "Started AlbanyPlusApplication in 1.35 seconds", it means the app is running properly

- Open a browser, type in 
  
  > http://localhost:8080/place

- Fianlly, you should be able to see something like the following
  
  > name: New York State Museum placeDes: Des1 like: 4 dislike: 13 rate: 3.4842402319116337 name: New York State Capitol placeDes: Des2 like: 15 dislike: 0 rate: 1.3952788761461528 name: Albany Institute of History & Art placeDes: Des3 like: 14 dislike: 20 rate: 3.277956695259627 name: Washington Park placeDes: Des4 like: 10 dislike: 18 rate: 1.413119426915197 name: The Egg placeDes: Des5 like: 13 dislike: 16 rate: 0.48218463417843527 name: Palace Theatre placeDes: Des6 like: 10 dislike: 17 rate: 1.7476175368992601

## Work have been done:

- 8-26： Implement showAllPlace API call.
