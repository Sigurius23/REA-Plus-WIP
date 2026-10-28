package io.sentry.android.core.internal.tombstone;

/* JADX INFO: renamed from: io.sentry.android.core.internal.tombstone.a */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC20098a {
    TOMBSTONE("Tombstone"),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");

    private final String value;

    EnumC20098a(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
