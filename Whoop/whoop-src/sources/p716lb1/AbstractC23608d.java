package p716lb1;

import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vz0.C36613b;

/* JADX INFO: renamed from: lb1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoModel", "Lvz0/b;", "a", "(Lcom/whoop/design/models/items/AdditionalInfoTextModel;)Lvz0/b;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23608d {
    /* JADX INFO: renamed from: a */
    public static final C36613b m68616a(AdditionalInfoTextModel additionalInfoModel) {
        AbstractC22676k.m65750j(additionalInfoModel, "additionalInfoModel");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(additionalInfoModel.getText());
        C9598e navigation = additionalInfoModel.getNavigation();
        String icon = additionalInfoModel.getIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (icon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        return new C36613b(textResourceM21278l, navigation, enumC16313m0);
    }
}
