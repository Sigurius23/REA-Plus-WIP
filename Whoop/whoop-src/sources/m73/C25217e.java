package m73;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import l73.AbstractC23415f;
import l73.AbstractC23416g;
import n73.InterfaceC26443b;
import u73.RunnableC34579a;

/* JADX INFO: renamed from: m73.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C25217e extends AbstractC23416g {

    /* JADX INFO: renamed from: a */
    public final Handler f99031a;

    public C25217e(Handler handler) {
        this.f99031a = handler;
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: a */
    public final AbstractC23415f mo67908a() {
        return new C25215c(this.f99031a);
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: b */
    public final InterfaceC26443b mo67909b(RunnableC34579a runnableC34579a) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f99031a;
        RunnableC25216d runnableC25216d = new RunnableC25216d(handler, runnableC34579a);
        handler.sendMessageDelayed(Message.obtain(handler, runnableC25216d), timeUnit.toMillis(5L));
        return runnableC25216d;
    }
}
