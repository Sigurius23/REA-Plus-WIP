package com.stripe.android.financialconnections.model;

import ge3.AbstractC15751g;
import p407pz.C29635a;
import p407pz.C29636b;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "pz/b", "pz/a", "AUTOMATIC", "CUSTOM", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C29636b.class)
public enum ManualEntryMode {
    AUTOMATIC("automatic"),
    CUSTOM("custom"),
    UNKNOWN("unknown");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    public static final C29635a Companion = new C29635a();

    ManualEntryMode(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
