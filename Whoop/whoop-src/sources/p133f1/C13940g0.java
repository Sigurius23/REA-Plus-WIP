package p133f1;

import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import p181h2.C16617b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: f1.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13940g0 implements InterfaceC13957m, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4339a f49694w;

    public C13940g0(InterfaceC4339a interfaceC4339a) {
        this.f49694w = interfaceC4339a;
    }

    @Override // p133f1.InterfaceC13957m
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo39711a() {
        return ((C16617b) this.f49694w.invoke()).f63937a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC13957m) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f49694w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
