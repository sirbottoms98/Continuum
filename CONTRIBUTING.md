# Contributing to Continuum

Continuum is still building its foundation. Bug reports, design discussions,
documentation feedback, feature suggestions, and focused code contributions
are welcome.

Contributions to Continuum's original code must be offered under
[LGPL-3.0-only](LICENSE). You must have the rights to submit your contribution,
and any third-party material you include must have compatible license terms.
Keep its required license notices and attribution. See the
[licensing information](README.md#license) for the project and template terms.

## Keep work focused

Start with the [roadmap](docs/ROADMAP.md) and the relevant checkpoint contract.
Work on an approved checkpoint, a documented bug, or a separately discussed
improvement. Once work begins, scope stays fixed unless SirBottoms approves a
revision; small changes are easier to understand, test, and review.

Keep Java classes focused and readable. Explain decisions that the code cannot
explain on its own, test meaningful behavior, and preserve the checkpoint's
target Minecraft and NeoForge versions. Report errors and failed checks rather
than hiding them to make a checkpoint pass.

## Testing and checkpoint reports

Maintainer-reported command results, automated tests, and manual Minecraft tests
count as verified evidence. Codex does not need to repeat them. Record what was
tested, who performed or reported it, the outcome, and any limitations. Include
commands, observations, versions, dates, revisions, or logs when known; do not invent
missing details or imply that a test covered more than it did.

Use E-001, E-002, and so on for evidence entries within each checkpoint. Give
each entry its own status and contributor, for example `PASS — SirBottoms`.

A successful compile verifies compilation, not runtime behavior. A launch does
not establish ore enforcement. A manual test verifies the behavior actually
observed. A checkpoint can PASS on maintainer-performed verification
when every acceptance criterion is met and SirBottoms approves closure. A passed
evidence entry does not close the whole checkpoint.

## Proposing worldgen work

Read the [ore-generation policy](docs/ORE_GENERATION_POLICY.md)
before proposing generation work.

Explain how a proposal finds and classifies generators, applies dimension rules,
and reports anything it cannot control.

Changes to dimensions, terrain, world data, registries, or migrations can affect
worlds people care about. Use disposable worlds for authorized generation
experiments. Only describe protection or enforcement that tests have shown to
work.

## Reviews and AI assistance

For a pull request, explain the problem and change, link the issue or
checkpoint, and report testing and limitations. Keep unrelated changes separate.
SirBottoms reviews work before merging and makes the final decisions.

AI-assisted work follows the same technical standards as other contributions.
Disclose material help with code, tests, documentation, or design, and explain
how the tools helped. Review and understand what you submit. An AI explanation
is not a test result; maintainer-performed testing remains valid evidence.
Codex materially assisted with this documentation revision.

Respect licenses and keep private or confidential information out of
submissions. Treat contributors respectfully, and explain disagreements with
examples, results, and the project's goals.
