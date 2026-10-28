package p429ql;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p464rl.InterfaceC31508c;

/* JADX INFO: renamed from: ql.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30456b extends AbstractC30465k {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f125157E;

    /* JADX INFO: renamed from: z */
    public Animatable f125158z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30456b(ImageView imageView, int i13) {
        super(imageView);
        this.f125157E = i13;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: b */
    public final void mo5838b(Object obj, InterfaceC31508c interfaceC31508c) {
        if (interfaceC31508c != null && interfaceC31508c.mo30618e(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f125158z = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f125158z = animatable;
            animatable.start();
            return;
        }
        m93220i(obj);
        if (!(obj instanceof Animatable)) {
            this.f125158z = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f125158z = animatable2;
        animatable2.start();
    }

    @Override // p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: c */
    public final void mo15540c(Drawable drawable) {
        super.mo15540c(drawable);
        m93220i(null);
        this.f125158z = null;
        ((ImageView) this.f125176x).setImageDrawable(drawable);
    }

    @Override // p429ql.AbstractC30465k, p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: e */
    public final void mo5839e(Drawable drawable) {
        super.mo5839e(drawable);
        Animatable animatable = this.f125158z;
        if (animatable != null) {
            animatable.stop();
        }
        m93220i(null);
        this.f125158z = null;
        ((ImageView) this.f125176x).setImageDrawable(drawable);
    }

    @Override // p429ql.AbstractC30455a, p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: g */
    public final void mo15543g(Drawable drawable) {
        super.mo15543g(drawable);
        m93220i(null);
        this.f125158z = null;
        ((ImageView) this.f125176x).setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: i */
    public final void m93220i(Object obj) {
        switch (this.f125157E) {
            case 0:
                ((ImageView) this.f125176x).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) this.f125176x).setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p429ql.AbstractC30455a, ml.InterfaceC25662d
    public final void onStart() {
        Animatable animatable = this.f125158z;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p429ql.AbstractC30455a, ml.InterfaceC25662d
    public final void onStop() {
        Animatable animatable = this.f125158z;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
