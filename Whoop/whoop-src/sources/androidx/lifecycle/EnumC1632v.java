package androidx.lifecycle;

import ge3.AbstractC15751g;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1632v {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC1632v[] $VALUES;
    public static final C1626t Companion;
    public static final EnumC1632v ON_ANY;
    public static final EnumC1632v ON_CREATE;
    public static final EnumC1632v ON_DESTROY;
    public static final EnumC1632v ON_PAUSE;
    public static final EnumC1632v ON_RESUME;
    public static final EnumC1632v ON_START;
    public static final EnumC1632v ON_STOP;

    static {
        EnumC1632v enumC1632v = new EnumC1632v("ON_CREATE", 0);
        ON_CREATE = enumC1632v;
        EnumC1632v enumC1632v2 = new EnumC1632v("ON_START", 1);
        ON_START = enumC1632v2;
        EnumC1632v enumC1632v3 = new EnumC1632v("ON_RESUME", 2);
        ON_RESUME = enumC1632v3;
        EnumC1632v enumC1632v4 = new EnumC1632v("ON_PAUSE", 3);
        ON_PAUSE = enumC1632v4;
        EnumC1632v enumC1632v5 = new EnumC1632v("ON_STOP", 4);
        ON_STOP = enumC1632v5;
        EnumC1632v enumC1632v6 = new EnumC1632v("ON_DESTROY", 5);
        ON_DESTROY = enumC1632v6;
        EnumC1632v enumC1632v7 = new EnumC1632v("ON_ANY", 6);
        ON_ANY = enumC1632v7;
        EnumC1632v[] enumC1632vArr = {enumC1632v, enumC1632v2, enumC1632v3, enumC1632v4, enumC1632v5, enumC1632v6, enumC1632v7};
        $VALUES = enumC1632vArr;
        $ENTRIES = AbstractC15751g.m44468u(enumC1632vArr);
        Companion = new C1626t();
    }

    public static EnumC1632v valueOf(String str) {
        return (EnumC1632v) Enum.valueOf(EnumC1632v.class, str);
    }

    public static EnumC1632v[] values() {
        return (EnumC1632v[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC1635w m5039a() {
        switch (AbstractC1629u.f6316a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1635w.f6327y;
            case 3:
            case 4:
                return EnumC1635w.f6328z;
            case 5:
                return EnumC1635w.f6323E;
            case 6:
                return EnumC1635w.f6325w;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
