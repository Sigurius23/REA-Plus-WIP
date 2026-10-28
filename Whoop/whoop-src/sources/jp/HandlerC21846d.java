package jp;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: jp.d */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC21846d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC21846d(Looper looper, int i13) {
        super(looper);
        switch (i13) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
