tache-tastic
============

Development pattern to run the same mustache templates on the client (mustache.js) and server (mustache.java).

## Todos
- test Template inheritance is supported by this implementation, see https://github.com/mustache/spec/issues/38 (eg. {{<super}}{{$content}}...{{/content}}{{/super}})
- test If you change description to return a Callable instead it will automatically be executed in a separate thread if you have provided an ExecutorService when you created your MustacheFactory.
- Setup spring mvc with mustache.java renders
- Setup backbone.js using mustache templates