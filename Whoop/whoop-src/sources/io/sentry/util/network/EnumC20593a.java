package io.sentry.util.network;

/* JADX INFO: renamed from: io.sentry.util.network.a */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC20593a {
    JSON_TRUNCATED("JSON_TRUNCATED"),
    TEXT_TRUNCATED("TEXT_TRUNCATED"),
    INVALID_JSON("INVALID_JSON"),
    BODY_PARSE_ERROR("BODY_PARSE_ERROR");

    private final String value;

    EnumC20593a(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
