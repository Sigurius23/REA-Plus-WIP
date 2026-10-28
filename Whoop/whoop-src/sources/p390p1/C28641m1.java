package p390p1;

import c93.InterfaceC4351m;
import hb3.AbstractC17104a0;
import java.util.concurrent.atomic.AtomicReference;
import nh3.AbstractC26725a;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p002a0.C0063y0;
import p005a3.C0237p;
import p537ux.C35331f0;
import p602x1.C37822h;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28641m1 {

    /* JADX INFO: renamed from: a */
    public final C28679w f115837a;

    /* JADX INFO: renamed from: b */
    public final AbstractC28667t f115838b;

    /* JADX INFO: renamed from: c */
    public final C28655q f115839c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m f115840d;

    /* JADX INFO: renamed from: e */
    public final boolean f115841e;

    /* JADX INFO: renamed from: f */
    public final AbstractC17104a0 f115842f;

    /* JADX INFO: renamed from: g */
    public final Object f115843g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f115844h = new AtomicReference(EnumC28645n1.f115857y);

    /* JADX INFO: renamed from: i */
    public C0059w0 f115845i;

    /* JADX INFO: renamed from: j */
    public final C37822h f115846j;

    /* JADX INFO: renamed from: k */
    public final C0237p f115847k;

    public C28641m1(C28679w c28679w, AbstractC28667t abstractC28667t, C28655q c28655q, C0063y0 c0063y0, InterfaceC4351m interfaceC4351m, boolean z4, AbstractC17104a0 abstractC17104a0, Object obj) {
        this.f115837a = c28679w;
        this.f115838b = abstractC28667t;
        this.f115839c = c28655q;
        this.f115840d = interfaceC4351m;
        this.f115841e = z4;
        this.f115842f = abstractC17104a0;
        this.f115843g = obj;
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        AbstractC22676k.m65748h(c0059w0, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f115845i = c0059w0;
        C37822h c37822h = new C37822h();
        c37822h.m121355g(c0063y0, c28655q.m87119D());
        this.f115846j = c37822h;
        this.f115847k = new C0237p(abstractC17104a0.f65707z);
    }

    /* JADX INFO: renamed from: a */
    public final void m87081a() throws Exception {
        AtomicReference atomicReference = this.f115844h;
        try {
            switch (((EnumC28645n1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m87082b();
                    EnumC28645n1 enumC28645n1 = EnumC28645n1.f115852F;
                    EnumC28645n1 enumC28645n2 = EnumC28645n1.f115853G;
                    if (AbstractC26725a.m79521y(atomicReference)) {
                        return;
                    }
                    AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n1 + " to: " + enumC28645n2 + '.');
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            atomicReference.set(EnumC28645n1.f115855w);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m87082b() {
        synchronized (this.f115843g) {
            try {
                this.f115847k.m676G(this.f115842f, this.f115846j);
                this.f115846j.m121352c();
                this.f115846j.m121353d();
                this.f115846j.m121351b();
                this.f115837a.f115999Q = null;
            } catch (Throwable th3) {
                this.f115846j.m121351b();
                this.f115837a.f115999Q = null;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87083c() {
        return ((EnumC28645n1) this.f115844h.get()).compareTo(EnumC28645n1.f115852F) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m87084d() {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115858z;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115852F;
        if (AbstractC26725a.m79522z(this.f115844h)) {
            return;
        }
        AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n1 + " to: " + enumC28645n2 + '.');
    }

    /* JADX INFO: renamed from: e */
    public final void m87085e() {
        AtomicReference atomicReference = this.f115844h;
        Object obj = atomicReference.get();
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115858z;
        if (obj == enumC28645n1) {
            return;
        }
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115852F;
        if (AbstractC26725a.m79514r(atomicReference)) {
            return;
        }
        AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n2 + " to: " + enumC28645n1 + '.');
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87086f(C35331f0 c35331f0) throws Exception {
        AtomicReference atomicReference = this.f115844h;
        try {
            int iOrdinal = ((EnumC28645n1) atomicReference.get()).ordinal();
            C28679w c28679w = this.f115837a;
            AbstractC28667t abstractC28667t = this.f115838b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C28655q c28655q = this.f115839c;
                    boolean z4 = this.f115841e;
                    if (z4) {
                        c28655q.f115931z = 100;
                        c28655q.f115930y = true;
                    }
                    try {
                        this.f115845i = abstractC28667t.mo87091b(c28679w, c35331f0, this.f115840d);
                        if (z4) {
                            c28655q.m87181v();
                        }
                        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115857y;
                        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115858z;
                        if (!AbstractC26725a.m79518v(atomicReference)) {
                            AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n1 + " to: " + enumC28645n2 + '.');
                        }
                        if (this.f115845i.m142g()) {
                            m87084d();
                        }
                        return m87083c();
                    } catch (Throwable th3) {
                        if (z4) {
                            c28655q.m87181v();
                        }
                        throw th3;
                    }
                case 3:
                    EnumC28645n1 enumC28645n3 = EnumC28645n1.f115858z;
                    EnumC28645n1 enumC28645n4 = EnumC28645n1.f115851E;
                    if (!AbstractC26725a.m79519w(atomicReference)) {
                        AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n3 + " to: " + enumC28645n4 + '.');
                    }
                    try {
                        this.f115845i = abstractC28667t.mo87102m(c28679w, c35331f0, this.f115845i);
                        if (!AbstractC26725a.m79520x(atomicReference)) {
                            AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n4 + " to: " + enumC28645n3 + '.');
                        }
                        if (this.f115845i.m142g()) {
                            m87084d();
                        }
                        return m87083c();
                    } catch (Throwable th4) {
                        EnumC28645n1 enumC28645n5 = EnumC28645n1.f115851E;
                        EnumC28645n1 enumC28645n6 = EnumC28645n1.f115858z;
                        if (!AbstractC26725a.m79520x(atomicReference)) {
                            AbstractC28657q1.m87189b("Unexpected state change from: " + enumC28645n5 + " to: " + enumC28645n6 + '.');
                        }
                        throw th4;
                    }
                case 4:
                    AbstractC28659r.m87193d("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            atomicReference.set(EnumC28645n1.f115855w);
            throw e5;
        }
    }
}
