package zd3;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.C34797a;
import ud3.C34810e0;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: zd3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C40579w {

    /* JADX INFO: renamed from: a */
    public final C34797a f174768a;

    /* JADX INFO: renamed from: b */
    public final C40576t f174769b;

    /* JADX INFO: renamed from: c */
    public final C40571o f174770c;

    /* JADX INFO: renamed from: d */
    public final boolean f174771d;

    /* JADX INFO: renamed from: e */
    public final List f174772e;

    /* JADX INFO: renamed from: f */
    public int f174773f;

    /* JADX INFO: renamed from: g */
    public Object f174774g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f174775h;

    public C40579w(C34797a c34797a, C40576t routeDatabase, C40571o c40571o, boolean z4) {
        List<Proxy> listM119144k;
        AbstractC22676k.m65750j(routeDatabase, "routeDatabase");
        this.f174768a = c34797a;
        this.f174769b = routeDatabase;
        this.f174770c = c40571o;
        this.f174771d = z4;
        C25271y c25271y = C25271y.f99162w;
        this.f174772e = c25271y;
        this.f174774g = c25271y;
        this.f174775h = new ArrayList();
        C34810e0 c34810e0 = c34797a.f146519h;
        AbstractC34798a0 abstractC34798a0 = c40571o.f174705E;
        abstractC34798a0.proxySelectStart(c40571o, c34810e0);
        URI uriM109882k = c34810e0.m109882k();
        if (uriM109882k.getHost() == null) {
            listM119144k = AbstractC37174h.m119144k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c34797a.f146518g.select(uriM109882k);
            List<Proxy> list = listSelect;
            listM119144k = (list == null || list.isEmpty()) ? AbstractC37174h.m119144k(new Proxy[]{Proxy.NO_PROXY}) : AbstractC37174h.m119143j(listSelect);
        }
        this.f174772e = listM119144k;
        this.f174773f = 0;
        abstractC34798a0.proxySelectEnd(c40571o, c34810e0, listM119144k);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m131565a() {
        return this.f174773f < this.f174772e.size() || !this.f174775h.isEmpty();
    }
}
