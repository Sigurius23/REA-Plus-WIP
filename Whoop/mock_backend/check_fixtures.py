#!/usr/bin/env python3
"""Check local replay JSON shapes without changing files or printing body values."""
from __future__ import annotations

import argparse
import json
from pathlib import Path

from replay import CONTRACTS, fixture_name, load_fixtures, route_for
from response_contracts import validate_response


def check_directory(directory: Path) -> dict:
    records = load_fixtures(directory)
    results, seen, passed = [], set(), set()
    for record in records.values():
        route = route_for(record["method"], record["path"])
        seen.add(route["path"])
        result = {"request_id": fixture_name(record["method"], record["path"],
                    record.get("request_variant_hashes", {})).removesuffix(".json"),
                  "contract_path": route["path"], "status": record["status"]}
        if 200 <= record["status"] < 300 and record["status"] not in (204, 205):
            result.update(validate_response(route["path"], record["body"]))
            result["validation"] = "shape_errors" if result["errors"] else "shape_passed"
            if not result["errors"]:
                passed.add(route["path"])
        else:
            result.update(validation="skipped_non_body_or_non_success_response", errors=[], conversion_warnings=[])
        results.append(result)
    return {"mode": "strict_uncoerced_json_shapes", "fixtures": results,
            "fixture_count": len(results),
            "shape_error_count": sum(len(item["errors"]) for item in results),
            "conversion_warning_count": sum(len(item["conversion_warnings"]) for item in results),
            "missing_core_contracts": [route["path"] for route in CONTRACTS
                                       if route["group"] == "core" and route["path"] not in seen],
            "core_contracts_without_shape_pass": [route["path"] for route in CONTRACTS
                if route["group"] == "core" and route["path"] not in passed],
            "app_startup_verified": False,
            "limitations": "Static shape checks do not establish authentication, conversion success, route completeness or app startup"}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--fixtures", type=Path, required=True)
    args = parser.parse_args()
    try:
        report = check_directory(args.fixtures)
    except (ValueError, OSError, RecursionError):
        # Do not echo decoder exceptions, which may include personal JSON values.
        print(json.dumps({"error": "Cannot load fixture set: check directory, JSON, request metadata and duplicates"}))
        return 1
    print(json.dumps(report, indent=2, allow_nan=False))
    return int(not report["fixture_count"] or bool(report["shape_error_count"]))


if __name__ == "__main__":
    raise SystemExit(main())
