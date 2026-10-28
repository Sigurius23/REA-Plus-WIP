package p583wh;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: wh.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37297c extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC4339a f159455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4339a f159456b;

    public C37297c(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f159455a = interfaceC4339a;
        this.f159456b = interfaceC4339a2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        InterfaceC4339a interfaceC4339a = this.f159456b;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        InterfaceC4339a interfaceC4339a = this.f159455a;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }
}
