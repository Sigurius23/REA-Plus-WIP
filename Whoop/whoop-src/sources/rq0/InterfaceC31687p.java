package rq0;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC4967i;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: rq0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\b\u0000\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lrq0/p;", "", "Landroid/widget/ImageView;", "imageView", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/i;", "Landroid/graphics/drawable/Drawable;", "transition", "Ll83/a0;", "b", "(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31687p {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m98188a(InterfaceC31687p interfaceC31687p, ImageView imageView, Context context, AbstractC4967i abstractC4967i, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadIntoImageView");
        }
        if ((i13 & 4) != 0) {
            abstractC4967i = null;
        }
        interfaceC31687p.mo98189b(imageView, context, abstractC4967i);
    }

    /* JADX INFO: renamed from: b */
    void mo98189b(ImageView imageView, Context context, AbstractC4967i transition);
}
