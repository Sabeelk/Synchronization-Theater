# Synchronization-Theater
Implementation of a multiple threads synchronized via java monitors, in a theater scenario.

A group of people are waiting outside a lobby to watch a movoie, they will gp into the theater until it is filled then wait outside. Each person and the movies are threads as well as a speaker. Once the movie is done, a speaker is signalled and arrioves to hand out tickets to groups of the viewers. The people browse the theater and then leave and user their tickets to watch the movie again based on a 75% chance. This continues until no one watched the movie again. The scenario requires synchronization.

Run Main.java in order to start the scenario.
