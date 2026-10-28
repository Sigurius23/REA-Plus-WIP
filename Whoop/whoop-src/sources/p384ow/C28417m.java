package p384ow;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p133f1.C13968p1;
import p440qw.AbstractC30672g;
import p440qw.C30668c;
import p440qw.C30674i;
import p536uw.AbstractC35290c;
import p563vw.C36540a;
import p596ww.C37653a;
import p596ww.C37654b;
import rw.AbstractC31869s;
import rw.C31852b;
import rw.C31853c;
import rw.C31858h;
import rw.C31859i;
import rw.C31860j;
import rw.C31866p;
import rw.C31867q;
import rw.C31868r;

/* JADX INFO: renamed from: ow.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C28417m {

    /* JADX INFO: renamed from: j */
    public static final C28413i f114613j = C28413i.f114605d;

    /* JADX INFO: renamed from: k */
    public static final C28424t f114614k = EnumC28428x.f114645w;

    /* JADX INFO: renamed from: l */
    public static final C28425u f114615l = EnumC28428x.f114646x;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f114616a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f114617b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final C13968p1 f114618c;

    /* JADX INFO: renamed from: d */
    public final C31867q f114619d;

    /* JADX INFO: renamed from: e */
    public final List f114620e;

    /* JADX INFO: renamed from: f */
    public final boolean f114621f;

    /* JADX INFO: renamed from: g */
    public final boolean f114622g;

    /* JADX INFO: renamed from: h */
    public final C28413i f114623h;

    /* JADX INFO: renamed from: i */
    public final int f114624i;

    public C28417m(C30668c c30668c, C28404a c28404a, HashMap map, boolean z4, boolean z13, C28413i c28413i, int i13, boolean z14, int i14, ArrayList arrayList, EnumC28428x enumC28428x, EnumC28428x enumC28428x2, ArrayList arrayList2) {
        C13968p1 c13968p1 = new C13968p1(map, z14, arrayList2);
        this.f114618c = c13968p1;
        this.f114621f = z4;
        this.f114622g = z13;
        this.f114623h = c28413i;
        this.f114624i = i13;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(AbstractC31869s.f132158A);
        arrayList3.add(enumC28428x == EnumC28428x.f114645w ? C31860j.f132126c : new C31858h(enumC28428x, 1));
        arrayList3.add(c30668c);
        arrayList3.addAll(arrayList);
        arrayList3.add(AbstractC31869s.f132175p);
        arrayList3.add(AbstractC31869s.f132166g);
        arrayList3.add(AbstractC31869s.f132163d);
        arrayList3.add(AbstractC31869s.f132164e);
        arrayList3.add(AbstractC31869s.f132165f);
        AbstractC28430z c28414j = i14 == 1 ? AbstractC31869s.f132170k : new C28414j(2);
        arrayList3.add(new C31868r(Long.TYPE, Long.class, c28414j));
        arrayList3.add(new C31868r(Double.TYPE, Double.class, new C28414j(0)));
        arrayList3.add(new C31868r(Float.TYPE, Float.class, new C28414j(1)));
        arrayList3.add(enumC28428x2 == EnumC28428x.f114646x ? C31859i.f132124b : new C31858h(new C31859i(enumC28428x2), 0));
        arrayList3.add(AbstractC31869s.f132167h);
        arrayList3.add(AbstractC31869s.f132168i);
        arrayList3.add(new C31867q(AtomicLong.class, new C28415k(c28414j, 0).m86145a(), 0));
        int i15 = 0;
        arrayList3.add(new C31867q(AtomicLongArray.class, new C28415k(c28414j, 1).m86145a(), i15));
        arrayList3.add(AbstractC31869s.f132169j);
        arrayList3.add(AbstractC31869s.f132171l);
        arrayList3.add(AbstractC31869s.f132176q);
        arrayList3.add(AbstractC31869s.f132177r);
        arrayList3.add(new C31867q(BigDecimal.class, AbstractC31869s.f132172m, i15));
        arrayList3.add(new C31867q(BigInteger.class, AbstractC31869s.f132173n, i15));
        arrayList3.add(new C31867q(C30674i.class, AbstractC31869s.f132174o, i15));
        arrayList3.add(AbstractC31869s.f132178s);
        arrayList3.add(AbstractC31869s.f132179t);
        arrayList3.add(AbstractC31869s.f132181v);
        arrayList3.add(AbstractC31869s.f132182w);
        arrayList3.add(AbstractC31869s.f132184y);
        arrayList3.add(AbstractC31869s.f132180u);
        arrayList3.add(AbstractC31869s.f132161b);
        arrayList3.add(C31852b.f132107e);
        arrayList3.add(AbstractC31869s.f132183x);
        if (AbstractC35290c.f150281a) {
            arrayList3.add(AbstractC35290c.f150285e);
            arrayList3.add(AbstractC35290c.f150284d);
            arrayList3.add(AbstractC35290c.f150286f);
        }
        arrayList3.add(C31852b.f132106d);
        arrayList3.add(AbstractC31869s.f132160a);
        arrayList3.add(new C31853c(c13968p1, 0));
        arrayList3.add(new C31853c(c13968p1, 1));
        C31867q c31867q = new C31867q(c13968p1);
        this.f114619d = c31867q;
        arrayList3.add(c31867q);
        arrayList3.add(AbstractC31869s.f132159B);
        arrayList3.add(new C31866p(c13968p1, c28404a, c30668c, c31867q, arrayList2));
        this.f114620e = Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static void m86134a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m86135b(String str, Type type) {
        C36540a c36540a = new C36540a(type);
        Object obj = null;
        if (str == null) {
            return null;
        }
        C37653a c37653a = new C37653a(new StringReader(str));
        int i13 = this.f114624i;
        int i14 = i13 == 0 ? 2 : i13;
        if (i14 == 0) {
            throw null;
        }
        c37653a.f161372O = i14;
        boolean z4 = true;
        if (i13 != 0) {
            if (i13 == 0) {
                throw null;
            }
            c37653a.f161372O = i13;
        } else if (i14 == 2) {
            c37653a.f161372O = 1;
        }
        try {
            try {
                try {
                    try {
                        c37653a.m121062o0();
                        z4 = false;
                        AbstractC28430z abstractC28430zM86136c = m86136c(c36540a);
                        Class cls = c36540a.f156459a;
                        Object objMo86132b = abstractC28430zM86136c.mo86132b(c37653a);
                        Class clsM94276l = AbstractC30672g.m94276l(cls);
                        if (objMo86132b != null && !clsM94276l.isInstance(objMo86132b)) {
                            throw new ClassCastException("Type adapter '" + abstractC28430zM86136c + "' returned wrong type; requested " + cls + " but got instance of " + objMo86132b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        if (i14 == 0) {
                            throw null;
                        }
                        c37653a.f161372O = i14;
                        obj = objMo86132b;
                        if (obj != null) {
                            try {
                                if (c37653a.m121062o0() != 10) {
                                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                                }
                            } catch (MalformedJsonException e5) {
                                throw new JsonSyntaxException(e5);
                            } catch (IOException e13) {
                                throw new JsonIOException(e13);
                            }
                        }
                        return obj;
                    } catch (EOFException e14) {
                        if (!z4) {
                            throw new JsonSyntaxException(e14);
                        }
                        if (i14 == 0) {
                            throw null;
                        }
                        c37653a.f161372O = i14;
                    }
                } catch (IllegalStateException e15) {
                    throw new JsonSyntaxException(e15);
                }
            } catch (IOException e16) {
                throw new JsonSyntaxException(e16);
            } catch (AssertionError e17) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e17.getMessage(), e17);
            }
        } catch (Throwable th3) {
            if (i14 == 0) {
                throw null;
            }
            c37653a.f161372O = i14;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC28430z m86136c(C36540a c36540a) {
        boolean z4;
        ConcurrentHashMap concurrentHashMap = this.f114617b;
        AbstractC28430z abstractC28430z = (AbstractC28430z) concurrentHashMap.get(c36540a);
        if (abstractC28430z != null) {
            return abstractC28430z;
        }
        ThreadLocal threadLocal = this.f114616a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            AbstractC28430z abstractC28430z2 = (AbstractC28430z) map.get(c36540a);
            if (abstractC28430z2 != null) {
                return abstractC28430z2;
            }
            z4 = false;
        }
        try {
            C28416l c28416l = new C28416l();
            AbstractC28430z abstractC28430zMo86129a = null;
            c28416l.f114612a = null;
            map.put(c36540a, c28416l);
            Iterator it = this.f114620e.iterator();
            while (it.hasNext()) {
                abstractC28430zMo86129a = ((InterfaceC28405a0) it.next()).mo86129a(this, c36540a);
                if (abstractC28430zMo86129a != null) {
                    if (c28416l.f114612a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c28416l.f114612a = abstractC28430zMo86129a;
                    map.put(c36540a, abstractC28430zMo86129a);
                    break;
                }
            }
            if (z4) {
                threadLocal.remove();
            }
            if (abstractC28430zMo86129a != null) {
                if (z4) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC28430zMo86129a;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + c36540a);
        } catch (Throwable th3) {
            if (z4) {
                threadLocal.remove();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m86137d(Map map, Class cls, C37654b c37654b) {
        AbstractC28430z abstractC28430zM86136c = m86136c(new C36540a(cls));
        int i13 = c37654b.f161383H;
        int i14 = this.f114624i;
        if (i14 != 0) {
            c37654b.m121068J(i14);
        } else if (i13 == 2) {
            c37654b.f161383H = 1;
        }
        boolean z4 = c37654b.f161384I;
        boolean z13 = c37654b.f161386K;
        c37654b.f161384I = this.f114622g;
        c37654b.f161386K = this.f114621f;
        try {
            try {
                try {
                    abstractC28430zM86136c.mo86133c(c37654b, map);
                    c37654b.m121068J(i13);
                    c37654b.f161384I = z4;
                    c37654b.f161386K = z13;
                } catch (IOException e5) {
                    throw new JsonIOException(e5);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e13.getMessage(), e13);
            }
        } catch (Throwable th3) {
            c37654b.m121068J(i13);
            c37654b.f161384I = z4;
            c37654b.f161386K = z13;
            throw th3;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f114621f + ",factories:" + this.f114620e + ",instanceCreators:" + this.f114618c + "}";
    }
}
