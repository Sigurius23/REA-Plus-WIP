package px0;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import java.util.Collection;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: px0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lpx0/b;", "", "<init>", "()V", "Ll83/a0;", "e", "", "c", "()Ljava/lang/String;", "line", "d", "(Ljava/lang/String;)V", "a", "Lec3/p1;", "", "b", "Lec3/p1;", "_lines", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "lines", "", "I", "screenCount", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29592b {

    /* JADX INFO: renamed from: a */
    public static final C29592b f120827a = new C29592b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC13075p1 _lines;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC13037f2 lines;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static int screenCount;

    /* JADX INFO: renamed from: e */
    public static final int f120831e;

    static {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        _lines = c13045h2M36593c;
        lines = AbstractC13091v.m36598h(c13045h2M36593c);
        screenCount = 1;
        f120831e = 8;
    }

    private C29592b() {
    }

    /* JADX INFO: renamed from: a */
    public final void m90727a() {
        screenCount = 1;
        C13045h2 c13045h2 = (C13045h2) _lines;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25271y.f99162w);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037f2 m90728b() {
        return lines;
    }

    /* JADX INFO: renamed from: c */
    public final String m90729c() {
        int i13 = screenCount + 1;
        screenCount = i13;
        return AbstractC2875y.m8295h(i13, "Screen ");
    }

    /* JADX INFO: renamed from: d */
    public final void m90730d(String line) {
        AbstractC22676k.m65750j(line, "line");
        C13045h2 c13045h2 = (C13045h2) _lines;
        List listM74156w1 = AbstractC25265s.m74156w1(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(line), (Iterable) c13045h2.getValue()), 15);
        c13045h2.getClass();
        c13045h2.m36571k(null, listM74156w1);
    }

    /* JADX INFO: renamed from: e */
    public final void m90731e() {
        screenCount = 1;
        if (((Collection) ((C13045h2) _lines).getValue()).isEmpty()) {
            return;
        }
        m90730d("--- new session ---");
    }
}
