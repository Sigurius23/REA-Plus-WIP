package m80;

import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.design.util.TextResource;
import d70.C11749c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: m80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jp\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b%\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b*\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b0\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lm80/e;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "hintEmail", "Ld70/c;", "emailPrefill", "analyticsName", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "dialogInfo", "marketingInfo", "", "marketingOptIn", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/c;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Z)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ld70/c;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Z)Lm80/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "k", "d", "g", "e", "Ld70/c;", "f", "()Ld70/c;", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "()Lcom/whoop/activation/domain/models/EmailDialogInfo;", "i", "Z", "j", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25223e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hintEmail;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C11749c emailPrefill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EmailDialogInfo dialogInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String marketingInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean marketingOptIn;

    public C25223e(AbstractC22403o image, TextResource title, String str, TextResource hintEmail, C11749c emailPrefill, String analyticsName, EmailDialogInfo emailDialogInfo, String str2, boolean z4) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintEmail, "hintEmail");
        AbstractC22676k.m65750j(emailPrefill, "emailPrefill");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.hintEmail = hintEmail;
        this.emailPrefill = emailPrefill;
        this.analyticsName = analyticsName;
        this.dialogInfo = emailDialogInfo;
        this.marketingInfo = str2;
        this.marketingOptIn = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25223e m73902b(C25223e c25223e, AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, C11749c c11749c, String str2, EmailDialogInfo emailDialogInfo, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22403o = c25223e.image;
        }
        if ((i13 & 2) != 0) {
            textResource = c25223e.title;
        }
        if ((i13 & 4) != 0) {
            str = c25223e.subTitle;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c25223e.hintEmail;
        }
        if ((i13 & 16) != 0) {
            c11749c = c25223e.emailPrefill;
        }
        if ((i13 & 32) != 0) {
            str2 = c25223e.analyticsName;
        }
        if ((i13 & 64) != 0) {
            emailDialogInfo = c25223e.dialogInfo;
        }
        if ((i13 & 128) != 0) {
            str3 = c25223e.marketingInfo;
        }
        if ((i13 & 256) != 0) {
            z4 = c25223e.marketingOptIn;
        }
        String str4 = str3;
        boolean z13 = z4;
        String str5 = str2;
        EmailDialogInfo emailDialogInfo2 = emailDialogInfo;
        C11749c c11749c2 = c11749c;
        String str6 = str;
        return c25223e.m73903a(abstractC22403o, textResource, str6, textResource2, c11749c2, str5, emailDialogInfo2, str4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C25223e m73903a(AbstractC22403o image, TextResource title, String subTitle, TextResource hintEmail, C11749c emailPrefill, String analyticsName, EmailDialogInfo dialogInfo, String marketingInfo, boolean marketingOptIn) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintEmail, "hintEmail");
        AbstractC22676k.m65750j(emailPrefill, "emailPrefill");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new C25223e(image, title, subTitle, hintEmail, emailPrefill, analyticsName, dialogInfo, marketingInfo, marketingOptIn);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EmailDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25223e)) {
            return false;
        }
        C25223e c25223e = (C25223e) other;
        return AbstractC22676k.m65745e(this.image, c25223e.image) && AbstractC22676k.m65745e(this.title, c25223e.title) && AbstractC22676k.m65745e(this.subTitle, c25223e.subTitle) && AbstractC22676k.m65745e(this.hintEmail, c25223e.hintEmail) && AbstractC22676k.m65745e(this.emailPrefill, c25223e.emailPrefill) && AbstractC22676k.m65745e(this.analyticsName, c25223e.analyticsName) && AbstractC22676k.m65745e(this.dialogInfo, c25223e.dialogInfo) && AbstractC22676k.m65745e(this.marketingInfo, c25223e.marketingInfo) && this.marketingOptIn == c25223e.marketingOptIn;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C11749c getEmailPrefill() {
        return this.emailPrefill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHintEmail() {
        return this.hintEmail;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        int iM30450d = AbstractC11266d.m30450d((this.emailPrefill.hashCode() + AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.hintEmail, 31)) * 31, 31, this.analyticsName);
        EmailDialogInfo emailDialogInfo = this.dialogInfo;
        int iHashCode = (iM30450d + (emailDialogInfo == null ? 0 : emailDialogInfo.hashCode())) * 31;
        String str2 = this.marketingInfo;
        return Boolean.hashCode(this.marketingOptIn) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMarketingInfo() {
        return this.marketingInfo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
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
        C11749c c11749c = this.emailPrefill;
        String str2 = this.analyticsName;
        EmailDialogInfo emailDialogInfo = this.dialogInfo;
        String str3 = this.marketingInfo;
        boolean z4 = this.marketingOptIn;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("EnterEmailScreenViewState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91826A(sbM114683k, str, ", hintEmail=", textResource2, ", emailPrefill=");
        sbM114683k.append(c11749c);
        sbM114683k.append(", analyticsName=");
        sbM114683k.append(str2);
        sbM114683k.append(", dialogInfo=");
        sbM114683k.append(emailDialogInfo);
        sbM114683k.append(", marketingInfo=");
        sbM114683k.append(str3);
        sbM114683k.append(", marketingOptIn=");
        return AbstractC18489d0.m53372m(sbM114683k, z4, ")");
    }
}
