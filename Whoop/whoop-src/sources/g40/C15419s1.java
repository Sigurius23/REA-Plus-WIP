package g40;

import android.view.KeyEvent;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p477s2.AbstractC32073e;
import p477s2.C32071c;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15419s1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57932w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f57933x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15399o1 f57934y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f57935z;

    public C15419s1(int i13, InterfaceC15237i interfaceC15237i, C15399o1 c15399o1, InterfaceC28601c1 interfaceC28601c1) {
        this.f57932w = i13;
        this.f57933x = interfaceC15237i;
        this.f57934y = c15399o1;
        this.f57935z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent event = ((C32071c) obj).f133019a;
        AbstractC22676k.m65750j(event, "event");
        int i13 = this.f57932w;
        if (i13 == 0 || AbstractC32073e.m99720L(event) != 2 || event.getKeyCode() != 67 || ((String) this.f57935z.getValue()).length() != 0) {
            return Boolean.FALSE;
        }
        AbstractC34870c0.m109993c0(this.f57933x, 2);
        this.f57934y.f57854b.m43596a(i13 - 1, "");
        return Boolean.TRUE;
    }
}
