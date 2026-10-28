package p560vs;

import com.google.crypto.tink.shaded.protobuf.InterfaceC5188z;

/* JADX INFO: renamed from: vs.l1 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC36383l1 implements InterfaceC5188z {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f155757w;

    EnumC36383l1(int i13) {
        this.f155757w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m116415a() {
        if (this != UNRECOGNIZED) {
            return this.f155757w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
