# HeyClicky limited live UI check — 2026-10-30

**Partial observation; text-input focus is now confirmed.** After the earlier
locked-Mac interruption, the user reported the panel open and the follow-up
succeeded. This is the separately authorized runtime check. It does not change the offline scope of
the earlier static reports. The user allowed inspecting hover, expansion,
focus and Escape without submitting prompts or starting jobs.

The selected app is `/Applications/HeyClicky.app`, bundle ID
`com.humansongs.clicky`. General displays version **1.1.1 (66)**. The matching
main executable has SHA-256
`764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17`.
CUA reported the app running. Its selection API can launch an app if needed;
there was no pre-selection process snapshot, so a fresh launch is not proven.

## Observed behavior

- The initial app capture shows a small black rounded notch at the top center
  of a much larger capture envelope. The image is 1,640 × 1,800 pixels,
  consistent with the statically recovered 820 × 900 point outer envelope at
  2× scale. This comparison does not establish the display's full geometry or
  the alpha of the capture's surrounding white area.
- The app menu's **Settings…** action opens a dark settings panel within that
  envelope. Its navigation includes Account, General, Voice, Microphone,
  Dictation, Shortcuts, Cursor, Integrations, Agents and Routines. General
  exposes the app version and appearance options. No preferences were changed.
- With General open and the pointer placed inside the panel, pressing
  **Escape** removes the settings accessibility content and collapses the
  screenshot back to the small notch. The app remains running. This is one
  controlled expanded-settings-to-collapsed transition.
- The Shortcuts page declares text mode as **Control twice** and push-to-talk
  as **Control + Option**. The voice and dictation shortcuts were not invoked.
- After the user reported text mode open, the first accessibility observation
  explicitly identified **Ask HeyClicky…** as the focused, settable text field.
  Chat was selected and Send was disabled. No text was entered to test focus.
- Pressing **Escape from that focused text field** moved accessibility focus
  to the root system dialog. Attach, read-aloud and Send controls disappeared;
  a microphone control and compact text input remained. The full accessibility
  tree and screenshot confirmed the **Chat panel stayed expanded**. This is
  distinct from the earlier Settings-to-collapsed Escape behavior.

## Checks that remain unverified

The available CUA API has no documented pointer-move/hover operation. Clicks
inside and below the collapsed notch did not establish a pure-hover trigger.
Earlier Chat navigation did not leave a visible text input in the returned
captures; its cause remains unresolved. The later user-opened panel did expose
a focused input. These observations are not a diagnosis of an app defect.

The controller rejected the first modifier-only `Control_L` key press with
`keyPressIncludedNoNonModifierKeys`; the double-Control shortcut was therefore
not performed. Manual opening of text mode was requested. A later observation
failed because the Mac was locked and automatic unlock was unavailable. The
user subsequently said **“its open”**, and direct observation then confirmed
input focus. The exact manual keystrokes were not observed. Focus no longer
depends on a pending manual action. Pure hover, animation timing, multi-display
and Space/full-screen behavior remain unverified.

An earlier Escape was sent while the View menu was open; the menu remained in
the accessibility tree and was subsequently dismissed using its exposed Cancel
action. That attempt is not counted as a notch Escape test. The successful
General-panel test above is separate.

## Evidence and scope

Observations came from the CUA app accessibility tree and inline app-window
screenshots. No screenshots, full accessibility dumps or account-page captures
were exported to the repository. This report omits incidental account identity,
usage details and existing conversation/artifact contents.
It is an analyst observation record, not an REA+ native-UI Evidence response.
The [JSON record](heyclicky-ui-check-2026-10-30.json) keeps the result and limits.

No prompt was typed or submitted, no job was started, and no preference,
permission, account or integration setting was changed. The running app could
load existing state and contact its services, as disclosed in the authorization;
network traffic was not captured, so absence of app-initiated requests is not
claimed. No user application-data files were opened for this check. No commit
or push was made.
