package p607x8;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: x8.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C38062q {

    /* JADX INFO: renamed from: a */
    public Message f163024a;

    /* JADX INFO: renamed from: a */
    public final void m121875a() {
        this.f163024a = null;
        ArrayList arrayList = C38063r.f163025b;
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
    public final void m121876b() {
        Message message = this.f163024a;
        message.getClass();
        message.sendToTarget();
        m121875a();
    }
}
