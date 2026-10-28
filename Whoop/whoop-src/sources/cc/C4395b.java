package cc;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import fr.C14692c;

/* JADX INFO: renamed from: cc.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4395b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14692c f17744a;

    public C4395b(C14692c c14692c) {
        this.f17744a = c14692c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f17744a.m42126a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f17744a.m42127b(drawable);
    }
}
