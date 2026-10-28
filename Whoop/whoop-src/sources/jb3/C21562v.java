package jb3;

import cb3.AbstractC4393e;
import e93.AbstractC12889b;
import fa3.C14328u;
import hb3.C17118h0;
import hb3.C17122k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb3.C22342k;
import lb3.EnumC23776g1;
import m83.AbstractC25267u;
import p249jc.AbstractC21598x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30120b1;
import qa3.C30171w0;
import qa3.EnumC30117a1;
import r93.C31161v0;
import r93.InterfaceC31135k;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34668c;
import va3.C35850h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jb3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C21562v extends AbstractC34668c {

    /* JADX INFO: renamed from: L */
    public final C17122k f82699L;

    /* JADX INFO: renamed from: M */
    public final C30120b1 f82700M;

    /* JADX INFO: renamed from: N */
    public final C21541a f82701N;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21562v(C17122k c17122k, C30120b1 c30120b1, int i13) {
        EnumC23776g1 enumC23776g1;
        C22342k c22342k = c17122k.f65760a.f65735a;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        C35850h c35850hM36240F = AbstractC12889b.m36240F(c17122k.f65761b, c30120b1.f123010E);
        EnumC30117a1 enumC30117a1 = c30120b1.f123012G;
        AbstractC22676k.m65749i(enumC30117a1, "getVariance(...)");
        int iOrdinal = enumC30117a1.ordinal();
        if (iOrdinal == 0) {
            enumC23776g1 = EnumC23776g1.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            enumC23776g1 = EnumC23776g1.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC23776g1 = EnumC23776g1.INVARIANT;
        }
        EnumC23776g1 enumC23776g2 = enumC23776g1;
        super(c22342k, interfaceC31135k, C32305g.f133684a, c35850hM36240F, enumC23776g2, c30120b1.f123011F, i13, C31161v0.f128379x);
        this.f82699L = c17122k;
        this.f82700M = c30120b1;
        this.f82701N = new C21541a(c22342k, new C14328u(this, 5));
    }

    @Override // u93.AbstractC34680i
    /* JADX INFO: renamed from: K0 */
    public final List mo60483K0() {
        C17122k c17122k = this.f82699L;
        List listM60642A0 = AbstractC21598x.m60642A0(this.f82700M, c17122k.f65763d);
        if (listM60642A0.isEmpty()) {
            return AbstractC37056f.m118958J(AbstractC4393e.m13807e(this).m83826n());
        }
        List list = listM60642A0;
        C17118h0 c17118h0 = c17122k.f65767h;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c17118h0.m48362g((C30171w0) it.next()));
        }
        return arrayList;
    }

    @Override // al.AbstractC0954a, s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return this.f82701N;
    }
}
