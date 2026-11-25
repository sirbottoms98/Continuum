# Ore-generation policy

[ADR-001](architecture/ADR-001-GEOLOGICAL-INFRASTRUCTURE.md) is the accepted
architecture. Enforcement is planned, not verified.

## Rules

For Reclamation, preserve vanilla ore generation and approved Cobblemon ores,
including approved vanilla and Cobblemon ore variants from Deeper and Darker
(deepslate and sculk). Preserve their original dimension and biome restrictions.
Audit exact resource IDs and generators; these are not blanket mod exemptions.

Other industrial ores and natural industrial fluid deposits belong in Frontier.
Preserve approved terrain, decorative geology, vegetation, wildlife and
structures. Prevent prohibited placement rather than cleaning up generated
blocks. Frontier shares original biome identities and includes vanilla resources.

## Discovery and enforcement

Discover candidate generators by registry identifiers, configuration and actual
generation behavior. Namespace alone cannot establish resource classification.
Use actual dimension identity, not shared biome membership. Prefer native
configuration, narrow datapack overrides, dimension-aware placement filters,
and targeted adapters for unsupported paths, in that order. Broader hooks
require separate review.

Audit custom generators and reservoirs as well as native placed features.
Disabling a duplicate provider and supplying a replacement are separate
behaviors to verify. Preserve approved recipes and generator behavior.

## Verification

Test in disposable worlds, including shared biomes, dedicated servers and C2ME.
Compare actual ore distributions and cave exposure with a baseline; verify
vanilla behavior, approved exceptions, prohibited resource exclusion and
Frontier availability. Report unsupported generation explicitly; unresolved
prohibited generators block permanent pregeneration.

See ADR-001 for geological ownership, density constraints and the release gate.
Follow the [roadmap](ROADMAP.md) and approved checkpoint contracts.
