package ld0;

import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ld0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b0\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b'\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b.\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b*\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b8\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b#\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b5\u0010<¨\u0006="}, m65681d2 = {"Lld0/d;", "Lm91/u;", "Lld0/t;", "header", "", "dateLabel", "dateValue", "timeLabel", "timeValue", "locationLabel", "locationValue", "confirmationLabel", "confirmationValue", "referenceIdLabel", "referenceIdValue", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "confirmationNumberBottomSheet", "referenceNumberBottomSheet", "Lgz0/m0;", "confirmationIcon", "referenceIcon", "Ly81/f;", "referenceIdColor", "<init>", "(Lld0/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lgz0/m0;Lgz0/m0;Ly81/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lld0/t;", "b", "Ljava/lang/String;", "f", "c", "g", "d", "p", "e", "q", "i", "j", "m", "k", "n", "l", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "o", "Lgz0/m0;", "()Lgz0/m0;", "Ly81/f;", "()Ly81/f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23845d implements InterfaceC25312u {

    /* JADX INFO: renamed from: q */
    public static final int f94314q = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23861t header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dateLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dateValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String timeLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String timeValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String locationLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String locationValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String confirmationLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String confirmationValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String referenceIdLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String referenceIdValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AppointmentSummaryBottomSheet confirmationNumberBottomSheet;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AppointmentSummaryBottomSheet referenceNumberBottomSheet;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC16313m0 confirmationIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC16313m0 referenceIcon;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final EnumC39333f referenceIdColor;

    public C23845d(C23861t c23861t, String dateLabel, String dateValue, String timeLabel, String timeValue, String locationLabel, String locationValue, String confirmationLabel, String confirmationValue, String str, String str2, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, EnumC39333f referenceIdColor) {
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(dateValue, "dateValue");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(timeValue, "timeValue");
        AbstractC22676k.m65750j(locationLabel, "locationLabel");
        AbstractC22676k.m65750j(locationValue, "locationValue");
        AbstractC22676k.m65750j(confirmationLabel, "confirmationLabel");
        AbstractC22676k.m65750j(confirmationValue, "confirmationValue");
        AbstractC22676k.m65750j(referenceIdColor, "referenceIdColor");
        this.header = c23861t;
        this.dateLabel = dateLabel;
        this.dateValue = dateValue;
        this.timeLabel = timeLabel;
        this.timeValue = timeValue;
        this.locationLabel = locationLabel;
        this.locationValue = locationValue;
        this.confirmationLabel = confirmationLabel;
        this.confirmationValue = confirmationValue;
        this.referenceIdLabel = str;
        this.referenceIdValue = str2;
        this.confirmationNumberBottomSheet = appointmentSummaryBottomSheet;
        this.referenceNumberBottomSheet = appointmentSummaryBottomSheet2;
        this.confirmationIcon = enumC16313m0;
        this.referenceIcon = enumC16313m1;
        this.referenceIdColor = referenceIdColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getConfirmationIcon() {
        return this.confirmationIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConfirmationLabel() {
        return this.confirmationLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AppointmentSummaryBottomSheet getConfirmationNumberBottomSheet() {
        return this.confirmationNumberBottomSheet;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getConfirmationValue() {
        return this.confirmationValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23845d)) {
            return false;
        }
        C23845d c23845d = (C23845d) other;
        return AbstractC22676k.m65745e(this.header, c23845d.header) && AbstractC22676k.m65745e(this.dateLabel, c23845d.dateLabel) && AbstractC22676k.m65745e(this.dateValue, c23845d.dateValue) && AbstractC22676k.m65745e(this.timeLabel, c23845d.timeLabel) && AbstractC22676k.m65745e(this.timeValue, c23845d.timeValue) && AbstractC22676k.m65745e(this.locationLabel, c23845d.locationLabel) && AbstractC22676k.m65745e(this.locationValue, c23845d.locationValue) && AbstractC22676k.m65745e(this.confirmationLabel, c23845d.confirmationLabel) && AbstractC22676k.m65745e(this.confirmationValue, c23845d.confirmationValue) && AbstractC22676k.m65745e(this.referenceIdLabel, c23845d.referenceIdLabel) && AbstractC22676k.m65745e(this.referenceIdValue, c23845d.referenceIdValue) && AbstractC22676k.m65745e(this.confirmationNumberBottomSheet, c23845d.confirmationNumberBottomSheet) && AbstractC22676k.m65745e(this.referenceNumberBottomSheet, c23845d.referenceNumberBottomSheet) && this.confirmationIcon == c23845d.confirmationIcon && this.referenceIcon == c23845d.referenceIcon && this.referenceIdColor == c23845d.referenceIdColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDateValue() {
        return this.dateValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C23861t getHeader() {
        return this.header;
    }

    public int hashCode() {
        C23861t c23861t = this.header;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((c23861t == null ? 0 : c23861t.hashCode()) * 31, 31, this.dateLabel), 31, this.dateValue), 31, this.timeLabel), 31, this.timeValue), 31, this.locationLabel), 31, this.locationValue), 31, this.confirmationLabel), 31, this.confirmationValue);
        String str = this.referenceIdLabel;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceIdValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet = this.confirmationNumberBottomSheet;
        int iHashCode3 = (iHashCode2 + (appointmentSummaryBottomSheet == null ? 0 : appointmentSummaryBottomSheet.hashCode())) * 31;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2 = this.referenceNumberBottomSheet;
        int iHashCode4 = (iHashCode3 + (appointmentSummaryBottomSheet2 == null ? 0 : appointmentSummaryBottomSheet2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.confirmationIcon;
        int iHashCode5 = (iHashCode4 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.referenceIcon;
        return this.referenceIdColor.hashCode() + ((iHashCode5 + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLocationLabel() {
        return this.locationLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLocationValue() {
        return this.locationValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC16313m0 getReferenceIcon() {
        return this.referenceIcon;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC39333f getReferenceIdColor() {
        return this.referenceIdColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getReferenceIdLabel() {
        return this.referenceIdLabel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getReferenceIdValue() {
        return this.referenceIdValue;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final AppointmentSummaryBottomSheet getReferenceNumberBottomSheet() {
        return this.referenceNumberBottomSheet;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTimeValue() {
        return this.timeValue;
    }

    public String toString() {
        C23861t c23861t = this.header;
        String str = this.dateLabel;
        String str2 = this.dateValue;
        String str3 = this.timeLabel;
        String str4 = this.timeValue;
        String str5 = this.locationLabel;
        String str6 = this.locationValue;
        String str7 = this.confirmationLabel;
        String str8 = this.confirmationValue;
        String str9 = this.referenceIdLabel;
        String str10 = this.referenceIdValue;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet = this.confirmationNumberBottomSheet;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2 = this.referenceNumberBottomSheet;
        EnumC16313m0 enumC16313m0 = this.confirmationIcon;
        EnumC16313m0 enumC16313m1 = this.referenceIcon;
        EnumC39333f enumC39333f = this.referenceIdColor;
        StringBuilder sb4 = new StringBuilder("AppointmentSummaryViewState(header=");
        sb4.append(c23861t);
        sb4.append(", dateLabel=");
        sb4.append(str);
        sb4.append(", dateValue=");
        AbstractC11266d.m30444B(sb4, str2, ", timeLabel=", str3, ", timeValue=");
        AbstractC11266d.m30444B(sb4, str4, ", locationLabel=", str5, ", locationValue=");
        AbstractC11266d.m30444B(sb4, str6, ", confirmationLabel=", str7, ", confirmationValue=");
        AbstractC11266d.m30444B(sb4, str8, ", referenceIdLabel=", str9, ", referenceIdValue=");
        sb4.append(str10);
        sb4.append(", confirmationNumberBottomSheet=");
        sb4.append(appointmentSummaryBottomSheet);
        sb4.append(", referenceNumberBottomSheet=");
        sb4.append(appointmentSummaryBottomSheet2);
        sb4.append(", confirmationIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", referenceIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", referenceIdColor=");
        sb4.append(enumC39333f);
        sb4.append(")");
        return sb4.toString();
    }
}
