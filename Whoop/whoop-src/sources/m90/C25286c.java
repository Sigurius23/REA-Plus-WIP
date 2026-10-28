package m90;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
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
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: m90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J®\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b7\u00102R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b8\u00102¨\u0006:"}, m65681d2 = {"Lm90/c;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "hintName", "namePrefill", "", "isNameReadOnly", "hintLastName", "lastNamePrefill", "isLastNameReadOnly", "hintUsername", "usernamePrefill", "isUsernameReadOnly", "analyticsName", "usernameTaken", "usernameError", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;ZZ)Lm90/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "k", "d", "f", "e", "j", "Z", "q", "()Z", "g", "i", "p", "n", "r", "m", "o", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25286c implements InterfaceC25312u {

    /* JADX INFO: renamed from: p */
    public static final int f99253p = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource hintName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String namePrefill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isNameReadOnly;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource hintLastName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String lastNamePrefill;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isLastNameReadOnly;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource hintUsername;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String usernamePrefill;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isUsernameReadOnly;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean usernameTaken;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean usernameError;

    public C25286c(AbstractC22403o image, TextResource title, String str, TextResource hintName, String str2, boolean z4, TextResource hintLastName, String str3, boolean z13, TextResource hintUsername, String str4, boolean z14, String analyticsName, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintName, "hintName");
        AbstractC22676k.m65750j(hintLastName, "hintLastName");
        AbstractC22676k.m65750j(hintUsername, "hintUsername");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.hintName = hintName;
        this.namePrefill = str2;
        this.isNameReadOnly = z4;
        this.hintLastName = hintLastName;
        this.lastNamePrefill = str3;
        this.isLastNameReadOnly = z13;
        this.hintUsername = hintUsername;
        this.usernamePrefill = str4;
        this.isUsernameReadOnly = z14;
        this.analyticsName = analyticsName;
        this.usernameTaken = z15;
        this.usernameError = z16;
    }

    /* JADX INFO: renamed from: a */
    public final C25286c m74216a(AbstractC22403o image, TextResource title, String subTitle, TextResource hintName, String namePrefill, boolean isNameReadOnly, TextResource hintLastName, String lastNamePrefill, boolean isLastNameReadOnly, TextResource hintUsername, String usernamePrefill, boolean isUsernameReadOnly, String analyticsName, boolean usernameTaken, boolean usernameError) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hintName, "hintName");
        AbstractC22676k.m65750j(hintLastName, "hintLastName");
        AbstractC22676k.m65750j(hintUsername, "hintUsername");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new C25286c(image, title, subTitle, hintName, namePrefill, isNameReadOnly, hintLastName, lastNamePrefill, isLastNameReadOnly, hintUsername, usernamePrefill, isUsernameReadOnly, analyticsName, usernameTaken, usernameError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHintLastName() {
        return this.hintLastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25286c)) {
            return false;
        }
        C25286c c25286c = (C25286c) other;
        return AbstractC22676k.m65745e(this.image, c25286c.image) && AbstractC22676k.m65745e(this.title, c25286c.title) && AbstractC22676k.m65745e(this.subTitle, c25286c.subTitle) && AbstractC22676k.m65745e(this.hintName, c25286c.hintName) && AbstractC22676k.m65745e(this.namePrefill, c25286c.namePrefill) && this.isNameReadOnly == c25286c.isNameReadOnly && AbstractC22676k.m65745e(this.hintLastName, c25286c.hintLastName) && AbstractC22676k.m65745e(this.lastNamePrefill, c25286c.lastNamePrefill) && this.isLastNameReadOnly == c25286c.isLastNameReadOnly && AbstractC22676k.m65745e(this.hintUsername, c25286c.hintUsername) && AbstractC22676k.m65745e(this.usernamePrefill, c25286c.usernamePrefill) && this.isUsernameReadOnly == c25286c.isUsernameReadOnly && AbstractC22676k.m65745e(this.analyticsName, c25286c.analyticsName) && this.usernameTaken == c25286c.usernameTaken && this.usernameError == c25286c.usernameError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getHintName() {
        return this.hintName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHintUsername() {
        return this.hintUsername;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.hintName, 31);
        String str2 = this.namePrefill;
        int iM95625a3 = AbstractC31061c.m95625a(AbstractC2875y.m8289b((iM95625a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isNameReadOnly), this.hintLastName, 31);
        String str3 = this.lastNamePrefill;
        int iM95625a4 = AbstractC31061c.m95625a(AbstractC2875y.m8289b((iM95625a3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isLastNameReadOnly), this.hintUsername, 31);
        String str4 = this.usernamePrefill;
        return Boolean.hashCode(this.usernameError) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM95625a4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.isUsernameReadOnly), 31, this.analyticsName), 31, this.usernameTaken);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastNamePrefill() {
        return this.lastNamePrefill;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNamePrefill() {
        return this.namePrefill;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getUsernameError() {
        return this.usernameError;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getUsernamePrefill() {
        return this.usernamePrefill;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUsernameTaken() {
        return this.usernameTaken;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsLastNameReadOnly() {
        return this.isLastNameReadOnly;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsNameReadOnly() {
        return this.isNameReadOnly;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsUsernameReadOnly() {
        return this.isUsernameReadOnly;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        String str = this.subTitle;
        TextResource textResource2 = this.hintName;
        String str2 = this.namePrefill;
        boolean z4 = this.isNameReadOnly;
        TextResource textResource3 = this.hintLastName;
        String str3 = this.lastNamePrefill;
        boolean z13 = this.isLastNameReadOnly;
        TextResource textResource4 = this.hintUsername;
        String str4 = this.usernamePrefill;
        boolean z14 = this.isUsernameReadOnly;
        String str5 = this.analyticsName;
        boolean z15 = this.usernameTaken;
        boolean z16 = this.usernameError;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("NameInformationState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91826A(sbM114683k, str, ", hintName=", textResource2, ", namePrefill=");
        AbstractC38963t7.m124390t(sbM114683k, str2, ", isNameReadOnly=", z4, ", hintLastName=");
        AbstractC30007c.m91856z(sbM114683k, textResource3, ", lastNamePrefill=", str3, ", isLastNameReadOnly=");
        AbstractC21702c.m61144o(textResource4, ", hintUsername=", ", usernamePrefill=", sbM114683k, z13);
        AbstractC38963t7.m124390t(sbM114683k, str4, ", isUsernameReadOnly=", z14, ", analyticsName=");
        AbstractC38963t7.m124390t(sbM114683k, str5, ", usernameTaken=", z15, ", usernameError=");
        return AbstractC18489d0.m53372m(sbM114683k, z16, ")");
    }

    public /* synthetic */ C25286c(AbstractC22403o abstractC22403o, TextResource textResource, String str, TextResource textResource2, String str2, boolean z4, TextResource textResource3, String str3, boolean z13, TextResource textResource4, String str4, boolean z14, String str5, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, textResource, str, textResource2, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? false : z4, textResource3, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? false : z13, textResource4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, str5, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z16);
    }
}
