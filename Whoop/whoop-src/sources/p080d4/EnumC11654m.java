package p080d4;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d4.m */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC11654m implements Executor {

    /* JADX INFO: renamed from: w */
    public static final EnumC11654m f37635w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC11654m[] f37636x;

    static {
        EnumC11654m enumC11654m = new EnumC11654m("INSTANCE", 0);
        f37635w = enumC11654m;
        f37636x = new EnumC11654m[]{enumC11654m};
    }

    public static EnumC11654m valueOf(String str) {
        return (EnumC11654m) Enum.valueOf(EnumC11654m.class, str);
    }

    public static EnumC11654m[] values() {
        return (EnumC11654m[]) f37636x.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
