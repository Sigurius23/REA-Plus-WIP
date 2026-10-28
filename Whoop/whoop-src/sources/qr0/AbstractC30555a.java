package qr0;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.DesignItemGridModel;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: qr0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/models/DesignSystemModel;", "", "cards", "d", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/DesignSystemModel;", "", "c", "(Lcom/whoop/design/models/DesignSystemModel;)Z", "isGrid", "community-highlights-container-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30555a {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final boolean m93709c(DesignSystemModel designSystemModel) {
        return DesignSystemModelKt.unwrap(designSystemModel) instanceof DesignItemGridModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final DesignSystemModel m93710d(DesignSystemModel designSystemModel, List<? extends DesignSystemModel> list) {
        DesignModelWrapper designModelWrapperCopy$default;
        if (designSystemModel instanceof DesignModelWrapper) {
            DesignModelWrapper designModelWrapper = (DesignModelWrapper) designSystemModel;
            DesignSystemModel model = designModelWrapper.getModel();
            DesignItemGridModel designItemGridModel = model instanceof DesignItemGridModel ? (DesignItemGridModel) model : null;
            return (designItemGridModel == null || (designModelWrapperCopy$default = DesignModelWrapper.copy$default(designModelWrapper, designItemGridModel.copy((255 & 1) != 0 ? designItemGridModel.id : null, (255 & 2) != 0 ? designItemGridModel.columnWidth : 0.0d, (255 & 4) != 0 ? designItemGridModel.minHorizontalSpacing : 0.0d, (255 & 8) != 0 ? designItemGridModel.minVerticalSpacing : 0.0d, (255 & 16) != 0 ? designItemGridModel.minHorizontalPadding : 0.0d, (255 & 32) != 0 ? designItemGridModel.minVerticalPadding : 0.0d, (255 & 64) != 0 ? designItemGridModel.verticalAlignment : null, (255 & 128) != 0 ? designItemGridModel.numberOfColumns : null, (255 & 256) != 0 ? designItemGridModel.items : list), null, null, null, null, 30, null)) == null) ? designModelWrapper : designModelWrapperCopy$default;
        }
        if (!(designSystemModel instanceof DesignItemGridModel)) {
            return designSystemModel;
        }
        DesignItemGridModel designItemGridModel2 = (DesignItemGridModel) designSystemModel;
        return designItemGridModel2.copy((255 & 1) != 0 ? designItemGridModel2.id : null, (255 & 2) != 0 ? designItemGridModel2.columnWidth : 0.0d, (255 & 4) != 0 ? designItemGridModel2.minHorizontalSpacing : 0.0d, (255 & 8) != 0 ? designItemGridModel2.minVerticalSpacing : 0.0d, (255 & 16) != 0 ? designItemGridModel2.minHorizontalPadding : 0.0d, (255 & 32) != 0 ? designItemGridModel2.minVerticalPadding : 0.0d, (255 & 64) != 0 ? designItemGridModel2.verticalAlignment : null, (255 & 128) != 0 ? designItemGridModel2.numberOfColumns : null, (255 & 256) != 0 ? designItemGridModel2.items : list);
    }
}
