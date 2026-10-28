package com.whoop.data.remote.domain.dto.gamification;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\tHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;", "", "id", "", "userId", "memberExperience", "memberLevelDto", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "nextLevelMiniBadge", "", "createdDateTime", "updatedDateTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "getMemberExperience", "getMemberLevelDto", "()Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "getNextLevelMiniBadge", "()Ljava/lang/String;", "getCreatedDateTime", "getUpdatedDateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MemberLevelProfileDto {

    @SerializedName("created_at")
    private final String createdDateTime;

    @SerializedName("id")
    private final Integer id;

    @SerializedName("experience")
    private final Integer memberExperience;

    @SerializedName("progression_level")
    private final MemberLevelDto memberLevelDto;

    @SerializedName("next_level_mini_badge")
    private final String nextLevelMiniBadge;

    @SerializedName("updated_at")
    private final String updatedDateTime;

    @SerializedName("user_id")
    private final Integer userId;

    public MemberLevelProfileDto(Integer num, Integer num2, Integer num3, MemberLevelDto memberLevelDto, String str, String str2, String str3) {
        this.id = num;
        this.userId = num2;
        this.memberExperience = num3;
        this.memberLevelDto = memberLevelDto;
        this.nextLevelMiniBadge = str;
        this.createdDateTime = str2;
        this.updatedDateTime = str3;
    }

    public static /* synthetic */ MemberLevelProfileDto copy$default(MemberLevelProfileDto memberLevelProfileDto, Integer num, Integer num2, Integer num3, MemberLevelDto memberLevelDto, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = memberLevelProfileDto.id;
        }
        if ((i13 & 2) != 0) {
            num2 = memberLevelProfileDto.userId;
        }
        if ((i13 & 4) != 0) {
            num3 = memberLevelProfileDto.memberExperience;
        }
        if ((i13 & 8) != 0) {
            memberLevelDto = memberLevelProfileDto.memberLevelDto;
        }
        if ((i13 & 16) != 0) {
            str = memberLevelProfileDto.nextLevelMiniBadge;
        }
        if ((i13 & 32) != 0) {
            str2 = memberLevelProfileDto.createdDateTime;
        }
        if ((i13 & 64) != 0) {
            str3 = memberLevelProfileDto.updatedDateTime;
        }
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        Integer num4 = num3;
        return memberLevelProfileDto.copy(num, num2, num4, memberLevelDto, str6, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMemberExperience() {
        return this.memberExperience;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MemberLevelDto getMemberLevelDto() {
        return this.memberLevelDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextLevelMiniBadge() {
        return this.nextLevelMiniBadge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public final MemberLevelProfileDto copy(Integer id4, Integer userId, Integer memberExperience, MemberLevelDto memberLevelDto, String nextLevelMiniBadge, String createdDateTime, String updatedDateTime) {
        return new MemberLevelProfileDto(id4, userId, memberExperience, memberLevelDto, nextLevelMiniBadge, createdDateTime, updatedDateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelProfileDto)) {
            return false;
        }
        MemberLevelProfileDto memberLevelProfileDto = (MemberLevelProfileDto) other;
        return AbstractC22676k.m65745e(this.id, memberLevelProfileDto.id) && AbstractC22676k.m65745e(this.userId, memberLevelProfileDto.userId) && AbstractC22676k.m65745e(this.memberExperience, memberLevelProfileDto.memberExperience) && AbstractC22676k.m65745e(this.memberLevelDto, memberLevelProfileDto.memberLevelDto) && AbstractC22676k.m65745e(this.nextLevelMiniBadge, memberLevelProfileDto.nextLevelMiniBadge) && AbstractC22676k.m65745e(this.createdDateTime, memberLevelProfileDto.createdDateTime) && AbstractC22676k.m65745e(this.updatedDateTime, memberLevelProfileDto.updatedDateTime);
    }

    public final String getCreatedDateTime() {
        return this.createdDateTime;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Integer getMemberExperience() {
        return this.memberExperience;
    }

    public final MemberLevelDto getMemberLevelDto() {
        return this.memberLevelDto;
    }

    public final String getNextLevelMiniBadge() {
        return this.nextLevelMiniBadge;
    }

    public final String getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.userId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.memberExperience;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MemberLevelDto memberLevelDto = this.memberLevelDto;
        int iHashCode4 = (iHashCode3 + (memberLevelDto == null ? 0 : memberLevelDto.hashCode())) * 31;
        String str = this.nextLevelMiniBadge;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdDateTime;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedDateTime;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.userId;
        Integer num3 = this.memberExperience;
        MemberLevelDto memberLevelDto = this.memberLevelDto;
        String str = this.nextLevelMiniBadge;
        String str2 = this.createdDateTime;
        String str3 = this.updatedDateTime;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("MemberLevelProfileDto(id=", num, ", userId=", num2, ", memberExperience=");
        sbM114684l.append(num3);
        sbM114684l.append(", memberLevelDto=");
        sbM114684l.append(memberLevelDto);
        sbM114684l.append(", nextLevelMiniBadge=");
        AbstractC11266d.m30444B(sbM114684l, str, ", createdDateTime=", str2, ", updatedDateTime=");
        return AbstractC25012a.m73376i(str3, ")", sbM114684l);
    }
}
