package p560vs;

import com.google.crypto.tink.shaded.protobuf.InterfaceC5188z;

/* JADX INFO: renamed from: vs.g2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC36354g2 implements InterfaceC5188z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f155741w;

    EnumC36354g2(int i13) {
        this.f155741w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36354g2 m116263a(int i13) {
        if (i13 == 0) {
            return UNKNOWN_HASH;
        }
        if (i13 == 1) {
            return SHA1;
        }
        if (i13 == 2) {
            return SHA384;
        }
        if (i13 == 3) {
            return SHA256;
        }
        if (i13 == 4) {
            return SHA512;
        }
        if (i13 != 5) {
            return null;
        }
        return SHA224;
    }

    /* JADX INFO: renamed from: b */
    public final int m116264b() {
        if (this != UNRECOGNIZED) {
            return this.f155741w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
