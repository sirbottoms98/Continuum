# Planned Ore-Generation Policy

Continuum is a configurable worldgen gatekeeper. The first functional goal is
to block disallowed mod-added ore generation in the permanent Overworld while
preserving Minecraft's original generation. Allowed generators should retain
their original behavior. This is planned behavior; see the
[roadmap](ROADMAP.md) for current status and evidence.

## Start with ore enforcement

Installing a mod should not automatically add its ores to the permanent
Overworld. The default configuration should restrict modded ore generation,
with explicit configuration exceptions. Allowing a generator means letting it
run normally, not replacing its deposits or changing its distribution.

The planned configuration should allow exceptions by dimension, mod, and
generation category, with finer controls for individual features. Category
rules could allow structures while blocking ores. Ores come first; structures
and other worldgen categories follow. The goal is broad control without a patch
for every mod, though some generation paths may need specific integration.

Mod-added generation remains subject to the policy even when explicitly
allowed in the Overworld. Report unsupported or uncontrolled generation and the
limits of any tested enforcement.

## Namespace discovery: a starting hypothesis

SirBottoms proposes inspecting the namespaced `ResourceLocation` identifiers
commonly used by worldgen features. Investigate
`namespace != "minecraft"` as a way to discover candidates for modded
generation control. This is an untested hypothesis, not a universal solution.

Discovery finds candidates; classification determines whether they generate
ores and how they relate to the policy. A resource namespace does not prove
which mod or datapack introduced a feature or which generator places an ore.
Not every non-`minecraft` placed feature generates ore. Mods may modify vanilla
features or use custom generation code, so filtering names can miss relevant
generation paths as well as include unrelated ones.

Testing needs to establish what discovery includes, what it misses, and how
ores can be distinguished from other worldgen. Create zinc is an initial test
case for the shared policy. It should also be possible to test generators from
Mekanism or Matter Overdrive without redesigning the core policy. These
examples are not a compatibility list.

## Enforce rules in the right dimension

Finding an ore generator does not show how to control it in a particular
dimension. Removing a feature from a shared biome definition can affect both
the Overworld and a future Frontier dimension. Removing every discovered
candidate could also interfere with structures or other unrelated generation.

Enforcement tests need to show that disallowed ore generation is blocked in
the permanent Overworld, vanilla generation is preserved, and allowed
generators keep their original behavior. Tests also need to account for shared
biomes and dimension rules. Maintainer-reported successful tests count as
verified evidence under the [verification rules](ROADMAP.md#verification-and-reporting);
record what worked and any remaining gaps.

Discovery, classification, and dimension-aware enforcement are separate
questions. No enforcement mechanism has been chosen by this document.

## Deferred work and open questions

Overworld ore blocking must work without Frontier routing or custom geological
generation. Frontier is a later, configurable dimension for renewable
exploration and resource gathering. Its renewal behavior is still undecided.
The longer-term default would generate supported modded minerals through
Continuum there, with configuration exceptions.

Later options could include original mod generation, conventional clusters,
or realistic geology where supported. Geological deposits would follow rock
formations, depth, and other conditions. Shared minerals and overlapping
generators need clear rules to avoid unintended duplicate generation.
Disabling an original generator and supplying a replacement would be separate
behaviors to verify.

The immediate design questions are how to classify ores reliably, distinguish
mod-added generation from Minecraft's original generation, apply rules without
unwanted effects across dimensions, and report incomplete control. Permission
conflicts and the response to an uncontrolled generator also need decisions.
Frontier routing, generation-method combinations, and geological replacement
belong to later checkpoints.
