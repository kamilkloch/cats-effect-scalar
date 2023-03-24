# Cats-Effect - Supervisor, Dispatcher, IOLocal

Sources for the following talk: https://kamilkloch.github.io/cats-effect-scalar

## Building

Code in `core` module is accessible from within the slides

Raw slides are in `slides/mdoc/index.html`

### How to compile slides

run `sbt slides/mdoc` to compile slides using [mdoc][mdoc].
You can then view the slides by opening `docs/index.html` in your browser.

### How to publish slides with github

When you are ready push the repository to github (including the compiled slides in `docs`),
go to project settings -> GitHub Pages and select `master branch /docs folder` for
the source of github pages.

[mdoc]: https://scalameta.org/mdoc/