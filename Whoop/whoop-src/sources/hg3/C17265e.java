package hg3;

import fg3.InterfaceC14474b;
import gg3.C15828a;
import gg3.C15831d;
import gg3.InterfaceC15830c;
import ig3.InterfaceC18475a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: hg3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17265e implements InterfaceC14474b {

    /* JADX INFO: renamed from: E */
    public C15828a f66354E;

    /* JADX INFO: renamed from: F */
    public final Queue f66355F;

    /* JADX INFO: renamed from: G */
    public final boolean f66356G;

    /* JADX INFO: renamed from: w */
    public final String f66357w;

    /* JADX INFO: renamed from: x */
    public volatile InterfaceC14474b f66358x;

    /* JADX INFO: renamed from: y */
    public Boolean f66359y;

    /* JADX INFO: renamed from: z */
    public Method f66360z;

    public C17265e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z4) {
        this.f66357w = str;
        this.f66355F = linkedBlockingQueue;
        this.f66356G = z4;
    }

    /* JADX INFO: renamed from: A */
    public final void m48850A(C15831d c15831d) {
        if (m48853x()) {
            try {
                this.f66360z.invoke(this.f66358x, c15831d);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m48851B(InterfaceC14474b interfaceC14474b) {
        this.f66358x = interfaceC14474b;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: a */
    public final boolean mo41315a() {
        return m48852w().mo41315a();
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: b */
    public final boolean mo41316b() {
        return m48852w().mo41316b();
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: c */
    public final void mo41317c(String str, Object... objArr) {
        m48852w().mo41317c(str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: d */
    public final boolean mo41318d() {
        return m48852w().mo41318d();
    }

    @Override // fg3.InterfaceC14474b
    public final void debug(String str) {
        m48852w().debug(str);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: e */
    public final boolean mo41319e() {
        return m48852w().mo41319e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C17265e.class == obj.getClass() && this.f66357w.equals(((C17265e) obj).f66357w);
    }

    @Override // fg3.InterfaceC14474b
    public final void error(String str) {
        m48852w().error(str);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: f */
    public final void mo41320f(String str, Object... objArr) {
        m48852w().mo41320f(str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: g */
    public final InterfaceC18475a mo41321g(int i13) {
        return m48852w().mo41321g(i13);
    }

    @Override // fg3.InterfaceC14474b
    public final String getName() {
        return this.f66357w;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: h */
    public final void mo41322h(String str, Object... objArr) {
        m48852w().mo41322h(str, objArr);
    }

    public final int hashCode() {
        return this.f66357w.hashCode();
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: i */
    public final void mo41323i(String str, Throwable th3) {
        m48852w().mo41323i(str, th3);
    }

    @Override // fg3.InterfaceC14474b
    public final void info(String str) {
        m48852w().info(str);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: j */
    public final void mo41324j(String str, Throwable th3) {
        m48852w().mo41324j(str, th3);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: k */
    public final void mo41325k(String str, Throwable th3) {
        m48852w().mo41325k(str, th3);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: l */
    public final void mo41326l(String str, Object... objArr) {
        m48852w().mo41326l(str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: m */
    public final InterfaceC18475a mo41327m(int i13) {
        return m48852w().mo41327m(i13);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: n */
    public final void mo41328n(String str, Throwable th3) {
        m48852w().mo41328n(str, th3);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: o */
    public final void mo41329o(String str, Number number, Object obj) {
        m48852w().mo41329o(str, number, obj);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: p */
    public final boolean mo41330p() {
        return m48852w().mo41330p();
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: q */
    public final void mo41331q(String str, Integer num, Object obj) {
        m48852w().mo41331q(str, num, obj);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: r */
    public final void mo41332r(String str, Throwable th3) {
        m48852w().mo41332r(str, th3);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: s */
    public final void mo41333s(String str) {
        m48852w().mo41333s(str);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: t */
    public final boolean mo41334t(int i13) {
        return m48852w().mo41334t(i13);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: u */
    public final void mo41335u(String str, Object... objArr) {
        m48852w().mo41335u(str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: v */
    public final void mo41336v(String str, Number number) {
        m48852w().mo41336v(str, number);
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC14474b m48852w() {
        if (this.f66358x != null) {
            return this.f66358x;
        }
        if (this.f66356G) {
            return C17262b.f66349w;
        }
        if (this.f66354E == null) {
            Queue queue = this.f66355F;
            C15828a c15828a = new C15828a();
            c15828a.f59809x = this;
            c15828a.f59808w = this.f66357w;
            c15828a.f59810y = queue;
            this.f66354E = c15828a;
        }
        return this.f66354E;
    }

    @Override // fg3.InterfaceC14474b
    public final void warn(String str) {
        m48852w().warn(str);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m48853x() {
        Boolean bool = this.f66359y;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f66360z = this.f66358x.getClass().getMethod("log", InterfaceC15830c.class);
            this.f66359y = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f66359y = Boolean.FALSE;
        }
        return this.f66359y.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m48854y() {
        return this.f66358x instanceof C17262b;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m48855z() {
        return this.f66358x == null;
    }
}
