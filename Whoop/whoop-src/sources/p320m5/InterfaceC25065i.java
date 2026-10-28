package p320m5;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m5.i */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC25065i {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, AbstractC25058b abstractC25058b, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g interfaceC25063g);

    void onGetCredential(Context context, C25070n c25070n, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g interfaceC25063g);
}
