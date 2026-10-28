package com.whoop.domain.model.memberlevels;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.gamification.MemberLevelDto;
import com.whoop.data.remote.domain.dto.gamification.MemberLevelProfileDto;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0001@Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0013J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0098\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0013J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b:\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b;\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b<\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b=\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b>\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b?\u0010 ¨\u0006A"}, m65681d2 = {"Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "Landroid/os/Parcelable;", "", "currentLevelId", "memberExperience", "currentLevelMinExperience", "currentLevelMaxExperience", "", "currentBadgeUrl", "currentMiniBadgeUrl", "currentLevelType", "nextLevelId", "nextLevelExperience", "nextLevelBadgeUrl", "nextMiniBadgeUrl", "nextLevelType", "<init>", "(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentLevelId", "getMemberExperience", "getCurrentLevelMinExperience", "Ljava/lang/Integer;", "getCurrentLevelMaxExperience", "Ljava/lang/String;", "getCurrentBadgeUrl", "getCurrentMiniBadgeUrl", "getCurrentLevelType", "getNextLevelId", "getNextLevelExperience", "getNextLevelBadgeUrl", "getNextMiniBadgeUrl", "getNextLevelType", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MemberLevelProfileViewData implements Parcelable {
    private final String currentBadgeUrl;
    private final int currentLevelId;
    private final Integer currentLevelMaxExperience;
    private final int currentLevelMinExperience;
    private final String currentLevelType;
    private final String currentMiniBadgeUrl;
    private final int memberExperience;
    private final String nextLevelBadgeUrl;
    private final int nextLevelExperience;
    private final Integer nextLevelId;
    private final String nextLevelType;
    private final String nextMiniBadgeUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MemberLevelProfileViewData> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;", "", "<init>", "()V", "convert", "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "memberLevelProfile", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;", "currentLevel", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "nextLevel", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberLevelProfileViewData convert(MemberLevelProfileDto memberLevelProfile, MemberLevelsListViewData currentLevel, MemberLevelsListViewData nextLevel) {
            String tier;
            Integer minExperience;
            AbstractC22676k.m65750j(memberLevelProfile, "memberLevelProfile");
            AbstractC22676k.m65750j(currentLevel, "currentLevel");
            MemberLevelDto memberLevelDto = memberLevelProfile.getMemberLevelDto();
            AbstractC22676k.m65747g(memberLevelDto);
            Integer levelId = memberLevelDto.getLevelId();
            AbstractC22676k.m65747g(levelId);
            int iIntValue = levelId.intValue();
            Integer memberExperience = memberLevelProfile.getMemberExperience();
            AbstractC22676k.m65747g(memberExperience);
            int iIntValue2 = memberExperience.intValue();
            Integer minExperience2 = currentLevel.getMinExperience();
            int iIntValue3 = 0;
            int iIntValue4 = minExperience2 != null ? minExperience2.intValue() : 0;
            Integer maxExperience = currentLevel.getMaxExperience();
            String badgeUrl = currentLevel.getBadgeUrl();
            String miniBadgeUrl = currentLevel.getMiniBadgeUrl();
            String tier2 = currentLevel.getTier();
            if (nextLevel != null && (minExperience = nextLevel.getMinExperience()) != null) {
                iIntValue3 = minExperience.intValue();
            }
            int i13 = iIntValue3;
            Integer numValueOf = nextLevel != null ? Integer.valueOf(nextLevel.getLevelId()) : null;
            String badgeUrl2 = nextLevel != null ? nextLevel.getBadgeUrl() : null;
            String miniBadgeUrl2 = nextLevel != null ? nextLevel.getMiniBadgeUrl() : null;
            if (nextLevel == null || (tier = nextLevel.getTier()) == null) {
                tier = "";
            }
            return new MemberLevelProfileViewData(iIntValue, iIntValue2, iIntValue4, maxExperience, badgeUrl, miniBadgeUrl, tier2, numValueOf, i13, badgeUrl2, miniBadgeUrl2, tier);
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MemberLevelProfileViewData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelProfileViewData createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new MemberLevelProfileViewData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelProfileViewData[] newArray(int i13) {
            return new MemberLevelProfileViewData[i13];
        }
    }

    public MemberLevelProfileViewData(int i13, int i14, int i15, Integer num, String str, String str2, String str3, Integer num2, int i16, String str4, String str5, String str6) {
        this.currentLevelId = i13;
        this.memberExperience = i14;
        this.currentLevelMinExperience = i15;
        this.currentLevelMaxExperience = num;
        this.currentBadgeUrl = str;
        this.currentMiniBadgeUrl = str2;
        this.currentLevelType = str3;
        this.nextLevelId = num2;
        this.nextLevelExperience = i16;
        this.nextLevelBadgeUrl = str4;
        this.nextMiniBadgeUrl = str5;
        this.nextLevelType = str6;
    }

    public static /* synthetic */ MemberLevelProfileViewData copy$default(MemberLevelProfileViewData memberLevelProfileViewData, int i13, int i14, int i15, Integer num, String str, String str2, String str3, Integer num2, int i16, String str4, String str5, String str6, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = memberLevelProfileViewData.currentLevelId;
        }
        if ((i17 & 2) != 0) {
            i14 = memberLevelProfileViewData.memberExperience;
        }
        if ((i17 & 4) != 0) {
            i15 = memberLevelProfileViewData.currentLevelMinExperience;
        }
        if ((i17 & 8) != 0) {
            num = memberLevelProfileViewData.currentLevelMaxExperience;
        }
        if ((i17 & 16) != 0) {
            str = memberLevelProfileViewData.currentBadgeUrl;
        }
        if ((i17 & 32) != 0) {
            str2 = memberLevelProfileViewData.currentMiniBadgeUrl;
        }
        if ((i17 & 64) != 0) {
            str3 = memberLevelProfileViewData.currentLevelType;
        }
        if ((i17 & 128) != 0) {
            num2 = memberLevelProfileViewData.nextLevelId;
        }
        if ((i17 & 256) != 0) {
            i16 = memberLevelProfileViewData.nextLevelExperience;
        }
        if ((i17 & 512) != 0) {
            str4 = memberLevelProfileViewData.nextLevelBadgeUrl;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str5 = memberLevelProfileViewData.nextMiniBadgeUrl;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str6 = memberLevelProfileViewData.nextLevelType;
        }
        String str7 = str5;
        String str8 = str6;
        int i18 = i16;
        String str9 = str4;
        String str10 = str3;
        Integer num3 = num2;
        String str11 = str;
        String str12 = str2;
        return memberLevelProfileViewData.copy(i13, i14, i15, num, str11, str12, str10, num3, i18, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentLevelId() {
        return this.currentLevelId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNextLevelBadgeUrl() {
        return this.nextLevelBadgeUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNextMiniBadgeUrl() {
        return this.nextMiniBadgeUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNextLevelType() {
        return this.nextLevelType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMemberExperience() {
        return this.memberExperience;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentLevelMinExperience() {
        return this.currentLevelMinExperience;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCurrentLevelMaxExperience() {
        return this.currentLevelMaxExperience;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrentBadgeUrl() {
        return this.currentBadgeUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrentMiniBadgeUrl() {
        return this.currentMiniBadgeUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrentLevelType() {
        return this.currentLevelType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getNextLevelId() {
        return this.nextLevelId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getNextLevelExperience() {
        return this.nextLevelExperience;
    }

    public final MemberLevelProfileViewData copy(int currentLevelId, int memberExperience, int currentLevelMinExperience, Integer currentLevelMaxExperience, String currentBadgeUrl, String currentMiniBadgeUrl, String currentLevelType, Integer nextLevelId, int nextLevelExperience, String nextLevelBadgeUrl, String nextMiniBadgeUrl, String nextLevelType) {
        return new MemberLevelProfileViewData(currentLevelId, memberExperience, currentLevelMinExperience, currentLevelMaxExperience, currentBadgeUrl, currentMiniBadgeUrl, currentLevelType, nextLevelId, nextLevelExperience, nextLevelBadgeUrl, nextMiniBadgeUrl, nextLevelType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelProfileViewData)) {
            return false;
        }
        MemberLevelProfileViewData memberLevelProfileViewData = (MemberLevelProfileViewData) other;
        return this.currentLevelId == memberLevelProfileViewData.currentLevelId && this.memberExperience == memberLevelProfileViewData.memberExperience && this.currentLevelMinExperience == memberLevelProfileViewData.currentLevelMinExperience && AbstractC22676k.m65745e(this.currentLevelMaxExperience, memberLevelProfileViewData.currentLevelMaxExperience) && AbstractC22676k.m65745e(this.currentBadgeUrl, memberLevelProfileViewData.currentBadgeUrl) && AbstractC22676k.m65745e(this.currentMiniBadgeUrl, memberLevelProfileViewData.currentMiniBadgeUrl) && AbstractC22676k.m65745e(this.currentLevelType, memberLevelProfileViewData.currentLevelType) && AbstractC22676k.m65745e(this.nextLevelId, memberLevelProfileViewData.nextLevelId) && this.nextLevelExperience == memberLevelProfileViewData.nextLevelExperience && AbstractC22676k.m65745e(this.nextLevelBadgeUrl, memberLevelProfileViewData.nextLevelBadgeUrl) && AbstractC22676k.m65745e(this.nextMiniBadgeUrl, memberLevelProfileViewData.nextMiniBadgeUrl) && AbstractC22676k.m65745e(this.nextLevelType, memberLevelProfileViewData.nextLevelType);
    }

    public final String getCurrentBadgeUrl() {
        return this.currentBadgeUrl;
    }

    public final int getCurrentLevelId() {
        return this.currentLevelId;
    }

    public final Integer getCurrentLevelMaxExperience() {
        return this.currentLevelMaxExperience;
    }

    public final int getCurrentLevelMinExperience() {
        return this.currentLevelMinExperience;
    }

    public final String getCurrentLevelType() {
        return this.currentLevelType;
    }

    public final String getCurrentMiniBadgeUrl() {
        return this.currentMiniBadgeUrl;
    }

    public final int getMemberExperience() {
        return this.memberExperience;
    }

    public final String getNextLevelBadgeUrl() {
        return this.nextLevelBadgeUrl;
    }

    public final int getNextLevelExperience() {
        return this.nextLevelExperience;
    }

    public final Integer getNextLevelId() {
        return this.nextLevelId;
    }

    public final String getNextLevelType() {
        return this.nextLevelType;
    }

    public final String getNextMiniBadgeUrl() {
        return this.nextMiniBadgeUrl;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.currentLevelMinExperience, AbstractC11266d.m30448b(this.memberExperience, Integer.hashCode(this.currentLevelId) * 31, 31), 31);
        Integer num = this.currentLevelMaxExperience;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.currentBadgeUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentMiniBadgeUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentLevelType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.nextLevelId;
        int iM30448b2 = AbstractC11266d.m30448b(this.nextLevelExperience, (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        String str4 = this.nextLevelBadgeUrl;
        int iHashCode5 = (iM30448b2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nextMiniBadgeUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nextLevelType;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.currentLevelId;
        int i14 = this.memberExperience;
        int i15 = this.currentLevelMinExperience;
        Integer num = this.currentLevelMaxExperience;
        String str = this.currentBadgeUrl;
        String str2 = this.currentMiniBadgeUrl;
        String str3 = this.currentLevelType;
        Integer num2 = this.nextLevelId;
        int i16 = this.nextLevelExperience;
        String str4 = this.nextLevelBadgeUrl;
        String str5 = this.nextMiniBadgeUrl;
        String str6 = this.nextLevelType;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "MemberLevelProfileViewData(currentLevelId=", ", memberExperience=", ", currentLevelMinExperience=");
        sbM30465s.append(i15);
        sbM30465s.append(", currentLevelMaxExperience=");
        sbM30465s.append(num);
        sbM30465s.append(", currentBadgeUrl=");
        AbstractC11266d.m30444B(sbM30465s, str, ", currentMiniBadgeUrl=", str2, ", currentLevelType=");
        AbstractC30007c.m91853w(num2, str3, ", nextLevelId=", ", nextLevelExperience=", sbM30465s);
        AbstractC11895b.m31979B(i16, ", nextLevelBadgeUrl=", str4, ", nextMiniBadgeUrl=", sbM30465s);
        return AbstractC11266d.m30464r(sbM30465s, str5, ", nextLevelType=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.currentLevelId);
        dest.writeInt(this.memberExperience);
        dest.writeInt(this.currentLevelMinExperience);
        Integer num = this.currentLevelMaxExperience;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.currentBadgeUrl);
        dest.writeString(this.currentMiniBadgeUrl);
        dest.writeString(this.currentLevelType);
        Integer num2 = this.nextLevelId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeInt(this.nextLevelExperience);
        dest.writeString(this.nextLevelBadgeUrl);
        dest.writeString(this.nextMiniBadgeUrl);
        dest.writeString(this.nextLevelType);
    }
}
