package com.whoop.domain.model.memberlevels;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.gamification.MemberLevelDto;
import com.whoop.domain.model.RecordsDto;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u000fJ\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b0\u0010\u001bR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\b\u000b\u0010\u001f\"\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "Landroid/os/Parcelable;", "", "minExperience", "maxExperience", "levelId", "", "badgeUrl", "miniBadgeUrl", "tier", "", "isLocked", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMinExperience", "getMaxExperience", "I", "getLevelId", "Ljava/lang/String;", "getBadgeUrl", "getMiniBadgeUrl", "getTier", "Z", "setLocked", "(Z)V", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MemberLevelsListViewData implements Parcelable {
    private final String badgeUrl;
    private boolean isLocked;
    private final int levelId;
    private final Integer maxExperience;
    private final Integer minExperience;
    private final String miniBadgeUrl;
    private final String tier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MemberLevelsListViewData> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;", "", "<init>", "()V", "convert", "", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "levels", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<MemberLevelsListViewData> convert(RecordsDto<MemberLevelDto> levels) {
            AbstractC22676k.m65750j(levels, "levels");
            List<MemberLevelDto> records = levels.getRecords();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
            for (MemberLevelDto memberLevelDto : records) {
                Integer minExperience = memberLevelDto.getMinExperience();
                Integer maxExperience = memberLevelDto.getMaxExperience();
                Integer levelId = memberLevelDto.getLevelId();
                AbstractC22676k.m65747g(levelId);
                int iIntValue = levelId.intValue();
                String badgeUrl = memberLevelDto.getBadgeUrl();
                AbstractC22676k.m65747g(badgeUrl);
                String miniBadgeUrl = memberLevelDto.getMiniBadgeUrl();
                String tier = memberLevelDto.getTier();
                AbstractC22676k.m65747g(tier);
                arrayList.add(new MemberLevelsListViewData(minExperience, maxExperience, iIntValue, badgeUrl, miniBadgeUrl, tier, true));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MemberLevelsListViewData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelsListViewData createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new MemberLevelsListViewData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelsListViewData[] newArray(int i13) {
            return new MemberLevelsListViewData[i13];
        }
    }

    public MemberLevelsListViewData(Integer num, Integer num2, int i13, String badgeUrl, String str, String tier, boolean z4) {
        AbstractC22676k.m65750j(badgeUrl, "badgeUrl");
        AbstractC22676k.m65750j(tier, "tier");
        this.minExperience = num;
        this.maxExperience = num2;
        this.levelId = i13;
        this.badgeUrl = badgeUrl;
        this.miniBadgeUrl = str;
        this.tier = tier;
        this.isLocked = z4;
    }

    public static /* synthetic */ MemberLevelsListViewData copy$default(MemberLevelsListViewData memberLevelsListViewData, Integer num, Integer num2, int i13, String str, String str2, String str3, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            num = memberLevelsListViewData.minExperience;
        }
        if ((i14 & 2) != 0) {
            num2 = memberLevelsListViewData.maxExperience;
        }
        if ((i14 & 4) != 0) {
            i13 = memberLevelsListViewData.levelId;
        }
        if ((i14 & 8) != 0) {
            str = memberLevelsListViewData.badgeUrl;
        }
        if ((i14 & 16) != 0) {
            str2 = memberLevelsListViewData.miniBadgeUrl;
        }
        if ((i14 & 32) != 0) {
            str3 = memberLevelsListViewData.tier;
        }
        if ((i14 & 64) != 0) {
            z4 = memberLevelsListViewData.isLocked;
        }
        String str4 = str3;
        boolean z13 = z4;
        String str5 = str2;
        int i15 = i13;
        return memberLevelsListViewData.copy(num, num2, i15, str, str5, str4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMinExperience() {
        return this.minExperience;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxExperience() {
        return this.maxExperience;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLevelId() {
        return this.levelId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMiniBadgeUrl() {
        return this.miniBadgeUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTier() {
        return this.tier;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public final MemberLevelsListViewData copy(Integer minExperience, Integer maxExperience, int levelId, String badgeUrl, String miniBadgeUrl, String tier, boolean isLocked) {
        AbstractC22676k.m65750j(badgeUrl, "badgeUrl");
        AbstractC22676k.m65750j(tier, "tier");
        return new MemberLevelsListViewData(minExperience, maxExperience, levelId, badgeUrl, miniBadgeUrl, tier, isLocked);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelsListViewData)) {
            return false;
        }
        MemberLevelsListViewData memberLevelsListViewData = (MemberLevelsListViewData) other;
        return AbstractC22676k.m65745e(this.minExperience, memberLevelsListViewData.minExperience) && AbstractC22676k.m65745e(this.maxExperience, memberLevelsListViewData.maxExperience) && this.levelId == memberLevelsListViewData.levelId && AbstractC22676k.m65745e(this.badgeUrl, memberLevelsListViewData.badgeUrl) && AbstractC22676k.m65745e(this.miniBadgeUrl, memberLevelsListViewData.miniBadgeUrl) && AbstractC22676k.m65745e(this.tier, memberLevelsListViewData.tier) && this.isLocked == memberLevelsListViewData.isLocked;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final int getLevelId() {
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

    public int hashCode() {
        Integer num = this.minExperience;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxExperience;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.levelId, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.badgeUrl);
        String str = this.miniBadgeUrl;
        return Boolean.hashCode(this.isLocked) + AbstractC11266d.m30450d((iM30450d + (str != null ? str.hashCode() : 0)) * 31, 31, this.tier);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void setLocked(boolean z4) {
        this.isLocked = z4;
    }

    public String toString() {
        Integer num = this.minExperience;
        Integer num2 = this.maxExperience;
        int i13 = this.levelId;
        String str = this.badgeUrl;
        String str2 = this.miniBadgeUrl;
        String str3 = this.tier;
        boolean z4 = this.isLocked;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("MemberLevelsListViewData(minExperience=", num, ", maxExperience=", num2, ", levelId=");
        AbstractC11895b.m31979B(i13, ", badgeUrl=", str, ", miniBadgeUrl=", sbM114684l);
        AbstractC11266d.m30444B(sbM114684l, str2, ", tier=", str3, ", isLocked=");
        return AbstractC18489d0.m53372m(sbM114684l, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.minExperience;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.maxExperience;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeInt(this.levelId);
        dest.writeString(this.badgeUrl);
        dest.writeString(this.miniBadgeUrl);
        dest.writeString(this.tier);
        dest.writeInt(this.isLocked ? 1 : 0);
    }
}
