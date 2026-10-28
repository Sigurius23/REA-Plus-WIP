package ca2;

import ec3.InterfaceC13058l;
import jk0.InterfaceC21750d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ca2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lca2/f;", "", "Ljk0/d;", "strap", "", "jobTag", "Ll83/a0;", "b", "(Ljk0/d;Ljava/lang/String;)V", "", "processNow", "a", "(Ljk0/d;ZLjava/lang/String;)V", "d", "Lec3/l;", "Lts0/c;", "e", "(Ljava/lang/String;)Lec3/l;", "Ljava/lang/Runnable;", "listener", "f", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC4366f {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m13753c(InterfaceC4366f interfaceC4366f, InterfaceC21750d interfaceC21750d, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSync");
        }
        if ((i13 & 2) != 0) {
            str = "";
        }
        interfaceC4366f.mo13755b(interfaceC21750d, str);
    }

    /* JADX INFO: renamed from: a */
    void mo13754a(InterfaceC21750d strap, boolean processNow, String jobTag);

    /* JADX INFO: renamed from: b */
    void mo13755b(InterfaceC21750d strap, String jobTag);

    /* JADX INFO: renamed from: d */
    void mo13756d(InterfaceC21750d strap, String jobTag);

    /* JADX INFO: renamed from: e */
    InterfaceC13058l mo13757e(String jobTag);

    /* JADX INFO: renamed from: f */
    Runnable mo13758f(Runnable listener);
}
