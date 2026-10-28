package sz;

import java.util.concurrent.Executor;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class ExecutorC33129f implements Executor {

    /* JADX INFO: renamed from: w */
    public static final ExecutorC33129f f138191w = new ExecutorC33129f();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r10) {
        AbstractC22676k.m65750j(r10, "r");
        r10.run();
    }
}
