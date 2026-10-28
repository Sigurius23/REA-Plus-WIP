package p350nw;

import gw.C16250a;
import java.io.Serializable;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p384ow.C28417m;
import p477s2.AbstractC32072d;
import p628xw.AbstractC38673c;
import p628xw.AbstractC38674d;
import p628xw.C38671a;
import p628xw.C38672b;
import se.AbstractC32411b;

/* JADX INFO: renamed from: nw.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27183d implements Serializable {

    /* JADX INFO: renamed from: E */
    public final String f108803E;

    /* JADX INFO: renamed from: F */
    public final URI f108804F;

    /* JADX INFO: renamed from: G */
    public final C38672b f108805G;

    /* JADX INFO: renamed from: H */
    public final C38672b f108806H;

    /* JADX INFO: renamed from: I */
    public final List f108807I;

    /* JADX INFO: renamed from: J */
    public final Date f108808J;

    /* JADX INFO: renamed from: K */
    public final Date f108809K;

    /* JADX INFO: renamed from: L */
    public final Date f108810L;

    /* JADX INFO: renamed from: M */
    public final C27186g f108811M;

    /* JADX INFO: renamed from: N */
    public final LinkedList f108812N;

    /* JADX INFO: renamed from: w */
    public final C27187h f108813w;

    /* JADX INFO: renamed from: x */
    public final C27188i f108814x;

    /* JADX INFO: renamed from: y */
    public final Set f108815y;

    /* JADX INFO: renamed from: z */
    public final C16250a f108816z;

    public AbstractC27183d(C27187h c27187h, C27188i c27188i, Set set, C16250a c16250a, String str, URI uri, C38672b c38672b, C38672b c38672b2, List list, Date date, Date date2, Date date3, C27186g c27186g) {
        Objects.requireNonNull(c27187h, "The key type \"kty\" parameter must not be null");
        this.f108813w = c27187h;
        Map map = AbstractC27189j.f108839a;
        if (c27188i != null && set != null) {
            Map map2 = AbstractC27189j.f108839a;
            if (map2.containsKey(c27188i) && !((Set) map2.get(c27188i)).containsAll(set)) {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        }
        this.f108814x = c27188i;
        this.f108815y = set;
        this.f108816z = c16250a;
        this.f108803E = str;
        this.f108804F = uri;
        this.f108805G = c38672b;
        this.f108806H = c38672b2;
        if (list != null && list.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.f108807I = list;
        try {
            this.f108812N = AbstractC32072d.m99706p(list);
            this.f108808J = date;
            this.f108809K = date2;
            this.f108810L = date3;
            this.f108811M = c27186g;
        } catch (ParseException e5) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e5.getMessage(), e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC27183d m81770c(Map map) {
        ArrayList arrayList;
        List list;
        String strM124056f = AbstractC38674d.m124056f("kty", map);
        if (strM124056f == null) {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
        C27187h c27187hM81772a = C27187h.m81772a(strM124056f);
        if (c27187hM81772a == C27187h.f108832x) {
            return C27181b.m81765h(map);
        }
        C27187h c27187h = C27187h.f108833y;
        if (c27187hM81772a != c27187h) {
            C27187h c27187h2 = C27187h.f108834z;
            if (c27187hM81772a == c27187h2) {
                if (c27187h2.equals(AbstractC32411b.m101074R(map))) {
                    try {
                        return new C27191l(AbstractC38674d.m124051a("k", map), AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map));
                    } catch (Exception e5) {
                        throw new ParseException(e5.getMessage(), 0);
                    }
                }
                throw new ParseException("The key type kty must be " + c27187h2.f108835w, 0);
            }
            C27187h c27187h3 = C27187h.f108831E;
            if (c27187hM81772a != c27187h3) {
                throw new ParseException("Unsupported key type \"kty\" parameter: " + c27187hM81772a, 0);
            }
            Set set = C27190k.f108840T;
            if (!c27187h3.equals(AbstractC32411b.m101074R(map))) {
                throw new ParseException("The key type kty must be " + c27187h3.f108835w, 0);
            }
            try {
                C27180a c27180aM81762b = C27180a.m81762b((String) AbstractC38674d.m124053c(map, "crv", String.class));
                C38672b c38672bM124051a = AbstractC38674d.m124051a("x", map);
                C38672b c38672bM124051a2 = AbstractC38674d.m124051a("d", map);
                try {
                    return c38672bM124051a2 == null ? new C27190k(c27180aM81762b, c38672bM124051a, AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map)) : new C27190k(c27180aM81762b, c38672bM124051a, c38672bM124051a2, AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map));
                } catch (Exception e13) {
                    throw new ParseException(e13.getMessage(), 0);
                }
            } catch (IllegalArgumentException e14) {
                throw new ParseException(e14.getMessage(), 0);
            }
        }
        if (!c27187h.equals(AbstractC32411b.m101074R(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        C38672b c38672bM124051a3 = AbstractC38674d.m124051a("n", map);
        C38672b c38672bM124051a4 = AbstractC38674d.m124051a("e", map);
        C38672b c38672bM124051a5 = AbstractC38674d.m124051a("d", map);
        C38672b c38672bM124051a6 = AbstractC38674d.m124051a("p", map);
        C38672b c38672bM124051a7 = AbstractC38674d.m124051a("q", map);
        C38672b c38672bM124051a8 = AbstractC38674d.m124051a("dp", map);
        String str = "dq";
        C38672b c38672bM124051a9 = AbstractC38674d.m124051a("dq", map);
        C38672b c38672bM124051a10 = AbstractC38674d.m124051a("qi", map);
        if (!map.containsKey("oth") || (list = (List) AbstractC38674d.m124053c(map, "oth", List.class)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    Map map2 = (Map) next;
                    try {
                        arrayList.add(new C27192m(AbstractC38674d.m124051a("r", map2), AbstractC38674d.m124051a(str, map2), AbstractC38674d.m124051a("t", map2)));
                    } catch (IllegalArgumentException e15) {
                        throw new ParseException(e15.getMessage(), 0);
                    }
                }
                it = it;
                str = str;
            }
        }
        try {
            return new C27193n(c38672bM124051a3, c38672bM124051a4, c38672bM124051a5, c38672bM124051a6, c38672bM124051a7, c38672bM124051a8, c38672bM124051a9, c38672bM124051a10, arrayList, AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map));
        } catch (Exception e16) {
            throw new ParseException(e16.getMessage(), 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m81771a() {
        LinkedList linkedList = this.f108812N;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo81766b();

    /* JADX INFO: renamed from: d */
    public HashMap mo81767d() {
        C28417m c28417m = AbstractC38674d.f166478a;
        HashMap map = new HashMap();
        map.put("kty", this.f108813w.f108835w);
        C27188i c27188i = this.f108814x;
        if (c27188i != null) {
            map.put("use", c27188i.f108838w);
        }
        Set set = this.f108815y;
        if (set != null) {
            int i13 = AbstractC38673c.f166477a;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC27184e) it.next()).f108824w);
            }
            map.put("key_ops", arrayList);
        }
        C16250a c16250a = this.f108816z;
        if (c16250a != null) {
            map.put("alg", c16250a.f61776w);
        }
        String str = this.f108803E;
        if (str != null) {
            map.put("kid", str);
        }
        URI uri = this.f108804F;
        if (uri != null) {
            map.put("x5u", uri.toString());
        }
        C38672b c38672b = this.f108805G;
        if (c38672b != null) {
            map.put("x5t", c38672b.f166476w);
        }
        C38672b c38672b2 = this.f108806H;
        if (c38672b2 != null) {
            map.put("x5t#S256", c38672b2.f166476w);
        }
        List list = this.f108807I;
        if (list != null) {
            int i14 = AbstractC38673c.f166477a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C38671a) it3.next()).f166476w);
            }
            map.put("x5c", arrayList2);
        }
        Date date = this.f108808J;
        if (date != null) {
            map.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.f108809K;
        if (date2 != null) {
            map.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.f108810L;
        if (date3 != null) {
            map.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        C27186g c27186g = this.f108811M;
        if (c27186g != null) {
            C28417m c28417m2 = AbstractC38674d.f166478a;
            HashMap map2 = new HashMap();
            map2.put("revoked_at", Long.valueOf(c27186g.f108829w.getTime() / 1000));
            C27185f c27185f = c27186g.f108830x;
            if (c27185f != null) {
                map2.put("reason", c27185f.f108828a);
            }
            map.put("revoked", map2);
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC27183d)) {
            return false;
        }
        AbstractC27183d abstractC27183d = (AbstractC27183d) obj;
        return Objects.equals(this.f108813w, abstractC27183d.f108813w) && Objects.equals(this.f108814x, abstractC27183d.f108814x) && Objects.equals(this.f108815y, abstractC27183d.f108815y) && Objects.equals(this.f108816z, abstractC27183d.f108816z) && Objects.equals(this.f108803E, abstractC27183d.f108803E) && Objects.equals(this.f108804F, abstractC27183d.f108804F) && Objects.equals(this.f108805G, abstractC27183d.f108805G) && Objects.equals(this.f108806H, abstractC27183d.f108806H) && Objects.equals(this.f108807I, abstractC27183d.f108807I) && Objects.equals(this.f108808J, abstractC27183d.f108808J) && Objects.equals(this.f108809K, abstractC27183d.f108809K) && Objects.equals(this.f108810L, abstractC27183d.f108810L) && Objects.equals(this.f108811M, abstractC27183d.f108811M);
    }

    public int hashCode() {
        return Objects.hash(this.f108813w, this.f108814x, this.f108815y, this.f108816z, this.f108803E, this.f108804F, this.f108805G, this.f108806H, this.f108807I, this.f108808J, this.f108809K, this.f108810L, this.f108811M, null);
    }

    public final String toString() {
        return AbstractC38674d.m124060j(mo81767d());
    }
}
