package fi;

import a13.C0150h;
import android.view.View;
import android.widget.ImageView;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2996c2;
import bc3.C3003e1;
import hc3.AbstractC17182o;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: fi.t */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC14514t implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: E */
    public boolean f53027E;

    /* JADX INFO: renamed from: w */
    public final ImageView f53028w;

    /* JADX INFO: renamed from: x */
    public C14512r f53029x;

    /* JADX INFO: renamed from: y */
    public C2996c2 f53030y;

    /* JADX INFO: renamed from: z */
    public C14513s f53031z;

    public ViewOnAttachStateChangeListenerC14514t(ImageView imageView) {
        this.f53028w = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m41417a() {
        try {
            C2996c2 c2996c2 = this.f53030y;
            InterfaceC30057d interfaceC30057d = null;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            C3003e1 c3003e1 = C3003e1.f12012w;
            C22365e c22365e = AbstractC3050q0.f12077a;
            this.f53030y = AbstractC3006f0.m8732z(c3003e1, AbstractC17182o.f65999a.mo8825s(), null, new C0150h(this, interfaceC30057d, 12), 2);
            this.f53029x = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C14513s c14513s = this.f53031z;
        if (c14513s == null) {
            return;
        }
        this.f53027E = true;
        c14513s.f53023w.m96747a(c14513s.f53024x);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14513s c14513s = this.f53031z;
        if (c14513s != null) {
            c14513s.m41416c();
        }
    }
}
