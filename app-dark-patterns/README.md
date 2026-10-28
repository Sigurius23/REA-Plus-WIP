# Find Dark Patterns in Apps — public skill bundle

A reusable investigation skill for finding dark patterns across games, social platforms, shopping, dating, fitness and subscription apps. Choose a new app for each investigation and adapt the tests to its business model and user experience.

## Use it

1. Extract this ZIP.
2. Give the `app-dark-patterns` folder to your coding agent and ask it to install the folder as a skill. Keep `SKILL.md`, `references/`, `scripts/`, `assets/` and `agents/` together.
3. Ask: “Use the app-dark-patterns skill to investigate [APP] for potential dark patterns in pricing, subscriptions, ads, rewards, retention, privacy and user feedback. Start with what a person sees and expects. Pin the exact build, trace the hidden rule and its user-facing result, compare relevant states, preserve counterevidence, and give me a report with reproducible evidence and source-bound code assets. Explain what makes each pattern misleading or manipulative; monetization or an experiment alone is not proof.”

The agent needs tools appropriate to the app/platform, such as an authorized Android device/emulator and DEX tooling. The snippet renderer's Python dependencies are listed in `scripts/requirements.txt`. Full methodology and editing-output guidance are in `references/`.

This public edition replaces the author's private research-account/email-routing configuration with general authorization instructions. No credentials, account identifiers, APKs or private investigation captures are included. The included DejaVu font retains its license in `assets/fonts/`.

Prepared 21 October 2026.
