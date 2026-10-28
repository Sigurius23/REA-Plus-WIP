package l83;

import bd3.C3111a0;
import bd3.C3113b0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: l83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C23455b implements InterfaceC30057d {

    /* JADX INFO: renamed from: w */
    public C3111a0 f92920w;

    /* JADX INFO: renamed from: x */
    public InterfaceC30057d f92921x;

    /* JADX INFO: renamed from: y */
    public Object f92922y;

    /* JADX INFO: renamed from: a */
    public final void m68036a(C3113b0 c3113b0) {
        this.f92921x = c3113b0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return C30064k.f122676w;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        this.f92921x = null;
        this.f92922y = obj;
    }
}
