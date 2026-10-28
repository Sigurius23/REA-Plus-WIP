package u00;

import g40.C15440w2;
import ge3.AbstractC15751g;
import h20.C16689l1;
import h20.EnumC16683k1;
import java.util.LinkedHashMap;
import t83.C33617b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u00.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC34376d {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ C33617b f144460E;

    /* JADX INFO: renamed from: w */
    public static final C34374b f144461w;

    /* JADX INFO: renamed from: x */
    public static final C34375c f144462x;

    /* JADX INFO: renamed from: y */
    public static final C34373a f144463y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34376d[] f144464z;

    static {
        C34374b c34374b = new C34374b();
        f144461w = c34374b;
        C34375c c34375c = new C34375c();
        f144462x = c34375c;
        C34373a c34373a = new C34373a();
        f144463y = c34373a;
        EnumC34376d[] enumC34376dArr = {c34374b, c34375c, c34373a};
        f144464z = enumC34376dArr;
        f144460E = AbstractC15751g.m44468u(enumC34376dArr);
    }

    public static EnumC34376d valueOf(String str) {
        return (EnumC34376d) Enum.valueOf(EnumC34376d.class, str);
    }

    public static EnumC34376d[] values() {
        return (EnumC34376d[]) f144464z.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract EnumC16683k1 mo108672a(C16689l1 c16689l1);

    /* JADX INFO: renamed from: b */
    public abstract C15440w2 mo108673b(LinkedHashMap linkedHashMap);
}
