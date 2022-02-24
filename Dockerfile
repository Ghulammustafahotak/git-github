FROM node:alpine
COPY . /app
WORKDIR /app
CMD node app.js

# Base image is Node:Alpine
# Copies everything to the /app folder
# Starts the container in the /app directory
# Runs the app.js file with "node"
