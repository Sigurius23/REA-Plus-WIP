package com.whoop.personalrecords.miniarch.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;", "", "", "exerciseId", "name", "imageUrl", "volumeInputValue", "volumeInputUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$personal_records_mini_arch_release", "(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExerciseId", "getName", "getImageUrl", "getVolumeInputValue", "getVolumeInputUnit", "Companion", "$serializer", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PersonalRecordsExerciseDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("exercise_id")
    private final String exerciseId;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("name")
    private final String name;

    @SerializedName("volume_input_units")
    private final String volumeInputUnit;

    @SerializedName("volume_input_value")
    private final String volumeInputValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;", "serializer", "()Lwc3/c;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PersonalRecordsExerciseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PersonalRecordsExerciseDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PersonalRecordsExerciseDto copy$default(PersonalRecordsExerciseDto personalRecordsExerciseDto, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = personalRecordsExerciseDto.exerciseId;
        }
        if ((i13 & 2) != 0) {
            str2 = personalRecordsExerciseDto.name;
        }
        if ((i13 & 4) != 0) {
            str3 = personalRecordsExerciseDto.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = personalRecordsExerciseDto.volumeInputValue;
        }
        if ((i13 & 16) != 0) {
            str5 = personalRecordsExerciseDto.volumeInputUnit;
        }
        String str6 = str5;
        String str7 = str3;
        return personalRecordsExerciseDto.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$personal_records_mini_arch_release(PersonalRecordsExerciseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.exerciseId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.exerciseId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.volumeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.volumeInputValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.volumeInputUnit == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.volumeInputUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVolumeInputValue() {
        return this.volumeInputValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVolumeInputUnit() {
        return this.volumeInputUnit;
    }

    public final PersonalRecordsExerciseDto copy(String exerciseId, String name, String imageUrl, String volumeInputValue, String volumeInputUnit) {
        return new PersonalRecordsExerciseDto(exerciseId, name, imageUrl, volumeInputValue, volumeInputUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalRecordsExerciseDto)) {
            return false;
        }
        PersonalRecordsExerciseDto personalRecordsExerciseDto = (PersonalRecordsExerciseDto) other;
        return AbstractC22676k.m65745e(this.exerciseId, personalRecordsExerciseDto.exerciseId) && AbstractC22676k.m65745e(this.name, personalRecordsExerciseDto.name) && AbstractC22676k.m65745e(this.imageUrl, personalRecordsExerciseDto.imageUrl) && AbstractC22676k.m65745e(this.volumeInputValue, personalRecordsExerciseDto.volumeInputValue) && AbstractC22676k.m65745e(this.volumeInputUnit, personalRecordsExerciseDto.volumeInputUnit);
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVolumeInputUnit() {
        return this.volumeInputUnit;
    }

    public final String getVolumeInputValue() {
        return this.volumeInputValue;
    }

    public int hashCode() {
        String str = this.exerciseId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.volumeInputValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.volumeInputUnit;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.volumeInputValue;
        String str5 = this.volumeInputUnit;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PersonalRecordsExerciseDto(exerciseId=", str, ", name=", str2, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", volumeInputValue=", str4, ", volumeInputUnit=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public /* synthetic */ PersonalRecordsExerciseDto(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.exerciseId = null;
        } else {
            this.exerciseId = str;
        }
        if ((i13 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i13 & 4) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str3;
        }
        if ((i13 & 8) == 0) {
            this.volumeInputValue = null;
        } else {
            this.volumeInputValue = str4;
        }
        if ((i13 & 16) == 0) {
            this.volumeInputUnit = null;
        } else {
            this.volumeInputUnit = str5;
        }
    }

    public PersonalRecordsExerciseDto(String str, String str2, String str3, String str4, String str5) {
        this.exerciseId = str;
        this.name = str2;
        this.imageUrl = str3;
        this.volumeInputValue = str4;
        this.volumeInputUnit = str5;
    }

    public /* synthetic */ PersonalRecordsExerciseDto(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
