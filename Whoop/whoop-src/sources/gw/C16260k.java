package gw;

import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p088dc.AbstractC11895b;
import p350nw.AbstractC27183d;
import p477s2.AbstractC32072d;
import p628xw.AbstractC38674d;
import p628xw.AbstractC38676f;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C16260k extends AbstractC16252c {

    /* JADX INFO: renamed from: b0 */
    public static final Set f61829b0;

    /* JADX INFO: renamed from: O */
    public final C16255f f61830O;

    /* JADX INFO: renamed from: P */
    public final AbstractC27183d f61831P;

    /* JADX INFO: renamed from: Q */
    public final C16253d f61832Q;

    /* JADX INFO: renamed from: R */
    public final C38672b f61833R;

    /* JADX INFO: renamed from: S */
    public final C38672b f61834S;

    /* JADX INFO: renamed from: T */
    public final C38672b f61835T;

    /* JADX INFO: renamed from: U */
    public final int f61836U;

    /* JADX INFO: renamed from: V */
    public final C38672b f61837V;

    /* JADX INFO: renamed from: W */
    public final C38672b f61838W;

    /* JADX INFO: renamed from: X */
    public final String f61839X;

    /* JADX INFO: renamed from: Y */
    public final String f61840Y;

    /* JADX INFO: renamed from: Z */
    public final String f61841Z;

    /* JADX INFO: renamed from: a0 */
    public final List f61842a0;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("authTag");
        f61829b0 = Collections.unmodifiableSet(hashSet);
    }

    public C16260k(C16250a c16250a, C16255f c16255f, C16257h c16257h, String str, HashSet hashSet, URI uri, AbstractC27183d abstractC27183d, URI uri2, C38672b c38672b, C38672b c38672b2, LinkedList linkedList, String str2, AbstractC27183d abstractC27183d2, C16253d c16253d, C38672b c38672b3, C38672b c38672b4, C38672b c38672b5, int i13, C38672b c38672b6, C38672b c38672b7, String str3, String str4, String str5, List list, HashMap map, C38672b c38672b8) {
        super(c16250a, c16257h, str, hashSet, uri, abstractC27183d, uri2, c38672b, c38672b2, linkedList, str2, map, c38672b8);
        if (c16250a != null && c16250a.f61776w.equals(C16250a.f61775x.f61776w)) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (abstractC27183d2 != null && abstractC27183d2.mo81766b()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        Objects.requireNonNull(c16255f);
        this.f61830O = c16255f;
        this.f61831P = abstractC27183d2;
        this.f61832Q = c16253d;
        this.f61833R = c38672b3;
        this.f61834S = c38672b4;
        this.f61835T = c38672b5;
        this.f61836U = i13;
        this.f61837V = c38672b6;
        this.f61838W = c38672b7;
        this.f61839X = str3;
        this.f61840Y = str4;
        this.f61841Z = str5;
        this.f61842a0 = list;
    }

    /* JADX INFO: renamed from: c */
    public static C16260k m46080c(C38672b c38672b) throws ParseException {
        Map mapM124059i = AbstractC38674d.m124059i(20000, new String(c38672b.m124047a(), AbstractC38676f.f166480a));
        String strM124056f = AbstractC38674d.m124056f("enc", mapM124059i);
        C16255f c16255f = C16255f.f61802z;
        if (!strM124056f.equals(c16255f.f61776w)) {
            c16255f = C16255f.f61794E;
            if (!strM124056f.equals(c16255f.f61776w)) {
                c16255f = C16255f.f61795F;
                if (!strM124056f.equals(c16255f.f61776w)) {
                    c16255f = C16255f.f61798I;
                    if (!strM124056f.equals(c16255f.f61776w)) {
                        c16255f = C16255f.f61799J;
                        if (!strM124056f.equals(c16255f.f61776w)) {
                            c16255f = C16255f.f61800K;
                            if (!strM124056f.equals(c16255f.f61776w)) {
                                c16255f = C16255f.f61796G;
                                if (!strM124056f.equals(c16255f.f61776w)) {
                                    c16255f = C16255f.f61797H;
                                    if (!strM124056f.equals(c16255f.f61776w)) {
                                        c16255f = C16255f.f61801L;
                                        if (!strM124056f.equals(c16255f.f61776w)) {
                                            c16255f = new C16255f(strM124056f, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C16255f c16255f2 = c16255f;
        int iIntValue = 0;
        C16258i c16258iM46078a = null;
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
        AbstractC27183d abstractC27183dM81770c = null;
        C16253d c16253d = null;
        C38672b c38672bM124050d3 = null;
        C38672b c38672bM124050d4 = null;
        C38672b c38672bM124050d5 = null;
        C38672b c38672bM124050d6 = null;
        C38672b c38672bM124050d7 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List listSingletonList = null;
        HashMap map = null;
        for (String str6 : mapM124059i.keySet()) {
            if ("alg".equals(str6)) {
                c16258iM46078a = C16258i.m46078a((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("enc".equals(str6)) {
                continue;
            } else if ("typ".equals(str6)) {
                String str7 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
                if (str7 != null) {
                    c16257h = new C16257h(str7);
                }
            } else if ("cty".equals(str6)) {
                str = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
            } else if ("crit".equals(str6)) {
                List listM124057g = AbstractC38674d.m124057g(str6, mapM124059i);
                if (listM124057g != null) {
                    hashSet = new HashSet(listM124057g);
                }
            } else if ("jku".equals(str6)) {
                uriM124058h = AbstractC38674d.m124058h(str6, mapM124059i);
            } else if ("jwk".equals(str6)) {
                Map mapM124054d = AbstractC38674d.m124054d(str6, mapM124059i);
                if (mapM124054d == null) {
                    abstractC27183d = null;
                } else {
                    AbstractC27183d abstractC27183dM81770c2 = AbstractC27183d.m81770c(mapM124054d);
                    if (abstractC27183dM81770c2.mo81766b()) {
                        throw new ParseException("Non-public key in jwk header parameter", 0);
                    }
                    abstractC27183d = abstractC27183dM81770c2;
                }
                if (abstractC27183d != null && abstractC27183d.mo81766b()) {
                    throw new IllegalArgumentException("The JWK must be public");
                }
            } else if ("x5u".equals(str6)) {
                uriM124058h2 = AbstractC38674d.m124058h(str6, mapM124059i);
            } else if ("x5t".equals(str6)) {
                c38672bM124050d = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("x5t#S256".equals(str6)) {
                c38672bM124050d2 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("x5c".equals(str6)) {
                linkedListM99711u = AbstractC32072d.m99711u((List) AbstractC38674d.m124053c(mapM124059i, str6, List.class));
            } else if ("kid".equals(str6)) {
                str2 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
            } else if ("epk".equals(str6)) {
                abstractC27183dM81770c = AbstractC27183d.m81770c(AbstractC38674d.m124054d(str6, mapM124059i));
            } else if ("zip".equals(str6)) {
                String str8 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
                if (str8 != null) {
                    c16253d = new C16253d(str8);
                }
            } else if ("apu".equals(str6)) {
                c38672bM124050d3 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("apv".equals(str6)) {
                c38672bM124050d4 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("p2s".equals(str6)) {
                c38672bM124050d5 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("p2c".equals(str6)) {
                Number number = (Number) AbstractC38674d.m124053c(mapM124059i, str6, Number.class);
                if (number == null) {
                    throw new ParseException(AbstractC11895b.m31996o("JSON object member ", str6, " is missing or null"), 0);
                }
                iIntValue = number.intValue();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
                }
            } else if ("iv".equals(str6)) {
                c38672bM124050d6 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("tag".equals(str6)) {
                c38672bM124050d7 = C38672b.m124050d((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class));
            } else if ("skid".equals(str6)) {
                str3 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
            } else if ("iss".equals(str6)) {
                str4 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
            } else if ("sub".equals(str6)) {
                str5 = (String) AbstractC38674d.m124053c(mapM124059i, str6, String.class);
            } else if ("aud".equals(str6)) {
                listSingletonList = mapM124059i.get(str6) instanceof String ? Collections.singletonList((String) AbstractC38674d.m124053c(mapM124059i, str6, String.class)) : AbstractC38674d.m124057g(str6, mapM124059i);
            } else {
                Object obj = mapM124059i.get(str6);
                if (f61829b0.contains(str6)) {
                    throw new IllegalArgumentException(AbstractC11895b.m31996o("The parameter name \"", str6, "\" matches a registered name"));
                }
                if (map == null) {
                    map = new HashMap();
                }
                HashMap map2 = map;
                map2.put(str6, obj);
                map = map2;
            }
        }
        return new C16260k(c16258iM46078a, c16255f2, c16257h, str, hashSet, uriM124058h, abstractC27183d, uriM124058h2, c38672bM124050d, c38672bM124050d2, linkedListM99711u, str2, abstractC27183dM81770c, c16253d, c38672bM124050d3, c38672bM124050d4, c38672bM124050d5, iIntValue, c38672bM124050d6, c38672bM124050d7, str3, str4, str5, listSingletonList, map, c38672b);
    }

    @Override // gw.AbstractC16252c
    /* JADX INFO: renamed from: b */
    public final HashMap mo46076b() {
        HashMap mapMo46076b = super.mo46076b();
        C16255f c16255f = this.f61830O;
        if (c16255f != null) {
            mapMo46076b.put("enc", c16255f.f61776w);
        }
        AbstractC27183d abstractC27183d = this.f61831P;
        if (abstractC27183d != null) {
            mapMo46076b.put("epk", abstractC27183d.mo81767d());
        }
        C16253d c16253d = this.f61832Q;
        if (c16253d != null) {
            mapMo46076b.put("zip", c16253d.f61792w);
        }
        C38672b c38672b = this.f61833R;
        if (c38672b != null) {
            mapMo46076b.put("apu", c38672b.f166476w);
        }
        C38672b c38672b2 = this.f61834S;
        if (c38672b2 != null) {
            mapMo46076b.put("apv", c38672b2.f166476w);
        }
        C38672b c38672b3 = this.f61835T;
        if (c38672b3 != null) {
            mapMo46076b.put("p2s", c38672b3.f166476w);
        }
        int i13 = this.f61836U;
        if (i13 > 0) {
            mapMo46076b.put("p2c", Integer.valueOf(i13));
        }
        C38672b c38672b4 = this.f61837V;
        if (c38672b4 != null) {
            mapMo46076b.put("iv", c38672b4.f166476w);
        }
        C38672b c38672b5 = this.f61838W;
        if (c38672b5 != null) {
            mapMo46076b.put("tag", c38672b5.f166476w);
        }
        String str = this.f61839X;
        if (str != null) {
            mapMo46076b.put("skid", str);
        }
        String str2 = this.f61840Y;
        if (str2 != null) {
            mapMo46076b.put("iss", str2);
        }
        String str3 = this.f61841Z;
        if (str3 != null) {
            mapMo46076b.put("sub", str3);
        }
        List list = this.f61842a0;
        if (list != null) {
            if (list.size() == 1) {
                mapMo46076b.put("aud", list.get(0));
                return mapMo46076b;
            }
            if (!list.isEmpty()) {
                mapMo46076b.put("aud", list);
            }
        }
        return mapMo46076b;
    }
}
