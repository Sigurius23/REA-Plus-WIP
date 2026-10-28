package dg2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dg2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b,\u0010%¨\u00060"}, m65681d2 = {"Ldg2/b;", "", "", "phoneNumber", "maskedPhoneNumber", "", "isPhoneSubmitting", "phoneSubmitSuccess", "isPhoneInputError", "isCodeSubmitting", "codeVerified", "Lcom/whoop/design/util/TextResource;", "codeErrorMessage", "coachPhoneNumber", "isStartingTextingWhoop", "isTextingWhoopError", "destinationPhoneNumber", "isPhoneNumberError", "isFetchingDestinationPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "Z", "l", "()Z", "d", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "i", "m", "k", "n", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12010b {

    /* JADX INFO: renamed from: o */
    public static final int f39727o = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String maskedPhoneNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isPhoneSubmitting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean phoneSubmitSuccess;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isPhoneInputError;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isCodeSubmitting;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean codeVerified;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource codeErrorMessage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String coachPhoneNumber;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isStartingTextingWhoop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isTextingWhoopError;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String destinationPhoneNumber;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isPhoneNumberError;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isFetchingDestinationPhoneNumber;

    public C12010b(String phoneNumber, String maskedPhoneNumber, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, TextResource codeErrorMessage, String coachPhoneNumber, boolean z17, boolean z18, String destinationPhoneNumber, boolean z19, boolean z24) {
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        AbstractC22676k.m65750j(maskedPhoneNumber, "maskedPhoneNumber");
        AbstractC22676k.m65750j(codeErrorMessage, "codeErrorMessage");
        AbstractC22676k.m65750j(coachPhoneNumber, "coachPhoneNumber");
        AbstractC22676k.m65750j(destinationPhoneNumber, "destinationPhoneNumber");
        this.phoneNumber = phoneNumber;
        this.maskedPhoneNumber = maskedPhoneNumber;
        this.isPhoneSubmitting = z4;
        this.phoneSubmitSuccess = z13;
        this.isPhoneInputError = z14;
        this.isCodeSubmitting = z15;
        this.codeVerified = z16;
        this.codeErrorMessage = codeErrorMessage;
        this.coachPhoneNumber = coachPhoneNumber;
        this.isStartingTextingWhoop = z17;
        this.isTextingWhoopError = z18;
        this.destinationPhoneNumber = destinationPhoneNumber;
        this.isPhoneNumberError = z19;
        this.isFetchingDestinationPhoneNumber = z24;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoachPhoneNumber() {
        return this.coachPhoneNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCodeErrorMessage() {
        return this.codeErrorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCodeVerified() {
        return this.codeVerified;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMaskedPhoneNumber() {
        return this.maskedPhoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12010b)) {
            return false;
        }
        C12010b c12010b = (C12010b) other;
        return AbstractC22676k.m65745e(this.phoneNumber, c12010b.phoneNumber) && AbstractC22676k.m65745e(this.maskedPhoneNumber, c12010b.maskedPhoneNumber) && this.isPhoneSubmitting == c12010b.isPhoneSubmitting && this.phoneSubmitSuccess == c12010b.phoneSubmitSuccess && this.isPhoneInputError == c12010b.isPhoneInputError && this.isCodeSubmitting == c12010b.isCodeSubmitting && this.codeVerified == c12010b.codeVerified && AbstractC22676k.m65745e(this.codeErrorMessage, c12010b.codeErrorMessage) && AbstractC22676k.m65745e(this.coachPhoneNumber, c12010b.coachPhoneNumber) && this.isStartingTextingWhoop == c12010b.isStartingTextingWhoop && this.isTextingWhoopError == c12010b.isTextingWhoopError && AbstractC22676k.m65745e(this.destinationPhoneNumber, c12010b.destinationPhoneNumber) && this.isPhoneNumberError == c12010b.isPhoneNumberError && this.isFetchingDestinationPhoneNumber == c12010b.isFetchingDestinationPhoneNumber;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPhoneSubmitSuccess() {
        return this.phoneSubmitSuccess;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsCodeSubmitting() {
        return this.isCodeSubmitting;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFetchingDestinationPhoneNumber) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.phoneNumber.hashCode() * 31, 31, this.maskedPhoneNumber), 31, this.isPhoneSubmitting), 31, this.phoneSubmitSuccess), 31, this.isPhoneInputError), 31, this.isCodeSubmitting), 31, this.codeVerified), this.codeErrorMessage, 31), 31, this.coachPhoneNumber), 31, this.isStartingTextingWhoop), 31, this.isTextingWhoopError), 31, this.destinationPhoneNumber), 31, this.isPhoneNumberError);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsFetchingDestinationPhoneNumber() {
        return this.isFetchingDestinationPhoneNumber;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsPhoneInputError() {
        return this.isPhoneInputError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsPhoneNumberError() {
        return this.isPhoneNumberError;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsPhoneSubmitting() {
        return this.isPhoneSubmitting;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsStartingTextingWhoop() {
        return this.isStartingTextingWhoop;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsTextingWhoopError() {
        return this.isTextingWhoopError;
    }

    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.maskedPhoneNumber;
        boolean z4 = this.isPhoneSubmitting;
        boolean z13 = this.phoneSubmitSuccess;
        boolean z14 = this.isPhoneInputError;
        boolean z15 = this.isCodeSubmitting;
        boolean z16 = this.codeVerified;
        TextResource textResource = this.codeErrorMessage;
        String str3 = this.coachPhoneNumber;
        boolean z17 = this.isStartingTextingWhoop;
        boolean z18 = this.isTextingWhoopError;
        String str4 = this.destinationPhoneNumber;
        boolean z19 = this.isPhoneNumberError;
        boolean z24 = this.isFetchingDestinationPhoneNumber;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SmsSetupViewState(phoneNumber=", str, ", maskedPhoneNumber=", str2, ", isPhoneSubmitting=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", phoneSubmitSuccess=", z13, ", isPhoneInputError=");
        AbstractC38963t7.m124392v(sbM32001t, z14, ", isCodeSubmitting=", z15, ", codeVerified=");
        AbstractC21702c.m61144o(textResource, ", codeErrorMessage=", ", coachPhoneNumber=", sbM32001t, z16);
        AbstractC38963t7.m124390t(sbM32001t, str3, ", isStartingTextingWhoop=", z17, ", isTextingWhoopError=");
        AbstractC38963t7.m124391u(sbM32001t, z18, ", destinationPhoneNumber=", str4, ", isPhoneNumberError=");
        return AbstractC36095b.m114682j(sbM32001t, z19, ", isFetchingDestinationPhoneNumber=", z24, ")");
    }

    public /* synthetic */ C12010b(String str, String str2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, TextResource textResource, String str3, boolean z17, boolean z18, String str4, boolean z19, boolean z24, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16, (i13 & 128) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 256) != 0 ? "" : str3, (i13 & 512) != 0 ? false : z17, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z18, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? str4 : "", (i13 & 4096) != 0 ? false : z19, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z24);
    }
}
