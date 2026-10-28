package com.whoop.puffin.sync;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.puffin.sync.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/puffin/sync/f;", "Lcom/whoop/puffin/sync/f$b$d;", "b", "(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$d;", "Lcom/whoop/puffin/sync/f$b$a;", "a", "(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$a;", "", "c", "(Lcom/whoop/puffin/sync/f;)I", "totalCount", "puffin_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9824g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9823f.b.a m23698a(InterfaceC9823f interfaceC9823f) {
        return interfaceC9823f == null ? new InterfaceC9823f.b.a(0, 0, 0, 7, null) : new InterfaceC9823f.b.a(interfaceC9823f.getSavedConsoleLogPacketsCount(), interfaceC9823f.getSavedFirmwareEventPacketsCount(), interfaceC9823f.getBurstCount());
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9823f.b.d m23699b(InterfaceC9823f interfaceC9823f) {
        return interfaceC9823f == null ? new InterfaceC9823f.b.d(0, 0, 0, 7, null) : new InterfaceC9823f.b.d(interfaceC9823f.getSavedConsoleLogPacketsCount(), interfaceC9823f.getSavedFirmwareEventPacketsCount(), interfaceC9823f.getBurstCount());
    }

    /* JADX INFO: renamed from: c */
    public static final int m23700c(InterfaceC9823f interfaceC9823f) {
        AbstractC22676k.m65750j(interfaceC9823f, "<this>");
        return interfaceC9823f.getSavedFirmwareEventPacketsCount() + interfaceC9823f.getSavedConsoleLogPacketsCount();
    }
}
