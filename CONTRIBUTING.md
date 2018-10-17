# Contributing to the MultiApps

## Did you find a bug?
* Check if the bug has already been reported and has an open [Issue](https://github.com/cloudfoundry-incubator/multiapps/issues).

* If there is none, create one by using the provided [Issue Template](https://github.com/cloudfoundry-incubator/multiapps/issues/new/choose) for bugs.

* Try to be as detailed as possible when describing the bug. Every bit of information helps!

## Do you have a question or need support?
If you need any support or have any questions regarding the project, you can drop us a message on [Slack](https://cloudfoundry.slack.com/?redir=%2Fmessages%2Fmultiapps-dev) or open an [Issue](https://github.com/cloudfoundry-incubator/multiapps/issues) and we shall get back to you.

## Do you want to contribute to the code base?

### Fork the project
* To develop your contribution to the project, first [fork](https://help.github.com/articles/fork-a-repo/) this repository in your own github account. 

* When developing make sure to keep your fork up to date with the origin's master branch or the release branch you want to contribute a fix to.

### How to build and package?
Execute `mvn clean install` in the project's root folder.

### Testing
* To ensure no regressions to previous functionality execute `mvn clean test` in the project's root folder to run all the unit tests.

* If you are developing new functionality make sure to add tests covering the new scenarios where applicable!

### Formatting
Having the same style of formatting across the project helps a lot with readability.

#### Eclipse
Our team is developing on the [Eclipse](http://www.eclipse.org/) IDE and we have a handy formatter located at `/ide/eclipse-formatter.xml`. In Eclipse you can import the formatter from `Window > Preferences > Java > Code Style > Formatter`

#### IntelliJ
If you're using IntelliJ you can try the [EclipseCodeFormatter](https://github.com/krasa/EclipseCodeFormatter) plugin.

#### NetBeans
NetBeans also provides such a plugin. Just search for `eclipse formatter` in the [PluginPortal](http://plugins.netbeans.org/PluginPortal/).

## Creating a pull request
When creating a pull request please use the provided template. Don't forget to link the [Issue](https://github.com/cloudfoundry-incubator/multiapps-controller/issues) if there is one related to your pull request!