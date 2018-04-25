# Restolino example

This repo provides a template [Restolino](https://github.com/davidcarboni/restolino) project to demonstrate the six features of the framework.

## Six features?!
Yes. 

Restolino is *"brutally opinionated"* about your design.

## Feature examples
  * **Api**: an annotation that marks a class as a route. The class name will be the route name (`MyClass` -> `/myclass`). Class methods can be annotated with `@GET`, `@POST`, `@PUT`, etc. (`javax.ws.rs.*`).
  * **Home**: allows you to handle `GET /` (an empty route name). The [Restolino readme](https://github.com/davidcarboni/restolino/blob/master/README.md) explains why only `GET` is supported.
  * **ServerError**: allows you to gracefully handle exceptions thrown by your `Api` classes.
  * **NotFound**: helps you handle requests that aren't mapped to an `API` or to static content.
  * **Filter**: this gives you (intentionally) limited ability to see requests before they are handled. It allows you to decide whether or not to continue handling the request (e.g. it could be used for [jwt](jwt.io) handling).
  * **Startup**: allows you to do one-time initialisation before your service starts accepting http requests.

## Default features

Restolino provides default handlers to meet some basic needs and helpful use cases. With the exception of self-documentation, restolino configuration and redirect (where there are examples in the `bonus` package) there aren't examples for these. It's worth mentioning them here as they'll be configured for you if you don't provide your own implementations. 
 * **DefaultApiDocumentation**: This uses the information gathered by the `ApiHandler` class to produce Json that documents the configured routes, methods and inbound/outbound message types. It's relatively basic, but provides a useful view. This gets configured on the `/` route.
 * **DefaultServerError**: A default handler for exceptions thrown by routes.
 * **DefaultNotFound**: A default handler for requests that aren't mapped.
 * **DefaultIndexRedirect**: A handler you can configure to redirect requests to `/`, e.g. to an `index.html`.
 * **DefaultRestolinoConfiguration**: As an alternative to `DefaultApiDocumentation`, you can expose the resolved configuration values on `/`.

## Start with why
Restolino has a crystal-clear design philosopy: **simplicity and speed**. Simplicity means *"have the courage and discipline to do less"*. Speed means *"your success is limited by the length of your longest feedback loop"*. Simplicity breeds speed and speed needs simplicity.

The design philosophy is put into practice by these two pillars:
 * **Make complicatedness hard**: complicatedness is the number one cause of project failure *([source: me](https://carb.onl/complicated))*. Restolino works to make it more and more difficult for you to fail. If you don't fight the design constraints it puts on you, you'll hopefully produce better software. Better is (mostly) defined as *"faster to build, clearer to change, and easier to retire"*. Reducing friction from accidental complicatedness - externalities that aren't core to what you're creating.
 * **Shorten feedback cycles**: In the words of the authors of [Accelerate](https://www.amazon.co.uk/Accelerate-Software-Performing-Technology-Organizations/dp/1942788339/), *"Optimise for speed, not cost"*. It's a massive statement in five words. Much of the Java world doesn't realise it's dying of slowness. Slow pace is very expensive. Restolino is about bringing *code/refresh/code/refresh* iteration speed to Java. A language or framework with a cycle time not counted in seconds, on one hand, is headed for the graveyard of software history, no matter how much titanic momentum there is behind it.

If you don't understantd why developers are leaving Java and the JVM in droves for languages like Javascript, Python and Go (or not bothering to even consider Java as a serious language choice in the first place) look no further than complicatedness and cycle time.

Software that's not clear to understand, quick to change and ultimately straightforward to rewrite or retire is legacy.

*If you want to actually build things, pick technology that's smart enough to stay out of your way.*
