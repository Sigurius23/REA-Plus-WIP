package gw;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p350nw.AbstractC27183d;
import p384ow.C28417m;
import p628xw.AbstractC38674d;
import p628xw.AbstractC38676f;
import p628xw.C38671a;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16252c implements Serializable {

    /* JADX INFO: renamed from: N */
    public static final Map f61777N = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: E */
    public final Map f61778E;

    /* JADX INFO: renamed from: F */
    public final C38672b f61779F;

    /* JADX INFO: renamed from: G */
    public final URI f61780G;

    /* JADX INFO: renamed from: H */
    public final AbstractC27183d f61781H;

    /* JADX INFO: renamed from: I */
    public final URI f61782I;

    /* JADX INFO: renamed from: J */
    public final C38672b f61783J;

    /* JADX INFO: renamed from: K */
    public final C38672b f61784K;

    /* JADX INFO: renamed from: L */
    public final List f61785L;

    /* JADX INFO: renamed from: M */
    public final String f61786M;

    /* JADX INFO: renamed from: w */
    public final C16250a f61787w;

    /* JADX INFO: renamed from: x */
    public final C16257h f61788x;

    /* JADX INFO: renamed from: y */
    public final String f61789y;

    /* JADX INFO: renamed from: z */
    public final Set f61790z;

    public AbstractC16252c(C16250a c16250a, C16257h c16257h, String str, Set set, URI uri, AbstractC27183d abstractC27183d, URI uri2, C38672b c38672b, C38672b c38672b2, List list, String str2, Map map, C38672b c38672b3) {
        this.f61787w = c16250a;
        this.f61788x = c16257h;
        this.f61789y = str;
        if (set != null) {
            this.f61790z = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.f61790z = null;
        }
        if (map != null) {
            this.f61778E = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.f61778E = f61777N;
        }
        this.f61779F = c38672b3;
        this.f61780G = uri;
        this.f61781H = abstractC27183d;
        this.f61782I = uri2;
        this.f61783J = c38672b;
        this.f61784K = c38672b2;
        if (list != null) {
            this.f61785L = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.f61785L = null;
        }
        this.f61786M = str2;
    }

    /* JADX INFO: renamed from: a */
    public final C38672b m46075a() {
        C38672b c38672b = this.f61779F;
        return c38672b == null ? C38672b.m124049c(toString().getBytes(AbstractC38676f.f166480a)) : c38672b;
    }

    /* JADX INFO: renamed from: b */
    public HashMap mo46076b() {
        C28417m c28417m = AbstractC38674d.f166478a;
        HashMap map = new HashMap();
        map.putAll(this.f61778E);
        C16250a c16250a = this.f61787w;
        if (c16250a != null) {
            map.put("alg", c16250a.f61776w);
        }
        C16257h c16257h = this.f61788x;
        if (c16257h != null) {
            map.put("typ", c16257h.f61805w);
        }
        String str = this.f61789y;
        if (str != null) {
            map.put("cty", str);
        }
        Set set = this.f61790z;
        if (set != null && !set.isEmpty()) {
            map.put("crit", new ArrayList(set));
        }
        URI uri = this.f61780G;
        if (uri != null) {
            map.put("jku", uri.toString());
        }
        AbstractC27183d abstractC27183d = this.f61781H;
        if (abstractC27183d != null) {
            map.put("jwk", abstractC27183d.mo81767d());
        }
        URI uri2 = this.f61782I;
        if (uri2 != null) {
            map.put("x5u", uri2.toString());
        }
        C38672b c38672b = this.f61783J;
        if (c38672b != null) {
            map.put("x5t", c38672b.f166476w);
        }
        C38672b c38672b2 = this.f61784K;
        if (c38672b2 != null) {
            map.put("x5t#S256", c38672b2.f166476w);
        }
        List list = this.f61785L;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C38671a) it.next()).f166476w);
            }
            map.put("x5c", arrayList);
        }
        String str2 = this.f61786M;
        if (str2 != null) {
            map.put("kid", str2);
        }
        return map;
    }

    public final String toString() {
        return AbstractC38674d.m124060j(mo46076b());
    }
}
