package xq2;

import p027b3.InterfaceC2464x2;
import p164g2.InterfaceC15250v;
import p390p1.InterfaceC28601c1;
import p510u0.InterfaceC34345p0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xq2.a0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38547a0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165868w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f165869x;

    public /* synthetic */ C38547a0(Object obj, int i13) {
        this.f165868w = i13;
        this.f165869x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165868w) {
            case 0:
                return AbstractC38550b0.m123525p((InterfaceC28601c1) this.f165869x, (InterfaceC15250v) obj);
            case 1:
                return AbstractC38554c1.m123563Q((InterfaceC28601c1) this.f165869x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC38550b0.m123527r((InterfaceC2464x2) this.f165869x, (InterfaceC34345p0) obj);
        }
    }
}
