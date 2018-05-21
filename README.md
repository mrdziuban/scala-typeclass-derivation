# Type class derivation

This repo demonstrates generic type class derivation with scala using three methods:

1. A custom macro implementation &mdash; [macro-derivation](macro-derivation)
2. [Magnolia](http://magnolia.work/) &mdash; [magnolia](magnolia)
3. [Shapeless](https://github.com/milessabin/shapeless) &mdash; [shapeless](shapeless)

In the process of pair programming with [Earl St Sauver](https://github.com/estsauver), I was able to learn more about
scala's implicit resolution and prioritization. This helped me reduce compile time and ensure that the generic
derivation is not prioritized over concrete type class instances.

Placing the generic derivation inside the companion object of the type class, as shown in [`ace8f0d6c`], does a couple
important things that we discovered while debugging:

- For both Magnolia and the custom macro, ensures that the macro is not invoked when a concrete instance exists
- Speeds up shapeless compilation by 2x

## Compile time before and after [`ace8f0d6c`]

|Project|Before|After|
|---|---|---|
|macro-derivation|3s|3s|
|magnolia|3s|3s|
|shapeless|23s|11s|

[`ace8f0d6c`]: https://github.com/mrdziuban/scala-typeclass-derivation/commit/ace8f0d6cbcae7c6b9748ce31d06b5dfeab72cb3
