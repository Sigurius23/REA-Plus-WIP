package com.whoop.service.network.model;

import ih0.AbstractC18489d0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003Jy\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\rHÖ\u0081\u0004J\n\u00101\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m65681d2 = {"Lcom/whoop/service/network/model/ProfileDto;", "", "height", "", "weight", "birthday", "", "gender", "unitSystem", "fitnessLevel", "timezoneOffset", "physiologicalBaseline", "maxHeartRate", "", "minHeartRate", "canUploadData", "", "<init>", "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getHeight", "()F", "getWeight", "getBirthday", "()Ljava/lang/String;", "getGender", "getUnitSystem", "getFitnessLevel", "getTimezoneOffset", "getPhysiologicalBaseline", "getMaxHeartRate", "()I", "getMinHeartRate", "getCanUploadData", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProfileDto {
    private final String birthday;
    private final boolean canUploadData;
    private final String fitnessLevel;
    private final String gender;
    private final float height;
    private final int maxHeartRate;
    private final int minHeartRate;
    private final String physiologicalBaseline;
    private final String timezoneOffset;
    private final String unitSystem;
    private final float weight;

    public ProfileDto() {
        this(0.0f, 0.0f, null, null, null, null, null, null, 0, 0, false, 2047, null);
    }

    public static /* synthetic */ ProfileDto copy$default(ProfileDto profileDto, float f13, float f14, String str, String str2, String str3, String str4, String str5, String str6, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f13 = profileDto.height;
        }
        if ((i15 & 2) != 0) {
            f14 = profileDto.weight;
        }
        if ((i15 & 4) != 0) {
            str = profileDto.birthday;
        }
        if ((i15 & 8) != 0) {
            str2 = profileDto.gender;
        }
        if ((i15 & 16) != 0) {
            str3 = profileDto.unitSystem;
        }
        if ((i15 & 32) != 0) {
            str4 = profileDto.fitnessLevel;
        }
        if ((i15 & 64) != 0) {
            str5 = profileDto.timezoneOffset;
        }
        if ((i15 & 128) != 0) {
            str6 = profileDto.physiologicalBaseline;
        }
        if ((i15 & 256) != 0) {
            i13 = profileDto.maxHeartRate;
        }
        if ((i15 & 512) != 0) {
            i14 = profileDto.minHeartRate;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z4 = profileDto.canUploadData;
        }
        int i16 = i14;
        boolean z13 = z4;
        String str7 = str6;
        int i17 = i13;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        String str11 = str;
        return profileDto.copy(f13, f14, str11, str2, str10, str8, str9, str7, i17, i16, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFitnessLevel() {
        return this.fitnessLevel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final ProfileDto copy(float height, float weight, String birthday, String gender, String unitSystem, String fitnessLevel, String timezoneOffset, String physiologicalBaseline, int maxHeartRate, int minHeartRate, boolean canUploadData) {
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        AbstractC22676k.m65750j(timezoneOffset, "timezoneOffset");
        return new ProfileDto(height, weight, birthday, gender, unitSystem, fitnessLevel, timezoneOffset, physiologicalBaseline, maxHeartRate, minHeartRate, canUploadData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileDto)) {
            return false;
        }
        ProfileDto profileDto = (ProfileDto) other;
        return Float.compare(this.height, profileDto.height) == 0 && Float.compare(this.weight, profileDto.weight) == 0 && AbstractC22676k.m65745e(this.birthday, profileDto.birthday) && AbstractC22676k.m65745e(this.gender, profileDto.gender) && AbstractC22676k.m65745e(this.unitSystem, profileDto.unitSystem) && AbstractC22676k.m65745e(this.fitnessLevel, profileDto.fitnessLevel) && AbstractC22676k.m65745e(this.timezoneOffset, profileDto.timezoneOffset) && AbstractC22676k.m65745e(this.physiologicalBaseline, profileDto.physiologicalBaseline) && this.maxHeartRate == profileDto.maxHeartRate && this.minHeartRate == profileDto.minHeartRate && this.canUploadData == profileDto.canUploadData;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    public final String getFitnessLevel() {
        return this.fitnessLevel;
    }

    public final String getGender() {
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

    public final String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public final String getUnitSystem() {
        return this.unitSystem;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.weight, Float.hashCode(this.height) * 31, 31), 31, this.birthday), 31, this.gender), 31, this.unitSystem), 31, this.fitnessLevel), 31, this.timezoneOffset);
        String str = this.physiologicalBaseline;
        return Boolean.hashCode(this.canUploadData) + AbstractC11266d.m30448b(this.minHeartRate, AbstractC11266d.m30448b(this.maxHeartRate, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public String toString() {
        float f13 = this.height;
        float f14 = this.weight;
        String str = this.birthday;
        String str2 = this.gender;
        String str3 = this.unitSystem;
        String str4 = this.fitnessLevel;
        String str5 = this.timezoneOffset;
        String str6 = this.physiologicalBaseline;
        int i13 = this.maxHeartRate;
        int i14 = this.minHeartRate;
        boolean z4 = this.canUploadData;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("ProfileDto(height=", f13, ", weight=", f14, ", birthday=");
        AbstractC11266d.m30444B(sbM8307t, str, ", gender=", str2, ", unitSystem=");
        AbstractC11266d.m30444B(sbM8307t, str3, ", fitnessLevel=", str4, ", timezoneOffset=");
        AbstractC11266d.m30444B(sbM8307t, str5, ", physiologicalBaseline=", str6, ", maxHeartRate=");
        AbstractC30802r.m94773v(sbM8307t, i13, ", minHeartRate=", i14, ", canUploadData=");
        return AbstractC18489d0.m53372m(sbM8307t, z4, ")");
    }

    public ProfileDto(float f13, float f14, String birthday, String gender, String unitSystem, String fitnessLevel, String timezoneOffset, String str, int i13, int i14, boolean z4) {
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        AbstractC22676k.m65750j(timezoneOffset, "timezoneOffset");
        this.height = f13;
        this.weight = f14;
        this.birthday = birthday;
        this.gender = gender;
        this.unitSystem = unitSystem;
        this.fitnessLevel = fitnessLevel;
        this.timezoneOffset = timezoneOffset;
        this.physiologicalBaseline = str;
        this.maxHeartRate = i13;
        this.minHeartRate = i14;
        this.canUploadData = z4;
    }

    public /* synthetic */ ProfileDto(float f13, float f14, String str, String str2, String str3, String str4, String str5, String str6, int i13, int i14, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0.0f : f13, (i15 & 2) != 0 ? 0.0f : f14, (i15 & 4) != 0 ? "" : str, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? "" : str4, (i15 & 64) != 0 ? "" : str5, (i15 & 128) != 0 ? null : str6, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0 : i14, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4);
    }
}
