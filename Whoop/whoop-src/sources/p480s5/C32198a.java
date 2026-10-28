package p480s5;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p320m5.InterfaceC25063g;
import p414q5.AbstractC29978b;
import p450r5.ResultReceiverC30930d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C32198a extends AbstractC29978b {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f133334i = 0;

    /* JADX INFO: renamed from: e */
    public InterfaceC25063g f133335e;

    /* JADX INFO: renamed from: f */
    public Executor f133336f;

    /* JADX INFO: renamed from: g */
    public CancellationSignal f133337g;

    /* JADX INFO: renamed from: h */
    public final ResultReceiverC30930d f133338h;

    public C32198a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f133338h = new ResultReceiverC30930d(this, new Handler(Looper.getMainLooper()), 1);
    }
}
