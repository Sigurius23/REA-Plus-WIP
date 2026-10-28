package p292l1;

import l83.InterfaceC23459e;
import p208i2.C17919x;
import p208i2.InterfaceC17868a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22691v;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: l1.g4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23101g4 implements InterfaceC17868a0, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC22691v f91223w;

    public C23101g4(AbstractC22691v abstractC22691v) {
        this.f91223w = abstractC22691v;
    }

    @Override // p208i2.InterfaceC17868a0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo3457a() {
        return ((C17919x) this.f91223w.invoke()).f69639a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC17868a0) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f91223w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
