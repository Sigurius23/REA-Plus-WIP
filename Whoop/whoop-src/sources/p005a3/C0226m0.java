package p005a3;

import android.util.Log;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1601k1;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.AbstractC2316v;
import p027b3.AbstractC2346a;
import p027b3.C2390i3;
import p027b3.ViewOnAttachStateChangeListenerC2380g3;
import p027b3.ViewTreeObserverOnGlobalLayoutListenerC2396k;
import p114eb.C12982q;
import p114eb.C12988t;
import p134f2.C14014c;
import p134f2.C14015d;
import p189hb.C17070f;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p446r1.C30849c;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import rf3.C31365d;
import uf3.C34911a;

/* JADX INFO: renamed from: a3.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0226m0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f749w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f750x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f751y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0226m0(int i13, Object obj, Object obj2) {
        super(0);
        this.f749w = i13;
        this.f750x = obj;
        this.f751y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f749w) {
            case 0:
                C0223l1 c0223l1 = ((C0230n0) this.f750x).f783e0;
                C22669g0 c22669g0 = (C22669g0) this.f751y;
                if ((((AbstractC2316v) c0223l1.f743g).f9145z & 8) != 0) {
                    for (AbstractC2316v abstractC2316v = (C0224l2) c0223l1.f742f; abstractC2316v != null; abstractC2316v = abstractC2316v.f9132E) {
                        if ((abstractC2316v.f9144y & 8) != 0) {
                            ?? M504d = abstractC2316v;
                            ?? c30849c = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC0216j2) {
                                    InterfaceC0216j2 interfaceC0216j2 = (InterfaceC0216j2) M504d;
                                    if (interfaceC0216j2.mo544p()) {
                                        C18030l c18030l = new C18030l();
                                        c22669g0.f89336w = c18030l;
                                        c18030l.f69983z = true;
                                    }
                                    if (interfaceC0216j2.mo542H0()) {
                                        ((C18030l) c22669g0.f89336w).f69982y = true;
                                    }
                                    interfaceC0216j2.mo471n((InterfaceC18044z) c22669g0.f89336w);
                                } else if ((M504d.f9144y & 8) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                                    int i13 = 0;
                                    while (abstractC2316v2 != null) {
                                        if ((abstractC2316v2.f9144y & 8) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                M504d = M504d;
                                                c30849c = c30849c;
                                                c30849c = c30849c;
                                                M504d = abstractC2316v2;
                                            } else {
                                                if (c30849c == 0) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c.m94885b(abstractC2316v2);
                                            }
                                        } else {
                                            M504d = M504d;
                                            c30849c = c30849c;
                                        }
                                        abstractC2316v2 = abstractC2316v2.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i13 == 1) {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    } else {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                }
                                M504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                    }
                }
                return C23454a0.f92919a;
            case 1:
                C34911a c34911a = (C34911a) this.f750x;
                c34911a.f147011a.add((C1601k1) this.f751y);
                return c34911a;
            case 2:
                ((AbstractC2346a) this.f750x).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC2380g3) this.f751y);
                return C23454a0.f92919a;
            case 3:
                ((AbstractC1638x) this.f750x).mo4988d((C2390i3) this.f751y);
                return C23454a0.f92919a;
            case 4:
                ((C14014c) this.f750x).f50035Q.invoke((C14015d) this.f751y);
                return C23454a0.f92919a;
            case 5:
                C12988t c12988t = (C12988t) this.f750x;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.f751y;
                for (C12982q c12982q : (Iterable) c12988t.f44871f.f45200w.getValue()) {
                    if (C17070f.m48194n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + c12982q + " due to fragment " + abstractComponentCallbacksC1320m0 + " viewmodel being cleared");
                    }
                    c12988t.m36492b(c12982q);
                }
                return C23454a0.f92919a;
            case 6:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f750x;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2396k) this.f751y);
                }
                return C23454a0.f92919a;
            default:
                C31365d c31365d = (C31365d) this.f750x;
                C0237p c0237p = (C0237p) this.f751y;
                if (c31365d.f129025b == null) {
                    c31365d.f129025b = c31365d.mo96460a(c0237p);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226m0(C12982q c12982q, C12988t c12988t, C17070f c17070f, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        super(0);
        this.f749w = 5;
        this.f750x = c12988t;
        this.f751y = abstractComponentCallbacksC1320m0;
    }
}
