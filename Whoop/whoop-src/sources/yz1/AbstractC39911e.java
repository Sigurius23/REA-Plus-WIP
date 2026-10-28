package yz1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagStyle;
import h02.C16565c0;
import h02.C16567d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yz1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;", "Lh02/c0;", "a", "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;", "Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;", "Lh02/d0;", "b", "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagModel;)Lh02/d0;", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39911e {
    /* JADX INFO: renamed from: a */
    public static final C16565c0 m128058a(ProductImageGalleryModel productImageGalleryModel) {
        AbstractC22676k.m65750j(productImageGalleryModel, "<this>");
        List<String> images = productImageGalleryModel.getImages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(images, 10));
        Iterator<T> it = images.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
        }
        ProductImageGalleryTagModel productTag = productImageGalleryModel.getProductTag();
        return new C16565c0(arrayList, productTag != null ? m128059b(productTag) : null, null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C16567d0 m128059b(ProductImageGalleryTagModel productImageGalleryTagModel) {
        AbstractC22676k.m65750j(productImageGalleryTagModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(productImageGalleryTagModel.getText());
        ProductImageGalleryTagStyle style = productImageGalleryTagModel.getStyle();
        if (style == null) {
            style = ProductImageGalleryTagStyle.DEFAULT;
        }
        return new C16567d0(textResourceM21278l, style);
    }
}
