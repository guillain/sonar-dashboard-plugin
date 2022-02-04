# sonar-dashboard-plugin [![.github/workflows/maven.yml](https://github.com/guillain/sonar-dashboard-plugin/actions/workflows/maven.yml/badge.svg)](https://github.com/guillain/sonar-dashboard-plugin/actions/workflows/maven.yml)

Dashboard plugin for SonarQube.

- Compatible with SonarQube 8.x.
- Validated on SonarQube 8.9 (LTS).

## Feature

This plugin add:

- An admin menu to display SonarQube metrics

## Build

To build the plugin, run the shell script which will:
1. build the docker image
2. run the docker image in a container
3. build the plugin in a container
4. export the JAR file from the container to `build/sonar-dashboard-plugin-VERSION.jar`
5. stop the container
6. delete the container

```
./run.sh
```

## Deployment
Copy the previous JAR file to your SonarQube's `extensions/plugins/` directory, and re-start SonarQube.

## Credits
https://github.com/SonarSource/sonar-custom-plugin-example
