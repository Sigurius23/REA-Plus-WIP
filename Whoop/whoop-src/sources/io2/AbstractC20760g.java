package io2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i01.C17841d;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: io2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio2/h;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "", "showTopBorder", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20760g {
    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x027e  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x021d  */
    /* JADX WARN: Code duplicated, block: B:86:0x021f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0226  */
    /* JADX WARN: Code duplicated, block: B:93:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x023e  */
    /* JADX INFO: renamed from: e */
    public static final void m57163e(C20762h viewState, Modifier modifier, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z14;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z17;
        C28676v0 c28676v0;
        Function1 function4;
        long white5;
        boolean z18;
        boolean z19;
        boolean zM87151f;
        Object objM87133R;
        boolean z24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z25;
        boolean z26;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-479164815);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
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
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    z14 = false;
                    if ((i15 & 1171) != 1170) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c2314t = C2314t.f9131w;
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z17 = true;
                        } else {
                            z17 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C20756e(0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function2 = (Function1) objM87133R3;
                        }
                        C38072d c38072d = C38072d.f163053a;
                        int i25 = C38072d.f163054b;
                        function4 = function2;
                        white5 = c38072d.m121949b(c28655q, i25).getWhite5();
                        C2305k c2305k = C2299e.f9111N;
                        z18 = z17;
                        float f13 = 8;
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87151f = z19 | c28655q.m87151f(white5);
                        objM87133R = c28655q.m87133R();
                        if (!zM87151f || objM87133R == c28676v0) {
                            z24 = z18;
                            objM87133R = new C20758f(0, white5, z24);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            z24 = z18;
                        }
                        Modifier modifierMo3471e = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f, (Function1) objM87133R), ((float) 2.5d) * f13, 3 * f13).mo3471e(modifier2);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        TextResource textResourceM57175g = viewState.getDisclaimer();
                        int i26 = TextResource.$stable;
                        boolean z27 = z24;
                        Modifier modifier4 = modifier2;
                        AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g, c28655q, i26), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d.m121952e(c28655q, i25).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i25).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                        TextResource textResourceM57174f = viewState.getCtaText();
                        boolean zM57177i = viewState.getIsEnabled();
                        if ((i15 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                            z14 = true;
                        }
                        z26 = z25 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z26 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C17841d(function4, viewState, 24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27292z.m82343j(null, zM57177i, false, null, null, null, textResourceM57174f, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i26 << 18, 0, 8125);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        function3 = function4;
                        z16 = z27;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z16 = z13;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
                    }
                }
                i15 |= 3072;
                function2 = function1;
                z14 = false;
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C20756e(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function2 = (Function1) objM87133R3;
                    }
                    C38072d c38072d2 = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    function4 = function2;
                    white5 = c38072d2.m121949b(c28655q, i27).getWhite5();
                    C2305k c2305k2 = C2299e.f9111N;
                    z18 = z17;
                    float f14 = 8;
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * f14);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87151f = z19 | c28655q.m87151f(white5);
                    objM87133R = c28655q.m87133R();
                    if (zM87151f) {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierMo3471e2 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f2, (Function1) objM87133R), ((float) 2.5d) * f14, 3 * f14).mo3471e(modifier2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    TextResource textResourceM57175g2 = viewState.getDisclaimer();
                    int i28 = TextResource.$stable;
                    boolean z28 = z24;
                    Modifier modifier5 = modifier2;
                    AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g2, c28655q, i28), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f14, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d2.m121952e(c28655q, i27).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d2.m121949b(c28655q, i27).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                    TextResource textResourceM57174f2 = viewState.getCtaText();
                    boolean zM57177i2 = viewState.getIsEnabled();
                    if ((i15 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    z26 = z25 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z26) {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(null, zM57177i2, false, null, null, null, textResourceM57174f2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i28 << 18, 0, 8125);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function4;
                    z16 = z28;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
                }
            }
            i15 |= 384;
            z13 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                z14 = false;
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C20756e(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function2 = (Function1) objM87133R3;
                    }
                    C38072d c38072d3 = C38072d.f163053a;
                    int i29 = C38072d.f163054b;
                    function4 = function2;
                    white5 = c38072d3.m121949b(c28655q, i29).getWhite5();
                    C2305k c2305k3 = C2299e.f9111N;
                    z18 = z17;
                    float f15 = 8;
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(((float) 1.5d) * f15);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87151f = z19 | c28655q.m87151f(white5);
                    objM87133R = c28655q.m87133R();
                    if (zM87151f) {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierMo3471e3 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f3, (Function1) objM87133R), ((float) 2.5d) * f15, 3 * f15).mo3471e(modifier2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k3, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    TextResource textResourceM57175g3 = viewState.getDisclaimer();
                    int i210 = TextResource.$stable;
                    boolean z29 = z24;
                    Modifier modifier6 = modifier2;
                    AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g3, c28655q, i210), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f15, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d3.m121952e(c28655q, i29).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d3.m121949b(c28655q, i29).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                    TextResource textResourceM57174f3 = viewState.getCtaText();
                    boolean zM57177i3 = viewState.getIsEnabled();
                    if ((i15 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    z26 = z25 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z26) {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(null, zM57177i3, false, null, null, null, textResourceM57174f3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i210 << 18, 0, 8125);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function4;
                    z16 = z29;
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
                }
            }
            i15 |= 3072;
            function2 = function1;
            z14 = false;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20756e(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                C38072d c38072d4 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                function4 = function2;
                white5 = c38072d4.m121949b(c28655q, i211).getWhite5();
                C2305k c2305k4 = C2299e.f9111N;
                z18 = z17;
                float f16 = 8;
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(((float) 1.5d) * f16);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87151f = z19 | c28655q.m87151f(white5);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e4 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f4, (Function1) objM87133R), ((float) 2.5d) * f16, 3 * f16).mo3471e(modifier2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k4, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                TextResource textResourceM57175g4 = viewState.getDisclaimer();
                int i212 = TextResource.$stable;
                boolean z210 = z24;
                Modifier modifier7 = modifier2;
                AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g4, c28655q, i212), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f16, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d4.m121952e(c28655q, i211).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d4.m121949b(c28655q, i211).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                TextResource textResourceM57174f4 = viewState.getCtaText();
                boolean zM57177i4 = viewState.getIsEnabled();
                if ((i15 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z26 = z25 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z26) {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(null, zM57177i4, false, null, null, null, textResourceM57174f4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i212 << 18, 0, 8125);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function4;
                z16 = z210;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                z14 = false;
                if ((i15 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z17 = true;
                    } else {
                        z17 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C20756e(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function2 = (Function1) objM87133R3;
                    }
                    C38072d c38072d5 = C38072d.f163053a;
                    int i213 = C38072d.f163054b;
                    function4 = function2;
                    white5 = c38072d5.m121949b(c28655q, i213).getWhite5();
                    C2305k c2305k5 = C2299e.f9111N;
                    z18 = z17;
                    float f17 = 8;
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(((float) 1.5d) * f17);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87151f = z19 | c28655q.m87151f(white5);
                    objM87133R = c28655q.m87133R();
                    if (zM87151f) {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        z24 = z18;
                        objM87133R = new C20758f(0, white5, z24);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierMo3471e5 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f5, (Function1) objM87133R), ((float) 2.5d) * f17, 3 * f17).mo3471e(modifier2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22971kM66746i5, c2305k5, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    TextResource textResourceM57175g5 = viewState.getDisclaimer();
                    int i214 = TextResource.$stable;
                    boolean z211 = z24;
                    Modifier modifier8 = modifier2;
                    AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g5, c28655q, i214), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f17, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d5.m121952e(c28655q, i213).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d5.m121949b(c28655q, i213).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                    TextResource textResourceM57174f5 = viewState.getCtaText();
                    boolean zM57177i5 = viewState.getIsEnabled();
                    if ((i15 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    z26 = z25 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z26) {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C17841d(function4, viewState, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(null, zM57177i5, false, null, null, null, textResourceM57174f5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i214 << 18, 0, 8125);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function4;
                    z16 = z211;
                    modifier3 = modifier8;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
                }
            }
            i15 |= 3072;
            function2 = function1;
            z14 = false;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20756e(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                C38072d c38072d6 = C38072d.f163053a;
                int i215 = C38072d.f163054b;
                function4 = function2;
                white5 = c38072d6.m121949b(c28655q, i215).getWhite5();
                C2305k c2305k6 = C2299e.f9111N;
                z18 = z17;
                float f18 = 8;
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(((float) 1.5d) * f18);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87151f = z19 | c28655q.m87151f(white5);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e6 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f6, (Function1) objM87133R), ((float) 2.5d) * f18, 3 * f18).mo3471e(modifier2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22971kM66746i6, c2305k6, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                TextResource textResourceM57175g6 = viewState.getDisclaimer();
                int i216 = TextResource.$stable;
                boolean z212 = z24;
                Modifier modifier9 = modifier2;
                AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g6, c28655q, i216), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f18, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d6.m121952e(c28655q, i215).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d6.m121949b(c28655q, i215).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                TextResource textResourceM57174f6 = viewState.getCtaText();
                boolean zM57177i6 = viewState.getIsEnabled();
                if ((i15 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z26 = z25 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z26) {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(null, zM57177i6, false, null, null, null, textResourceM57174f6, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i216 << 18, 0, 8125);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function4;
                z16 = z212;
                modifier3 = modifier9;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            z14 = false;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20756e(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                C38072d c38072d7 = C38072d.f163053a;
                int i217 = C38072d.f163054b;
                function4 = function2;
                white5 = c38072d7.m121949b(c28655q, i217).getWhite5();
                C2305k c2305k7 = C2299e.f9111N;
                z18 = z17;
                float f19 = 8;
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(((float) 1.5d) * f19);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87151f = z19 | c28655q.m87151f(white5);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    z24 = z18;
                    objM87133R = new C20758f(0, white5, z24);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e7 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f7, (Function1) objM87133R), ((float) 2.5d) * f19, 3 * f19).mo3471e(modifier2);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22971kM66746i7, c2305k7, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                TextResource textResourceM57175g7 = viewState.getDisclaimer();
                int i218 = TextResource.$stable;
                boolean z213 = z24;
                Modifier modifier10 = modifier2;
                AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g7, c28655q, i218), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f19, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d7.m121952e(c28655q, i217).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d7.m121949b(c28655q, i217).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                TextResource textResourceM57174f7 = viewState.getCtaText();
                boolean zM57177i7 = viewState.getIsEnabled();
                if ((i15 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z26 = z25 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z26) {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17841d(function4, viewState, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(null, zM57177i7, false, null, null, null, textResourceM57174f7, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i218 << 18, 0, 8125);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function4;
                z16 = z213;
                modifier3 = modifier10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
            }
        }
        i15 |= 3072;
        function2 = function1;
        z14 = false;
        if ((i15 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i16 != 0) {
                z17 = true;
            } else {
                z17 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C20756e(0);
                    c28655q.m87172p0(objM87133R3);
                }
                function2 = (Function1) objM87133R3;
            }
            C38072d c38072d8 = C38072d.f163053a;
            int i219 = C38072d.f163054b;
            function4 = function2;
            white5 = c38072d8.m121949b(c28655q, i219).getWhite5();
            C2305k c2305k8 = C2299e.f9111N;
            z18 = z17;
            float f110 = 8;
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(((float) 1.5d) * f110);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            if ((i15 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87151f = z19 | c28655q.m87151f(white5);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                z24 = z18;
                objM87133R = new C20758f(0, white5, z24);
                c28655q.m87172p0(objM87133R);
            } else {
                z24 = z18;
                objM87133R = new C20758f(0, white5, z24);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierMo3471e8 = AbstractC1099a.m3395q(AbstractC1125a.m3478a(modifierM3409f8, (Function1) objM87133R), ((float) 2.5d) * f110, 3 * f110).mo3471e(modifier2);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22971kM66746i8, c2305k8, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            TextResource textResourceM57175g8 = viewState.getDisclaimer();
            int i2110 = TextResource.$stable;
            boolean z214 = z24;
            Modifier modifier11 = modifier2;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM57175g8, c28655q, i2110), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f110, 1), false, C21053l.f79834a.m58880a(C23285v0.m67364b(c38072d8.m121952e(c28655q, i219).getB4().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d8.m121949b(c28655q, i219).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
            TextResource textResourceM57174f8 = viewState.getCtaText();
            boolean zM57177i8 = viewState.getIsEnabled();
            if ((i15 & 7168) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            if ((i15 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            z26 = z25 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z26) {
                objM87133R2 = new C17841d(function4, viewState, 24);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17841d(function4, viewState, 24);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27292z.m82343j(null, zM57177i8, false, null, null, null, textResourceM57174f8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i2110 << 18, 0, 8125);
            c28655q = c28655q;
            c28655q.m87173q(true);
            function3 = function4;
            z16 = z214;
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z16 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, modifier3, z16, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m57164f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m57165g(boolean z4, long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            return c23454a0;
        }
        drawBehind.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (496 & 8) != 0 ? 0.0f : drawBehind.mo743q0(1), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m57166h(Function1 function1, C20762h c20762h) {
        function1.invoke(new C20754d(c20762h.getCheckoutPath(), c20762h.getCartId(), c20762h.getSkipStripeCheckout()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m57167i(C20762h c20762h, Modifier modifier, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m57163e(c20762h, modifier, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
