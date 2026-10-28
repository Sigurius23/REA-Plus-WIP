package x30;

import bg.C3215j;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import g40.AbstractC15321a3;
import g40.C15329c;
import g40.C15333c3;
import g40.InterfaceC15455z2;
import java.util.LinkedHashMap;
import java.util.Map;
import l40.C23328a;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import n53.C26318e;
import n83.C26460c;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.C37722h1;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w30.C36784a;
import w30.InterfaceC36786c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x30.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C37932v extends AbstractC15321a3 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC36786c f162395b;

    /* JADX INFO: renamed from: c */
    public final C37928t f162396c;

    /* JADX INFO: renamed from: d */
    public final boolean f162397d;

    public C37932v(IdentifierSpec identifierSpec, C41193o cardAccountRangeRepositoryFactory, LinkedHashMap linkedHashMap, boolean z4, InterfaceC36786c cbcEligibility, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter) {
        C37928t c37928t = new C37928t(cardAccountRangeRepositoryFactory, linkedHashMap, z4, cbcEligibility, cardBrandFilter, cardFundingFilter);
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        super(identifierSpec);
        this.f162395b = cbcEligibility;
        this.f162396c = c37928t;
        this.f162397d = true;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        this.f162396c.mo43558b(z4);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162397d;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        C37928t c37928t = this.f162396c;
        C15333c3 c15333c3 = c37928t.f162384b;
        C15333c3 c15333c4 = c37928t.f162387e;
        C37940z c37940z = c37928t.f162385c;
        if (c15333c3 != null) {
            final int i13 = 0;
            c26460cM119000x.add(AbstractC3269g.m9484M(c15333c3.f57610c.mo43564j(), new Function1(this) { // from class: x30.u

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C37932v f162393x;

                {
                    this.f162393x = this;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C23328a it = (C23328a) obj;
                    switch (i13) {
                        case 0:
                            AbstractC22676k.m65750j(it, "it");
                            return new C23465k(this.f162393x.f162396c.f162384b.f57609b, it);
                        case 1:
                            AbstractC22676k.m65750j(it, "it");
                            return new C23465k(this.f162393x.f162396c.f162385c.f57596a, it);
                        default:
                            AbstractC22676k.m65750j(it, "it");
                            return new C23465k(this.f162393x.f162396c.f162386d.f57596a, it);
                    }
                }
            }));
        }
        final int i14 = 1;
        c26460cM119000x.add(AbstractC3269g.m9484M(c37940z.f162419c.f162345D, new Function1(this) { // from class: x30.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C37932v f162393x;

            {
                this.f162393x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C23328a it = (C23328a) obj;
                switch (i14) {
                    case 0:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162384b.f57609b, it);
                    case 1:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162385c.f57596a, it);
                    default:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162386d.f57596a, it);
                }
            }
        }));
        final int i15 = 2;
        c26460cM119000x.add(AbstractC3269g.m9484M(c37928t.f162386d.f162235c.f162224q, new Function1(this) { // from class: x30.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C37932v f162393x;

            {
                this.f162393x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C23328a it = (C23328a) obj;
                switch (i15) {
                    case 0:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162384b.f57609b, it);
                    case 1:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162385c.f57596a, it);
                    default:
                        AbstractC22676k.m65750j(it, "it");
                        return new C23465k(this.f162393x.f162396c.f162386d.f57596a, it);
                }
            }
        }));
        c26460cM119000x.add(AbstractC3269g.m9484M(c37940z.f162419c.f162366u, new C37722h1(5)));
        if (this.f162395b instanceof C36784a) {
            c26460cM119000x.add(AbstractC3269g.m9484M(c37940z.f162419c.f162364s, new C37722h1(6)));
        }
        c26460cM119000x.add(AbstractC3269g.m9484M(c15333c4.f57610c.mo43564j(), new C37722h1(7)));
        c26460cM119000x.add(AbstractC3269g.m9484M(c15333c4.f57610c.mo43564j(), new C37722h1(8)));
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        return new C26318e(c26460cM118988k.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25265s.m74093D1(C25271y.f99162w)) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(c26460cM118988k).toArray(new InterfaceC13058l[0]), 13), new C3215j(c26460cM118988k, 18));
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43538f() {
        C37928t c37928t = this.f162396c;
        C15333c3 c15333c3 = c37928t.f162384b;
        IdentifierSpec identifierSpec = c15333c3 != null ? c15333c3.f57609b : null;
        IdentifierSpec identifierSpec2 = c37928t.f162385c.f57596a;
        IdentifierSpec identifierSpec3 = c37928t.f162387e.f57609b;
        IdentifierSpec identifierSpec4 = c37928t.f162386d.f57596a;
        IdentifierSpec.Companion.getClass();
        return AbstractC3269g.m9493Z(AbstractC25260n.m74077r0(new IdentifierSpec[]{identifierSpec, identifierSpec2, identifierSpec3, identifierSpec4, IdentifierSpec.CardBrand, this.f162395b instanceof C36784a ? IdentifierSpec.PreferredCardBrand : null}));
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return this.f162396c;
    }
}
