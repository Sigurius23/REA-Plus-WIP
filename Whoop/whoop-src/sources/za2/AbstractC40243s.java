package za2;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import l01.C23042n;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import p716lb1.AbstractC23748z;

/* JADX INFO: renamed from: za2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "Ll01/n;", "a", "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40243s {
    /* JADX INFO: renamed from: a */
    public static final C23042n m129245a(UpsellCardFeaturesModel upsellCardFeaturesModel) {
        AbstractC22676k.m65750j(upsellCardFeaturesModel, "<this>");
        C23042n c23042nM69724G = AbstractC23748z.m69724G(upsellCardFeaturesModel);
        CardButtonModel cardButton = upsellCardFeaturesModel.getCardButton();
        C27256h c27256hM68661k = null;
        if (cardButton != null) {
            c27256hM68661k = AbstractC23613d4.m68661k(cardButton, upsellCardFeaturesModel.getSecondCardButton() == null ? upsellCardFeaturesModel.getStyle() : null);
        }
        return C23042n.m66921b(c23042nM69724G, null, null, null, null, null, null, null, null, null, null, c27256hM68661k, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2096127, null);
    }
}
