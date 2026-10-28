package f63;

import a63.AbstractC0501r;
import a63.InterfaceC0500q;
import bc3.C3023j1;
import bc3.InterfaceC3061u;
import e63.C12775d;
import g63.AbstractC15538b;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30061h;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v53.C35709c;
import w53.C36845b;
import y53.AbstractC39245e;

/* JADX INFO: renamed from: f63.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C14162j {

    /* JADX INFO: renamed from: a */
    public final C12775d f51024a;

    /* JADX INFO: renamed from: b */
    public final C35709c f51025b;

    public C14162j(C12775d c12775d, C35709c client) {
        Set setKeySet;
        AbstractC22676k.m65750j(client, "client");
        this.f51024a = c12775d;
        this.f51025b = client;
        Map map = (Map) c12775d.f43714f.m83376d(AbstractC39245e.f168745a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<InterfaceC0500q> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof InterfaceC0500q) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC0500q interfaceC0500q : arrayList) {
            if (AbstractC0501r.m1208b(this.f51025b, interfaceC0500q) == null) {
                throw new IllegalArgumentException(("Consider installing " + interfaceC0500q + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40346a(AbstractC14155c abstractC14155c, AbstractC32269c abstractC32269c) {
        C14159g c14159g;
        if (abstractC32269c instanceof C14159g) {
            c14159g = (C14159g) abstractC32269c;
            int i13 = c14159g.f51015z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14159g.f51015z = i13 - Integer.MIN_VALUE;
            } else {
                c14159g = new C14159g(this, abstractC32269c);
            }
        } else {
            c14159g = new C14159g(this, abstractC32269c);
        }
        Object obj = c14159g.f51013x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14159g.f51015z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC30061h interfaceC30061h = abstractC14155c.getCoroutineContext().get(C3023j1.f12041w);
            AbstractC22676k.m65747g(interfaceC30061h);
            InterfaceC3061u interfaceC3061u = (InterfaceC3061u) interfaceC30061h;
            interfaceC3061u.complete();
            try {
                InterfaceC20024q interfaceC20024qMo13322b = abstractC14155c.mo13322b();
                AbstractC22676k.m65750j(interfaceC20024qMo13322b, "<this>");
                ((C20020m) interfaceC20024qMo13322b).m55845i(new CancellationException("Channel has been cancelled"));
            } catch (Throwable unused) {
            }
            c14159g.f51012w = interfaceC3061u;
            c14159g.f51015z = 1;
            if (interfaceC3061u.join(c14159g) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if (r2.m40346a(r11, r0) == r1) goto L49;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40347b(androidx.room.C1849z1 r10, q83.InterfaceC30057d r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof f63.C14160h
            if (r0 == 0) goto L13
            r0 = r11
            f63.h r0 = (f63.C14160h) r0
            int r1 = r0.f51016E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51016E = r1
            goto L18
        L13:
            f63.h r0 = new f63.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f51019y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51016E
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L64
            if (r2 == r7) goto L58
            if (r2 == r6) goto L47
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.f51017w
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto La3
        L3e:
            r10 = move-exception
            goto La4
        L41:
            java.lang.Object r10 = r0.f51017w
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            return r10
        L47:
            java.lang.Object r10 = r0.f51018x
            f63.c r10 = (f63.AbstractC14155c) r10
            java.lang.Object r2 = r0.f51017w
            f63.j r2 = (f63.C14162j) r2
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Throwable -> L53
            goto L87
        L53:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L96
        L58:
            java.lang.Object r10 = r0.f51018x
            c93.m r10 = (c93.InterfaceC4351m) r10
            java.lang.Object r2 = r0.f51017w
            f63.j r2 = (f63.C14162j) r2
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto L75
        L64:
            p505ts.AbstractC34132o.m107864I(r11)
            r0.f51017w = r9     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51018x = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51016E = r7     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r9.m40348c(r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r1) goto L74
            goto La2
        L74:
            r2 = r9
        L75:
            f63.c r11 = (f63.AbstractC14155c) r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51017w = r2     // Catch: java.lang.Throwable -> L95
            r0.f51018x = r11     // Catch: java.lang.Throwable -> L95
            r0.f51016E = r6     // Catch: java.lang.Throwable -> L95
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L95
            if (r10 != r1) goto L84
            goto La2
        L84:
            r8 = r11
            r11 = r10
            r10 = r8
        L87:
            r0.f51017w = r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51018x = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51016E = r5     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r10 = r2.m40346a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r10 != r1) goto L94
            goto La2
        L94:
            return r11
        L95:
            r10 = move-exception
        L96:
            r0.f51017w = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51018x = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f51016E = r4     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r2.m40346a(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r1) goto La3
        La2:
            return r1
        La3:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L3e
        La4:
            java.lang.Throwable r10 = g63.AbstractC15538b.m43736a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f63.C14162j.m40347b(androidx.room.z1, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m40348c(AbstractC32269c abstractC32269c) throws Throwable {
        C14161i c14161i;
        if (abstractC32269c instanceof C14161i) {
            c14161i = (C14161i) abstractC32269c;
            int i13 = c14161i.f51023y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14161i.f51023y = i13 - Integer.MIN_VALUE;
            } else {
                c14161i = new C14161i(this, abstractC32269c);
            }
        } else {
            c14161i = new C14161i(this, abstractC32269c);
        }
        Object objM113181b = c14161i.f51021w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14161i.f51023y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM113181b);
                C12775d c12775d = new C12775d();
                c12775d.m35805b(this.f51024a);
                C35709c c35709c = this.f51025b;
                c14161i.f51023y = 1;
                objM113181b = c35709c.m113181b(c12775d, c14161i);
                if (objM113181b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM113181b);
            }
            return ((C36845b) objM113181b).m118140d();
        } catch (CancellationException e5) {
            throw AbstractC15538b.m43736a(e5);
        }
    }

    public final String toString() {
        return "HttpStatement[" + this.f51024a.f43709a.m52177c() + ']';
    }
}
