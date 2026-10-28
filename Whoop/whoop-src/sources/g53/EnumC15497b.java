package g53;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15497b {

    /* JADX INFO: renamed from: w */
    public static final EnumC15497b f58164w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15497b f58165x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15497b f58166y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15497b[] f58167z;

    static {
        EnumC15497b enumC15497b = new EnumC15497b("INITIAL_CONNECTION", 0);
        f58164w = enumC15497b;
        EnumC15497b enumC15497b2 = new EnumC15497b("AUTOMATIC_RECONNECTION", 1);
        f58165x = enumC15497b2;
        EnumC15497b enumC15497b3 = new EnumC15497b("FORCE_RECONNECTION", 2);
        f58166y = enumC15497b3;
        EnumC15497b[] enumC15497bArr = {enumC15497b, enumC15497b2, enumC15497b3};
        f58167z = enumC15497bArr;
        AbstractC15751g.m44468u(enumC15497bArr);
    }

    public static EnumC15497b valueOf(String str) {
        return (EnumC15497b) Enum.valueOf(EnumC15497b.class, str);
    }

    public static EnumC15497b[] values() {
        return (EnumC15497b[]) f58167z.clone();
    }
}
