package p048ce;

import java.util.Map;
import m83.C25272z;
import n83.C26463f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4469j {

    /* JADX INFO: renamed from: a */
    public final C26463f f17992a;

    /* JADX INFO: renamed from: b */
    public final C4467h f17993b;

    public C4469j(C26463f c26463f, C4467h source) {
        AbstractC22676k.m65750j(source, "source");
        this.f17992a = c26463f;
        this.f17993b = source;
    }

    /* JADX INFO: renamed from: a */
    public final C4470k m13961a() {
        Map mapM13962b = m13962b();
        C4467h c4467h = this.f17993b;
        C4470k c4470k = (C4470k) mapM13962b.get(c4467h.f17988a);
        return c4470k == null ? new C4470k(c4467h.f17988a, C25272z.f99163w, EnumC4471l.f17998w) : c4470k;
    }

    /* JADX INFO: renamed from: b */
    public final Map m13962b() {
        Map map = (Map) this.f17992a.get(EnumC4471l.f17998w);
        return map == null ? C25272z.f99163w : map;
    }
}
