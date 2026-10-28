package q00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p62.C28947h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: q00.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29708c0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C29720i0 f121480w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f121481x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f121482y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f121483z;

    public C29708c0(C29720i0 c29720i0, String str, float f13, Function1 function1) {
        this.f121480w = c29720i0;
        this.f121481x = str;
        this.f121482y = f13;
        this.f121483z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC38794c0 selectedItem = (AbstractC38794c0) obj;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(selectedItem, "selectedItem");
        boolean z4 = !this.f121480w.m91174c().f63514w;
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(-2036405960);
        Function1 function1 = this.f121483z;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28947h(function1, 15);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        AbstractC32417h.m101197f(selectedItem, z4, this.f121481x, this.f121482y, (InterfaceC4339a) objM87133R, c28655q, iIntValue & 14);
        return C23454a0.f92919a;
    }
}
