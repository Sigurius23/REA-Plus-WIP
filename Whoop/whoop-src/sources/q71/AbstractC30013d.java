package q71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26984y0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import os0.C28308d;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17903p;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import p745y81.EnumC39333f;
import p90.C29000h;
import pf.AbstractC29125c;
import pt2.C29529k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: q71.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq71/e;", "horizontalDividedListState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lq71/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lq71/h;", "style", "u", "(Landroidx/compose/ui/Modifier;Lq71/h;)Landroidx/compose/ui/Modifier;", "Lq71/c;", "horizontalDividedListItemState", "m", "(Lq71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "state", "p", "(Lq71/c;Landroidx/compose/runtime/Composer;I)V", "Lw3/k;", "textAlign", "Ll0/i;", "titleRowArrangement", "r", "(Lq71/c;ILl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30013d {

    /* JADX INFO: renamed from: q71.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122531a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f122532b;

        static {
            int[] iArr = new int[EnumC30017h.values().length];
            try {
                iArr[EnumC30017h.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30017h.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122531a = iArr;
            int[] iArr2 = new int[EnumC30016g.values().length];
            try {
                iArr2[EnumC30016g.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC30016g.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC30016g.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC30016g.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f122532b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:104:0x024e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0220  */
    /* JADX INFO: renamed from: i */
    public static final void m91878i(Modifier modifier, C30014e horizontalDividedListState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2314t c2314t2;
        Function1 function5;
        int iHashCode2;
        int i17;
        int i18;
        int i19;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v1;
        C2314t c2314t3;
        Object objM87133R2;
        C2307m c2307m = C2299e.f9102E;
        AbstractC22676k.m65750j(horizontalDividedListState, "horizontalDividedListState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(642060524);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= c28655q.m87157i(horizontalDividedListState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C29529k(26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i3 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                Modifier modifier5 = modifier4;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                c2314t2 = c2314t;
                function5 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                c28655q.m87150e0(467481637);
                i17 = 0;
                for (Object obj : horizontalDividedListState.m91891a()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C30012c c30012c = (C30012c) obj;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    i19 = i16;
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if ((i19 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C29000h(function5, 15);
                        c28655q.m87172p0(objM87133R);
                    }
                    m91882m(c30012c, (Function1) objM87133R, c28655q, 0, 0);
                    c28655q.m87173q(true);
                    if (i17 < horizontalDividedListState.m91891a().size() - 1) {
                        c28655q.m87150e0(-988948566);
                        c2314t3 = c2314t2;
                        c28676v1 = c28676v0;
                        AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(8 * 4, c2314t2)), C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                        c28655q.m87173q(false);
                    } else {
                        c28676v1 = c28676v0;
                        c2314t3 = c2314t2;
                        c28655q.m87150e0(-988698706);
                        c28655q.m87173q(false);
                    }
                    c28676v0 = c28676v1;
                    i17 = i18;
                    i16 = i19;
                    c2314t2 = c2314t3;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(modifier3, horizontalDividedListState, function3, i13, i14, 28);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29529k(26);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            Modifier modifier6 = modifier4;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            c2314t2 = c2314t;
            function5 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
            c28655q.m87150e0(467481637);
            i17 = 0;
            while (r1.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C30012c c30012c2 = (C30012c) obj;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                i19 = i16;
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C29000h(function5, 15);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29000h(function5, 15);
                    c28655q.m87172p0(objM87133R);
                }
                m91882m(c30012c2, (Function1) objM87133R, c28655q, 0, 0);
                c28655q.m87173q(true);
                if (i17 < horizontalDividedListState.m91891a().size() - 1) {
                    c28655q.m87150e0(-988948566);
                    c2314t3 = c2314t2;
                    c28676v1 = c28676v0;
                    AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(8 * 4, c2314t2)), C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                    c2314t3 = c2314t2;
                    c28655q.m87150e0(-988698706);
                    c28655q.m87173q(false);
                }
                c28676v0 = c28676v1;
                i17 = i18;
                i16 = i19;
                c2314t2 = c2314t3;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            function3 = function5;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, horizontalDividedListState, function3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m91879j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m91880k(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91881l(Modifier modifier, C30014e c30014e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91878i(modifier, c30014e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:102:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0308  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0236  */
    /* JADX WARN: Code duplicated, block: B:85:0x023a  */
    /* JADX WARN: Code duplicated, block: B:90:0x025b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0288  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b4  */
    /* JADX INFO: renamed from: m */
    public static final void m91882m(C30012c horizontalDividedListItemState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        EnumC30016g enumC30016gM91867f;
        int i16;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i3;
        int iHashCode4;
        int iHashCode5;
        C0213j c0213j4;
        C0209i c0209i4;
        int iHashCode6;
        Object objM87133R;
        C2306l c2306l = C2299e.f9108K;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(horizontalDividedListItemState, "horizontalDividedListItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(456041459);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(horizontalDividedListItemState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C29529k(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                enumC30016gM91867f = horizontalDividedListItemState.getMainImagePosition();
                if (enumC30016gM91867f == null) {
                    enumC30016gM91867f = EnumC30016g.TOP;
                }
                i16 = a.f122532b[enumC30016gM91867f.ordinal()];
                c2314t = C2314t.f9131w;
                if (i16 != 1) {
                    c28655q.m87150e0(949820933);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
                    int i18 = i15 & 14;
                    m91885p(horizontalDividedListItemState, c28655q, i18);
                    AbstractC11266d.m30469w(1, 4, c2314t, c28655q);
                    m91887r(horizontalDividedListItemState, 3, AbstractC22977m.f90654e, function3, c28655q, ((i15 << 6) & 7168) | i18 | 384);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (i16 != 2) {
                    c28655q.m87150e0(950376453);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    int i19 = i15 & 14;
                    m91887r(horizontalDividedListItemState, 3, AbstractC22977m.f90654e, function3, c28655q, i19 | 384 | ((i15 << 6) & 7168));
                    AbstractC11266d.m30469w(1, 4, c2314t, c28655q);
                    m91885p(horizontalDividedListItemState, c28655q, i19);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (i16 != 3) {
                    c28655q.m87150e0(950933244);
                    C22961h c22961h = AbstractC22977m.f90654e;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    int i24 = i15 & 14;
                    m91885p(horizontalDividedListItemState, c28655q, i24);
                    AbstractC38963t7.m124386p(2, 4, c2314t, c28655q);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    m91887r(horizontalDividedListItemState, 3, c22961h, function3, c28655q, i24 | 384 | ((i15 << 6) & 7168));
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                } else {
                    if (i16 == 4) {
                        throw AbstractC11895b.m32003v(169185014, c28655q, false);
                    }
                    c28655q.m87150e0(951591932);
                    C22961h c22961h2 = AbstractC22977m.f90654e;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l, c28655q, 54);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a2);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    int i25 = i15 & 14;
                    m91887r(horizontalDividedListItemState, 3, c22961h2, function3, c28655q, i25 | 384 | ((i15 << 6) & 7168));
                    c28655q.m87173q(true);
                    AbstractC38963t7.m124386p(2, 4, c2314t, c28655q);
                    m91885p(horizontalDividedListItemState, c28655q, i25);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(horizontalDividedListItemState, i13, function3, i14, 22);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C29529k(27);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            enumC30016gM91867f = horizontalDividedListItemState.getMainImagePosition();
            if (enumC30016gM91867f == null) {
                enumC30016gM91867f = EnumC30016g.TOP;
            }
            i16 = a.f122532b[enumC30016gM91867f.ordinal()];
            c2314t = C2314t.f9131w;
            if (i16 != 1) {
                c28655q.m87150e0(949820933);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                int i110 = i15 & 14;
                m91885p(horizontalDividedListItemState, c28655q, i110);
                AbstractC11266d.m30469w(1, 4, c2314t, c28655q);
                m91887r(horizontalDividedListItemState, 3, AbstractC22977m.f90654e, function3, c28655q, ((i15 << 6) & 7168) | i110 | 384);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (i16 != 2) {
                c28655q.m87150e0(950376453);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                int i111 = i15 & 14;
                m91887r(horizontalDividedListItemState, 3, AbstractC22977m.f90654e, function3, c28655q, i111 | 384 | ((i15 << 6) & 7168));
                AbstractC11266d.m30469w(1, 4, c2314t, c28655q);
                m91885p(horizontalDividedListItemState, c28655q, i111);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (i16 != 3) {
                c28655q.m87150e0(950933244);
                C22961h c22961h3 = AbstractC22977m.f90654e;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h3, c2306l, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a3);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m9);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                int i26 = i15 & 14;
                m91885p(horizontalDividedListItemState, c28655q, i26);
                AbstractC38963t7.m124386p(2, 4, c2314t, c28655q);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
                m91887r(horizontalDividedListItemState, 3, c22961h3, function3, c28655q, i26 | 384 | ((i15 << 6) & 7168));
                AbstractC25012a.m73392y(c28655q, true, true, false);
            } else {
                if (i16 == 4) {
                    throw AbstractC11895b.m32003v(169185014, c28655q, false);
                }
                c28655q.m87150e0(951591932);
                C22961h c22961h4 = AbstractC22977m.f90654e;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h4, c2306l, c28655q, 54);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j4);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a4);
                C0209i c0209i15 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j4);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N12);
                int i27 = i15 & 14;
                m91887r(horizontalDividedListItemState, 3, c22961h4, function3, c28655q, i27 | 384 | ((i15 << 6) & 7168));
                c28655q.m87173q(true);
                AbstractC38963t7.m124386p(2, 4, c2314t, c28655q);
                m91885p(horizontalDividedListItemState, c28655q, i27);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(horizontalDividedListItemState, i13, function3, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m91883n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m91884o(C30012c c30012c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91882m(c30012c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m91885p(C30012c c30012c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1514442180);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c30012c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22403o abstractC22403oM91866e = c30012c.getMainImage();
            if (abstractC22403oM91866e == null) {
                c28655q.m87150e0(1884543677);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1884543678);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM91866e, null, null, c28655q, 0, 3), null, m91890u(C2314t.f9131w, c30012c.getMainImageStyle()), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c30012c, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m91886q(C30012c c30012c, int i13, Composer composer, int i14) {
        m91885p(c30012c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m91887r(C30012c c30012c, int i13, InterfaceC22965i interfaceC22965i, Function1 function1, Composer composer, int i14) {
        int i15;
        C2314t c2314t;
        boolean z4;
        float f13;
        C2314t c2314t2;
        Float fValueOf = Float.valueOf(1.5f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(358711284);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(c30012c) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(interfaceC22965i) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, c28655q, (((((i15 >> 3) & 112) | 384) >> 3) & 14) | 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c30012c.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN7(), fValueOf, c28655q, 0, 12582912, 65530);
            c28655q = c28655q;
            EnumC16313m0 enumC16313m0M91863b = c30012c.getIcon();
            if (enumC16313m0M91863b == null) {
                c28655q.m87150e0(-682725607);
                c28655q.m87173q(false);
                c2314t = c2314t3;
            } else {
                c28655q.m87150e0(-682725606);
                C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, enumC16313m0M91863b.toWhoopIcon(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                float f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f14 * f14, AbstractC1136a.m3599a(c2314t, "horizontal_divided_list_metric_icon_" + c30012c.getId()));
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) 1) * f14, 0.0f, 0.0f, 0.0f, 14);
                if ((i15 & 14) == 4) {
                    c2314t = c2314t3;
                    z4 = true;
                } else {
                    c2314t = c2314t3;
                    z4 = false;
                }
                boolean z13 = ((i15 & 7168) == 2048) | z4;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C28448b(26, c30012c, function1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o, "", modifierM3419p, modifierM3398t, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            float f15 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f15, c2314t));
            TextResource textResourceM91865d = c30012c.getSubtitle();
            if (textResourceM91865d == null) {
                c28655q.m87150e0(490745438);
                c28655q.m87173q(false);
                f13 = f15;
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(490745439);
                C28655q c28655q2 = c28655q;
                f13 = f15;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM91865d, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(i13), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), fValueOf, c28655q2, (i15 << 24) & 1879048192, 12582912, 65018);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            AbstractC22403o abstractC22403oM91864c = c30012c.getImageUrl();
            if (abstractC22403oM91864c == null) {
                c28655q.m87150e0(491034730);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(491034731);
                Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * f13, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C28655q c28655q3 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM91864c, null, null, c28655q, 0, 3), null, AbstractC1102d.m3411h(2 * f13, c2314t2), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, 6).getWhite70(), 5), c28655q3, 432, 56);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(i13, i14, 29, c30012c, interfaceC22965i, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m91888s(C30012c c30012c, Function1 function1) {
        if (c30012c.getDialogInfo() != null) {
            function1.invoke(AbstractC30015f.a.f122534a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91889t(C30012c c30012c, int i13, InterfaceC22965i interfaceC22965i, Function1 function1, int i14, Composer composer, int i15) {
        m91887r(c30012c, i13, interfaceC22965i, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final Modifier m91890u(Modifier modifier, EnumC30017h enumC30017h) {
        int i13 = enumC30017h == null ? -1 : a.f122531a[enumC30017h.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                float f13 = 8;
                return AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13 * 4, AbstractC1099a.m3398t(modifier, 0.0f, 2 * f13, 0.0f, 0.0f, 13)), AbstractC33253j.f138651a);
            }
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return AbstractC1102d.m3419p(12 * 4, modifier);
    }
}
