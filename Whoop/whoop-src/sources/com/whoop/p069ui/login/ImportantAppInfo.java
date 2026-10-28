package com.whoop.p069ui.login;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/ui/login/ImportantAppInfo;", "", "shortId", "", "exceptionReason", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getShortId", "()I", "getExceptionReason", "()Ljava/lang/String;", "FEATURE_FLAGS", "CONFIG_VALUES", "MEMBER_ENTITLEMENTS", "APP_CONFIGURATION", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum ImportantAppInfo {
    FEATURE_FLAGS(0, "feature flags"),
    CONFIG_VALUES(1, "configuration values"),
    MEMBER_ENTITLEMENTS(2, "member entitlements"),
    APP_CONFIGURATION(3, "app configuration");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String exceptionReason;
    private final int shortId;

    ImportantAppInfo(int i13, String str) {
        this.shortId = i13;
        this.exceptionReason = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getExceptionReason() {
        return this.exceptionReason;
    }

    public final int getShortId() {
        return this.shortId;
    }
}
