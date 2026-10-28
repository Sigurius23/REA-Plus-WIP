package qk1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rk1.EnumC31496c;

/* JADX INFO: renamed from: qk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b)\u0010\u0016¨\u00062"}, m65681d2 = {"Lqk1/a;", "", "", "averageHr", "", "classification", "", "samples", "", "timestamp", "", "symptoms", "notes", "", "uploaded", "deleted", "pdfPresignedUrl", "protectYourPrivacyTitle", "protectYourPrivacyDescription", "<init>", "(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "I", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "J", "i", "()J", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ljava/lang/String;", "Z", "j", "()Z", "getDeleted", "k", "heart-health-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30443a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float averageHr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int classification;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<List<Integer>> samples;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> symptoms;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String notes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean uploaded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean deleted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String pdfPresignedUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String protectYourPrivacyTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String protectYourPrivacyDescription;

    /* JADX WARN: Multi-variable type inference failed */
    public C30443a(float f13, int i13, List<? extends List<Integer>> samples, long j7, List<String> symptoms, String notes, boolean z4, boolean z13, String str, String str2, String str3) {
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        AbstractC22676k.m65750j(notes, "notes");
        this.averageHr = f13;
        this.classification = i13;
        this.samples = samples;
        this.timestamp = j7;
        this.symptoms = symptoms;
        this.notes = notes;
        this.uploaded = z4;
        this.deleted = z13;
        this.pdfPresignedUrl = str;
        this.protectYourPrivacyTitle = str2;
        this.protectYourPrivacyDescription = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAverageHr() {
        return this.averageHr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getClassification() {
        return this.classification;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPdfPresignedUrl() {
        return this.pdfPresignedUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProtectYourPrivacyDescription() {
        return this.protectYourPrivacyDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30443a)) {
            return false;
        }
        C30443a c30443a = (C30443a) other;
        return Float.compare(this.averageHr, c30443a.averageHr) == 0 && this.classification == c30443a.classification && AbstractC22676k.m65745e(this.samples, c30443a.samples) && this.timestamp == c30443a.timestamp && AbstractC22676k.m65745e(this.symptoms, c30443a.symptoms) && AbstractC22676k.m65745e(this.notes, c30443a.notes) && this.uploaded == c30443a.uploaded && this.deleted == c30443a.deleted && AbstractC22676k.m65745e(this.pdfPresignedUrl, c30443a.pdfPresignedUrl) && AbstractC22676k.m65745e(this.protectYourPrivacyTitle, c30443a.protectYourPrivacyTitle) && AbstractC22676k.m65745e(this.protectYourPrivacyDescription, c30443a.protectYourPrivacyDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProtectYourPrivacyTitle() {
        return this.protectYourPrivacyTitle;
    }

    /* JADX INFO: renamed from: g */
    public final List<List<Integer>> m93121g() {
        return this.samples;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m93122h() {
        return this.symptoms;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30451e(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.classification, Float.hashCode(this.averageHr) * 31, 31), 31, this.samples), this.timestamp, 31), 31, this.symptoms), 31, this.notes), 31, this.uploaded), 31, this.deleted);
        String str = this.pdfPresignedUrl;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.protectYourPrivacyTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protectYourPrivacyDescription;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    public String toString() {
        float f13 = this.averageHr;
        int i13 = this.classification;
        List<List<Integer>> list = this.samples;
        long j7 = this.timestamp;
        List<String> list2 = this.symptoms;
        String str = this.notes;
        boolean z4 = this.uploaded;
        boolean z13 = this.deleted;
        String str2 = this.pdfPresignedUrl;
        String str3 = this.protectYourPrivacyTitle;
        String str4 = this.protectYourPrivacyDescription;
        StringBuilder sb4 = new StringBuilder("LabradorReadingDomainModel(averageHr=");
        sb4.append(f13);
        sb4.append(", classification=");
        sb4.append(i13);
        sb4.append(", samples=");
        sb4.append(list);
        sb4.append(", timestamp=");
        sb4.append(j7);
        sb4.append(", symptoms=");
        sb4.append(list2);
        sb4.append(", notes=");
        sb4.append(str);
        sb4.append(", uploaded=");
        sb4.append(z4);
        sb4.append(", deleted=");
        sb4.append(z13);
        AbstractC11266d.m30444B(sb4, ", pdfPresignedUrl=", str2, ", protectYourPrivacyTitle=", str3);
        return AbstractC2875y.m8304q(sb4, ", protectYourPrivacyDescription=", str4, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C30443a(float f13, int i13, List list, long j7, List list2, String str, boolean z4, boolean z13, String str2, String str3, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        f13 = (i14 & 1) != 0 ? 0.0f : f13;
        i13 = (i14 & 2) != 0 ? EnumC31496c.ShepherdHighHeartRate.getCheckResult() : i13;
        int i15 = i14 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(f13, i13, i15 != 0 ? c25271y : list, (i14 & 8) != 0 ? 0L : j7, (i14 & 16) != 0 ? c25271y : list2, (i14 & 32) != 0 ? "" : str, (i14 & 64) != 0 ? false : z4, (i14 & 128) != 0 ? false : z13, (i14 & 256) != 0 ? null : str2, (i14 & 512) != 0 ? null : str3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str4);
    }
}
