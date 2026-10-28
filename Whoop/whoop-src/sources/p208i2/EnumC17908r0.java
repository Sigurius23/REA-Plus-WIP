package p208i2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i2.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17908r0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC17908r0 f69610w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC17908r0[] f69611x;

    static {
        EnumC17908r0 enumC17908r0 = new EnumC17908r0("CounterClockwise", 0);
        f69610w = enumC17908r0;
        EnumC17908r0[] enumC17908r0Arr = {enumC17908r0, new EnumC17908r0("Clockwise", 1)};
        f69611x = enumC17908r0Arr;
        AbstractC15751g.m44468u(enumC17908r0Arr);
    }

    public static EnumC17908r0 valueOf(String str) {
        return (EnumC17908r0) Enum.valueOf(EnumC17908r0.class, str);
    }

    public static EnumC17908r0[] values() {
        return (EnumC17908r0[]) f69611x.clone();
    }
}
