package wf3;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import nf3.C26669a;
import vf3.C35953c;
import xf3.C38266c;

/* JADX INFO: renamed from: wf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C37247a {

    /* JADX INFO: renamed from: e */
    public static final C35953c f159360e = new C35953c("_");

    /* JADX INFO: renamed from: a */
    public final C26669a f159361a;

    /* JADX INFO: renamed from: b */
    public final HashSet f159362b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f159363c;

    /* JADX INFO: renamed from: d */
    public final C38266c f159364d;

    public C37247a(C26669a c26669a) {
        this.f159361a = c26669a;
        HashSet hashSet = new HashSet();
        this.f159362b = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f159363c = concurrentHashMap;
        C35953c c35953c = f159360e;
        C38266c c38266c = new C38266c(c35953c, "_", true, c26669a);
        this.f159364d = c38266c;
        hashSet.add(c35953c);
        concurrentHashMap.put("_", c38266c);
    }
}
