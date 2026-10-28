package ht;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ht.k */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17622k implements Executor {

    /* JADX INFO: renamed from: w */
    public static final EnumC17622k f68344w;

    /* JADX INFO: renamed from: x */
    public static final Handler f68345x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC17622k[] f68346y;

    static {
        EnumC17622k enumC17622k = new EnumC17622k("INSTANCE", 0);
        f68344w = enumC17622k;
        f68346y = new EnumC17622k[]{enumC17622k};
        f68345x = new Handler(Looper.getMainLooper());
    }

    public static EnumC17622k valueOf(String str) {
        return (EnumC17622k) Enum.valueOf(EnumC17622k.class, str);
    }

    public static EnumC17622k[] values() {
        return (EnumC17622k[]) f68346y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f68345x.post(runnable);
    }
}
