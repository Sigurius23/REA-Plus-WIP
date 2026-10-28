package p403pp;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pp.r */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC29422r implements Executor {

    /* JADX INFO: renamed from: w */
    public static final EnumC29422r f119461w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC29422r[] f119462x;

    static {
        EnumC29422r enumC29422r = new EnumC29422r("INSTANCE", 0);
        f119461w = enumC29422r;
        f119462x = new EnumC29422r[]{enumC29422r};
    }

    public static EnumC29422r[] values() {
        return (EnumC29422r[]) f119462x.clone();
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
