package lg3;

import p012ab.C0682h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lg3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC24049k implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public static final EnumC24049k f95044w;

    /* JADX INFO: renamed from: x */
    public static final EnumC24049k f95045x;

    /* JADX INFO: renamed from: y */
    public static final EnumC24049k f95046y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC24049k[] f95047z;

    static {
        EnumC24049k enumC24049k = new EnumC24049k("SENSITIVE", 0);
        f95044w = enumC24049k;
        EnumC24049k enumC24049k2 = new EnumC24049k("INSENSITIVE", 1);
        f95045x = enumC24049k2;
        EnumC24049k enumC24049k3 = new EnumC24049k("STRICT", 2);
        EnumC24049k enumC24049k4 = new EnumC24049k("LENIENT", 3);
        f95046y = enumC24049k4;
        f95047z = new EnumC24049k[]{enumC24049k, enumC24049k2, enumC24049k3, enumC24049k4};
    }

    public static EnumC24049k valueOf(String str) {
        return (EnumC24049k) Enum.valueOf(EnumC24049k.class, str);
    }

    public static EnumC24049k[] values() {
        return (EnumC24049k[]) f95047z.clone();
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c24055q.f95068b = true;
            return i13;
        }
        if (iOrdinal == 1) {
            c24055q.f95068b = false;
            return i13;
        }
        if (iOrdinal == 2) {
            c24055q.f95069c = true;
            return i13;
        }
        if (iOrdinal != 3) {
            return i13;
        }
        c24055q.f95069c = false;
        return i13;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
