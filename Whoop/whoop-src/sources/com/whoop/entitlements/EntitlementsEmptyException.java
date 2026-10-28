package com.whoop.entitlements;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/entitlements/EntitlementsEmptyException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EntitlementsEmptyException extends IllegalStateException {
    public EntitlementsEmptyException() {
        super("No entitlements loaded into cache");
    }
}
