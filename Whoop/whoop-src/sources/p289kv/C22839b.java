package p289kv;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22839b extends AppCompatImageView implements InterfaceC22838a {

    /* JADX INFO: renamed from: w */
    public C22841d f90044w;

    public int getCompassGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public Drawable getCompassImage() {
        Drawable drawable = getDrawable();
        AbstractC22676k.m65749i(drawable, "drawable");
        return drawable;
    }

    public float getCompassRotation() {
        return getRotation();
    }

    public void setCompassAlpha(float f13) {
        setAlpha(f13);
    }

    public void setCompassEnabled(boolean z4) {
        if (isEnabled() != z4) {
            setEnabled(z4);
        }
    }

    public void setCompassGravity(int i13) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i13;
    }

    public void setCompassImage(Drawable compass) {
        AbstractC22676k.m65750j(compass, "compass");
        setImageDrawable(compass);
    }

    public void setCompassRotation(float f13) {
        setRotation(f13);
    }

    public void setCompassVisible(boolean z4) {
        setVisibility(z4 ? 0 : 8);
    }
}
