package aa2;

import com.whoop.domain.model.FitnessLevel;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.UnitSystem;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u001f\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b&\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b/\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b3\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b\"\u00108¨\u00069"}, m65681d2 = {"Laa2/i;", "", "", "id", "Lcom/whoop/domain/model/Gender;", "gender", "", "height", "weight", "Lorg/joda/time/LocalDate;", "birthday", "", "timeZoneOffset", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "Lcom/whoop/domain/model/FitnessLevel;", "fitnessLevel", "maxHeartRate", "minHeartRate", "physiologicalBaseline", "", "canUploadData", "<init>", "(ILcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "Lcom/whoop/domain/model/Gender;", "d", "()Lcom/whoop/domain/model/Gender;", "c", "F", "e", "()F", "l", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "Ljava/lang/String;", "j", "g", "Lcom/whoop/domain/model/UnitSystem;", "k", "()Lcom/whoop/domain/model/UnitSystem;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/domain/model/FitnessLevel;", "()Lcom/whoop/domain/model/FitnessLevel;", "i", "Z", "()Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0600i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Gender gender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final LocalDate birthday;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String timeZoneOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FitnessLevel fitnessLevel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int maxHeartRate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int minHeartRate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String physiologicalBaseline;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean canUploadData;

    public C0600i(int i13, Gender gender, float f13, float f14, LocalDate birthday, String timeZoneOffset, UnitSystem unitSystem, FitnessLevel fitnessLevel, int i14, int i15, String str, boolean z4) {
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        this.id = i13;
        this.gender = gender;
        this.height = f13;
        this.weight = f14;
        this.birthday = birthday;
        this.timeZoneOffset = timeZoneOffset;
        this.unitSystem = unitSystem;
        this.fitnessLevel = fitnessLevel;
        this.maxHeartRate = i14;
        this.minHeartRate = i15;
        this.physiologicalBaseline = str;
        this.canUploadData = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FitnessLevel getFitnessLevel() {
        return this.fitnessLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0600i)) {
            return false;
        }
        C0600i c0600i = (C0600i) other;
        return this.id == c0600i.id && this.gender == c0600i.gender && Float.compare(this.height, c0600i.height) == 0 && Float.compare(this.weight, c0600i.weight) == 0 && AbstractC22676k.m65745e(this.birthday, c0600i.birthday) && AbstractC22676k.m65745e(this.timeZoneOffset, c0600i.timeZoneOffset) && this.unitSystem == c0600i.unitSystem && this.fitnessLevel == c0600i.fitnessLevel && this.maxHeartRate == c0600i.maxHeartRate && this.minHeartRate == c0600i.minHeartRate && AbstractC22676k.m65745e(this.physiologicalBaseline, c0600i.physiologicalBaseline) && this.canUploadData == c0600i.canUploadData;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.minHeartRate, AbstractC11266d.m30448b(this.maxHeartRate, (this.fitnessLevel.hashCode() + ((this.unitSystem.hashCode() + AbstractC11266d.m30450d((this.birthday.hashCode() + AbstractC11266d.m30447a(this.weight, AbstractC11266d.m30447a(this.height, (this.gender.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31)) * 31, 31, this.timeZoneOffset)) * 31)) * 31, 31), 31);
        String str = this.physiologicalBaseline;
        return Boolean.hashCode(this.canUploadData) + ((iM30448b + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public String toString() {
        int i13 = this.id;
        Gender gender = this.gender;
        float f13 = this.height;
        float f14 = this.weight;
        LocalDate localDate = this.birthday;
        String str = this.timeZoneOffset;
        UnitSystem unitSystem = this.unitSystem;
        FitnessLevel fitnessLevel = this.fitnessLevel;
        int i14 = this.maxHeartRate;
        int i15 = this.minHeartRate;
        String str2 = this.physiologicalBaseline;
        boolean z4 = this.canUploadData;
        StringBuilder sb4 = new StringBuilder("UserProfileEntity(id=");
        sb4.append(i13);
        sb4.append(", gender=");
        sb4.append(gender);
        sb4.append(", height=");
        AbstractC30802r.m94772u(sb4, f13, ", weight=", f14, ", birthday=");
        sb4.append(localDate);
        sb4.append(", timeZoneOffset=");
        sb4.append(str);
        sb4.append(", unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", fitnessLevel=");
        sb4.append(fitnessLevel);
        sb4.append(", maxHeartRate=");
        AbstractC30802r.m94773v(sb4, i14, ", minHeartRate=", i15, ", physiologicalBaseline=");
        return AbstractC21702c.m61137h(sb4, str2, ", canUploadData=", z4, ")");
    }
}
