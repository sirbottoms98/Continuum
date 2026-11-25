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

Follow [ADR-001](architecture/ADR-001-GEOLOGICAL-INFRASTRUCTURE.md) and the
[ore-generation policy](ORE_GENERATION_POLICY.md). The accepted development
order is:

1. Complete existing foundation and zinc/tin baseline validation.
2. Audit B05 industrial generators and approved resource exceptions.
3. Establish Frontier and dimension-specific resource isolation.
4. Validate permanent Overworld readiness and obtain pregeneration approval.
5. Expand Frontier regional geology, solid resources and fluid reservoirs.
6. Develop Axiom integration as needed.

These are architectural priorities, not newly opened checkpoints. Assign
checkpoint IDs and approve implementation contracts separately. Existing
remote checkpoint status is unchanged; reconcile local checkpoint work before
updating this tracker.
