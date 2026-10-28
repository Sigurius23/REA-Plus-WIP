package p716lb1;

import com.whoop.design.models.items.ShippingProgressBarModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33167b1;

/* JADX INFO: renamed from: lb1.k4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/ShippingProgressBarModel;", "Lsz0/b1;", "a", "(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23662k4 {
    /* JADX INFO: renamed from: a */
    public static final C33167b1 m68991a(ShippingProgressBarModel shippingProgressBarModel) {
        AbstractC22676k.m65750j(shippingProgressBarModel, "<this>");
        return new C33167b1(shippingProgressBarModel.getTitleDisplay(), (float) shippingProgressBarModel.getProgressPercentage(), shippingProgressBarModel.getLeadingSubtext(), shippingProgressBarModel.getTrailingSubtext(), shippingProgressBarModel.getIcon(), shippingProgressBarModel.getLeadingIcon(), shippingProgressBarModel.getHideProgressBar());
    }
}
