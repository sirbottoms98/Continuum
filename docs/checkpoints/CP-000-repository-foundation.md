# CP-000 — Repository Foundation

**Status: IN PROGRESS** · [Master tracker](../ROADMAP.md)

## Objective

Establish a clean public development repository for Continuum, independent of
the private prototype.

## In scope

- Public repository creation and an independent history.
- NeoForge 1.21.1 starter project, mod identity, and metadata configuration.
- README, contribution guidelines, and AI-assistance transparency policy.
- Licensing selection and documentation.
- Initial development workflow, roadmap, checkpoint contracts, and documentation of planned behavior.

## Out of scope

- Gameplay features, custom dimensions, and travel.
- Implementing ore generation, geological systems, or world-integrity enforcement.
- Compatibility with additional Minecraft versions.

## Acceptance criteria

- [x] Public repository exists with a clean, independent history.
- [ ] Project identity consistently uses Continuum.
- [x] Gradle configuration, Java compilation, and resource processing succeed, with reviewable evidence. See E-001–E-003.
- [ ] README and contribution guidelines accurately describe the current project and AI-assistance policy.
- [ ] Roadmap and checkpoint contracts distinguish planned work from implemented functionality and identify evidence provenance.
- [x] Licensing and contribution terms are finalized before external code contributions are accepted.
- [ ] No private prototype files or sensitive material are published.

## Verification

Compare [LICENSE](../../LICENSE) with GNU's [LGPLv3](https://www.gnu.org/licenses/lgpl-3.0.txt)
and [GPLv3](https://www.gnu.org/licenses/gpl-3.0.txt) texts, and confirm the
[LGPL-3.0-only identity](https://spdx.org/licenses/LGPL-3.0-only.html) against SPDX.
Confirm metadata and contribution terms match the selected license; check the
README disclaimer against the [Minecraft Usage Guidelines](https://www.minecraft.net/en-us/usage-guidelines).
Review project identity, documentation accuracy, and public-repository contents against the remaining acceptance criteria.
Confirm template attribution is unchanged, check links, and run `git diff --check`.

## Completion evidence

| Reference | Check and outcome | Status |
| --- | --- | --- |
| E-001 | Gradle configuration succeeded. | PASS — SirBottoms |
| E-002 | Java compilation succeeded. | PASS — SirBottoms |
| E-003 | Resource processing succeeded. | PASS — SirBottoms |
| E-004 | 2026-11-14 initial documentation migration; checked required sections, statuses, relative links, and permitted changes. | PASS — Codex documentation and scope checks |
| E-005 | 2026-11-14 documentation revisions passed consistency, link, whitespace, and scope checks. | PASS — Codex documentation and scope checks |
| E-006 | GitHub and local history review confirmed a public repository with independent NeoForge MDK starter history at commit `1d2964470895212d60b745f7f025af49ba61ddcc`. | PASS — Codex repository/history review |
| E-007 | LGPL-3.0-only selected for Continuum's original code; third-party terms unchanged. | PASS — SirBottoms license decision |
| E-008 | LICENSE matches GNU's LGPLv3 and GPLv3 texts exactly; metadata, contribution terms, disclaimer, links, whitespace, and scope checks passed. Template attribution preserved; Codex assisted with documentation. | PASS — Codex licensing documentation checks |

## Exit decision

Status: **IN PROGRESS**.

The license decision is recorded, but CP-000 has not been closed. Remaining
acceptance checks and maintainer review are still open.
