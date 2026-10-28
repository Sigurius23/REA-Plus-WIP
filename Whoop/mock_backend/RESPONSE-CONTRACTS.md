# Response check evidence

`response_contracts.py` checks the **uncoerced JSON** of successful responses
against the DTOs in WHOOP Android 5.473.0. It permits unknown members, preserves
the response, distinguishes booleans from numbers, checks signed 32-bit `Int`
values, and rejects nonfinite/overflowing profile Floats. Optional/nullable fields remain distinct.
It does not insert defaults, fabricate account state or grant entitlements.

The real Kotlin decoder uses `explicitNulls=false`, `coerceInputValues=true`,
`ignoreUnknownKeys=true`, enum case-insensitive decoding and SnakeCase. See
`whoop-src/sources/u82/AbstractC34650k.java:35–40`,
`p505ts/AbstractC34132o.java:1602–1615`, `ad3/C0766i.java:72` and
`bd3/C3144w.java:234–237`. Consequently a strict check can flag explicit nulls or
strings that a particular client converter accepts. Omitted nullable fields
are permitted even where a generated serializer marks the constructor member
required. A shape pass is not proof of conversion success or app startup.

Paths below are relative to `Whoop/whoop-src/sources/`. They are static source
observations, not captured server behavior.

| Response | Structural evidence | Additional conversion limits |
| --- | --- | --- |
| Configuration | `com/whoop/service/network/WhoopConfiguration.java:22–23,40–45`; `ConfigurationApi.java:11–15` | Array of nonnull objects with required string `key` and `value`. Empty array permitted. |
| User flags / onboarding flag | `com/whoop/service/network/FeatureFlagsApi.java:12–16` | String array / boolean root respectively. No assumed flag-name enumeration. |
| Bootstrap | `com/whoop/domain/bootstrap/dto/UserBootstrapDto.java:197–222`; account serializer `UserAccountBootstrapDto$$serializer.java:32–50`; user serializer `UserInfoBootstrapDto$$serializer.java:30–35,62–69`; profile serializer `UserProfileBootstrapDto$$serializer.java:31–38,68–75`; membership/bio-data serializers | Sections are nullable. Nonnull account requires username/email/created_at strings and can_upload_data/deidentified/concealed booleans. Nullable user_id is a signed Int. Optional user/profile/membership/bio-data members follow DTO defaults. |
| App configuration | `com/whoop/appconfiguration/AppConfigurationResponse.java:22–23`; `AppConfigurationResponse$$serializer.java:51–70`; `TabsConfiguration.java:50–58`; `TabConfiguration.java:189–196` | Nullable tabs/should_fetch_ai_context. Tab items require id/title strings. Nested analytics uses `com/whoop/analytics/AnalyticEventModel.java:60–95` and its serializer:33–51. Properties is an arbitrary JSON object. |
| Feature education | `com/whoop/data/onboarding/OnboardingStatusApi.java:27–28` | Object with arbitrary keys and nonnull boolean values. |
| Entitlements | `com/whoop/entitlements/EntitlementsResponse.java:124–129`; `EntitlementResponse.java:84–88`; `EntitlementsContext$$serializer.java:38–39` | Optional nonnull entitlements/context objects; each entitlement value is an object with optional boolean entitled. Context membership_type is nullable string. |
| Straps | `com/whoop/data/remote/domain/dto/growth/UserStrapsDto.java:65–72,88–94`; `com/whoop/data/remote/domain/response/growth/UserStrapsKt.java:15–37,52–54` | Nullable strap objects/previous_straps array; nullable generation/serial/first_seen strings. Unknown generation maps to UNKNOWN. Null array entries fail conversion. No guessed serial/date format. |
| Navigation | `com/whoop/navigation/json/NavigationActionTypeAdapter.java:321–327`; `com/whoop/navigation/json/C9602a.java:98–134` | Required string screen. Parameters must be an object if present; omission warns because Kotlin defaults to {}, while Gson requires it. Malformed optional tab warns rather than fails. Screen-specific dispatch and parameter semantics remain unchecked. |

Bootstrap conversion requires nonnull account, user and account.user_id
(`pd1/C29104a.java:374–385`). Missing user names/country may differ between
Kotlin defaults and Gson omission (`com/whoop/domain/model/User.java:284–291`).
These are separate conversion warnings rather than DTO-shape errors.

Profile conversion performs exact string lookups for unit system, fitness level
and gender (`com/whoop/domain/model/UnitSystem.java:25–30`,
`FitnessLevel.java:33–38`, `Gender.java:33–47`). An empty gender is explicitly
replaced before lookup (`pd1/C29104a.java:400–404`). The checker warns for
unrecognized values. It does not claim Python date parsing matches Joda:
`or2/AbstractC28184n0.java:18–41` handles birthday/timezone conversion, which
remains unexecuted here. Height/weight must be numeric and finite when rounded
to an IEEE 754 Float; the real Kotlin decoder rejects overflow with special
floating values disabled (`bd3/C3121f0.java:398–407`,
`bd3/AbstractC3112b.java:361–368`). This does not check physiological plausibility
or emulate the entire decoder.

Non-success and no-body HTTP responses are retained but their bodies are not
checked against success DTOs. Missing core routes are listed as coverage gaps;
the static shortlist itself has not been established as a complete startup set.
Diagnostics contain known field paths and type descriptions, never response
values or arbitrary map keys. Keep fixture directories separate per account
and session; this tool cannot prove account identity from response shape.
