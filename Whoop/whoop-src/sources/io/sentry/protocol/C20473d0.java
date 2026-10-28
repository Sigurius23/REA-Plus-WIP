package io.sentry.protocol;

import aa3.C0627i1;
import ih0.AbstractC18489d0;
import io.sentry.AbstractC20519r4;
import io.sentry.C20314d7;
import io.sentry.C20323e7;
import io.sentry.C20645z6;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20473d0 extends AbstractC20519r4 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: P */
    public String f76634P;

    /* JADX INFO: renamed from: Q */
    public Double f76635Q;

    /* JADX INFO: renamed from: R */
    public Double f76636R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f76637S;

    /* JADX INFO: renamed from: T */
    public final HashMap f76638T;

    /* JADX INFO: renamed from: U */
    public C20477f0 f76639U;

    /* JADX INFO: renamed from: V */
    public ConcurrentHashMap f76640V;

    public C20473d0(ArrayList arrayList, HashMap map, C20477f0 c20477f0) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f76637S = arrayList2;
        HashMap map2 = new HashMap();
        this.f76638T = map2;
        this.f76634P = "";
        this.f76635Q = dValueOf;
        this.f76636R = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f76638T.putAll(((C20504y) it.next()).f76818L);
        }
        this.f76639U = c20477f0;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76634P != null) {
            c37199o.m119207K("transaction");
            c37199o.m119222b0(this.f76634P);
        }
        c37199o.m119207K("start_timestamp");
        c37199o.m119219Y(interfaceC20602v0, AbstractC21598x.m60649E(this.f76635Q));
        if (this.f76636R != null) {
            c37199o.m119207K("timestamp");
            c37199o.m119219Y(interfaceC20602v0, AbstractC21598x.m60649E(this.f76636R));
        }
        ArrayList arrayList = this.f76637S;
        if (!arrayList.isEmpty()) {
            c37199o.m119207K("spans");
            c37199o.m119219Y(interfaceC20602v0, arrayList);
        }
        c37199o.m119207K("type");
        c37199o.m119222b0("transaction");
        HashMap map = this.f76638T;
        if (!map.isEmpty()) {
            c37199o.m119207K("measurements");
            c37199o.m119219Y(interfaceC20602v0, map);
        }
        c37199o.m119207K("transaction_info");
        c37199o.m119219Y(interfaceC20602v0, this.f76639U);
        AbstractC29125c.m88512U(this, c37199o, interfaceC20602v0);
        ConcurrentHashMap concurrentHashMap = this.f76640V;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76640V, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20473d0(C20645z6 c20645z6) {
        super(c20645z6.f77201a);
        this.f76637S = new ArrayList();
        this.f76638T = new HashMap();
        C20314d7 c20314d7 = c20645z6.f77202b;
        this.f76635Q = Double.valueOf(c20314d7.f76274a.mo56606d() / 1.0E9d);
        this.f76636R = Double.valueOf(c20314d7.f76274a.mo56693c(c20314d7.f76275b) / 1.0E9d);
        this.f76634P = c20645z6.f77205e;
        for (C20314d7 c20314d8 : c20645z6.f77203c) {
            Boolean bool = Boolean.TRUE;
            C0627i1 c0627i1 = c20314d8.f76276c.f76324z;
            if (bool.equals(c0627i1 == null ? null : (Boolean) c0627i1.f2195b)) {
                this.f76637S.add(new C20504y(c20314d8));
            }
        }
        C20470c c20470c = this.f76884x;
        c20470c.mo56546l(c20645z6.f77216p);
        C20323e7 c20323e7 = c20314d7.f76276c;
        ConcurrentHashMap concurrentHashMap = c20314d7.f76284k;
        C20323e7 c20323e8 = new C20323e7(c20323e7.f76321w, c20323e7.f76322x, c20323e7.f76323y, c20323e7.f76310E, c20323e7.f76311F, c20323e7.f76324z, c20323e7.f76312G, c20323e7.f76314I);
        for (Map.Entry entry : c20323e7.f76313H.entrySet()) {
            m56671b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        c20323e8.f76315J.remove(str);
                    } else {
                        c20323e8.f76315J.put(str, value);
                    }
                }
            }
        }
        c20323e7.f76319N.mo1873r();
        c20470c.mo56556v(c20323e8);
        this.f76639U = new C20477f0(c20645z6.f77214n.apiName());
    }
}
