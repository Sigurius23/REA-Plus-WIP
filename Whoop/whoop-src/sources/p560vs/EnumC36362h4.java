package p560vs;

import com.google.crypto.tink.shaded.protobuf.InterfaceC5188z;

/* JADX INFO: renamed from: vs.h4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC36362h4 implements InterfaceC5188z {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f155749w;

    EnumC36362h4(int i13) {
        this.f155749w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m116305a(int i13) {
        if (i13 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i13 == 1) {
            return TINK;
        }
        if (i13 == 2) {
            return LEGACY;
        }
        if (i13 == 3) {
            return RAW;
        }
        if (i13 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* JADX INFO: renamed from: b */
    public final int m116306b() {
        if (this != UNRECOGNIZED) {
            return this.f155749w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
