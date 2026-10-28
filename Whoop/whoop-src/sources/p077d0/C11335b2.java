package p077d0;

import android.view.View;
import androidx.lifecycle.InterfaceC1585g0;
import gb.C15653n;
import n40.ViewTreeObserverOnGlobalLayoutListenerC26261a;
import p114eb.C12982q;
import p238j0.C21084j;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.InterfaceC21083i;
import p389p0.C28559x0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p510u0.C34352r1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import t20.C33332m;
import t20.C33333n;
import t20.C33342w;
import w10.C36693e;
import x20.C37844l;

/* JADX INFO: renamed from: d0.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11335b2 implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36322c;

    public /* synthetic */ C11335b2(int i13, Object obj, Object obj2) {
        this.f36320a = i13;
        this.f36321b = obj;
        this.f36322c = obj2;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        switch (this.f36320a) {
            case 0:
                C11421z1 c11421z1 = (C11421z1) this.f36321b;
                C11400s1 c11400s1 = (C11400s1) this.f36322c;
                c11421z1.getClass();
                C11397r1 c11397r1M30631b = c11400s1.m30631b();
                if (c11397r1M30631b != null) {
                    c11421z1.f36638i.remove(c11397r1M30631b.f36540w);
                }
                break;
            case 1:
                ((C12982q) this.f36321b).f44837H.mo4988d((C15653n) this.f36322c);
                break;
            case 2:
                ((View) this.f36321b).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC26261a) this.f36322c);
                break;
            case 3:
                ((C28559x0) this.f36321b).f115545y.m146k(this.f36322c);
                break;
            case 4:
                ((C33333n) this.f36321b).f139038q.invoke(C33332m.f139020w);
                C33342w c33342w = (C33342w) this.f36322c;
                if (AbstractC22676k.m65745e(c33342w.f139134z.m5001b("should_reset"), Boolean.TRUE)) {
                    c33342w.m105701p(null);
                } else {
                    c33342w.m105702q(false);
                }
                C36693e c36693e = c33342w.f139130e0;
                if (c36693e != null) {
                    switch (c36693e.f157133a) {
                        case 0:
                            c36693e.f157134b.mo4053b();
                            break;
                        default:
                            c36693e.f157134b.mo4053b();
                            break;
                    }
                }
                c33342w.f139130e0 = null;
                break;
            case 5:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f36321b;
                C21086l c21086l = (C21086l) interfaceC28601c1.getValue();
                if (c21086l != null) {
                    C21085k c21085k = new C21085k(c21086l);
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) this.f36322c;
                    if (interfaceC21083i != null) {
                        ((C21084j) interfaceC21083i).m58922b(c21085k);
                    }
                    interfaceC28601c1.setValue(null);
                }
                break;
            case 6:
                ((C34352r1) this.f36321b).f144303c.remove((Function1) this.f36322c);
                break;
            default:
                ((InterfaceC1585g0) this.f36321b).getLifecycle().mo4988d((C37844l) this.f36322c);
                break;
        }
    }
}
