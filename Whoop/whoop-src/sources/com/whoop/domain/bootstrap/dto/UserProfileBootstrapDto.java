package com.whoop.domain.bootstrap.dto;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010 Jb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010 R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010 R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b6\u0010 R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b7\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b8\u0010 ¨\u0006<"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "", "", "height", "weight", "", "birthday", "gender", "unitSystem", "fitnessLevel", "timezoneOffset", "physiologicalBaseline", "<init>", "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "copy", "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getHeight", "getWeight", "Ljava/lang/String;", "getBirthday", "getGender", "getUnitSystem", "getFitnessLevel", "getTimezoneOffset", "getPhysiologicalBaseline", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserProfileBootstrapDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("birthday")
    private final String birthday;

    @SerializedName("fitness_level")
    private final String fitnessLevel;

    @SerializedName("gender")
    private final String gender;

    @SerializedName("height")
    private final float height;

    @SerializedName("physiological_baseline")
    private final String physiologicalBaseline;

    @SerializedName("timezone_offset")
    private final String timezoneOffset;

    @SerializedName("unit_system")
    private final String unitSystem;

    @SerializedName("weight")
    private final float weight;

    /* JADX INFO: renamed from: com.whoop.domain.bootstrap.dto.UserProfileBootstrapDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserProfileBootstrapDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserProfileBootstrapDto() {
        this(0.0f, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserProfileBootstrapDto copy$default(UserProfileBootstrapDto userProfileBootstrapDto, float f13, float f14, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = userProfileBootstrapDto.height;
        }
        if ((i13 & 2) != 0) {
            f14 = userProfileBootstrapDto.weight;
        }
        if ((i13 & 4) != 0) {
            str = userProfileBootstrapDto.birthday;
        }
        if ((i13 & 8) != 0) {
            str2 = userProfileBootstrapDto.gender;
        }
        if ((i13 & 16) != 0) {
            str3 = userProfileBootstrapDto.unitSystem;
        }
        if ((i13 & 32) != 0) {
            str4 = userProfileBootstrapDto.fitnessLevel;
        }
        if ((i13 & 64) != 0) {
            str5 = userProfileBootstrapDto.timezoneOffset;
        }
        if ((i13 & 128) != 0) {
            str6 = userProfileBootstrapDto.physiologicalBaseline;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return userProfileBootstrapDto.copy(f13, f14, str, str2, str9, str10, str7, str8);
    }

    public static final /* synthetic */ void write$Self$core_release(UserProfileBootstrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Float.compare(self.height, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 0, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Float.compare(self.weight, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 1, self.weight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.birthday, "")) {
            output.encodeStringElement(serialDesc, 2, self.birthday);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.gender, "")) {
            output.encodeStringElement(serialDesc, 3, self.gender);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.unitSystem, "")) {
            output.encodeStringElement(serialDesc, 4, self.unitSystem);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.fitnessLevel, "")) {
            output.encodeStringElement(serialDesc, 5, self.fitnessLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.timezoneOffset, "")) {
            output.encodeStringElement(serialDesc, 6, self.timezoneOffset);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.physiologicalBaseline == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.physiologicalBaseline);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
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

    public final UserProfileBootstrapDto copy(float height, float weight, String birthday, String gender, String unitSystem, String fitnessLevel, String timezoneOffset, String physiologicalBaseline) {
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        AbstractC22676k.m65750j(timezoneOffset, "timezoneOffset");
        return new UserProfileBootstrapDto(height, weight, birthday, gender, unitSystem, fitnessLevel, timezoneOffset, physiologicalBaseline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileBootstrapDto)) {
            return false;
        }
        UserProfileBootstrapDto userProfileBootstrapDto = (UserProfileBootstrapDto) other;
        return Float.compare(this.height, userProfileBootstrapDto.height) == 0 && Float.compare(this.weight, userProfileBootstrapDto.weight) == 0 && AbstractC22676k.m65745e(this.birthday, userProfileBootstrapDto.birthday) && AbstractC22676k.m65745e(this.gender, userProfileBootstrapDto.gender) && AbstractC22676k.m65745e(this.unitSystem, userProfileBootstrapDto.unitSystem) && AbstractC22676k.m65745e(this.fitnessLevel, userProfileBootstrapDto.fitnessLevel) && AbstractC22676k.m65745e(this.timezoneOffset, userProfileBootstrapDto.timezoneOffset) && AbstractC22676k.m65745e(this.physiologicalBaseline, userProfileBootstrapDto.physiologicalBaseline);
    }

    public final String getBirthday() {
        return this.birthday;
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
        return iM30450d + (str == null ? 0 : str.hashCode());
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
        StringBuilder sbM8307t = AbstractC2875y.m8307t("UserProfileBootstrapDto(height=", f13, ", weight=", f14, ", birthday=");
        AbstractC11266d.m30444B(sbM8307t, str, ", gender=", str2, ", unitSystem=");
        AbstractC11266d.m30444B(sbM8307t, str3, ", fitnessLevel=", str4, ", timezoneOffset=");
        return AbstractC11266d.m30464r(sbM8307t, str5, ", physiologicalBaseline=", str6, ")");
    }

    public UserProfileBootstrapDto(float f13, float f14, String birthday, String gender, String unitSystem, String fitnessLevel, String timezoneOffset, String str) {
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
    }

    public /* synthetic */ UserProfileBootstrapDto(int i13, float f13, float f14, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.height = 0.0f;
        } else {
            this.height = f13;
        }
        if ((i13 & 2) == 0) {
            this.weight = 0.0f;
        } else {
            this.weight = f14;
        }
        if ((i13 & 4) == 0) {
            this.birthday = "";
        } else {
            this.birthday = str;
        }
        if ((i13 & 8) == 0) {
            this.gender = "";
        } else {
            this.gender = str2;
        }
        if ((i13 & 16) == 0) {
            this.unitSystem = "";
        } else {
            this.unitSystem = str3;
        }
        if ((i13 & 32) == 0) {
            this.fitnessLevel = "";
        } else {
            this.fitnessLevel = str4;
        }
        if ((i13 & 64) == 0) {
            this.timezoneOffset = "";
        } else {
            this.timezoneOffset = str5;
        }
        if ((i13 & 128) == 0) {
            this.physiologicalBaseline = null;
        } else {
            this.physiologicalBaseline = str6;
        }
    }

    public /* synthetic */ UserProfileBootstrapDto(float f13, float f14, String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? null : str6);
    }
}
