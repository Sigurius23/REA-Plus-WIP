---
name: app-dark-patterns
description: Use when reverse-engineering mobile apps to investigate hidden monetization, gameplay, retention, data collection, per-user treatment or deceptive feedback through code and server traffic.
---

# App Dark Patterns

Apply this workflow to the chosen app and its business model: games, social platforms, shopping, dating, fitness or subscription services. Unveil hidden rules that change the meaning of a user's **choice, skill, luck, progress, rewards, price or apparent feedback**. The user wants discoveries that make someone understand an experience differently: apparent improvement, bad luck, a meaningful choice or a personal result may depend on an unexpected rule. Particularly interesting are mechanisms that could increase spending, ad viewing or continued use. Hidden assistance can be as revealing as punishment.

Prioritize depth and a compelling consequence. Pursue consequential leads deeply. Give your strongest useful hypotheses about profit and psychology, with recovered rules, observations and best guesses recognizable. Speculation should generate further investigation.

## Choose a worthwhile reveal

Explain a concrete situation, the hidden rule and what changes for the person. Use the [annotated examples](references/inspiration.md) when selecting leads or reconsidering a weak result. High-value patterns include outcomes decided before a choice; rewards or difficulty changing with history; identical labels concealing different rules; personal-looking feedback generated independently of what it seems to measure; and collected information driving an intervention.

For a profit-focused brief, follow every headline to its **financial “so what”: hidden rule → changed cost, incentive or belief → extra ad, purchase, renewal or other specific commercial opportunity**. “It keeps you engaged” needs the next step: what becomes harder, runs out sooner, feels more valuable, or brings you back to a monetized screen? Give the strongest useful business hypothesis and distinguish it from the recovered rule; private conversion analytics are not required to explain a plausible incentive. Use a concrete comparison where possible. Let the missing economic link guide deeper investigation; technical novelty alone belongs in supporting notes.

Revealing names, API fields, data collectors and experiment catalogs are valuable entry points. Follow them to their consequence; preserve interesting unresolved leads with a hypothesis and next test. Sensitive collection, transmission or consent behavior can itself be consequential. A visible default or standalone fixed “95% prefer” badge does not supply the hidden-rule reveal The user wants.

## Investigate and iterate

1. **Establish the app and access.** Verify identity, platform/build and existing artifacts. Read [platform/authentication](references/platform-auth.md) for acquisition, tooling, account coverage and research-account authorization. Use its email/password workflow to handle routine email verification automatically. Identify early which questions need login, history, store access or a particular assignment.
2. **Map candidates and learn the situation.** Brainstorm across gameplay, rewards, ads, upsells, pricing, retention, privacy, frontend truthfulness and different user versions. Learn how an ordinary person reaches each relevant screen or mechanic; online walkthroughs and short screen recordings can help. Follow [context and footage](references/output.md#scenario-context-and-footage) and use [investigation methods](references/investigation.md) to choose consequential open questions.
3. **Trace the rule and surrounding loop.** Recover input → assignment → gates/calculation → consumer → action/UI. Investigate what brings users there, what happens next, and what resets. Read adjacent and opposite branches, defaults and failure paths.
4. **Test the missing link.** Choose profiles and comparisons around a specific question. Compare relevant histories/states, pair requests/responses and capture actual outcomes. [Evidence and experiments](references/evidence.md) distinguish observations, implemented rules, correlations and hypotheses.
5. **Develop the explanation.** Connect the changed user experience to a specific financial benefit for the company and explain why in everyday language. Investigate the next monetizable step, alternatives and new leads. Keep worthwhile inactive branches in the queue with their activation question.
6. **Outline the story, then produce assets.** Map the user's situation, rule, concrete comparison, best-guess incentive and evidence to a short outline. Use gaps to choose further work. Follow [report/video output](references/output.md) before rendering the full library.

When a lead is blocked, identify the exact missing link and continue other useful hidden-mechanism work. Preserve platform/account scope when changing routes. Keep checkpoints and concise progress updates during long investigations.

## Deliver and finish

Explain everything for a fourteen-year-old who has never used the app: **the situation → what you do and expect → the hidden rule → what changes for you → my best guess why → how we know**. Set up each example's scenario and needed mechanics; a general app introduction alone is insufficient. Rank the strongest surprising consequences; include promising speculative leads without presenting them as measured outcomes. Use concrete before/after or user comparisons. Keep material conditions beside claims and detailed bookkeeping in supporting notes.

Deliver the ranked report, evidence/lead ledger, reproducible data, story outline and editing handoff. Include code sparingly in the report and the fuller library in a polished localhost gallery. Read [snippet tools](references/snippets.md): short complete blocks, syntax colors, filename comments, no row highlighting, explanations outside images, longer originals preserved. Verify the gallery and give its working URL with the presentation server left running.

Finish when the strongest leads have received useful accessible follow-ups, important contradictions are resolved, remaining gaps have specific next tests, and report/assets are verified. A large source inventory or successful renderer check does not establish a worthwhile discovery.
