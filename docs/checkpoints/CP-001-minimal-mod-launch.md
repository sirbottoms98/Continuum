# CP-001 — Minimal Mod Launch

**Status: PASS** · [Master tracker](../ROADMAP.md)

## Objective

Show that the minimal Continuum mod builds and loads in Minecraft 1.21.1 using
NeoForge and Java 21, before feature work begins.

## In scope

- Development-client launch to the main menu.
- Continuum recognition in the mod list and initialization/startup logging.
- Basic build verification and fixes needed to satisfy these launch criteria.

## Out of scope

- Gameplay, custom dimensions, ore generation, new UI, and configuration systems.
- World-generation or world-integrity features, including enforcement of the [planned ore-generation policy](../ORE_GENERATION_POLICY.md).
- Opening existing Minecraft worlds or creating/joining test worlds; main-menu verification is sufficient for this checkpoint.
- Support for additional Minecraft versions.

## Acceptance criteria

- [x] A basic build succeeds for the target environment.
- [x] The development client reaches the Minecraft 1.21.1 main menu.
- [x] Continuum appears in the mod list with the expected identity.
- [x] Continuum initialization completes, supported by startup logs, without mod-loading errors.

## Verification

Use Minecraft 1.21.1, NeoForge, and Java 21. The current configuration selects
NeoForge 21.1.235; record the versions actually used. Record any launch failure
attributable to Continuum and the relevant startup-log details. If the cause is
unclear, record that uncertainty.

1. Run `./gradlew build` and record the outcome.
2. Run `./gradlew runClient` and confirm that Minecraft reaches the main menu.
3. Open the mod list and confirm Continuum appears with the expected identity.
4. Inspect startup logs for Continuum initialization and mod-loading errors; record the observations.
5. Close the client without creating, joining, or opening a world.

## Completion evidence

Verified environment: Minecraft 1.21.1, NeoForge 21.1.235, and Java 21.
Maintainer-performed tests are recorded as verified for their reported scope.

| Reference | Check and outcome | Status |
| --- | --- | --- |
| E-001 | `./gradlew build` succeeded with exit code 0. | PASS — Codex |
| E-002 | Minecraft 1.21.1 reached the main menu. | PASS — SirBottoms |
| E-003 | Continuum appeared in the mod list. | PASS — SirBottoms |
| E-004 | Startup log identified `Continuum 0.1.0 (continuum)` and contained `Continuum initialized`. NeoForge 21.1.235 and Java 21 were confirmed. | PASS — SirBottoms; log reviewed by Codex |
| E-005 | No Continuum-attributable mod-loading errors were observed. | PASS — SirBottoms |
| E-006 | Client exited normally without opening a world. | PASS — SirBottoms |

The local startup log, `run/client/logs/latest.log`, is dated 2026-11-14.
Codex reviewed the version and initialization entries without copying the raw
log into the repository. The build had no test sources, and compilation and
resource processing were up-to-date. Runtime verification covered the main
menu, mod list, startup logs, and normal exit; gameplay and worldgen were not
tested. Codex assisted with recording these results in the documentation.

## Exit decision

Status: **PASS**. All four acceptance criteria are satisfied by E-001–E-006.
SirBottoms completed the launch test and approved CP-001 closure. This closes
the minimal-build-and-launch checkpoint only.
