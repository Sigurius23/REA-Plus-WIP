package w80;

import com.whoop.design.util.TextResource;
import f70.C14201q0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: w80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jp\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b$\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b)\u00100¨\u00061"}, m65681d2 = {"Lw80/c;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "hintEmail", "hintPassword", "termsAndConditions", "analyticsName", "Lf70/q0;", "memberInfo", "", "enableLoginRedirectDialog", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lf70/q0;Z)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lf70/q0;Z)Lw80/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "j", "d", "f", "e", "g", "k", "Lf70/q0;", "i", "()Lf70/q0;", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36942c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hintEmail;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource hintPassword;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String termsAndConditions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14201q0 memberInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean enableLoginRedirectDialog;

    public C36942c(AbstractC22403o image, TextResource title, String str, TextResource hintEmail, TextResource hintPassword, String str2, String analyticsName, C14201q0 c14201q0, boolean z4) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintEmail, "hintEmail");
        AbstractC22676k.m65750j(hintPassword, "hintPassword");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.hintEmail = hintEmail;
        this.hintPassword = hintPassword;
        this.termsAndConditions = str2;
        this.analyticsName = analyticsName;
        this.memberInfo = c14201q0;
        this.enableLoginRedirectDialog = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36942c m118598b(C36942c c36942c, AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, String str2, String str3, C14201q0 c14201q0, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22403o = c36942c.image;
        }
        if ((i13 & 2) != 0) {
            textResource = c36942c.title;
        }
        if ((i13 & 4) != 0) {
            str = c36942c.subTitle;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c36942c.hintEmail;
        }
        if ((i13 & 16) != 0) {
            textResource3 = c36942c.hintPassword;
        }
        if ((i13 & 32) != 0) {
            str2 = c36942c.termsAndConditions;
        }
        if ((i13 & 64) != 0) {
            str3 = c36942c.analyticsName;
        }
        if ((i13 & 128) != 0) {
            c14201q0 = c36942c.memberInfo;
        }
        if ((i13 & 256) != 0) {
            z4 = c36942c.enableLoginRedirectDialog;
        }
        C14201q0 c14201q1 = c14201q0;
        boolean z13 = z4;
        String str4 = str2;
        String str5 = str3;
        TextResource textResource4 = textResource3;
        String str6 = str;
        return c36942c.m118599a(abstractC22403o, textResource, str6, textResource2, textResource4, str4, str5, c14201q1, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C36942c m118599a(AbstractC22403o image, TextResource title, String subTitle, TextResource hintEmail, TextResource hintPassword, String termsAndConditions, String analyticsName, C14201q0 memberInfo, boolean enableLoginRedirectDialog) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintEmail, "hintEmail");
        AbstractC22676k.m65750j(hintPassword, "hintPassword");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new C36942c(image, title, subTitle, hintEmail, hintPassword, termsAndConditions, analyticsName, memberInfo, enableLoginRedirectDialog);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEnableLoginRedirectDialog() {
        return this.enableLoginRedirectDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36942c)) {
            return false;
        }
        C36942c c36942c = (C36942c) other;
        return AbstractC22676k.m65745e(this.image, c36942c.image) && AbstractC22676k.m65745e(this.title, c36942c.title) && AbstractC22676k.m65745e(this.subTitle, c36942c.subTitle) && AbstractC22676k.m65745e(this.hintEmail, c36942c.hintEmail) && AbstractC22676k.m65745e(this.hintPassword, c36942c.hintPassword) && AbstractC22676k.m65745e(this.termsAndConditions, c36942c.termsAndConditions) && AbstractC22676k.m65745e(this.analyticsName, c36942c.analyticsName) && AbstractC22676k.m65745e(this.memberInfo, c36942c.memberInfo) && this.enableLoginRedirectDialog == c36942c.enableLoginRedirectDialog;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getHintEmail() {
        return this.hintEmail;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHintPassword() {
        return this.hintPassword;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.hintEmail, 31), this.hintPassword, 31);
        String str2 = this.termsAndConditions;
        int iM30450d = AbstractC11266d.m30450d((iM95625a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.analyticsName);
        C14201q0 c14201q0 = this.memberInfo;
        return Boolean.hashCode(this.enableLoginRedirectDialog) + ((iM30450d + (c14201q0 != null ? c14201q0.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C14201q0 getMemberInfo() {
        return this.memberInfo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        String str = this.subTitle;
        TextResource textResource2 = this.hintEmail;
        TextResource textResource3 = this.hintPassword;
        String str2 = this.termsAndConditions;
        String str3 = this.analyticsName;
        C14201q0 c14201q0 = this.memberInfo;
        boolean z4 = this.enableLoginRedirectDialog;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("CreateYourAccountState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91826A(sbM114683k, str, ", hintEmail=", textResource2, ", hintPassword=");
        AbstractC30007c.m91856z(sbM114683k, textResource3, ", termsAndConditions=", str2, ", analyticsName=");
        sbM114683k.append(str3);
        sbM114683k.append(", memberInfo=");
        sbM114683k.append(c14201q0);
        sbM114683k.append(", enableLoginRedirectDialog=");
        return AbstractC18489d0.m53372m(sbM114683k, z4, ")");
    }

    public /* synthetic */ C36942c(AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, String str2, String str3, C14201q0 c14201q0, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, textResource, str, textResource2, textResource3, str2, str3, c14201q0, (i13 & 256) != 0 ? true : z4);
    }
}
