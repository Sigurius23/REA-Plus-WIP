package xg3;

import bh3.AbstractC3258e;
import bh3.InterfaceC3254a;
import bh3.InterfaceC3255b;
import bh3.InterfaceC3260g;
import bh3.InterfaceC3261h;
import bh3.InterfaceC3262i;
import ch3.AbstractC4676c0;
import ch3.AbstractC4677d;
import ch3.AbstractC4694l0;
import ch3.C4670a0;
import ch3.C4673b0;
import ch3.C4678d0;
import ch3.C4683g;
import ch3.C4690j0;
import ch3.C4691k;
import ch3.C4696m0;
import ch3.C4697n;
import ch3.C4700o0;
import ch3.C4701p;
import ch3.C4703q;
import ch3.C4707s;
import ch3.C4710t0;
import ch3.C4711u;
import ch3.C4714v0;
import ch3.EnumC4669a;
import gh3.C15856a;
import gh3.C15862g;
import gh3.C15865j;
import gh3.C15867l;
import gh3.EnumC15860e;
import gh3.EnumC15869n;
import ih3.C18528a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jh3.AbstractC21700a;
import jh3.C21705f;
import kh3.C22488a;
import mh3.AbstractC25568e;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import p471rx.exceptions.OnErrorFailedException;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: xg3.g */
/* JADX INFO: loaded from: classes5.dex */
public class C38280g<T> {

    /* JADX INFO: renamed from: w */
    final InterfaceC38278e f164082w;

    public C38280g(InterfaceC38278e interfaceC38278e) {
        this.f164082w = interfaceC38278e;
    }

    /* JADX INFO: renamed from: A */
    public static <T> C38280g<T> m122634A(C38280g<? extends T>[] c38280gArr) {
        return m122650y(m122645r(c38280gArr));
    }

    /* JADX INFO: renamed from: O */
    public static <T> InterfaceC38293t m122635O(AbstractC38292s abstractC38292s, C38280g<T> c38280g) {
        if (abstractC38292s == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (c38280g.f164082w == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        abstractC38292s.mo14748d();
        if (!(abstractC38292s instanceof C18528a)) {
            abstractC38292s = new C18528a(abstractC38292s);
        }
        try {
            InterfaceC38278e interfaceC38278e = c38280g.f164082w;
            C21705f.f83334f.m61159c().getClass();
            interfaceC38278e.mo9472b(abstractC38292s);
            C21705f.f83334f.m61159c().getClass();
            return abstractC38292s;
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            if (abstractC38292s.mo14749a()) {
                AbstractC21700a.m61126a(AbstractC21700a.m61127b(th3));
            } else {
                try {
                    abstractC38292s.onError(AbstractC21700a.m61127b(th3));
                } catch (Throwable th4) {
                    AbstractC12350b.m34573V(th4);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                    AbstractC21700a.m61127b(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return AbstractC25568e.f100262a;
        }
    }

    /* JADX INFO: renamed from: V */
    public static <T> C38280g<T> m122636V(InterfaceC38278e interfaceC38278e) {
        C21705f.f83334f.m61159c().getClass();
        return new C38280g<>(interfaceC38278e);
    }

    /* JADX INFO: renamed from: e */
    public static <T, R> C38280g<R> m122637e(List<? extends C38280g<? extends T>> list, InterfaceC3262i interfaceC3262i) {
        return m122636V(new C4683g(list, interfaceC3262i));
    }

    /* JADX INFO: renamed from: f */
    public static <T1, T2, R> C38280g<R> m122638f(C38280g<? extends T1> c38280g, C38280g<? extends T2> c38280g2, InterfaceC3261h interfaceC3261h) {
        return m122637e(Arrays.asList(c38280g, c38280g2), AbstractC32073e.m99762u(interfaceC3261h));
    }

    /* JADX INFO: renamed from: g */
    public static <T> C38280g<T> m122639g(C38280g<? extends C38280g<? extends T>> c38280g) {
        return (C38280g<T>) c38280g.m122676i(EnumC15869n.f59976w);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C38280g<T> m122640h(C38280g<? extends T> c38280g, C38280g<? extends T> c38280g2) {
        return m122639g(m122649v(c38280g, c38280g2));
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static <T> C38280g<T> m122641j(InterfaceC38278e interfaceC38278e) {
        C21705f.f83334f.m61159c().getClass();
        return new C38280g<>(interfaceC38278e);
    }

    /* JADX INFO: renamed from: l */
    public static <T> C38280g<T> m122642l() {
        return EnumC4669a.f19117w;
    }

    /* JADX INFO: renamed from: m */
    public static <T> C38280g<T> m122643m(Throwable th3) {
        return m122636V(new C4701p(th3, 1));
    }

    /* JADX INFO: renamed from: q */
    public static <T> C38280g<T> m122644q(Iterable<? extends T> iterable) {
        return m122636V(new C4701p(iterable));
    }

    /* JADX INFO: renamed from: r */
    public static <T> C38280g<T> m122645r(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m122642l();
        }
        return length == 1 ? m122648u(tArr[0]) : m122636V(new C4697n(tArr, 0));
    }

    /* JADX INFO: renamed from: s */
    public static C38280g<Long> m122646s(long j7, long j13, TimeUnit timeUnit, AbstractC38284k abstractC38284k) {
        return m122636V(new C4711u(j7, j13, timeUnit, abstractC38284k));
    }

    /* JADX INFO: renamed from: t */
    public static C38280g<Long> m122647t(long j7, TimeUnit timeUnit) {
        return m122646s(j7, j7, timeUnit, C22488a.m64989a().f88181a);
    }

    /* JADX INFO: renamed from: u */
    public static <T> C38280g<T> m122648u(T t14) {
        return new C15867l(t14);
    }

    /* JADX INFO: renamed from: v */
    public static <T> C38280g<T> m122649v(T t14, T t15) {
        return m122645r(new Object[]{t14, t15});
    }

    /* JADX INFO: renamed from: y */
    public static <T> C38280g<T> m122650y(C38280g<? extends C38280g<? extends T>> c38280g) {
        if (c38280g.getClass() != C15867l.class) {
            return (C38280g<T>) c38280g.m122681w(AbstractC4676c0.f19134b);
        }
        return m122636V(new C15865j((C15867l) c38280g, EnumC15869n.f59976w, 0));
    }

    /* JADX INFO: renamed from: z */
    public static <T> C38280g<T> m122651z(C38280g<? extends T> c38280g, C38280g<? extends T> c38280g2, C38280g<? extends T> c38280g3) {
        return m122634A(new C38280g[]{c38280g, c38280g2, c38280g3});
    }

    /* JADX INFO: renamed from: B */
    public final C38280g<T> m122652B(AbstractC38284k abstractC38284k) {
        return m122653C(abstractC38284k, C15862g.f59961x);
    }

    /* JADX INFO: renamed from: C */
    public final C38280g<T> m122653C(AbstractC38284k abstractC38284k, int i13) {
        return m122654D(abstractC38284k, false, i13);
    }

    /* JADX INFO: renamed from: D */
    public final C38280g<T> m122654D(AbstractC38284k abstractC38284k, boolean z4, int i13) {
        return this instanceof C15867l ? ((C15867l) this).m44778X(abstractC38284k) : (C38280g<T>) m122681w(new C4690j0(abstractC38284k, z4, i13));
    }

    /* JADX INFO: renamed from: E */
    public final C38280g<T> m122655E() {
        return (C38280g<T>) m122681w(AbstractC4694l0.f19228a);
    }

    /* JADX INFO: renamed from: F */
    public final C38280g<T> m122656F(long j7, InterfaceC3254a interfaceC3254a, InterfaceC38275b interfaceC38275b) {
        return (C38280g<T>) m122681w(new C4696m0(j7, interfaceC3254a, interfaceC38275b));
    }

    /* JADX INFO: renamed from: G */
    public final C38280g<T> m122657G() {
        return (C38280g<T>) m122681w(AbstractC4677d.f19138d);
    }

    /* JADX INFO: renamed from: H */
    public final C38280g<T> m122658H(InterfaceC3260g interfaceC3260g) {
        return (C38280g<T>) m122681w(new C4673b0(new C3632c(interfaceC3260g), 1));
    }

    /* JADX INFO: renamed from: I */
    public final C38280g<T> m122659I(T t14) {
        return m122640h(m122648u(t14), this);
    }

    /* JADX INFO: renamed from: J */
    public final InterfaceC38293t m122660J() {
        return m122664N(new C15856a(AbstractC3258e.f12762a, EnumC15860e.f59957w));
    }

    /* JADX INFO: renamed from: K */
    public final InterfaceC38293t m122661K(InterfaceC3255b interfaceC3255b) {
        if (interfaceC3255b != null) {
            return m122664N(new C15856a(interfaceC3255b, EnumC15860e.f59957w));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC38293t m122662L(InterfaceC3255b interfaceC3255b, InterfaceC3255b interfaceC3255b2) {
        if (interfaceC3255b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (interfaceC3255b2 != null) {
            return m122664N(new C15856a(interfaceC3255b, interfaceC3255b2));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC38293t m122663M(InterfaceC38281h interfaceC38281h) {
        if (interfaceC38281h instanceof AbstractC38292s) {
            return m122664N((AbstractC38292s) interfaceC38281h);
        }
        if (interfaceC38281h != null) {
            return m122664N(new C4700o0(interfaceC38281h, 1));
        }
        throw new NullPointerException("observer is null");
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC38293t m122664N(AbstractC38292s abstractC38292s) {
        return m122635O(abstractC38292s, this);
    }

    /* JADX INFO: renamed from: P */
    public final C38280g<T> m122665P(AbstractC38284k abstractC38284k) {
        return m122666Q(abstractC38284k, true);
    }

    /* JADX INFO: renamed from: Q */
    public final C38280g<T> m122666Q(AbstractC38284k abstractC38284k, boolean z4) {
        return this instanceof C15867l ? ((C15867l) this).m44778X(abstractC38284k) : m122636V(new C4710t0(this, abstractC38284k, z4));
    }

    /* JADX INFO: renamed from: R */
    public final C38280g<T> m122667R(int i13) {
        return (C38280g<T>) m122681w(new C4714v0(i13));
    }

    /* JADX INFO: renamed from: S */
    public final <E> C38280g<T> m122668S(C38280g<? extends E> c38280g) {
        return (C38280g<T>) m122681w(new C4678d0(c38280g));
    }

    /* JADX INFO: renamed from: T */
    public C38277d m122669T() {
        try {
            C38277d c38277d = new C38277d();
            C21705f.f83334f.m61157a().getClass();
            return c38277d;
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th3) {
            AbstractC21700a.m61126a(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: U */
    public C38289p m122670U() {
        return new C38289p(C4707s.m14773a(this));
    }

    /* JADX INFO: renamed from: W */
    public final InterfaceC38293t m122671W(AbstractC38292s abstractC38292s) {
        try {
            abstractC38292s.mo14748d();
            InterfaceC38278e interfaceC38278e = this.f164082w;
            C21705f.f83334f.m61159c().getClass();
            interfaceC38278e.mo9472b(abstractC38292s);
            C21705f.f83334f.m61159c().getClass();
            return abstractC38292s;
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            try {
                abstractC38292s.onError(AbstractC21700a.m61127b(th3));
                return AbstractC25568e.f100262a;
            } catch (Throwable th4) {
                AbstractC12350b.m34573V(th4);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                AbstractC21700a.m61127b(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C38280g<T> m122672a() {
        return (C38280g<T>) m122681w(AbstractC4677d.f19137c);
    }

    /* JADX INFO: renamed from: b */
    public final C38280g<List<T>> m122673b(long j7, long j13, TimeUnit timeUnit, AbstractC38284k abstractC38284k) {
        return (C38280g<List<T>>) m122681w(new C4670a0(j7, j13, timeUnit, abstractC38284k));
    }

    /* JADX INFO: renamed from: c */
    public final C38280g<List<T>> m122674c(long j7, TimeUnit timeUnit, AbstractC38284k abstractC38284k) {
        return m122673b(j7, j7, timeUnit, abstractC38284k);
    }

    /* JADX INFO: renamed from: d */
    public final <R> C38280g<R> m122675d(Class<R> cls) {
        return m122681w(new C4673b0(cls, 0));
    }

    /* JADX INFO: renamed from: i */
    public final <R> C38280g<R> m122676i(InterfaceC3260g interfaceC3260g) {
        return this instanceof C15867l ? m122636V(new C15865j((C15867l) this, interfaceC3260g, 0)) : m122636V(new C4691k(this, interfaceC3260g, 0));
    }

    /* JADX INFO: renamed from: k */
    public final C38280g<T> m122677k() {
        return (C38280g<T>) m122681w(AbstractC4676c0.f19133a);
    }

    /* JADX INFO: renamed from: n */
    public final C38280g<T> m122678n(InterfaceC3260g interfaceC3260g) {
        return m122636V(new C4691k(this, interfaceC3260g, 1));
    }

    /* JADX INFO: renamed from: o */
    public final <R> C38280g<R> m122679o(InterfaceC3260g interfaceC3260g) {
        return getClass() == C15867l.class ? m122636V(new C15865j((C15867l) this, interfaceC3260g, 0)) : m122650y(m122682x(interfaceC3260g));
    }

    /* JADX INFO: renamed from: p */
    public final void m122680p(InterfaceC3255b interfaceC3255b) {
        m122661K(interfaceC3255b);
    }

    /* JADX INFO: renamed from: w */
    public final <R> C38280g<R> m122681w(InterfaceC38279f interfaceC38279f) {
        return m122636V(new C4703q(0, this.f164082w, interfaceC38279f));
    }

    /* JADX INFO: renamed from: x */
    public final <R> C38280g<R> m122682x(InterfaceC3260g interfaceC3260g) {
        return m122636V(new C4691k(this, interfaceC3260g, 2));
    }
}
