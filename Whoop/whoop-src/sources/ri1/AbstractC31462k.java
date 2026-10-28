package ri1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.health.domain.models.CardSupplementalInfo;
import com.whoop.health.domain.models.DataVisHeaderModel;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.HeartScreenerStatus;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.MiniStatus;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.HeartScreenerModel;
import com.whoop.navigation.LabradorReadingModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import oi1.AbstractC27949a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ri1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\u0003\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\b\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/items/CtaTileModel;", "a", "Lcom/whoop/design/models/items/CtaTileModel;", "()Lcom/whoop/design/models/items/CtaTileModel;", "dataBehindPrefixCta", "b", "d", "offlineShepherdOnboardingPrefixCta", "c", "e", "offlineTakeNewLabradorSuffixCta", "", "Lcom/whoop/design/models/DesignSystemModel;", "Ljava/util/List;", "()Ljava/util/List;", "offlineHeartScreenerV2", "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "getOfflineTakeNewLabradorSuffixBody", "()Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "offlineTakeNewLabradorSuffixBody", "Lcom/whoop/health/domain/models/DataVisHeaderModel;", "f", "Lcom/whoop/health/domain/models/DataVisHeaderModel;", "()Lcom/whoop/health/domain/models/DataVisHeaderModel;", "offlineCardHeaderModel", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31462k {

    /* JADX INFO: renamed from: a */
    private static final CtaTileModel f129632a;

    /* JADX INFO: renamed from: b */
    private static final CtaTileModel f129633b;

    /* JADX INFO: renamed from: c */
    private static final CtaTileModel f129634c;

    /* JADX INFO: renamed from: d */
    private static final List<DesignSystemModel> f129635d;

    /* JADX INFO: renamed from: e */
    private static final DataVisualizationCardBodyModel f129636e;

    /* JADX INFO: renamed from: f */
    private static final DataVisHeaderModel f129637f;

    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC27949a.f112724c);
        TileBorderStyle tileBorderStyle = TileBorderStyle.NONE;
        f129632a = new CtaTileModel((TextResource) c8688bM21277k, (String) null, "", (String) null, (String) null, (String) null, "TINY_CHECKMARK", (TextResource) null, (String) null, "ANF_DATA_BEHIND", false, false, false, tileBorderStyle, (CtaSupplementalInfo) null, (C9598e) null, 50618, (DefaultConstructorMarker) null);
        f129633b = new CtaTileModel((TextResource) AbstractC8693b.m21277k(AbstractC27949a.f112734m), (String) null, "", (String) null, (String) null, (String) null, "TINY_CHECKMARK", (TextResource) null, (String) null, "ANF_ONBOARDING", false, false, false, TileBorderStyle.ONBOARDING, (CtaSupplementalInfo) null, (C9598e) null, 50618, (DefaultConstructorMarker) null);
        CtaTileModel ctaTileModel = new CtaTileModel((TextResource) AbstractC8693b.m21277k(AbstractC27949a.f112735n), (String) null, "", (String) null, (String) null, (String) null, "ADD", (TextResource) null, (String) null, "ECG_NEW_RECORDING", false, true, false, tileBorderStyle, (CtaSupplementalInfo) null, new C9598e(AppScreen.C9410s2.f27914w, new HeartScreenerModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), 17850, (DefaultConstructorMarker) null);
        f129634c = ctaTileModel;
        f129635d = AbstractC37056f.m118959K(new ImageVisualizationCardBodyModel(null, AbstractC8693b.m21277k(AbstractC27949a.f112725d), C25271y.f99162w, ""), new ScreenerStatusTileBodyModel(AbstractC37056f.m118958J(new HeartScreenerStatus(AbstractC8693b.m21277k(AbstractC27949a.f112728g), "LABRADOR", new MiniStatus("TINY_ELLIPSE", "NONE"))), null), new CardButtonModel((String) null, AbstractC8693b.m21277k(AbstractC27949a.f112735n), "ADD", (String) null, (String) null, "LIGHT_BACKGROUND", (String) null, new C9598e(AppScreen.C9331i3.f27672w, new LabradorReadingModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), (Action) null, (AnalyticEventModel) null, (AnyModal) null, (String) null, (String) null, (String) null, (String) null, (DismissEventModel) null, (Boolean) null, (GenericInteraction) null, (Map) null, (Map) null, 1012288, (DefaultConstructorMarker) null));
        f129636e = new DataVisualizationCardBodyModel((String) null, (String) null, (ImpactModel) null, (GraphModel) null, ctaTileModel, (CtaTileModel) null, (CardSupplementalInfo) null, 111, (DefaultConstructorMarker) null);
        f129637f = new DataVisHeaderModel(AbstractC8693b.m21277k(AbstractC27949a.f112723b), AbstractC8693b.m21277k(AbstractC27949a.f112735n), (String) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: a */
    public static final CtaTileModel m96893a() {
        return f129632a;
    }

    /* JADX INFO: renamed from: b */
    public static final DataVisHeaderModel m96894b() {
        return f129637f;
    }

    /* JADX INFO: renamed from: c */
    public static final List<DesignSystemModel> m96895c() {
        return f129635d;
    }

    /* JADX INFO: renamed from: d */
    public static final CtaTileModel m96896d() {
        return f129633b;
    }

    /* JADX INFO: renamed from: e */
    public static final CtaTileModel m96897e() {
        return f129634c;
    }
}
