package io.sentry;

import aa3.C0656u0;
import hg3.AbstractC17269i;
import io.sentry.hints.InterfaceC20354a;
import io.sentry.hints.InterfaceC20357d;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20500u;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p014aj.C0928c;
import p014aj.C0929d;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.sentry.j2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20391j2 implements InterfaceC20258b0, Closeable {

    /* JADX INFO: renamed from: w */
    public final C20513q6 f76444w;

    /* JADX INFO: renamed from: x */
    public final C3632c f76445x;

    /* JADX INFO: renamed from: y */
    public final C0928c f76446y;

    /* JADX INFO: renamed from: z */
    public volatile C20398k0 f76447z = null;

    public C20391j2(C20513q6 c20513q6) {
        this.f76444w = c20513q6;
        C0929d c0929d = new C0929d(c20513q6);
        this.f76446y = new C0928c(c0929d, 15);
        this.f76445x = new C3632c(c0929d);
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: b */
    public final C20542s6 mo56027b(C20542s6 c20542s6, C20337g0 c20337g0) {
        if (c20542s6.f76875H == null) {
            c20542s6.f76875H = "java";
        }
        if (m56605m(c20542s6, c20337g0)) {
            m56604k(c20542s6);
            C20499t c20499t = this.f76444w.getSessionReplay().f77071m;
            if (c20499t != null) {
                c20542s6.f76885y = c20499t;
            }
        }
        return c20542s6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f76447z != null) {
            this.f76447z.m56611a();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        ArrayList arrayList;
        if (c20321e5.f76875H == null) {
            c20321e5.f76875H = "java";
        }
        Throwable th3 = c20321e5.f76877J;
        if (th3 != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f76446y.m2296D(th3, atomicInteger, hashSet, arrayDeque, null);
            c20321e5.f76304T = new C0656u0(new ArrayList(arrayDeque));
        }
        C20472d c20472d = c20321e5.f76881N;
        C20513q6 c20513q6 = this.f76444w;
        C20472d c20472dM56654a = C20472d.m56654a(c20472d, c20513q6);
        if (c20472dM56654a != null) {
            c20321e5.f76881N = c20472dM56654a;
        }
        Map mapMo56602a = c20513q6.getModulesLoader().mo56602a();
        if (mapMo56602a != null) {
            AbstractMap abstractMap = c20321e5.f76309Y;
            if (abstractMap == null) {
                c20321e5.f76309Y = new HashMap(mapMo56602a);
            } else {
                abstractMap.putAll(mapMo56602a);
            }
        }
        if (m56605m(c20321e5, c20337g0)) {
            m56604k(c20321e5);
            if (c20321e5.m56481e() == null) {
                ArrayList<C20500u> arrayListM56480d = c20321e5.m56480d();
                if (arrayListM56480d == null || arrayListM56480d.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (C20500u c20500u : arrayListM56480d) {
                        if (c20500u.f76796F != null && c20500u.f76801z != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c20500u.f76801z);
                        }
                    }
                }
                boolean zIsAttachThreads = c20513q6.isAttachThreads();
                boolean zMo56082c = false;
                C3632c c3632c = this.f76445x;
                if (zIsAttachThreads || InterfaceC20354a.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
                    Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = c20513q6.isAttachStacktrace();
                    if (objM56491b instanceof InterfaceC20354a) {
                        zMo56082c = ((InterfaceC20354a) objM56491b).mo56082c();
                        zIsAttachStacktrace = true;
                    }
                    c20321e5.f76303S = new C0656u0(c3632c.m11155D(Thread.getAllStackTraces(), arrayList, zMo56082c, zIsAttachStacktrace));
                } else if (c20513q6.isAttachStacktrace() && ((arrayListM56480d == null || arrayListM56480d.isEmpty()) && !InterfaceC20357d.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = c20513q6.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    c20321e5.f76303S = new C0656u0(c3632c.m11155D(map, null, false, zIsAttachStacktrace2));
                    return c20321e5;
                }
            }
        }
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        if (c20473d0.f76875H == null) {
            c20473d0.f76875H = "java";
        }
        C20472d c20472dM56654a = C20472d.m56654a(c20473d0.f76881N, this.f76444w);
        if (c20472dM56654a != null) {
            c20473d0.f76881N = c20472dM56654a;
        }
        if (m56605m(c20473d0, c20337g0)) {
            m56604k(c20473d0);
        }
        return c20473d0;
    }

    /* JADX INFO: renamed from: k */
    public final void m56604k(AbstractC20519r4 abstractC20519r4) {
        if (abstractC20519r4.f76873F == null) {
            abstractC20519r4.f76873F = this.f76444w.getRelease();
        }
        if (abstractC20519r4.f76874G == null) {
            abstractC20519r4.f76874G = this.f76444w.getEnvironment();
        }
        if (abstractC20519r4.f76878K == null) {
            abstractC20519r4.f76878K = this.f76444w.getServerName();
        }
        if (this.f76444w.isAttachServerName() && abstractC20519r4.f76878K == null) {
            if (this.f76447z == null) {
                this.f76447z = C20398k0.m56610c();
            }
            if (this.f76447z != null) {
                abstractC20519r4.f76878K = this.f76447z.m56612b();
            }
        }
        if (abstractC20519r4.f76879L == null) {
            abstractC20519r4.f76879L = this.f76444w.getDist();
        }
        if (abstractC20519r4.f76885y == null) {
            abstractC20519r4.f76885y = this.f76444w.getSdkVersion();
        }
        C20513q6 c20513q6 = this.f76444w;
        if (abstractC20519r4.f76872E == null) {
            abstractC20519r4.m56672c(new HashMap(c20513q6.getTags()));
        } else {
            for (Map.Entry<String, String> entry : c20513q6.getTags().entrySet()) {
                if (!abstractC20519r4.f76872E.containsKey(entry.getKey())) {
                    abstractC20519r4.m56671b(entry.getKey(), entry.getValue());
                }
            }
        }
        C20481h0 c20481h0 = abstractC20519r4.f76876I;
        if (c20481h0 == null) {
            c20481h0 = new C20481h0();
            abstractC20519r4.f76876I = c20481h0;
        }
        if (c20481h0.f76690z == null && this.f76444w.isSendDefaultPii()) {
            c20481h0.f76690z = "{{auto}}";
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m56605m(AbstractC20519r4 abstractC20519r4, C20337g0 c20337g0) {
        if (AbstractC17269i.m48899k0(c20337g0)) {
            return true;
        }
        this.f76444w.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC20519r4.f76883w);
        return false;
    }
}
