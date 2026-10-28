package to;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import at.C1956b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import jp.HandlerC21846d;

/* JADX INFO: renamed from: to.e */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC33969e extends HandlerC21846d {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13 = message.what;
        if (i13 != 1) {
            if (i13 == 2) {
                ((BasePendingResult) message.obj).m15603Y(Status.f20491H);
                return;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 34);
            sb4.append("Don't know how to handle message: ");
            sb4.append(i13);
            Log.wtf("BasePendingResult", sb4.toString(), new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        try {
            throw null;
        } catch (RuntimeException e5) {
            C1956b c1956b = BasePendingResult.f20504j;
            throw e5;
        }
    }
}
