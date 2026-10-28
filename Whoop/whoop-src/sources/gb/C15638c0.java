package gb;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import p005a3.C0231n1;
import p040c0.InterfaceC3764o;
import p098dt.AbstractC12350b;
import p114eb.C12982q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p634y1.C39031d;
import p634y1.InterfaceC39030c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15638c0 extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC39030c f58688w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f58689x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28670t2 f58690y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15638c0(C39031d c39031d, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2) {
        super(4);
        this.f58688w = c39031d;
        this.f58689x = interfaceC28601c1;
        this.f58690y = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        InterfaceC3764o interfaceC3764o = (InterfaceC3764o) obj;
        C12982q c12982q = (C12982q) obj2;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.f58689x.getValue()).booleanValue()) {
            List list = (List) this.f58690y.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!AbstractC22676k.m65745e(c12982q, (C12982q) objPrevious));
            c12982q = (C12982q) objPrevious;
        }
        if (c12982q != null) {
            AbstractC12350b.m34580b(c12982q, this.f58688w, AbstractC37817c.m121344e(-1263531443, composer, new C0231n1(4, c12982q, interfaceC3764o)), composer, 384);
        }
        return C23454a0.f92919a;
    }
}
