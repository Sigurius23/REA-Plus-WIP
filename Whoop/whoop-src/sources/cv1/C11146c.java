package cv1;

import com.whoop.design.util.TextResource;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferSectionSpacingType;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cv1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0016\u001a\u001d\u001e\u0014B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lcv1/c;", "", "Lcv1/c$c;", "popUpDialog", "Lcv1/c$b;", "fullScreenModal", "Lcv1/c$d;", "screenContent", "<init>", "(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcv1/c$c;", "b", "()Lcv1/c$c;", "Lcv1/c$b;", "()Lcv1/c$b;", "c", "Lcv1/c$d;", "()Lcv1/c$d;", "d", "e", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11146c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final c popUpDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: cv1.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcv1/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;", "insetBottom", "<init>", "(Ljava/util/List;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;", "()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LimitedTimeOfferSectionSpacingType insetBottom;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, LimitedTimeOfferSectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.itemViewState = itemViewState;
            this.insetBottom = insetBottom;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LimitedTimeOfferSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m30131b() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.insetBottom == aVar.insetBottom;
        }

        public int hashCode() {
            return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
        }
    }

    /* JADX INFO: renamed from: cv1.c$c */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcv1/c$c;", "", "", "hashCode", "()I", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {
        public abstract int hashCode();
    }

    /* JADX INFO: renamed from: cv1.c$d */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b&\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b\u001e\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b0\u0010(¨\u00066"}, m65681d2 = {"Lcv1/c$d;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lcv1/c$a;", "items", "", "displayRefreshingAnimation", "Lcv1/c$e;", "sticky", "", "selectedCardId", "source", "offerId", "Lkd1/o;", "imageUrl", "backgroundImageUrl", "maxDisclaimerText", "showDisclaimer", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcv1/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "()Z", "Lcv1/c$e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcv1/c$e;", "e", "Ljava/lang/String;", "f", "getSource", "g", "getOfferId", "Lkd1/o;", "()Lkd1/o;", "j", "k", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final e sticky;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String selectedCardId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String offerId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AbstractC22403o imageUrl;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final AbstractC22403o backgroundImageUrl;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String maxDisclaimerText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean showDisclaimer;

        public d(TextResource toolbarTitle, List<a> items, boolean z4, e eVar, String selectedCardId, String source, String offerId, AbstractC22403o imageUrl, AbstractC22403o backgroundImageUrl, String str, boolean z13) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(selectedCardId, "selectedCardId");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(offerId, "offerId");
            AbstractC22676k.m65750j(imageUrl, "imageUrl");
            AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.sticky = eVar;
            this.selectedCardId = selectedCardId;
            this.source = source;
            this.offerId = offerId;
            this.imageUrl = imageUrl;
            this.backgroundImageUrl = backgroundImageUrl;
            this.maxDisclaimerText = str;
            this.showDisclaimer = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC22403o getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: d */
        public final List<a> m30139d() {
            return this.items;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMaxDisclaimerText() {
            return this.maxDisclaimerText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.sticky, dVar.sticky) && AbstractC22676k.m65745e(this.selectedCardId, dVar.selectedCardId) && AbstractC22676k.m65745e(this.source, dVar.source) && AbstractC22676k.m65745e(this.offerId, dVar.offerId) && AbstractC22676k.m65745e(this.imageUrl, dVar.imageUrl) && AbstractC22676k.m65745e(this.backgroundImageUrl, dVar.backgroundImageUrl) && AbstractC22676k.m65745e(this.maxDisclaimerText, dVar.maxDisclaimerText) && this.showDisclaimer == dVar.showDisclaimer;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSelectedCardId() {
            return this.selectedCardId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowDisclaimer() {
            return this.showDisclaimer;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final e getSticky() {
            return this.sticky;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation);
            e eVar = this.sticky;
            int iM91833c = AbstractC30007c.m91833c(this.backgroundImageUrl, AbstractC30007c.m91833c(this.imageUrl, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.selectedCardId), 31, this.source), 31, this.offerId), 31), 31);
            String str = this.maxDisclaimerText;
            return Boolean.hashCode(this.showDisclaimer) + ((iM91833c + (str != null ? str.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<a> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            e eVar = this.sticky;
            String str = this.selectedCardId;
            String str2 = this.source;
            String str3 = this.offerId;
            AbstractC22403o abstractC22403o = this.imageUrl;
            AbstractC22403o abstractC22403o2 = this.backgroundImageUrl;
            String str4 = this.maxDisclaimerText;
            boolean z13 = this.showDisclaimer;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", sticky=");
            sbM106657p.append(eVar);
            sbM106657p.append(", selectedCardId=");
            AbstractC11266d.m30444B(sbM106657p, str, ", source=", str2, ", offerId=");
            sbM106657p.append(str3);
            sbM106657p.append(", imageUrl=");
            sbM106657p.append(abstractC22403o);
            sbM106657p.append(", backgroundImageUrl=");
            sbM106657p.append(abstractC22403o2);
            sbM106657p.append(", maxDisclaimerText=");
            sbM106657p.append(str4);
            sbM106657p.append(", showDisclaimer=");
            return AbstractC18489d0.m53372m(sbM106657p, z13, ")");
        }
    }

    /* JADX INFO: renamed from: cv1.c$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcv1/c$e;", "", "", "text", "", "Lm91/u;", "items", "", "shouldDismissTile", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean shouldDismissTile;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends InterfaceC25312u> items, boolean z4) {
            AbstractC22676k.m65750j(items, "items");
            this.text = str;
            this.items = items;
            this.shouldDismissTile = z4;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m30145a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldDismissTile() {
            return this.shouldDismissTile;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.text, eVar.text) && AbstractC22676k.m65745e(this.items, eVar.items) && this.shouldDismissTile == eVar.shouldDismissTile;
        }

        public int hashCode() {
            String str = this.text;
            return Boolean.hashCode(this.shouldDismissTile) + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
        }

        public String toString() {
            String str = this.text;
            List<InterfaceC25312u> list = this.items;
            return AbstractC18489d0.m53372m(AbstractC30802r.m94766o("StickyArea(text=", str, ", items=", ", shouldDismissTile=", list), this.shouldDismissTile, ")");
        }
    }

    public C11146c(c cVar, b bVar, d dVar) {
        this.popUpDialog = cVar;
        this.fullScreenModal = bVar;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11146c)) {
            return false;
        }
        C11146c c11146c = (C11146c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c11146c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c11146c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c11146c.screenContent);
    }

    public int hashCode() {
        int i13 = 0 * 31;
        b bVar = this.fullScreenModal;
        int iHashCode = (i13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "LimitedTimeOfferViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: cv1.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcv1/c$b;", "", "Lsz0/q0;", "state", "Lcv1/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lcv1/a;Lcv1/a;Lcv1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lcv1/a;", "()Lcv1/a;", "c", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f35653e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC11144a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC11144a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC11144a backClickEvent;

        public b(C33211q0 state, InterfaceC11144a interfaceC11144a, InterfaceC11144a interfaceC11144a2, InterfaceC11144a interfaceC11144a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC11144a;
            this.secondaryClickEvent = interfaceC11144a2;
            this.backClickEvent = interfaceC11144a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC11144a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC11144a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC11144a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC11144a interfaceC11144a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC11144a == null ? 0 : interfaceC11144a.hashCode())) * 31;
            InterfaceC11144a interfaceC11144a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC11144a2 == null ? 0 : interfaceC11144a2.hashCode())) * 31;
            InterfaceC11144a interfaceC11144a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC11144a3 != null ? interfaceC11144a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC11144a interfaceC11144a, InterfaceC11144a interfaceC11144a2, InterfaceC11144a interfaceC11144a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC11144a, (i13 & 4) != 0 ? null : interfaceC11144a2, (i13 & 8) != 0 ? null : interfaceC11144a3);
        }
    }

    public /* synthetic */ C11146c(c cVar, b bVar, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : dVar);
    }
}
