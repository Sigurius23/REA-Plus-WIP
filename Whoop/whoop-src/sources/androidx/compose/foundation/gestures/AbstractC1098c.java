package androidx.compose.foundation.gestures;

import androidx.compose.p018ui.Modifier;
import e10.C12554k0;
import go1.C16016a;
import java.util.Collection;
import p180h0.C16469v3;
import p180h0.InterfaceC16361a4;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p512u2.C34460g0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import r83.EnumC31071a;
import s83.AbstractC32267a;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1098c {
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m3375a(p512u2.InterfaceC34449b r5, e10.C12554k0 r6, s83.AbstractC32267a r7) {
        /*
            boolean r0 = r7 instanceof p180h0.C16474w3
            if (r0 == 0) goto L13
            r0 = r7
            h0.w3 r0 = (p180h0.C16474w3) r0
            int r1 = r0.f63307z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63307z = r1
            goto L18
        L13:
            h0.w3 r0 = new h0.w3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f63306y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f63307z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            e10.k0 r5 = r0.f63305x
            u2.b r6 = r0.f63304w
            p505ts.AbstractC34132o.m107864I(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            p505ts.AbstractC34132o.m107864I(r7)
        L39:
            r0.f63304w = r5
            r0.f63305x = r6
            r0.f63307z = r3
            java.lang.Object r7 = m3377c(r5, r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            h2.b r7 = (p181h2.C16617b) r7
            if (r7 == 0) goto L39
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC1098c.m3375a(u2.b, e10.k0, s83.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0115  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123 A[LOOP:2: B:27:0x0113->B:31:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0235 -> B:76:0x0247). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m3376b(p512u2.InterfaceC34449b r26, dc3.C11923h r27, eg.C13161j r28, s83.AbstractC32267a r29) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC1098c.m3376b(u2.b, dc3.h, eg.j, s83.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final Object m3377c(InterfaceC34449b interfaceC34449b, C12554k0 c12554k0, AbstractC32267a abstractC32267a) {
        C16469v3 c16469v3;
        if (abstractC32267a instanceof C16469v3) {
            c16469v3 = (C16469v3) abstractC32267a;
            int i13 = c16469v3.f63276z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16469v3.f63276z = i13 - Integer.MIN_VALUE;
            } else {
                c16469v3 = new C16469v3(abstractC32267a);
            }
        } else {
            c16469v3 = new C16469v3(abstractC32267a);
        }
        Object objM108928a = c16469v3.f63275y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16469v3.f63276z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108928a);
            c16469v3.f63273w = interfaceC34449b;
            c16469v3.f63274x = c12554k0;
            c16469v3.f63276z = 1;
            objM108928a = ((C34460g0) interfaceC34449b).m108928a(EnumC34466l.f144807x, c16469v3);
            if (objM108928a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12554k0 = c16469v3.f63274x;
            interfaceC34449b = c16469v3.f63273w;
            AbstractC34132o.m107864I(objM108928a);
        }
        C34465k c34465k = (C34465k) objM108928a;
        if ((c34465k.f144804e & 4096) == 0 || c34465k.f144805f != 6) {
            return null;
        }
        C34462h0 c34462h0 = ((C34460g0) interfaceC34449b).f144774F;
        long jM35237l = c12554k0.m35237l(c34465k);
        if (C16617b.m47187c(jM35237l, 0L)) {
            return null;
        }
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        for (int i15 = 0; i15 < size; i15++) {
            ((C34472r) r10.get(i15)).m108946a();
        }
        return new C16617b(jM35237l);
    }

    /* JADX INFO: renamed from: d */
    public static Modifier m3378d(Modifier modifier, InterfaceC16361a4 interfaceC16361a4) {
        return modifier.mo3471e(new TransformableElement(interfaceC16361a4, new C16016a(24)));
    }
}
