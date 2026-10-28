package androidx.room;

import p003a1.C0103b;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1809m0 extends AbstractC1821q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0103b f7114a;

    public C1809m0(C0103b c0103b) {
        this.f7114a = c0103b;
    }

    @Override // androidx.room.AbstractC1821q0
    public final void onOpen(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        this.f7114a.invoke(db4);
    }
}
