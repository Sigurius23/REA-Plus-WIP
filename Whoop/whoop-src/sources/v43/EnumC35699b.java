package v43;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC35699b {

    /* JADX INFO: renamed from: w */
    public static final EnumC35699b f151897w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC35699b[] f151898x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC35699b EF0;

    static {
        EnumC35699b enumC35699b = new EnumC35699b("Local", 0);
        EnumC35699b enumC35699b2 = new EnumC35699b("Server", 1);
        f151897w = enumC35699b2;
        EnumC35699b[] enumC35699bArr = {enumC35699b, enumC35699b2};
        f151898x = enumC35699bArr;
        AbstractC15751g.m44468u(enumC35699bArr);
    }

    public static EnumC35699b valueOf(String str) {
        return (EnumC35699b) Enum.valueOf(EnumC35699b.class, str);
    }

    public static EnumC35699b[] values() {
        return (EnumC35699b[]) f151898x.clone();
    }
}
