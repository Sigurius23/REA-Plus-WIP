package p350nw;

/* JADX INFO: renamed from: nw.e */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC27184e {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_KEY("deriveKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_BITS("deriveBits");


    /* JADX INFO: renamed from: w */
    public final String f108824w;

    EnumC27184e(String str) {
        this.f108824w = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f108824w;
    }
}
