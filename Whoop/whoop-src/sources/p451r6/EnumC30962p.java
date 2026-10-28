package p451r6;

import androidx.glance.appwidget.protobuf.InterfaceC1374c0;

/* JADX INFO: renamed from: r6.p */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC30962p implements InterfaceC1374c0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: w */
    public final int f127698w;

    EnumC30962p(int i13) {
        this.f127698w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m95246a() {
        if (this != UNRECOGNIZED) {
            return this.f127698w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
