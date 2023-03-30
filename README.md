# Jones Java library

![Java 17](https://img.shields.io/static/v1?label=Java&message=17&color=green) 
![Docker support](https://img.shields.io/static/v1?label=Docker%20support&message=yes&color=green)

[![Build](https://github.com/mithenks/jones/actions/workflows/github-actions-build.yml/badge.svg)](https://github.com/mithenks/jones/actions/workflows/github-actions-build.yml) [![Test](https://github.com/mithenks/jones/actions/workflows/github-actions-test.yml/badge.svg)](https://github.com/mithenks/jones/actions/workflows/github-actions-test.yml) [![Package](https://github.com/mithenks/jones/actions/workflows/github-actions-package.yml/badge.svg)](https://github.com/mithenks/jones/actions/workflows/github-actions-package.yml)

Java library to test GitHub CI/CD integration. 

## Build locally

Install [Memento](https://github.com/bmeme/memento) and the [Memento Docker plugin](https://github.com/bmeme/memento-docker).

Create an alias for the `memento docker configure` command:
```bash
alias mdc="memento docker configure"
```

First, create the docker environment for your project:
```bash
mdc docker:create
```

Build and test the library:

```bash
mdc java:build
```

## License

[MIT](https://choosealicense.com/licenses/mit/)

## References

- [BMEME](https://www.bmeme.com)
- [BMEME - Docker Java Kickstarter](https://github.com/bmeme/docker-java-kickstarter)
- [Memento](https://github.com/bmeme/memento)
- [Memento Kickstarter plugin](https://github.com/bmeme/memento-kickstarter)
- [Memento Docker plugin](https://github.com/bmeme/memento-docker)

