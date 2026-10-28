package com.whoop.data.remote.domain.dto.gamification;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017Jp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\u0017¨\u0006B"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "", "", "levelId", "minExperience", "maxExperience", "", "tier", "badgeUrl", "miniBadgeUrl", "createdDateTime", "updatedDateTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/Integer;", "getLevelId", "getLevelId$annotations", "()V", "getMinExperience", "getMinExperience$annotations", "getMaxExperience", "getMaxExperience$annotations", "Ljava/lang/String;", "getTier", "getBadgeUrl", "getBadgeUrl$annotations", "getMiniBadgeUrl", "getMiniBadgeUrl$annotations", "getCreatedDateTime", "getCreatedDateTime$annotations", "getUpdatedDateTime", "getUpdatedDateTime$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MemberLevelDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("badge")
    private final String badgeUrl;

    @SerializedName("created_at")
    private final String createdDateTime;

    @SerializedName("level")
    private final Integer levelId;

    @SerializedName("maximum_experience")
    private final Integer maxExperience;

    @SerializedName("minimum_experience")
    private final Integer minExperience;

    @SerializedName("mini_badge")
    private final String miniBadgeUrl;

    @SerializedName("tier")
    private final String tier;

    @SerializedName("updated_at")
    private final String updatedDateTime;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MemberLevelDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemberLevelDto(int i13, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, MemberLevelDto$$serializer.INSTANCE.getDescriptor());
        }
        this.levelId = num;
        this.minExperience = num2;
        this.maxExperience = num3;
        this.tier = str;
        this.badgeUrl = str2;
        this.miniBadgeUrl = str3;
        this.createdDateTime = str4;
        this.updatedDateTime = str5;
    }

    public static /* synthetic */ MemberLevelDto copy$default(MemberLevelDto memberLevelDto, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = memberLevelDto.levelId;
        }
        if ((i13 & 2) != 0) {
            num2 = memberLevelDto.minExperience;
        }
        if ((i13 & 4) != 0) {
            num3 = memberLevelDto.maxExperience;
        }
        if ((i13 & 8) != 0) {
            str = memberLevelDto.tier;
        }
        if ((i13 & 16) != 0) {
            str2 = memberLevelDto.badgeUrl;
        }
        if ((i13 & 32) != 0) {
            str3 = memberLevelDto.miniBadgeUrl;
        }
        if ((i13 & 64) != 0) {
            str4 = memberLevelDto.createdDateTime;
        }
        if ((i13 & 128) != 0) {
            str5 = memberLevelDto.updatedDateTime;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return memberLevelDto.copy(num, num2, num3, str, str8, str9, str6, str7);
    }

    @InterfaceC37143h("badge")
    public static /* synthetic */ void getBadgeUrl$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedDateTime$annotations() {
    }

    @InterfaceC37143h("level")
    public static /* synthetic */ void getLevelId$annotations() {
    }

    @InterfaceC37143h("maximum_experience")
    public static /* synthetic */ void getMaxExperience$annotations() {
    }

    @InterfaceC37143h("minimum_experience")
    public static /* synthetic */ void getMinExperience$annotations() {
    }

    @InterfaceC37143h("mini_badge")
    public static /* synthetic */ void getMiniBadgeUrl$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedDateTime$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(MemberLevelDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.levelId);
        output.encodeNullableSerializableElement(serialDesc, 1, intSerializer, self.minExperience);
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.maxExperience);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.tier);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.badgeUrl);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.miniBadgeUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.createdDateTime);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.updatedDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLevelId() {
        return this.levelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinExperience() {
        return this.minExperience;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxExperience() {
        return this.maxExperience;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTier() {
        return this.tier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMiniBadgeUrl() {
        return this.miniBadgeUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public final MemberLevelDto copy(Integer levelId, Integer minExperience, Integer maxExperience, String tier, String badgeUrl, String miniBadgeUrl, String createdDateTime, String updatedDateTime) {
        return new MemberLevelDto(levelId, minExperience, maxExperience, tier, badgeUrl, miniBadgeUrl, createdDateTime, updatedDateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelDto)) {
            return false;
        }
        MemberLevelDto memberLevelDto = (MemberLevelDto) other;
        return AbstractC22676k.m65745e(this.levelId, memberLevelDto.levelId) && AbstractC22676k.m65745e(this.minExperience, memberLevelDto.minExperience) && AbstractC22676k.m65745e(this.maxExperience, memberLevelDto.maxExperience) && AbstractC22676k.m65745e(this.tier, memberLevelDto.tier) && AbstractC22676k.m65745e(this.badgeUrl, memberLevelDto.badgeUrl) && AbstractC22676k.m65745e(this.miniBadgeUrl, memberLevelDto.miniBadgeUrl) && AbstractC22676k.m65745e(this.createdDateTime, memberLevelDto.createdDateTime) && AbstractC22676k.m65745e(this.updatedDateTime, memberLevelDto.updatedDateTime);
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getCreatedDateTime() {
        return this.createdDateTime;
    }

    public final Integer getLevelId() {
        return this.levelId;
    }

    public final Integer getMaxExperience() {
        return this.maxExperience;
    }

    public final Integer getMinExperience() {
        return this.minExperience;
    }

    public final String getMiniBadgeUrl() {
        return this.miniBadgeUrl;
    }

    public final String getTier() {
        return this.tier;
    }

    public final String getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public int hashCode() {
        Integer num = this.levelId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minExperience;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxExperience;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.tier;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.miniBadgeUrl;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdDateTime;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.updatedDateTime;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.levelId;
        Integer num2 = this.minExperience;
        Integer num3 = this.maxExperience;
        String str = this.tier;
        String str2 = this.badgeUrl;
        String str3 = this.miniBadgeUrl;
        String str4 = this.createdDateTime;
        String str5 = this.updatedDateTime;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("MemberLevelDto(levelId=", num, ", minExperience=", num2, ", maxExperience=");
        AbstractC13673n.m38577x(num3, ", tier=", str, ", badgeUrl=", sbM114684l);
        AbstractC11266d.m30444B(sbM114684l, str2, ", miniBadgeUrl=", str3, ", createdDateTime=");
        return AbstractC11266d.m30464r(sbM114684l, str4, ", updatedDateTime=", str5, ")");
    }

    public MemberLevelDto(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        this.levelId = num;
        this.minExperience = num2;
        this.maxExperience = num3;
        this.tier = str;
        this.badgeUrl = str2;
        this.miniBadgeUrl = str3;
        this.createdDateTime = str4;
        this.updatedDateTime = str5;
    }
}
