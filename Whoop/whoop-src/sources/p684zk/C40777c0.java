package p684zk;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: zk.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C40777c0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((InterfaceC40801z) message.obj).mo44996a();
        return true;
    }
}
