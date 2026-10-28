package vs1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vs1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b&\u0010!R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b\u001e\u0010*¨\u0006+"}, m65681d2 = {"Lvs1/a;", "", "", "averageHr", "", "classification", "", "samples", "", "timeStamp", "", "symptoms", "notes", "", "uploaded", "deleted", "<init>", "(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "I", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "J", "g", "()J", "f", "Ljava/lang/String;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36472a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float averageHr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int classification;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<List<Integer>> samples;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> symptoms;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String notes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean uploaded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean deleted;

    /* JADX WARN: Multi-variable type inference failed */
    public C36472a(float f13, int i13, List<? extends List<Integer>> samples, long j7, List<String> symptoms, String notes, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        AbstractC22676k.m65750j(notes, "notes");
        this.averageHr = f13;
        this.classification = i13;
        this.samples = samples;
        this.timeStamp = j7;
        this.symptoms = symptoms;
        this.notes = notes;
        this.uploaded = z4;
        this.deleted = z13;
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
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: e */
    public final List<List<Integer>> m116832e() {
        return this.samples;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36472a)) {
            return false;
        }
        C36472a c36472a = (C36472a) other;
        return Float.compare(this.averageHr, c36472a.averageHr) == 0 && this.classification == c36472a.classification && AbstractC22676k.m65745e(this.samples, c36472a.samples) && this.timeStamp == c36472a.timeStamp && AbstractC22676k.m65745e(this.symptoms, c36472a.symptoms) && AbstractC22676k.m65745e(this.notes, c36472a.notes) && this.uploaded == c36472a.uploaded && this.deleted == c36472a.deleted;
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m116833f() {
        return this.symptoms;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30451e(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.classification, Float.hashCode(this.averageHr) * 31, 31), 31, this.samples), this.timeStamp, 31), 31, this.symptoms), 31, this.notes), 31, this.uploaded);
    }

    public String toString() {
        return "LabradorReadingResultDto(averageHr=" + this.averageHr + ", classification=" + this.classification + ", samples=" + this.samples + ", timeStamp=" + this.timeStamp + ", symptoms=" + this.symptoms + ", notes=" + this.notes + ", uploaded=" + this.uploaded + ", deleted=" + this.deleted + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36472a(float f13, int i13, List list, long j7, List list2, String str, boolean z4, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15 = i14 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(f13, i13, i15 != 0 ? c25271y : list, j7, (i14 & 16) != 0 ? c25271y : list2, str, z4, z13);
    }
}
