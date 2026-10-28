package e63;

import a63.C0488g0;
import a63.C0490h0;
import bc3.InterfaceC3027k1;
import i63.C18166e0;
import i63.C18176o;
import i63.C18181t;
import j63.AbstractC21387d;
import java.util.Map;
import java.util.Set;
import m83.C25235a0;
import o63.C27615f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y53.AbstractC39245e;

/* JADX INFO: renamed from: e63.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12776e {

    /* JADX INFO: renamed from: a */
    public final C18166e0 f43715a;

    /* JADX INFO: renamed from: b */
    public final C18181t f43716b;

    /* JADX INFO: renamed from: c */
    public final C18176o f43717c;

    /* JADX INFO: renamed from: d */
    public final AbstractC21387d f43718d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3027k1 f43719e;

    /* JADX INFO: renamed from: f */
    public final C27615f f43720f;

    /* JADX INFO: renamed from: g */
    public final Set f43721g;

    public C12776e(C18166e0 c18166e0, C18181t method, C18176o c18176o, AbstractC21387d abstractC21387d, InterfaceC3027k1 executionContext, C27615f attributes) {
        Set setKeySet;
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(executionContext, "executionContext");
        AbstractC22676k.m65750j(attributes, "attributes");
        this.f43715a = c18166e0;
        this.f43716b = method;
        this.f43717c = c18176o;
        this.f43718d = abstractC21387d;
        this.f43719e = executionContext;
        this.f43720f = attributes;
        Map map = (Map) attributes.m83376d(AbstractC39245e.f168745a);
        this.f43721g = (map == null || (setKeySet = map.keySet()) == null) ? C25235a0.f99113w : setKeySet;
    }

    /* JADX INFO: renamed from: a */
    public final Object m35806a() {
        C0488g0 c0488g0 = C0490h0.f1652d;
        Map map = (Map) this.f43720f.m83376d(AbstractC39245e.f168745a);
        if (map != null) {
            return map.get(c0488g0);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f43715a + ", method=" + this.f43716b + ')';
    }
}
