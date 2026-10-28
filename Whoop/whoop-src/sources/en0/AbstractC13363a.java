package en0;

import android.os.Handler;
import androidx.lifecycle.RunnableC1605m;
import c83.AbstractC4309a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: en0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Len0/a;", "", "T", "Lc83/a;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "returnedObj", "Ll83/a0;", "d", "(Ljava/lang/Object;)V", "onComplete", "()V", "abstractData", "onNext", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "x", "Landroid/os/Handler;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13363a<T> extends AbstractC4309a {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Handler handler;

    public AbstractC13363a(Handler handler) {
        this.handler = handler;
        if (handler == null) {
            try {
                this.handler = new Handler();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m37626e(AbstractC13363a abstractC13363a, Object obj) {
        abstractC13363a.mo24775d(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo24775d(T returnedObj);

    @Override // l73.InterfaceC23413d
    public void onComplete() {
        dispose();
    }

    @Override // l73.InterfaceC23413d
    public void onError(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        dispose();
    }

    @Override // l73.InterfaceC23413d
    public void onNext(T abstractData) {
        AbstractC22676k.m65750j(abstractData, "abstractData");
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new RunnableC1605m(4, this, abstractData));
        } else {
            mo24775d(abstractData);
        }
    }
}
