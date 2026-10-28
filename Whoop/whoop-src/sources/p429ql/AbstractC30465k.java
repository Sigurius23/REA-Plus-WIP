package p429ql;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.whoop.android.R;
import java.util.ArrayList;
import pf.AbstractC29125c;
import pl.C29342e;
import pl.InterfaceC29339b;

/* JADX INFO: renamed from: ql.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30465k extends AbstractC30455a {

    /* JADX INFO: renamed from: x */
    public final View f125176x;

    /* JADX INFO: renamed from: y */
    public final C30464j f125177y;

    public AbstractC30465k(ImageView imageView) {
        AbstractC29125c.m88539p(imageView, "Argument must not be null");
        this.f125176x = imageView;
        this.f125177y = new C30464j(imageView);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: a */
    public final void mo15539a(InterfaceC30462h interfaceC30462h) {
        this.f125177y.f125174b.remove(interfaceC30462h);
    }

    @Override // p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: d */
    public final InterfaceC29339b mo15541d() {
        Object tag = this.f125176x.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC29339b) {
            return (InterfaceC29339b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: e */
    public void mo5839e(Drawable drawable) {
        super.mo5839e(drawable);
        C30464j c30464j = this.f125177y;
        ViewTreeObserver viewTreeObserver = c30464j.f125173a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c30464j.f125175c);
        }
        c30464j.f125175c = null;
        c30464j.f125174b.clear();
    }

    @Override // p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: f */
    public final void mo15542f(InterfaceC29339b interfaceC29339b) {
        this.f125176x.setTag(R.id.glide_custom_view_target_tag, interfaceC29339b);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: h */
    public final void mo15544h(InterfaceC30462h interfaceC30462h) throws Throwable {
        C30464j c30464j = this.f125177y;
        ArrayList arrayList = c30464j.f125174b;
        View view = c30464j.f125173a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM93222a = c30464j.m93222a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM93222a2 = c30464j.m93222a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM93222a > 0 || iM93222a == Integer.MIN_VALUE) && (iM93222a2 > 0 || iM93222a2 == Integer.MIN_VALUE)) {
            ((C29342e) interfaceC30462h).m89342l(iM93222a, iM93222a2);
            return;
        }
        if (!arrayList.contains(interfaceC30462h)) {
            arrayList.add(interfaceC30462h);
        }
        if (c30464j.f125175c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC30458d viewTreeObserverOnPreDrawListenerC30458d = new ViewTreeObserverOnPreDrawListenerC30458d(c30464j);
            c30464j.f125175c = viewTreeObserverOnPreDrawListenerC30458d;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC30458d);
        }
    }

    public final String toString() {
        return "Target for: " + this.f125176x;
    }
}
