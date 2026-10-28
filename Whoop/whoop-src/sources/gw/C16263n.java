package gw;

import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p088dc.AbstractC11895b;
import p350nw.AbstractC27183d;
import p477s2.AbstractC32072d;
import p628xw.AbstractC38674d;
import p628xw.AbstractC38676f;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C16263n extends AbstractC16252c {

    /* JADX INFO: renamed from: P */
    public static final Set f61865P;

    /* JADX INFO: renamed from: O */
    public final boolean f61866O;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f61865P = Collections.unmodifiableSet(hashSet);
    }

    public C16263n(C16262m c16262m, C16257h c16257h, String str, Set set, URI uri, AbstractC27183d abstractC27183d, URI uri2, C38672b c38672b, C38672b c38672b2, List list, String str2, boolean z4, Map map, C38672b c38672b3) {
        super(c16262m, c16257h, str, set, uri, abstractC27183d, uri2, c38672b, c38672b2, list, str2, map, c38672b3);
        if (c16262m.f61776w.equals(C16250a.f61775x.f61776w)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.f61866O = z4;
    }

    /* JADX INFO: renamed from: c */
    public static C16263n m46084c(C38672b c38672b) throws ParseException {
        C16250a c16250aM46078a;
        Map mapM124059i = AbstractC38674d.m124059i(20000, new String(c38672b.m124047a(), AbstractC38676f.f166480a));
        String strM124056f = AbstractC38674d.m124056f("alg", mapM124059i);
        if (strM124056f == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        C16250a c16250a = C16250a.f61775x;
        if (strM124056f.equals(c16250a.f61776w)) {
            c16250aM46078a = c16250a;
        } else if (mapM124059i.containsKey("enc")) {
            c16250aM46078a = C16258i.m46078a(strM124056f);
        } else {
            C16262m c16262m = C16262m.f61863y;
            if (!strM124056f.equals(c16262m.f61776w)) {
                c16262m = C16262m.f61864z;
                if (!strM124056f.equals(c16262m.f61776w)) {
                    c16262m = C16262m.f61849E;
                    if (!strM124056f.equals(c16262m.f61776w)) {
                        c16262m = C16262m.f61850F;
                        if (!strM124056f.equals(c16262m.f61776w)) {
                            c16262m = C16262m.f61851G;
                            if (!strM124056f.equals(c16262m.f61776w)) {
                                c16262m = C16262m.f61852H;
                                if (!strM124056f.equals(c16262m.f61776w)) {
                                    c16262m = C16262m.f61853I;
                                    if (!strM124056f.equals(c16262m.f61776w)) {
                                        c16262m = C16262m.f61854J;
                                        if (!strM124056f.equals(c16262m.f61776w)) {
                                            c16262m = C16262m.f61855K;
                                            if (!strM124056f.equals(c16262m.f61776w)) {
                                                c16262m = C16262m.f61856L;
                                                if (!strM124056f.equals(c16262m.f61776w)) {
                                                    c16262m = C16262m.f61857M;
                                                    if (!strM124056f.equals(c16262m.f61776w)) {
                                                        c16262m = C16262m.f61858N;
                                                        if (!strM124056f.equals(c16262m.f61776w)) {
                                                            c16262m = C16262m.f61859O;
                                                            if (!strM124056f.equals(c16262m.f61776w)) {
                                                                c16262m = C16262m.f61860P;
                                                                if (!strM124056f.equals(c16262m.f61776w)) {
                                                                    c16262m = C16262m.f61861Q;
                                                                    if (!strM124056f.equals(c16262m.f61776w)) {
                                                                        c16262m = C16262m.f61862R;
                                                                        if (!strM124056f.equals(c16262m.f61776w)) {
                                                                            c16262m = new C16262m(strM124056f);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c16250aM46078a = c16262m;
        }
        if (!(c16250aM46078a instanceof C16262m)) {
            throw new ParseException("Not a JWS header", 0);
        }
        C16262m c16262m2 = (C16262m) c16250aM46078a;
        if (c16262m2.f61776w.equals(c16250a.f61776w)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        boolean zBooleanValue = true;
        C16257h c16257h = null;
        String str = null;
        HashSet hashSet = null;
        URI uriM124058h = null;
        AbstractC27183d abstractC27183d = null;
        URI uriM124058h2 = null;
        C38672b c38672bM124050d = null;
        C38672b c38672bM124050d2 = null;
        LinkedList linkedListM99711u = null;
        String str2 = null;
        HashMap map = null;
        for (String str3 : mapM124059i.keySet()) {
            if (!"alg".equals(str3)) {
                if ("typ".equals(str3)) {
                    String str4 = (String) AbstractC38674d.m124053c(mapM124059i, str3, String.class);
                    if (str4 != null) {
                        c16257h = new C16257h(str4);
                    }
                } else if ("cty".equals(str3)) {
                    str = (String) AbstractC38674d.m124053c(mapM124059i, str3, String.class);
                } else if ("crit".equals(str3)) {
                    List listM124057g = AbstractC38674d.m124057g(str3, mapM124059i);
                    if (listM124057g != null) {
                        hashSet = new HashSet(listM124057g);
                    }
                } else if ("jku".equals(str3)) {
                    uriM124058h = AbstractC38674d.m124058h(str3, mapM124059i);
                } else if ("jwk".equals(str3)) {
                    Map mapM124054d = AbstractC38674d.m124054d(str3, mapM124059i);
                    if (mapM124054d == null) {
                        abstractC27183d = null;
                    } else {
                        AbstractC27183d abstractC27183dM81770c = AbstractC27183d.m81770c(mapM124054d);
                        if (abstractC27183dM81770c.mo81766b()) {
                            throw new ParseException("Non-public key in jwk header parameter", 0);
                        }
                        abstractC27183d = abstractC27183dM81770c;
                    }
                    if (abstractC27183d != null && abstractC27183d.mo81766b()) {
                        throw new IllegalArgumentException("The JWK must be public");
                    }
                } else if ("x5u".equals(str3)) {
                    uriM124058h2 = AbstractC38674d.m124058h(str3, mapM124059i);
                } else if ("x5t".equals(str3)) {
                    c38672bM124050d = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str3, String.class));
                } else if ("x5t#S256".equals(str3)) {
                    c38672bM124050d2 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str3, String.class));
                } else if ("x5c".equals(str3)) {
                    linkedListM99711u = AbstractC32072d.m99711u((List) AbstractC38674d.m124053c(mapM124059i, str3, List.class));
                } else if ("kid".equals(str3)) {
                    str2 = (String) AbstractC38674d.m124053c(mapM124059i, str3, String.class);
                } else if ("b64".equals(str3)) {
                    Boolean bool = (Boolean) AbstractC38674d.m124053c(mapM124059i, str3, Boolean.class);
                    if (bool == null) {
                        throw new ParseException(AbstractC11895b.m31996o("JSON object member ", str3, " is missing or null"), 0);
                    }
                    zBooleanValue = bool.booleanValue();
                } else {
                    Object obj = mapM124059i.get(str3);
                    if (f61865P.contains(str3)) {
                        throw new IllegalArgumentException(AbstractC11895b.m31996o("The parameter name \"", str3, "\" matches a registered name"));
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    HashMap map2 = map;
                    map2.put(str3, obj);
                    map = map2;
                }
            }
        }
        return new C16263n(c16262m2, c16257h, str, hashSet, uriM124058h, abstractC27183d, uriM124058h2, c38672bM124050d, c38672bM124050d2, linkedListM99711u, str2, zBooleanValue, map, c38672b);
    }

    @Override // gw.AbstractC16252c
    /* JADX INFO: renamed from: b */
    public final HashMap mo46076b() {
        HashMap mapMo46076b = super.mo46076b();
        if (!this.f61866O) {
            mapMo46076b.put("b64", Boolean.FALSE);
        }
        return mapMo46076b;
    }
}
