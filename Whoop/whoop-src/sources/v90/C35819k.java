package v90;

import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.PlanPickerOption;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import v40.C35652d;

/* JADX INFO: renamed from: v90.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b&\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b1\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b(\u00108R\u0014\u00109\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010/¨\u0006:"}, m65681d2 = {"Lv90/k;", "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "Lcom/whoop/design/util/TextResource;", "optionTitle", "optionSubtitle", "optionPrice", "optionPriceSubtitle", "", "disclaimer", "optionPriceSubtitleStrikeout", "tag", "", "isOptionSelected", "membershipTier", "trackingLabel", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "shouldSkipNextScreen", "Lkotlin/Function0;", "Ll83/a0;", "onClickOption", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "e", "d", "f", "Ljava/lang/String;", "g", "j", "Z", "l", "()Z", "getMembershipTier", "k", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getShouldSkipNextScreen", "m", "Lc93/a;", "()Lc93/a;", "isSelected", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35819k implements PlanPickerOption {

    /* JADX INFO: renamed from: n */
    public static final int f152397n = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource optionTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource optionSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource optionPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource optionPriceSubtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String disclaimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String optionPriceSubtitleStrikeout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource tag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isOptionSelected;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String membershipTier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String trackingLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final CommitmentType commitmentType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean shouldSkipNextScreen;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC4339a onClickOption;

    public C35819k(TextResource optionTitle, TextResource optionSubtitle, TextResource optionPrice, TextResource optionPriceSubtitle, String disclaimer, String str, TextResource textResource, boolean z4, String membershipTier, String trackingLabel, CommitmentType commitmentType, boolean z13, InterfaceC4339a onClickOption) {
        AbstractC22676k.m65750j(optionTitle, "optionTitle");
        AbstractC22676k.m65750j(optionSubtitle, "optionSubtitle");
        AbstractC22676k.m65750j(optionPrice, "optionPrice");
        AbstractC22676k.m65750j(optionPriceSubtitle, "optionPriceSubtitle");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        AbstractC22676k.m65750j(onClickOption, "onClickOption");
        this.optionTitle = optionTitle;
        this.optionSubtitle = optionSubtitle;
        this.optionPrice = optionPrice;
        this.optionPriceSubtitle = optionPriceSubtitle;
        this.disclaimer = disclaimer;
        this.optionPriceSubtitleStrikeout = str;
        this.tag = textResource;
        this.isOptionSelected = z4;
        this.membershipTier = membershipTier;
        this.trackingLabel = trackingLabel;
        this.commitmentType = commitmentType;
        this.shouldSkipNextScreen = z13;
        this.onClickOption = onClickOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m113601b() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC4339a getOnClickOption() {
        return this.onClickOption;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getOptionPrice() {
        return this.optionPrice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35819k)) {
            return false;
        }
        C35819k c35819k = (C35819k) other;
        return AbstractC22676k.m65745e(this.optionTitle, c35819k.optionTitle) && AbstractC22676k.m65745e(this.optionSubtitle, c35819k.optionSubtitle) && AbstractC22676k.m65745e(this.optionPrice, c35819k.optionPrice) && AbstractC22676k.m65745e(this.optionPriceSubtitle, c35819k.optionPriceSubtitle) && AbstractC22676k.m65745e(this.disclaimer, c35819k.disclaimer) && AbstractC22676k.m65745e(this.optionPriceSubtitleStrikeout, c35819k.optionPriceSubtitleStrikeout) && AbstractC22676k.m65745e(this.tag, c35819k.tag) && this.isOptionSelected == c35819k.isOptionSelected && AbstractC22676k.m65745e(this.membershipTier, c35819k.membershipTier) && AbstractC22676k.m65745e(this.trackingLabel, c35819k.trackingLabel) && this.commitmentType == c35819k.commitmentType && this.shouldSkipNextScreen == c35819k.shouldSkipNextScreen && AbstractC22676k.m65745e(this.onClickOption, c35819k.onClickOption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getOptionPriceSubtitle() {
        return this.optionPriceSubtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOptionPriceSubtitleStrikeout() {
        return this.optionPriceSubtitleStrikeout;
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    public CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getOptionSubtitle() {
        return this.optionSubtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.optionTitle.hashCode() * 31, this.optionSubtitle, 31), this.optionPrice, 31), this.optionPriceSubtitle, 31), 31, this.disclaimer);
        String str = this.optionPriceSubtitleStrikeout;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        TextResource textResource = this.tag;
        return this.onClickOption.hashCode() + AbstractC2875y.m8289b((this.commitmentType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isOptionSelected), 31, this.membershipTier), 31, this.trackingLabel)) * 31, 31, this.shouldSkipNextScreen);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getOptionTitle() {
        return this.optionTitle;
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public boolean getIsOptionSelected() {
        return this.isOptionSelected;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m113611l() {
        return this.isOptionSelected;
    }

    public String toString() {
        TextResource textResource = this.optionTitle;
        TextResource textResource2 = this.optionSubtitle;
        TextResource textResource3 = this.optionPrice;
        TextResource textResource4 = this.optionPriceSubtitle;
        String str = this.disclaimer;
        String str2 = this.optionPriceSubtitleStrikeout;
        TextResource textResource5 = this.tag;
        boolean z4 = this.isOptionSelected;
        String str3 = this.membershipTier;
        String str4 = this.trackingLabel;
        CommitmentType commitmentType = this.commitmentType;
        boolean z13 = this.shouldSkipNextScreen;
        InterfaceC4339a interfaceC4339a = this.onClickOption;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TrialPlanPickerOption(optionTitle=", textResource, ", optionSubtitle=", textResource2, ", optionPrice=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", optionPriceSubtitle=", textResource4, ", disclaimer=");
        AbstractC11266d.m30444B(sbM106658q, str, ", optionPriceSubtitleStrikeout=", str2, ", tag=");
        AbstractC33745d.m106664w(textResource5, ", isOptionSelected=", ", membershipTier=", sbM106658q, z4);
        AbstractC11266d.m30444B(sbM106658q, str3, ", trackingLabel=", str4, ", commitmentType=");
        sbM106658q.append(commitmentType);
        sbM106658q.append(", shouldSkipNextScreen=");
        sbM106658q.append(z13);
        sbM106658q.append(", onClickOption=");
        sbM106658q.append(interfaceC4339a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C35819k(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, TextResource textResource5, boolean z4, String str3, String str4, CommitmentType commitmentType, boolean z13, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, textResource4, str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : textResource5, (i13 & 128) != 0 ? false : z4, str3, str4, commitmentType, z13, (i13 & 4096) != 0 ? new C35652d(14) : interfaceC4339a);
    }
}
