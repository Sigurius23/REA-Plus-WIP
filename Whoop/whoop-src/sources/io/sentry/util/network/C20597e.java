package io.sentry.util.network;

import p005a3.C0237p;

/* JADX INFO: renamed from: io.sentry.util.network.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20597e {

    /* JADX INFO: renamed from: a */
    public final String f77101a;

    /* JADX INFO: renamed from: b */
    public Integer f77102b;

    /* JADX INFO: renamed from: c */
    public Long f77103c;

    /* JADX INFO: renamed from: d */
    public Long f77104d;

    /* JADX INFO: renamed from: e */
    public C0237p f77105e;

    /* JADX INFO: renamed from: f */
    public C0237p f77106f;

    public C20597e(String str) {
        this.f77101a = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.f77101a + "', statusCode=" + this.f77102b + ", requestBodySize=" + this.f77103c + ", responseBodySize=" + this.f77104d + ", request=" + this.f77105e + ", response=" + this.f77106f + '}';
    }
}
