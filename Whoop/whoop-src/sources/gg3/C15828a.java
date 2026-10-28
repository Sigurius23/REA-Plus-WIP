package gg3;

import fg3.InterfaceC14474b;
import hg3.C17265e;
import java.io.Serializable;
import java.util.Queue;

/* JADX INFO: renamed from: gg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15828a implements InterfaceC14474b, Serializable {

    /* JADX INFO: renamed from: w */
    public String f59808w;

    /* JADX INFO: renamed from: x */
    public C17265e f59809x;

    /* JADX INFO: renamed from: y */
    public Queue f59810y;

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: a */
    public final boolean mo41315a() {
        return true;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: b */
    public final boolean mo41316b() {
        return true;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: c */
    public final void mo41317c(String str, Object... objArr) {
        m44665w(2, str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: d */
    public final boolean mo41318d() {
        return true;
    }

    @Override // fg3.InterfaceC14474b
    public final void debug(String str) {
        m44666x(4, str, null, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: e */
    public final boolean mo41319e() {
        return true;
    }

    @Override // fg3.InterfaceC14474b
    public final void error(String str) {
        m44666x(1, str, null, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: f */
    public final void mo41320f(String str, Object... objArr) {
        m44665w(1, str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    public final String getName() {
        return this.f59808w;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: h */
    public final void mo41322h(String str, Object... objArr) {
        m44665w(4, str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: i */
    public final void mo41323i(String str, Throwable th3) {
        m44666x(3, str, th3, null);
    }

    @Override // fg3.InterfaceC14474b
    public final void info(String str) {
        m44666x(3, str, null, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: j */
    public final void mo41324j(String str, Throwable th3) {
        m44666x(2, str, th3, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: k */
    public final void mo41325k(String str, Throwable th3) {
        m44666x(5, str, th3, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: l */
    public final void mo41326l(String str, Object... objArr) {
        m44665w(5, str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: n */
    public final void mo41328n(String str, Throwable th3) {
        m44666x(1, str, th3, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: o */
    public final void mo41329o(String str, Number number, Object obj) {
        if (!(obj instanceof Throwable)) {
            m44666x(2, str, null, new Object[]{number, obj});
        } else {
            m44666x(2, str, (Throwable) obj, new Object[]{number});
        }
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: p */
    public final boolean mo41330p() {
        return true;
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: q */
    public final void mo41331q(String str, Integer num, Object obj) {
        if (!(obj instanceof Throwable)) {
            m44666x(4, str, null, new Object[]{num, obj});
        } else {
            m44666x(4, str, (Throwable) obj, new Object[]{num});
        }
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: r */
    public final void mo41332r(String str, Throwable th3) {
        m44666x(4, str, th3, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: s */
    public final void mo41333s(String str) {
        m44666x(5, str, null, null);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: u */
    public final void mo41335u(String str, Object... objArr) {
        m44665w(3, str, objArr);
    }

    @Override // fg3.InterfaceC14474b
    /* JADX INFO: renamed from: v */
    public final void mo41336v(String str, Number number) {
        m44666x(2, str, null, new Object[]{number});
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    /* JADX INFO: renamed from: w */
    public final void m44665w(int i13, String str, Object[] objArr) {
        Throwable th3;
        if (objArr.length == 0) {
            th3 = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th3 = (Throwable) obj;
            } else {
                th3 = null;
            }
        }
        if (th3 == null) {
            m44666x(i13, str, null, objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        m44666x(i13, str, th3, objArr2);
    }

    @Override // fg3.InterfaceC14474b
    public final void warn(String str) {
        m44666x(2, str, null, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m44666x(int i13, String str, Throwable th3, Object[] objArr) {
        C15831d c15831d = new C15831d();
        System.currentTimeMillis();
        c15831d.f59813w = i13;
        c15831d.f59814x = this.f59809x;
        Thread.currentThread().getName();
        c15831d.f59815y = objArr;
        this.f59810y.add(c15831d);
    }
}
