package rc0;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentButton;
import com.whoop.design.util.AbstractC8693b;
import gz0.EnumC16313m0;
import kd1.C22398j;
import oc0.EnumC27816a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: rc0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;", "Lc31/k;", "a", "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lc31/k;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31233b {
    /* JADX INFO: renamed from: a */
    public static final C3927k m96173a(ConsentButton consentButton) {
        AbstractC22676k.m65750j(consentButton, "<this>");
        EnumC27816a enumC27816aM83893a = EnumC27816a.INSTANCE.m83893a(consentButton.getClickAction());
        boolean z4 = enumC27816aM83893a == EnumC27816a.DISMISS || enumC27816aM83893a == EnumC27816a.UNKNOWN;
        return new C3927k(EnumC3920d.FILLED, AbstractC8693b.m21278l(consentButton.getText()), null, null, null, z4 ? EnumC16313m0.CHECKMARK : EnumC16313m0.ARROW_FORWARD, 0, 0, null, false, false, C22398j.f87631a.m64468e(consentButton.getColor()), null, z4 ? EnumC39333f.BRAND_BLACK : EnumC39333f.BRAND_WHITE, null, null, null, 120796, null);
    }
}
