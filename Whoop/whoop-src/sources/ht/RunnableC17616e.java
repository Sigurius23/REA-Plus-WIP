package ht;

import hm.C17417d;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ht.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC17616e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68327w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ScheduledExecutorServiceC17618g f68328x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Runnable f68329y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C17417d f68330z;

    public /* synthetic */ RunnableC17616e(ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g, Runnable runnable, C17417d c17417d, int i13) {
        this.f68327w = i13;
        this.f68328x = scheduledExecutorServiceC17618g;
        this.f68329y = runnable;
        this.f68330z = c17417d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68327w) {
            case 0:
                ExecutorService executorService = this.f68328x.f68335w;
                final int i13 = 0;
                final Runnable runnable = this.f68329y;
                final C17417d c17417d = this.f68330z;
                executorService.execute(new Runnable() { // from class: ht.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i13) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e5) {
                                    c17417d.m49436s(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e13) {
                                    c17417d.m49436s(e13);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                C17417d c17417d2 = c17417d;
                                try {
                                    runnable2.run();
                                    c17417d2.m49435r(null);
                                    return;
                                } catch (Exception e14) {
                                    c17417d2.m49436s(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f68328x.f68335w;
                final int i14 = 2;
                final Runnable runnable2 = this.f68329y;
                final C17417d c17417d2 = this.f68330z;
                executorService2.execute(new Runnable() { // from class: ht.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i14) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e5) {
                                    c17417d2.m49436s(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e13) {
                                    c17417d2.m49436s(e13);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                C17417d c17417d3 = c17417d2;
                                try {
                                    runnable3.run();
                                    c17417d3.m49435r(null);
                                    return;
                                } catch (Exception e14) {
                                    c17417d3.m49436s(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f68328x.f68335w;
                final int i15 = 1;
                final Runnable runnable3 = this.f68329y;
                final C17417d c17417d3 = this.f68330z;
                executorService3.execute(new Runnable() { // from class: ht.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i15) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e5) {
                                    c17417d3.m49436s(e5);
                                    throw e5;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e13) {
                                    c17417d3.m49436s(e13);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                C17417d c17417d4 = c17417d3;
                                try {
                                    runnable4.run();
                                    c17417d4.m49435r(null);
                                    return;
                                } catch (Exception e14) {
                                    c17417d4.m49436s(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
