package p097ds;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ds.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12300c {

    /* JADX INFO: renamed from: d */
    public static final C12300c f41211d = new C12300c();

    /* JADX INFO: renamed from: a */
    public final Runnable f41212a;

    /* JADX INFO: renamed from: b */
    public final Executor f41213b;

    /* JADX INFO: renamed from: c */
    public C12300c f41214c;

    public C12300c(Runnable runnable, Executor executor) {
        this.f41212a = runnable;
        this.f41213b = executor;
    }

    public C12300c() {
        this.f41212a = null;
        this.f41213b = null;
    }
}
