package rq0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.u */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/widget/ImageView;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/BitmapDrawable;", "a", "(Landroid/widget/ImageView;Landroid/content/res/Resources;)Landroid/graphics/drawable/BitmapDrawable;", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31697u {
    /* JADX INFO: renamed from: a */
    public static final BitmapDrawable m98268a(ImageView imageView, Resources resources) {
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(resources, "resources");
        imageView.setDrawingCacheEnabled(true);
        imageView.invalidate();
        imageView.buildDrawingCache();
        Bitmap.Config config = imageView.getDrawingCache().getConfig();
        return new BitmapDrawable(resources, config != null ? imageView.getDrawingCache().copy(config, imageView.getDrawingCache().isMutable()) : null);
    }
}
