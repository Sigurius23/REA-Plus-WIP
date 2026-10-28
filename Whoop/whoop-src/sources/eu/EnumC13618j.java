package eu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eu.j */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC13618j {

    /* JADX INFO: renamed from: w */
    public static final EnumC13618j f48233w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13618j f48234x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13618j f48235y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC13618j[] f48236z;

    static {
        EnumC13618j enumC13618j = new EnumC13618j("START", 0);
        f48233w = enumC13618j;
        EnumC13618j enumC13618j2 = new EnumC13618j("DRAG", 1);
        f48234x = enumC13618j2;
        EnumC13618j enumC13618j3 = new EnumC13618j("END", 2);
        f48235y = enumC13618j3;
        f48236z = new EnumC13618j[]{enumC13618j, enumC13618j2, enumC13618j3};
    }

    public static EnumC13618j valueOf(String str) {
        return (EnumC13618j) Enum.valueOf(EnumC13618j.class, str);
    }

    public static EnumC13618j[] values() {
        return (EnumC13618j[]) f48236z.clone();
    }
}
