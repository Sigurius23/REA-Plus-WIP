package p647yf;

import bc3.AbstractC3006f0;
import java.io.Closeable;
import java.io.IOException;
import ne3.AbstractC26604b;
import p132f0.C13774c;
import p499t9.C33652u;
import p505ts.AbstractC34132o;
import p679zf.AbstractC40608i;
import p679zf.C40604e;
import p679zf.C40606g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: yf.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39497j {

    /* JADX INFO: renamed from: a */
    public static final C39491d f169913a = new C39491d(null);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39499l m126156a(InterfaceC39507t interfaceC39507t) {
        AbstractC22676k.m65750j(interfaceC39507t, "<this>");
        if (interfaceC39507t instanceof InterfaceC39499l) {
            return (InterfaceC39499l) interfaceC39507t;
        }
        return new C39488a(AbstractC26604b.m79157b(interfaceC39507t instanceof C40604e ? ((C40604e) interfaceC39507t).f174967w : new C40606g(interfaceC39507t)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m126157b(Object obj) throws IOException {
        AbstractC22676k.m65750j(obj, "<this>");
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m126158c(InterfaceC39502o interfaceC39502o, InterfaceC39507t interfaceC39507t, AbstractC32269c abstractC32269c) {
        return AbstractC3006f0.m8705K(AbstractC40608i.f174971a, new C13774c(interfaceC39507t, interfaceC39502o, (InterfaceC30057d) null), abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m126159d(p647yf.InterfaceC39502o r7, p647yf.C39498k r8, s83.AbstractC32269c r9) {
        /*
            boolean r0 = r9 instanceof p647yf.C39503p
            if (r0 == 0) goto L13
            r0 = r9
            yf.p r0 = (p647yf.C39503p) r0
            int r1 = r0.f169918z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169918z = r1
            goto L18
        L13:
            yf.p r0 = new yf.p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f169917y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f169918z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yf.k r7 = r0.f169916x
            yf.o r8 = r0.f169915w
            p505ts.AbstractC34132o.m107864I(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p505ts.AbstractC34132o.m107864I(r9)
        L39:
            r0.f169915w = r7
            r0.f169916x = r8
            r0.f169918z = r3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = r7.mo106283b(r8, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            boolean r9 = r7.mo106286h()
            if (r9 == 0) goto L39
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p647yf.AbstractC39497j.m126159d(yf.o, yf.k, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m126160e(C33652u c33652u, AbstractC32269c abstractC32269c) {
        C39504q c39504q;
        if (abstractC32269c instanceof C39504q) {
            c39504q = (C39504q) abstractC32269c;
            int i13 = c39504q.f169921y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39504q.f169921y = i13 - Integer.MIN_VALUE;
            } else {
                c39504q = new C39504q(abstractC32269c);
            }
        } else {
            c39504q = new C39504q(abstractC32269c);
        }
        Object obj = c39504q.f169920x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39504q.f169921y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C39498k c39498k = c39504q.f169919w;
            AbstractC34132o.m107864I(obj);
            return c39498k;
        }
        AbstractC34132o.m107864I(obj);
        C39498k c39498k2 = new C39498k();
        c39504q.f169919w = c39498k2;
        c39504q.f169921y = 1;
        return m126159d(c33652u, c39498k2, c39504q) == enumC31071a ? enumC31071a : c39498k2;
    }
}
