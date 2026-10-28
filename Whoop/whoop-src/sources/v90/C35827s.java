package v90;

import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.PlanPickerOption;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import v40.C35652d;

/* JADX INFO: renamed from: v90.s */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0092\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b.\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00101¨\u0006:"}, m65681d2 = {"Lv90/s;", "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "Lcom/whoop/design/util/TextResource;", "optionTitle", "optionSubtitle", "optionPrice", "optionPriceSubtitle", "", "disclaimer", "optionPriceSubtitleStrikeout", "tag", "", "isOptionSelected", "membershipTier", "trackingLabel", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "Lkotlin/Function0;", "Ll83/a0;", "onClickOption", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)V", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)Lv90/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "b", "j", "g", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Ljava/lang/String;", "f", "i", "l", "Z", "n", "()Z", "m", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "Lc93/a;", "getOnClickOption", "()Lc93/a;", "isSelected", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35827s implements PlanPickerOption {

    /* JADX INFO: renamed from: m */
    public static final int f152470m = TextResource.$stable;

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
    private final InterfaceC4339a onClickOption;

    public C35827s(TextResource optionTitle, TextResource optionSubtitle, TextResource optionPrice, TextResource optionPriceSubtitle, String disclaimer, String str, TextResource textResource, boolean z4, String membershipTier, String trackingLabel, CommitmentType commitmentType, InterfaceC4339a onClickOption) {
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
        this.onClickOption = onClickOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m113687b() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C35827s m113688d(C35827s c35827s, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, TextResource textResource5, boolean z4, String str3, String str4, CommitmentType commitmentType, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c35827s.optionTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c35827s.optionSubtitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = c35827s.optionPrice;
        }
        if ((i13 & 8) != 0) {
            textResource4 = c35827s.optionPriceSubtitle;
        }
        if ((i13 & 16) != 0) {
            str = c35827s.disclaimer;
        }
        if ((i13 & 32) != 0) {
            str2 = c35827s.optionPriceSubtitleStrikeout;
        }
        if ((i13 & 64) != 0) {
            textResource5 = c35827s.tag;
        }
        if ((i13 & 128) != 0) {
            z4 = c35827s.isOptionSelected;
        }
        if ((i13 & 256) != 0) {
            str3 = c35827s.membershipTier;
        }
        if ((i13 & 512) != 0) {
            str4 = c35827s.trackingLabel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            commitmentType = c35827s.commitmentType;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            interfaceC4339a = c35827s.onClickOption;
        }
        CommitmentType commitmentType2 = commitmentType;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        String str5 = str3;
        String str6 = str4;
        TextResource textResource6 = textResource5;
        boolean z13 = z4;
        String str7 = str;
        String str8 = str2;
        return c35827s.m113689c(textResource, textResource2, textResource3, textResource4, str7, str8, textResource6, z13, str5, str6, commitmentType2, interfaceC4339a2);
    }

    /* JADX INFO: renamed from: c */
    public final C35827s m113689c(TextResource optionTitle, TextResource optionSubtitle, TextResource optionPrice, TextResource optionPriceSubtitle, String disclaimer, String optionPriceSubtitleStrikeout, TextResource tag, boolean isOptionSelected, String membershipTier, String trackingLabel, CommitmentType commitmentType, InterfaceC4339a onClickOption) {
        AbstractC22676k.m65750j(optionTitle, "optionTitle");
        AbstractC22676k.m65750j(optionSubtitle, "optionSubtitle");
        AbstractC22676k.m65750j(optionPrice, "optionPrice");
        AbstractC22676k.m65750j(optionPriceSubtitle, "optionPriceSubtitle");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        AbstractC22676k.m65750j(onClickOption, "onClickOption");
        return new C35827s(optionTitle, optionSubtitle, optionPrice, optionPriceSubtitle, disclaimer, optionPriceSubtitleStrikeout, tag, isOptionSelected, membershipTier, trackingLabel, commitmentType, onClickOption);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35827s)) {
            return false;
        }
        C35827s c35827s = (C35827s) other;
        return AbstractC22676k.m65745e(this.optionTitle, c35827s.optionTitle) && AbstractC22676k.m65745e(this.optionSubtitle, c35827s.optionSubtitle) && AbstractC22676k.m65745e(this.optionPrice, c35827s.optionPrice) && AbstractC22676k.m65745e(this.optionPriceSubtitle, c35827s.optionPriceSubtitle) && AbstractC22676k.m65745e(this.disclaimer, c35827s.disclaimer) && AbstractC22676k.m65745e(this.optionPriceSubtitleStrikeout, c35827s.optionPriceSubtitleStrikeout) && AbstractC22676k.m65745e(this.tag, c35827s.tag) && this.isOptionSelected == c35827s.isOptionSelected && AbstractC22676k.m65745e(this.membershipTier, c35827s.membershipTier) && AbstractC22676k.m65745e(this.trackingLabel, c35827s.trackingLabel) && this.commitmentType == c35827s.commitmentType && AbstractC22676k.m65745e(this.onClickOption, c35827s.onClickOption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMembershipTier() {
        return this.membershipTier;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getOptionPrice() {
        return this.optionPrice;
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    public CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getOptionPriceSubtitle() {
        return this.optionPriceSubtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.optionTitle.hashCode() * 31, this.optionSubtitle, 31), this.optionPrice, 31), this.optionPriceSubtitle, 31), 31, this.disclaimer);
        String str = this.optionPriceSubtitleStrikeout;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        TextResource textResource = this.tag;
        return this.onClickOption.hashCode() + ((this.commitmentType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isOptionSelected), 31, this.membershipTier), 31, this.trackingLabel)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOptionPriceSubtitleStrikeout() {
        return this.optionPriceSubtitleStrikeout;
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public boolean getIsOptionSelected() {
        return this.isOptionSelected;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getOptionSubtitle() {
        return this.optionSubtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getOptionTitle() {
        return this.optionTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m113699n() {
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
        InterfaceC4339a interfaceC4339a = this.onClickOption;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("UpcyclePickerOption(optionTitle=", textResource, ", optionSubtitle=", textResource2, ", optionPrice=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", optionPriceSubtitle=", textResource4, ", disclaimer=");
        AbstractC11266d.m30444B(sbM106658q, str, ", optionPriceSubtitleStrikeout=", str2, ", tag=");
        AbstractC33745d.m106664w(textResource5, ", isOptionSelected=", ", membershipTier=", sbM106658q, z4);
        AbstractC11266d.m30444B(sbM106658q, str3, ", trackingLabel=", str4, ", commitmentType=");
        sbM106658q.append(commitmentType);
        sbM106658q.append(", onClickOption=");
        sbM106658q.append(interfaceC4339a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C35827s(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, TextResource textResource5, boolean z4, String str3, String str4, CommitmentType commitmentType, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, textResource4, str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : textResource5, (i13 & 128) != 0 ? false : z4, str3, str4, commitmentType, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C35652d(16) : interfaceC4339a);
    }
}
