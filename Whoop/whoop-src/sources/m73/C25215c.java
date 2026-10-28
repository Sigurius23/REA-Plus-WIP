package m73;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import l73.AbstractC23415f;
import n73.InterfaceC26443b;
import q73.EnumC30025d;

/* JADX INFO: renamed from: m73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C25215c extends AbstractC23415f {

    /* JADX INFO: renamed from: w */
    public final Handler f99026w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f99027x;

    public C25215c(Handler handler) {
        this.f99026w = handler;
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit) {
        EnumC30025d enumC30025d = EnumC30025d.f122538w;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f99027x) {
            return enumC30025d;
        }
        Handler handler = this.f99026w;
        RunnableC25216d runnableC25216d = new RunnableC25216d(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC25216d);
        messageObtain.obj = this;
        this.f99026w.sendMessageDelayed(messageObtain, timeUnit.toMillis(j7));
        if (!this.f99027x) {
            return runnableC25216d;
        }
        this.f99026w.removeCallbacks(runnableC25216d);
        return enumC30025d;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f99027x = true;
        this.f99026w.removeCallbacksAndMessages(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f99027x;
    }
}
