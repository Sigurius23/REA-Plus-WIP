package p164g2;

import p026b2.AbstractC2316v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g2.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C15231c extends AbstractC2316v implements InterfaceC15233e {

    /* JADX INFO: renamed from: O */
    public Function1 f57228O;

    /* JADX INFO: renamed from: P */
    public EnumC15251w f57229P;

    @Override // p164g2.InterfaceC15233e
    /* JADX INFO: renamed from: k */
    public final void mo470k(EnumC15251w enumC15251w) {
        if (AbstractC22676k.m65745e(this.f57229P, enumC15251w)) {
            return;
        }
        this.f57229P = enumC15251w;
        this.f57228O.invoke(enumC15251w);
    }
}
