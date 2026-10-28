package bg2;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bg2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J¶\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010'R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b,\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b*\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b(\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b2\u0010'R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b0\u0010\u001bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b/\u00105R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b7\u0010'R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b6\u0010'¨\u00068"}, m65681d2 = {"Lbg2/d;", "", "", "phoneNumber", "", "isPhoneSubmitting", "phoneSubmitSuccess", "phoneSubmitError", "isCodeSubmitting", "codeVerified", "codeSubmitError", "codeErrorMessage", "coachPhoneNumber", "isStartingTextingWhoop", "isTextingWhoopError", "destinationPhoneNumber", "", "Lbg2/a;", "contactPhoneNumbers", "prefilledBody", "isPhoneNumberError", "isFetchingDestinationPhoneNumber", "<init>", "(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZ)Lbg2/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Z", "p", "()Z", "c", "k", "d", "j", "e", "m", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "q", "r", "l", "Ljava/util/List;", "()Ljava/util/List;", "n", "o", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3231d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isPhoneSubmitting;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean phoneSubmitSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean phoneSubmitError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCodeSubmitting;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean codeVerified;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean codeSubmitError;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String codeErrorMessage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String coachPhoneNumber;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isStartingTextingWhoop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isTextingWhoopError;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String destinationPhoneNumber;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<C3228a> contactPhoneNumbers;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String prefilledBody;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isPhoneNumberError;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean isFetchingDestinationPhoneNumber;

    public C3231d(String phoneNumber, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String codeErrorMessage, String coachPhoneNumber, boolean z18, boolean z19, String destinationPhoneNumber, List<C3228a> contactPhoneNumbers, String prefilledBody, boolean z24, boolean z25) {
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        AbstractC22676k.m65750j(codeErrorMessage, "codeErrorMessage");
        AbstractC22676k.m65750j(coachPhoneNumber, "coachPhoneNumber");
        AbstractC22676k.m65750j(destinationPhoneNumber, "destinationPhoneNumber");
        AbstractC22676k.m65750j(contactPhoneNumbers, "contactPhoneNumbers");
        AbstractC22676k.m65750j(prefilledBody, "prefilledBody");
        this.phoneNumber = phoneNumber;
        this.isPhoneSubmitting = z4;
        this.phoneSubmitSuccess = z13;
        this.phoneSubmitError = z14;
        this.isCodeSubmitting = z15;
        this.codeVerified = z16;
        this.codeSubmitError = z17;
        this.codeErrorMessage = codeErrorMessage;
        this.coachPhoneNumber = coachPhoneNumber;
        this.isStartingTextingWhoop = z18;
        this.isTextingWhoopError = z19;
        this.destinationPhoneNumber = destinationPhoneNumber;
        this.contactPhoneNumbers = contactPhoneNumbers;
        this.prefilledBody = prefilledBody;
        this.isPhoneNumberError = z24;
        this.isFetchingDestinationPhoneNumber = z25;
    }

    /* JADX INFO: renamed from: a */
    public final C3231d m9335a(String phoneNumber, boolean isPhoneSubmitting, boolean phoneSubmitSuccess, boolean phoneSubmitError, boolean isCodeSubmitting, boolean codeVerified, boolean codeSubmitError, String codeErrorMessage, String coachPhoneNumber, boolean isStartingTextingWhoop, boolean isTextingWhoopError, String destinationPhoneNumber, List<C3228a> contactPhoneNumbers, String prefilledBody, boolean isPhoneNumberError, boolean isFetchingDestinationPhoneNumber) {
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        AbstractC22676k.m65750j(codeErrorMessage, "codeErrorMessage");
        AbstractC22676k.m65750j(coachPhoneNumber, "coachPhoneNumber");
        AbstractC22676k.m65750j(destinationPhoneNumber, "destinationPhoneNumber");
        AbstractC22676k.m65750j(contactPhoneNumbers, "contactPhoneNumbers");
        AbstractC22676k.m65750j(prefilledBody, "prefilledBody");
        return new C3231d(phoneNumber, isPhoneSubmitting, phoneSubmitSuccess, phoneSubmitError, isCodeSubmitting, codeVerified, codeSubmitError, codeErrorMessage, coachPhoneNumber, isStartingTextingWhoop, isTextingWhoopError, destinationPhoneNumber, contactPhoneNumbers, prefilledBody, isPhoneNumberError, isFetchingDestinationPhoneNumber);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCoachPhoneNumber() {
        return this.coachPhoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCodeErrorMessage() {
        return this.codeErrorMessage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCodeSubmitError() {
        return this.codeSubmitError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3231d)) {
            return false;
        }
        C3231d c3231d = (C3231d) other;
        return AbstractC22676k.m65745e(this.phoneNumber, c3231d.phoneNumber) && this.isPhoneSubmitting == c3231d.isPhoneSubmitting && this.phoneSubmitSuccess == c3231d.phoneSubmitSuccess && this.phoneSubmitError == c3231d.phoneSubmitError && this.isCodeSubmitting == c3231d.isCodeSubmitting && this.codeVerified == c3231d.codeVerified && this.codeSubmitError == c3231d.codeSubmitError && AbstractC22676k.m65745e(this.codeErrorMessage, c3231d.codeErrorMessage) && AbstractC22676k.m65745e(this.coachPhoneNumber, c3231d.coachPhoneNumber) && this.isStartingTextingWhoop == c3231d.isStartingTextingWhoop && this.isTextingWhoopError == c3231d.isTextingWhoopError && AbstractC22676k.m65745e(this.destinationPhoneNumber, c3231d.destinationPhoneNumber) && AbstractC22676k.m65745e(this.contactPhoneNumbers, c3231d.contactPhoneNumbers) && AbstractC22676k.m65745e(this.prefilledBody, c3231d.prefilledBody) && this.isPhoneNumberError == c3231d.isPhoneNumberError && this.isFetchingDestinationPhoneNumber == c3231d.isFetchingDestinationPhoneNumber;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCodeVerified() {
        return this.codeVerified;
    }

    /* JADX INFO: renamed from: g */
    public final List<C3228a> m9340g() {
        return this.contactPhoneNumbers;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFetchingDestinationPhoneNumber) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.phoneNumber.hashCode() * 31, 31, this.isPhoneSubmitting), 31, this.phoneSubmitSuccess), 31, this.phoneSubmitError), 31, this.isCodeSubmitting), 31, this.codeVerified), 31, this.codeSubmitError), 31, this.codeErrorMessage), 31, this.coachPhoneNumber), 31, this.isStartingTextingWhoop), 31, this.isTextingWhoopError), 31, this.destinationPhoneNumber), 31, this.contactPhoneNumbers), 31, this.prefilledBody), 31, this.isPhoneNumberError);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPhoneSubmitError() {
        return this.phoneSubmitError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getPhoneSubmitSuccess() {
        return this.phoneSubmitSuccess;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPrefilledBody() {
        return this.prefilledBody;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsCodeSubmitting() {
        return this.isCodeSubmitting;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsFetchingDestinationPhoneNumber() {
        return this.isFetchingDestinationPhoneNumber;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsPhoneNumberError() {
        return this.isPhoneNumberError;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsPhoneSubmitting() {
        return this.isPhoneSubmitting;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsStartingTextingWhoop() {
        return this.isStartingTextingWhoop;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsTextingWhoopError() {
        return this.isTextingWhoopError;
    }

    public String toString() {
        String str = this.phoneNumber;
        boolean z4 = this.isPhoneSubmitting;
        boolean z13 = this.phoneSubmitSuccess;
        boolean z14 = this.phoneSubmitError;
        boolean z15 = this.isCodeSubmitting;
        boolean z16 = this.codeVerified;
        boolean z17 = this.codeSubmitError;
        String str2 = this.codeErrorMessage;
        String str3 = this.coachPhoneNumber;
        boolean z18 = this.isStartingTextingWhoop;
        boolean z19 = this.isTextingWhoopError;
        String str4 = this.destinationPhoneNumber;
        List<C3228a> list = this.contactPhoneNumbers;
        String str5 = this.prefilledBody;
        boolean z24 = this.isPhoneNumberError;
        boolean z25 = this.isFetchingDestinationPhoneNumber;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("SmsSetupDomainState(phoneNumber=", str, ", isPhoneSubmitting=", ", phoneSubmitSuccess=", z4);
        AbstractC38963t7.m124392v(sbM73379l, z13, ", phoneSubmitError=", z14, ", isCodeSubmitting=");
        AbstractC38963t7.m124392v(sbM73379l, z15, ", codeVerified=", z16, ", codeSubmitError=");
        AbstractC38963t7.m124391u(sbM73379l, z17, ", codeErrorMessage=", str2, ", coachPhoneNumber=");
        AbstractC38963t7.m124390t(sbM73379l, str3, ", isStartingTextingWhoop=", z18, ", isTextingWhoopError=");
        AbstractC38963t7.m124391u(sbM73379l, z19, ", destinationPhoneNumber=", str4, ", contactPhoneNumbers=");
        AbstractC17176i.m48511m(", prefilledBody=", str5, ", isPhoneNumberError=", sbM73379l, list);
        return AbstractC36095b.m114682j(sbM73379l, z24, ", isFetchingDestinationPhoneNumber=", z25, ")");
    }

    public /* synthetic */ C3231d(String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str2, String str3, boolean z18, boolean z19, String str4, List list, String str5, boolean z24, boolean z25, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? false : z16, (i13 & 64) != 0 ? false : z17, (i13 & 128) != 0 ? "" : str2, (i13 & 256) != 0 ? "" : str3, (i13 & 512) != 0 ? false : z18, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z19, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str4, (i13 & 4096) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? str5 : "", (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z24, (i13 & 32768) != 0 ? false : z25);
    }
}
