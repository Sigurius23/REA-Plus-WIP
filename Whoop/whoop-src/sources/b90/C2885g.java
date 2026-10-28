package b90;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import d70.C11749c;
import d70.C11751e;
import g80.C15568i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b5\u0010'R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b-\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b1\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:¨\u0006;"}, m65681d2 = {"Lb90/g;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "hint", "Ld70/e;", "passwordPrefill", "", "hidePassword", "forgotPasswordText", "analyticsName", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "errorMessage", "Lg80/i;", "loginErrorState", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/e;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Ld70/c;Lcom/whoop/design/util/TextResource;Lg80/i;)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/e;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Ld70/c;Lcom/whoop/design/util/TextResource;Lg80/i;)Lb90/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "j", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "m", "d", "i", "e", "Ld70/e;", "l", "()Ld70/e;", "f", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "g", "Ld70/c;", "()Ld70/c;", "k", "Lg80/i;", "()Lg80/i;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2885g implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f11485l = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C11751e passwordPrefill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean hidePassword;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource forgotPasswordText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C11749c email;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C15568i loginErrorState;

    public C2885g(AbstractC22403o image, TextResource title, String str, TextResource hint, C11751e passwordPrefill, boolean z4, TextResource forgotPasswordText, String analyticsName, C11749c email, TextResource textResource, C15568i c15568i) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(passwordPrefill, "passwordPrefill");
        AbstractC22676k.m65750j(forgotPasswordText, "forgotPasswordText");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(email, "email");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.hint = hint;
        this.passwordPrefill = passwordPrefill;
        this.hidePassword = z4;
        this.forgotPasswordText = forgotPasswordText;
        this.analyticsName = analyticsName;
        this.email = email;
        this.errorMessage = textResource;
        this.loginErrorState = c15568i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2885g m8383b(C2885g c2885g, AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, C11751e c11751e, boolean z4, TextResource textResource3, String str2, C11749c c11749c, TextResource textResource4, C15568i c15568i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22403o = c2885g.image;
        }
        if ((i13 & 2) != 0) {
            textResource = c2885g.title;
        }
        if ((i13 & 4) != 0) {
            str = c2885g.subTitle;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c2885g.hint;
        }
        if ((i13 & 16) != 0) {
            c11751e = c2885g.passwordPrefill;
        }
        if ((i13 & 32) != 0) {
            z4 = c2885g.hidePassword;
        }
        if ((i13 & 64) != 0) {
            textResource3 = c2885g.forgotPasswordText;
        }
        if ((i13 & 128) != 0) {
            str2 = c2885g.analyticsName;
        }
        if ((i13 & 256) != 0) {
            c11749c = c2885g.email;
        }
        if ((i13 & 512) != 0) {
            textResource4 = c2885g.errorMessage;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c15568i = c2885g.loginErrorState;
        }
        TextResource textResource5 = textResource4;
        C15568i c15568i2 = c15568i;
        String str3 = str2;
        C11749c c11749c2 = c11749c;
        boolean z13 = z4;
        TextResource textResource6 = textResource3;
        C11751e c11751e2 = c11751e;
        String str4 = str;
        return c2885g.m8384a(abstractC22403o, textResource, str4, textResource2, c11751e2, z13, textResource6, str3, c11749c2, textResource5, c15568i2);
    }

    /* JADX INFO: renamed from: a */
    public final C2885g m8384a(AbstractC22403o image, TextResource title, String subTitle, TextResource hint, C11751e passwordPrefill, boolean hidePassword, TextResource forgotPasswordText, String analyticsName, C11749c email, TextResource errorMessage, C15568i loginErrorState) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(passwordPrefill, "passwordPrefill");
        AbstractC22676k.m65750j(forgotPasswordText, "forgotPasswordText");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(email, "email");
        return new C2885g(image, title, subTitle, hint, passwordPrefill, hidePassword, forgotPasswordText, analyticsName, email, errorMessage, loginErrorState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11749c getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2885g)) {
            return false;
        }
        C2885g c2885g = (C2885g) other;
        return AbstractC22676k.m65745e(this.image, c2885g.image) && AbstractC22676k.m65745e(this.title, c2885g.title) && AbstractC22676k.m65745e(this.subTitle, c2885g.subTitle) && AbstractC22676k.m65745e(this.hint, c2885g.hint) && AbstractC22676k.m65745e(this.passwordPrefill, c2885g.passwordPrefill) && this.hidePassword == c2885g.hidePassword && AbstractC22676k.m65745e(this.forgotPasswordText, c2885g.forgotPasswordText) && AbstractC22676k.m65745e(this.analyticsName, c2885g.analyticsName) && AbstractC22676k.m65745e(this.email, c2885g.email) && AbstractC22676k.m65745e(this.errorMessage, c2885g.errorMessage) && AbstractC22676k.m65745e(this.loginErrorState, c2885g.loginErrorState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getForgotPasswordText() {
        return this.forgotPasswordText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHidePassword() {
        return this.hidePassword;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        int iHashCode = (this.email.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC2875y.m8289b((this.passwordPrefill.hashCode() + AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.hint, 31)) * 31, 31, this.hidePassword), this.forgotPasswordText, 31), 31, this.analyticsName)) * 31;
        TextResource textResource = this.errorMessage;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C15568i c15568i = this.loginErrorState;
        return iHashCode2 + (c15568i != null ? c15568i.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C15568i getLoginErrorState() {
        return this.loginErrorState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C11751e getPasswordPrefill() {
        return this.passwordPrefill;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        String str = this.subTitle;
        TextResource textResource2 = this.hint;
        C11751e c11751e = this.passwordPrefill;
        boolean z4 = this.hidePassword;
        TextResource textResource3 = this.forgotPasswordText;
        String str2 = this.analyticsName;
        C11749c c11749c = this.email;
        TextResource textResource4 = this.errorMessage;
        C15568i c15568i = this.loginErrorState;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("EnterYourPasswordViewState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91826A(sbM114683k, str, ", hint=", textResource2, ", passwordPrefill=");
        sbM114683k.append(c11751e);
        sbM114683k.append(", hidePassword=");
        sbM114683k.append(z4);
        sbM114683k.append(", forgotPasswordText=");
        AbstractC30007c.m91856z(sbM114683k, textResource3, ", analyticsName=", str2, ", email=");
        sbM114683k.append(c11749c);
        sbM114683k.append(", errorMessage=");
        sbM114683k.append(textResource4);
        sbM114683k.append(", loginErrorState=");
        sbM114683k.append(c15568i);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }

    public /* synthetic */ C2885g(AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, C11751e c11751e, boolean z4, TextResource textResource3, String str2, C11749c c11749c, TextResource textResource4, C15568i c15568i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, textResource, str, textResource2, c11751e, (i13 & 32) != 0 ? true : z4, textResource3, str2, c11749c, (i13 & 512) != 0 ? null : textResource4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c15568i);
    }
}
