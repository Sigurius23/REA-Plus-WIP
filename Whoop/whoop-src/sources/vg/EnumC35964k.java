package vg;

import ge3.AbstractC15751g;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vg.k */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC35964k {

    /* JADX INFO: renamed from: E */
    public static final EnumC35964k f153135E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC35964k[] f153136F;

    /* JADX INFO: renamed from: w */
    public static final EnumC35964k f153137w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35964k f153138x;

    /* JADX INFO: renamed from: y */
    public static final EnumC35964k f153139y;

    /* JADX INFO: renamed from: z */
    public static final EnumC35964k f153140z;

    static {
        EnumC35964k enumC35964k = new EnumC35964k("Linux", 0);
        f153137w = enumC35964k;
        EnumC35964k enumC35964k2 = new EnumC35964k("MacOs", 1);
        f153138x = enumC35964k2;
        EnumC35964k enumC35964k3 = new EnumC35964k("Windows", 2);
        f153139y = enumC35964k3;
        EnumC35964k enumC35964k4 = new EnumC35964k("Android", 3);
        f153140z = enumC35964k4;
        EnumC35964k enumC35964k5 = new EnumC35964k("Ios", 4);
        EnumC35964k enumC35964k6 = new EnumC35964k("IpadOs", 5);
        EnumC35964k enumC35964k7 = new EnumC35964k("TvOs", 6);
        EnumC35964k enumC35964k8 = new EnumC35964k("WatchOs", 7);
        EnumC35964k enumC35964k9 = new EnumC35964k("Unknown", 8);
        f153135E = enumC35964k9;
        EnumC35964k[] enumC35964kArr = {enumC35964k, enumC35964k2, enumC35964k3, enumC35964k4, enumC35964k5, enumC35964k6, enumC35964k7, enumC35964k8, enumC35964k9};
        f153136F = enumC35964kArr;
        AbstractC15751g.m44468u(enumC35964kArr);
    }

    public static EnumC35964k valueOf(String str) {
        return (EnumC35964k) Enum.valueOf(EnumC35964k.class, str);
    }

    public static EnumC35964k[] values() {
        return (EnumC35964k[]) f153136F.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 0:
                return "linux";
            case 1:
                return "macos";
            case 2:
                return "windows";
            case 3:
                return "android";
            case 4:
                return "ios";
            case 5:
                return "ipados";
            case 6:
                return "tvos";
            case 7:
                return "watchos";
            case 8:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
