package p100dw;

import java.util.concurrent.ThreadPoolExecutor;
import p044c5.ExecutorC4220l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dw.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12400e {

    /* JADX INFO: renamed from: a */
    public final ExecutorC4220l f41995a;

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f41996b;

    /* JADX INFO: renamed from: c */
    public final String f41997c;

    public C12400e(ExecutorC4220l executorC4220l, ThreadPoolExecutor threadPoolExecutor, String apiKey) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        this.f41995a = executorC4220l;
        this.f41996b = threadPoolExecutor;
        this.f41997c = apiKey;
    }
}
