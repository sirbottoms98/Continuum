# Continuum

Continuum is a configurable worldgen gatekeeper for Minecraft. Its first goal
is to preserve Minecraft's original generation while blocking disallowed
mod-added ore generation in the permanent Overworld. Allowed generators should
keep their original behavior.

> NOT AN OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.

## Current status

The project is at the repository-foundation stage, targeting **Minecraft 1.21.1,
NeoForge, and Java 21**. Ore enforcement and the other features described here
are planned, not implemented. Support for other Minecraft versions comes later.

The [roadmap](docs/ROADMAP.md) records progress and test results. CP-000
(Repository Foundation) remains **IN PROGRESS** pending final repository checks
and review.
CP-001 (Minimal Mod Launch) is **PASS**, with maintainer-approved closure.

The minimal mod foundation builds and launches to Minecraft's main menu. See
[CP-001's results](docs/checkpoints/CP-001-minimal-mod-launch.md#completion-evidence)
for the verified build and launch checks.

## Architecture and development direction

The [accepted geological architecture](docs/architecture/ADR-001-GEOLOGICAL-INFRASTRUCTURE.md) defines a permanent Overworld with vanilla and approved resource exceptions, and an expandable Frontier for industrial resources. Continuum will own natural geological resources independently of technology mods.

The [ore-generation policy](docs/ORE_GENERATION_POLICY.md) describes the planned isolation rules. These capabilities are not yet verified on this branch.

## Working together

Read [CONTRIBUTING.md](CONTRIBUTING.md) and the relevant checkpoint before
proposing work. Bug reports, design discussions, documentation feedback, and
feature suggestions are welcome.

SirBottoms leads development and reviews contributions. The project uses AI
assistance, including ChatGPT and Codex, under the
[contribution and disclosure policy](CONTRIBUTING.md#reviews-and-ai-assistance).
Codex materially assisted with this documentation revision.

## License

Continuum's original code is licensed under **LGPL-3.0-only**: the GNU Lesser
General Public License, version 3 only. [LICENSE](LICENSE) contains the complete,
unchanged [LGPLv3 text](https://www.gnu.org/licenses/lgpl-3.0.txt) and the
[GPLv3 terms](https://www.gnu.org/licenses/gpl-3.0.txt) it incorporates.

The NeoForge starter template keeps its existing MIT attribution in
[TEMPLATE_LICENSE.txt](TEMPLATE_LICENSE.txt). Minecraft, NeoForge, and other
mods keep their own licenses and terms. Their code and assets are not covered
by Continuum's license.

See the official [Minecraft Usage Guidelines](https://www.minecraft.net/en-us/usage-guidelines)
for rules about Minecraft names, branding, and assets.
