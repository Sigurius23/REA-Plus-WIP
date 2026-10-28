package p560vs;

import com.google.crypto.tink.shaded.protobuf.InterfaceC5188z;

/* JADX INFO: renamed from: vs.d2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC36336d2 implements InterfaceC5188z {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f155732w;

    EnumC36336d2(int i13) {
        this.f155732w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36336d2 m116203a(int i13) {
        if (i13 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i13 == 2) {
            return NIST_P256;
        }
        if (i13 == 3) {
            return NIST_P384;
        }
        if (i13 == 4) {
            return NIST_P521;
        }
        if (i13 != 5) {
            return null;
        }
        return CURVE25519;
    }

    /* JADX INFO: renamed from: b */
    public final int m116204b() {
        if (this != UNRECOGNIZED) {
            return this.f155732w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
