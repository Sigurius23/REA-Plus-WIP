package p180h0;

import a30.C0323s;
import androidx.compose.p018ui.input.pointer.PointerEventTimeoutCancellationException;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import g20.C15270p;
import java.util.Collection;
import l83.C23454a0;
import m12.C24935c;
import p088dc.AbstractC11895b;
import p133f1.C13985v0;
import p163g1.C14986d6;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34454d0;
import p512u2.C34460g0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32267a;

/* JADX INFO: renamed from: h0.o3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16434o3 {

    /* JADX INFO: renamed from: a */
    public static final C16378d3 f63148a = new C16378d3(3, null);

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[LOOP:0: B:19:0x004c->B:20:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[LOOP:1: B:22:0x0063->B:26:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0065
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m46601a(p512u2.InterfaceC34449b r8, s83.AbstractC32267a r9) {
        /*
            boolean r0 = r9 instanceof p180h0.C16399h3
            if (r0 == 0) goto L13
            r0 = r9
            h0.h3 r0 = (p180h0.C16399h3) r0
            int r1 = r0.f63044y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63044y = r1
            goto L18
        L13:
            h0.h3 r0 = new h0.h3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f63043x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f63044y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u2.b r8 = r0.f63042w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            p505ts.AbstractC34132o.m107864I(r9)
        L34:
            r0.f63042w = r8
            r0.f63044y = r3
            java.lang.Object r9 = p512u2.InterfaceC34449b.m108898H(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            u2.k r9 = (p512u2.C34465k) r9
            java.lang.Object r2 = r9.f144800a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L4c:
            if (r6 >= r4) goto L5a
            java.lang.Object r7 = r2.get(r6)
            u2.r r7 = (p512u2.C34472r) r7
            r7.m108946a()
            int r6 = r6 + 1
            goto L4c
        L5a:
            java.lang.Object r9 = r9.f144800a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L63:
            if (r5 >= r2) goto L73
            java.lang.Object r4 = r9.get(r5)
            u2.r r4 = (p512u2.C34472r) r4
            boolean r4 = r4.f144818d
            if (r4 == 0) goto L70
            goto L34
        L70:
            int r5 = r5 + 1
            goto L63
        L73:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16434o3.m46601a(u2.b, s83.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m46602b(p512u2.InterfaceC34449b r6, boolean r7, p512u2.EnumC34466l r8, q83.InterfaceC30057d r9) {
        /*
            boolean r0 = r9 instanceof p180h0.C16384e3
            if (r0 == 0) goto L13
            r0 = r9
            h0.e3 r0 = (p180h0.C16384e3) r0
            int r1 = r0.f62992E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62992E = r1
            goto L18
        L13:
            h0.e3 r0 = new h0.e3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62996z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f62992E
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.f62995y
            u2.l r7 = r0.f62994x
            u2.b r8 = r0.f62993w
            p505ts.AbstractC34132o.m107864I(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p505ts.AbstractC34132o.m107864I(r9)
        L3c:
            r0.f62993w = r6
            r0.f62994x = r8
            r0.f62995y = r7
            r0.f62992E = r3
            u2.g0 r6 = (p512u2.C34460g0) r6
            java.lang.Object r9 = r6.m108928a(r8, r0)
            if (r9 != r1) goto L4d
            return r1
        L4d:
            u2.k r9 = (p512u2.C34465k) r9
            r2 = 0
            boolean r4 = m46606f(r9, r7, r2)
            if (r4 == 0) goto L3c
            java.lang.Object r6 = r9.f144800a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16434o3.m46602b(u2.b, boolean, u2.l, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m46603c(InterfaceC34449b interfaceC34449b, InterfaceC30057d interfaceC30057d, int i13) {
        EnumC34466l enumC34466l = EnumC34466l.f144806w;
        boolean z4 = (i13 & 1) != 0;
        if ((i13 & 2) != 0) {
            enumC34466l = EnumC34466l.f144807x;
        }
        return m46602b(interfaceC34449b, z4, enumC34466l, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m46604d(p512u2.InterfaceC34449b r6, p512u2.EnumC34466l r7, s83.AbstractC32267a r8) {
        /*
            boolean r0 = r8 instanceof p180h0.C16389f3
            if (r0 == 0) goto L13
            r0 = r8
            h0.f3 r0 = (p180h0.C16389f3) r0
            int r1 = r0.f63021z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63021z = r1
            goto L18
        L13:
            h0.f3 r0 = new h0.f3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f63020y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f63021z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            u2.l r6 = r0.f63019x
            u2.b r7 = r0.f63018w
            p505ts.AbstractC34132o.m107864I(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            p505ts.AbstractC34132o.m107864I(r8)
        L39:
            r0.f63018w = r6
            r0.f63019x = r7
            r0.f63021z = r3
            u2.g0 r6 = (p512u2.C34460g0) r6
            java.lang.Object r8 = r6.m108928a(r7, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            u2.k r8 = (p512u2.C34465k) r8
            r2 = 0
            boolean r4 = m46606f(r8, r2, r3)
            if (r4 == 0) goto L39
            java.lang.Object r6 = r8.f144800a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16434o3.m46604d(u2.b, u2.l, s83.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public static Object m46605e(InterfaceC34476v interfaceC34476v, Function1 function1, C24935c c24935c, C14986d6 c14986d6, Function1 function2, InterfaceC30057d interfaceC30057d, int i13) {
        Function1 function3 = (i13 & 1) != 0 ? null : function1;
        C24935c c24935c2 = (i13 & 2) != 0 ? null : c24935c;
        Object obj = c14986d6;
        if ((i13 & 4) != 0) {
            obj = f63148a;
        }
        Object objM8719m = AbstractC3006f0.m8719m(new C0323s(interfaceC34476v, obj, c24935c2, function3, (i13 & 8) != 0 ? null : function2, null, 2), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final boolean m46606f(C34465k c34465k, boolean z4, boolean z13) {
        if (z13) {
            ?? r10 = c34465k.f144800a;
            int size = ((Collection) r10).size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    if ((c34465k.f144803d & 33) != 0) {
                        break;
                    }
                    return false;
                }
                if (((C34472r) r10.get(i13)).f144823i != 2) {
                    break;
                }
                i13++;
            }
        }
        ?? r14 = c34465k.f144800a;
        int size2 = ((Collection) r14).size();
        for (int i14 = 0; i14 < size2; i14++) {
            C34472r c34472r = (C34472r) r14.get(i14);
            if (!(z4 ? AbstractC34454d0.m108911b(c34472r) : AbstractC34454d0.m108912c(c34472r))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static C2996c2 m46608h(InterfaceC2994c0 interfaceC2994c0, InterfaceC3027k1 interfaceC3027k1, InterfaceC4351m interfaceC4351m) {
        return AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new C15270p(interfaceC3027k1, interfaceC4351m, (InterfaceC30057d) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m46609i(InterfaceC34449b interfaceC34449b, EnumC34466l enumC34466l, AbstractC32267a abstractC32267a) {
        C16424m3 c16424m3;
        C22669g0 c22669g0;
        if (abstractC32267a instanceof C16424m3) {
            c16424m3 = (C16424m3) abstractC32267a;
            int i13 = c16424m3.f63122y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16424m3.f63122y = i13 - Integer.MIN_VALUE;
            } else {
                c16424m3 = new C16424m3(abstractC32267a);
            }
        } else {
            c16424m3 = new C16424m3(abstractC32267a);
        }
        Object obj = c16424m3.f63121x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16424m3.f63122y;
        try {
            if (i14 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c22669g0M32004w.f89336w = C16452s1.f63225a;
                C34460g0 c34460g0 = (C34460g0) interfaceC34449b;
                long jMo496c = c34460g0.m108930f().getLongPressTimeoutMillis();
                C13985v0 c13985v0 = new C13985v0(enumC34466l, c22669g0M32004w, null, 3);
                c16424m3.f63120w = c22669g0M32004w;
                c16424m3.f63122y = 1;
                if (c34460g0.m108931k(jMo496c, c13985v0, c16424m3) == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g0M32004w;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = c16424m3.f63120w;
                AbstractC34132o.m107864I(obj);
            }
            return c22669g0.f89336w;
        } catch (PointerEventTimeoutCancellationException unused) {
            return C16462u1.f63245a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[LOOP:2: B:27:0x0086->B:33:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc A[LOOP:1: B:23:0x0070->B:45:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b7 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m46610j(p512u2.InterfaceC34449b r17, p512u2.EnumC34466l r18, s83.AbstractC32267a r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.AbstractC16434o3.m46610j(u2.b, u2.l, s83.a):java.lang.Object");
    }
}
