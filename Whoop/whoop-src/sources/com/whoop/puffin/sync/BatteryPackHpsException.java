package com.whoop.puffin.sync;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/puffin/sync/BatteryPackHpsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/whoop/puffin/sync/f$b;", "ending", "<init>", "(Lcom/whoop/puffin/sync/f$b;)V", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BatteryPackHpsException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryPackHpsException(InterfaceC9823f.b ending) {
        super("battery HPS ended with " + ending);
        AbstractC22676k.m65750j(ending, "ending");
    }
}
