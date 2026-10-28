package p21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hy0.AbstractC17746g1;
import hy0.EnumC17775o1;
import is0.C20894m;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25537e;
import mh.C25540h;
import mh.C25542j;
import mh.C25547o;
import mh.InterfaceC25541i;
import no.nordicsemi.android.dfu.DfuBaseService;
import of2.C27900d;
import ou1.C28376a;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import pf.AbstractC29125c;
import ph.C29227a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010 \u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lp21/f;", "cardSize", "A", "(Landroidx/compose/ui/Modifier;Lp21/f;)Landroidx/compose/ui/Modifier;", "modifier", "Lp21/g;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "l", "(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "tag", "Lhy0/o1;", "tagStyle", "j", "(Lcom/whoop/design/util/TextResource;Lhy0/o1;Landroidx/compose/runtime/Composer;I)V", "", "showPlayIcon", "title", "subTitle", "v", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "color", "tint", "", "icon", "Ly3/f;", "iconSize", "x", "(JJIFLandroidx/compose/runtime/Composer;II)V", "isPressed", "imageModifier", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28752e {

    /* JADX INFO: renamed from: p21.e$a */
    @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"p21/e$a", "Lmh/i;", "Lmh/j;", "request", "Ll83/a0;", "b", "(Lmh/j;)V", "c", "Lmh/e;", "result", "d", "(Lmh/j;Lmh/e;)V", "Lmh/o;", "a", "(Lmh/j;Lmh/o;)V", "coil-base_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC25541i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f116451a;

        public a(InterfaceC28601c1 interfaceC28601c1) {
            this.f116451a = interfaceC28601c1;
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: a */
        public void mo9379a(C25542j request, C25547o result) {
            AbstractC28752e.m87507s(this.f116451a, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: b */
        public void mo9380b(C25542j request) {
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: c */
        public void mo9381c(C25542j request) {
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: d */
        public void mo9382d(C25542j request, C25537e result) {
        }
    }

    /* JADX INFO: renamed from: A */
    private static final Modifier m87488A(Modifier modifier, InterfaceC28753f interfaceC28753f) {
        if (interfaceC28753f instanceof InterfaceC28753f.a) {
            InterfaceC28753f.a aVar = (InterfaceC28753f.a) interfaceC28753f;
            return AbstractC1102d.m3424u(aVar.getWidth(), AbstractC1102d.m3411h(aVar.getHeight(), modifier));
        }
        if (interfaceC28753f instanceof InterfaceC28753f.c) {
            return AbstractC1102d.m3411h(((InterfaceC28753f.c) interfaceC28753f).getHeight(), modifier);
        }
        if (AbstractC22676k.m65745e(interfaceC28753f, InterfaceC28753f.b.f116454a)) {
            return AbstractC1099a.m3384f(modifier, false, 1.56f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    private static final void m87498j(TextResource textResource, EnumC17775o1 enumC17775o1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2074970808);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC17775o1.ordinal()) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC17746g1.m50874j(textResource, C38072d.f163053a.m121949b(c28655q, 6).getBlack30(), null, 0L, null, false, null, null, 0.0f, enumC17775o1, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, (i14 & 14) | ((i14 << 24) & 1879048192), 0, 0, 8388092);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(textResource, enumC17775o1, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87499k(TextResource textResource, EnumC17775o1 enumC17775o1, int i13, Composer composer, int i14) {
        m87498j(textResource, enumC17775o1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m87500l(Modifier modifier, C28754g state, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        InterfaceC21083i interfaceC21083i;
        float f13;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1137323519);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C28376a(10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                if (m87502n(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6)) || !state.getShowPlayIcon()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                Modifier modifierM87488A = m87488A(modifier4, state.getCardSize());
                C18027i c18027i = new C18027i(0);
                boolean zM87157i = c28655q.m87157i(state);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C28448b(9, state, interfaceC4339a4);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3360e(modifierM87488A, interfaceC21083i, null, false, c18027i, (InterfaceC4339a) objM87133R2, 12), AbstractC33253j.m105489e(1 * 4), C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), null, 0, AbstractC37817c.m121344e(-1177857310, c28655q, new C20894m(f13, state, 1)), c28655q, 1769472, 24);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f((Object) modifier3, (Object) state, interfaceC4339a3, i13, i14, 8);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C28376a(10);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            if (m87502n(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6))) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f;
            }
            Modifier modifierM87488A2 = m87488A(modifier4, state.getCardSize());
            C18027i c18027i2 = new C18027i(0);
            boolean zM87157i2 = c28655q.m87157i(state);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C28448b(9, state, interfaceC4339a4);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C28448b(9, state, interfaceC4339a4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3360e(modifierM87488A2, interfaceC21083i, null, false, c18027i2, (InterfaceC4339a) objM87133R2, 12), AbstractC33253j.m105489e(1 * 4), C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), null, 0, AbstractC37817c.m121344e(-1177857310, c28655q, new C20894m(f13, state, 1)), c28655q, 1769472, 24);
            modifier3 = modifier4;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f((Object) modifier3, (Object) state, interfaceC4339a3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m87501m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m87502n(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m87503o(C28754g c28754g, InterfaceC4339a interfaceC4339a) {
        if (c28754g.getShowPlayIcon()) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m87504p(float f13, C28754g c28754g, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(-254446408, c28655q, new C28749b(f13, c28754g)), c28655q, 3072, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            c28655q.m87150e0(1980978201);
            TextResource textResourceM87523g = c28754g.getTag();
            if (textResourceM87523g == null) {
                c28655q.m87150e0(1848796586);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1848796587);
                m87498j(textResourceM87523g, c28754g.getTagStyle(), c28655q, 0);
                c28655q.m87173q(false);
            }
            m87510v(c28754g.getShowPlayIcon(), c28754g.getTitle(), c28754g.getSubTitle(), c28655q, 0);
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m87505q(float f13, C28754g c28754g, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        String strM21274h;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            C1101c c1101c = (C1101c) BoxWithConstraints;
            int iMo743q0 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3403d());
            int iMo743q1 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3402c());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(AbstractC1102d.m3419p(120, C2314t.f9131w));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM107879c = AbstractC34132o.m107879c(f13, C1100b.f4583a.mo3400a(m87506r(interfaceC28601c1), C2299e.f9102E));
            AbstractC22403o abstractC22403oM87520c = c28754g.getImageSource();
            boolean zM87149e = c28655q.m87149e(iMo743q0) | c28655q.m87149e(iMo743q1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87149e || objM87133R2 == c28676v0) {
                objM87133R2 = new C28751d(iMo743q0, iMo743q1, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM87520c, null, (Function1) objM87133R2, c28655q, 0, 1);
            TextResource textResourceM87519b = c28754g.getImageContentDescription();
            if (textResourceM87519b == null) {
                c28655q.m87150e0(405296721);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(405296722);
                strM21274h = AbstractC8693b.m21274h(textResourceM87519b, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, strM21274h, modifierM107879c, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final Modifier m87506r(InterfaceC28601c1 interfaceC28601c1) {
        return (Modifier) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m87507s(InterfaceC28601c1 interfaceC28601c1, Modifier modifier) {
        interfaceC28601c1.setValue(modifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m87508t(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d(i13, i14);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        rememberImagePainter.f100081e = new a(interfaceC28601c1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m87509u(Modifier modifier, C28754g c28754g, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m87500l(modifier, c28754g, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r6v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 ??, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 ??, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v18 x81.d, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    private static final void m87510v(boolean z4, TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-243728682);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8;
            float f14 = 3 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), 2 * f13, 0.0f, f14, 0.0f, 10), 0.0f, f14, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int i15 = i14;
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (textResource == null) {
                c28655q.m87150e0(-1139080645);
                z13 = false;
                c28655q.m87173q(false);
            } else {
                z13 = false;
                c28655q.m87150e0(-1139080644);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i15 >> 3) & 14);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            }
            if (textResource2 == null) {
                c28655q = c28655q;
                c28655q.m87150e0(-1138814758);
                c28655q.m87173q(z13);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(-1138814757);
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, (i15 >> 6) & 14);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, r7).getSh5(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            if (z4) {
                c28655q.m87150e0(1948914026);
                m87512x(0L, 0L, 0, 0.0f, c28655q, 0, 15);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1948956310);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(z4, textResource, textResource2, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m87511w(boolean z4, TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m87510v(z4, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac A[PHI: r0 r2 r4 r6
      0x00ac: PHI (r0v17 int) = (r0v11 int), (r0v20 int), (r0v21 int) binds: [B:75:0x00e3, B:63:0x00a8, B:64:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r2v7 long) = (r2v2 long), (r2v1 long), (r2v1 long) binds: [B:75:0x00e3, B:63:0x00a8, B:64:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r4v8 long) = (r4v3 long), (r4v2 long), (r4v2 long) binds: [B:75:0x00e3, B:63:0x00a8, B:64:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v12 int) = (r6v5 int), (r6v2 int), (r6v2 int) binds: [B:75:0x00e3, B:63:0x00a8, B:64:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x017b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public static final void m87512x(long j7, long j13, int i13, float f13, Composer composer, final int i14, final int i15) {
        long black70;
        int i16;
        long brandWhite;
        int iM46238p;
        float f14;
        boolean z4;
        final long j14;
        final long j15;
        final int i17;
        final float f15;
        C28677v1 c28677v1M87180u;
        int i18;
        float f16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(201882578);
        if ((i14 & 6) == 0) {
            black70 = j7;
            i16 = (((i15 & 1) == 0 && c28655q.m87151f(black70)) ? 4 : 2) | i14;
        } else {
            black70 = j7;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                brandWhite = j13;
                int i19 = c28655q.m87151f(brandWhite) ? 32 : 16;
                i16 |= i19;
            } else {
                brandWhite = j13;
            }
            i16 |= i19;
        } else {
            brandWhite = j13;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                iM46238p = i13;
                int i24 = c28655q.m87149e(iM46238p) ? 256 : 128;
                i16 |= i24;
            } else {
                iM46238p = i13;
            }
            i16 |= i24;
        } else {
            iM46238p = i13;
        }
        int i25 = i15 & 8;
        if (i25 == 0) {
            if ((i14 & 3072) == 0) {
                f14 = f13;
                i16 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0 || c28655q.m87118C()) {
                    if ((i15 & 1) != 0) {
                        black70 = C38072d.f163053a.m121949b(c28655q, 6).getBlack70();
                        i16 &= -15;
                    }
                    if ((i15 & 2) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        iM46238p = C38072d.f163053a.m121951d().getTinyIcons().getPlay();
                        i16 &= -897;
                    }
                    if (i25 != 0) {
                        i18 = i16;
                        f16 = 6 * 4;
                    }
                    c28655q.m87175r();
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(12 * 4, c2314t), black70, AbstractC33253j.f138651a);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    long j16 = brandWhite;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM46238p, c28655q, ((i18 >> 3) & 112) | 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62243H1), AbstractC1102d.m3419p(f16, c2314t), j16, c28655q, (i18 << 6) & 7168, 0);
                    c28655q.m87173q(true);
                    j14 = black70;
                    i17 = iM46238p;
                    j15 = j16;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    if ((i15 & 1) != 0) {
                        i16 &= -15;
                    }
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                    }
                }
                i18 = i16;
                f16 = f14;
                c28655q.m87175r();
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3419p(12 * 4, c2314t2), black70, AbstractC33253j.f138651a);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                long j17 = brandWhite;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM46238p, c28655q, ((i18 >> 3) & 112) | 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62243H1), AbstractC1102d.m3419p(f16, c2314t2), j17, c28655q, (i18 << 6) & 7168, 0);
                c28655q.m87173q(true);
                j14 = black70;
                i17 = iM46238p;
                j15 = j17;
                f15 = f16;
            } else {
                c28655q.m87138X();
                j14 = black70;
                j15 = brandWhite;
                i17 = iM46238p;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p21.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC28752e.m87513y(j14, j15, i17, f15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        f14 = f13;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if ((i15 & 1) != 0) {
                    black70 = C38072d.f163053a.m121949b(c28655q, 6).getBlack70();
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    iM46238p = C38072d.f163053a.m121951d().getTinyIcons().getPlay();
                    i16 &= -897;
                }
                if (i25 != 0) {
                    i18 = i16;
                    f16 = 6 * 4;
                } else {
                    i18 = i16;
                    f16 = f14;
                }
            } else {
                if ((i15 & 1) != 0) {
                    black70 = C38072d.f163053a.m121949b(c28655q, 6).getBlack70();
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    iM46238p = C38072d.f163053a.m121951d().getTinyIcons().getPlay();
                    i16 &= -897;
                }
                if (i25 != 0) {
                    i18 = i16;
                    f16 = 6 * 4;
                } else {
                    i18 = i16;
                    f16 = f14;
                }
            }
            c28655q.m87175r();
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1102d.m3419p(12 * 4, c2314t3), black70, AbstractC33253j.f138651a);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            long j18 = brandWhite;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM46238p, c28655q, ((i18 >> 3) & 112) | 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62243H1), AbstractC1102d.m3419p(f16, c2314t3), j18, c28655q, (i18 << 6) & 7168, 0);
            c28655q.m87173q(true);
            j14 = black70;
            i17 = iM46238p;
            j15 = j18;
            f15 = f16;
        } else {
            c28655q.m87138X();
            j14 = black70;
            j15 = brandWhite;
            i17 = iM46238p;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p21.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28752e.m87513y(j14, j15, i17, f15, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m87513y(long j7, long j13, int i13, float f13, int i14, int i15, Composer composer, int i16) {
        m87512x(j7, j13, i13, f13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
