package t23;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3028k2;
import bc3.InterfaceC3027k1;
import hc3.C17171d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import l83.C23470p;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C33384f {

    /* JADX INFO: renamed from: a */
    public final C17171d f139368a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap.KeySetView f139369b;

    /* JADX INFO: renamed from: c */
    public final EnumC33372c4 f139370c;

    /* JADX INFO: renamed from: d */
    public final long f139371d;

    /* JADX INFO: renamed from: e */
    public final C23470p f139372e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f139373f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f139374g;

    public C33384f(C17171d c17171d, ConcurrentHashMap.KeySetView keySetView) {
        EnumC33372c4 enumC33372c4 = EnumC33372c4.f139323x;
        this.f139368a = c17171d;
        this.f139369b = keySetView;
        this.f139370c = enumC33372c4;
        this.f139371d = 5000L;
        this.f139372e = AbstractC1772c1.m5382S(this, "ActiveStateGate");
        this.f139373f = new AtomicReference();
        this.f139374g = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m105841a(C33384f c33384f, C33368c0 c33368c0, AbstractC32269c abstractC32269c) {
        C33355a c33355a;
        long jCurrentTimeMillis;
        c33384f.getClass();
        if (abstractC32269c instanceof C33355a) {
            c33355a = (C33355a) abstractC32269c;
            int i13 = c33355a.f139174E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33355a.f139174E = i13 - Integer.MIN_VALUE;
            } else {
                c33355a = new C33355a(c33384f, abstractC32269c);
            }
        } else {
            c33355a = new C33355a(c33384f, abstractC32269c);
        }
        Object objM8750d = c33355a.f139177y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33355a.f139174E;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = c33384f.f139371d;
            C32139c0 c32139c0 = new C32139c0(c33384f, c33368c0, interfaceC30057d, 5);
            c33355a.f139175w = c33384f;
            c33355a.f139176x = jCurrentTimeMillis;
            c33355a.f139174E = 1;
            objM8750d = AbstractC3028k2.m8750d(j7, c32139c0, c33355a);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = c33355a.f139176x;
            C33384f c33384f2 = c33355a.f139175w;
            AbstractC34132o.m107864I(objM8750d);
            jCurrentTimeMillis = j13;
            c33384f = c33384f2;
        }
        C23454a0 c23454a0 = (C23454a0) objM8750d;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (c23454a0 != null) {
            C2345k c2345kM105844d = c33384f.m105844d();
            InterfaceC2339e interfaceC2339e = c2345kM105844d.f9275c;
            String str = c2345kM105844d.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105844d.f9274b.log(enumC2341g, str, AbstractC31061c.m95636l(jCurrentTimeMillis2, "[observeConnection] Connected in ", "ms"), null);
            }
        } else {
            C2345k c2345kM105844d2 = c33384f.m105844d();
            InterfaceC2339e interfaceC2339e2 = c2345kM105844d2.f9275c;
            String str2 = c2345kM105844d2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM105844d2.f9274b.log(enumC2341g2, str2, AbstractC31061c.m95636l(jCurrentTimeMillis2, "[observeConnection] Timeout after ", "ms"), null);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m105842b(t23.C33384f r4, t23.C33368c0 r5, s83.AbstractC32269c r6) {
        /*
            r4.getClass()
            boolean r5 = r6 instanceof t23.C33379e
            if (r5 == 0) goto L16
            r5 = r6
            t23.e r5 = (t23.C33379e) r5
            int r0 = r5.f139342y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L16
            int r0 = r0 - r1
            r5.f139342y = r0
            goto L1b
        L16:
            t23.e r5 = new t23.e
            r5.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r5.f139340w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r5 = r5.f139342y
            r0 = 0
            if (r5 == 0) goto L37
            r4 = 1
            if (r5 != r4) goto L2f
            p505ts.AbstractC34132o.m107864I(r6)     // Catch: java.lang.Exception -> L2b io.getstream.video.android.core.CallJoinInterceptionException -> L2c java.util.concurrent.CancellationException -> L2d
            throw r0     // Catch: java.lang.Exception -> L2b
        L2b:
            throw r0
        L2c:
            throw r0
        L2d:
            r4 = move-exception
            throw r4
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p505ts.AbstractC34132o.m107864I(r6)
            long r5 = java.lang.System.currentTimeMillis()
            b23.k r4 = r4.m105844d()
            b23.e r1 = r4.f9275c
            java.lang.String r2 = r4.f9273a
            b23.g r3 = b23.EnumC2341g.DEBUG
            boolean r1 = r1.isLoggable(r3, r2)
            if (r1 == 0) goto L59
            b23.j r4 = r4.f9274b
            java.lang.String r1 = "[invokeInterceptor] start at "
            java.lang.String r5 = p088dc.AbstractC11895b.m31994m(r5, r1)
            r4.log(r3, r2, r5, r0)
        L59:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33384f.m105842b(t23.f, t23.c0, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m105843c() {
        AtomicReference atomicReference = this.f139373f;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) atomicReference.get();
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        atomicReference.set(null);
        AtomicReference atomicReference2 = this.f139374g;
        InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) atomicReference2.get();
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        atomicReference2.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final C2345k m105844d() {
        return (C2345k) this.f139372e.getValue();
    }
}
