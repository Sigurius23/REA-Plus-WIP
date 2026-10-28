package p244j6;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import p185h6.AbstractC16952g;

/* JADX INFO: renamed from: j6.h */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC21363h extends AbstractC16952g implements Runnable {

    /* JADX INFO: renamed from: w */
    public final WeakReference f81711w;

    public RunnableC21363h(EditText editText) {
        this.f81711w = new WeakReference(editText);
    }

    @Override // p185h6.AbstractC16952g
    /* JADX INFO: renamed from: b */
    public final void mo47707b() {
        Handler handler;
        EditText editText = (EditText) this.f81711w.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21364i.m59958a((EditText) this.f81711w.get(), 1);
    }
}
