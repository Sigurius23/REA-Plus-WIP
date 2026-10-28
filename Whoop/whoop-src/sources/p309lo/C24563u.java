package p309lo;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: lo.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C24563u {

    /* JADX INFO: renamed from: a */
    public Message f95863a;

    /* JADX INFO: renamed from: a */
    public final void m71646a() {
        this.f95863a = null;
        ArrayList arrayList = C24564v.f95864b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m71647b() {
        Message message = this.f95863a;
        message.getClass();
        message.sendToTarget();
        m71646a();
    }
}
