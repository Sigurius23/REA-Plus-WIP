package io.ktor.utils.p228io;

import bc3.C3033m;
import bc3.InterfaceC3027k1;
import ge3.AbstractC15751g;
import io.ktor.utils.p228io.internal.AbstractC19994d;
import io.ktor.utils.p228io.internal.AbstractC19997g;
import io.ktor.utils.p228io.internal.AbstractC20003m;
import io.ktor.utils.p228io.internal.C19991a;
import io.ktor.utils.p228io.internal.C19992b;
import io.ktor.utils.p228io.internal.C19993c;
import io.ktor.utils.p228io.internal.C19998h;
import io.ktor.utils.p228io.internal.C19999i;
import io.ktor.utils.p228io.internal.C20000j;
import io.ktor.utils.p228io.internal.C20002l;
import io.ktor.utils.p228io.internal.C20005o;
import io.seon.androidsdk.service.AbstractC20660e1;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p040c0.C3743h;
import p477s2.AbstractC32073e;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import v63.AbstractC35744b;
import v63.C35746d;
import w63.AbstractC36867b;
import w63.C36866a;
import x63.InterfaceC38034f;

/* JADX INFO: renamed from: io.ktor.utils.io.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C20020m implements InterfaceC20021n, InterfaceC20024q, InterfaceC20026s {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75109j = AtomicReferenceFieldUpdater.newUpdater(C20020m.class, Object.class, "_state");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75110k = AtomicReferenceFieldUpdater.newUpdater(C20020m.class, Object.class, "_closed");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75111l = AtomicReferenceFieldUpdater.newUpdater(C20020m.class, Object.class, "_readOp");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75112m = AtomicReferenceFieldUpdater.newUpdater(C20020m.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC3027k1 attachedJob;

    /* JADX INFO: renamed from: b */
    public final boolean f75113b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38034f f75114c;

    /* JADX INFO: renamed from: d */
    public final int f75115d;

    /* JADX INFO: renamed from: e */
    public int f75116e;

    /* JADX INFO: renamed from: f */
    public int f75117f;

    /* JADX INFO: renamed from: g */
    public final C19992b f75118g;

    /* JADX INFO: renamed from: h */
    public final C19992b f75119h;

    /* JADX INFO: renamed from: i */
    public final C20019l f75120i;
    private volatile AbstractC19994d joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    public C20020m(ByteBuffer byteBuffer) {
        this(false, AbstractC19997g.f75051d, 0);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        AbstractC22676k.m65749i(byteBufferSlice, "content.slice()");
        C20000j c20000j = new C20000j(byteBufferSlice, 0);
        c20000j.f75064b.m55809e();
        this._state = c20000j.f75058g;
        m55824B();
        m55845i(null);
        m55830H();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public static Object m55818J(C20020m c20020m, int i13, C3743h c3743h, AbstractC32269c abstractC32269c) throws Throwable {
        C19988g c19988g;
        Function1 block;
        C20020m c20020m2;
        int i14;
        int iPosition;
        boolean z4;
        if (abstractC32269c instanceof C19988g) {
            c19988g = (C19988g) abstractC32269c;
            int i15 = c19988g.f75023F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c19988g.f75023F = i15 - Integer.MIN_VALUE;
            } else {
                c19988g = new C19988g(c20020m, abstractC32269c);
            }
        } else {
            c19988g = new C19988g(c20020m, abstractC32269c);
        }
        Object obj = c19988g.f75027z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c19988g.f75023F;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            if (i13 <= 0) {
                c20020m2 = c20020m;
                block = c3743h;
                throw new IllegalArgumentException("min should be positive");
            }
            if (i13 > 4088) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Min(", ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i17 = c19988g.f75026y;
            Function1 function1 = c19988g.f75025x;
            C20020m c20020m3 = c19988g.f75024w;
            AbstractC34132o.m107864I(obj);
            i13 = i17;
            c20020m2 = c20020m3;
            block = function1;
        }
        do {
            c20020m2.getClass();
            AbstractC22676k.m65750j(block, "block");
            if (i13 <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i13 > 4088) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Min(", ") shouldn't be greater than 4088").toString());
            }
            ByteBuffer byteBufferM55828F = c20020m2.m55828F();
            C20005o c20005o = ((AbstractC20003m) c20020m2._state).f75064b;
            try {
                C19993c c19993c = (C19993c) c20020m2._closed;
                if (c19993c != null) {
                    AbstractC32073e.m99753l(c19993c.m55792a());
                    throw null;
                }
                do {
                    i14 = c20005o._availableForWrite$internal;
                    iPosition = 0;
                    if (i14 < i13) {
                        i14 = 0;
                        break;
                    }
                } while (!C20005o.f75068c.compareAndSet(c20005o, i14, 0));
                if (i14 <= 0) {
                    z4 = false;
                } else {
                    c20020m2.m55851o(byteBufferM55828F, c20020m2.f75117f, i14);
                    int iPosition2 = byteBufferM55828F.position();
                    int iLimit = byteBufferM55828F.limit();
                    block.invoke(byteBufferM55828F);
                    if (iLimit != byteBufferM55828F.limit()) {
                        throw new IllegalStateException("Buffer limit modified");
                    }
                    iPosition = byteBufferM55828F.position() - iPosition2;
                    if (iPosition < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                    }
                    if (iPosition < 0) {
                        throw new IllegalStateException();
                    }
                    c20020m2.m55843g(byteBufferM55828F, c20005o, iPosition);
                    if (iPosition < i14) {
                        c20005o.m55805a(i14 - iPosition);
                    }
                    z4 = true;
                }
                if (c20005o.m55808d() || c20020m2.f75113b) {
                    c20020m2.m55847k(1);
                }
                c20020m2.m55824B();
                c20020m2.m55830H();
                if (!z4) {
                    iPosition = -1;
                }
                if (iPosition >= 0) {
                    return C23454a0.f92919a;
                }
                c19988g.f75024w = c20020m2;
                c19988g.f75025x = block;
                c19988g.f75026y = i13;
                c19988g.f75023F = 1;
            } catch (Throwable th3) {
                if (c20005o.m55808d() || c20020m2.f75113b) {
                    c20020m2.m55847k(1);
                }
                c20020m2.m55824B();
                c20020m2.m55830H();
                throw th3;
            }
        } while (c20020m2.m55841e(i13, block, c19988g) != enumC31071a);
        return enumC31071a;
    }

    /* JADX INFO: renamed from: a */
    public static final C19993c m55819a(C20020m c20020m) {
        return (C19993c) c20020m._closed;
    }

    /* JADX INFO: renamed from: q */
    public static int m55822q(C20020m c20020m, C36866a c36866a) throws Throwable {
        int iMin;
        boolean z4;
        int i13 = c36866a.f77289e - c36866a.f77287c;
        int i14 = 0;
        do {
            ByteBuffer byteBufferM55827E = c20020m.m55827E();
            if (byteBufferM55827E == null) {
                z4 = false;
                iMin = 0;
            } else {
                C20005o c20005o = ((AbstractC20003m) c20020m._state).f75064b;
                try {
                    if (c20005o._availableForRead$internal == 0) {
                        c20020m.m55823A();
                        c20020m.m55830H();
                        z4 = false;
                        iMin = 0;
                    } else {
                        int i15 = c36866a.f77289e - c36866a.f77287c;
                        int iMin2 = Math.min(byteBufferM55827E.remaining(), Math.min(i15, i13));
                        while (true) {
                            int i16 = c20005o._availableForRead$internal;
                            int iMin3 = Math.min(iMin2, i16);
                            if (iMin3 == 0) {
                                iMin = 0;
                                break;
                            }
                            if (C20005o.f75067b.compareAndSet(c20005o, i16, i16 - iMin3)) {
                                iMin = Math.min(iMin2, i16);
                                break;
                            }
                        }
                        if (iMin <= 0) {
                            z4 = false;
                        } else {
                            if (i15 < byteBufferM55827E.remaining()) {
                                byteBufferM55827E.limit(byteBufferM55827E.position() + i15);
                            }
                            AbstractC35744b.m113241n(c36866a, byteBufferM55827E);
                            c20020m.m55842f(byteBufferM55827E, c20005o, iMin);
                            z4 = true;
                        }
                        c20020m.m55823A();
                        c20020m.m55830H();
                    }
                } catch (Throwable th3) {
                    c20020m.m55823A();
                    c20020m.m55830H();
                    throw th3;
                }
            }
            i14 += iMin;
            i13 -= iMin;
            if (!z4 || c36866a.f77289e <= c36866a.f77287c) {
                break;
            }
        } while (((AbstractC20003m) c20020m._state).f75064b._availableForRead$internal > 0);
        return i14;
    }

    /* JADX INFO: renamed from: A */
    public final void m55823A() {
        AbstractC20003m abstractC20003mMo55803e;
        AbstractC20003m abstractC20003m = null;
        loop0: while (true) {
            Object obj = this._state;
            AbstractC20003m abstractC20003m2 = (AbstractC20003m) obj;
            C19999i c19999i = (C19999i) abstractC20003m;
            if (c19999i != null) {
                c19999i.f75064b.m55810f();
                m55826D();
                abstractC20003m = null;
            }
            abstractC20003mMo55803e = abstractC20003m2.mo55803e();
            if ((abstractC20003mMo55803e instanceof C19999i) && ((AbstractC20003m) this._state) == abstractC20003m2 && abstractC20003mMo55803e.f75064b.m55811g()) {
                abstractC20003mMo55803e = C19998h.f75052c;
                abstractC20003m = abstractC20003mMo55803e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75109j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC20003mMo55803e)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        C19998h c19998h = C19998h.f75052c;
        if (abstractC20003mMo55803e == c19998h) {
            C19999i c19999i2 = (C19999i) abstractC20003m;
            if (c19999i2 != null) {
                m55861z(c19999i2.f75053c);
            }
            m55826D();
            return;
        }
        if (abstractC20003mMo55803e instanceof C19999i) {
            C20005o c20005o = abstractC20003mMo55803e.f75064b;
            if (c20005o._availableForWrite$internal == c20005o.f75070a && abstractC20003mMo55803e.f75064b.m55811g()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f75109j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC20003mMo55803e, c19998h)) {
                    if (atomicReferenceFieldUpdater2.get(this) != abstractC20003mMo55803e) {
                        return;
                    }
                }
                abstractC20003mMo55803e.f75064b.m55810f();
                m55861z(((C19999i) abstractC20003mMo55803e).f75053c);
                m55826D();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m55824B() {
        AbstractC20003m abstractC20003mMo55804f;
        C19999i c19999i;
        AbstractC20003m abstractC20003m = null;
        loop0: while (true) {
            Object obj = this._state;
            abstractC20003mMo55804f = ((AbstractC20003m) obj).mo55804f();
            if (abstractC20003mMo55804f instanceof C19999i) {
                C20005o c20005o = abstractC20003mMo55804f.f75064b;
                if (c20005o._availableForWrite$internal == c20005o.f75070a) {
                    abstractC20003mMo55804f = C19998h.f75052c;
                    abstractC20003m = abstractC20003mMo55804f;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75109j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC20003mMo55804f)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        if (abstractC20003mMo55804f != C19998h.f75052c || (c19999i = (C19999i) abstractC20003m) == null) {
            return;
        }
        m55861z(c19999i.f75053c);
    }

    /* JADX INFO: renamed from: C */
    public final void m55825C() {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) f75111l.getAndSet(this, null);
        if (interfaceC30057d != null) {
            C19993c c19993c = (C19993c) this._closed;
            Throwable th3 = c19993c != null ? c19993c.f75046a : null;
            if (th3 != null) {
                interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
            } else {
                interfaceC30057d.resumeWith(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m55826D() {
        while (true) {
            InterfaceC30057d interfaceC30057d = (InterfaceC30057d) this._writeOp;
            if (interfaceC30057d == null) {
                return;
            }
            C19993c c19993c = (C19993c) this._closed;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75112m;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC30057d, null)) {
                    interfaceC30057d.resumeWith(c19993c == null ? C23454a0.f92919a : AbstractC34132o.m107888l(c19993c.m55792a()));
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: E */
    public final ByteBuffer m55827E() throws Throwable {
        boolean z4;
        Throwable th3;
        AbstractC20003m abstractC20003mMo55799c;
        Throwable th4;
        do {
            Object obj = this._state;
            AbstractC20003m abstractC20003m = (AbstractC20003m) obj;
            z4 = true;
            if (AbstractC22676k.m65745e(abstractC20003m, C20002l.f75062c) ? true : AbstractC22676k.m65745e(abstractC20003m, C19998h.f75052c)) {
                C19993c c19993c = (C19993c) this._closed;
                if (c19993c != null && (th3 = c19993c.f75046a) != null) {
                    AbstractC32073e.m99753l(th3);
                    throw null;
                }
            } else {
                C19993c c19993c2 = (C19993c) this._closed;
                if (c19993c2 != null && (th4 = c19993c2.f75046a) != null) {
                    AbstractC32073e.m99753l(th4);
                    throw null;
                }
                if (abstractC20003m.f75064b._availableForRead$internal != 0) {
                    abstractC20003mMo55799c = abstractC20003m.mo55799c();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75109j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC20003mMo55799c)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z4 = false;
                            break;
                        }
                    }
                }
            }
            return null;
        } while (!z4);
        ByteBuffer byteBufferMo55801a = abstractC20003mMo55799c.mo55801a();
        m55851o(byteBufferMo55801a, this.f75116e, abstractC20003mMo55799c.f75064b._availableForRead$internal);
        return byteBufferMo55801a;
    }

    /* JADX INFO: renamed from: F */
    public final ByteBuffer m55828F() throws Throwable {
        AbstractC20003m abstractC20003mMo55800d;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) this._writeOp;
        if (interfaceC30057d != null) {
            throw new IllegalStateException("Write operation is already in progress: " + interfaceC30057d);
        }
        C20000j c20000j = null;
        while (true) {
            Object obj = this._state;
            AbstractC20003m abstractC20003m = (AbstractC20003m) obj;
            if (((C19993c) this._closed) != null) {
                if (c20000j != null) {
                    m55861z(c20000j);
                }
                C19993c c19993c = (C19993c) this._closed;
                AbstractC22676k.m65747g(c19993c);
                AbstractC32073e.m99753l(c19993c.m55792a());
                throw null;
            }
            if (abstractC20003m == C19998h.f75052c) {
                if (c20000j == null) {
                    c20000j = (C20000j) this.f75114c.mo55796t0();
                    c20000j.f75064b.m55810f();
                }
                abstractC20003mMo55800d = c20000j.f75058g;
            } else {
                if (abstractC20003m == C20002l.f75062c) {
                    if (c20000j != null) {
                        m55861z(c20000j);
                    }
                    C19993c c19993c2 = (C19993c) this._closed;
                    AbstractC22676k.m65747g(c19993c2);
                    AbstractC32073e.m99753l(c19993c2.m55792a());
                    throw null;
                }
                abstractC20003mMo55800d = abstractC20003m.mo55800d();
            }
            AbstractC20003m abstractC20003m2 = abstractC20003mMo55800d;
            C20000j c20000j2 = c20000j;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75109j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC20003m2)) {
                    if (((C19993c) this._closed) != null) {
                        m55824B();
                        m55830H();
                        C19993c c19993c3 = (C19993c) this._closed;
                        AbstractC22676k.m65747g(c19993c3);
                        AbstractC32073e.m99753l(c19993c3.m55792a());
                        throw null;
                    }
                    ByteBuffer byteBufferMo55802b = abstractC20003m2.mo55802b();
                    if (c20000j2 != null) {
                        if (abstractC20003m == null) {
                            AbstractC22676k.m65757q("old");
                            throw null;
                        }
                        if (abstractC20003m != C19998h.f75052c) {
                            m55861z(c20000j2);
                        }
                    }
                    m55851o(byteBufferMo55802b, this.f75117f, abstractC20003m2.f75064b._availableForWrite$internal);
                    return byteBufferMo55802b;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            c20000j = c20000j2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m55829G(int i13, InterfaceC30057d interfaceC30057d) {
        while (((AbstractC20003m) this._state).f75064b._availableForRead$internal < i13) {
            C19993c c19993c = (C19993c) this._closed;
            if (c19993c != null) {
                Throwable th3 = c19993c.f75046a;
                if (th3 != null) {
                    interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    return;
                }
                boolean zM55807c = ((AbstractC20003m) this._state).f75064b.m55807c();
                boolean z4 = false;
                boolean z13 = ((AbstractC20003m) this._state).f75064b._availableForRead$internal >= i13;
                if (zM55807c && z13) {
                    z4 = true;
                }
                interfaceC30057d.resumeWith(Boolean.valueOf(z4));
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                return;
            }
            while (true) {
                if (((InterfaceC30057d) this._readOp) != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (((C19993c) this._closed) != null || ((AbstractC20003m) this._state).f75064b._availableForRead$internal >= i13) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75111l;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC30057d)) {
                        if (((C19993c) this._closed) != null || ((AbstractC20003m) this._state).f75064b._availableForRead$internal >= i13) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f75111l;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC30057d, null)) {
                                if (atomicReferenceFieldUpdater2.get(this) != interfaceC30057d) {
                                }
                            }
                            break;
                        }
                        EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            }
        }
        interfaceC30057d.resumeWith(Boolean.TRUE);
        EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
    }

    /* JADX INFO: renamed from: H */
    public final void m55830H() {
        if (((C19993c) this._closed) != null) {
            C20000j c20000j = null;
            loop0: while (true) {
                Object obj = this._state;
                AbstractC20003m abstractC20003m = (AbstractC20003m) obj;
                C19993c c19993c = (C19993c) this._closed;
                if (c20000j != null) {
                    if ((c19993c != null ? c19993c.f75046a : null) == null) {
                        c20000j.f75064b.m55810f();
                    }
                    m55826D();
                    c20000j = null;
                }
                C20002l c20002l = C20002l.f75062c;
                if (abstractC20003m == c20002l) {
                    break;
                }
                if (abstractC20003m != C19998h.f75052c) {
                    if (c19993c == null || !(abstractC20003m instanceof C19999i)) {
                        return;
                    }
                    if (!abstractC20003m.f75064b.m55811g() && c19993c.f75046a == null) {
                        return;
                    }
                    if (c19993c.f75046a != null) {
                        C20005o c20005o = abstractC20003m.f75064b;
                        c20005o.getClass();
                        C20005o.f75068c.getAndSet(c20005o, 0);
                    }
                    c20000j = ((C19999i) abstractC20003m).f75053c;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75109j;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c20002l)) {
                        if (c20000j == null || ((AbstractC20003m) this._state) != C20002l.f75062c) {
                            break loop0;
                            break loop0;
                        } else {
                            m55861z(c20000j);
                            break loop0;
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
            m55825C();
            m55826D();
        }
    }

    /* JADX INFO: renamed from: I */
    public final Object m55831I(AbstractC32269c abstractC32269c) throws Throwable {
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (m55839R(1)) {
            this.writeSuspensionSize = 1;
            if (this.attachedJob != null) {
                this.f75120i.invoke(abstractC32269c);
                return EnumC31071a.f128113w;
            }
            C19992b c19992b = this.f75119h;
            this.f75120i.invoke(c19992b);
            Object objM55791d = c19992b.m55791d(AbstractC15751g.m44424D(abstractC32269c));
            if (objM55791d == EnumC31071a.f128113w) {
                return objM55791d;
            }
        } else {
            C19993c c19993c = (C19993c) this._closed;
            if (c19993c != null) {
                AbstractC32073e.m99753l(c19993c.m55792a());
                throw null;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: K */
    public final int m55832K(byte[] bArr, int i13, int i14) throws Throwable {
        ByteBuffer byteBufferM55828F = m55828F();
        C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
        try {
            C19993c c19993c = (C19993c) this._closed;
            if (c19993c != null) {
                AbstractC32073e.m99753l(c19993c.m55792a());
                throw null;
            }
            int i15 = 0;
            while (true) {
                int iM55812h = c20005o.m55812h(Math.min(i14 - i15, byteBufferM55828F.remaining()));
                if (iM55812h == 0) {
                    m55843g(byteBufferM55828F, c20005o, i15);
                    if (c20005o.m55808d() || this.f75113b) {
                        m55847k(1);
                    }
                    m55824B();
                    m55830H();
                    return i15;
                }
                if (iM55812h <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferM55828F.put(bArr, i13 + i15, iM55812h);
                i15 += iM55812h;
                m55851o(byteBufferM55828F, m55844h(this.f75117f + i15, byteBufferM55828F), c20005o._availableForWrite$internal);
            }
        } catch (Throwable th3) {
            if (c20005o.m55808d() || this.f75113b) {
                m55847k(1);
            }
            m55824B();
            m55830H();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m55833L(AbstractC20660e1 abstractC20660e1) throws Throwable {
        ByteBuffer byteBufferM55828F = m55828F();
        C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
        try {
            C19993c c19993c = (C19993c) this._closed;
            if (c19993c != null) {
                AbstractC32073e.m99753l(c19993c.m55792a());
                throw null;
            }
            int i13 = 0;
            while (true) {
                int iM55812h = c20005o.m55812h(Math.min(abstractC20660e1.f77287c - abstractC20660e1.f77286b, byteBufferM55828F.remaining()));
                if (iM55812h == 0) {
                    break;
                }
                AbstractC32103e.m99892o(abstractC20660e1, byteBufferM55828F, iM55812h);
                i13 += iM55812h;
                m55851o(byteBufferM55828F, m55844h(this.f75117f + i13, byteBufferM55828F), c20005o._availableForWrite$internal);
            }
            m55843g(byteBufferM55828F, c20005o, i13);
            if (c20005o.m55808d() || this.f75113b) {
                m55847k(1);
            }
            m55824B();
            m55830H();
        } catch (Throwable th3) {
            if (c20005o.m55808d() || this.f75113b) {
                m55847k(1);
            }
            m55824B();
            m55830H();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: M */
    public final Object m55834M(byte[] bArr, int i13, AbstractC32275i abstractC32275i) throws Throwable {
        Object objM55836O;
        int i14 = 0;
        while (i13 > 0) {
            int iM55832K = m55832K(bArr, i14, i13);
            if (iM55832K == 0) {
                break;
            }
            i14 += iM55832K;
            i13 -= iM55832K;
        }
        return (i13 != 0 && (objM55836O = m55836O(bArr, i14, i13, abstractC32275i)) == EnumC31071a.f128113w) ? objM55836O : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:24:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: N */
    public final java.lang.Object m55835N(io.seon.androidsdk.service.AbstractC20660e1 r7, s83.AbstractC32269c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.p228io.C19989h
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.h r0 = (io.ktor.utils.p228io.C19989h) r0
            int r1 = r0.f75028E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75028E = r1
            goto L18
        L13:
            io.ktor.utils.io.h r0 = new io.ktor.utils.io.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f75031y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f75028E
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            r7 = 2
            if (r2 != r7) goto L2c
            p505ts.AbstractC34132o.m107864I(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            io.seon.androidsdk.service.e1 r7 = r0.f75030x
            io.ktor.utils.io.m r2 = r0.f75029w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L53
        L3c:
            p505ts.AbstractC34132o.m107864I(r8)
            r2 = r6
        L40:
            int r8 = r7.f77287c
            int r5 = r7.f77286b
            if (r8 <= r5) goto L5a
            r0.f75029w = r2
            r0.f75030x = r7
            r0.f75028E = r4
            java.lang.Object r8 = r2.m55831I(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r2.getClass()
            r2.m55833L(r7)
            goto L40
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p228io.C20020m.m55835N(io.seon.androidsdk.service.e1, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:23:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: O */
    public final java.lang.Object m55836O(byte[] r7, int r8, int r9, s83.AbstractC32269c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.p228io.C19990i
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.i r0 = (io.ktor.utils.p228io.C19990i) r0
            int r1 = r0.f75035G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75035G = r1
            goto L18
        L13:
            io.ktor.utils.io.i r0 = new io.ktor.utils.io.i
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f75033E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f75035G
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r7 = r0.f75039z
            int r8 = r0.f75038y
            byte[] r9 = r0.f75037x
            io.ktor.utils.io.m r2 = r0.f75036w
            p505ts.AbstractC34132o.m107864I(r10)
            goto L5e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            p505ts.AbstractC34132o.m107864I(r10)
            r2 = r6
        L3b:
            if (r9 <= 0) goto L6a
            r0.f75036w = r2
            r0.f75037x = r7
            r0.f75038y = r8
            r0.f75039z = r9
            r0.f75035G = r3
            int r10 = r2.m55832K(r7, r8, r9)
            if (r10 <= 0) goto L54
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = r4
            goto L58
        L54:
            java.lang.Object r10 = r2.m55838Q(r7, r8, r9, r0)
        L58:
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r5 = r9
            r9 = r7
            r7 = r5
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r8 = r8 + r10
            int r7 = r7 - r10
            r5 = r9
            r9 = r7
            r7 = r5
            goto L3b
        L6a:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p228io.C20020m.m55836O(byte[], int, int, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: P */
    public final Object m55837P(int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C20018k c20018k;
        C20020m c20020m;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (abstractC32269c instanceof C20018k) {
            c20018k = (C20018k) abstractC32269c;
            int i14 = c20018k.f75102E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c20018k.f75102E = i14 - Integer.MIN_VALUE;
            } else {
                c20018k = new C20018k(this, abstractC32269c);
            }
        } else {
            c20018k = new C20018k(this, abstractC32269c);
        }
        Object obj = c20018k.f75105y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c20018k.f75102E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            c20020m = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c20018k.f75104x;
            c20020m = c20018k.f75103w;
            AbstractC34132o.m107864I(obj);
        }
        while (c20020m.m55839R(i13)) {
            c20018k.f75103w = c20020m;
            c20018k.f75104x = i13;
            c20018k.f75102E = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c20018k));
            c3033m.m8774s();
            while (true) {
                C19993c c19993c = (C19993c) c20020m._closed;
                if (c19993c != null) {
                    AbstractC32073e.m99753l(c19993c.m55792a());
                    throw null;
                }
                if (!c20020m.m55839R(i13)) {
                    c3033m.resumeWith(c23454a0);
                    break;
                }
                while (true) {
                    if (((InterfaceC30057d) c20020m._writeOp) != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!c20020m.m55839R(i13)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75112m;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c20020m, null, c3033m)) {
                            if (!c20020m.m55839R(i13)) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f75112m;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(c20020m, c3033m, null)) {
                                    if (atomicReferenceFieldUpdater2.get(c20020m) != c3033m) {
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(c20020m) == null);
                }
            }
            c20020m.m55847k(i13);
            Object objM8773r = c3033m.m8773r();
            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
            if (objM8773r == enumC31071a) {
                return enumC31071a;
            }
        }
        C19993c c19993c2 = (C19993c) c20020m._closed;
        if (c19993c2 == null) {
            return c23454a0;
        }
        AbstractC32073e.m99753l(c19993c2.m55792a());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: Q */
    public final java.lang.Object m55838Q(byte[] r6, int r7, int r8, s83.AbstractC32269c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.p228io.C20006j
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.j r0 = (io.ktor.utils.p228io.C20006j) r0
            int r1 = r0.f75073G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75073G = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f75071E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f75073G
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            p505ts.AbstractC34132o.m107864I(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f75077z
            int r7 = r0.f75076y
            byte[] r8 = r0.f75075x
            io.ktor.utils.io.m r2 = r0.f75074w
            p505ts.AbstractC34132o.m107864I(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L41:
            p505ts.AbstractC34132o.m107864I(r9)
            r2 = r5
        L45:
            r0.f75074w = r2
            r0.f75075x = r6
            r0.f75076y = r7
            r0.f75077z = r8
            r0.f75073G = r3
            java.lang.Object r9 = r2.m55831I(r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r2.getClass()
            int r9 = r2.m55832K(r6, r7, r8)
            if (r9 <= 0) goto L45
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p228io.C20020m.m55838Q(byte[], int, int, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: R */
    public final boolean m55839R(int i13) {
        AbstractC20003m abstractC20003m = (AbstractC20003m) this._state;
        return ((C19993c) this._closed) == null && abstractC20003m.f75064b._availableForWrite$internal < i13 && abstractC20003m != C19998h.f75052c;
    }

    /* JADX INFO: renamed from: d */
    public final void m55840d(InterfaceC3027k1 interfaceC3027k1) {
        InterfaceC3027k1 interfaceC3027k2 = this.attachedJob;
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        this.attachedJob = interfaceC3027k1;
        interfaceC3027k1.invokeOnCompletion(true, true, new C20019l(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m55841e(int i13, Function1 function1, AbstractC32269c abstractC32269c) {
        C19982a c19982a;
        C20020m c20020m;
        if (abstractC32269c instanceof C19982a) {
            c19982a = (C19982a) abstractC32269c;
            int i14 = c19982a.f74977E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c19982a.f74977E = i14 - Integer.MIN_VALUE;
            } else {
                c19982a = new C19982a(this, abstractC32269c);
            }
        } else {
            c19982a = new C19982a(this, abstractC32269c);
        }
        Object obj = c19982a.f74980y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c19982a.f74977E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            c19982a.f74978w = this;
            c19982a.f74979x = function1;
            c19982a.f74977E = 1;
            if (m55837P(i13, c19982a) == enumC31071a) {
                return enumC31071a;
            }
            c20020m = this;
        } else {
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            c20020m = c19982a.f74978w;
            AbstractC34132o.m107864I(obj);
        }
        c20020m.getClass();
        return c23454a0;
    }

    /* JADX INFO: renamed from: f */
    public final void m55842f(ByteBuffer byteBuffer, C20005o c20005o, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f75116e = m55844h(this.f75116e + i13, byteBuffer);
        c20005o.m55805a(i13);
        this.totalBytesRead += (long) i13;
        m55826D();
    }

    /* JADX INFO: renamed from: g */
    public final void m55843g(ByteBuffer byteBuffer, C20005o c20005o, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f75117f = m55844h(this.f75117f + i13, byteBuffer);
        c20005o.m55806b(i13);
        this.totalBytesWritten += (long) i13;
    }

    /* JADX INFO: renamed from: h */
    public final int m55844h(int i13, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        int i14 = this.f75115d;
        return i13 >= iCapacity - i14 ? i13 - (byteBuffer.capacity() - i14) : i13;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m55845i(Throwable th3) {
        if (((C19993c) this._closed) == null) {
            C19993c c19993c = th3 == null ? C19993c.f75045b : new C19993c(th3);
            ((AbstractC20003m) this._state).f75064b.m55807c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75110k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c19993c)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            ((AbstractC20003m) this._state).f75064b.m55807c();
            C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
            if (c20005o._availableForWrite$internal == c20005o.f75070a || th3 != null) {
                m55830H();
            }
            InterfaceC30057d interfaceC30057d = (InterfaceC30057d) f75111l.getAndSet(this, null);
            if (interfaceC30057d != null) {
                if (th3 != null) {
                    interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
                } else {
                    interfaceC30057d.resumeWith(Boolean.valueOf(((AbstractC20003m) this._state).f75064b._availableForRead$internal > 0));
                }
            }
            InterfaceC30057d interfaceC30057d2 = (InterfaceC30057d) f75112m.getAndSet(this, null);
            if (interfaceC30057d2 != null) {
                interfaceC30057d2.resumeWith(AbstractC34132o.m107888l(th3 == null ? new ClosedWriteChannelException("Byte channel was closed") : th3));
            }
            C20002l c20002l = C20002l.f75062c;
            if (th3 != null) {
                InterfaceC3027k1 interfaceC3027k1 = this.attachedJob;
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                }
                this.f75118g.m55790b(th3);
                this.f75119h.m55790b(th3);
                return true;
            }
            this.f75119h.m55790b(new ClosedWriteChannelException("Byte channel was closed"));
            C19992b c19992b = this.f75118g;
            Boolean boolValueOf = Boolean.valueOf(((AbstractC20003m) this._state).f75064b.m55807c());
            c19992b.getClass();
            c19992b.resumeWith(boolValueOf);
            C19991a c19991a = (C19991a) C19992b.f75044x.getAndSet(c19992b, null);
            if (c19991a != null) {
                c19991a.m55788a();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x0212 A[Catch: all -> 0x0218, TryCatch #7 {all -> 0x0218, blocks: (B:115:0x020c, B:117:0x0212, B:124:0x0221, B:125:0x022c, B:127:0x0238, B:129:0x0242, B:122:0x021c), top: B:177:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0216  */
    /* JADX WARN: Code duplicated, block: B:124:0x0221 A[Catch: all -> 0x0218, TryCatch #7 {all -> 0x0218, blocks: (B:115:0x020c, B:117:0x0212, B:124:0x0221, B:125:0x022c, B:127:0x0238, B:129:0x0242, B:122:0x021c), top: B:177:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0238 A[Catch: all -> 0x0218, TryCatch #7 {all -> 0x0218, blocks: (B:115:0x020c, B:117:0x0212, B:124:0x0221, B:125:0x022c, B:127:0x0238, B:129:0x0242, B:122:0x021c), top: B:177:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0242 A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #7 {all -> 0x0218, blocks: (B:115:0x020c, B:117:0x0212, B:124:0x0221, B:125:0x022c, B:127:0x0238, B:129:0x0242, B:122:0x021c), top: B:177:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0266  */
    /* JADX WARN: Code duplicated, block: B:136:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x0274  */
    /* JADX WARN: Code duplicated, block: B:140:0x0283  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b7 A[Catch: all -> 0x003c, TryCatch #12 {all -> 0x003c, blocks: (B:15:0x0037, B:40:0x00b7, B:42:0x00bd, B:134:0x026b, B:138:0x027b, B:146:0x0296, B:148:0x029c, B:152:0x02a6, B:153:0x02ae, B:154:0x02b4, B:150:0x02a0, B:156:0x02b7, B:157:0x02bb, B:22:0x0051), top: B:187:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: all -> 0x01fc, TRY_LEAVE, TryCatch #11 {all -> 0x01fc, blocks: (B:46:0x00dd, B:48:0x00e3), top: B:185:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[Catch: all -> 0x01f8, TRY_LEAVE, TryCatch #8 {all -> 0x01f8, blocks: (B:67:0x012c, B:71:0x0143), top: B:179:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x015e A[Catch: all -> 0x01ee, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01ee, blocks: (B:73:0x014b, B:79:0x015e), top: B:171:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185 A[Catch: all -> 0x01e6, LOOP:0: B:84:0x0185->B:88:0x0193, LOOP_START, TryCatch #3 {all -> 0x01e6, blocks: (B:81:0x0167, B:84:0x0185, B:86:0x0189, B:89:0x0194, B:104:0x01e8, B:105:0x01ed), top: B:169:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0189 A[Catch: all -> 0x01e6, TryCatch #3 {all -> 0x01e6, blocks: (B:81:0x0167, B:84:0x0185, B:86:0x0189, B:89:0x0194, B:104:0x01e8, B:105:0x01ed), top: B:169:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #10 {all -> 0x01dc, blocks: (B:95:0x01b9, B:98:0x01c7, B:91:0x01a3, B:108:0x01f1, B:109:0x01f7), top: B:183:0x01b9 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x027e -> B:40:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final java.lang.Object m55846j(io.ktor.utils.p228io.C20020m r25, long r26, s83.AbstractC32269c r28) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p228io.C20020m.m55846j(io.ktor.utils.io.m, long, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: k */
    public final void m55847k(int i13) {
        AbstractC20003m abstractC20003m;
        do {
            abstractC20003m = (AbstractC20003m) this._state;
            if (abstractC20003m == C20002l.f75062c) {
                return;
            } else {
                abstractC20003m.f75064b.m55807c();
            }
        } while (abstractC20003m != ((AbstractC20003m) this._state));
        int i14 = abstractC20003m.f75064b._availableForWrite$internal;
        if (abstractC20003m.f75064b._availableForRead$internal >= 1) {
            m55825C();
        }
        if (i14 >= i13) {
            m55826D();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m55848l() {
        return ((AbstractC20003m) this._state).f75064b._availableForRead$internal;
    }

    /* JADX INFO: renamed from: m */
    public final Throwable m55849m() {
        C19993c c19993c = (C19993c) this._closed;
        if (c19993c != null) {
            return c19993c.f75046a;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m55850n() {
        return ((AbstractC20003m) this._state) == C20002l.f75062c && ((C19993c) this._closed) != null;
    }

    /* JADX INFO: renamed from: o */
    public final void m55851o(ByteBuffer byteBuffer, int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCapacity = byteBuffer.capacity() - this.f75115d;
        int i15 = i14 + i13;
        if (i15 <= iCapacity) {
            iCapacity = i15;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i13);
    }

    /* JADX INFO: renamed from: p */
    public final int m55852p(byte[] bArr, int i13, int i14) throws Throwable {
        int iMin;
        ByteBuffer byteBufferM55827E = m55827E();
        if (byteBufferM55827E == null) {
            return 0;
        }
        C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
        try {
            if (c20005o._availableForRead$internal == 0) {
                return 0;
            }
            int iCapacity = byteBufferM55827E.capacity() - this.f75115d;
            int i15 = 0;
            while (true) {
                int i16 = i14 - i15;
                if (i16 == 0) {
                    break;
                }
                int i17 = this.f75116e;
                int iMin2 = Math.min(iCapacity - i17, i16);
                while (true) {
                    int i18 = c20005o._availableForRead$internal;
                    int iMin3 = Math.min(iMin2, i18);
                    if (iMin3 == 0) {
                        iMin = 0;
                        break;
                    }
                    if (C20005o.f75067b.compareAndSet(c20005o, i18, i18 - iMin3)) {
                        iMin = Math.min(iMin2, i18);
                        break;
                    }
                }
                if (iMin == 0) {
                    break;
                }
                byteBufferM55827E.limit(i17 + iMin);
                byteBufferM55827E.position(i17);
                byteBufferM55827E.get(bArr, i13 + i15, iMin);
                m55842f(byteBufferM55827E, c20005o, iMin);
                i15 += iMin;
            }
            return i15;
        } finally {
            m55823A();
            m55830H();
        }
    }

    /* JADX INFO: renamed from: r */
    public final Object m55853r(C36866a c36866a, AbstractC32269c abstractC32269c) throws Throwable {
        int iM55822q = m55822q(this, c36866a);
        if (iM55822q == 0 && ((C19993c) this._closed) != null) {
            iM55822q = ((AbstractC20003m) this._state).f75064b.m55807c() ? m55822q(this, c36866a) : -1;
        } else if (iM55822q <= 0 && c36866a.f77289e > c36866a.f77287c) {
            return m55855t(c36866a, abstractC32269c);
        }
        return new Integer(iM55822q);
    }

    /* JADX INFO: renamed from: s */
    public final Object m55854s(byte[] bArr, int i13, int i14, AbstractC32269c abstractC32269c) throws Throwable {
        int iM55852p = m55852p(bArr, i13, i14);
        if (iM55852p == 0 && ((C19993c) this._closed) != null) {
            iM55852p = ((AbstractC20003m) this._state).f75064b.m55807c() ? m55852p(bArr, i13, i14) : -1;
        } else if (iM55852p <= 0 && i14 != 0) {
            return m55856u(bArr, i13, i14, abstractC32269c);
        }
        return new Integer(iM55852p);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m55855t(C36866a c36866a, AbstractC32269c abstractC32269c) throws Throwable {
        C19985d c19985d;
        C20020m c20020m;
        if (abstractC32269c instanceof C19985d) {
            c19985d = (C19985d) abstractC32269c;
            int i13 = c19985d.f75005E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c19985d.f75005E = i13 - Integer.MIN_VALUE;
            } else {
                c19985d = new C19985d(this, abstractC32269c);
            }
        } else {
            c19985d = new C19985d(this, abstractC32269c);
        }
        Object objM55859x = c19985d.f75008y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c19985d.f75005E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM55859x);
            c19985d.f75006w = this;
            c19985d.f75007x = c36866a;
            c19985d.f75005E = 1;
            objM55859x = m55859x(c19985d);
            if (objM55859x != enumC31071a) {
                c20020m = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM55859x);
            return objM55859x;
        }
        c36866a = c19985d.f75007x;
        c20020m = c19985d.f75006w;
        AbstractC34132o.m107864I(objM55859x);
        if (!((Boolean) objM55859x).booleanValue()) {
            return new Integer(-1);
        }
        c19985d.f75006w = null;
        c19985d.f75007x = null;
        c19985d.f75005E = 2;
        Object objM55853r = c20020m.m55853r(c36866a, c19985d);
        return objM55853r == enumC31071a ? enumC31071a : objM55853r;
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((AbstractC20003m) this._state) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m55856u(byte[] bArr, int i13, int i14, AbstractC32269c abstractC32269c) throws Throwable {
        C19984c c19984c;
        C20020m c20020m;
        if (abstractC32269c instanceof C19984c) {
            c19984c = (C19984c) abstractC32269c;
            int i15 = c19984c.f74999G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c19984c.f74999G = i15 - Integer.MIN_VALUE;
            } else {
                c19984c = new C19984c(this, abstractC32269c);
            }
        } else {
            c19984c = new C19984c(this, abstractC32269c);
        }
        Object objM55859x = c19984c.f74997E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c19984c.f74999G;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM55859x);
            c19984c.f75000w = this;
            c19984c.f75001x = bArr;
            c19984c.f75002y = i13;
            c19984c.f75003z = i14;
            c19984c.f74999G = 1;
            objM55859x = m55859x(c19984c);
            if (objM55859x != enumC31071a) {
                c20020m = this;
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM55859x);
            return objM55859x;
        }
        i14 = c19984c.f75003z;
        i13 = c19984c.f75002y;
        bArr = c19984c.f75001x;
        c20020m = c19984c.f75000w;
        AbstractC34132o.m107864I(objM55859x);
        if (!((Boolean) objM55859x).booleanValue()) {
            return new Integer(-1);
        }
        c19984c.f75000w = null;
        c19984c.f75001x = null;
        c19984c.f74999G = 2;
        Object objM55854s = c20020m.m55854s(bArr, i13, i14, c19984c);
        return objM55854s == enumC31071a ? enumC31071a : objM55854s;
    }

    /* JADX INFO: renamed from: v */
    public final Object m55857v(AbstractC32269c abstractC32269c) {
        long jM55822q = Long.MAX_VALUE;
        if (((C19993c) this._closed) == null) {
            return m55858w(Long.MAX_VALUE, abstractC32269c);
        }
        Throwable thM55849m = m55849m();
        if (thM55849m != null) {
            AbstractC32073e.m99753l(thM55849m);
            throw null;
        }
        C35746d c35746d = new C35746d();
        try {
            C36866a c36866aM118254d = AbstractC36867b.m118254d(c35746d, 1, null);
            while (true) {
                try {
                    if (c36866aM118254d.f77289e - c36866aM118254d.f77287c > jM55822q) {
                        int i13 = c36866aM118254d.f77288d;
                        c36866aM118254d.f77286b = i13;
                        c36866aM118254d.f77287c = i13;
                        c36866aM118254d.f77289e = (int) jM55822q;
                    }
                    jM55822q -= (long) m55822q(this, c36866aM118254d);
                    if (jM55822q <= 0 || m55850n()) {
                        break;
                    }
                    c36866aM118254d = AbstractC36867b.m118254d(c35746d, 1, c36866aM118254d);
                } catch (Throwable th3) {
                    c35746d.m113255b();
                    throw th3;
                }
            }
            c35746d.m113255b();
            return c35746d.m113257i();
        } catch (Throwable th4) {
            c35746d.close();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0091, B:36:0x009e, B:21:0x0053, B:23:0x005f, B:24:0x0068, B:26:0x0078, B:28:0x007e), top: B:51:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0091, B:36:0x009e, B:21:0x0053, B:23:0x005f, B:24:0x0068, B:26:0x0078, B:28:0x007e), top: B:51:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[PHI: r2 r4 r5 r11 r12
      0x009b: PHI (r2v2 kotlin.jvm.internal.f0) = (r2v3 kotlin.jvm.internal.f0), (r2v3 kotlin.jvm.internal.f0), (r2v5 kotlin.jvm.internal.f0) binds: [B:25:0x0076, B:27:0x007c, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r4v2 v63.d) = (r4v3 v63.d), (r4v3 v63.d), (r4v5 v63.d) binds: [B:25:0x0076, B:27:0x007c, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r5v1 io.ktor.utils.io.m) = (r5v2 io.ktor.utils.io.m), (r5v2 io.ktor.utils.io.m), (r5v4 io.ktor.utils.io.m) binds: [B:25:0x0076, B:27:0x007c, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v7 w63.a) = (r11v8 w63.a), (r11v8 w63.a), (r11v13 w63.a) binds: [B:25:0x0076, B:27:0x007c, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r12v2 v63.d) = (r12v3 v63.d), (r12v3 v63.d), (r12v5 v63.d) binds: [B:25:0x0076, B:27:0x007c, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0091, B:36:0x009e, B:21:0x0053, B:23:0x005f, B:24:0x0068, B:26:0x0078, B:28:0x007e), top: B:51:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:31:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009b -> B:35:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: w */
    public final java.lang.Object m55858w(long r11, s83.AbstractC32269c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof io.ktor.utils.p228io.C19986e
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.e r0 = (io.ktor.utils.p228io.C19986e) r0
            int r1 = r0.f75013H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75013H = r1
            goto L18
        L13:
            io.ktor.utils.io.e r0 = new io.ktor.utils.io.e
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f75011F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f75013H
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            w63.a r11 = r0.f75010E
            v63.d r12 = r0.f75017z
            kotlin.jvm.internal.f0 r2 = r0.f75016y
            v63.d r4 = r0.f75015x
            io.ktor.utils.io.m r5 = r0.f75014w
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Throwable -> L31
            goto L91
        L31:
            r11 = move-exception
            goto Lb5
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            p505ts.AbstractC34132o.m107864I(r13)
            v63.d r13 = new v63.d
            r13.<init>()
            kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0     // Catch: java.lang.Throwable -> Lb9
            r2.<init>()     // Catch: java.lang.Throwable -> Lb9
            r2.f89335w = r11     // Catch: java.lang.Throwable -> Lb9
            r11 = 0
            w63.a r11 = w63.AbstractC36867b.m118254d(r13, r3, r11)     // Catch: java.lang.Throwable -> Lb9
            r5 = r10
            r12 = r13
            r4 = r12
        L53:
            int r13 = r11.f77289e     // Catch: java.lang.Throwable -> L31
            int r6 = r11.f77287c     // Catch: java.lang.Throwable -> L31
            int r13 = r13 - r6
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r8 = r2.f89335w     // Catch: java.lang.Throwable -> L31
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L68
            int r13 = (int) r8     // Catch: java.lang.Throwable -> L31
            int r6 = r11.f77288d     // Catch: java.lang.Throwable -> L31
            r11.f77286b = r6     // Catch: java.lang.Throwable -> L31
            r11.f77287c = r6     // Catch: java.lang.Throwable -> L31
            r11.f77289e = r13     // Catch: java.lang.Throwable -> L31
        L68:
            int r13 = m55822q(r5, r11)     // Catch: java.lang.Throwable -> L31
            long r6 = r2.f89335w     // Catch: java.lang.Throwable -> L31
            long r8 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r6 = r6 - r8
            r2.f89335w = r6     // Catch: java.lang.Throwable -> L31
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L9b
            boolean r13 = r5.m55850n()     // Catch: java.lang.Throwable -> L31
            if (r13 != 0) goto L9b
            r0.f75014w = r5     // Catch: java.lang.Throwable -> L31
            r0.f75015x = r4     // Catch: java.lang.Throwable -> L31
            r0.f75016y = r2     // Catch: java.lang.Throwable -> L31
            r0.f75017z = r12     // Catch: java.lang.Throwable -> L31
            r0.f75010E = r11     // Catch: java.lang.Throwable -> L31
            r0.f75013H = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r5.m55859x(r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L91
            return r1
        L91:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L31
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r13 == 0) goto L9b
            r13 = r3
            goto L9c
        L9b:
            r13 = 0
        L9c:
            if (r13 == 0) goto La3
            w63.a r11 = w63.AbstractC36867b.m118254d(r12, r3, r11)     // Catch: java.lang.Throwable -> L31
            goto L53
        La3:
            r12.m113255b()     // Catch: java.lang.Throwable -> Lb1
            java.lang.Throwable r11 = r5.m55849m()     // Catch: java.lang.Throwable -> Lb1
            if (r11 != 0) goto Lb4
            v63.e r11 = r4.m113257i()     // Catch: java.lang.Throwable -> Lb1
            return r11
        Lb1:
            r11 = move-exception
            r13 = r4
            goto Lba
        Lb4:
            throw r11     // Catch: java.lang.Throwable -> Lb1
        Lb5:
            r12.m113255b()     // Catch: java.lang.Throwable -> Lb1
            throw r11     // Catch: java.lang.Throwable -> Lb1
        Lb9:
            r11 = move-exception
        Lba:
            r13.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p228io.C20020m.m55858w(long, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: x */
    public final Object m55859x(AbstractC32269c abstractC32269c) throws Throwable {
        if (((AbstractC20003m) this._state).f75064b._availableForRead$internal >= 1) {
            return Boolean.TRUE;
        }
        C19993c c19993c = (C19993c) this._closed;
        if (c19993c == null) {
            return m55860y(1, abstractC32269c);
        }
        Throwable th3 = c19993c.f75046a;
        if (th3 != null) {
            AbstractC32073e.m99753l(th3);
            throw null;
        }
        C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
        boolean z4 = c20005o.m55807c() && c20005o._availableForRead$internal >= 1;
        if (((InterfaceC30057d) this._readOp) == null) {
            return Boolean.valueOf(z4);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m55860y(int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C19987f c19987f;
        C20020m c20020m;
        if (abstractC32269c instanceof C19987f) {
            c19987f = (C19987f) abstractC32269c;
            int i14 = c19987f.f75021z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c19987f.f75021z = i14 - Integer.MIN_VALUE;
            } else {
                c19987f = new C19987f(this, abstractC32269c);
            }
        } else {
            c19987f = new C19987f(this, abstractC32269c);
        }
        Object obj = c19987f.f75019x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c19987f.f75021z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            if (((AbstractC20003m) this._state).f75064b._availableForRead$internal >= i13) {
                return Boolean.TRUE;
            }
            try {
                c19987f.f75018w = this;
                c19987f.f75021z = 1;
                C19992b c19992b = this.f75118g;
                m55829G(i13, c19992b);
                Object objM55791d = c19992b.m55791d(AbstractC15751g.m44424D(c19987f));
                return objM55791d == enumC31071a ? enumC31071a : objM55791d;
            } catch (Throwable th3) {
                th = th3;
                c20020m = this;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20020m = c19987f.f75018w;
            try {
                AbstractC34132o.m107864I(obj);
                return obj;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        c20020m._readOp = null;
        throw th;
    }

    /* JADX INFO: renamed from: z */
    public final void m55861z(C20000j c20000j) {
        this.f75114c.mo55795a1(c20000j);
    }

    public C20020m(boolean z4, InterfaceC38034f pool, int i13) {
        AbstractC22676k.m65750j(pool, "pool");
        this.f75113b = z4;
        this.f75114c = pool;
        this.f75115d = i13;
        this._state = C19998h.f75052c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        C36866a.f157703m.getClass();
        C20005o c20005o = ((AbstractC20003m) this._state).f75064b;
        this.f75118g = new C19992b();
        this.f75119h = new C19992b();
        this.f75120i = new C20019l(this, 0);
    }
}
