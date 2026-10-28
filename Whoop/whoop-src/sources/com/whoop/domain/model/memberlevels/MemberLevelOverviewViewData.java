package com.whoop.domain.model.memberlevels;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, m65681d2 = {"Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;", "Landroid/os/Parcelable;", "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "profileLevelViewData", "", "shouldShowBadge", "<init>", "(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "component2", "()Z", "copy", "(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;Z)Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;", "getProfileLevelViewData", "Z", "getShouldShowBadge", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MemberLevelOverviewViewData implements Parcelable {
    public static final Parcelable.Creator<MemberLevelOverviewViewData> CREATOR = new Creator();
    private final MemberLevelProfileViewData profileLevelViewData;
    private final boolean shouldShowBadge;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MemberLevelOverviewViewData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelOverviewViewData createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new MemberLevelOverviewViewData(parcel.readInt() == 0 ? null : MemberLevelProfileViewData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberLevelOverviewViewData[] newArray(int i13) {
            return new MemberLevelOverviewViewData[i13];
        }
    }

    public MemberLevelOverviewViewData(MemberLevelProfileViewData memberLevelProfileViewData, boolean z4) {
        this.profileLevelViewData = memberLevelProfileViewData;
        this.shouldShowBadge = z4;
    }

    public static /* synthetic */ MemberLevelOverviewViewData copy$default(MemberLevelOverviewViewData memberLevelOverviewViewData, MemberLevelProfileViewData memberLevelProfileViewData, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            memberLevelProfileViewData = memberLevelOverviewViewData.profileLevelViewData;
        }
        if ((i13 & 2) != 0) {
            z4 = memberLevelOverviewViewData.shouldShowBadge;
        }
        return memberLevelOverviewViewData.copy(memberLevelProfileViewData, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MemberLevelProfileViewData getProfileLevelViewData() {
        return this.profileLevelViewData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldShowBadge() {
        return this.shouldShowBadge;
    }

    public final MemberLevelOverviewViewData copy(MemberLevelProfileViewData profileLevelViewData, boolean shouldShowBadge) {
        return new MemberLevelOverviewViewData(profileLevelViewData, shouldShowBadge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelOverviewViewData)) {
            return false;
        }
        MemberLevelOverviewViewData memberLevelOverviewViewData = (MemberLevelOverviewViewData) other;
        return AbstractC22676k.m65745e(this.profileLevelViewData, memberLevelOverviewViewData.profileLevelViewData) && this.shouldShowBadge == memberLevelOverviewViewData.shouldShowBadge;
    }

    public final MemberLevelProfileViewData getProfileLevelViewData() {
        return this.profileLevelViewData;
    }

    public final boolean getShouldShowBadge() {
        return this.shouldShowBadge;
    }

    public int hashCode() {
        MemberLevelProfileViewData memberLevelProfileViewData = this.profileLevelViewData;
        return Boolean.hashCode(this.shouldShowBadge) + ((memberLevelProfileViewData == null ? 0 : memberLevelProfileViewData.hashCode()) * 31);
    }

    public String toString() {
        return "MemberLevelOverviewViewData(profileLevelViewData=" + this.profileLevelViewData + ", shouldShowBadge=" + this.shouldShowBadge + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        MemberLevelProfileViewData memberLevelProfileViewData = this.profileLevelViewData;
        if (memberLevelProfileViewData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            memberLevelProfileViewData.writeToParcel(dest, flags);
        }
        dest.writeInt(this.shouldShowBadge ? 1 : 0);
    }
}
