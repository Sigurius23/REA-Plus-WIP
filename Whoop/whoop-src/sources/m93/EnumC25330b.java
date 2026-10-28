package m93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m93.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC25330b {

    /* JADX INFO: renamed from: w */
    public static final EnumC25330b f99338w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25330b f99339x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC25330b[] f99340y;

    static {
        EnumC25330b enumC25330b = new EnumC25330b("JAVA", 0);
        f99338w = enumC25330b;
        EnumC25330b enumC25330b2 = new EnumC25330b("KOTLIN", 1);
        f99339x = enumC25330b2;
        EnumC25330b[] enumC25330bArr = {enumC25330b, enumC25330b2};
        f99340y = enumC25330bArr;
        AbstractC15751g.m44468u(enumC25330bArr);
    }

    public static EnumC25330b valueOf(String str) {
        return (EnumC25330b) Enum.valueOf(EnumC25330b.class, str);
    }

    public static EnumC25330b[] values() {
        return (EnumC25330b[]) f99340y.clone();
    }
}
