package y71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hy0.C17807z0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn2.C38485d;

/* JADX INFO: renamed from: y71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ly71/o;", "state", "Ly71/l$a;", "alignment", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "isPressed", "isSelected", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39273f {
    /* JADX INFO: renamed from: d */
    public static final void m125126d(C39282o state, AbstractC39279l.a alignment, Modifier modifier, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        long jM95624D;
        long jM53358D;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1242534290);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(alignment) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onClick) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i, c28655q2, 6);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            m125129g(interfaceC28601c1, m125127e(interfaceC28601c1M44460m) || state.getSelected());
            if (m125128f(interfaceC28601c1)) {
                c28655q2.m87150e0(-74530344);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(-74529259);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
            }
            if (m125128f(interfaceC28601c1)) {
                c28655q2.m87150e0(-74527240);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(-74526152);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            }
            if (m125128f(interfaceC28601c1)) {
                c28655q2.m87150e0(-74523848);
                jM53358D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(-74522763);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, 6, false);
            }
            long j7 = jM53358D;
            float f13 = state.getEnabled() ? 1.0f : 0.2f;
            boolean enabled = state.getEnabled();
            float f14 = f13;
            C18027i c18027i = new C18027i(0);
            boolean z4 = (i14 & 7168) == 2048;
            Object objM87133R3 = c28655q2.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C39272e(onClick, 0);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC34132o.m107879c(f14, AbstractC1092a.m3360e(modifier, interfaceC21083i, null, enabled, c18027i, (InterfaceC4339a) objM87133R3, 8)), AbstractC33253j.m105489e(1 * 4), jM95628d, null, 0, AbstractC37817c.m121344e(-2039185685, c28655q2, new C17807z0(state, jM95624D, alignment, j7)), c28655q, 1769472, 24);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38485d(state, (AbstractC39279l) alignment, modifier, onClick, i13, 27);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m125127e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m125128f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m125129g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m125130h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m125131i(C39282o c39282o, long j7, AbstractC39279l.a aVar, long j13, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * 8, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c39282o.getTitle(), c28655q, 0);
            C36775k c36775k = new C36775k(3);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getDescription(), c28655q, 0), null, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q, 0, 0, 196090);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m125132j(C39282o c39282o, AbstractC39279l.a aVar, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m125126d(c39282o, aVar, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
