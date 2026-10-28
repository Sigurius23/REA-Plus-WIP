package com.whoop.metrics.common;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/metrics/common/ScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "LOADING", "CACHE_HIT", "ERROR", "OTHER", "UNKNOWN", "metrics-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum ScreenState {
    SUCCESS,
    LOADING,
    CACHE_HIT,
    ERROR,
    OTHER,
    UNKNOWN;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
