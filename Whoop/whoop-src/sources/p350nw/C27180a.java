package p350nw;

import gw.C16262m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: nw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27180a implements Serializable {

    /* JADX INFO: renamed from: w */
    public final String f108792w;

    /* JADX INFO: renamed from: x */
    public final String f108793x;

    /* JADX INFO: renamed from: y */
    public static final C27180a f108790y = new C27180a("P-256", "secp256r1");

    /* JADX INFO: renamed from: z */
    public static final C27180a f108791z = new C27180a("secp256k1", "secp256k1");

    /* JADX INFO: renamed from: E */
    public static final C27180a f108783E = new C27180a("P-256K", "secp256k1");

    /* JADX INFO: renamed from: F */
    public static final C27180a f108784F = new C27180a("P-384", "secp384r1");

    /* JADX INFO: renamed from: G */
    public static final C27180a f108785G = new C27180a("P-521", "secp521r1");

    /* JADX INFO: renamed from: H */
    public static final C27180a f108786H = new C27180a("Ed25519", "Ed25519");

    /* JADX INFO: renamed from: I */
    public static final C27180a f108787I = new C27180a("Ed448", "Ed448");

    /* JADX INFO: renamed from: J */
    public static final C27180a f108788J = new C27180a("X25519", "X25519");

    /* JADX INFO: renamed from: K */
    public static final C27180a f108789K = new C27180a("X448", "X448");

    public C27180a(String str, String str2) {
        Objects.requireNonNull(str);
        this.f108792w = str;
        this.f108793x = str2;
    }

    /* JADX INFO: renamed from: a */
    public static Set m81761a(C16262m c16262m) {
        if (C16262m.f61853I.equals(c16262m)) {
            return Collections.singleton(f108790y);
        }
        if (C16262m.f61854J.equals(c16262m)) {
            return Collections.singleton(f108791z);
        }
        if (C16262m.f61855K.equals(c16262m)) {
            return Collections.singleton(f108784F);
        }
        if (C16262m.f61856L.equals(c16262m)) {
            return Collections.singleton(f108785G);
        }
        if (C16262m.f61860P.equals(c16262m)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(f108786H, f108787I)));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C27180a m81762b(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        C27180a c27180a = f108790y;
        if (str.equals(c27180a.f108792w)) {
            return c27180a;
        }
        C27180a c27180a2 = f108783E;
        if (str.equals(c27180a2.f108792w)) {
            return c27180a2;
        }
        C27180a c27180a3 = f108791z;
        if (str.equals(c27180a3.f108792w)) {
            return c27180a3;
        }
        C27180a c27180a4 = f108784F;
        if (str.equals(c27180a4.f108792w)) {
            return c27180a4;
        }
        C27180a c27180a5 = f108785G;
        if (str.equals(c27180a5.f108792w)) {
            return c27180a5;
        }
        C27180a c27180a6 = f108786H;
        if (str.equals(c27180a6.f108792w)) {
            return c27180a6;
        }
        C27180a c27180a7 = f108787I;
        if (str.equals(c27180a7.f108792w)) {
            return c27180a7;
        }
        C27180a c27180a8 = f108788J;
        if (str.equals(c27180a8.f108792w)) {
            return c27180a8;
        }
        C27180a c27180a9 = f108789K;
        return str.equals(c27180a9.f108792w) ? c27180a9 : new C27180a(str, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27180a) {
            return this.f108792w.equals(((C27180a) obj).f108792w);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f108792w);
    }

    public final String toString() {
        return this.f108792w;
    }
}
