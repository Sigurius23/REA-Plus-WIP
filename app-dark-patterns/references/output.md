# Report and editing handoff

## Story outline before the full library

As a worthwhile mechanism emerges, draft a short outline in investigation notes. Use it to choose follow-up work; save the selected version as `STORY-OUTLINE.md` before bulk rendering. This is a working deliverable, not an approval checkpoint.

| Beat | What the reader/viewer needs |
|---|---|
| Player situation | What people do, what counts as winning/progress, and how they reach this choice or reward. |
| Hidden rule | The unexpected decision in one ordinary sentence, with its important condition. |
| Concrete comparison | Before/after numbers, two player experiences or a choice/result sequence. |
| Financial “so what” and best guess why | What becomes more costly, harder to earn, sooner depleted or more tempting; the specific extra ad, top-up, subscription or renewal it could produce, and why. |
| Evidence/scene | The source rule or request/response, actual app scene, and next test if a link is missing. |

Build around related discoveries: early generosity, changed odds and retry opportunities can explain one loop. Separate unrelated findings instead of implying a connection. Use conditional outlines for promising unobserved branches. Update the outline as evidence changes.

## Reader and report

Write for a fourteen-year-old who has never used the app or read code. Open with a short explanation of the normal player journey and monetization, then the strongest discoveries in one sentence each. Introduce coins, retries, prizes or Likes before their hidden rules.

Set up **each finding and each comparison**, including examples inside a finding. In two or three short sentences explain what the person is trying to do, what they have just done, what the screen offers next, and what success/failure or refusal would mean. Define the relevant currency, reward, episode lock, chest tier or other mechanic before using it. Explain any cost or prior effort needed to understand the stakes. A reader should be able to picture the moment even if they skipped the app introduction. Use only mechanics supported for that scene, and label hypothetical examples.

Give each main finding a plain headline and four short pieces, in natural paragraphs:

1. **What the app does:** establish the situation and concrete sequence, explain the expected result, then reveal the unexpected rule.
2. **What happens to you:** the practical change to chances, rewards, choices, time, spending or apparent progress. Use a small comparison.
3. **So what—how this could make the company more money:** name the next ad, top-up, subscription, renewal or other concrete commercial opportunity. Explain how the rule changes the person's need or incentive to take it, with everyday psychology. Give the strongest useful hypothesis and keep it recognizable as an interpretation.
4. **How we know:** the source/test, the account or condition it applies to, and the important missing measurement. For example: “The code can do this in one experiment; our account was in Control.” Keep this short; detailed methods belong in notes.

Rank by surprise and potential consequence of the hidden rule. Preserve promising hypotheses as leads with next tests. A missing motive model need not erase a compelling implementation finding. Readers should understand the result before opening code.

Give each headline a copy-ready sentence that finishes: “This could make the company more money because…” Follow the actual scene to that opportunity; “more engagement,” “personalization” and “more data” need a concrete next step. Quantify the changed effort, usable balance, number of ad rewards, purchase timing or offered payment path when supported. A simple conditional calculation is welcome; mark assumptions and keep it separate from measured purchases or revenue. Example: “Spending paid coins first can leave free rewards to expire, so you may need another top-up sooner.” Keep technical findings with no useful economic connection in supporting notes for a profit-focused report.

Visible price preselection and standalone hard-coded “95% prefer” badges are low-value for this brief. Changing personal-looking feedback can be strong when its calculation differs from the measurement the display suggests. Code inventories, SDK capabilities and experiment counts need a concrete consequence or clearly framed open question.

Explain technical terms through their role in this app. Keep addresses, hashes, long inventories, logs and classifications in evidence files. Put material conditions beside claims: implemented/observed, active/off, preserved base reward, reset boundaries and missing outcome measurements. Use short paragraphs and sensible rounding; retain exact values in data.

For user variants, show what comparable players actually received. Explain catalog entries, delivered combinations and effective content counts separately; state tested samples and observed minima. Different move limits establish different rules; relative difficulty, assignment randomness and monetization targeting remain separate questions. A shared statistic needs its population/calculation before its accuracy can be judged.

## Scenario context and footage

Online app walkthroughs, gameplay videos and relevant screen recordings are welcome for understanding and illustrating the situation. Use them to learn the steps surrounding a mechanism and choose useful scenes. Attribute that context and establish the hidden rule through the investigation's code, configuration, requests/responses and measured behavior.

Capture relevant parts of authorized app sessions and trim recordings into short, focused clips when useful. For online footage, use permitted access and available media tools; preserve the source URL, attribution and start/end timecodes. Prefer a full-screen setup followed by the revealing action or detail, so an unfamiliar viewer understands what they are seeing. Respect the tool's media-access/display rules; when a clip cannot be acquired, provide its link, precise timecodes and a clear shot request.

For each scene, record the app/build or visible differences when known, account/state if relevant, and whether it is our natural observation, a staged/local demonstration, or third-party illustration. Match the footage to the narrated scenario and retain material conditions. Third-party clips can explain a mechanic; proving that our tested account received a hidden treatment requires its own evidence.

## Code, API fields and names

Use code sparingly in the report, after explaining behavior. Introduce what to look for, show a small meaningful complete excerpt in a language-tagged fence, then explain its consequence. Link source files/exact references and label reconstructions beside blocks. Longer context belongs in the library.

Use small request/response projections or name/value tables to clarify what was sent, returned and changed. Preserve exact keys, values, variable/function/file names and traits/arms, with their everyday meaning. Label selected/redacted projections; link full sanitized pairs and consumers. Preserve unresolved revealing names as leads rather than invented recovered behavior.

## Deliverables and editor handoff

Use a task-specific folder; preserve frozen earlier research. Deliver a ranked `REPORT.md`, `findings.json`, `evidence-index.json`, safe original/decoded data/calculations, `STORY-OUTLINE.md`, `library/`, `EDITOR-HANDOFF.md`, verification results and a verified editing ZIP. Preserve chosen scripts separately. No finding quota should produce padding.

Map narration beats to code/JSON, editable comparison data and app scenes. Provide copy-ready findings and conditions the editor needs to preserve. Distinguish captured footage from footage still needed. Show enough full-screen context to understand the situation; detail crops can accompany it. Label reconstructions outside images and keep staged/replayed scenes distinct from natural observations.

Data overlays need JSON/CSV, clear denominators and supported color/item mappings. Keep simplification notes, gates, resets and scope available outside assets. Verify research meaning as well as source/image fidelity.

Before rendering, check each planned narration claim and comparison against its ledger/source. Carry the condition and evidence state into the sentence, recalculate numbers and distinguish a hypothesis from an invented premise. This pass should preserve the strongest interpretation while fixing unsupported facts, counts or implied observations.

Keep the final chat handoff short: discoveries in ordinary words and links to the report, working localhost gallery and editing ZIP.

## Localhost presentation

Deliver a polished browsable gallery with the approved dark palette, readable monospace type, generous spacing and grouping by finding/story beat. Put plain-language introductions and short complete video snippets first; keep detailed methods/classification/context in expandable sections or notes. Download links sit outside images. Preserve full image height at different widths.

Start or reuse a server for the exported gallery, inspect compact and reference views in a browser, and open the presentation for the user. Give its actual working URL and record served folder/process or session. Leave the user-facing server running. Clean up temporary test servers separately; preserve existing galleries. See [snippet tools/hosting](snippets.md).

## Approved snippet style

Use short complete functions/methods/closed blocks or selected data objects, with every closing brace visible. Split or simplify coherently rather than cutting a closure; preserve longer originals in the reference view.

Use syntax colors and honest filename comments; coherent multi-file montages are welcome. Code images have no row highlighting, line numbers, title cards, badges, captions or editorial framing. Explanations/classifications stay outside images.

Keep rendering: 2160px width, DejaVu Sans Mono 54px, 81px leading, 104px padding, background #191f1c, foreground #d7dbd8. Use the bundled licensed font. Provide dark/transparent PNGs, editable text SVGs and code/data. PNG is the pixel reference when editors substitute fonts.

Classify as exact, decompiled, analyst reconstruction or data projection. Readable helper names are analyst labels. Explain omitted meaningful gates, defaults, resets, casts and metadata effects. Incomplete fragments belong in the reference view; compact reconstructions must be closed and retain behavior-changing conditions.

Before delivery inspect images, closures/margins, source bindings, numbers and transformations; load gallery views/links, check full-frame previews and verify the ZIP. Lexical closure does not prove compilability or behavioral equivalence.
