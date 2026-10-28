package p164g2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g2.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15230b {

    /* JADX INFO: renamed from: w */
    public static final EnumC15230b f57224w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15230b f57225x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15230b f57226y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15230b[] f57227z;

    static {
        EnumC15230b enumC15230b = new EnumC15230b("None", 0);
        f57224w = enumC15230b;
        EnumC15230b enumC15230b2 = new EnumC15230b("Cancelled", 1);
        f57225x = enumC15230b2;
        EnumC15230b enumC15230b3 = new EnumC15230b("Redirected", 2);
        f57226y = enumC15230b3;
        EnumC15230b[] enumC15230bArr = {enumC15230b, enumC15230b2, enumC15230b3, new EnumC15230b("RedirectCancelled", 3)};
        f57227z = enumC15230bArr;
        AbstractC15751g.m44468u(enumC15230bArr);
    }

    public static EnumC15230b valueOf(String str) {
        return (EnumC15230b) Enum.valueOf(EnumC15230b.class, str);
    }

    public static EnumC15230b[] values() {
        return (EnumC15230b[]) f57227z.clone();
    }
}
