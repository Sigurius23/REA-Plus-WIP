package so;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import p073cq.InterfaceC11033b;

/* JADX INFO: renamed from: so.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C32787d implements InterfaceC11033b {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ C32787d f136474w = new C32787d();

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public final Object mo11178a(Task task) throws IOException {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
