package p477s2;

import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4582c;
import com.amplitude.android.engagement.types.ButtonBlock;
import com.amplitude.android.engagement.types.ContentAlignment;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.MarkdownBlock;
import com.amplitude.android.engagement.types.NudgeStep;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.EnumC11663h;
import e93.AbstractC12889b;
import j93.InterfaceC21467g;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import o73.C27648a;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p012ab.C0690l0;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p048ce.C4469j;
import p048ce.C4470k;
import p048ce.EnumC4471l;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22974l;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p335n6.C26385b;
import p335n6.InterfaceC26398o;
import p370oj.C27969p;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p477s2.AbstractC32076h;
import p499t9.C33623c0;
import p499t9.C33647p;
import p502ti.C33823f;
import p503tp.AbstractC34036g;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p529uo.AbstractC35135w;
import p545v6.C35728q;
import p545v6.C35732u;
import p580wd.C37149b;
import p580wd.C37150c;
import p580wd.C37151d;
import p580wd.C37152e;
import p580wd.C37153f;
import p580wd.C37154g;
import p580wd.C37155h;
import p580wd.C37156i;
import p598wy.InterfaceC37689b;
import p635y2.InterfaceC39127r0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import sj.AbstractC32550a;
import sj.C32561l;
import to.C33979j;
import to.C33981k;
import tx0.C34238a;
import v30.C35596e;
import wb3.AbstractC37056f;
import wr0.C37550r;
import y00.AbstractC38833g;
import y00.C38843h;
import y00.EnumC38852h8;
import y00.EnumC38853i;
import y00.EnumC38863j;

/* JADX INFO: renamed from: s2.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32076h implements InterfaceC37689b {
    /* JADX WARN: Code duplicated, block: B:102:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:108:0x032a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0365  */
    /* JADX WARN: Code duplicated, block: B:118:0x038b  */
    /* JADX WARN: Code duplicated, block: B:119:0x038f  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[LOOP:2: B:79:0x026b->B:145:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x0106  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0147  */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0166  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0201  */
    /* JADX WARN: Code duplicated, block: B:63:0x0205  */
    /* JADX WARN: Code duplicated, block: B:68:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x024f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0261 A[EDGE_INSN: B:77:0x0261->B:105:0x0306 BREAK  A[LOOP:2: B:79:0x026b->B:145:?]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0267  */
    /* JADX WARN: Code duplicated, block: B:81:0x0271  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x02f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX INFO: renamed from: a */
    public static final void m99768a(NudgeStep step, C32561l c32561l, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        C2306l c2306l;
        boolean z13;
        Modifier modifier2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        ArrayList arrayList;
        Iterator it;
        int iHashCode5;
        C0213j c0213j;
        C0209i c0209i;
        ContentAlignment contentAlignment;
        int i15;
        int i16;
        ?? r10;
        int i17;
        boolean z14;
        ArrayList arrayList2;
        boolean zIsEmpty;
        ?? r14;
        InterfaceC22974l interfaceC22974lM66746i;
        int iHashCode6;
        C0213j c0213j2;
        C0209i c0209i2;
        C28677v1 c28677v1M87180u;
        C2307m c2307m;
        C2306l c2306l2 = C2299e.f9107J;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1465257629);
        int i18 = i14 & 4;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifier3 = i18 != 0 ? c2314t : modifier;
        boolean z15 = (i14 & 8) != 0 ? false : z4;
        c28655q.m87152f0(-412521741);
        C28674u2 c28674u2 = AbstractC35033k.f148295a;
        C35035m c35035m = (C35035m) c28655q.m87161k(c28674u2);
        c28655q.m87173q(false);
        Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, c35035m.f148366w, AbstractC17918w0.f69621a);
        C2307m c2307m2 = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
        int iHashCode7 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j3 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i3 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
        C0209i c0209i4 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
        C0209i c0209i5 = C0217k.f732j;
        if (!c28655q.f115903S) {
            c2306l = c2306l2;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
            c28655q.m87152f0(-1434477948);
            if (z15) {
                z13 = false;
            } else {
                if (step.getFormFactor().getTitleAlignment() == ContentAlignment.END) {
                    c2307m = c2307m2;
                } else {
                    c2307m = C2299e.f9116y;
                }
                z13 = false;
                c32561l.m101582b(AbstractC2294a.m7154a(10.0f, C1100b.f4583a.mo3400a(c2314t, c2307m)), 64, c28655q, 0);
            }
            c28655q.m87173q(z13);
            Modifier modifierM3405b = AbstractC1102d.m3405b(modifier3, 0.0f, 20, 1);
            c28655q.m87152f0(-412521741);
            C35035m c35035m2 = (C35035m) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            Modifier modifierM3394p = AbstractC1099a.m3394p(c35035m2.f148316M, modifierM3405b);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
            modifier2 = modifier3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, z15), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            c28655q.m87152f0(-412521741);
            C35035m c35035m3 = (C35035m) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c35035m3.f148317N), c2305k, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
            c32561l.m101584d(AbstractC1102d.m3409f(1.0f, c2314t), 70, c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87152f0(-1242271606);
            List<ContentBlock> content = step.getContent();
            arrayList = new ArrayList();
            for (Object obj : content) {
                if (obj instanceof MarkdownBlock) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                i17 = 64;
                r10 = 1;
                z14 = false;
                break;
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    i17 = 64;
                    r10 = 1;
                    z14 = false;
                    break;
                }
                if (((MarkdownBlock) it.next()).getMeta().getValue().length() > 0) {
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 6);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    contentAlignment = step.getFormFactor().getContentAlignment();
                    if (contentAlignment == null) {
                        i15 = -1;
                    } else {
                        i15 = AbstractC32550a.f134866a[contentAlignment.ordinal()];
                    }
                    i16 = 2;
                    r10 = 1;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            i16 = 4;
                        } else if (i15 == 3) {
                            i16 = 3;
                        }
                    }
                    i17 = 64;
                    z14 = false;
                    c32561l.m101585e(i16, 64, c28655q, 0);
                    c28655q.m87173q(true);
                    break;
                }
            }
            c28655q.m87173q(z14);
            c32561l.m101587g(c28655q, 8);
            c32561l.m101586f(null, i17, c28655q, r10);
            c28655q.m87173q(r10);
            List<ContentBlock> content2 = step.getContent();
            arrayList2 = new ArrayList();
            for (Object obj2 : content2) {
                if (obj2 instanceof ButtonBlock) {
                    arrayList2.add(obj2);
                }
            }
            zIsEmpty = arrayList2.isEmpty();
            boolean showStepCounter = c32561l.f134896a.getShowStepCounter();
            c28655q.m87152f0(182469504);
            if (zIsEmpty && showStepCounter) {
                C22949e c22949e = AbstractC22977m.f90650a;
                c28655q.m87152f0(-412521741);
                C35035m c35035m4 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
                r14 = 0;
                c28655q.m87173q(false);
                interfaceC22974lM66746i = AbstractC22977m.m66746i(c35035m4.f148317N);
            } else {
                r14 = 0;
                interfaceC22974lM66746i = AbstractC22977m.f90652c;
            }
            c28655q.m87173q(r14);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k, c28655q, r14);
            iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
            c32561l.m101581a(c28655q, 8);
            c28655q.m87152f0(182469752);
            if (!z15) {
                c32561l.m101583c(c28655q, 8);
            }
            AbstractC2875y.m8286B(c28655q, false, true, true, true);
            c28655q.m87173q(true);
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C27969p(step, c32561l, modifier2, z15, i13, i14);
        }
        c2306l = c2306l2;
        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
        C0209i c0209i7 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
        c28655q.m87152f0(-1434477948);
        if (z15) {
            if (step.getFormFactor().getTitleAlignment() == ContentAlignment.END) {
                c2307m = c2307m2;
            } else {
                c2307m = C2299e.f9116y;
            }
            z13 = false;
            c32561l.m101582b(AbstractC2294a.m7154a(10.0f, C1100b.f4583a.mo3400a(c2314t, c2307m)), 64, c28655q, 0);
        } else {
            z13 = false;
        }
        c28655q.m87173q(z13);
        Modifier modifierM3405b2 = AbstractC1102d.m3405b(modifier3, 0.0f, 20, 1);
        c28655q.m87152f0(-412521741);
        C35035m c35035m5 = (C35035m) c28655q.m87161k(c28674u2);
        c28655q.m87173q(false);
        Modifier modifierM3394p2 = AbstractC1099a.m3394p(c35035m5.f148316M, modifierM3405b2);
        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
        modifier2 = modifier3;
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d3);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m8);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
        iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m9);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N9);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        Modifier modifierM92116f1 = AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, z15), AbstractC30060g.m92099U(0, c28655q, 1), 14);
        c28655q.m87152f0(-412521741);
        C35035m c35035m6 = (C35035m) c28655q.m87161k(c28674u2);
        c28655q.m87173q(false);
        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c35035m6.f148317N), c2305k, c28655q, 0);
        iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a5);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m10);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N10);
        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 6);
        iHashCode4 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a3);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N11);
        c32561l.m101584d(AbstractC1102d.m3409f(1.0f, c2314t), 70, c28655q, 0);
        c28655q.m87173q(true);
        c28655q.m87152f0(-1242271606);
        List<ContentBlock> content3 = step.getContent();
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            if (obj instanceof MarkdownBlock) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            i17 = 64;
            r10 = 1;
            z14 = false;
            break;
        }
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                i17 = 64;
                r10 = 1;
                z14 = false;
                break;
            }
            if (((MarkdownBlock) it.next()).getMeta().getValue().length() > 0) {
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 6);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                contentAlignment = step.getFormFactor().getContentAlignment();
                if (contentAlignment == null) {
                    i15 = -1;
                } else {
                    i15 = AbstractC32550a.f134866a[contentAlignment.ordinal()];
                }
                i16 = 2;
                r10 = 1;
                if (i15 != 1) {
                    if (i15 != 2) {
                        i16 = 4;
                    } else if (i15 == 3) {
                        i16 = 3;
                    }
                }
                i17 = 64;
                z14 = false;
                c32561l.m101585e(i16, 64, c28655q, 0);
                c28655q.m87173q(true);
                break;
            }
        }
        c28655q.m87173q(z14);
        c32561l.m101587g(c28655q, 8);
        c32561l.m101586f(null, i17, c28655q, r10);
        c28655q.m87173q(r10);
        List<ContentBlock> content4 = step.getContent();
        arrayList2 = new ArrayList();
        while (r4.hasNext()) {
            if (obj2 instanceof ButtonBlock) {
                arrayList2.add(obj2);
            }
        }
        zIsEmpty = arrayList2.isEmpty();
        boolean showStepCounter2 = c32561l.f134896a.getShowStepCounter();
        c28655q.m87152f0(182469504);
        if (zIsEmpty) {
            r14 = 0;
            interfaceC22974lM66746i = AbstractC22977m.f90652c;
        } else {
            r14 = 0;
            interfaceC22974lM66746i = AbstractC22977m.f90652c;
        }
        c28655q.m87173q(r14);
        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k, c28655q, r14);
        iHashCode6 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
        InterfaceC0221l.f734a.getClass();
        c0213j2 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
        c0209i2 = C0217k.f732j;
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i2);
        } else {
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i2);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
        c32561l.m101581a(c28655q, 8);
        c28655q.m87152f0(182469752);
        if (!z15) {
            c32561l.m101583c(c28655q, 8);
        }
        AbstractC2875y.m8286B(c28655q, false, true, true, true);
        c28655q.m87173q(true);
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27969p(step, c32561l, modifier2, z15, i13, i14);
    }

    /* JADX INFO: renamed from: b */
    public static final long m99769b(int i13) {
        long j7 = (((long) i13) << 32) | (((long) 0) & 4294967295L);
        int i14 = AbstractC32070b.f133018r;
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m99770c(final boolean z4, final C35596e c35596e, Composer composer, final int i13) {
        int i14;
        int i15;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1357436343);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(c35596e) ? 32 : 16;
        }
        if ((i14 & 19) != 18 || !c28655q2.m87121F()) {
            if (c35596e == null) {
                C28677v1 c28677v1M87180u2 = c28655q2.m87180u();
                if (c28677v1M87180u2 != null) {
                    final int i16 = 0;
                    c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: x30.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i17) {
                                case 0:
                                    AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                                default:
                                    AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (((Boolean) C27648a.m83597t(c35596e.f151368f, c28655q2, 0).getValue()).booleanValue()) {
                C2306l c2306l = C2299e.f9108K;
                c28655q2.m87150e0(1696793641);
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(1696798064);
                boolean zM87157i = c28655q2.m87157i(c35596e) | c28655q2.m87157i(context);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37550r(6, c35596e, context);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q2.m87173q(false);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, z4, null, (InterfaceC4339a) objM87133R2, 24);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                int iOrdinal = ((EnumC11663h) c28655q2.m87161k(AbstractC11673r.f37715g)).ordinal();
                if (iOrdinal == 0) {
                    i15 = R.drawable.stripe_ic_photo_camera;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15 = R.drawable.stripe_ic_photo_camera_outlined;
                }
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(i15, c28655q2, 0);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_scan_card);
                C28674u2 c28674u2 = AbstractC14981d1.f55997a;
                float f13 = 18;
                AbstractC29125c.m88522c(abstractC26165aM88500I, strM92103Y, AbstractC1102d.m3411h(f13, AbstractC1102d.m3424u(f13, c2314t)), null, null, 0.0f, new C17903p(((C14970c1) c28655q2.m87161k(c28674u2)).m43091f(), 5), c28655q2, 384, 56);
                c28655q = c28655q2;
                AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(c28655q, R.string.stripe_scan_card), AbstractC1099a.m3398t(c2314t, 4, 0.0f, 0.0f, 0.0f, 14), ((C14970c1) c28655q.m87161k(c28674u2)).m43091f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56279f, c28655q, 48, 0, 65528);
                c28655q.m87173q(true);
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i17 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: x30.k1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i18) {
                            case 0:
                                AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                                break;
                            default:
                                AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        c28655q2.m87138X();
        c28655q = c28655q2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i18 = 1;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: x30.k1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                            break;
                        default:
                            AbstractC32076h.m99770c(z4, c35596e, composer2, AbstractC28683x.m87244L(i13 | 1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m99771d(InterfaceC26398o interfaceC26398o, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1380468206);
        if ((((c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87152f0(1849434622);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C35732u.f151983w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-1115894518);
            c28655q.m87152f0(1886828752);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(interfaceC4339a, 4));
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C35728q(3, (byte) 0), interfaceC26398o);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34238a(interfaceC26398o, i13, 18);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC31834n m99772e(C4470k c4470k, C4469j c4469j) {
        AbstractC32004s c37155h;
        String str;
        String str2;
        String str3;
        AbstractC32004s c37155h2;
        Map map = c4470k.f17995b;
        String strM13963a = c4470k.m13963a("credential_source", null);
        String str4 = c4470k.f17994a;
        if (strM13963a != null) {
            return new C37151d(strM13963a);
        }
        String strM13963a2 = c4470k.m13963a("role_arn", null);
        String strM13963a3 = c4470k.m13963a("web_identity_token_file", null);
        String strM13963a4 = c4470k.m13963a("role_session_name", null);
        if (strM13963a3 == null) {
            c37155h = null;
        } else {
            c37155h = strM13963a2 == null ? new C37155h(AbstractC11895b.m31996o("profile (", str4, ") missing `role_arn`")) : new C37156i(new C37154g(strM13963a2, strM13963a3, strM13963a4));
        }
        if (c37155h != null) {
            str = ") missing `sso_role_name`";
            str2 = ") missing `sso_account_id`";
            str3 = ") missing `sso_region`";
        } else {
            String strM13963a5 = c4470k.m13963a("sso_session", null);
            if (strM13963a5 == null) {
                c37155h = null;
            } else {
                Map map2 = (Map) c4469j.f17992a.get(EnumC4471l.f17999x);
                if (map2 == null) {
                    map2 = C25272z.f99163w;
                }
                C4470k c4470k2 = (C4470k) map2.get(strM13963a5);
                if (c4470k2 == null) {
                    c37155h = new C37155h("profile (" + str4 + ") references non-existing sso_session = `" + strM13963a5 + '`');
                } else {
                    String strM13963a6 = c4470k2.m13963a("sso_start_url", null);
                    if (strM13963a6 == null) {
                        c37155h = new C37155h(AbstractC11895b.m31996o("sso-session (", strM13963a5, ") missing `sso_start_url`"));
                    } else {
                        String strM13963a7 = c4470k2.m13963a("sso_region", null);
                        if (strM13963a7 == null) {
                            c37155h = new C37155h(AbstractC11895b.m31996o("sso-session (", strM13963a5, ") missing `sso_region`"));
                        } else {
                            String strM13963a8 = c4470k.m13963a("sso_account_id", null);
                            if (strM13963a8 == null) {
                                c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str4, ") missing `sso_account_id`"));
                            } else {
                                String strM13963a9 = c4470k.m13963a("sso_role_name", null);
                                if (strM13963a9 == null) {
                                    c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str4, ") missing `sso_role_name`"));
                                } else {
                                    str = ") missing `sso_role_name`";
                                    String strM13963a10 = c4470k2.m13963a("sso_region", null);
                                    str2 = ") missing `sso_account_id`";
                                    String strM13963a11 = c4470k.m13963a("sso_region", null);
                                    if (strM13963a10 == null || strM13963a11 == null || strM13963a10.equals(strM13963a11)) {
                                        str3 = ") missing `sso_region`";
                                        String strM13963a12 = c4470k2.m13963a("sso_start_url", null);
                                        String strM13963a13 = c4470k.m13963a("sso_start_url", null);
                                        if (strM13963a12 == null || strM13963a13 == null || strM13963a12.equals(strM13963a13)) {
                                            c37155h = new C37156i(new C37153f(strM13963a5, strM13963a6, strM13963a7, strM13963a8, strM13963a9));
                                        } else {
                                            StringBuilder sbM32001t = AbstractC11895b.m32001t("sso-session (", strM13963a5, ") sso_start_url = `", strM13963a12, "` does not match profile (");
                                            sbM32001t.append(str4);
                                            sbM32001t.append(") sso_start_url = `");
                                            sbM32001t.append(strM13963a13);
                                            sbM32001t.append('`');
                                            c37155h = new C37155h(sbM32001t.toString());
                                        }
                                    } else {
                                        str3 = ") missing `sso_region`";
                                        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("sso-session (", strM13963a5, ") sso_region = `", strM13963a10, "` does not match profile (");
                                        sbM32001t2.append(str4);
                                        sbM32001t2.append(") sso_region = `");
                                        sbM32001t2.append(strM13963a11);
                                        sbM32001t2.append('`');
                                        c37155h = new C37155h(sbM32001t2.toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str = ") missing `sso_role_name`";
            str2 = ") missing `sso_account_id`";
            str3 = ") missing `sso_region`";
        }
        if (c37155h == null) {
            if (map.containsKey("sso_account_id") || map.containsKey("sso_role_name")) {
                String strM13963a14 = c4470k.m13963a("sso_start_url", null);
                if (strM13963a14 == null) {
                    c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str4, ") missing `sso_start_url`"));
                } else {
                    String strM13963a15 = c4470k.m13963a("sso_region", null);
                    if (strM13963a15 == null) {
                        c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str4, str3));
                    } else {
                        String strM13963a16 = c4470k.m13963a("sso_account_id", null);
                        if (strM13963a16 == null) {
                            c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str4, str2));
                        } else {
                            String strM13963a17 = c4470k.m13963a("sso_role_name", null);
                            c37155h = strM13963a17 == null ? new C37155h(AbstractC11895b.m31996o("profile (", str4, str)) : new C37156i(new C37149b(strM13963a14, strM13963a15, strM13963a16, strM13963a17));
                        }
                    }
                }
            } else {
                c37155h = null;
            }
        }
        if (c37155h == null) {
            String strM13963a18 = c4470k.m13963a("login_session", null);
            c37155h = strM13963a18 == null ? null : new C37156i(new C37150c(strM13963a18));
        }
        if (c37155h == null) {
            if (map.containsKey("credential_process")) {
                String strM13963a19 = c4470k.m13963a("credential_process", null);
                if (strM13963a19 == null) {
                    c37155h2 = new C37155h(AbstractC11895b.m31996o("profile (", str4, ") missing `credential_process`"));
                } else {
                    c37155h = new C37156i(new C37152e(strM13963a19));
                }
            } else {
                c37155h2 = new C37155h(AbstractC11895b.m31996o("profile (", str4, ") did not contain credential information"));
            }
            c37155h = c37155h2;
        }
        if (c37155h instanceof C37156i) {
            return ((C37156i) c37155h).f158912a;
        }
        if (c37155h instanceof C37155h) {
            throw new ProviderConfigurationException(((C37155h) c37155h).f158911a, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static final C33823f m99773f(Function1 function1) {
        return new C33823f(function1, 1);
    }

    /* JADX INFO: renamed from: g */
    public static C33981k m99774g(Looper looper, Object obj, String str) {
        AbstractC35135w.m111095g(obj, "Listener must not be null");
        AbstractC35135w.m111095g(looper, "Looper must not be null");
        AbstractC35135w.m111095g(str, "Listener type must not be null");
        return new C33981k(looper, obj, str);
    }

    /* JADX INFO: renamed from: h */
    public static C33979j m99775h(AbstractC34036g abstractC34036g, String str) {
        AbstractC35135w.m111095g(abstractC34036g, "Listener must not be null");
        AbstractC35135w.m111093e(str, "Listener type must not be empty");
        return new C33979j(abstractC34036g, str);
    }

    /* JADX INFO: renamed from: i */
    public static final float m99776i(float f13, float f14, float f15) {
        return AbstractC12889b.m36249O(f13, f14, f15);
    }

    /* JADX INFO: renamed from: j */
    public static C38843h m99777j(JSONObject jSONObject) {
        if (!"card".equals(jSONObject.optString("object"))) {
            return null;
        }
        Integer numValueOf = !jSONObject.has("exp_month") ? null : Integer.valueOf(jSONObject.optInt("exp_month"));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        Integer numValueOf2 = (iIntValue < 1 || iIntValue > 12) ? null : Integer.valueOf(iIntValue);
        Integer numValueOf3 = !jSONObject.has("exp_year") ? null : Integer.valueOf(jSONObject.optInt("exp_year"));
        int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : -1;
        Integer numValueOf4 = iIntValue2 < 0 ? null : Integer.valueOf(iIntValue2);
        String strM99551t = AbstractC32004s.m99551t("address_city", jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("address_line1", jSONObject);
        String strM99551t3 = AbstractC32004s.m99551t("address_line1_check", jSONObject);
        String strM99551t4 = AbstractC32004s.m99551t("address_line2", jSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("address_country", jSONObject);
        String strM99551t6 = AbstractC32004s.m99551t("address_state", jSONObject);
        String strM99551t7 = AbstractC32004s.m99551t("address_zip", jSONObject);
        String strM99551t8 = AbstractC32004s.m99551t("address_zip_check", jSONObject);
        EnumC38853i enumC38853iM124346b = AbstractC38833g.m124346b(AbstractC32004s.m99551t("brand", jSONObject));
        String strM99547p = AbstractC32004s.m99547p(jSONObject.optString("country"));
        String str = (strM99547p == null || strM99547p.length() != 2) ? null : strM99547p;
        String strM99551t9 = AbstractC32004s.m99551t("customer", jSONObject);
        String strM99549r = AbstractC32004s.m99549r(jSONObject);
        String strM99551t10 = AbstractC32004s.m99551t("cvc_check", jSONObject);
        C33647p c33647p = EnumC38863j.f167290x;
        String strM99551t11 = AbstractC32004s.m99551t("funding", jSONObject);
        c33647p.getClass();
        EnumC38863j enumC38863jM106269k = C33647p.m106269k(strM99551t11);
        String strM99551t12 = AbstractC32004s.m99551t("fingerprint", jSONObject);
        String strM99551t13 = AbstractC32004s.m99551t("id", jSONObject);
        String strM99551t14 = AbstractC32004s.m99551t("last4", jSONObject);
        String strM99551t15 = AbstractC32004s.m99551t("name", jSONObject);
        C33623c0 c33623c0 = EnumC38852h8.f167234x;
        String strM99551t16 = AbstractC32004s.m99551t("tokenization_method", jSONObject);
        c33623c0.getClass();
        return new C38843h(numValueOf2, numValueOf4, strM99551t15, strM99551t2, strM99551t3, strM99551t4, strM99551t, strM99551t6, strM99551t7, strM99551t8, strM99551t5, strM99551t14, enumC38853iM124346b, enumC38863jM106269k, strM99551t12, str, strM99549r, strM99551t9, strM99551t10, strM99551t13, C33623c0.m106238m(strM99551t16));
    }

    /* JADX INFO: renamed from: k */
    public static X509Certificate m99778k(byte[] bArr) throws CertificateException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (certificateGenerateCertificate instanceof X509Certificate) {
            return (X509Certificate) certificateGenerateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + certificateGenerateCertificate.getType());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: l */
    public static boolean m99779l(C0690l0 c0690l0) {
        char cM1742l;
        if (c0690l0.m1735e()) {
            if (!c0690l0.m1740j('<')) {
                int i13 = 0;
                boolean z4 = true;
                while (c0690l0.m1735e()) {
                    char cM1742l2 = c0690l0.m1742l();
                    if (cM1742l2 == ' ') {
                        return !z4;
                    }
                    if (cM1742l2 == '\\') {
                        c0690l0.m1739i();
                        char cM1742l3 = c0690l0.m1742l();
                        switch (cM1742l3) {
                            default:
                                switch (cM1742l3) {
                                    default:
                                        switch (cM1742l3) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                break;
                                            default:
                                                switch (cM1742l3) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                break;
                                        }
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        c0690l0.m1739i();
                                        break;
                                }
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                c0690l0.m1739i();
                                break;
                        }
                    } else if (cM1742l2 == '(') {
                        i13++;
                        if (i13 <= 32) {
                            c0690l0.m1739i();
                        }
                    } else if (cM1742l2 != ')') {
                        if (Character.isISOControl(cM1742l2)) {
                            return !z4;
                        }
                        c0690l0.m1739i();
                    } else {
                        if (i13 == 0) {
                            return true;
                        }
                        i13--;
                        c0690l0.m1739i();
                    }
                    z4 = false;
                }
                return true;
            }
            while (c0690l0.m1735e() && (cM1742l = c0690l0.m1742l()) != '\n' && cM1742l != '<') {
                if (cM1742l == '>') {
                    c0690l0.m1739i();
                    return true;
                }
                if (cM1742l == '\\') {
                    c0690l0.m1739i();
                    char cM1742l4 = c0690l0.m1742l();
                    switch (cM1742l4) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            c0690l0.m1739i();
                            break;
                        default:
                            switch (cM1742l4) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c0690l0.m1739i();
                                    break;
                                default:
                                    switch (cM1742l4) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            c0690l0.m1739i();
                                            break;
                                        default:
                                            switch (cM1742l4) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c0690l0.m1739i();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    c0690l0.m1739i();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m99780n(C0690l0 c0690l0) {
        while (c0690l0.m1735e()) {
            switch (c0690l0.m1742l()) {
                case '[':
                    return false;
                case '\\':
                    c0690l0.m1739i();
                    char cM1742l = c0690l0.m1742l();
                    switch (cM1742l) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            c0690l0.m1739i();
                            break;
                        default:
                            switch (cM1742l) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c0690l0.m1739i();
                                    break;
                                default:
                                    switch (cM1742l) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            c0690l0.m1739i();
                                            break;
                                        default:
                                            switch (cM1742l) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c0690l0.m1739i();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    c0690l0.m1739i();
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m99781o(C0690l0 c0690l0, char c3) {
        while (c0690l0.m1735e()) {
            char cM1742l = c0690l0.m1742l();
            if (cM1742l == '\\') {
                c0690l0.m1739i();
                char cM1742l2 = c0690l0.m1742l();
                switch (cM1742l2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                        c0690l0.m1739i();
                        break;
                    default:
                        switch (cM1742l2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c0690l0.m1739i();
                                break;
                            default:
                                switch (cM1742l2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        c0690l0.m1739i();
                                        break;
                                    default:
                                        switch (cM1742l2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c0690l0.m1739i();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM1742l == c3) {
                    return true;
                }
                if (c3 == ')' && cM1742l == '(') {
                    return false;
                }
                c0690l0.m1739i();
            }
        }
        return true;
    }
}
