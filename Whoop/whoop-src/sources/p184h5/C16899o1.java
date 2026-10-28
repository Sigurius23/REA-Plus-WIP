package p184h5;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.o1 */
/* JADX INFO: loaded from: classes.dex */
public class C16899o1 {

    /* JADX INFO: renamed from: b */
    public static final C16905q1 f64849b;

    /* JADX INFO: renamed from: a */
    public final C16905q1 f64850a;

    static {
        AbstractC16878h1 c16872f1;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            c16872f1 = new C16875g1();
        } else {
            c16872f1 = i13 >= 29 ? new C16872f1() : new C16869e1();
        }
        f64849b = c16872f1.mo47495b().f64864a.mo47549a().f64864a.mo47542b().f64864a.mo47543c();
    }

    public C16899o1(C16905q1 c16905q1) {
        this.f64850a = c16905q1;
    }

    /* JADX INFO: renamed from: a */
    public C16905q1 mo47549a() {
        return this.f64850a;
    }

    /* JADX INFO: renamed from: b */
    public C16905q1 mo47542b() {
        return this.f64850a;
    }

    /* JADX INFO: renamed from: c */
    public C16905q1 mo47543c() {
        return this.f64850a;
    }

    /* JADX INFO: renamed from: d */
    public void mo47528d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo47529e(C16905q1 c16905q1) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16899o1)) {
            return false;
        }
        C16899o1 c16899o1 = (C16899o1) obj;
        return mo47534p() == c16899o1.mo47534p() && mo47545o() == c16899o1.mo47545o() && Objects.equals(mo47532l(), c16899o1.mo47532l()) && Objects.equals(mo47544j(), c16899o1.mo47544j()) && Objects.equals(mo47550f(), c16899o1.mo47550f());
    }

    /* JADX INFO: renamed from: f */
    public C16876h mo47550f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public C35643b mo47530g(int i13) {
        return C35643b.f151448e;
    }

    /* JADX INFO: renamed from: h */
    public C35643b mo47531h(int i13) {
        if ((i13 & 8) == 0) {
            return C35643b.f151448e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo47534p()), Boolean.valueOf(mo47545o()), mo47532l(), mo47544j(), mo47550f());
    }

    /* JADX INFO: renamed from: i */
    public C35643b mo47557i() {
        return mo47532l();
    }

    /* JADX INFO: renamed from: j */
    public C35643b mo47544j() {
        return C35643b.f151448e;
    }

    /* JADX INFO: renamed from: k */
    public C35643b mo47558k() {
        return mo47532l();
    }

    /* JADX INFO: renamed from: l */
    public C35643b mo47532l() {
        return C35643b.f151448e;
    }

    /* JADX INFO: renamed from: m */
    public C35643b mo47559m() {
        return mo47532l();
    }

    /* JADX INFO: renamed from: n */
    public C16905q1 mo47533n(int i13, int i14, int i15, int i16) {
        return f64849b;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo47545o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo47534p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo47535q(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo47536r(C35643b[] c35643bArr) {
    }

    /* JADX INFO: renamed from: s */
    public void mo47537s(C35643b c35643b) {
    }

    /* JADX INFO: renamed from: t */
    public void mo47538t(C16905q1 c16905q1) {
    }

    /* JADX INFO: renamed from: u */
    public void mo47546u(C35643b c35643b) {
    }
}
