package p350nw;

import gw.C16250a;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import p628xw.C38672b;

/* JADX INFO: renamed from: nw.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C27190k extends AbstractC27183d {

    /* JADX INFO: renamed from: T */
    public static final Set f108840T = Collections.unmodifiableSet(new HashSet(Arrays.asList(C27180a.f108786H, C27180a.f108787I, C27180a.f108788J, C27180a.f108789K)));

    /* JADX INFO: renamed from: O */
    public final C27180a f108841O;

    /* JADX INFO: renamed from: P */
    public final C38672b f108842P;

    /* JADX INFO: renamed from: Q */
    public final byte[] f108843Q;

    /* JADX INFO: renamed from: R */
    public final C38672b f108844R;

    /* JADX INFO: renamed from: S */
    public final byte[] f108845S;

    public C27190k(C27180a c27180a, C38672b c38672b, C27188i c27188i, LinkedHashSet linkedHashSet, C16250a c16250a, String str, URI uri, C38672b c38672b2, C38672b c38672b3, LinkedList linkedList, Date date, Date date2, Date date3, C27186g c27186g) {
        super(C27187h.f108831E, c27188i, linkedHashSet, c16250a, str, uri, c38672b2, c38672b3, linkedList, date, date2, date3, c27186g);
        Objects.requireNonNull(c27180a, "The curve must not be null");
        if (!f108840T.contains(c27180a)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c27180a);
        }
        this.f108841O = c27180a;
        Objects.requireNonNull(c38672b, "The x parameter must not be null");
        this.f108842P = c38672b;
        this.f108843Q = c38672b.m124047a();
        this.f108844R = null;
        this.f108845S = null;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: b */
    public final boolean mo81766b() {
        return this.f108844R != null;
    }

    @Override // p350nw.AbstractC27183d
    /* JADX INFO: renamed from: d */
    public final HashMap mo81767d() {
        HashMap mapMo81767d = super.mo81767d();
        mapMo81767d.put("crv", this.f108841O.f108792w);
        mapMo81767d.put("x", this.f108842P.f166476w);
        C38672b c38672b = this.f108844R;
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
        if (!(obj instanceof C27190k) || !super.equals(obj)) {
            return false;
        }
        C27190k c27190k = (C27190k) obj;
        return Objects.equals(this.f108841O, c27190k.f108841O) && Objects.equals(this.f108842P, c27190k.f108842P) && Arrays.equals(this.f108843Q, c27190k.f108843Q) && Objects.equals(this.f108844R, c27190k.f108844R) && Arrays.equals(this.f108845S, c27190k.f108845S);
    }

    @Override // p350nw.AbstractC27183d
    public final int hashCode() {
        return Arrays.hashCode(this.f108845S) + ((Arrays.hashCode(this.f108843Q) + (Objects.hash(Integer.valueOf(super.hashCode()), this.f108841O, this.f108842P, this.f108844R) * 31)) * 31);
    }

    public C27190k(C27180a c27180a, C38672b c38672b, C38672b c38672b2, C27188i c27188i, LinkedHashSet linkedHashSet, C16250a c16250a, String str, URI uri, C38672b c38672b3, C38672b c38672b4, LinkedList linkedList, Date date, Date date2, Date date3, C27186g c27186g) {
        super(C27187h.f108831E, c27188i, linkedHashSet, c16250a, str, uri, c38672b3, c38672b4, linkedList, date, date2, date3, c27186g);
        Objects.requireNonNull(c27180a, "The curve must not be null");
        if (f108840T.contains(c27180a)) {
            this.f108841O = c27180a;
            Objects.requireNonNull(c38672b, "The x parameter must not be null");
            this.f108842P = c38672b;
            this.f108843Q = c38672b.m124047a();
            this.f108844R = c38672b2;
            this.f108845S = c38672b2.m124047a();
            return;
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + c27180a);
    }
}
