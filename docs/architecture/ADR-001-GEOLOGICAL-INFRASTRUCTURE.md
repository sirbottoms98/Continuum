# ADR-001 — Permanent geological infrastructure

Accepted by SirBottoms, 2026-11-25. Documentation materially assisted by ChatGPT. This decision approves architecture, not implementation, test results or pregeneration.

## Scope and ownership

Continuum is the permanent, technology-independent natural resource foundation for Reclamation and Axiom, initially targeting Minecraft 1.21.1, NeoForge 21.1.267 for integration, and Java 21. Continuum owns industrial ores, raw minerals, geological distribution, natural reservoirs, Frontier and basic prospecting if needed. Existing technology mods and future Axiom modules own machinery, energy networks, refining, manufactured materials and advanced surveying. Avoid mandatory technology-mod dependencies.

## Dimensions and exceptions

The permanent Overworld retains vanilla mining, approved terrain, biomes, vegetation, wildlife, decorative geology and structures. Preserve vanilla ore generation without intentional modification. Explicit Reclamation exceptions are Cobblemon ores and approved variants of vanilla and Cobblemon ores, including Deeper and Darker deepslate and sculk variants. Preserve existing dimension and biome restrictions; do not introduce a variant into a dimension where it did not naturally generate. These are resource-family exceptions, not namespace-wide permission for unrelated industrial deposits. Audit exact registry IDs and generators before enforcement.

All other modded industrial ore, mineral and natural industrial fluid generation belongs in Frontier (proposed ID `continuum:frontier`). Frontier includes vanilla resources, reuses existing biome identities, supports independent terrain settings and future geological expansion, and must not inherit the permanent Overworld's intended border. Access and optional renewal are separate designs; never automatically reset player construction.

Prevent prohibited generation before placement, not by replacing generated blocks. Prefer native configuration, narrow datapack overrides, reusable dimension-aware placement filters, then targeted adapters. Broader hooks require separate justification and review. Use actual dimension identity, not biome tags or namespace alone. Audit conventional features and custom generators, including reservoirs. Unsupported prohibited generators block permanent pregeneration. Preserve approved generators' behavior and test for indirect effects on vanilla generation.

## Resource catalog

Target roughly 50–70 natural feedstocks including reused vanilla resources; not a fixed registration count. Audit existing resources before adding duplicates. Use familiar metal-based IDs and shared NeoForge tags where appropriate, with realistic mineral associations and future recoverable byproducts. Bauxite replaces generic aluminum ore and takes over Crude & Current's natural bauxite generation after compatibility validation.

Initial candidates (registrations, hosts and profiles subject to review):

- Common: zinc (sphalerite), tin (cassiterite), bauxite, lead (galena), nickel (pentlandite), silver-bearing deposits, manganese (pyrolusite), chromium (chromite), magnesium (magnesite).
- Advanced: titanium (ilmenite), tungsten (wolframite), molybdenum (molybdenite), vanadium-bearing deposits, cobalt-bearing sulfides, lithium (spodumene), niobium (columbite), zirconium (zircon), beryllium (beryl), platinum-bearing deposits.
- Specialized: uraninite, monazite, xenotime, graphite, borates, stibnite, barite.
- Industrial minerals: sulfur, halite, fluorite, apatite, limestone, gypsum, potash, talc.
- Fuels: lignite and anthracite; vanilla coal remains mechanically unchanged.
- Expansion candidates: kaolin, feldspar, mica, kyanite, zeolites, diatomite, bentonite, trona, celestite, pollucite, wollastonite, pumice, perlite, corundum, garnet, oil shale and oil sands.

Potential secondary recovery: bauxite (gallium/scandium); zinc sulfides (indium/germanium/cadmium/sulfur); galena (silver/bismuth/sulfur); copper-bearing deposits (selenium/tellurium); pentlandite (cobalt/sulfur); molybdenite (rhenium/sulfur); columbite (tantalum); zircon (hafnium); platinum-bearing deposits (other platinum-group metals); monazite (light rare earths/thorium); xenotime (yttrium/heavy rare earths); associated lithium pegmatite minerals (cesium/rubidium). These are possible constituents, not guaranteed outputs or approved recipes.

## Frontier geology

Use seed-deterministic geological provinces independent of surface biome identity. Favor hydrothermal (zinc/lead/silver/fluorite), igneous (nickel/chromium/cobalt/titanium/platinum), sedimentary (coal/oil/gas/limestone), pegmatite (lithium/beryllium/tin/niobium), evaporite (salt/potash/borates/brine), metamorphic (graphite/talc/mica/garnet), weathered (bauxite/lateritic nickel) and heavy mineral (zircon/monazite/xenotime) associations. These are simplified preferences, not strict exclusions.

Support dispersed common veins, concentrated regional deposits, seams and reservoirs. Use a statistically controlled industrial ore budget: additional species must not automatically increase total ore density. Measure actual ore abundance, cave exposure, local diversity and maximum density, deposit size/spacing, practical accessibility and performance. Province scales, weights and numerical budgets remain provisional. Ensure discovery mechanisms are adequate for essential resources. Results must be deterministic across supported generation orders, restarts and concurrency.

## Natural fluids

Continuum ultimately owns crude oil, natural gas, underground brine and geothermal resources. Minecraft retains water and lava; atmospheric extraction is abstracted by future systems. Separate reservoir ownership from extraction machinery; preserve deposits when optional technology mods are removed. Audit Petrochem, Crude Power and Crude & Current before choosing storage, extraction adapters or composition/depletion models. Shared fluid tags alone do not establish pump compatibility. No refined fuels or industrial chemistry in Continuum.

## Compatibility and engineering

Preserve existing processing systems and approved Almost Unified behavior. Audit Create, Crude & Current, Petrochem, Crude Power, Create Metallurgy, Eternal Ores and other installed generators. Disable only confirmed duplicate natural generators when replacing resources; separately restrict prohibited Overworld generation. Preserve unrelated specialist and environmental features. Verify Terralith, Tectonic, BOP, Cobblemon, Deeper and Darker, and C2ME compatibility.

Keep code minimal, data-driven and modular; use shared registration, native features and small extensions rather than per-material classes or a monolithic simulator. Preserve stable IDs, version permanent generation semantics, document migrations and use reproducible isolated tests. Preserve accepted zinc/tin foundation work; earlier unrestricted Overworld placement is superseded except for disposable baseline testing.

## Roadmap and release gate

Finish the current zinc/tin baseline proof, audit B05 generators, then prioritize Frontier and dimension isolation. Before permanent Overworld pregeneration, verify prohibited ore and reservoir exclusion, unchanged vanilla ore behavior, approved environmental and resource exceptions, functional Frontier access and core resource availability, shared-biome isolation, independent border behavior, dedicated-server and C2ME compatibility, and resolve unsupported generators. Benchmark storage and generation speed and obtain maintainer approval of seed and size. No live-world changes or pregeneration authorized by this ADR.

Regional geology, expanded catalog, and permanent reservoir implementation can follow Overworld readiness if isolation and practical initial Frontier access are verified. Assign checkpoint IDs and implementation contracts separately under the existing repository rules. Architecture approval does not close any checkpoint.
