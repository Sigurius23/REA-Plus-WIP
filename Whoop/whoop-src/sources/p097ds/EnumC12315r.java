package p097ds;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ds.r */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12315r implements Executor {

    /* JADX INFO: renamed from: w */
    public static final EnumC12315r f41243w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC12315r[] f41244x;

    static {
        EnumC12315r enumC12315r = new EnumC12315r("INSTANCE", 0);
        f41243w = enumC12315r;
        f41244x = new EnumC12315r[]{enumC12315r};
    }

    public static EnumC12315r valueOf(String str) {
        return (EnumC12315r) Enum.valueOf(EnumC12315r.class, str);
    }

    public static EnumC12315r[] values() {
        return (EnumC12315r[]) f41244x.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
