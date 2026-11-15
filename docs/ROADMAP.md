# Continuum Roadmap

This is the master checkpoint tracker. Use the
[template](checkpoints/TEMPLATE.md) for approved checkpoint contracts.

| ID | Name | Status |
| --- | --- | --- |
| [CP-000](checkpoints/CP-000-repository-foundation.md) | Repository Foundation | IN PROGRESS |
| [CP-001](checkpoints/CP-001-minimal-mod-launch.md) | Minimal Mod Launch | PASS |

Results: [CP-000 evidence](checkpoints/CP-000-repository-foundation.md#completion-evidence)
and [CP-001 evidence](checkpoints/CP-001-minimal-mod-launch.md#completion-evidence).

## Status and scope

| Status | Meaning |
| --- | --- |
| NOT STARTED | Checkpoint work has not begun. |
| IN PROGRESS | Work has begun, with acceptance criteria still open. |
| BLOCKED | A dependency or unresolved decision prevents further progress. |
| PASS | Every acceptance criterion is met and SirBottoms has approved closure. |
| FAIL | A check failed; record the failure and what needs to change. |

Update status here and in the contract together.

## Verification and reporting

Follow [CONTRIBUTING.md](../CONTRIBUTING.md#testing-and-checkpoint-reports) for
verification and evidence reporting. Keep results and exit decisions in the
checkpoint contract.

## Development order

After the foundation and minimal-launch checkpoints, the first functional goal
is reliable Overworld ore enforcement. See the
[ore-generation policy](ORE_GENERATION_POLICY.md) for rules and design limits.
Create zinc is an initial test case; Mekanism or Oritech are candidates for
testing the same core policy.

Structures and other worldgen categories come afterward. Frontier routing,
Continuum-owned deposits, geology, and world-integrity systems are deferred.
These provisional topics are **NOT STARTED**. They have no assigned checkpoint
IDs or approved implementation contracts yet.

Next, finish CP-000's remaining repository checks and maintainer closure review.
