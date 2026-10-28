package fi;

import android.widget.ImageView;
import bc3.C3022j0;
import bc3.InterfaceC3018i0;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: fi.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C14512r implements InterfaceC14497c {

    /* JADX INFO: renamed from: w */
    public final ImageView f53020w;

    /* JADX INFO: renamed from: x */
    public volatile C3022j0 f53021x;

    public C14512r(ImageView imageView, C3022j0 c3022j0) {
        this.f53020w = imageView;
        this.f53021x = c3022j0;
    }

    @Override // fi.InterfaceC14497c
    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        AbstractC35785b.m113379B(this.f53020w).m41417a();
    }

    @Override // fi.InterfaceC14497c
    /* JADX INFO: renamed from: g */
    public final InterfaceC3018i0 mo35233g() {
        return this.f53021x;
    }

    @Override // fi.InterfaceC14497c
    public final boolean isDisposed() {
        boolean z4;
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514tM113379B = AbstractC35785b.m113379B(this.f53020w);
        synchronized (viewOnAttachStateChangeListenerC14514tM113379B) {
            z4 = this != viewOnAttachStateChangeListenerC14514tM113379B.f53029x;
        }
        return z4;
    }
}
