package io.sentry;

import live.hms.video.utils.HMSConstantsKt;

/* JADX INFO: renamed from: io.sentry.m */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20418m {
    All("__all__"),
    Default(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY),
    Error("error"),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC20418m(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
