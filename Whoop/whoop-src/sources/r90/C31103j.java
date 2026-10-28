package r90;

import com.whoop.activation.domain.models.steps.TermExpansion;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: r90.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0094\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b&\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b$\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b(\u00105R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b3\u0010+¨\u00067"}, m65681d2 = {"Lr90/j;", "", "", "id", "region", "fullTermsUrl", "summary", "", "isRequired", "isExpansionRequired", "Lcom/whoop/activation/domain/models/steps/TermExpansion;", "expansion", "bottomScrollAllowed", "consentKey", "Lr90/d;", "consent", "Lr90/i;", "details", "isExpanded", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZ)Lr90/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "i", "c", "g", "d", "j", "e", "Z", "n", "()Z", "f", "m", "Lcom/whoop/activation/domain/models/steps/TermExpansion;", "()Lcom/whoop/activation/domain/models/steps/TermExpansion;", "getBottomScrollAllowed", "Lr90/d;", "()Lr90/d;", "k", "Lr90/i;", "()Lr90/i;", "l", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31103j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String region;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String fullTermsUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String summary;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isExpansionRequired;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TermExpansion expansion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean bottomScrollAllowed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String consentKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC31097d consent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C31102i details;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isChecked;

    public C31103j(String id4, String region, String fullTermsUrl, String summary, boolean z4, boolean z13, TermExpansion expansion, boolean z14, String consentKey, EnumC31097d enumC31097d, C31102i details, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(summary, "summary");
        AbstractC22676k.m65750j(expansion, "expansion");
        AbstractC22676k.m65750j(consentKey, "consentKey");
        AbstractC22676k.m65750j(details, "details");
        this.id = id4;
        this.region = region;
        this.fullTermsUrl = fullTermsUrl;
        this.summary = summary;
        this.isRequired = z4;
        this.isExpansionRequired = z13;
        this.expansion = expansion;
        this.bottomScrollAllowed = z14;
        this.consentKey = consentKey;
        this.consent = enumC31097d;
        this.details = details;
        this.isExpanded = z15;
        this.isChecked = z16;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31103j m95844b(C31103j c31103j, String str, String str2, String str3, String str4, boolean z4, boolean z13, TermExpansion termExpansion, boolean z14, String str5, EnumC31097d enumC31097d, C31102i c31102i, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c31103j.id;
        }
        return c31103j.m95845a(str, (i13 & 2) != 0 ? c31103j.region : str2, (i13 & 4) != 0 ? c31103j.fullTermsUrl : str3, (i13 & 8) != 0 ? c31103j.summary : str4, (i13 & 16) != 0 ? c31103j.isRequired : z4, (i13 & 32) != 0 ? c31103j.isExpansionRequired : z13, (i13 & 64) != 0 ? c31103j.expansion : termExpansion, (i13 & 128) != 0 ? c31103j.bottomScrollAllowed : z14, (i13 & 256) != 0 ? c31103j.consentKey : str5, (i13 & 512) != 0 ? c31103j.consent : enumC31097d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31103j.details : c31102i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31103j.isExpanded : z15, (i13 & 4096) != 0 ? c31103j.isChecked : z16);
    }

    /* JADX INFO: renamed from: a */
    public final C31103j m95845a(String id4, String region, String fullTermsUrl, String summary, boolean isRequired, boolean isExpansionRequired, TermExpansion expansion, boolean bottomScrollAllowed, String consentKey, EnumC31097d consent, C31102i details, boolean isExpanded, boolean isChecked) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(summary, "summary");
        AbstractC22676k.m65750j(expansion, "expansion");
        AbstractC22676k.m65750j(consentKey, "consentKey");
        AbstractC22676k.m65750j(details, "details");
        return new C31103j(id4, region, fullTermsUrl, summary, isRequired, isExpansionRequired, expansion, bottomScrollAllowed, consentKey, consent, details, isExpanded, isChecked);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC31097d getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getConsentKey() {
        return this.consentKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C31102i getDetails() {
        return this.details;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31103j)) {
            return false;
        }
        C31103j c31103j = (C31103j) other;
        return AbstractC22676k.m65745e(this.id, c31103j.id) && AbstractC22676k.m65745e(this.region, c31103j.region) && AbstractC22676k.m65745e(this.fullTermsUrl, c31103j.fullTermsUrl) && AbstractC22676k.m65745e(this.summary, c31103j.summary) && this.isRequired == c31103j.isRequired && this.isExpansionRequired == c31103j.isExpansionRequired && this.expansion == c31103j.expansion && this.bottomScrollAllowed == c31103j.bottomScrollAllowed && AbstractC22676k.m65745e(this.consentKey, c31103j.consentKey) && this.consent == c31103j.consent && AbstractC22676k.m65745e(this.details, c31103j.details) && this.isExpanded == c31103j.isExpanded && this.isChecked == c31103j.isChecked;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TermExpansion getExpansion() {
        return this.expansion;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFullTermsUrl() {
        return this.fullTermsUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.expansion.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.region), 31, this.fullTermsUrl), 31, this.summary), 31, this.isRequired), 31, this.isExpansionRequired)) * 31, 31, this.bottomScrollAllowed), 31, this.consentKey);
        EnumC31097d enumC31097d = this.consent;
        return Boolean.hashCode(this.isChecked) + AbstractC2875y.m8289b((this.details.hashCode() + ((iM30450d + (enumC31097d == null ? 0 : enumC31097d.hashCode())) * 31)) * 31, 31, this.isExpanded);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsExpansionRequired() {
        return this.isExpansionRequired;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.region;
        String str3 = this.fullTermsUrl;
        String str4 = this.summary;
        boolean z4 = this.isRequired;
        boolean z13 = this.isExpansionRequired;
        TermExpansion termExpansion = this.expansion;
        boolean z14 = this.bottomScrollAllowed;
        String str5 = this.consentKey;
        EnumC31097d enumC31097d = this.consent;
        C31102i c31102i = this.details;
        boolean z15 = this.isExpanded;
        boolean z16 = this.isChecked;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TermState(id=", str, ", region=", str2, ", fullTermsUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", summary=", str4, ", isRequired=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", isExpansionRequired=", z13, ", expansion=");
        sbM32001t.append(termExpansion);
        sbM32001t.append(", bottomScrollAllowed=");
        sbM32001t.append(z14);
        sbM32001t.append(", consentKey=");
        sbM32001t.append(str5);
        sbM32001t.append(", consent=");
        sbM32001t.append(enumC31097d);
        sbM32001t.append(", details=");
        sbM32001t.append(c31102i);
        sbM32001t.append(", isExpanded=");
        sbM32001t.append(z15);
        sbM32001t.append(", isChecked=");
        return AbstractC18489d0.m53372m(sbM32001t, z16, ")");
    }

    public /* synthetic */ C31103j(String str, String str2, String str3, String str4, boolean z4, boolean z13, TermExpansion termExpansion, boolean z14, String str5, EnumC31097d enumC31097d, C31102i c31102i, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z4, z13, termExpansion, z14, (i13 & 256) != 0 ? "" : str5, (i13 & 512) != 0 ? null : enumC31097d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C31102i(null, null, 3, null) : c31102i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z15, (i13 & 4096) != 0 ? false : z16);
    }
}
