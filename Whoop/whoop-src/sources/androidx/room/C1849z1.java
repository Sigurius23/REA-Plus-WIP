package androidx.room;

import androidx.work.CoroutineWorker;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3076z;
import bc3.C3022j0;
import bc3.C3023j1;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ch.C4586g;
import coil.compose.AsyncImagePainter;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import f63.AbstractC14155c;
import fc3.C14380k;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.C23470p;
import lk.C24488g;
import mk.C25626a;
import p007a6.C0410c;
import p007a6.C0438l0;
import p132f0.C13778d0;
import p173gj.C15903d;
import p173gj.C15912m;
import p223ik.InterfaceC18598b;
import p238j0.C21084j;
import p282kk.C22533b;
import p282kk.C22534c;
import p282kk.C22537f;
import p282kk.InterfaceC22536e;
import p343nk.C26788i;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import ud3.C34826l0;
import v63.AbstractC35750h;
import w53.C36845b;
import z53.C40115g;

/* JADX INFO: renamed from: androidx.room.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1849z1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7229w;

    /* JADX INFO: renamed from: x */
    public int f7230x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f7231y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1849z1(int i13, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f7229w = 4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f7229w) {
            case 0:
                return new C1849z1((C1797i2) this.f7231y, interfaceC30057d, 0);
            case 1:
                return new C1849z1((AsyncImagePainter) this.f7231y, interfaceC30057d, 1);
            case 2:
                return new C1849z1((InterfaceC13058l) this.f7231y, interfaceC30057d, 2);
            case 3:
                return new C1849z1((C13778d0) this.f7231y, interfaceC30057d, 3);
            case 4:
                C1849z1 c1849z1 = new C1849z1(2, interfaceC30057d);
                c1849z1.f7231y = obj;
                return c1849z1;
            case 5:
                return new C1849z1((CoroutineWorker) this.f7231y, interfaceC30057d, 5);
            case 6:
                return new C1849z1((C15903d) this.f7231y, interfaceC30057d, 6);
            case 7:
                return new C1849z1((C22533b) this.f7231y, interfaceC30057d, 7);
            case 8:
                return new C1849z1((C3058t) this.f7231y, interfaceC30057d, 8);
            case 9:
                return new C1849z1((C24488g) this.f7231y, interfaceC30057d, 9);
            case 10:
                return new C1849z1((C25626a) this.f7231y, interfaceC30057d, 10);
            case 11:
                return new C1849z1((C26788i) this.f7231y, interfaceC30057d, 11);
            default:
                return new C1849z1((C40115g) this.f7231y, interfaceC30057d, 12);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7229w) {
            case 0:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C1849z1) create((AbstractC14155c) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C1849z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object, java.util.Map] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7229w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7230x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C1797i2 c1797i2 = (C1797i2) this.f7231y;
                    this.f7230x = 1;
                    if (c1797i2.m5424f(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f7231y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f7230x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C14380k c14380kM36583I = AbstractC13091v.m36583I(new C0410c(asyncImagePainter, null, 10), AbstractC28683x.m87240H(new C0438l0(asyncImagePainter, 4)));
                    C4586g c4586g = new C4586g(asyncImagePainter);
                    this.f7230x = 1;
                    if (c14380kM36583I.collect(c4586g, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f7230x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058l = (InterfaceC13058l) this.f7231y;
                    this.f7230x = 1;
                    if (AbstractC13091v.m36603m(interfaceC13058l, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f7230x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C22665e0 c22665e0 = new C22665e0();
                C22665e0 c22665e1 = new C22665e0();
                C22665e0 c22665e2 = new C22665e0();
                C13778d0 c13778d0 = (C13778d0) this.f7231y;
                C13096w1 c13096w1 = ((C21084j) c13778d0.f49158O).f79947a;
                C1769b2 c1769b2 = new C1769b2(c22665e0, c22665e1, c22665e2, c13778d0, 1);
                this.f7230x = 1;
                c13096w1.collect(c1769b2, this);
                return enumC31071a4;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f7230x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C36845b c36845bMo13321a = ((AbstractC14155c) this.f7231y).mo13321a();
                    this.f7230x = 1;
                    obj = AbstractC35750h.m113277f(c36845bMo13321a, this);
                    if (obj == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return ((C36845b) obj).m118140d();
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f7230x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f7231y;
                this.f7230x = 1;
                Object objDoWork = coroutineWorker.doWork(this);
                return objDoWork == enumC31071a6 ? enumC31071a6 : objDoWork;
            case 6:
                C15903d c15903d = (C15903d) this.f7231y;
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f7230x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C3022j0 c3022j0 = c15903d.f60140m;
                    this.f7230x = 1;
                    if (c3022j0.m8817m(this) == enumC31071a7) {
                        return enumC31071a7;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C15912m c15912m = c15903d.f60134g;
                c15912m.getClass();
                Iterator it = c15912m.f159040w.entrySet().iterator();
                while (it.hasNext()) {
                    C22534c c22534c = (C22534c) ((Map.Entry) it.next()).getValue();
                    c22534c.getClass();
                    for (InterfaceC22536e it3 : c22534c.f88570a) {
                        AbstractC22676k.m65749i(it3, "it");
                        InterfaceC30057d interfaceC30057d = null;
                        C25626a c25626a = it3 instanceof C25626a ? (C25626a) it3 : null;
                        if (c25626a != null) {
                            AbstractC3006f0.m8732z(c25626a.m75401d().f60130c, c25626a.m75401d().f60133f, null, new C1849z1(c25626a, interfaceC30057d, 10), 2);
                        }
                    }
                }
                return C23454a0.f92919a;
            case 7:
                C22533b c22533b = (C22533b) this.f7231y;
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i24 = this.f7230x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                try {
                    if (i24 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC18598b interfaceC18598b = c22533b.f88562e;
                        this.f7230x = 1;
                        if (interfaceC18598b.mo33429f(this) == enumC31071a8) {
                            return enumC31071a8;
                        }
                    } else {
                        if (i24 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    break;
                } catch (FileNotFoundException e5) {
                    String message = e5.getMessage();
                    if (message == null) {
                        return null;
                    }
                    c22533b.f88558a.f60138k.warn("Event storage file not found: ".concat(message));
                }
                return c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i25 = this.f7230x;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C3058t c3058t = (C3058t) this.f7231y;
                this.f7230x = 1;
                Object objM8817m = c3058t.m8817m(this);
                return objM8817m == enumC31071a9 ? enumC31071a9 : objM8817m;
            case 9:
                C24488g c24488g = (C24488g) this.f7231y;
                AtomicBoolean atomicBoolean = c24488g.f95540f;
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i26 = this.f7230x;
                if (i26 != 0) {
                    if (i26 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    atomicBoolean.getAndSet(false);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                if (!atomicBoolean.get()) {
                    atomicBoolean.getAndSet(true);
                    long j7 = c24488g.f95538d.f60163l;
                    this.f7230x = 1;
                    if (AbstractC3034m0.m8782b(j7, this) == enumC31071a10) {
                        return enumC31071a10;
                    }
                }
                return C23454a0.f92919a;
                this.f7230x = 2;
                if (c24488g.m71260c(this) == enumC31071a10) {
                    return enumC31071a10;
                }
                atomicBoolean.getAndSet(false);
                return C23454a0.f92919a;
            case 10:
                C25626a c25626a2 = (C25626a) this.f7231y;
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i27 = this.f7230x;
                if (i27 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C24488g c24488g2 = c25626a2.f100567E;
                    if (c24488g2 == null) {
                        AbstractC22676k.m65757q("identifyInterceptor");
                        throw null;
                    }
                    this.f7230x = 1;
                    if (c24488g2.m71260c(this) == enumC31071a11) {
                        return enumC31071a11;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C22533b c22533b2 = c25626a2.f100571z;
                if (c22533b2 != null) {
                    c22533b2.f88564g.mo32218s(new C22537f(2, null));
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("pipeline");
                throw null;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i28 = this.f7230x;
                if (i28 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26788i c26788i = (C26788i) this.f7231y;
                    this.f7230x = 1;
                    if (C26788i.m79812a(c26788i, this) == enumC31071a12) {
                        return enumC31071a12;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C40115g c40115g = (C40115g) this.f7231y;
                C23470p c23470p = c40115g.f173158z;
                Map map = c40115g.f173156H;
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i29 = this.f7230x;
                try {
                    if (i29 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC30061h interfaceC30061h = c40115g.f173154F.get(C3023j1.f12041w);
                        AbstractC22676k.m65747g(interfaceC30061h);
                        this.f7230x = 1;
                        if (((InterfaceC3027k1) interfaceC30061h).join(this) == enumC31071a13) {
                            return enumC31071a13;
                        }
                    } else {
                        if (i29 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        C34826l0 c34826l0 = (C34826l0) ((Map.Entry) it4.next()).getValue();
                        c34826l0.f146648F.m109909a();
                        ((ThreadPoolExecutor) c34826l0.f146649a.m109920a()).shutdown();
                    }
                    InterfaceC30061h interfaceC30061h2 = (AbstractC3076z) c23470p.getValue();
                    AbstractC22676k.m65748h(interfaceC30061h2, "null cannot be cast to non-null type java.io.Closeable");
                    ((Closeable) interfaceC30061h2).close();
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    Iterator it5 = map.entrySet().iterator();
                    while (it5.hasNext()) {
                        C34826l0 c34826l1 = (C34826l0) ((Map.Entry) it5.next()).getValue();
                        c34826l1.f146648F.m109909a();
                        ((ThreadPoolExecutor) c34826l1.f146649a.m109920a()).shutdown();
                    }
                    InterfaceC30061h interfaceC30061h3 = (AbstractC3076z) c23470p.getValue();
                    AbstractC22676k.m65748h(interfaceC30061h3, "null cannot be cast to non-null type java.io.Closeable");
                    ((Closeable) interfaceC30061h3).close();
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1849z1(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7229w = i13;
        this.f7231y = obj;
    }
}
