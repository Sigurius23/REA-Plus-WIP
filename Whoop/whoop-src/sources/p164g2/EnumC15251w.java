package p164g2;

import ge3.AbstractC15751g;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g2.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15251w implements InterfaceC15250v {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC15251w[] f57270E;

    /* JADX INFO: renamed from: w */
    public static final EnumC15251w f57271w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15251w f57272x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15251w f57273y;

    /* JADX INFO: renamed from: z */
    public static final EnumC15251w f57274z;

    static {
        EnumC15251w enumC15251w = new EnumC15251w("Active", 0);
        f57271w = enumC15251w;
        EnumC15251w enumC15251w2 = new EnumC15251w("ActiveParent", 1);
        f57272x = enumC15251w2;
        EnumC15251w enumC15251w3 = new EnumC15251w("Captured", 2);
        f57273y = enumC15251w3;
        EnumC15251w enumC15251w4 = new EnumC15251w("Inactive", 3);
        f57274z = enumC15251w4;
        EnumC15251w[] enumC15251wArr = {enumC15251w, enumC15251w2, enumC15251w3, enumC15251w4};
        f57270E = enumC15251wArr;
        AbstractC15751g.m44468u(enumC15251wArr);
    }

    public static EnumC15251w valueOf(String str) {
        return (EnumC15251w) Enum.valueOf(EnumC15251w.class, str);
    }

    public static EnumC15251w[] values() {
        return (EnumC15251w[]) f57270E.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43353a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43354b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
