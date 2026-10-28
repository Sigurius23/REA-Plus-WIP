package p314m;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import p627xv.C38665f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC24838f extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97281a = 0;

    /* JADX INFO: renamed from: b */
    public WeakReference f97282b;

    public /* synthetic */ HandlerC24838f() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        switch (this.f97281a) {
            case 0:
                int i13 = msg.what;
                if (i13 != -3 && i13 != -2 && i13 != -1) {
                    if (i13 == 1) {
                        ((DialogInterface) msg.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) this.f97282b.get(), msg.what);
                    break;
                }
                break;
            default:
                AbstractC22676k.m65750j(msg, "msg");
                C38665f c38665f = (C38665f) this.f97282b.get();
                if (c38665f != null) {
                    int i14 = msg.what;
                    if (i14 == 0) {
                        c38665f.invalidate();
                        break;
                    } else if (i14 == 1) {
                        Canvas canvas = c38665f.f166420L;
                        if (canvas == null) {
                            c38665f.invalidate();
                        } else {
                            c38665f.draw(canvas);
                        }
                        sendEmptyMessageDelayed(1, c38665f.getSettings().f171480P);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ HandlerC24838f(Looper looper) {
        super(looper);
    }
}
