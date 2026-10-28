package p352ny;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import b30.C2570m;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import h20.C16687l;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import n83.C26460c;
import no0.C26944e0;
import nr0.C27072e;
import o73.C27648a;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.C28635l;
import p390p1.C28655q;
import p479s4.AbstractC32131l;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import se.AbstractC32410a;
import se.AbstractC32416g;
import ug.AbstractC34924m;
import x30.AbstractC37891g1;

/* JADX INFO: renamed from: ny.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C27235g extends AbstractC37891g1 {

    /* JADX INFO: renamed from: c */
    public final C2570m f109006c;

    /* JADX INFO: renamed from: d */
    public final List f109007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27235g(C2570m tapToAddHelper, C26460c elements) {
        super(AbstractC27234f.f109005a, true);
        AbstractC22676k.m65750j(tapToAddHelper, "tapToAddHelper");
        AbstractC22676k.m65750j(elements, "elements");
        this.f109006c = tapToAddHelper;
        this.f109007d = elements;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9518y((C13081r1) this.f109006c.f9985F, new C26944e0(this, 7));
    }

    @Override // x30.AbstractC37891g1
    /* JADX INFO: renamed from: g */
    public final void mo82070g(boolean z4, Set hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i13) {
        C28655q c28655q;
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1830264331);
        C16687l c16687l = (C16687l) C27648a.m83597t((C13081r1) this.f109006c.f9985F, c28655q2, 0).getValue();
        c28655q2.m87150e0(-251140824);
        if (c16687l == null) {
            c23454a0 = null;
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC32410a.m101044n(c16687l, true, true, null, null, null, null, c28655q, 432, 120);
            c23454a0 = C23454a0.f92919a;
        }
        c28655q.m87173q(false);
        if (c23454a0 == null) {
            c28655q.m87150e0(-783742833);
            boolean zM87157i = c28655q.m87157i(this);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C27072e(this, 5);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC32416g.m101152i(z4, (InterfaceC4339a) objM87133R, c28655q, i13 & 14);
            float f13 = 24;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3414k(f13, c2314t));
            AbstractC34924m.m110148i(AbstractC30060g.m92103Y(c28655q, R.string.stripe_or_enter_manually), c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3414k(f13, c2314t));
            int i14 = i13 << 3;
            C28655q c28655q3 = c28655q;
            AbstractC32131l.m100070b(hiddenIdentifiers, z4, this.f109007d, identifierSpec, null, c28655q3, ((i13 >> 3) & 14) | (i14 & 112) | (IdentifierSpec.$stable << 9) | (i14 & 7168), 16);
            c28655q = c28655q3;
        }
        c28655q.m87173q(false);
    }
}
