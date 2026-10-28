package hb3;

import androidx.lifecycle.C1591h2;
import dc3.C11934s;
import java.util.Set;
import o93.AbstractC27741m;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import va3.C35845c;
import va3.C35847e;

/* JADX INFO: renamed from: hb3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C17115g {

    /* JADX INFO: renamed from: c */
    public static final Set f65723c;

    /* JADX INFO: renamed from: a */
    public final C17119i f65724a;

    /* JADX INFO: renamed from: b */
    public final C1591h2 f65725b;

    static {
        C35847e c35847eM113798i = AbstractC27741m.f111847c.m113798i();
        f65723c = AbstractC12350b.m34570S(new C35845c(c35847eM113798i.m113789b(), c35847eM113798i.f152613a.m113796g()));
    }

    public C17115g(C17119i c17119i) {
        this.f65724a = c17119i;
        this.f65725b = c17119i.f65735a.m64224c(new C11934s(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC31117e m48354a(C35845c classId, C17109d c17109d) {
        AbstractC22676k.m65750j(classId, "classId");
        return (InterfaceC31117e) this.f65725b.invoke(new C17113f(classId, c17109d));
    }
}
