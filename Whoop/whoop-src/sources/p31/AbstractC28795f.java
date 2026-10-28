package p31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b11.C2276c;
import c41.C4068m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import gb1.AbstractC15693u;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import h01.C16542i;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import java.util.List;
import jp1.C21859k;
import kd1.EnumC22400l;
import l83.C23454a0;
import nm1.C26842g;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import oq1.C28119c;
import org.xmlpull.v1.XmlPullParserException;
import ov2.C28402f;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C14998e7;
import p163g1.C15071l5;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p718lz1.C24823a;
import p725ot1.C28330f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: p31.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lp31/c;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onExpandedChange", "Lp31/d;", "onEvent", "y", "(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp31/h;", "Lkotlin/Function0;", "onDismiss", "t", "(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lp31/b;", "Lkd1/l;", "o", "(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Landroidx/compose/ui/Modifier;", "H", "()Landroidx/compose/ui/Modifier;", "fabTooltipBackgroundModifier", "expanded", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28795f {

    /* JADX INFO: renamed from: a */
    private static final Modifier f116570a;

    static {
        float f13 = 5 * 4;
        C33252i c33252iM105489e = AbstractC33253j.m105489e(f13);
        long j7 = C17919x.f69625b;
        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3391m(AbstractC12889b.m36262a0(C2314t.f9131w, f13, c33252iM105489e, false, C17919x.m51541c(0.6f, j7), C17919x.m51541c(0.6f, j7), 4), (float) (-0.5d), (float) 0.5d), AbstractC17918w0.m51517e(3422552064L), AbstractC33253j.m105489e(f13));
        C17909s c17909s = AbstractC17911t.f69612b;
        f116570a = AbstractC15751g.m44456i(1, AbstractC1092a.m3357b(modifierM3358c, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3426239567L)), new C17919x(AbstractC17918w0.m51517e(4280626484L))), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(f13), 0.0f, 4), AbstractC15693u.m44155b(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1157627903)), new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(AbstractC17918w0.m51515c(16777215))), null, 0, 315.0f, false, 22, null), AbstractC33253j.m105489e(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m87545A(AbstractC28793d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m87546B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m87547C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m87548D(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
        m87547C(interfaceC28601c1, !m87546B(interfaceC28601c1));
        function1.invoke(Boolean.valueOf(m87546B(interfaceC28601c1)));
        if (m87546B(interfaceC28601c1)) {
            function2.invoke(AbstractC28793d.b.f116569a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m87549E(C28792c c28792c, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        int i14;
        long jM31986e;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(m87546B(interfaceC28601c1) ? AbstractC39383f.m125595a(C38072d.f163053a) : C38072d.f163053a.m121951d().getAction().getAdd(), c28655q, 0);
            if (m87546B(interfaceC28601c1)) {
                c28655q.m87150e0(-109982621);
                i14 = AbstractC16277f.f62332h1;
            } else {
                c28655q.m87150e0(-109981310);
                i14 = AbstractC16277f.f62336i1;
            }
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, i14);
            c28655q.m87173q(false);
            if (m87546B(interfaceC28601c1)) {
                c28655q.m87150e0(-109978422);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-109977334);
                jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, null, jM31986e, c28655q, 0, 4);
            if (m87546B(interfaceC28601c1)) {
                c28655q.m87150e0(885734548);
                List<C28791b> listM87539b = c28792c.m87539b();
                if (listM87539b == null) {
                    listM87539b = AbstractC28794e.m87544b(c28792c.getShowAddToJournal(), false, 2, null);
                }
                C28797h c28797h = new C28797h(listM87539b, m87546B(interfaceC28601c1), function1);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16542i(5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                m87572t(c28797h, (InterfaceC4339a) objM87133R, null, c28655q, 48, 4);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(886147778);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m87550F(InterfaceC28601c1 interfaceC28601c1) {
        m87547C(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m87551G(C28792c c28792c, Modifier modifier, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m87577y(c28792c, modifier, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final Modifier m87552H() {
        return f116570a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m87567o(C28791b state, InterfaceC4339a onDismiss, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(284299598);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C28402f(19);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function1;
            }
            boolean z4 = ((i15 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26057j(onDismiss, state, function2, 16);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R2, null, false, null, AbstractC37817c.m121344e(-1273698101, c28655q, new C24823a(state, 11)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(state, onDismiss, function2, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m87568p(EnumC22400l it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m87569q(InterfaceC4339a interfaceC4339a, C28791b c28791b, Function1 function1) {
        interfaceC4339a.invoke();
        if (c28791b.getCtaType() != EnumC22400l.NONE) {
            function1.invoke(c28791b.getCtaType());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m87570r(C28791b c28791b, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c28791b.getIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            long jM125382b1 = c38072d.m121949b(c28655q, 6).getWhite50();
            C2314t c2314t = C2314t.f9131w;
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(6 * 4, c2314t), jM125382b1, c28655q, 432, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(((float) 1.5d) * 8, c2314t));
            AbstractC15011f9.m43114b(AbstractC8693b.m21274h(c28791b.getTitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(c38072d.m121952e(c28655q, 6).getFormLabel().getStyle(), 0L, AbstractC35745c.m113246h(12), null, null, 0L, 0, 0L, null, null, 16777213), c28655q, 0, 0, 65530);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m87571s(C28791b c28791b, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87567o(c28791b, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static final void m87572t(C28797h state, InterfaceC4339a onDismiss, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1180042083);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
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
                AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C17919x.f69636m, 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.m43156a()), null, AbstractC33253j.m105489e(5 * 4), 5), AbstractC37817c.m121344e(-1577662647, c28655q, new C21859k(state, modifier4, onDismiss, 14)), c28655q, 3072, 2);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(state, onDismiss, modifier3, i13, i14, 9);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
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
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C17919x.f69636m, 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.m43156a()), null, AbstractC33253j.m105489e(5 * 4), 5), AbstractC37817c.m121344e(-1577662647, c28655q, new C21859k(state, modifier4, onDismiss, 14)), c28655q, 3072, 2);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(state, onDismiss, modifier3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m87573u(C28797h c28797h, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87579a = c28797h.getExpanded();
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            long jFloatToRawIntBits = Float.floatToRawIntBits(-f14);
            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f14)) & 4294967295L;
            float f15 = 1 * f13;
            AbstractC15002f0.m43105a(zM87579a, interfaceC4339a, AbstractC1099a.m3395q(modifier.mo3471e(f116570a), f15, f15), jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), null, null, AbstractC37817c.m121344e(1939056508, c28655q, new C28119c(2, c28797h, interfaceC4339a)), c28655q, 1575936, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m87574v(C28797h c28797h, InterfaceC4339a interfaceC4339a, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            int i14 = 0;
            for (Object obj : c28797h.m87580b()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C28791b c28791b = (C28791b) obj;
                boolean zM87157i = c28655q.m87157i(c28797h);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C26944e0(c28797h, 26);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function1 = (Function1) objM87133R;
                InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
                m87567o(c28791b, interfaceC4339a2, function1, c28655q, 0, 0);
                if (i14 < c28797h.m87580b().size() - 1) {
                    c28655q.m87150e0(801323181);
                    AbstractC25012a.m73388u(2, 4, C2314t.f9131w, c28655q, false);
                } else {
                    c28655q.m87150e0(801403905);
                    c28655q.m87173q(false);
                }
                i14 = i15;
                interfaceC4339a = interfaceC4339a2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m87575w(C28797h c28797h, EnumC22400l it) {
        AbstractC22676k.m65750j(it, "it");
        c28797h.getOnEvent().invoke(new AbstractC28793d.a(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m87576x(C28797h c28797h, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m87572t(c28797h, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:89:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m87577y(C28792c state, Modifier modifier, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        Function1 function3;
        int i19;
        boolean z4;
        Function1 function4;
        Modifier modifier3;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        long jM95624D;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(922738039);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function3 = function2;
                        if (c28655q.m87157i(function3)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i24 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C26842g(12);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C26842g(13);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (state.getShowButton()) {
                            c28655q.m87150e0(1498481480);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13;
                            objM87133R2 = c28655q.m87133R();
                            if (z15 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                            if (m87546B(interfaceC28601c1)) {
                                c28655q.m87150e0(1988013342);
                                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                            } else {
                                c28655q.m87150e0(1988014337);
                                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                            }
                            AbstractC14983d3.m43104a(interfaceC4339a, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1499929707);
                            c28655q.m87173q(false);
                        }
                        modifier3 = modifier4;
                        function4 = function6;
                        function5 = function7;
                    } else {
                        c28655q.m87138X();
                        function4 = function1;
                        modifier3 = modifier2;
                        function5 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
                    }
                }
                i15 |= 3072;
                function3 = function2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26842g(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26842g(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (state.getShowButton()) {
                        c28655q.m87150e0(1498481480);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        if (m87546B(interfaceC28601c1)) {
                            c28655q.m87150e0(1988013342);
                            jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(1988014337);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        AbstractC14983d3.m43104a(interfaceC4339a2, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1499929707);
                        c28655q.m87173q(false);
                    }
                    modifier3 = modifier4;
                    function4 = function6;
                    function5 = function7;
                } else {
                    c28655q.m87138X();
                    function4 = function1;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
                }
            }
            i15 |= 384;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function2;
                    if (c28655q.m87157i(function3)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26842g(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26842g(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (state.getShowButton()) {
                        c28655q.m87150e0(1498481480);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        if (m87546B(interfaceC28601c1)) {
                            c28655q.m87150e0(1988013342);
                            jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(1988014337);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        AbstractC14983d3.m43104a(interfaceC4339a3, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1499929707);
                        c28655q.m87173q(false);
                    }
                    modifier3 = modifier4;
                    function4 = function6;
                    function5 = function7;
                } else {
                    c28655q.m87138X();
                    function4 = function1;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
                }
            }
            i15 |= 3072;
            function3 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26842g(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26842g(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (state.getShowButton()) {
                    c28655q.m87150e0(1498481480);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    if (m87546B(interfaceC28601c1)) {
                        c28655q.m87150e0(1988013342);
                        jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1988014337);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    AbstractC14983d3.m43104a(interfaceC4339a4, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1499929707);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
                function4 = function6;
                function5 = function7;
            } else {
                c28655q.m87138X();
                function4 = function1;
                modifier3 = modifier2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function2;
                    if (c28655q.m87157i(function3)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26842g(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26842g(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (state.getShowButton()) {
                        c28655q.m87150e0(1498481480);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        if (m87546B(interfaceC28601c1)) {
                            c28655q.m87150e0(1988013342);
                            jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(1988014337);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        AbstractC14983d3.m43104a(interfaceC4339a5, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1499929707);
                        c28655q.m87173q(false);
                    }
                    modifier3 = modifier4;
                    function4 = function6;
                    function5 = function7;
                } else {
                    c28655q.m87138X();
                    function4 = function1;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
                }
            }
            i15 |= 3072;
            function3 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26842g(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26842g(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (state.getShowButton()) {
                    c28655q.m87150e0(1498481480);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    if (m87546B(interfaceC28601c1)) {
                        c28655q.m87150e0(1988013342);
                        jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1988014337);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    AbstractC14983d3.m43104a(interfaceC4339a6, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1499929707);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
                function4 = function6;
                function5 = function7;
            } else {
                c28655q.m87138X();
                function4 = function1;
                modifier3 = modifier2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
            }
        }
        i15 |= 384;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function3 = function2;
                if (c28655q.m87157i(function3)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26842g(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26842g(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (state.getShowButton()) {
                    c28655q.m87150e0(1498481480);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    if (m87546B(interfaceC28601c1)) {
                        c28655q.m87150e0(1988013342);
                        jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1988014337);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    AbstractC14983d3.m43104a(interfaceC4339a7, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1499929707);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
                function4 = function6;
                function5 = function7;
            } else {
                c28655q.m87138X();
                function4 = function1;
                modifier3 = modifier2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
            }
        }
        i15 |= 3072;
        function3 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i24 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C26842g(12);
                    c28655q.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function1;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26842g(13);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function3;
            }
            if (state.getShowButton()) {
                c28655q.m87150e0(1498481480);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getExpanded()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C4068m(function6, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                if (m87546B(interfaceC28601c1)) {
                    c28655q.m87150e0(1988013342);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(1988014337);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                AbstractC14983d3.m43104a(interfaceC4339a8, AbstractC1099a.m3394p(1 * 8, AbstractC31061c.m95629e(modifier4, 3, 4, jM95624D)), false, AbstractC37817c.m121344e(768599776, c28655q, new C14998e7(state, function7, interfaceC28601c1, 2)), c28655q, 24576, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1499929707);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
            function4 = function6;
            function5 = function7;
        } else {
            c28655q.m87138X();
            function4 = function1;
            modifier3 = modifier2;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(state, modifier3, function4, function5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m87578z(boolean z4) {
        return C23454a0.f92919a;
    }
}
