## run genSources

```log

> Task :common:validateAccessWidener NO-SOURCE
> Task :forge:validateAccessWidener NO-SOURCE
> Task :fabric:validateAccessWidener NO-SOURCE

> Task :common:genSourcesWithCfr
Decompile cache stats: 0 hits, 4786 misses

> Task :common:genSourcesWithCfr FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':common:genSourcesWithCfr'.
> class net.fabricmc.loom.util.gradle.WorkerDaemonClientsManagerHelper tried to access method 'void org.gradle.workers.internal.WorkerDaemonClientsManager.selectIdleClientsToStop(org.gradle.api.Transformer)' (net.fabricmc.loom.util.gradle.WorkerDaemonClientsManagerHelper is in unnamed module of loader org.gradle.internal.classloader.VisitableURLClassLoader$InstrumentingVisitableURLClassLoader @784615cf; org.gradle.workers.internal.WorkerDaemonClientsManager is in unnamed module of loader org.gradle.initialization.MixInLegacyTypesClassLoader @1df8da7a)

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 2m 4s

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.10.2/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
1 actionable task: 1 executed
```