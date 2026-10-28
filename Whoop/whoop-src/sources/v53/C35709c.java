package v53;

import a63.AbstractC0487g;
import a63.AbstractC0499p;
import a63.AbstractC0501r;
import a63.C0475a;
import a63.C0479c;
import a63.C0481d;
import a63.C0484e0;
import a63.C0493j;
import a63.C0498o;
import a63.C0504u;
import a63.C0506w;
import a63.C0507x;
import a63.C0509z;
import ad3.C0783z;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import e63.C12775d;
import e63.C12777f;
import f63.C14154b;
import g63.AbstractC15538b;
import j43.C21317a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m83.AbstractC25265s;
import o63.C27610a;
import o63.C27615f;
import p005a3.C0227m1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import w53.C36845b;
import z53.C40115g;

/* JADX INFO: renamed from: v53.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35709c implements InterfaceC2994c0, Closeable {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151924L = AtomicIntegerFieldUpdater.newUpdater(C35709c.class, "closed");

    /* JADX INFO: renamed from: E */
    public final C12777f f151925E;

    /* JADX INFO: renamed from: F */
    public final C14154b f151926F;

    /* JADX INFO: renamed from: G */
    public final C12777f f151927G;

    /* JADX INFO: renamed from: H */
    public final C14154b f151928H;

    /* JADX INFO: renamed from: I */
    public final C27615f f151929I;

    /* JADX INFO: renamed from: J */
    public final C0783z f151930J;

    /* JADX INFO: renamed from: K */
    public final C35711e f151931K;
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: w */
    public final C40115g f151932w;

    /* JADX INFO: renamed from: x */
    public final boolean f151933x;

    /* JADX INFO: renamed from: y */
    public final C3031l1 f151934y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC30063j f151935z;

    public C35709c(C40115g c40115g, C35711e c35711e) {
        this.f151932w = c40115g;
        boolean z4 = false;
        C3031l1 c3031l1 = new C3031l1((InterfaceC3027k1) c40115g.f173155G.get(C3023j1.f12041w));
        this.f151934y = c3031l1;
        this.f151935z = c40115g.f173155G.plus(c3031l1);
        this.f151925E = new C12777f(c35711e.f151944h, 0);
        int i13 = 1;
        this.f151926F = new C14154b(c35711e.f151944h, 1);
        C12777f c12777f = new C12777f(c35711e.f151944h, 1);
        this.f151927G = c12777f;
        this.f151928H = new C14154b(c35711e.f151944h, 0);
        this.f151929I = new C27615f();
        this.f151930J = new C0783z(12);
        C35711e c35711e2 = new C35711e();
        this.f151931K = c35711e2;
        if (this.f151933x) {
            c3031l1.invokeOnCompletion(new C21317a(this, 19));
        }
        InterfaceC30057d interfaceC30057d = null;
        c12777f.m95533f(C12777f.f43730o, new C0506w(this, c40115g, null));
        c12777f.m95533f(C12777f.f43731p, new C0493j(this, z4, interfaceC30057d, 9));
        C0475a c0475a = C0509z.f1717a;
        C35707a c35707a = C35707a.f151919z;
        c35711e2.m113182a(c0475a, c35707a);
        c35711e2.m113182a(C0481d.f1633a, c35707a);
        if (c35711e.f151942f) {
            c35711e2.f151939c.put("DefaultTransformers", C35707a.f151917x);
        }
        c35711e2.m113182a(C0484e0.f1639b, c35707a);
        C0475a c0475a2 = C0498o.f1679d;
        c35711e2.m113182a(c0475a2, c35707a);
        if (c35711e.f151941e) {
            c35711e2.m113182a(C0507x.f1713a, c35707a);
        }
        c35711e2.f151941e = c35711e.f151941e;
        c35711e2.f151942f = c35711e.f151942f;
        c35711e2.f151943g = c35711e.f151943g;
        c35711e2.f151937a.putAll(c35711e.f151937a);
        c35711e2.f151938b.putAll(c35711e.f151938b);
        c35711e2.f151939c.putAll(c35711e.f151939c);
        if (c35711e.f151942f) {
            c35711e2.m113182a(C0504u.f1692d, c35707a);
        }
        C27610a c27610a = AbstractC0487g.f1648a;
        C0227m1 c0227m1 = new C0227m1(c35711e2, i13);
        C27610a c27610a2 = AbstractC0499p.f1684a;
        c35711e2.m113182a(c0475a2, c0227m1);
        Iterator it = c35711e2.f151937a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it3 = c35711e2.f151939c.values().iterator();
        while (it3.hasNext()) {
            ((Function1) it3.next()).invoke(this);
        }
        this.f151926F.m95533f(C14154b.f50998j, new C0479c(this, interfaceC30057d, 5));
        this.f151933x = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m113181b(C12775d c12775d, AbstractC32269c abstractC32269c) {
        C35708b c35708b;
        if (abstractC32269c instanceof C35708b) {
            c35708b = (C35708b) abstractC32269c;
            int i13 = c35708b.f151923y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35708b.f151923y = i13 - Integer.MIN_VALUE;
            } else {
                c35708b = new C35708b(this, abstractC32269c);
            }
        } else {
            c35708b = new C35708b(this, abstractC32269c);
        }
        Object objM95529a = c35708b.f151921w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35708b.f151923y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM95529a);
            this.f151930J.m1877v(AbstractC15538b.f58263a);
            Object obj = c12775d.f43712d;
            c35708b.f151923y = 1;
            objM95529a = this.f151925E.m95529a(c12775d, obj, c35708b);
            if (objM95529a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM95529a);
        }
        AbstractC22676k.m65748h(objM95529a, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (C36845b) objM95529a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f151924L.compareAndSet(this, 0, 1)) {
            C27615f c27615f = (C27615f) this.f151929I.m83374b(AbstractC0501r.f1685a);
            for (C27610a c27610a : AbstractC25265s.m74093D1(c27615f.m83375c().keySet())) {
                AbstractC22676k.m65748h(c27610a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objM83374b = c27615f.m83374b(c27610a);
                if (objM83374b instanceof Closeable) {
                    ((Closeable) objM83374b).close();
                }
            }
            this.f151934y.complete();
            if (this.f151933x) {
                this.f151932w.close();
            }
        }
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f151935z;
    }

    public final String toString() {
        return "HttpClient[" + this.f151932w + ']';
    }
}
