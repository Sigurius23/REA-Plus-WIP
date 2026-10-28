package s30;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.ImageBlock;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.VideoBlock;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.squareup.wire.AbstractC5583n;
import com.squareup.wire.AbstractC5586q;
import e93.AbstractC12889b;
import io.seon.androidsdk.service.AbstractC20660e1;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.AbstractC23269n0;
import p375op.AbstractC28076h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p507tx.AbstractC34236g;
import p507tx.C34233d;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p529uo.AbstractC35135w;
import p530up.C35145a;
import p547v8.AbstractC35785b;
import p558vp.C36257a;
import p571w3.C36781q;
import p598wy.InterfaceC37689b;
import p599wz.C37722h1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import sj.C32553d;
import sj.C32561l;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x30.C37924r1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s30.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32103e implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public static C36257a f133104w;

    /* JADX INFO: renamed from: a */
    public static final ArrayList m99879a(List list, AbstractC5586q adapter) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(adapter, "adapter");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m99880b(C37924r1 element, Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(element, "element");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1190130307);
        if ((((c28655q.m87157i(element) ? 4 : 2) | i13 | (c28655q.m87153g(modifier) ? 32 : 16)) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            String strM113396S = AbstractC35785b.m113396S(element.f162380b, c28655q);
            c28655q.m87150e0(-862935480);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C37722h1(22);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC5583n.m16769b(strM113396S, AbstractC18032n.m51775c(modifier, true, (Function1) objM87133R), false, c28655q, 0, 4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37888f1(element, modifier, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x016e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0172  */
    /* JADX WARN: Code duplicated, block: B:42:0x0193  */
    /* JADX INFO: renamed from: c */
    public static final void m99881c(NudgeStep step, C32561l c32561l, Modifier modifier, Composer composer, int i13) {
        int i14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2307m c2307m = C2299e.f9116y;
        C2307m c2307m2 = C2299e.f9114w;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1255361681);
        Modifier modifierM3405b = AbstractC1102d.m3405b(modifier, 0.0f, 20, 1);
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3405b, c35035m.f148366w, AbstractC17918w0.f69621a);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i2 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        List<ContentBlock> content = step.getContent();
        boolean z4 = content instanceof Collection;
        C2314t c2314t = C2314t.f9131w;
        C1100b c1100b = C1100b.f4583a;
        if (z4 && content.isEmpty()) {
            c28655q.m87152f0(11259913);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            i14 = 0;
            c32561l.m101582b(c1100b.mo3400a(c2314t, c2307m), 64, c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            Iterator<T> it = content.iterator();
            while (true) {
                if (it.hasNext()) {
                    ContentBlock contentBlock = (ContentBlock) it.next();
                    if ((contentBlock instanceof ImageBlock) || (contentBlock instanceof VideoBlock)) {
                        c28655q.m87152f0(11259587);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                        int iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        C0209i c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        float f13 = 6;
                        i14 = 0;
                        c32561l.m101586f(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f13, f13, 0.0f, 0.0f, 12)), 64, c28655q, 0);
                        c32561l.m101582b(AbstractC2294a.m7154a(10.0f, c1100b.mo3400a(c2314t, c2307m)), 64, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q.m87152f0(11259913);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    i14 = 0;
                    c32561l.m101582b(c1100b.mo3400a(c2314t, c2307m), 64, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            }
        }
        Modifier modifierM3394p = AbstractC1099a.m3394p(16, AbstractC1102d.m3409f(1.0f, c2314t));
        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, i14);
        int iHashCode4 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j4 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j4);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i4 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
        C0209i c0209i5 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
        C0209i c0209i6 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
        }
        C0209i c0209i7 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
        C22949e c22949e = AbstractC22977m.f90650a;
        C2306l c2306l = C2299e.f9107J;
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 6);
        int iHashCode5 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j4);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
        c32561l.m101584d(null, 64, c28655q, 1);
        c28655q.m87173q(true);
        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 6);
        int iHashCode6 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j4);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m7);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i6);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
        c32561l.m101585e(5, 64, c28655q, 0);
        c28655q.m87173q(true);
        c32561l.m101587g(c28655q, 8);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 1);
        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
        int iHashCode7 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j4);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a3);
        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m8);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
        }
        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
        c32561l.m101581a(c28655q, 8);
        c28655q.m87173q(true);
        c32561l.m101583c(c28655q, 8);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32553d(step, c32561l, modifier, i13, 1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[LOOP:0: B:21:0x0052->B:25:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m99882d(p512u2.InterfaceC34449b r7, s83.AbstractC32267a r8) {
        /*
            boolean r0 = r8 instanceof p633y0.C38772a
            if (r0 == 0) goto L13
            r0 = r8
            y0.a r0 = (p633y0.C38772a) r0
            int r1 = r0.f166873y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166873y = r1
            goto L18
        L13:
            y0.a r0 = new y0.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f166872x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f166873y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u2.b r7 = r0.f166871w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            p505ts.AbstractC34132o.m107864I(r8)
        L34:
            r0.f166871w = r7
            r0.f166873y = r3
            java.lang.Object r8 = p512u2.InterfaceC34449b.m108898H(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            u2.k r8 = (p512u2.C34465k) r8
            int r2 = r8.f144803d
            java.lang.Object r8 = r8.f144800a
            r2 = r2 & 66
            if (r2 == 0) goto L34
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L52:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r8.get(r5)
            u2.r r6 = (p512u2.C34472r) r6
            boolean r6 = p512u2.AbstractC34454d0.m108911b(r6)
            if (r6 != 0) goto L61
            goto L34
        L61:
            int r5 = r5 + 1
            goto L52
        L64:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s30.AbstractC32103e.m99882d(u2.b, s83.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public static int m99883e(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i13 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i13;
            }
            i13 = (i13 * 257) ^ bArr[length];
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m99884f(Object[] objArr, C4986c c4986c) {
        int length = objArr != null ? objArr.length : 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (AbstractC35135w.m111097i(objArr[i13], c4986c)) {
                if (i13 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final int m99885g(Object... objArr) {
        return Objects.hash(Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: h */
    public static final List m99886h(String str, List list) {
        if (list instanceof AbstractC34236g) {
            AbstractC30802r.m94771t(list);
            throw null;
        }
        if (list == C25271y.f99162w || (list instanceof C34233d)) {
            return list;
        }
        C34233d c34233d = new C34233d(list);
        if (c34233d.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return c34233d;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m99887i(Object obj) {
        if (obj == null || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m99887i(it.next()));
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(this)");
            return listUnmodifiableList;
        }
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("struct value custom must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(obj.getClass()) + ": " + obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            linkedHashMap.put(m99887i(entry.getKey()), m99887i(entry.getValue()));
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(this)");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: j */
    public static final C36781q m99888j(C36781q c36781q, C36781q c36781q2, float f13) {
        return new C36781q(AbstractC23269n0.m67331c(c36781q.f157361a, c36781q2.f157361a, f13), AbstractC23269n0.m67331c(c36781q.f157362b, c36781q2.f157362b, f13));
    }

    /* JADX INFO: renamed from: k */
    public static C35145a m99889k(CameraPosition cameraPosition) {
        AbstractC35135w.m111095g(cameraPosition, "cameraPosition must not be null");
        try {
            C36257a c36257aM99894q = m99894q();
            Parcel parcelM57322k0 = c36257aM99894q.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, cameraPosition);
            Parcel parcelM57321j0 = c36257aM99894q.m57321j0(parcelM57322k0, 7);
            InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
            parcelM57321j0.recycle();
            return new C35145a(interfaceC10934aM28986X);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C35145a m99890l(LatLngBounds latLngBounds, int i13) {
        AbstractC35135w.m111095g(latLngBounds, "bounds must not be null");
        try {
            C36257a c36257aM99894q = m99894q();
            Parcel parcelM57322k0 = c36257aM99894q.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, latLngBounds);
            parcelM57322k0.writeInt(i13);
            Parcel parcelM57321j0 = c36257aM99894q.m57321j0(parcelM57322k0, 10);
            InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
            parcelM57321j0.recycle();
            return new C35145a(interfaceC10934aM28986X);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: n */
    public static C35145a m99891n(LatLng latLng, float f13) {
        AbstractC35135w.m111095g(latLng, "latLng must not be null");
        try {
            C36257a c36257aM99894q = m99894q();
            Parcel parcelM57322k0 = c36257aM99894q.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, latLng);
            parcelM57322k0.writeFloat(f13);
            Parcel parcelM57321j0 = c36257aM99894q.m57321j0(parcelM57322k0, 9);
            InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
            parcelM57321j0.recycle();
            return new C35145a(interfaceC10934aM28986X);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m99892o(AbstractC20660e1 abstractC20660e1, ByteBuffer byteBuffer, int i13) throws EOFException {
        AbstractC22676k.m65750j(abstractC20660e1, "<this>");
        ByteBuffer byteBuffer2 = (ByteBuffer) abstractC20660e1.f77291g;
        int i14 = abstractC20660e1.f77286b;
        if (abstractC20660e1.f77287c - i14 < i13) {
            throw new EOFException(AbstractC31061c.m95639o("Not enough bytes to read a buffer content of size ", i13, '.'));
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i13);
            AbstractC12889b.m36293w(byteBuffer2, byteBuffer, i14);
            byteBuffer.limit(iLimit);
            abstractC20660e1.m56793d(i13);
        } catch (Throwable th3) {
            byteBuffer.limit(iLimit);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final String m99893p(String value) {
        AbstractC22676k.m65750j(value, "value");
        StringBuilder sb4 = new StringBuilder(value.length());
        for (int i13 = 0; i13 < value.length(); i13++) {
            char cCharAt = value.charAt(i13);
            if (AbstractC39414r.m125875T(",[]{}\\", cCharAt, false)) {
                sb4.append('\\');
            }
            sb4.append(cCharAt);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: q */
    public static C36257a m99894q() {
        C36257a c36257a = f133104w;
        AbstractC35135w.m111095g(c36257a, "CameraUpdateFactory is not initialized");
        return c36257a;
    }
}
