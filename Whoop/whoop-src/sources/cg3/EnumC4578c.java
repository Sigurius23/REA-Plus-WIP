package cg3;

import com.whoop.navigation.AppScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: cg3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4578c {

    /* JADX INFO: renamed from: w */
    public static final EnumC4578c f18438w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4578c f18439x;

    /* JADX INFO: renamed from: y */
    public static final EnumC4578c f18440y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC4578c[] f18441z;

    static {
        EnumC4578c enumC4578c = new EnumC4578c(AppScreen.URLScreen.NAME, 0);
        f18438w = enumC4578c;
        EnumC4578c enumC4578c2 = new EnumC4578c("EMAIL", 1);
        f18439x = enumC4578c2;
        EnumC4578c enumC4578c3 = new EnumC4578c("WWW", 2);
        f18440y = enumC4578c3;
        f18441z = new EnumC4578c[]{enumC4578c, enumC4578c2, enumC4578c3};
    }

    public static EnumC4578c valueOf(String str) {
        return (EnumC4578c) Enum.valueOf(EnumC4578c.class, str);
    }

    public static EnumC4578c[] values() {
        return (EnumC4578c[]) f18441z.clone();
    }
}
