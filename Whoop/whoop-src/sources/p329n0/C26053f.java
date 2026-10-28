package p329n0;

import b30.C2479a4;
import c93.InterfaceC4352n;
import io.getstream.chat.android.client.internal.state.utils.internal.C19381d;
import p002a0.C0020f0;
import p012ab.C0682h0;
import p389p0.AbstractC28560y;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: n0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C26053f extends AbstractC28560y implements InterfaceC26064q {

    /* JADX INFO: renamed from: c */
    public final C0682h0 f103125c = new C0682h0(12, (byte) 0);

    /* JADX INFO: renamed from: d */
    public C0020f0 f103126d;

    public C26053f(Function1 function1) {
        function1.invoke(this);
    }

    @Override // p389p0.AbstractC28560y
    /* JADX INFO: renamed from: m */
    public final C0682h0 mo77527m() {
        return this.f103125c;
    }

    /* JADX INFO: renamed from: q */
    public final void m77528q(Object obj, Object obj2, Function3 function3) {
        this.f103125c.m1692g(1, new C26051d(obj != null ? new C19381d(obj, 1) : null, new C19381d(obj2, 1), new C37816b(new C2479a4(function3, 3), true, -857469575)));
    }

    /* JADX INFO: renamed from: r */
    public final void m77529r(int i13, Function1 function1, Function1 function2, InterfaceC4352n interfaceC4352n) {
        this.f103125c.m1692g(i13, new C26051d(function1, function2, interfaceC4352n));
    }
}
