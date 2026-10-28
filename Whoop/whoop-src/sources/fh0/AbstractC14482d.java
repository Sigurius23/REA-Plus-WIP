package fh0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2161b;
import b91.C2886a;
import by1.C3696c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p294l3.C23267m0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fh0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "label", "sublabel", "", "isActive", "isEnabled", "errorMessage", "showError", "Lkotlin/Function0;", "Ll83/a0;", "onToggle", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lt0/i;", "a", "Lt0/i;", "cardShape", "b", "Lcom/whoop/design/util/TextResource;", "previewError", "Li2/t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)Li2/t;", "aiBrush", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14482d {

    /* JADX INFO: renamed from: a */
    private static final C33252i f52879a = AbstractC33253j.m105489e(2 * 4);

    /* JADX INFO: renamed from: b */
    private static final TextResource f52880b = AbstractC8693b.m21278l("Unable to update status. Please try again.");

    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x0222  */
    /* JADX WARN: Code duplicated, block: B:122:0x0226  */
    /* JADX WARN: Code duplicated, block: B:125:0x0233  */
    /* JADX WARN: Code duplicated, block: B:127:0x0241  */
    /* JADX WARN: Code duplicated, block: B:130:0x0253  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:140:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x031e  */
    /* JADX WARN: Code duplicated, block: B:144:0x032c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0334  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:151:0x0422  */
    /* JADX WARN: Code duplicated, block: B:154:0x0429  */
    /* JADX WARN: Code duplicated, block: B:158:0x0431  */
    /* JADX WARN: Code duplicated, block: B:160:0x045e  */
    /* JADX WARN: Code duplicated, block: B:163:0x046c  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0144  */
    /* JADX WARN: Code duplicated, block: B:96:0x0148  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d  */
    /* JADX INFO: renamed from: d */
    public static final void m41361d(Modifier modifier, TextResource label, TextResource textResource, boolean z4, boolean z13, TextResource errorMessage, boolean z14, InterfaceC4339a onToggle, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        TextResource textResource2;
        Modifier modifier2;
        boolean z18;
        boolean z19;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        AbstractC17911t abstractC17911tM41365h;
        int iHashCode;
        C0213j c0213j;
        int i18;
        C0209i c0209i;
        boolean z24;
        C38072d c38072d;
        int i19;
        int iHashCode2;
        boolean z25;
        int iHashCode3;
        C17903p c17903p;
        int iHashCode4;
        int i24;
        int i25;
        int i26;
        boolean z26;
        Object objM87133R;
        int i27;
        boolean zM87157i;
        int i28;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(796699531);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(label) : c28655q.m87157i(label) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i34 = i14 & 16;
        if (i34 == 0) {
            if ((i13 & 24576) == 0) {
                z15 = z13;
                i15 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if ((262144 & i13) == 0) {
                    zM87157i = c28655q.m87153g(errorMessage);
                } else {
                    zM87157i = c28655q.m87157i(errorMessage);
                }
                if (zM87157i) {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i28;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    z16 = z14;
                    if (c28655q.m87155h(z16)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i34 != 0) {
                        z15 = true;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    abstractC17911tM41365h = m41365h(c28655q, 0);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier4 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    i18 = i15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z24 = z15;
                    } else {
                        z24 = z15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        c38072d = C38072d.f163053a;
                        i19 = C38072d.f163054b;
                        boolean z27 = z16;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f2, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                        float f13 = 8;
                        float f14 = 2 * f13;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c, f14, f14);
                        C2306l c2306l = C2299e.f9108K;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                        if (1.0f > 0.0d) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (!z25) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                        if (z4) {
                            c28655q.m87150e0(-2052958412);
                            c28655q.m87173q(false);
                            c17903p = null;
                        } else {
                            C17903p c17903p2 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                            c28655q.m87173q(false);
                            c17903p = c17903p2;
                        }
                        AbstractC29125c.m88522c(abstractC26165aM88500I, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                        C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        i24 = TextResource.$stable;
                        textResource2 = label;
                        String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                        C2886a b6 = c38072d.m121952e(c28655q, i19).getB2();
                        long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
                        i25 = C2886a.f11498d;
                        i26 = i25 << 18;
                        AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, i26, 196602);
                        if (textResource == null) {
                            c28655q.m87150e0(31464596);
                            z26 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(31464597);
                            if (z4) {
                                c28655q.m87150e0(375179556);
                                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                                long j7 = C39183o.f168428c;
                                AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h2, new C23267m0(abstractC17911tM41365h, Float.NaN, j7, null, null, null, null, null, j7, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                                z26 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(375487324);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                                z26 = false;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z26);
                        }
                        AbstractC1090b.m3350e(C23016z.f90757a, z27, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if ((i18 & 29360128) == 8388608) {
                            z26 = true;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z26 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C2161b(onToggle, 26);
                            c28655q.m87172p0(objM87133R);
                        }
                        boolean z28 = z24;
                        AbstractC29641d.m91043e(null, z4, z28, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        z18 = z28;
                        modifier2 = modifier4;
                        z19 = z27;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    boolean z29 = z16;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3409f3, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                    float f15 = 8;
                    float f16 = 2 * f15;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3358c2, f16, f16);
                    C2306l c2306l2 = C2299e.f9108K;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l2, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * f15);
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                    AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                    if (z4) {
                        c28655q.m87150e0(-2052958412);
                        c28655q.m87173q(false);
                        c17903p = null;
                    } else {
                        C17903p c17903p3 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                        c28655q.m87173q(false);
                        c17903p = c17903p3;
                    }
                    AbstractC29125c.m88522c(abstractC26165aM88500I2, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 0.5d, f15, c2305k, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
                    i24 = TextResource.$stable;
                    textResource2 = label;
                    String strM21274h3 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                    C2886a b8 = c38072d.m121952e(c28655q, i19).getB2();
                    long brandWhite2 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    i25 = C2886a.f11498d;
                    i26 = i25 << 18;
                    AbstractC30795n.m94707h(strM21274h3, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q, 0, i26, 196602);
                    if (textResource == null) {
                        c28655q.m87150e0(31464596);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(31464597);
                        if (z4) {
                            c28655q.m87150e0(375179556);
                            String strM21274h4 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                            long j13 = C39183o.f168428c;
                            AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h4, new C23267m0(abstractC17911tM41365h, Float.NaN, j13, null, null, null, null, null, j13, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                            z26 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(375487324);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                            z26 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z26);
                    }
                    AbstractC1090b.m3350e(C23016z.f90757a, z29, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if ((i18 & 29360128) == 8388608) {
                        z26 = true;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z26) {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z210 = z24;
                    AbstractC29641d.m91043e(null, z4, z210, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z210;
                    modifier2 = modifier4;
                    z19 = z29;
                } else {
                    textResource2 = label;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z18 = z15;
                    z19 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14481c(modifier2, textResource2, textResource, z4, z18, errorMessage, z19, onToggle, i13, i14);
                }
            }
            i15 |= 1572864;
            z16 = z14;
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i34 != 0) {
                    z15 = true;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                abstractC17911tM41365h = m41365h(c28655q, 0);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier3);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier5 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                i18 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z24 = z15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    boolean z211 = z16;
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM3409f5, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                    float f17 = 8;
                    float f18 = 2 * f17;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3358c3, f18, f18);
                    C2306l c2306l3 = C2299e.f9108K;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l3, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3395q3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N9);
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(((float) 1.5d) * f17);
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22971kM66746i3, c2306l3, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N10);
                    AbstractC26165a abstractC26165aM88500I3 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                    if (z4) {
                        c28655q.m87150e0(-2052958412);
                        c28655q.m87173q(false);
                        c17903p = null;
                    } else {
                        C17903p c17903p4 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                        c28655q.m87173q(false);
                        c17903p = c17903p4;
                    }
                    AbstractC29125c.m88522c(abstractC26165aM88500I3, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 0.5d, f17, c2305k2, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N11);
                    i24 = TextResource.$stable;
                    textResource2 = label;
                    String strM21274h5 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                    C2886a b14 = c38072d.m121952e(c28655q, i19).getB2();
                    long brandWhite3 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    i25 = C2886a.f11498d;
                    i26 = i25 << 18;
                    AbstractC30795n.m94707h(strM21274h5, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q, 0, i26, 196602);
                    if (textResource == null) {
                        c28655q.m87150e0(31464596);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(31464597);
                        if (z4) {
                            c28655q.m87150e0(375179556);
                            String strM21274h6 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                            long j14 = C39183o.f168428c;
                            AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h6, new C23267m0(abstractC17911tM41365h, Float.NaN, j14, null, null, null, null, null, j14, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                            z26 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(375487324);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                            z26 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z26);
                    }
                    AbstractC1090b.m3350e(C23016z.f90757a, z211, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if ((i18 & 29360128) == 8388608) {
                        z26 = true;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z26) {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z212 = z24;
                    AbstractC29641d.m91043e(null, z4, z212, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z212;
                    modifier2 = modifier5;
                    z19 = z211;
                } else {
                    z24 = z15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N8);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                boolean z213 = z16;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM3409f6, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                float f19 = 8;
                float f110 = 2 * f19;
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM3358c4, f110, f110);
                C2306l c2306l4 = C2299e.f9108K;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l4, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3395q4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N12);
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(((float) 1.5d) * f19);
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22971kM66746i4, c2306l4, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N13);
                AbstractC26165a abstractC26165aM88500I4 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                if (z4) {
                    c28655q.m87150e0(-2052958412);
                    c28655q.m87173q(false);
                    c17903p = null;
                } else {
                    C17903p c17903p5 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                    c28655q.m87173q(false);
                    c17903p = c17903p5;
                }
                AbstractC29125c.m88522c(abstractC26165aM88500I4, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 0.5d, f19, c2305k2, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N14);
                i24 = TextResource.$stable;
                textResource2 = label;
                String strM21274h7 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                C2886a b15 = c38072d.m121952e(c28655q, i19).getB2();
                long brandWhite4 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                i25 = C2886a.f11498d;
                i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21274h7, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q, 0, i26, 196602);
                if (textResource == null) {
                    c28655q.m87150e0(31464596);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(31464597);
                    if (z4) {
                        c28655q.m87150e0(375179556);
                        String strM21274h8 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                        long j15 = C39183o.f168428c;
                        AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h8, new C23267m0(abstractC17911tM41365h, Float.NaN, j15, null, null, null, null, null, j15, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(375487324);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                        z26 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                }
                AbstractC1090b.m3350e(C23016z.f90757a, z213, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if ((i18 & 29360128) == 8388608) {
                    z26 = true;
                }
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z214 = z24;
                AbstractC29641d.m91043e(null, z4, z214, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z214;
                modifier2 = modifier5;
                z19 = z213;
            } else {
                textResource2 = label;
                c28655q.m87138X();
                modifier2 = modifier;
                z18 = z15;
                z19 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14481c(modifier2, textResource2, textResource, z4, z18, errorMessage, z19, onToggle, i13, i14);
            }
        }
        i15 |= 24576;
        z15 = z13;
        if ((196608 & i13) == 0) {
            if ((262144 & i13) == 0) {
                zM87157i = c28655q.m87153g(errorMessage);
            } else {
                zM87157i = c28655q.m87157i(errorMessage);
            }
            if (zM87157i) {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i28;
        }
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                z16 = z14;
                if (c28655q.m87155h(z16)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i34 != 0) {
                    z15 = true;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                abstractC17911tM41365h = m41365h(c28655q, 0);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, modifier3);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier6 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                i18 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z24 = z15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N15);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    boolean z215 = z16;
                    Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM3409f8, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                    float f111 = 8;
                    float f112 = 2 * f111;
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(modifierM3358c5, f112, f112);
                    C2306l c2306l5 = C2299e.f9108K;
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l5, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3395q5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N16);
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(((float) 1.5d) * f111);
                    if (1.0f > 0.0d) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (!z25) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22971kM66746i5, c2306l5, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N17);
                    AbstractC26165a abstractC26165aM88500I5 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                    if (z4) {
                        c28655q.m87150e0(-2052958412);
                        c28655q.m87173q(false);
                        c17903p = null;
                    } else {
                        C17903p c17903p6 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                        c28655q.m87173q(false);
                        c17903p = c17903p6;
                    }
                    AbstractC29125c.m88522c(abstractC26165aM88500I5, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                    C23010x c23010xM73381n5 = AbstractC25012a.m73381n((float) 0.5d, f111, c2305k3, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM73381n5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N18);
                    i24 = TextResource.$stable;
                    textResource2 = label;
                    String strM21274h9 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                    C2886a b16 = c38072d.m121952e(c28655q, i19).getB2();
                    long brandWhite5 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    i25 = C2886a.f11498d;
                    i26 = i25 << 18;
                    AbstractC30795n.m94707h(strM21274h9, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b16, null, c28655q, 0, i26, 196602);
                    if (textResource == null) {
                        c28655q.m87150e0(31464596);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(31464597);
                        if (z4) {
                            c28655q.m87150e0(375179556);
                            String strM21274h10 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                            long j16 = C39183o.f168428c;
                            AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h10, new C23267m0(abstractC17911tM41365h, Float.NaN, j16, null, null, null, null, null, j16, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                            z26 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(375487324);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                            z26 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z26);
                    }
                    AbstractC1090b.m3350e(C23016z.f90757a, z215, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if ((i18 & 29360128) == 8388608) {
                        z26 = true;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z26) {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(onToggle, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z216 = z24;
                    AbstractC29641d.m91043e(null, z4, z216, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z216;
                    modifier2 = modifier6;
                    z19 = z215;
                } else {
                    z24 = z15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N15);
                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                boolean z217 = z16;
                Modifier modifierM3358c6 = AbstractC1092a.m3358c(modifierM3409f9, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                float f113 = 8;
                float f114 = 2 * f113;
                Modifier modifierM3395q6 = AbstractC1099a.m3395q(modifierM3358c6, f114, f114);
                C2306l c2306l6 = C2299e.f9108K;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l6, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3395q6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m19);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N19);
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(((float) 1.5d) * f113);
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22971kM66746i6, c2306l6, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N110);
                AbstractC26165a abstractC26165aM88500I6 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                if (z4) {
                    c28655q.m87150e0(-2052958412);
                    c28655q.m87173q(false);
                    c17903p = null;
                } else {
                    C17903p c17903p7 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                    c28655q.m87173q(false);
                    c17903p = c17903p7;
                }
                AbstractC29125c.m88522c(abstractC26165aM88500I6, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                C23010x c23010xM73381n6 = AbstractC25012a.m73381n((float) 0.5d, f113, c2305k3, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM73381n6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N111);
                i24 = TextResource.$stable;
                textResource2 = label;
                String strM21274h11 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                C2886a b17 = c38072d.m121952e(c28655q, i19).getB2();
                long brandWhite6 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                i25 = C2886a.f11498d;
                i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21274h11, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b17, null, c28655q, 0, i26, 196602);
                if (textResource == null) {
                    c28655q.m87150e0(31464596);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(31464597);
                    if (z4) {
                        c28655q.m87150e0(375179556);
                        String strM21274h12 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                        long j17 = C39183o.f168428c;
                        AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h12, new C23267m0(abstractC17911tM41365h, Float.NaN, j17, null, null, null, null, null, j17, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(375487324);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                        z26 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                }
                AbstractC1090b.m3350e(C23016z.f90757a, z217, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if ((i18 & 29360128) == 8388608) {
                    z26 = true;
                }
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z218 = z24;
                AbstractC29641d.m91043e(null, z4, z218, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z218;
                modifier2 = modifier6;
                z19 = z217;
            } else {
                textResource2 = label;
                c28655q.m87138X();
                modifier2 = modifier;
                z18 = z15;
                z19 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14481c(modifier2, textResource2, textResource, z4, z18, errorMessage, z19, onToggle, i13, i14);
            }
        }
        i15 |= 1572864;
        z16 = z14;
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i15 & 4793491) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c28655q.m87135U(i15 & 1, z17)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            if (i34 != 0) {
                z15 = true;
            }
            if (i16 != 0) {
                z16 = false;
            }
            abstractC17911tM41365h = m41365h(c28655q, 0);
            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, modifier3);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier7 = modifier3;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            i18 = i15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                z24 = z15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N112);
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                boolean z219 = z16;
                Modifier modifierM3358c7 = AbstractC1092a.m3358c(modifierM3409f11, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
                float f115 = 8;
                float f116 = 2 * f115;
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(modifierM3358c7, f116, f116);
                C2306l c2306l7 = C2299e.f9108K;
                C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l7, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3395q7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a13);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N113);
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(((float) 1.5d) * f115);
                if (1.0f > 0.0d) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z25) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22971kM66746i7, c2306l7, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N114);
                AbstractC26165a abstractC26165aM88500I7 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
                if (z4) {
                    c28655q.m87150e0(-2052958412);
                    c28655q.m87173q(false);
                    c17903p = null;
                } else {
                    C17903p c17903p8 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                    c28655q.m87173q(false);
                    c17903p = c17903p8;
                }
                AbstractC29125c.m88522c(abstractC26165aM88500I7, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
                C23010x c23010xM73381n7 = AbstractC25012a.m73381n((float) 0.5d, f115, c2305k4, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM73381n7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N115);
                i24 = TextResource.$stable;
                textResource2 = label;
                String strM21274h13 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
                C2886a b18 = c38072d.m121952e(c28655q, i19).getB2();
                long brandWhite7 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                i25 = C2886a.f11498d;
                i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21274h13, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b18, null, c28655q, 0, i26, 196602);
                if (textResource == null) {
                    c28655q.m87150e0(31464596);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(31464597);
                    if (z4) {
                        c28655q.m87150e0(375179556);
                        String strM21274h14 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                        long j18 = C39183o.f168428c;
                        AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h14, new C23267m0(abstractC17911tM41365h, Float.NaN, j18, null, null, null, null, null, j18, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(375487324);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                        z26 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                }
                AbstractC1090b.m3350e(C23016z.f90757a, z219, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if ((i18 & 29360128) == 8388608) {
                    z26 = true;
                }
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(onToggle, 26);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z2110 = z24;
                AbstractC29641d.m91043e(null, z4, z2110, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z2110;
                modifier2 = modifier7;
                z19 = z219;
            } else {
                z24 = z15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N112);
            Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
            c38072d = C38072d.f163053a;
            i19 = C38072d.f163054b;
            boolean z2111 = z16;
            Modifier modifierM3358c8 = AbstractC1092a.m3358c(modifierM3409f12, c38072d.m121949b(c28655q, i19).getWhite5(), f52879a);
            float f117 = 8;
            float f118 = 2 * f117;
            Modifier modifierM3395q8 = AbstractC1099a.m3395q(modifierM3358c8, f118, f118);
            C2306l c2306l8 = C2299e.f9108K;
            C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l8, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3395q8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a15);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m116);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N116);
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(((float) 1.5d) * f117);
            if (1.0f > 0.0d) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (!z25) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22971kM66746i8, c2306l8, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m117);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N117);
            AbstractC26165a abstractC26165aM88500I8 = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0);
            if (z4) {
                c28655q.m87150e0(-2052958412);
                c28655q.m87173q(false);
                c17903p = null;
            } else {
                C17903p c17903p9 = new C17903p(C17919x.m51541c(0.4f, AbstractC25012a.m73366B(c28655q, 2011986270, c38072d, c28655q, i19)), 5);
                c28655q.m87173q(false);
                c17903p = c17903p9;
            }
            AbstractC29125c.m88522c(abstractC26165aM88500I8, null, AbstractC1102d.m3419p(6 * 4, c2314t), null, null, 0.0f, c17903p, c28655q, 432, 56);
            C23010x c23010xM73381n8 = AbstractC25012a.m73381n((float) 0.5d, f117, c2305k4, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM73381n8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N118);
            i24 = TextResource.$stable;
            textResource2 = label;
            String strM21274h15 = AbstractC8693b.m21274h(textResource2, c28655q, ((i18 >> 3) & 14) | i24);
            C2886a b19 = c38072d.m121952e(c28655q, i19).getB2();
            long brandWhite8 = c38072d.m121949b(c28655q, i19).getBrandWhite();
            i25 = C2886a.f11498d;
            i26 = i25 << 18;
            AbstractC30795n.m94707h(strM21274h15, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b19, null, c28655q, 0, i26, 196602);
            if (textResource == null) {
                c28655q.m87150e0(31464596);
                z26 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(31464597);
                if (z4) {
                    c28655q.m87150e0(375179556);
                    String strM21274h16 = AbstractC8693b.m21274h(textResource, c28655q, i24);
                    long j19 = C39183o.f168428c;
                    AbstractC30795n.m94704e(AbstractC37056f.m118958J(new C23465k(strM21274h16, new C23267m0(abstractC17911tM41365h, Float.NaN, j19, null, null, null, null, null, j19, null, null, null, C17919x.f69637n, null, null, null, null))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i19).getB3(), c28655q, 0, i25 << 21, 131070);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(375487324);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i24), null, AbstractC13673n.m38559f(c38072d, c28655q, i19, 0.4f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i26, 196602);
                    z26 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z26);
            }
            AbstractC1090b.m3350e(C23016z.f90757a, z2111, null, null, null, null, AbstractC37817c.m121344e(-1614341353, c28655q, new C3696c(errorMessage, 2)), c28655q, 1572870 | ((i18 >> 15) & 112), 30);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if ((i18 & 29360128) == 8388608) {
                z26 = true;
            }
            objM87133R = c28655q.m87133R();
            if (z26) {
                objM87133R = new C2161b(onToggle, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2161b(onToggle, 26);
                c28655q.m87172p0(objM87133R);
            }
            boolean z2112 = z24;
            AbstractC29641d.m91043e(null, z4, z2112, 0L, null, null, (Function1) objM87133R, c28655q, (i18 >> 6) & MessageListItemViewType.GIPHY, 57);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z18 = z2112;
            modifier2 = modifier7;
            z19 = z2111;
        } else {
            textResource2 = label;
            c28655q.m87138X();
            modifier2 = modifier;
            z18 = z15;
            z19 = z16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14481c(modifier2, textResource2, textResource, z4, z18, errorMessage, z19, onToggle, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m41362e(TextResource textResource, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        String strM21274h = AbstractC8693b.m21274h(textResource, composer, TextResource.$stable);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(composer, i14).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i14).getB3(), null, composer, 0, C2886a.f11498d << 18, 196602);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41363f(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m41364g(Modifier modifier, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, TextResource textResource3, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m41361d(modifier, textResource, textResource2, z4, z13, textResource3, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final AbstractC17911t m41365h(Composer composer, int i13) {
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4287324927L)), new C17919x(AbstractC17918w0.m51517e(4283487743L))), 0L, 0L, 14);
    }
}
