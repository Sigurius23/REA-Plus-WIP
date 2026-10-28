package fg3;

import ig3.C18477c;
import ig3.InterfaceC18475a;
import io.sentry.internal.debugmeta.C20378c;
import p127ev.AbstractC13673n;

/* JADX INFO: renamed from: fg3.b */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC14474b {
    /* JADX INFO: renamed from: a */
    boolean mo41315a();

    /* JADX INFO: renamed from: b */
    boolean mo41316b();

    /* JADX INFO: renamed from: c */
    void mo41317c(String str, Object... objArr);

    /* JADX INFO: renamed from: d */
    boolean mo41318d();

    void debug(String str);

    /* JADX INFO: renamed from: e */
    boolean mo41319e();

    void error(String str);

    /* JADX INFO: renamed from: f */
    void mo41320f(String str, Object... objArr);

    /* JADX INFO: renamed from: g */
    default InterfaceC18475a mo41321g(int i13) {
        return mo41334t(i13) ? mo41327m(i13) : C18477c.f71926w;
    }

    String getName();

    /* JADX INFO: renamed from: h */
    void mo41322h(String str, Object... objArr);

    /* JADX INFO: renamed from: i */
    void mo41323i(String str, Throwable th3);

    void info(String str);

    /* JADX INFO: renamed from: j */
    void mo41324j(String str, Throwable th3);

    /* JADX INFO: renamed from: k */
    void mo41325k(String str, Throwable th3);

    /* JADX INFO: renamed from: l */
    void mo41326l(String str, Object... objArr);

    /* JADX INFO: renamed from: m */
    default InterfaceC18475a mo41327m(int i13) {
        return new C20378c(this, i13);
    }

    /* JADX INFO: renamed from: n */
    void mo41328n(String str, Throwable th3);

    /* JADX INFO: renamed from: o */
    void mo41329o(String str, Number number, Object obj);

    /* JADX INFO: renamed from: p */
    boolean mo41330p();

    /* JADX INFO: renamed from: q */
    void mo41331q(String str, Integer num, Object obj);

    /* JADX INFO: renamed from: r */
    void mo41332r(String str, Throwable th3);

    /* JADX INFO: renamed from: s */
    void mo41333s(String str);

    /* JADX INFO: renamed from: t */
    default boolean mo41334t(int i13) {
        int iM38557d = AbstractC13673n.m38557d(i13);
        if (iM38557d == 0) {
            return mo41319e();
        }
        if (iM38557d == 10) {
            return mo41316b();
        }
        if (iM38557d == 20) {
            return mo41318d();
        }
        if (iM38557d == 30) {
            return mo41315a();
        }
        if (iM38557d == 40) {
            return mo41330p();
        }
        throw new IllegalArgumentException("Level [" + AbstractC13673n.m38552D(i13) + "] not recognized.");
    }

    /* JADX INFO: renamed from: u */
    void mo41335u(String str, Object... objArr);

    /* JADX INFO: renamed from: v */
    void mo41336v(String str, Number number);

    void warn(String str);
}
