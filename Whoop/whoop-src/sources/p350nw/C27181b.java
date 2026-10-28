package p350nw;

import gw.C16250a;
import java.math.BigInteger;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p558vp.AbstractC36259c;
import p628xw.AbstractC38674d;
import p628xw.C38672b;
import se.AbstractC32411b;

/* JADX INFO: renamed from: nw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27181b extends AbstractC27183d {

    /* JADX INFO: renamed from: S */
    public static final Set f108794S = Collections.unmodifiableSet(new HashSet(Arrays.asList(C27180a.f108790y, C27180a.f108791z, C27180a.f108784F, C27180a.f108785G)));

    /* JADX INFO: renamed from: O */
    public final C27180a f108795O;

    /* JADX INFO: renamed from: P */
    public final C38672b f108796P;

    /* JADX INFO: renamed from: Q */
    public final C38672b f108797Q;

    /* JADX INFO: renamed from: R */
    public final C38672b f108798R;

    public C27181b(C27180a c27180a, C38672b c38672b, C38672b c38672b2, C27188i c27188i, Set set, C16250a c16250a, String str, URI uri, C38672b c38672b3, C38672b c38672b4, List list, Date date, Date date2, Date date3, C27186g c27186g) {
        super(C27187h.f108832x, c27188i, set, c16250a, str, uri, c38672b3, c38672b4, list, date, date2, date3, c27186g);
        Objects.requireNonNull(c27180a, "The curve must not be null");
        this.f108795O = c27180a;
        Objects.requireNonNull(c38672b, "The x coordinate must not be null");
        this.f108796P = c38672b;
        Objects.requireNonNull(c38672b2, "The y coordinate must not be null");
        this.f108797Q = c38672b2;
        m81764g(c27180a, c38672b, c38672b2);
        m81768f(m81771a());
        this.f108798R = null;
    }

    /* JADX INFO: renamed from: e */
    public static C38672b m81763e(int i13, BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i14 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != iBitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i14 = 0;
            }
            int i15 = iBitLength / 8;
            int i16 = i15 - length;
            byte[] bArr = new byte[i15];
            System.arraycopy(byteArray, i14, bArr, i16, length);
            byteArray = bArr;
        }
        int i17 = (i13 + 7) / 8;
        if (byteArray.length >= i17) {
            return C38672b.m124049c(byteArray);
        }
        byte[] bArr2 = new byte[i17];
        System.arraycopy(byteArray, 0, bArr2, i17 - byteArray.length, byteArray.length);
        return C38672b.m124049c(bArr2);
    }

    /* JADX INFO: renamed from: g */
    public static void m81764g(C27180a c27180a, C38672b c38672b, C38672b c38672b2) {
        if (!f108794S.contains(c27180a)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c27180a);
        }
        BigInteger bigIntegerM124048b = c38672b.m124048b();
        BigInteger bigIntegerM124048b2 = c38672b2.m124048b();
        c27180a.getClass();
        if (AbstractC36259c.m115689f0(bigIntegerM124048b, bigIntegerM124048b2, AbstractC27182c.m81769a(c27180a))) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + c27180a + " curve");
    }

    /* JADX INFO: renamed from: h */
    public static C27181b m81765h(Map map) {
        if (!C27187h.f108832x.equals(AbstractC32411b.m101074R(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            C27180a c27180aM81762b = C27180a.m81762b((String) AbstractC38674d.m124053c(map, "crv", String.class));
            C38672b c38672bM124051a = AbstractC38674d.m124051a("x", map);
            C38672b c38672bM124051a2 = AbstractC38674d.m124051a("y", map);
            C38672b c38672bM124051a3 = AbstractC38674d.m124051a("d", map);
            try {
                return c38672bM124051a3 == null ? new C27181b(c27180aM81762b, c38672bM124051a, c38672bM124051a2, AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map)) : new C27181b(c27180aM81762b, c38672bM124051a, c38672bM124051a2, c38672bM124051a3, AbstractC32411b.m101075S(map), AbstractC32411b.m101072P(map), AbstractC32411b.m101069M(map), (String) AbstractC38674d.m124053c(map, "kid", String.class), AbstractC38674d.m124058h("x5u", map), AbstractC38674d.m124051a("x5t", map), AbstractC38674d.m124051a("x5t#S256", map), AbstractC32411b.m101077U(map), AbstractC32411b.m101070N(map), AbstractC32411b.m101076T(map), AbstractC32411b.m101071O(map), AbstractC32411b.m101073Q(map));
            } catch (Exception e5) {
                throw new ParseException(e5.getMessage(), 0);
            }
        } catch (IllegalArgumentException e13) {
            throw new ParseException(e13.getMessage(), 0);
        }
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: b */
    public final boolean mo81766b() {
        return this.f108798R != null;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: d */
    public final HashMap mo81767d() {
        HashMap mapMo81767d = super.mo81767d();
        mapMo81767d.put("crv", this.f108795O.f108792w);
        mapMo81767d.put("x", this.f108796P.f166476w);
        mapMo81767d.put("y", this.f108797Q.f166476w);
        C38672b c38672b = this.f108798R;
        if (c38672b != null) {
            mapMo81767d.put("d", c38672b.f166476w);
        }
        return mapMo81767d;
    }

    @Override // p350nw.AbstractC27183d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27181b) || !super.equals(obj)) {
            return false;
        }
        C27181b c27181b = (C27181b) obj;
        return Objects.equals(this.f108795O, c27181b.f108795O) && Objects.equals(this.f108796P, c27181b.f108796P) && Objects.equals(this.f108797Q, c27181b.f108797Q) && Objects.equals(this.f108798R, c27181b.f108798R);
    }

    /* JADX INFO: renamed from: f */
    public final void m81768f(List list) {
        if (list == null) {
            return;
        }
        boolean zEquals = false;
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) m81771a().get(0)).getPublicKey();
            if (this.f108796P.m124048b().equals(eCPublicKey.getW().getAffineX())) {
                zEquals = this.f108797Q.m124048b().equals(eCPublicKey.getW().getAffineY());
            }
        } catch (ClassCastException unused) {
        }
        if (!zEquals) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    @Override // p350nw.AbstractC27183d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f108795O, this.f108796P, this.f108797Q, this.f108798R, null);
    }

    public C27181b(C27180a c27180a, C38672b c38672b, C38672b c38672b2, C38672b c38672b3, C27188i c27188i, LinkedHashSet linkedHashSet, C16250a c16250a, String str, URI uri, C38672b c38672b4, C38672b c38672b5, LinkedList linkedList, Date date, Date date2, Date date3, C27186g c27186g) {
        super(C27187h.f108832x, c27188i, linkedHashSet, c16250a, str, uri, c38672b4, c38672b5, linkedList, date, date2, date3, c27186g);
        Objects.requireNonNull(c27180a, "The curve must not be null");
        this.f108795O = c27180a;
        Objects.requireNonNull(c38672b, "The x coordinate must not be null");
        this.f108796P = c38672b;
        Objects.requireNonNull(c38672b2, "The y coordinate must not be null");
        this.f108797Q = c38672b2;
        m81764g(c27180a, c38672b, c38672b2);
        m81768f(m81771a());
        this.f108798R = c38672b3;
    }
}
