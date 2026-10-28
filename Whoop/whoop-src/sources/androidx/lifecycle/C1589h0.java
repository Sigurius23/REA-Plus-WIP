package androidx.lifecycle;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1589h0 {

    /* JADX INFO: renamed from: a */
    public EnumC1635w f6239a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1577e0 f6240b;

    /* JADX INFO: renamed from: a */
    public final void m4979a(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        EnumC1635w enumC1635wM5039a = enumC1632v.m5039a();
        EnumC1635w state1 = this.f6239a;
        AbstractC22676k.m65750j(state1, "state1");
        if (enumC1635wM5039a.compareTo(state1) < 0) {
            state1 = enumC1635wM5039a;
        }
        this.f6239a = state1;
        this.f6240b.mo4080h(interfaceC1585g0, enumC1632v);
        this.f6239a = enumC1635wM5039a;
    }
}
