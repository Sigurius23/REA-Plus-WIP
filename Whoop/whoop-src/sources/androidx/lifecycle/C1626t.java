package androidx.lifecycle;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1626t {
    /* JADX INFO: renamed from: a */
    public static EnumC1632v m5033a(EnumC1635w state) {
        AbstractC22676k.m65750j(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC1632v.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC1632v.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC1632v.ON_PAUSE;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC1632v m5034b(EnumC1635w state) {
        AbstractC22676k.m65750j(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC1632v.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC1632v.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC1632v.ON_RESUME;
    }
}
