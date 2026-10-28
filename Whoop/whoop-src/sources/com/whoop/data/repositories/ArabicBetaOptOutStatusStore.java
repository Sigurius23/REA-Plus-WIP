package com.whoop.data.repositories;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;", "", "<init>", "()V", "Ll83/a0;", "markOptedOut", "", "value", "hasOptedOut", "Z", "getHasOptedOut", "()Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ArabicBetaOptOutStatusStore {
    private boolean hasOptedOut;

    public final boolean getHasOptedOut() {
        return this.hasOptedOut;
    }

    public final void markOptedOut() {
        this.hasOptedOut = true;
    }
}
