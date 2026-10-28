package h00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import ch.C4599t;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.C28655q;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: h00.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C16530x implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23459e f63574x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC23459e f63575y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63576z;

    public /* synthetic */ C16530x(InterfaceC23459e interfaceC23459e, InterfaceC23459e interfaceC23459e2, Object obj, int i13) {
        this.f63573w = i13;
        this.f63574x = interfaceC23459e;
        this.f63575y = interfaceC23459e2;
        this.f63576z = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f63573w) {
            case 0:
                InterfaceC3764o composable = (InterfaceC3764o) obj;
                C12982q it = (C12982q) obj2;
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(composable, "$this$composable");
                AbstractC22676k.m65750j(it, "it");
                AbstractC35902e.m113962f(1.0f, AbstractC37817c.m121344e(1952721389, composer, new C4599t((Function1) this.f63574x, (Function1) this.f63575y, (Function1) this.f63576z, 3)), composer, 54);
                break;
            default:
                InterfaceC3764o AnimatedContent = (InterfaceC3764o) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Composer composer2 = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
                if (zBooleanValue) {
                    C28655q c28655q = (C28655q) composer2;
                    c28655q.m87150e0(2077744730);
                    ((C37816b) this.f63574x).invoke(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    C28655q c28655q2 = (C28655q) composer2;
                    c28655q2.m87150e0(2077799755);
                    C37816b c37816b = (C37816b) this.f63575y;
                    AbstractC38794c0 abstractC38794c0 = (AbstractC38794c0) this.f63576z;
                    AbstractC22676k.m65747g(abstractC38794c0);
                    c37816b.invoke(abstractC38794c0, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
