import { describe, expect, it } from "vitest";

import { javaScriptStaticObservationReserve } from "./javascriptAnalysisResourceControls.js";

const reserve = javaScriptStaticObservationReserve;

describe("observed static-observation reserve", () => {
  it("reserves nothing when the run has no following sources", () => {
    expect(
      reserve({
        result_budget_bytes: 1_000_000,
        retained_static_bytes: 40_000,
        observed_sources: 4,
        sources_remaining: 0,
      }),
    ).toBe(0);
    expect(
      reserve({
        result_budget_bytes: 1_000_000,
        retained_static_bytes: 40_000,
        observed_sources: 4,
        sources_remaining: undefined,
      }),
    ).toBe(0);
  });

  it("reserves nothing before the first observation instead of guessing a fixed fraction", () => {
    expect(
      reserve({
        result_budget_bytes: 1_000_000,
        retained_static_bytes: 0,
        observed_sources: 0,
        sources_remaining: 500,
      }),
    ).toBe(0);
  });

  it("sizes the reserve from the observed mean cost of the sources that follow", () => {
    // 40 sources retained 100 KB total (2.5 KB mean); 100 sources follow.
    expect(
      reserve({
        result_budget_bytes: 1_000_000,
        retained_static_bytes: 100_000,
        observed_sources: 40,
        sources_remaining: 100,
      }),
    ).toBe(750_000);
  });

  it("caps a large observed cost at the fraction-of-budget ceiling", () => {
    expect(
      reserve({
        result_budget_bytes: 1_000_000,
        retained_static_bytes: 400_000,
        observed_sources: 1,
        sources_remaining: 1_000,
      }),
    ).toBe(800_000);
  });

  it("never reserves beyond the whole budget", () => {
    expect(
      reserve({
        result_budget_bytes: 90,
        retained_static_bytes: 10_000_000,
        observed_sources: 3,
        sources_remaining: 2_000,
      }),
    ).toBe(72);
  });
});
