package c41;

import a31.C0343e;
import a80.C0539c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bo2.C3509a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import hy0.AbstractC17808z1;
import i41.AbstractC18081a;
import i41.C18084d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.InterfaceC13832v0;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.v2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\n\u001a#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lc41/w2;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "m", "(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "k", "(Lc41/w2;Landroidx/compose/runtime/Composer;I)V", "r", "t", "i", "Li41/d;", "trendBarViewState", "", "placeHolderMsg", "Ly3/f;", "v", "(Li41/d;Ljava/lang/String;)F", "x", "(Lc41/w2;)F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4134v2 {
    /* JADX INFO: renamed from: i */
    public static final void m12808i(C4141w2 state, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        boolean z4;
        C2314t c2314t;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2019231776);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C18084d c18084dM12883m = state.getTrendBarViewState();
            C2314t c2314t2 = C2314t.f9131w;
            if (c18084dM12883m == null) {
                c28655q2.m87150e0(378189964);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(378189965);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(m12823x(state), c2314t2));
                AbstractC18081a.m51920b(c18084dM12883m, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            C4148x2 c4148x2M12882l = state.getTrend();
            if (c4148x2M12882l == null) {
                c28655q2.m87150e0(378327449);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                c2314t = c2314t2;
                z4 = false;
            } else {
                c28655q2.m87150e0(378327450);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(3 * 4, c2314t2));
                z4 = false;
                c2314t = c2314t2;
                AbstractC17808z1.m51177e(c4148x2M12882l.getTrendText(), true, c4148x2M12882l.getTrendType(), false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, 48, 0, 32760);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            String strM12879i = state.getPlaceHolderMessage();
            if (strM12879i == null) {
                c28655q.m87150e0(378558647);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(378558648);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(m12822w(state), c2314t));
                C38072d c38072d = C38072d.f163053a;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(strM12879i, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q3, 0, 0, 196602);
                c28655q = c28655q3;
                c28655q.m87173q(z4);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4127u2(state, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12809j(C4141w2 c4141w2, int i13, Composer composer, int i14) {
        m12808i(c4141w2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m12810k(C4141w2 c4141w2, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C17919x c17919xM31989h;
        long jM95624D;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-676372782);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4141w2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c4141w2.getIcon(), c28655q, 6);
            EnumC39333f enumC39333fM12876f = c4141w2.getIconColor();
            if (enumC39333fM12876f == null) {
                c28655q.m87150e0(-1207626504);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-1424429015);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM12876f.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(-1424427712);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1424429510);
                c28655q.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3415l(20, AbstractC1099a.m3398t(AbstractC1102d.m3415l(7 * 4, c2314t), 0.0f, 0.0f, 1 * 8, 0.0f, 11)), jM95624D, c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4141w2.getTitle(), c28655q, 0), null, c4141w2.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4127u2(c4141w2, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12811l(C4141w2 c4141w2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m12810k(c4141w2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m12812m(C4141w2 state, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(828200542);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3509a(18);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                    C18027i c18027i = new C18027i(0);
                    z13 = (i15 & 896) == 256;
                    objM87133R2 = c28655q2.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0343e(interfaceC4339a4, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i, interfaceC13832v0, false, c18027i, (InterfaceC4339a) objM87133R2, 12), null, state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-446926642, c28655q2, new C0539c(state, 25)), c28655q, 12582912, 122);
                    interfaceC4339a3 = interfaceC4339a4;
                    modifier2 = modifier3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(i13, i14, 3, modifier2, interfaceC4339a3, state);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3509a(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                C18027i c18027i2 = new C18027i(0);
                if ((i15 & 896) == 256) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C0343e(interfaceC4339a4, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0343e(interfaceC4339a4, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i2, interfaceC13832v1, false, c18027i2, (InterfaceC4339a) objM87133R2, 12), null, state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-446926642, c28655q2, new C0539c(state, 25)), c28655q, 12582912, 122);
                interfaceC4339a3 = interfaceC4339a4;
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 3, modifier2, interfaceC4339a3, state);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3509a(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                C18027i c18027i3 = new C18027i(0);
                if ((i15 & 896) == 256) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C0343e(interfaceC4339a4, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0343e(interfaceC4339a4, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i3, interfaceC13832v2, false, c18027i3, (InterfaceC4339a) objM87133R2, 12), null, state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-446926642, c28655q2, new C0539c(state, 25)), c28655q, 12582912, 122);
                interfaceC4339a3 = interfaceC4339a4;
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 3, modifier2, interfaceC4339a3, state);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3509a(18);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
            C18027i c18027i4 = new C18027i(0);
            if ((i15 & 896) == 256) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C0343e(interfaceC4339a4, 8);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0343e(interfaceC4339a4, 8);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i4, interfaceC13832v3, false, c18027i4, (InterfaceC4339a) objM87133R2, 12), null, state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, null, null, 0.0f, AbstractC37817c.m121344e(-446926642, c28655q2, new C0539c(state, 25)), c28655q, 12582912, 122);
            interfaceC4339a3 = interfaceC4339a4;
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 3, modifier2, interfaceC4339a3, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m12813n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12814o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m12815p(C4141w2 c4141w2, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3424u = AbstractC1102d.m3424u(40 * f13, AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            m12810k(c4141w2, c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3415l(m12821v(c4141w2.getTrendBarViewState(), c4141w2.getPlaceHolderMessage()), c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            m12817r(c4141w2, c28655q, 0);
            if (c4141w2.getUseSmallValueText()) {
                c28655q.m87150e0(-1942848286);
                AbstractC31061c.m95650z(1, f13, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-98714358);
                c28655q.m87173q(false);
            }
            m12808i(c4141w2, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12816q(C4141w2 c4141w2, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m12812m(c4141w2, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m12817r(C4141w2 c4141w2, Composer composer, int i13) {
        int i14;
        C2886a c2886aM8403A;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-191683372);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c4141w2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c4141w2.getMetric(), c28655q, 0);
            if (c4141w2.getPlaceHolderMessage() != null) {
                c28655q.m87150e0(615385970);
                c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getN4();
                c28655q.m87173q(false);
            } else if (c4141w2.getTrendBarViewState() != null) {
                c28655q.m87150e0(615388402);
                c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getT4();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(615389348);
                if (c4141w2.getUseSmallValueText()) {
                    c28655q.m87150e0(615391890);
                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getN5();
                } else {
                    c28655q.m87150e0(615390930);
                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q, 6).getN4();
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h, null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8403A, null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            m12819t(c4141w2, c28655q, i14 & 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4127u2(c4141w2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m12818s(C4141w2 c4141w2, int i13, Composer composer, int i14) {
        m12817r(c4141w2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m12819t(C4141w2 c4141w2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1506064059);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4141w2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC4155y2 abstractC4155y2M12884n = c4141w2.getType();
            boolean zM65745e = AbstractC22676k.m65745e(abstractC4155y2M12884n, AbstractC4155y2.b.f16921a);
            C2314t c2314t = C2314t.f9131w;
            if (zM65745e) {
                c28655q.m87150e0(-1925885294);
                String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l("%"), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                float f13 = ((float) 0.5d) * 8;
                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, f13, 6), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 48, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC4155y2M12884n instanceof AbstractC4155y2.c) {
                c28655q.m87150e0(-1925573124);
                String strM21274h2 = AbstractC8693b.m21274h(((AbstractC4155y2.c) c4141w2.getType()).getSuffix(), c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                C2886a c2886aM8420a = c38072d2.m121952e(c28655q, 6).getB1();
                long jM125430y = c38072d2.m121949b(c28655q, 6).getBrandWhite();
                float f14 = 8;
                float f15 = ((float) 0.5d) * f14;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, 0.0f, 0.0f, 14);
                AbstractC30795n.m94707h(strM21274h2, !c4141w2.getUseSmallValueText() ? modifierM3398t.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7)) : modifierM3398t.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.2d) * f14, 7)), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (!AbstractC22676k.m65745e(abstractC4155y2M12884n, AbstractC4155y2.a.f16920a)) {
                    throw AbstractC11895b.m32003v(76420815, c28655q, false);
                }
                c28655q.m87150e0(76448169);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4127u2(c4141w2, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m12820u(C4141w2 c4141w2, int i13, Composer composer, int i14) {
        m12819t(c4141w2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final float m12821v(C18084d c18084d, String str) {
        if ((c18084d != null ? c18084d.m51924b() : null) == null || str != null) {
            return ((c18084d != null ? c18084d.m51924b() : null) == null || str == null) ? 3 * 4 : 2 * 4;
        }
        float f13 = 4;
        return f13 * f13;
    }

    /* JADX INFO: renamed from: w */
    private static final float m12822w(C4141w2 c4141w2) {
        C18084d c18084dM12883m = c4141w2.getTrendBarViewState();
        return ((c18084dM12883m != null ? c18084dM12883m.m51924b() : null) != null ? (float) 1.5d : 3) * 4;
    }

    /* JADX INFO: renamed from: x */
    private static final float m12823x(C4141w2 c4141w2) {
        return (c4141w2.getPlaceHolderMessage() != null ? (float) 1.5d : 3) * 4;
    }
}
