"""Strict, uncoerced JSON shape checks derived from WHOOP 5.473.0 DTOs.

These checks do not emulate Kotlin/Gson defaults, coercion or navigation dispatch.
Unknown object members are retained and allowed. Diagnostics omit body values.
See RESPONSE-CONTRACTS.md for source locations and conversion limitations.
"""
from __future__ import annotations

from dataclasses import dataclass
import math
import struct


def issue(items, path, message):
    items.append({"path": path, "message": message})


def finite_float32(value):
    if type(value) not in (int, float):
        return False
    try:
        return math.isfinite(struct.unpack("!f", struct.pack("!f", value))[0])
    except (OverflowError, struct.error):
        return False


def scalar(kind):
    def check(value, path, errors, warnings):
        valid = {"string": lambda: isinstance(value, str),
                 "boolean": lambda: type(value) is bool,
                 "Int": lambda: type(value) is int and -(2**31) <= value < 2**31,
                 "finite Float": lambda: finite_float32(value)}[kind]()
        if not valid:
            issue(errors, path, f"Expected nonnull {kind}")
    return check


STRING, BOOL, INT, FLOAT = (scalar(kind) for kind in ("string", "boolean", "Int", "finite Float"))


@dataclass(frozen=True)
class Field:
    check: object
    required: bool = False
    nullable: bool = False


def obj(**fields):
    def check(value, path, errors, warnings):
        if not isinstance(value, dict):
            issue(errors, path, "Expected nonnull object")
            return
        for name, field in fields.items():
            child = f"{path}.{name}"
            if name not in value:
                if field.required:
                    issue(errors, child, "Required member is missing")
            elif value[name] is not None or not field.nullable:
                field.check(value[name], child, errors, warnings)
    return check


OBJECT = obj()


def array(check_item):
    def check(value, path, errors, warnings):
        if not isinstance(value, list):
            issue(errors, path, "Expected nonnull array")
            return
        for index, item in enumerate(value):
            check_item(item, f"{path}[{index}]", errors, warnings)
    return check


def mapping(check_item):
    def check(value, path, errors, warnings):
        if not isinstance(value, dict):
            issue(errors, path, "Expected nonnull object")
            return
        # Arbitrary server keys may contain personal data; do not print them.
        for index, item in enumerate(value.values()):
            check_item(item, f"{path}.*[{index}]", errors, warnings)
    return check


def navigation(value, path, errors, warnings):
    obj(screen=Field(STRING, required=True), parameters=Field(OBJECT))(
        value, path, errors, warnings)
    if not isinstance(value, dict):
        return
    if "parameters" not in value:
        issue(warnings, path + ".parameters",
              "Missing parameters defaults to {} in Kotlin; the Gson adapter requires an object")
    tab = value.get("tab")
    if tab is not None and (not isinstance(tab, dict) or
                           ("id" in tab and not isinstance(tab["id"], str))):
        issue(warnings, path + ".tab", "Optional tab shape is converter-dependent; tab.id is expected to be a string")
    issue(warnings, path, "Screen dispatch and screen-specific parameters have not been validated")


ACCOUNT = obj(**{name: Field(STRING, required=True) for name in ("username", "email", "created_at")},
              **{name: Field(BOOL, required=True) for name in ("can_upload_data", "deidentified", "concealed")},
              user_id=Field(INT, nullable=True))
USER = obj(**{name: Field(STRING) for name in ("first_name", "last_name", "country")},
           **{name: Field(STRING, nullable=True) for name in ("avatar_url", "city", "admin_division")})
PROFILE = obj(**{name: Field(FLOAT) for name in ("height", "weight")},
              **{name: Field(STRING) for name in ("birthday", "gender", "unit_system", "fitness_level", "timezone_offset")},
              physiological_baseline=Field(STRING, nullable=True))
BOOTSTRAP = obj(account=Field(ACCOUNT, nullable=True), user=Field(USER, nullable=True),
                profile=Field(PROFILE, nullable=True),
                membership=Field(obj(in_effect=Field(BOOL)), nullable=True),
                bio_data=Field(obj(**{name: Field(INT) for name in (
                    "max_heart_rate", "min_heart_rate", "resting_heart_rate", "recovery_count")}), nullable=True))
ANALYTIC = obj(name=Field(STRING, required=True), category=Field(STRING, required=True),
               **{name: Field(STRING, nullable=True) for name in ("source", "action", "label", "value")},
               properties=Field(OBJECT))
TAB = obj(id=Field(STRING, required=True), title=Field(STRING, required=True),
          icon_key=Field(STRING, nullable=True), analytic_event=Field(ANALYTIC, nullable=True),
          destination=Field(navigation, nullable=True))
APP_CONFIG = obj(tabs=Field(obj(default_tab_id=Field(STRING, nullable=True), items=Field(array(TAB))), nullable=True),
                 should_fetch_ai_context=Field(BOOL, nullable=True))
ENTITLEMENTS = obj(entitlements=Field(mapping(obj(entitled=Field(BOOL)))),
                   context=Field(obj(membership_type=Field(STRING, nullable=True))))
STRAP = obj(**{name: Field(STRING, nullable=True) for name in ("generation", "serial", "first_seen")})
STRAPS = obj(last_seen_strap=Field(STRAP, nullable=True), ordered_strap=Field(STRAP, nullable=True),
             previous_straps=Field(array(STRAP), nullable=True))
CONFIG = array(obj(key=Field(STRING, required=True), value=Field(STRING, required=True)))

CHECKS = {
    "/configuration/v1/services/mobile/name/Android/properties/unauth": CONFIG,
    "/configuration/v1/services/mobile/name/Android/properties": CONFIG,
    "/feature-flags/flags/user": array(STRING),
    "/users-service/v2/bootstrap": BOOTSTRAP,
    "/app-configuration-service/v1/config": APP_CONFIG,
    "/onboarding-service/v1/feature-education-state": mapping(BOOL),
    "/entitlement-service/v1/entitlements": ENTITLEMENTS,
    "/membership-service/v1/straps": STRAPS,
    "/onboarding-service/v1/app/destination": navigation,
    "/onboarding-service/v1/join/post-signin-destination": navigation,
    "/feature-flags/flags/onboarding/{flagName}": BOOL,
}


def bootstrap_warnings(body, warnings):
    if not isinstance(body, dict):
        return
    for name in ("account", "user"):
        if body.get(name) is None:
            issue(warnings, f"$.{name}", "Login conversion requires this nonnull section")
    account = body.get("account")
    if isinstance(account, dict) and account.get("user_id") is None:
        issue(warnings, "$.account.user_id", "Login conversion requires nonnull user_id")
    user = body.get("user")
    if isinstance(user, dict):
        for name in ("first_name", "last_name", "country"):
            if name not in user:
                issue(warnings, f"$.user.{name}", "Kotlin supplies a default; Gson omission may fail User conversion")
    profile = body.get("profile")
    if isinstance(profile, dict):
        enums = {"unit_system": {"metric", "imperial"},
                 "fitness_level": {"inactive", "recreational_enthusiast", "collegiate", "serious_enthusiast", "professional", "tactical"},
                 "gender": {"", "male", "female", "non-binary", "i prefer not to choose"}}
        for name, accepted in enums.items():
            value = profile.get(name, "")
            if isinstance(value, str) and value not in accepted:
                issue(warnings, f"$.profile.{name}", "Value is not recognized by the downstream exact enum lookup")
        issue(warnings, "$.profile", "Joda birthday/timezone parsing and profile conversion have not been executed")


def validate_response(contract_path: str, body: object) -> dict:
    errors, warnings = [], []
    CHECKS[contract_path](body, "$", errors, warnings)
    if contract_path == "/users-service/v2/bootstrap":
        bootstrap_warnings(body, warnings)
    return {"errors": errors, "conversion_warnings": warnings}
