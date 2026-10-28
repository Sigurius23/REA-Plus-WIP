package rq0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC4967i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lrq0/q;", "Lrq0/p;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/widget/ImageView;", "imageView", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/i;", "transition", "Ll83/a0;", "b", "(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31689q implements InterfaceC31687p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Drawable drawable;

    public C31689q(Drawable drawable) {
        AbstractC22676k.m65750j(drawable, "drawable");
        this.drawable = drawable;
    }

    @Override // rq0.InterfaceC31687p
    /* JADX INFO: renamed from: b */
    public void mo98189b(ImageView imageView, Context context, AbstractC4967i transition) {
        AbstractC22676k.m65750j(imageView, "imageView");
        AbstractC22676k.m65750j(context, "context");
        imageView.setImageDrawable(this.drawable);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C31689q) && AbstractC22676k.m65745e(this.drawable, ((C31689q) other).drawable);
    }

    public int hashCode() {
        return this.drawable.hashCode();
    }

    public String toString() {
        return "TeamCreateImageAsset(drawable=" + this.drawable + ")";
    }
}
