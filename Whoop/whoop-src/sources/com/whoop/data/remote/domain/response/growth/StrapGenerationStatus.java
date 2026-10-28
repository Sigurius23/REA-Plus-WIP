package com.whoop.data.remote.domain.response.growth;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import xr2.InterfaceC38631a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;", "Lxr2/a;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "", "getUsingHarvard", "()Z", "usingHarvard", "getUsingCopley", "usingCopley", "NEW_HARVARD", "UPGRADED_HARVARD", "DOWNGRADED_COPLEY", "COPLEY_AWAITING_HARVARD", "COPLEY_NO_HARVARD", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum StrapGenerationStatus implements InterfaceC38631a {
    NEW_HARVARD("new_harvard"),
    UPGRADED_HARVARD("upgraded_harvard"),
    DOWNGRADED_COPLEY("downgraded_copley"),
    COPLEY_AWAITING_HARVARD("copley_awaiting_harvard"),
    COPLEY_NO_HARVARD("copley_no_harvard");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String serializedValue;

    StrapGenerationStatus(String str) {
        this.serializedValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // xr2.InterfaceC38631a
    public String getSerializedValue() {
        return this.serializedValue;
    }

    public final boolean getUsingCopley() {
        return this == DOWNGRADED_COPLEY || this == COPLEY_AWAITING_HARVARD || this == COPLEY_NO_HARVARD;
    }

    public final boolean getUsingHarvard() {
        return this == NEW_HARVARD || this == UPGRADED_HARVARD;
    }
}
