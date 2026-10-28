package com.whoop.domain.model;

import ih0.AbstractC18489d0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003Jy\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0014\u00106\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\u0010HÖ\u0081\u0004J\n\u00109\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006:"}, m65681d2 = {"Lcom/whoop/domain/model/UserProfile;", "", "gender", "Lcom/whoop/domain/model/Gender;", "height", "", "weight", "birthday", "Lorg/joda/time/LocalDate;", "timeZoneOffset", "", "unitSystem", "Lcom/whoop/domain/model/UnitSystem;", "fitnessLevel", "Lcom/whoop/domain/model/FitnessLevel;", "maxHeartRate", "", "minHeartRate", "physiologicalBaseline", "canUploadData", "", "<init>", "(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V", "getGender", "()Lcom/whoop/domain/model/Gender;", "getHeight", "()F", "getWeight", "getBirthday", "()Lorg/joda/time/LocalDate;", "getTimeZoneOffset", "()Ljava/lang/String;", "getUnitSystem", "()Lcom/whoop/domain/model/UnitSystem;", "getFitnessLevel", "()Lcom/whoop/domain/model/FitnessLevel;", "getMaxHeartRate", "()I", "getMinHeartRate", "getPhysiologicalBaseline", "getCanUploadData", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserProfile {
    private final LocalDate birthday;
    private final boolean canUploadData;
    private final FitnessLevel fitnessLevel;
    private final Gender gender;
    private final float height;
    private final int maxHeartRate;
    private final int minHeartRate;
    private final String physiologicalBaseline;
    private final String timeZoneOffset;
    private final UnitSystem unitSystem;
    private final float weight;

    public UserProfile(Gender gender, float f13, float f14, LocalDate birthday, String timeZoneOffset, UnitSystem unitSystem, FitnessLevel fitnessLevel, int i13, int i14, String str, boolean z4) {
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        this.gender = gender;
        this.height = f13;
        this.weight = f14;
        this.birthday = birthday;
        this.timeZoneOffset = timeZoneOffset;
        this.unitSystem = unitSystem;
        this.fitnessLevel = fitnessLevel;
        this.maxHeartRate = i13;
        this.minHeartRate = i14;
        this.physiologicalBaseline = str;
        this.canUploadData = z4;
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, Gender gender, float f13, float f14, LocalDate localDate, String str, UnitSystem unitSystem, FitnessLevel fitnessLevel, int i13, int i14, String str2, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            gender = userProfile.gender;
        }
        if ((i15 & 2) != 0) {
            f13 = userProfile.height;
        }
        if ((i15 & 4) != 0) {
            f14 = userProfile.weight;
        }
        if ((i15 & 8) != 0) {
            localDate = userProfile.birthday;
        }
        if ((i15 & 16) != 0) {
            str = userProfile.timeZoneOffset;
        }
        if ((i15 & 32) != 0) {
            unitSystem = userProfile.unitSystem;
        }
        if ((i15 & 64) != 0) {
            fitnessLevel = userProfile.fitnessLevel;
        }
        if ((i15 & 128) != 0) {
            i13 = userProfile.maxHeartRate;
        }
        if ((i15 & 256) != 0) {
            i14 = userProfile.minHeartRate;
        }
        if ((i15 & 512) != 0) {
            str2 = userProfile.physiologicalBaseline;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z4 = userProfile.canUploadData;
        }
        String str3 = str2;
        boolean z13 = z4;
        int i16 = i13;
        int i17 = i14;
        UnitSystem unitSystem2 = unitSystem;
        FitnessLevel fitnessLevel2 = fitnessLevel;
        String str4 = str;
        float f15 = f14;
        return userProfile.copy(gender, f13, f15, localDate, str4, unitSystem2, fitnessLevel2, i16, i17, str3, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FitnessLevel getFitnessLevel() {
        return this.fitnessLevel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final UserProfile copy(Gender gender, float height, float weight, LocalDate birthday, String timeZoneOffset, UnitSystem unitSystem, FitnessLevel fitnessLevel, int maxHeartRate, int minHeartRate, String physiologicalBaseline, boolean canUploadData) {
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        return new UserProfile(gender, height, weight, birthday, timeZoneOffset, unitSystem, fitnessLevel, maxHeartRate, minHeartRate, physiologicalBaseline, canUploadData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return this.gender == userProfile.gender && Float.compare(this.height, userProfile.height) == 0 && Float.compare(this.weight, userProfile.weight) == 0 && AbstractC22676k.m65745e(this.birthday, userProfile.birthday) && AbstractC22676k.m65745e(this.timeZoneOffset, userProfile.timeZoneOffset) && this.unitSystem == userProfile.unitSystem && this.fitnessLevel == userProfile.fitnessLevel && this.maxHeartRate == userProfile.maxHeartRate && this.minHeartRate == userProfile.minHeartRate && AbstractC22676k.m65745e(this.physiologicalBaseline, userProfile.physiologicalBaseline) && this.canUploadData == userProfile.canUploadData;
    }

    public final LocalDate getBirthday() {
        return this.birthday;
    }

    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    public final FitnessLevel getFitnessLevel() {
        return this.fitnessLevel;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final float getHeight() {
        return this.height;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.minHeartRate, AbstractC11266d.m30448b(this.maxHeartRate, (this.fitnessLevel.hashCode() + ((this.unitSystem.hashCode() + AbstractC11266d.m30450d((this.birthday.hashCode() + AbstractC11266d.m30447a(this.weight, AbstractC11266d.m30447a(this.height, this.gender.hashCode() * 31, 31), 31)) * 31, 31, this.timeZoneOffset)) * 31)) * 31, 31), 31);
        String str = this.physiologicalBaseline;
        return Boolean.hashCode(this.canUploadData) + ((iM30448b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        Gender gender = this.gender;
        float f13 = this.height;
        float f14 = this.weight;
        LocalDate localDate = this.birthday;
        String str = this.timeZoneOffset;
        UnitSystem unitSystem = this.unitSystem;
        FitnessLevel fitnessLevel = this.fitnessLevel;
        int i13 = this.maxHeartRate;
        int i14 = this.minHeartRate;
        String str2 = this.physiologicalBaseline;
        boolean z4 = this.canUploadData;
        StringBuilder sb4 = new StringBuilder("UserProfile(gender=");
        sb4.append(gender);
        sb4.append(", height=");
        sb4.append(f13);
        sb4.append(", weight=");
        sb4.append(f14);
        sb4.append(", birthday=");
        sb4.append(localDate);
        sb4.append(", timeZoneOffset=");
        sb4.append(str);
        sb4.append(", unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", fitnessLevel=");
        sb4.append(fitnessLevel);
        sb4.append(", maxHeartRate=");
        sb4.append(i13);
        sb4.append(", minHeartRate=");
        AbstractC11895b.m31979B(i14, ", physiologicalBaseline=", str2, ", canUploadData=", sb4);
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ UserProfile(Gender gender, float f13, float f14, LocalDate localDate, String str, UnitSystem unitSystem, FitnessLevel fitnessLevel, int i13, int i14, String str2, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(gender, f13, f14, localDate, str, unitSystem, fitnessLevel, i13, i14, (i15 & 512) != 0 ? null : str2, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4);
    }
}
