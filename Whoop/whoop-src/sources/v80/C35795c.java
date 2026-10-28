package v80;

import com.whoop.activation.domain.models.ActivationFlowCtaDestinations;
import com.whoop.design.util.TextResource;
import d70.C11751e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wn0.C37416g;

/* JADX INFO: renamed from: v80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0090\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b*\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b0\u00106R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b\u0014\u0010;R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b<\u0010;¨\u0006="}, m65681d2 = {"Lv80/c;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "hint", "bottomMarkup", "analyticsName", "Ld70/e;", "passwordPrefill", "ctaText", "Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "ctaDestinations", "", "Lwn0/g;", "validationResults", "", "isPasswordValid", "isButtonEnabled", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ld70/e;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;Ljava/util/List;ZZ)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ld70/e;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;Ljava/util/List;ZZ)Lv80/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "i", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "k", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "g", "Ld70/e;", "j", "()Ld70/e;", "Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "()Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "Ljava/util/List;", "m", "()Ljava/util/List;", "Z", "()Z", "n", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35795c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String bottomMarkup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C11751e passwordPrefill;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String ctaText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ActivationFlowCtaDestinations ctaDestinations;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C37416g> validationResults;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isPasswordValid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isButtonEnabled;

    public C35795c(AbstractC22403o image, TextResource title, String str, TextResource hint, String bottomMarkup, String analyticsName, C11751e passwordPrefill, String ctaText, ActivationFlowCtaDestinations ctaDestinations, List<C37416g> validationResults, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(bottomMarkup, "bottomMarkup");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(passwordPrefill, "passwordPrefill");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(ctaDestinations, "ctaDestinations");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.hint = hint;
        this.bottomMarkup = bottomMarkup;
        this.analyticsName = analyticsName;
        this.passwordPrefill = passwordPrefill;
        this.ctaText = ctaText;
        this.ctaDestinations = ctaDestinations;
        this.validationResults = validationResults;
        this.isPasswordValid = z4;
        this.isButtonEnabled = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35795c m113484b(C35795c c35795c, AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, String str2, String str3, C11751e c11751e, String str4, ActivationFlowCtaDestinations activationFlowCtaDestinations, List list, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22403o = c35795c.image;
        }
        if ((i13 & 2) != 0) {
            textResource = c35795c.title;
        }
        if ((i13 & 4) != 0) {
            str = c35795c.subTitle;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c35795c.hint;
        }
        if ((i13 & 16) != 0) {
            str2 = c35795c.bottomMarkup;
        }
        if ((i13 & 32) != 0) {
            str3 = c35795c.analyticsName;
        }
        if ((i13 & 64) != 0) {
            c11751e = c35795c.passwordPrefill;
        }
        if ((i13 & 128) != 0) {
            str4 = c35795c.ctaText;
        }
        if ((i13 & 256) != 0) {
            activationFlowCtaDestinations = c35795c.ctaDestinations;
        }
        if ((i13 & 512) != 0) {
            list = c35795c.validationResults;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z4 = c35795c.isPasswordValid;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z13 = c35795c.isButtonEnabled;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        ActivationFlowCtaDestinations activationFlowCtaDestinations2 = activationFlowCtaDestinations;
        List list2 = list;
        C11751e c11751e2 = c11751e;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        return c35795c.m113485a(abstractC22403o, textResource, str, textResource2, str6, str7, c11751e2, str5, activationFlowCtaDestinations2, list2, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C35795c m113485a(AbstractC22403o image, TextResource title, String subTitle, TextResource hint, String bottomMarkup, String analyticsName, C11751e passwordPrefill, String ctaText, ActivationFlowCtaDestinations ctaDestinations, List<C37416g> validationResults, boolean isPasswordValid, boolean isButtonEnabled) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(bottomMarkup, "bottomMarkup");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(passwordPrefill, "passwordPrefill");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(ctaDestinations, "ctaDestinations");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        return new C35795c(image, title, subTitle, hint, bottomMarkup, analyticsName, passwordPrefill, ctaText, ctaDestinations, validationResults, isPasswordValid, isButtonEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBottomMarkup() {
        return this.bottomMarkup;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35795c)) {
            return false;
        }
        C35795c c35795c = (C35795c) other;
        return AbstractC22676k.m65745e(this.image, c35795c.image) && AbstractC22676k.m65745e(this.title, c35795c.title) && AbstractC22676k.m65745e(this.subTitle, c35795c.subTitle) && AbstractC22676k.m65745e(this.hint, c35795c.hint) && AbstractC22676k.m65745e(this.bottomMarkup, c35795c.bottomMarkup) && AbstractC22676k.m65745e(this.analyticsName, c35795c.analyticsName) && AbstractC22676k.m65745e(this.passwordPrefill, c35795c.passwordPrefill) && AbstractC22676k.m65745e(this.ctaText, c35795c.ctaText) && this.ctaDestinations == c35795c.ctaDestinations && AbstractC22676k.m65745e(this.validationResults, c35795c.validationResults) && this.isPasswordValid == c35795c.isPasswordValid && this.isButtonEnabled == c35795c.isButtonEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ActivationFlowCtaDestinations getCtaDestinations() {
        return this.ctaDestinations;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getHint() {
        return this.hint;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        return Boolean.hashCode(this.isButtonEnabled) + AbstractC2875y.m8289b(AbstractC11895b.m31983b((this.ctaDestinations.hashCode() + AbstractC11266d.m30450d((this.passwordPrefill.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.hint, 31), 31, this.bottomMarkup), 31, this.analyticsName)) * 31, 31, this.ctaText)) * 31, 31, this.validationResults), 31, this.isPasswordValid);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C11751e getPasswordPrefill() {
        return this.passwordPrefill;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m */
    public final List<C37416g> m113495m() {
        return this.validationResults;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        String str = this.subTitle;
        TextResource textResource2 = this.hint;
        String str2 = this.bottomMarkup;
        String str3 = this.analyticsName;
        C11751e c11751e = this.passwordPrefill;
        String str4 = this.ctaText;
        ActivationFlowCtaDestinations activationFlowCtaDestinations = this.ctaDestinations;
        List<C37416g> list = this.validationResults;
        boolean z4 = this.isPasswordValid;
        boolean z13 = this.isButtonEnabled;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("CreatePasswordViewState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91826A(sbM114683k, str, ", hint=", textResource2, ", bottomMarkup=");
        AbstractC11266d.m30444B(sbM114683k, str2, ", analyticsName=", str3, ", passwordPrefill=");
        sbM114683k.append(c11751e);
        sbM114683k.append(", ctaText=");
        sbM114683k.append(str4);
        sbM114683k.append(", ctaDestinations=");
        sbM114683k.append(activationFlowCtaDestinations);
        sbM114683k.append(", validationResults=");
        sbM114683k.append(list);
        sbM114683k.append(", isPasswordValid=");
        return AbstractC36095b.m114682j(sbM114683k, z4, ", isButtonEnabled=", z13, ")");
    }
}
