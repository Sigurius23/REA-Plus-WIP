package p196hi;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import p461rh.AbstractC31426o;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hi.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17302a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public boolean f66505w;

    /* JADX INFO: renamed from: x */
    public final ImageView f66506x;

    public C17302a(ImageView imageView) {
        this.f66506x = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m48988a() {
        Object drawable = this.f66506x.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f66505w) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48989b(InterfaceC31421j interfaceC31421j) {
        ImageView imageView = this.f66506x;
        Drawable drawableM96738b = interfaceC31421j != null ? AbstractC31426o.m96738b(interfaceC31421j, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableM96738b);
        m48988a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17302a) && AbstractC22676k.m65745e(this.f66506x, ((C17302a) obj).f66506x);
    }

    public final int hashCode() {
        return this.f66506x.hashCode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
        this.f66505w = true;
        m48988a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 interfaceC1585g0) {
        this.f66505w = false;
        m48988a();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f66506x + ')';
    }
}
