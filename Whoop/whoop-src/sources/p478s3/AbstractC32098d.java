package p478s3;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.ImageBlock;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.VideoBlock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d00.C11433l;
import e93.AbstractC12889b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25262p;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p043c4.C3974q;
import p073cq.C11040i;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17922y0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p294l3.AbstractC23269n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p547v8.AbstractC35785b;
import p571w3.C36766b;
import p571w3.C36767c;
import p571w3.C36778n;
import p571w3.InterfaceC36779o;
import p581we.C37187g;
import p598wy.InterfaceC37689b;
import p599wz.C37702b;
import p599wz.C37708d;
import p599wz.InterfaceC37711e;
import p631xz.C38721f0;
import p631xz.C38723g0;
import p631xz.C38747x;
import p635y2.InterfaceC39127r0;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sg2.C32464o;
import sj.C32553d;
import sj.C32561l;
import t63.AbstractC33559b;
import ug.EnumC34931t;
import w63.C36866a;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import x30.C37900j1;
import x30.C37906l1;
import x30.C37912n1;
import y00.C38864j0;
import y00.C38874k0;
import y00.C39000y;

/* JADX INFO: renamed from: s3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32098d implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m99835a(NudgeStep step, C32561l c32561l, Modifier modifier, Composer composer, int i13) {
        boolean z4;
        boolean z13;
        C2306l c2306l = C2299e.f9107J;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1341519791);
        Modifier modifierM3405b = AbstractC1102d.m3405b(modifier, 0.0f, 20, 1);
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3405b, c35035m.f148366w, AbstractC17918w0.f69621a);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
        C1100b c1100b = C1100b.f4583a;
        C2307m c2307m = C2299e.f9116y;
        C2314t c2314t = C2314t.f9131w;
        c32561l.m101582b(AbstractC2294a.m7154a(10.0f, c1100b.mo3400a(c2314t, c2307m)), 64, c28655q, 0);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 6);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
        c28655q.m87152f0(973644288);
        List<ContentBlock> content = step.getContent();
        boolean z14 = content instanceof Collection;
        C23000t1 c23000t1 = C23000t1.f90727a;
        if (z14 && content.isEmpty()) {
            z4 = true;
        } else {
            Iterator<T> it = content.iterator();
            while (true) {
                if (it.hasNext()) {
                    ContentBlock contentBlock = (ContentBlock) it.next();
                    if ((contentBlock instanceof ImageBlock) || (contentBlock instanceof VideoBlock)) {
                        if (AbstractC22676k.m65745e(step.getFormFactor().getMediaPosition(), "left")) {
                            z4 = true;
                            m99836b(c32561l, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 8);
                        }
                    }
                }
                z4 = true;
            }
        }
        c28655q.m87173q(false);
        Modifier modifierM3394p = AbstractC1099a.m3394p(16, AbstractC1102d.m3406c(1.0f, c23000t1.mo66772c(c2314t, z4, 1.0f)));
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i5 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
        C0209i c0209i6 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
        C0209i c0209i7 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
        }
        C0209i c0209i8 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
        C22949e c22949e = AbstractC22977m.f90650a;
        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 6);
        int iHashCode4 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
        }
        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
        c32561l.m101584d(null, 64, c28655q, 1);
        c28655q.m87173q(true);
        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 6);
        int iHashCode5 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i7);
        }
        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
        c32561l.m101585e(2, 64, c28655q, 0);
        c28655q.m87173q(true);
        c32561l.m101587g(c28655q, 8);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 1);
        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
        int iHashCode6 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i7);
        }
        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
        c32561l.m101581a(c28655q, 8);
        c28655q.m87173q(true);
        c32561l.m101583c(c28655q, 8);
        c28655q.m87173q(true);
        c28655q.m87152f0(-500532478);
        List<ContentBlock> content2 = step.getContent();
        if ((content2 instanceof Collection) && content2.isEmpty()) {
            z13 = true;
        } else {
            Iterator<T> it3 = content2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    ContentBlock contentBlock2 = (ContentBlock) it3.next();
                    if ((contentBlock2 instanceof ImageBlock) || (contentBlock2 instanceof VideoBlock)) {
                        if (!AbstractC22676k.m65745e(step.getFormFactor().getMediaPosition(), "left")) {
                            z13 = true;
                            m99836b(c32561l, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 8);
                        }
                    }
                }
                z13 = true;
            }
        }
        c28655q.m87173q(false);
        c28655q.m87173q(z13);
        c28655q.m87173q(z13);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32553d(step, c32561l, modifier, i13, 0);
    }

    /* JADX INFO: renamed from: b */
    public static final void m99836b(C32561l c32561l, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1468807333);
        float f13 = 6;
        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3406c(1.0f, modifier), AbstractC33253j.m105491g(0.0f, f13, f13, 0.0f, 9));
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
        c32561l.m101586f(AbstractC1102d.m3406c(1.0f, C2314t.f9131w), 70, c28655q, 0);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3974q(c32561l, modifier, i13, 8);
    }

    /* JADX INFO: renamed from: c */
    public static final void m99837c(boolean z4, C37912n1 element, Modifier modifier, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-132865092);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(element) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C37906l1 c37906l1 = element.f162316f;
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c37906l1.f162297c, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c37906l1.f162295a, c28655q, 0);
            if (((Boolean) C27648a.m83597t(element.f162314d, c28655q, 0).getValue()).booleanValue()) {
                boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue();
                String strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t2.getValue(), c28655q);
                c28655q.m87150e0(-1206117081);
                boolean zM87157i = c28655q.m87157i(c37906l1) | c28655q.m87153g(interfaceC28601c1M83597t);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C37900j1(1, c37906l1, interfaceC28601c1M83597t);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC37926s0.m121463a(modifier, "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG", zBooleanValue, strM113396S, z4, (Function1) objM87133R, c28655q, ((i14 >> 6) & 14) | 48 | ((i14 << 12) & 57344), 0);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(z4, element, modifier, i13, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m99838d(float f13, C25262p c25262p) {
        return Float.isNaN(f13) ? ((Number) c25262p.invoke()).floatValue() : f13;
    }

    /* JADX INFO: renamed from: e */
    public static final String m99839e(C37187g c37187g) {
        return c37187g.f159014m.f152982a + '/' + m99842h(c37187g);
    }

    /* JADX INFO: renamed from: f */
    public static int m99840f(char c3, CharSequence charSequence, int i13) {
        int length = charSequence.length();
        while (i13 < length) {
            if (charSequence.charAt(i13) == c3) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static ApiException m99841g(Status status) {
        return status.f20495y != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    /* JADX INFO: renamed from: h */
    public static final String m99842h(C37187g c37187g) {
        String str = c37187g.f159004c;
        String strM110113b = c37187g.f159005d.m110113b(EnumC34931t.f147050y);
        int iOrdinal = c37187g.f159007f.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            return strM110113b + '/' + str + "/aws4_request";
        }
        return strM110113b + '/' + c37187g.f159003b + '/' + str + "/aws4_request";
    }

    /* JADX INFO: renamed from: i */
    public static final String m99843i(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC37711e m99844j(C38747x c38747x) {
        AbstractC22676k.m65750j(c38747x, "<this>");
        return (InterfaceC37711e) c38747x.f166746a.f166664b.f45200w.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m99845k(int i13) {
        int type = Character.getType(i13);
        if (type != 29 && type != 30) {
            switch (type) {
                default:
                    if (i13 != 36 && i13 != 43 && i13 != 94 && i13 != 96 && i13 != 124 && i13 != 126) {
                        switch (i13) {
                            case 60:
                            case 61:
                            case 62:
                                break;
                            default:
                                return false;
                        }
                    }
                case 20:
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m99846l(int i13) {
        return i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13 || i13 == 32 || Character.getType(i13) == 12;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC36779o m99847n(InterfaceC36779o interfaceC36779o, InterfaceC36779o interfaceC36779o2, float f13) {
        boolean z4 = interfaceC36779o instanceof C36766b;
        C36778n c36778n = C36778n.f157356a;
        if (!z4 && !(interfaceC36779o2 instanceof C36766b)) {
            long jM51535w = AbstractC17918w0.m51535w(interfaceC36779o.mo117875b(), interfaceC36779o2.mo117875b(), f13);
            return jM51535w != 16 ? new C36767c(jM51535w) : c36778n;
        }
        if (!z4 || !(interfaceC36779o2 instanceof C36766b)) {
            return (InterfaceC36779o) AbstractC23269n0.m67330b(f13, interfaceC36779o, interfaceC36779o2);
        }
        C36766b c36766b = (C36766b) interfaceC36779o;
        C36766b c36766b2 = (C36766b) interfaceC36779o2;
        AbstractC17911t abstractC17911t = (AbstractC17911t) AbstractC23269n0.m67330b(f13, c36766b.f157333a, c36766b2.f157333a);
        float fM36249O = AbstractC12889b.m36249O(c36766b.f157334b, c36766b2.f157334b, f13);
        if (abstractC17911t == null) {
            return c36778n;
        }
        if (abstractC17911t instanceof C17875c1) {
            long jM99849p = m99849p(fM36249O, ((C17875c1) abstractC17911t).f69559c);
            return jM99849p != 16 ? new C36767c(jM99849p) : c36778n;
        }
        if (abstractC17911t instanceof AbstractC17922y0) {
            return new C36766b((AbstractC17922y0) abstractC17911t, fM36249O);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[PHI: r5 r6
      0x0052: PHI (r5v1 xz.x) = (r5v0 xz.x), (r5v9 xz.x) binds: [B:15:0x003b, B:23:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r6v4 y00.k0) = (r6v2 y00.k0), (r6v10 y00.k0) binds: [B:15:0x003b, B:23:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public static final Object m99848o(C38747x c38747x, AbstractC32269c abstractC32269c) {
        C38723g0 c38723g0;
        C38874k0 c38874k0;
        Object objM124157h;
        ArrayList arrayList;
        Iterator it;
        Object next;
        C38864j0 c38864j0;
        if (abstractC32269c instanceof C38723g0) {
            c38723g0 = (C38723g0) abstractC32269c;
            int i13 = c38723g0.f166671y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38723g0.f166671y = i13 - Integer.MIN_VALUE;
            } else {
                c38723g0 = new C38723g0(abstractC32269c);
            }
        } else {
            c38723g0 = new C38723g0(abstractC32269c);
        }
        Object obj = c38723g0.f166670x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38723g0.f166671y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c38874k0 = c38747x.f166755j;
            if (c38874k0 == null) {
                c38723g0.f166669w = c38747x;
                c38723g0.f166671y = 1;
                objM124157h = c38747x.m124157h(c38723g0);
                if (objM124157h == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                arrayList = c38874k0.f167321w;
                c38747x.f166755j = c38874k0;
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((C38864j0) next).f167295x);
                c38864j0 = (C38864j0) next;
                if (c38864j0 == null) {
                    c38864j0 = (C38864j0) AbstractC25265s.m74100H0(arrayList);
                }
                if (c38864j0 != null) {
                    C11433l c11433l = ((C37708d) c38747x.f166746a.f166664b.f45200w.getValue()).f161571w;
                    String strM30677f = c11433l != null ? c11433l.m30677f() : null;
                    String id4 = c38864j0.f167294w;
                    boolean z4 = c38864j0.f167295x;
                    C39000y address = c38864j0.f167296y;
                    AbstractC22676k.m65750j(id4, "id");
                    AbstractC22676k.m65750j(address, "address");
                    return new C38864j0(id4, z4, address, strM30677f);
                }
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c38747x = c38723g0.f166669w;
        AbstractC34132o.m107864I(obj);
        objM124157h = ((C23468n) obj).f92940w;
        if (objM124157h instanceof C23467m) {
            objM124157h = null;
        }
        c38874k0 = (C38874k0) objM124157h;
        if (c38874k0 != null) {
            arrayList = c38874k0.f167321w;
            c38747x.f166755j = c38874k0;
            it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C38864j0) next).f167295x);
            c38864j0 = (C38864j0) next;
            if (c38864j0 == null) {
                c38864j0 = (C38864j0) AbstractC25265s.m74100H0(arrayList);
            }
            if (c38864j0 != null) {
                C11433l c11433l2 = ((C37708d) c38747x.f166746a.f166664b.f45200w.getValue()).f161571w;
                if (c11433l2 != null) {
                }
                String id5 = c38864j0.f167294w;
                boolean z13 = c38864j0.f167295x;
                C39000y address2 = c38864j0.f167296y;
                AbstractC22676k.m65750j(id5, "id");
                AbstractC22676k.m65750j(address2, "address");
                return new C38864j0(id5, z13, address2, strM30677f);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final long m99849p(float f13, long j7) {
        return (Float.isNaN(f13) || f13 >= 1.0f) ? j7 : C17919x.m51541c(C17919x.m51543e(j7) * f13, j7);
    }

    /* JADX INFO: renamed from: q */
    public static void m99850q(Status status, Object obj, C11040i c11040i) {
        if (status.m15593b()) {
            c11040i.m29687b(obj);
        } else {
            c11040i.m29686a(m99841g(status));
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m99851r(CharSequence charSequence, int i13, int i14) {
        while (i13 < i14) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: renamed from: s */
    public static int m99852s(CharSequence charSequence, int i13, int i14) {
        while (i13 >= i14) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i13;
            }
            i13--;
        }
        return i14 - 1;
    }

    /* JADX INFO: renamed from: t */
    public static Task m99853t(Task task) {
        return task.continueWith(new C33623c0());
    }

    /* JADX INFO: renamed from: u */
    public static final void m99854u(InterfaceC37711e interfaceC37711e, C38721f0 linkAccountHolder) {
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        if (interfaceC37711e instanceof C37708d) {
            linkAccountHolder.m124147a((C37708d) interfaceC37711e);
        } else if (!interfaceC37711e.equals(C37702b.f161559w)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: v */
    public static final int m99855v(C36866a c36866a, C36866a c36866a2, int i13) throws EOFException {
        int iMin = Math.min(c36866a2.f77287c - c36866a2.f77286b, i13);
        int i14 = c36866a.f77289e;
        int i15 = c36866a.f77287c;
        int i16 = i14 - i15;
        if (i16 <= iMin) {
            int i17 = c36866a.f77290f;
            if ((i17 - i14) + i16 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i15 + iMin) - i14 > 0) {
                c36866a.f77289e = i17;
            }
        }
        AbstractC33559b.m105978a((ByteBuffer) c36866a2.f77291g, (ByteBuffer) c36866a.f77291g, c36866a2.f77286b, iMin, i15);
        c36866a2.m56793d(iMin);
        c36866a.m56791b(iMin);
        return iMin;
    }
}
