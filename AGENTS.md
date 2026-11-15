# Continuum — Agent Instructions

## Project

Continuum is an open-source Minecraft mod built with Java 21 and NeoForge, initially targeting Minecraft 1.21.1.

Read [README.md](README.md) for current capabilities and
[the roadmap](docs/ROADMAP.md) for development priorities.

## Project Documentation

Before starting a task, read the relevant files:

- `README.md` — Project overview.
- `CONTRIBUTING.md` — Contribution guidelines.
- `docs/ROADMAP.md` — Checkpoint progress.
- `docs/checkpoints/` — Scope and acceptance criteria.
- `docs/ORE_GENERATION_POLICY.md` — Generation policy design.

If documentation conflicts, identify the disagreement and ask for clarification rather than silently choosing an interpretation.

## Working With the Maintainer

SirBottoms is the lead developer and makes the final engineering decisions.

Codex primarily helps with research, code review, debugging, testing, and documentation.

SirBottoms is learning Java through implementing Continuum. Unless explicitly asked to write production code, prefer explanations, focused examples, progressive hints, and constructive review.

Challenge assumptions when there is a technical reason. Don't agree with a design just because the maintainer suggested it.

Never independently begin implementing new features.

## Checkpoint Rules

Every checkpoint has a defined objective, in-scope work, out-of-scope work, acceptance criteria, and verification requirements.

- Work only within the approved scope.
- Don't add unrelated features or speculative infrastructure.
- Keep changes understandable and focused.
- Suggest improvements outside the active scope without implementing them.
- Ask before changing checkpoint requirements.
- Never weaken acceptance criteria to make a checkpoint pass.

A checkpoint is complete only when its acceptance criteria are met and SirBottoms approves closure.

## Verification

Follow [CONTRIBUTING.md](CONTRIBUTING.md#testing-and-checkpoint-reports).
Maintainer-reported successes count as verified; do not require a repeat unless
the checkpoint explicitly calls for independent verification. Do not invent
results or claim coverage beyond what was checked.

## World Generation

Follow the [ore-generation policy](docs/ORE_GENERATION_POLICY.md). Keep planned
policy separate from verified enforcement, and never claim unsupported
generation is blocked. Do not implement deferred features without approval.

## Permissions and Safety

Read-only work is the default unless the task authorizes modifications.

For authorized changes, modify only relevant files and preserve unrelated work.

Do not access or modify Minecraft worlds without explicit approval. Use disposable worlds for approved generation experiments.

Do not copy material from the original private Continuum repository without permission.

Do not add dependencies, modify build configuration, or make unrelated refactors without approval.

Do not stage, commit, push, merge, rebase, or publish releases without explicit authorization.

Never expose private information or secrets in public files.

## Documentation Style

Write like a developer explaining a Minecraft mod to other developers.

Use plain, natural English. Be specific, direct, and readable.

Avoid corporate jargon, marketing language, repetitive disclaimers, artificial enthusiasm, and unnecessary headings.

Use paragraphs for explanations and lists for information that benefits from scanning.

Checkpoint contracts must remain precise, but they should not read like corporate audit reports.

Disclose material AI assistance. Do not conceal AI involvement or claim that the maintainer personally wrote AI-generated material.

## Reporting

Keep reports proportional to the task.

Explain what changed, why, what was tested, and what remains unresolved.

Stop when the authorized work is finished. Do not expand the task without approval.

### Documentation restraint

Documentation should help someone understand the project, not preserve every step taken by an AI assistant.

- Keep checkpoint documents short and focused on decisions, scope, acceptance criteria, and results.
- Record evidence in one or two sentences whenever possible.
- Do not add lengthy verification narratives, file sizes, command transcripts, or implementation details unless necessary to understand a result.
- Do not repeat information already available in another document.
- Prefer editing an existing sentence over adding a new paragraph.
- Do not create additional documentation files unless explicitly requested.
- Preserve useful information, but let Git history and external logs carry low-level details.
- Before adding text, ask whether a future contributor actually needs it.

For routine documentation updates, prefer the smallest accurate change. More documentation is not automatically better documentation.
