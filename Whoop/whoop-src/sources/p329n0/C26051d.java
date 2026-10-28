package p329n0;

import c93.InterfaceC4352n;
import p389p0.InterfaceC28544q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C26051d implements InterfaceC28544q {

    /* JADX INFO: renamed from: a */
    public final Function1 f103120a;

    /* JADX INFO: renamed from: b */
    public final Function1 f103121b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4352n f103122c;

    public C26051d(Function1 function1, Function1 function2, InterfaceC4352n interfaceC4352n) {
        this.f103120a = function1;
        this.f103121b = function2;
        this.f103122c = interfaceC4352n;
    }

    @Override // p389p0.InterfaceC28544q
    public final Function1 getKey() {
        return this.f103120a;
    }

    @Override // p389p0.InterfaceC28544q
    public final Function1 getType() {
        return this.f103121b;
    }
}
