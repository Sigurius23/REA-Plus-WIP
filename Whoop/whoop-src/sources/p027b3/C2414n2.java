package p027b3;

import c93.InterfaceC4339a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2414n2 implements InterfaceC2410m3 {

    /* JADX INFO: renamed from: a */
    public InterfaceC4339a f9468a;

    /* JADX INFO: renamed from: b */
    public C28633k1 f9469b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f9470c = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public final long m7408a() {
        if (this.f9469b == null) {
            InterfaceC4339a interfaceC4339a = this.f9468a;
            this.f9469b = AbstractC28683x.m87272z(new C39180l(interfaceC4339a != null ? ((C39180l) interfaceC4339a.invoke()).f168422a : 0L));
            this.f9468a = null;
        }
        C28633k1 c28633k1 = this.f9469b;
        AbstractC22676k.m65747g(c28633k1);
        return ((C39180l) c28633k1.getValue()).f168422a;
    }
}
