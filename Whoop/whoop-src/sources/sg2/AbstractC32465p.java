package sg2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
import c93.InterfaceC4354p;
import com.whoop.bot.settings.C6078h;
import gb1.AbstractC15674c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.C25272z;
import n71.AbstractC26434o;
import n71.C26436q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p292l1.C23206y1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p700bd1.C3101s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q81.C30047e;
import rg2.AbstractC31402n;
import w41.AbstractC36800a;
import w41.C36823w;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sg2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001c\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, m65681d2 = {"Lrg2/n;", "backgroundState", "", "hasStatusMessage", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "j", "(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lw41/w;", "userLocation", "p", "(Lw41/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "r", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Ln71/q;", "hrState", "", "contentAlpha", "n", "(Ln71/q;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "l", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "horizontal", "top", "s", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "a", "F", "preSessionBackgroundTopFadeHeight", "b", "preSessionBackgroundBottomFadeHeight", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32465p {

    /* JADX INFO: renamed from: a */
    private static final float f134453a;

    /* JADX INFO: renamed from: b */
    private static final float f134454b;

    static {
        float f13 = 4;
        f134453a = 120 * f13;
        f134454b = 35 * f13;
    }

    /* JADX INFO: renamed from: h */
    private static final void m101387h(AbstractC31402n abstractC31402n, boolean z4, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-409958016);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC31402n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = z4 ? 0.55f : 0.7f;
            if (abstractC31402n instanceof AbstractC31402n.c) {
                c28655q.m87150e0(1167350291);
                C36823w userLocation = ((AbstractC31402n.c) abstractC31402n).getUserLocation();
                if (!z4) {
                    f13 = 1.0f;
                }
                m101395p(userLocation, AbstractC34132o.m107879c(f13, modifier), c28655q, C36823w.f157507c);
                c28655q.m87173q(false);
            } else if (abstractC31402n instanceof AbstractC31402n.b) {
                c28655q.m87150e0(1167357988);
                m101393n(((AbstractC31402n.b) abstractC31402n).getState(), f13, modifier, c28655q, (i14 & 896) | C26436q.f105013d);
                c28655q.m87173q(false);
            } else {
                if (!AbstractC22676k.m65745e(abstractC31402n, AbstractC31402n.a.f129244a)) {
                    throw AbstractC11895b.m32003v(1167348223, c28655q, false);
                }
                c28655q.m87150e0(1167365112);
                m101391l(f13, modifier, c28655q, (i14 >> 3) & 112);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(abstractC31402n, z4, modifier, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m101388i(AbstractC31402n abstractC31402n, boolean z4, Modifier modifier, int i13, Composer composer, int i14) {
        m101387h(abstractC31402n, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m101389j(AbstractC31402n backgroundState, boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        Modifier modifier2;
        int i17;
        boolean z14;
        boolean z15;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(backgroundState, "backgroundState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1236287485);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(backgroundState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    modifier2 = modifier;
                    if (c28655q.m87153g(modifier2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        z13 = false;
                    }
                    c2314t = C2314t.f9131w;
                    if (i16 != 0) {
                        modifier2 = c2314t;
                    }
                    float f13 = 2 * 8;
                    Modifier modifierM101397r = m101397r(AbstractC1102d.m3407d(1.0f, m101398s(modifier2, f13, f13)));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM101397r);
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
                    m101387h(backgroundState, z13, AbstractC1102d.m3407d(1.0f, c2314t), c28655q, (i15 & 112) | (i15 & 14) | 384);
                    if (z13) {
                        c28655q.m87150e0(-37073652);
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "pre_session_background_status_message_scrim"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30(), AbstractC17918w0.f69621a), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-36828597);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                z15 = z13;
                modifier3 = modifier2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(backgroundState, z15, modifier3, i13, i14, 29);
                }
            }
            i15 |= 384;
            modifier2 = modifier;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z13 = false;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                float f14 = 2 * 8;
                Modifier modifierM101397r2 = m101397r(AbstractC1102d.m3407d(1.0f, m101398s(modifier2, f14, f14)));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM101397r2);
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
                m101387h(backgroundState, z13, AbstractC1102d.m3407d(1.0f, c2314t), c28655q, (i15 & 112) | (i15 & 14) | 384);
                if (z13) {
                    c28655q.m87150e0(-37073652);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "pre_session_background_status_message_scrim"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30(), AbstractC17918w0.f69621a), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-36828597);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            z15 = z13;
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(backgroundState, z15, modifier3, i13, i14, 29);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                if (c28655q.m87153g(modifier2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z13 = false;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                float f15 = 2 * 8;
                Modifier modifierM101397r3 = m101397r(AbstractC1102d.m3407d(1.0f, m101398s(modifier2, f15, f15)));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM101397r3);
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
                m101387h(backgroundState, z13, AbstractC1102d.m3407d(1.0f, c2314t), c28655q, (i15 & 112) | (i15 & 14) | 384);
                if (z13) {
                    c28655q.m87150e0(-37073652);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "pre_session_background_status_message_scrim"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30(), AbstractC17918w0.f69621a), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-36828597);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            z15 = z13;
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(backgroundState, z15, modifier3, i13, i14, 29);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z13 = false;
            }
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            float f16 = 2 * 8;
            Modifier modifierM101397r4 = m101397r(AbstractC1102d.m3407d(1.0f, m101398s(modifier2, f16, f16)));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM101397r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            m101387h(backgroundState, z13, AbstractC1102d.m3407d(1.0f, c2314t), c28655q, (i15 & 112) | (i15 & 14) | 384);
            if (z13) {
                c28655q.m87150e0(-37073652);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "pre_session_background_status_message_scrim"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30(), AbstractC17918w0.f69621a), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-36828597);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        z15 = z13;
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(backgroundState, z15, modifier3, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m101390k(AbstractC31402n abstractC31402n, boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101389j(abstractC31402n, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m101391l(float f13, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1526204700);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC26434o.m78203B(AbstractC34132o.m107879c(f13, AbstractC1102d.m3407d(1.0f, modifier)), 0L, 0.0f, 0.0f, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3101s(f13, modifier, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m101392m(float f13, Modifier modifier, int i13, Composer composer, int i14) {
        m101391l(f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m101393n(C26436q c26436q, float f13, Modifier modifier, Composer composer, int i13) {
        int i14;
        C26436q c26436q2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-764330557);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c26436q) : c28655q.m87157i(c26436q) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
            C2314t c2314t = C2314t.f9131w;
            int i15 = i14;
            AbstractC26434o.m78203B(AbstractC34132o.m107879c(f13, AbstractC1102d.m3407d(1.0f, c2314t)), 0L, 0.0f, 0.0f, c28655q, 0, 14);
            Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC32471v.m101432Q(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x)), c28655q, 0), 0.0f, 12 * 4, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3392n);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c26436q2 = c26436q;
            AbstractC26434o.m78207F(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 2.0f), c26436q2, c28655q, (C26436q.f105013d << 3) | 6 | ((i15 << 3) & 112), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c26436q2 = c26436q;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C6078h(c26436q2, f13, modifier, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m101394o(C26436q c26436q, float f13, Modifier modifier, int i13, Composer composer, int i14) {
        m101393n(c26436q, f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m101395p(C36823w c36823w, Modifier modifier, Composer composer, int i13) {
        int i14;
        C36823w c36823w2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2131625058);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36823w) : c28655q.m87157i(c36823w) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c36823w2 = c36823w;
            ((InterfaceC4354p) c28655q.m87161k(AbstractC36800a.m117934n())).invoke(AbstractC1102d.m3407d(1.0f, modifier), c36823w2, Boolean.TRUE, C32450a.f134429a.m101331b(), c28655q, Integer.valueOf(((i14 << 3) & 112) | (C36823w.f157507c << 3) | 3456));
        } else {
            c36823w2 = c36823w;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(c36823w2, modifier, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m101396q(C36823w c36823w, Modifier modifier, int i13, Composer composer, int i14) {
        m101395p(c36823w, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final Modifier m101397r(Modifier modifier) {
        return AbstractC15674c.m44081e(AbstractC15674c.m44085i(modifier, f134453a, null, 2, null), f134454b);
    }

    /* JADX INFO: renamed from: s */
    private static final Modifier m101398s(Modifier modifier, final float f13, final float f14) {
        return AbstractC1131a.m3498b(modifier, new Function3() { // from class: sg2.n
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC32465p.m101399t(f13, f14, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC39130s0 m101399t(float f13, float f14, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        int iMo724F = layout.mo724F(f13);
        int iMo724F2 = layout.mo724F(f14);
        int iM124765i = (iMo724F * 2) + C39169a.m124765i(c39169a.f168407a);
        long j7 = c39169a.f168407a;
        int iM124764h = C39169a.m124764h(j7) + iMo724F2;
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(C39169a.m124757a(iM124765i, iM124765i, iM124764h, iM124764h));
        return layout.mo86822W(C39169a.m124765i(j7), C39169a.m124764h(j7), C25272z.f99163w, new C23206y1(abstractC39104j1Mo448T, iMo724F, iMo724F2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m101400u(AbstractC39104j1 abstractC39104j1, int i13, int i14, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, -i13, -i14, 0.0f);
        return C23454a0.f92919a;
    }
}
