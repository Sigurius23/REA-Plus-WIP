package p716lb1;

import c41.C3989a4;
import c41.EnumC3996b4;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TimerMetaDataModel;
import com.whoop.design.models.tiles.OfferBannerModel;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n41.C26271b;
import n41.EnumC26272c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.c5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/models/items/TimerMetaDataModel;", "Ln41/b;", "j", "(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;", "", "displayStyle", "Ln41/c;", "k", "(Ljava/lang/String;)Ln41/c;", "expiresAt", "", "l", "(Ljava/lang/String;)J", "Lcom/whoop/design/models/tiles/OfferBannerModel;", "Lc41/a4;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;", "", "Lcom/whoop/design/models/DesignSystemModel;", "itemList", "i", "(Ljava/util/List;)Ln41/b;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "timerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23607c5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93705a = Function1.m68251a(new C23753z4(3));

    /* JADX INFO: renamed from: lb1.c5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93706w;

        public a(Function1 function1) {
            this.f93706w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93706w.invoke((TimerMetaDataModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.c5$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93707w;

        public b(Function1 function1) {
            this.f93707w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93707w.invoke((OfferBannerModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68605d() {
        return f93705a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68606e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23753z4 c23753z4 = new C23753z4(4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TimerMetaDataModel.class), new a(c23753z4));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(OfferBannerModel.class), new b(new C23753z4(5)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C26271b m68607f(TimerMetaDataModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68611j(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C3989a4 m68608g(OfferBannerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68609h(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C3989a4 m68609h(OfferBannerModel offerBannerModel) {
        EnumC3996b4 enumC3996b4;
        AbstractC22676k.m65750j(offerBannerModel, "<this>");
        String offerId = offerBannerModel.getOfferId();
        TextResource title = offerBannerModel.getTitle();
        String markdownTitle = offerBannerModel.getMarkdownTitle();
        String borderStyle = offerBannerModel.getBorderStyle();
        if (AbstractC22676k.m65745e(borderStyle, "GOLD")) {
            enumC3996b4 = EnumC3996b4.GOLD;
        } else {
            enumC3996b4 = AbstractC22676k.m65745e(borderStyle, "ONBOARDING") ? EnumC3996b4.ONBOARDING : EnumC3996b4.ONBOARDING;
        }
        EnumC3996b4 enumC3996b5 = enumC3996b4;
        TextResource subtitle = offerBannerModel.getSubtitle();
        String leadingIcon = offerBannerModel.getLeadingIcon();
        boolean showChevron = offerBannerModel.getShowChevron();
        Boolean showHighlight = offerBannerModel.getShowHighlight();
        return new C3989a4(offerId, title, markdownTitle, enumC3996b5, subtitle, leadingIcon, showChevron, showHighlight != null ? showHighlight.booleanValue() : false, m68610i(offerBannerModel.getTimerMetadata()), offerBannerModel.getNavigation());
    }

    /* JADX INFO: renamed from: i */
    public static final C26271b m68610i(List<? extends DesignSystemModel> list) {
        DesignSystemModel designSystemModel = list != null ? (DesignSystemModel) AbstractC25265s.m74100H0(list) : null;
        TimerMetaDataModel timerMetaDataModel = designSystemModel instanceof TimerMetaDataModel ? (TimerMetaDataModel) designSystemModel : null;
        if (timerMetaDataModel != null) {
            return m68611j(timerMetaDataModel);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final C26271b m68611j(TimerMetaDataModel timerMetaDataModel) {
        AbstractC22676k.m65750j(timerMetaDataModel, "<this>");
        return new C26271b(m68613l(timerMetaDataModel.getExpireTime()), m68612k(timerMetaDataModel.getDisplayStyle()), timerMetaDataModel.getHoursLabel(), timerMetaDataModel.getMinutesLabel(), timerMetaDataModel.getSecondsLabel());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX INFO: renamed from: k */
    public static final EnumC26272c m68612k(String displayStyle) {
        AbstractC22676k.m65750j(displayStyle, "displayStyle");
        EnumC26272c enumC26272c = EnumC26272c.FALL_BACK;
        for (EnumC26272c enumC26272c2 : EnumC26272c.values()) {
            if (AbstractC22676k.m65745e(enumC26272c2.name(), displayStyle)) {
                if (enumC26272c2 == null) {
                    return enumC26272c;
                }
                return enumC26272c2;
            }
        }
        enumC26272c2 = null;
        if (enumC26272c2 == null) {
            return enumC26272c;
        }
        return enumC26272c2;
    }

    /* JADX INFO: renamed from: l */
    public static final long m68613l(String expiresAt) {
        AbstractC22676k.m65750j(expiresAt, "expiresAt");
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd'T'HH:mm:ss").optionalStart().appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true).optionalEnd().optionalStart().appendOffset("+HHMM", "Z").optionalStart().appendOffset("+HH:MM", "Z").optionalEnd().toFormatter();
        AbstractC22676k.m65749i(formatter, "toFormatter(...)");
        return OffsetDateTime.parse(expiresAt, formatter).toInstant().toEpochMilli();
    }
}
