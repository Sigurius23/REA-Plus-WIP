package sh1;

import android.app.AppOpsManager;
import android.app.AppOpsManager$OnOpNotedCallback;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import java.util.concurrent.Executor;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sh1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lsh1/b;", "", "Landroid/app/AppOpsManager;", "appOpsManager", "Ljava/util/concurrent/Executor;", "executor", "Lsh1/a;", "metricWriter", "", "sdkInt", "<init>", "(Landroid/app/AppOpsManager;Ljava/util/concurrent/Executor;Lsh1/a;I)V", "Ll83/a0;", "b", "()V", "a", "Landroid/app/AppOpsManager;", "Ljava/util/concurrent/Executor;", "c", "Lsh1/a;", "d", "I", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32503b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppOpsManager appOpsManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32502a metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int sdkInt;

    /* JADX INFO: renamed from: sh1.b$a */
    @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"sh1/b$a", "Landroid/app/AppOpsManager$OnOpNotedCallback;", "", "op", "tag", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/app/SyncNotedAppOp;", "onNoted", "(Landroid/app/SyncNotedAppOp;)V", "onSelfNoted", "Landroid/app/AsyncNotedAppOp;", "asyncOp", "onAsyncNoted", "(Landroid/app/AsyncNotedAppOp;)V", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AppOpsManager$OnOpNotedCallback {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        private final void m101487a(String op3, String tag) {
            if (AbstractC22676k.m65745e(op3, "android:fine_location") || AbstractC22676k.m65745e(op3, "android:coarse_location")) {
                C32503b.this.metricWriter.m101484a(tag);
            }
        }

        public void onAsyncNoted(AsyncNotedAppOp asyncOp) {
            AbstractC22676k.m65750j(asyncOp, "asyncOp");
            String op3 = asyncOp.getOp();
            AbstractC22676k.m65749i(op3, "getOp(...)");
            m101487a(op3, asyncOp.getAttributionTag());
        }

        public void onNoted(SyncNotedAppOp op3) {
            AbstractC22676k.m65750j(op3, "op");
            String op4 = op3.getOp();
            AbstractC22676k.m65749i(op4, "getOp(...)");
            m101487a(op4, op3.getAttributionTag());
        }

        public void onSelfNoted(SyncNotedAppOp op3) {
            AbstractC22676k.m65750j(op3, "op");
            String op4 = op3.getOp();
            AbstractC22676k.m65749i(op4, "getOp(...)");
            m101487a(op4, op3.getAttributionTag());
        }
    }

    public C32503b(AppOpsManager appOpsManager, Executor executor, C32502a metricWriter, int i13) {
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.appOpsManager = appOpsManager;
        this.executor = executor;
        this.metricWriter = metricWriter;
        this.sdkInt = i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m101486b() {
        if (this.appOpsManager != null && this.sdkInt >= 31) {
            this.appOpsManager.setOnOpNotedCallback(this.executor, new a());
        }
    }
}
