package p283kl;

import a00.C0072g;
import android.os.Handler;
import android.os.Message;
import mr.C25909o;

/* JADX INFO: renamed from: kl.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22557f implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88735w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f88736x;

    public /* synthetic */ C22557f(Object obj, int i13) {
        this.f88735w = i13;
        this.f88736x = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f88735w) {
            case 0:
                C22558g c22558g = (C22558g) this.f88736x;
                int i13 = message.what;
                if (i13 == 1) {
                    c22558g.m65292h((C22555d) message.obj);
                    return true;
                }
                if (i13 == 2) {
                    c22558g.f88740d.m15547k((C22555d) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                C0072g c0072g = (C0072g) this.f88736x;
                C25909o c25909o = (C25909o) message.obj;
                synchronized (c0072g.f223x) {
                    if (((C25909o) c0072g.f225z) == c25909o || ((C25909o) c0072g.f221E) == c25909o) {
                        c0072g.m190h(c25909o, 2);
                    }
                    break;
                }
                return true;
        }
    }
}
