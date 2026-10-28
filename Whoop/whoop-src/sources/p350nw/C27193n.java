package p350nw;

import gw.C16250a;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p384ow.C28417m;
import p628xw.AbstractC38673c;
import p628xw.AbstractC38674d;
import p628xw.C38672b;

/* JADX INFO: renamed from: nw.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C27193n extends AbstractC27183d {

    /* JADX INFO: renamed from: O */
    public final C38672b f108850O;

    /* JADX INFO: renamed from: P */
    public final C38672b f108851P;

    /* JADX INFO: renamed from: Q */
    public final C38672b f108852Q;

    /* JADX INFO: renamed from: R */
    public final C38672b f108853R;

    /* JADX INFO: renamed from: S */
    public final C38672b f108854S;

    /* JADX INFO: renamed from: T */
    public final C38672b f108855T;

    /* JADX INFO: renamed from: U */
    public final C38672b f108856U;

    /* JADX INFO: renamed from: V */
    public final C38672b f108857V;

    /* JADX INFO: renamed from: W */
    public final List f108858W;

    public C27193n(C38672b c38672b, C38672b c38672b2, C38672b c38672b3, C38672b c38672b4, C38672b c38672b5, C38672b c38672b6, C38672b c38672b7, C38672b c38672b8, ArrayList arrayList, C27188i c27188i, LinkedHashSet linkedHashSet, C16250a c16250a, String str, URI uri, C38672b c38672b9, C38672b c38672b10, LinkedList linkedList, Date date, Date date2, Date date3, C27186g c27186g) {
        C38672b c38672b11;
        C38672b c38672b12;
        super(C27187h.f108833y, c27188i, linkedHashSet, c16250a, str, uri, c38672b9, c38672b10, linkedList, date, date2, date3, c27186g);
        Objects.requireNonNull(c38672b, "The modulus value must not be null");
        this.f108850O = c38672b;
        Objects.requireNonNull(c38672b2, "The public exponent value must not be null");
        this.f108851P = c38672b2;
        if (m81771a() != null) {
            boolean zEquals = false;
            try {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) m81771a().get(0)).getPublicKey();
                if (c38672b2.m124048b().equals(rSAPublicKey.getPublicExponent())) {
                    zEquals = c38672b.m124048b().equals(rSAPublicKey.getModulus());
                }
            } catch (ClassCastException unused) {
            }
            if (!zEquals) {
                throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
            }
        }
        this.f108852Q = c38672b3;
        if (c38672b4 != null && c38672b5 != null) {
            c38672b11 = c38672b7;
            if (c38672b6 != null) {
                c38672b12 = c38672b8;
                if (c38672b11 != null && c38672b12 != null) {
                    this.f108853R = c38672b4;
                    this.f108854S = c38672b5;
                    this.f108855T = c38672b6;
                    this.f108856U = c38672b11;
                    this.f108857V = c38672b12;
                    if (arrayList != null) {
                        this.f108858W = Collections.unmodifiableList(arrayList);
                        return;
                    } else {
                        this.f108858W = Collections.EMPTY_LIST;
                        return;
                    }
                }
            }
            if (c38672b4 != null && c38672b5 == null && c38672b6 == null && c38672b11 == null && c38672b12 == null && arrayList == null) {
                this.f108853R = null;
                this.f108854S = null;
                this.f108855T = null;
                this.f108856U = null;
                this.f108857V = null;
                this.f108858W = Collections.EMPTY_LIST;
                return;
            }
            if (c38672b4 == null || c38672b5 != null || c38672b6 != null || c38672b11 != null || c38672b12 != null) {
                Objects.requireNonNull(c38672b4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
                Objects.requireNonNull(c38672b5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
                Objects.requireNonNull(c38672b6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                Objects.requireNonNull(c38672b11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
            }
            this.f108853R = null;
            this.f108854S = null;
            this.f108855T = null;
            this.f108856U = null;
            this.f108857V = null;
            this.f108858W = Collections.EMPTY_LIST;
            return;
        }
        c38672b11 = c38672b7;
        c38672b12 = c38672b8;
        if (c38672b4 != null) {
        }
        if (c38672b4 == null) {
        }
        Objects.requireNonNull(c38672b4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
        Objects.requireNonNull(c38672b5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
        Objects.requireNonNull(c38672b6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
        Objects.requireNonNull(c38672b11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: b */
    public final boolean mo81766b() {
        return (this.f108852Q == null && this.f108853R == null) ? false : true;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: d */
    public final HashMap mo81767d() {
        HashMap mapMo81767d = super.mo81767d();
        mapMo81767d.put("n", this.f108850O.f166476w);
        mapMo81767d.put("e", this.f108851P.f166476w);
        C38672b c38672b = this.f108852Q;
        if (c38672b != null) {
            mapMo81767d.put("d", c38672b.f166476w);
        }
        C38672b c38672b2 = this.f108853R;
        if (c38672b2 != null) {
            mapMo81767d.put("p", c38672b2.f166476w);
        }
        C38672b c38672b3 = this.f108854S;
        if (c38672b3 != null) {
            mapMo81767d.put("q", c38672b3.f166476w);
        }
        C38672b c38672b4 = this.f108855T;
        if (c38672b4 != null) {
            mapMo81767d.put("dp", c38672b4.f166476w);
        }
        C38672b c38672b5 = this.f108856U;
        if (c38672b5 != null) {
            mapMo81767d.put("dq", c38672b5.f166476w);
        }
        C38672b c38672b6 = this.f108857V;
        if (c38672b6 != null) {
            mapMo81767d.put("qi", c38672b6.f166476w);
        }
        List<C27192m> list = this.f108858W;
        if (list != null && !list.isEmpty()) {
            int i13 = AbstractC38673c.f166477a;
            ArrayList arrayList = new ArrayList();
            for (C27192m c27192m : list) {
                C28417m c28417m = AbstractC38674d.f166478a;
                HashMap map = new HashMap();
                map.put("r", c27192m.f108847w.f166476w);
                map.put("d", c27192m.f108848x.f166476w);
                map.put("t", c27192m.f108849y.f166476w);
                arrayList.add(map);
            }
            mapMo81767d.put("oth", arrayList);
        }
        return mapMo81767d;
    }

    @Override // p350nw.AbstractC27183d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27193n) || !super.equals(obj)) {
            return false;
        }
        C27193n c27193n = (C27193n) obj;
        return Objects.equals(this.f108850O, c27193n.f108850O) && Objects.equals(this.f108851P, c27193n.f108851P) && Objects.equals(this.f108852Q, c27193n.f108852Q) && Objects.equals(this.f108853R, c27193n.f108853R) && Objects.equals(this.f108854S, c27193n.f108854S) && Objects.equals(this.f108855T, c27193n.f108855T) && Objects.equals(this.f108856U, c27193n.f108856U) && Objects.equals(this.f108857V, c27193n.f108857V) && Objects.equals(this.f108858W, c27193n.f108858W);
    }

    @Override // p350nw.AbstractC27183d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f108850O, this.f108851P, this.f108852Q, this.f108853R, this.f108854S, this.f108855T, this.f108856U, this.f108857V, this.f108858W, null);
    }
}
