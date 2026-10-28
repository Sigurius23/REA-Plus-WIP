package io.ktor.utils.p228io.jvm.javaio;

import bc3.AbstractC2987a1;
import bc3.AbstractC3012g2;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3056s0;
import fg3.InterfaceC14474b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p002a0.C0006a1;
import p007a6.C0416e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20008b {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75080f = AtomicReferenceFieldUpdater.newUpdater(AbstractC20008b.class, Object.class, "state");

    /* JADX INFO: renamed from: a */
    public final InterfaceC3027k1 f75081a;

    /* JADX INFO: renamed from: b */
    public final C20007a f75082b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3056s0 f75083c;

    /* JADX INFO: renamed from: d */
    public int f75084d;

    /* JADX INFO: renamed from: e */
    public int f75085e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    public AbstractC20008b(InterfaceC3027k1 interfaceC3027k1) {
        this.f75081a = interfaceC3027k1;
        C20007a c20007a = new C20007a(this);
        this.f75082b = c20007a;
        this.state = this;
        this.result = 0;
        InterfaceC30057d interfaceC30057d = null;
        this.f75083c = interfaceC3027k1 != null ? interfaceC3027k1.invokeOnCompletion(new C0006a1(this, 27)) : null;
        C0416e c0416e = new C0416e(this, interfaceC30057d, 6);
        AbstractC22681m0.m65774e(1, c0416e);
        c0416e.invoke(c20007a);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo55813a(AbstractC32269c abstractC32269c);

    /* JADX INFO: renamed from: b */
    public final int m55814b(byte[] bArr, int i13, int i14) throws Throwable {
        Object noWhenBranchMatchedException;
        C20011e c20011e = C20011e.f75088b;
        this.f75084d = i13;
        this.f75085e = i14;
        Thread thread = Thread.currentThread();
        InterfaceC30057d interfaceC30057d = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof InterfaceC30057d) {
                interfaceC30057d = (InterfaceC30057d) obj;
                noWhenBranchMatchedException = thread;
            } else {
                if (obj instanceof C23454a0) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (AbstractC22676k.m65745e(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            AbstractC22676k.m65749i(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75080f;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, noWhenBranchMatchedException)) {
                    AbstractC22676k.m65747g(interfaceC30057d);
                    interfaceC30057d.resumeWith(bArr);
                    AbstractC22676k.m65749i(thread, "thread");
                    if (this.state == thread) {
                        InterfaceC20015i interfaceC20015i = (InterfaceC20015i) AbstractC20016j.f75100a.get();
                        if (interfaceC20015i == null) {
                            interfaceC20015i = c20011e;
                        }
                        if (interfaceC20015i == C20011e.f75089c) {
                            ((InterfaceC14474b) AbstractC20010d.f75087a.getValue()).warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
                        }
                        while (true) {
                            AbstractC2987a1 abstractC2987a1 = (AbstractC2987a1) AbstractC3012g2.f12029a.get();
                            long jMo8681o0 = abstractC2987a1 != null ? abstractC2987a1.mo8681o0() : Long.MAX_VALUE;
                            if (this.state != thread) {
                                break;
                            }
                            if (jMo8681o0 > 0) {
                                InterfaceC20015i interfaceC20015i2 = (InterfaceC20015i) AbstractC20016j.f75100a.get();
                                if (interfaceC20015i2 == null) {
                                    interfaceC20015i2 = c20011e;
                                }
                                interfaceC20015i2.mo55816a(jMo8681o0);
                            }
                        }
                    }
                    Object obj2 = this.state;
                    if (obj2 instanceof Throwable) {
                        throw ((Throwable) obj2);
                    }
                    return this.result;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }
}
