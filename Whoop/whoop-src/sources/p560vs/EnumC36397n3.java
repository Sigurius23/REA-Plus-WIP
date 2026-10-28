package p560vs;

import com.google.crypto.tink.shaded.protobuf.InterfaceC5188z;

/* JADX INFO: renamed from: vs.n3 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC36397n3 implements InterfaceC5188z {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f155772w;

    EnumC36397n3(int i13) {
        this.f155772w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m116460a() {
        if (this != UNRECOGNIZED) {
            return this.f155772w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
