package p736sz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
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
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p40.C28827b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32618h3;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import s51.C32205b;
import sg2.C32464o;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u001a\u0010\u001b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/g;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lsz0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lsz0/h;", "", "isSelected", "n", "(Lsz0/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Lsz0/h;", "getFakeBinaryIconPositiveState", "()Lsz0/h;", "fakeBinaryIconPositiveState", "b", "getFakeBinaryIconNegativeState", "fakeBinaryIconNegativeState", "c", "Lsz0/g;", "getFakeBinaryFeedbackState", "()Lsz0/g;", "fakeBinaryFeedbackState", "Lsz0/f;", "localSelection", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33174e {

    /* JADX INFO: renamed from: a */
    private static final C33183h f138332a;

    /* JADX INFO: renamed from: b */
    private static final C33183h f138333b;

    /* JADX INFO: renamed from: c */
    private static final C33180g f138334c;

    static {
        C38072d c38072d = C38072d.f163053a;
        C33183h c33183h = new C33183h(c38072d.m121951d().getVarious().getFeedbackThumbsUp(), "Thumbs up", c38072d.m121951d().getVarious().getThumbUp(), "Thumbs up", null, 16, null);
        f138332a = c33183h;
        C33183h c33183h2 = new C33183h(c38072d.m121951d().getVarious().getFeedbackThumbsDown(), "Thumbs down", c38072d.m121951d().getVarious().getThumbDown(), "Thumbs down", null, 16, null);
        f138333b = c33183h2;
        f138334c = new C33180g("Was this visit summary helpful?", EnumC33177f.NONE, c33183h, c33183h2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0253  */
    /* JADX WARN: Code duplicated, block: B:105:0x0271  */
    /* JADX WARN: Code duplicated, block: B:106:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x027a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0284  */
    /* JADX WARN: Code duplicated, block: B:115:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0233  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0243  */
    /* JADX WARN: Code duplicated, block: B:99:0x024d A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: g */
    public static final void m105100g(Modifier modifier, C33180g state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87149e;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        Modifier modifier5;
        String strM105120e;
        boolean z13;
        InterfaceC28601c1 interfaceC28601c2;
        int i16;
        C0209i c0209i3;
        C0209i c0209i4;
        C2314t c2314t2;
        C28676v0 c28676v1;
        C0213j c0213j2;
        int i17;
        boolean z14;
        int iHashCode2;
        boolean z15;
        InterfaceC28601c1 interfaceC28601c3;
        int i18;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        Function1 function5;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(680923936);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(29);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                zM87149e = c28655q2.m87149e(state.getSelection().ordinal());
                objM87133R = c28655q2.m87133R();
                if (zM87149e || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(state.getSelection());
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                    strM105120e = state.getText();
                    if (strM105120e == null) {
                        c28655q2.m87150e0(1457567031);
                        c28655q2.m87173q(false);
                        i16 = i15;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        c0209i3 = c0209i2;
                        interfaceC28601c2 = interfaceC28601c1;
                        c0209i4 = c0209i;
                        c0213j2 = c0213j;
                        i17 = 6;
                        c28655q = c28655q2;
                        z14 = false;
                    } else {
                        c28655q2.m87150e0(1457567032);
                        if (1.0f > 0.0d) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        int i25 = i15;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C2886a c2886aM8402a = EnumC2888c.INSTANCE.m8402a(EnumC2888c.B1);
                        long jMo134584toComposableColorWaAFU9c = EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6);
                        interfaceC28601c2 = interfaceC28601c1;
                        i16 = i25;
                        c0209i3 = c0209i2;
                        c0209i4 = c0209i;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        c0213j2 = c0213j;
                        i17 = 6;
                        z14 = false;
                        AbstractC30795n.m94707h(strM105120e, layoutWeightElement, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q2, 0, 0, 196600);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9107J, c28655q, i17);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                    C33183h c33183hM105118b = state.getPositiveIcon();
                    if (m105102i(interfaceC28601c2) == EnumC33177f.POSITIVE) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    boolean zM87153g = c28655q.m87153g(interfaceC28601c3);
                    i18 = i16 & 896;
                    if (i18 == 256) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    z17 = zM87153g | z16;
                    objM87133R2 = c28655q.m87133R();
                    C28676v0 c28676v2 = c28676v1;
                    if (!z17 || objM87133R2 == c28676v2) {
                        function5 = function4;
                        objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function4;
                    }
                    int i26 = GenericInteraction.$stable;
                    m105107n(c33183hM105118b, z15, (Function1) objM87133R2, c28655q, i26);
                    C33183h c33183hM105117a = state.getNegativeIcon();
                    if (m105102i(interfaceC28601c3) == EnumC33177f.NEGATIVE) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    boolean zM87153g2 = c28655q.m87153g(interfaceC28601c3);
                    if (i18 == 256) {
                        z14 = true;
                    }
                    z19 = z14 | zM87153g2;
                    objM87133R3 = c28655q.m87133R();
                    if (z19 || objM87133R3 == c28676v2) {
                        objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m105107n(c33183hM105117a, z18, (Function1) objM87133R3, c28655q, i26);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N);
                strM105120e = state.getText();
                if (strM105120e == null) {
                    c28655q2.m87150e0(1457567031);
                    c28655q2.m87173q(false);
                    i16 = i15;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0209i3 = c0209i2;
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i4 = c0209i;
                    c0213j2 = c0213j;
                    i17 = 6;
                    c28655q = c28655q2;
                    z14 = false;
                } else {
                    c28655q2.m87150e0(1457567032);
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    int i27 = i15;
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C2886a c2886aM8402a2 = EnumC2888c.INSTANCE.m8402a(EnumC2888c.B1);
                    long jMo134584toComposableColorWaAFU9c2 = EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6);
                    interfaceC28601c2 = interfaceC28601c1;
                    i16 = i27;
                    c0209i3 = c0209i2;
                    c0209i4 = c0209i;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0213j2 = c0213j;
                    i17 = 6;
                    z14 = false;
                    AbstractC30795n.m94707h(strM105120e, layoutWeightElement2, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a2, null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9107J, c28655q, i17);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                C33183h c33183hM105118b2 = state.getPositiveIcon();
                if (m105102i(interfaceC28601c2) == EnumC33177f.POSITIVE) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                interfaceC28601c3 = interfaceC28601c2;
                boolean zM87153g3 = c28655q.m87153g(interfaceC28601c3);
                i18 = i16 & 896;
                if (i18 == 256) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                z17 = zM87153g3 | z16;
                objM87133R2 = c28655q.m87133R();
                C28676v0 c28676v3 = c28676v1;
                if (z17) {
                    function5 = function4;
                    objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function5 = function4;
                    objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                int i28 = GenericInteraction.$stable;
                m105107n(c33183hM105118b2, z15, (Function1) objM87133R2, c28655q, i28);
                C33183h c33183hM105117a2 = state.getNegativeIcon();
                if (m105102i(interfaceC28601c3) == EnumC33177f.NEGATIVE) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                boolean zM87153g4 = c28655q.m87153g(interfaceC28601c3);
                if (i18 == 256) {
                    z14 = true;
                }
                z19 = z14 | zM87153g4;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                m105107n(c33183hM105117a2, z18, (Function1) objM87133R3, c28655q, i28);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(modifier3, state, function3, i13, i14, 22);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32618h3(29);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            zM87149e = c28655q2.m87149e(state.getSelection().ordinal());
            objM87133R = c28655q2.m87133R();
            if (zM87149e) {
                objM87133R = AbstractC28683x.m87272z(state.getSelection());
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(state.getSelection());
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a4);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                strM105120e = state.getText();
                if (strM105120e == null) {
                    c28655q2.m87150e0(1457567031);
                    c28655q2.m87173q(false);
                    i16 = i15;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0209i3 = c0209i2;
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i4 = c0209i;
                    c0213j2 = c0213j;
                    i17 = 6;
                    c28655q = c28655q2;
                    z14 = false;
                } else {
                    c28655q2.m87150e0(1457567032);
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    int i29 = i15;
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C2886a c2886aM8402a3 = EnumC2888c.INSTANCE.m8402a(EnumC2888c.B1);
                    long jMo134584toComposableColorWaAFU9c3 = EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6);
                    interfaceC28601c2 = interfaceC28601c1;
                    i16 = i29;
                    c0209i3 = c0209i2;
                    c0209i4 = c0209i;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0213j2 = c0213j;
                    i17 = 6;
                    z14 = false;
                    AbstractC30795n.m94707h(strM105120e, layoutWeightElement3, jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a3, null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9107J, c28655q, i17);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
                C33183h c33183hM105118b3 = state.getPositiveIcon();
                if (m105102i(interfaceC28601c2) == EnumC33177f.POSITIVE) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                interfaceC28601c3 = interfaceC28601c2;
                boolean zM87153g5 = c28655q.m87153g(interfaceC28601c3);
                i18 = i16 & 896;
                if (i18 == 256) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                z17 = zM87153g5 | z16;
                objM87133R2 = c28655q.m87133R();
                C28676v0 c28676v4 = c28676v1;
                if (z17) {
                    function5 = function4;
                    objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function5 = function4;
                    objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                int i210 = GenericInteraction.$stable;
                m105107n(c33183hM105118b3, z15, (Function1) objM87133R2, c28655q, i210);
                C33183h c33183hM105117a3 = state.getNegativeIcon();
                if (m105102i(interfaceC28601c3) == EnumC33177f.NEGATIVE) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                boolean zM87153g6 = c28655q.m87153g(interfaceC28601c3);
                if (i18 == 256) {
                    z14 = true;
                }
                z19 = z14 | zM87153g6;
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                m105107n(c33183hM105117a3, z18, (Function1) objM87133R3, c28655q, i210);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N4);
            strM105120e = state.getText();
            if (strM105120e == null) {
                c28655q2.m87150e0(1457567031);
                c28655q2.m87173q(false);
                i16 = i15;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                c0209i3 = c0209i2;
                interfaceC28601c2 = interfaceC28601c1;
                c0209i4 = c0209i;
                c0213j2 = c0213j;
                i17 = 6;
                c28655q = c28655q2;
                z14 = false;
            } else {
                c28655q2.m87150e0(1457567032);
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                int i211 = i15;
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C2886a c2886aM8402a4 = EnumC2888c.INSTANCE.m8402a(EnumC2888c.B1);
                long jMo134584toComposableColorWaAFU9c4 = EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, 6);
                interfaceC28601c2 = interfaceC28601c1;
                i16 = i211;
                c0209i3 = c0209i2;
                c0209i4 = c0209i;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                c0213j2 = c0213j;
                i17 = 6;
                z14 = false;
                AbstractC30795n.m94707h(strM105120e, layoutWeightElement4, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a4, null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9107J, c28655q, i17);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
            C33183h c33183hM105118b4 = state.getPositiveIcon();
            if (m105102i(interfaceC28601c2) == EnumC33177f.POSITIVE) {
                z15 = true;
            } else {
                z15 = z14;
            }
            interfaceC28601c3 = interfaceC28601c2;
            boolean zM87153g7 = c28655q.m87153g(interfaceC28601c3);
            i18 = i16 & 896;
            if (i18 == 256) {
                z16 = true;
            } else {
                z16 = z14;
            }
            z17 = zM87153g7 | z16;
            objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v5 = c28676v1;
            if (z17) {
                function5 = function4;
                objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                c28655q.m87172p0(objM87133R2);
            } else {
                function5 = function4;
                objM87133R2 = new C28827b(function5, interfaceC28601c3, 5);
                c28655q.m87172p0(objM87133R2);
            }
            int i212 = GenericInteraction.$stable;
            m105107n(c33183hM105118b4, z15, (Function1) objM87133R2, c28655q, i212);
            C33183h c33183hM105117a4 = state.getNegativeIcon();
            if (m105102i(interfaceC28601c3) == EnumC33177f.NEGATIVE) {
                z18 = true;
            } else {
                z18 = z14;
            }
            boolean zM87153g8 = c28655q.m87153g(interfaceC28601c3);
            if (i18 == 256) {
                z14 = true;
            }
            z19 = z14 | zM87153g8;
            objM87133R3 = c28655q.m87133R();
            if (z19) {
                objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C28827b(function5, interfaceC28601c3, 6);
                c28655q.m87172p0(objM87133R3);
            }
            m105107n(c33183hM105117a4, z18, (Function1) objM87133R3, c28655q, i212);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, state, function3, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105101h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final EnumC33177f m105102i(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC33177f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m105103j(InterfaceC28601c1 interfaceC28601c1, EnumC33177f enumC33177f) {
        interfaceC28601c1.setValue(enumC33177f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105104k(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m105103j(interfaceC28601c1, EnumC33177f.POSITIVE);
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m105105l(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m105103j(interfaceC28601c1, EnumC33177f.NEGATIVE);
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m105106m(Modifier modifier, C33180g c33180g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105100g(modifier, c33180g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m105107n(C33183h c33183h, boolean z4, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        Modifier modifierM3362g;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(175059607);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c33183h) : c28655q.m87157i(c33183h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int iM105151b = z4 ? c33183h.getSelectedIconRes() : c33183h.getUnselectedIconRes();
            String strM105150a = z4 ? c33183h.getSelectedContentDescription() : c33183h.getUnselectedContentDescription();
            GenericInteraction genericInteractionM105154e = z4 ? null : c33183h.getUnselectedInteraction();
            C2314t c2314t = C2314t.f9131w;
            if (genericInteractionM105154e != null) {
                c28655q.m87150e0(1110886284);
                boolean zM87157i = c28655q.m87157i(genericInteractionM105154e) | ((i14 & 896) == 256);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C11161b(function1, genericInteractionM105154e, 5);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1110953523);
                c28655q.m87173q(false);
                modifierM3362g = c2314t;
            }
            C27430e c27430eM107874S = AbstractC34132o.m107874S(iM105151b, c28655q, 6);
            Modifier modifierMo3471e = AbstractC1102d.m3419p(5 * 4, c2314t).mo3471e(modifierM3362g);
            C39336i c39336iM121949b = C38072d.f163053a.m121949b(c28655q, 6);
            AbstractC15005f3.m43108b(c27430eM107874S, strM105150a, modifierMo3471e, z4 ? c39336iM121949b.getBrandWhite() : c39336iM121949b.getWhite90(), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(c33183h, z4, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m105108o(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m105109p(C33183h c33183h, boolean z4, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m105107n(c33183h, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
