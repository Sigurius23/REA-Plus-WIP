package com.whoop.profile.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b\u0003\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b:\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b>\u0010(¨\u0006A"}, m65681d2 = {"Lcom/whoop/profile/domain/models/MembershipData;", "", "", "isFoundingMember", "", "memberSinceTitle", "memberSinceDate", "icon", "Lcom/whoop/profile/domain/models/BottomSheet;", "bottomSheet", "followingState", "communityVisible", "ageVisible", "locationVisible", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/MembershipData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/whoop/profile/domain/models/BottomSheet;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/profile/domain/models/MembershipData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getMemberSinceTitle", "getMemberSinceDate", "getIcon", "Lcom/whoop/profile/domain/models/BottomSheet;", "getBottomSheet", "getFollowingState", "Ljava/lang/Boolean;", "getCommunityVisible", "getAgeVisible", "getLocationVisible", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean ageVisible;
    private final BottomSheet bottomSheet;
    private final Boolean communityVisible;
    private final String followingState;
    private final String icon;
    private final boolean isFoundingMember;
    private final Boolean locationVisible;
    private final String memberSinceDate;
    private final String memberSinceTitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/MembershipData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/MembershipData;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipData(int i13, boolean z4, String str, String str2, String str3, BottomSheet bottomSheet, String str4, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MembershipData$$serializer.INSTANCE.getDescriptor());
        }
        this.isFoundingMember = z4;
        this.memberSinceTitle = str;
        this.memberSinceDate = str2;
        this.icon = str3;
        if ((i13 & 16) == 0) {
            this.bottomSheet = null;
        } else {
            this.bottomSheet = bottomSheet;
        }
        if ((i13 & 32) == 0) {
            this.followingState = null;
        } else {
            this.followingState = str4;
        }
        if ((i13 & 64) == 0) {
            this.communityVisible = null;
        } else {
            this.communityVisible = bool;
        }
        if ((i13 & 128) == 0) {
            this.ageVisible = null;
        } else {
            this.ageVisible = bool2;
        }
        if ((i13 & 256) == 0) {
            this.locationVisible = null;
        } else {
            this.locationVisible = bool3;
        }
    }

    public static /* synthetic */ MembershipData copy$default(MembershipData membershipData, boolean z4, String str, String str2, String str3, BottomSheet bottomSheet, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = membershipData.isFoundingMember;
        }
        if ((i13 & 2) != 0) {
            str = membershipData.memberSinceTitle;
        }
        if ((i13 & 4) != 0) {
            str2 = membershipData.memberSinceDate;
        }
        if ((i13 & 8) != 0) {
            str3 = membershipData.icon;
        }
        if ((i13 & 16) != 0) {
            bottomSheet = membershipData.bottomSheet;
        }
        if ((i13 & 32) != 0) {
            str4 = membershipData.followingState;
        }
        if ((i13 & 64) != 0) {
            bool = membershipData.communityVisible;
        }
        if ((i13 & 128) != 0) {
            bool2 = membershipData.ageVisible;
        }
        if ((i13 & 256) != 0) {
            bool3 = membershipData.locationVisible;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        String str5 = str4;
        Boolean bool6 = bool;
        BottomSheet bottomSheet2 = bottomSheet;
        String str6 = str2;
        return membershipData.copy(z4, str, str6, str3, bottomSheet2, str5, bool6, bool4, bool5);
    }

    public static final /* synthetic */ void write$Self$profile_release(MembershipData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isFoundingMember);
        output.encodeStringElement(serialDesc, 1, self.memberSinceTitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.memberSinceDate);
        output.encodeStringElement(serialDesc, 3, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.bottomSheet != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BottomSheet$$serializer.INSTANCE, self.bottomSheet);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.followingState != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.followingState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.communityVisible != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.communityVisible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.ageVisible != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.ageVisible);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.locationVisible == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.locationVisible);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsFoundingMember() {
        return this.isFoundingMember;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberSinceTitle() {
        return this.memberSinceTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemberSinceDate() {
        return this.memberSinceDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFollowingState() {
        return this.followingState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getCommunityVisible() {
        return this.communityVisible;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getAgeVisible() {
        return this.ageVisible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getLocationVisible() {
        return this.locationVisible;
    }

    public final MembershipData copy(boolean isFoundingMember, String memberSinceTitle, String memberSinceDate, String icon, BottomSheet bottomSheet, String followingState, Boolean communityVisible, Boolean ageVisible, Boolean locationVisible) {
        AbstractC22676k.m65750j(memberSinceTitle, "memberSinceTitle");
        AbstractC22676k.m65750j(icon, "icon");
        return new MembershipData(isFoundingMember, memberSinceTitle, memberSinceDate, icon, bottomSheet, followingState, communityVisible, ageVisible, locationVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipData)) {
            return false;
        }
        MembershipData membershipData = (MembershipData) other;
        return this.isFoundingMember == membershipData.isFoundingMember && AbstractC22676k.m65745e(this.memberSinceTitle, membershipData.memberSinceTitle) && AbstractC22676k.m65745e(this.memberSinceDate, membershipData.memberSinceDate) && AbstractC22676k.m65745e(this.icon, membershipData.icon) && AbstractC22676k.m65745e(this.bottomSheet, membershipData.bottomSheet) && AbstractC22676k.m65745e(this.followingState, membershipData.followingState) && AbstractC22676k.m65745e(this.communityVisible, membershipData.communityVisible) && AbstractC22676k.m65745e(this.ageVisible, membershipData.ageVisible) && AbstractC22676k.m65745e(this.locationVisible, membershipData.locationVisible);
    }

    public final Boolean getAgeVisible() {
        return this.ageVisible;
    }

    public final BottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final Boolean getCommunityVisible() {
        return this.communityVisible;
    }

    public final String getFollowingState() {
        return this.followingState;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Boolean getLocationVisible() {
        return this.locationVisible;
    }

    public final String getMemberSinceDate() {
        return this.memberSinceDate;
    }

    public final String getMemberSinceTitle() {
        return this.memberSinceTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Boolean.hashCode(this.isFoundingMember) * 31, 31, this.memberSinceTitle);
        String str = this.memberSinceDate;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon);
        BottomSheet bottomSheet = this.bottomSheet;
        int iHashCode = (iM30450d2 + (bottomSheet == null ? 0 : bottomSheet.hashCode())) * 31;
        String str2 = this.followingState;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.communityVisible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ageVisible;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.locationVisible;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean isFoundingMember() {
        return this.isFoundingMember;
    }

    public String toString() {
        boolean z4 = this.isFoundingMember;
        String str = this.memberSinceTitle;
        String str2 = this.memberSinceDate;
        String str3 = this.icon;
        BottomSheet bottomSheet = this.bottomSheet;
        String str4 = this.followingState;
        Boolean bool = this.communityVisible;
        Boolean bool2 = this.ageVisible;
        Boolean bool3 = this.locationVisible;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("MembershipData(isFoundingMember=", ", memberSinceTitle=", str, ", memberSinceDate=", z4);
        AbstractC11266d.m30444B(sbM38567n, str2, ", icon=", str3, ", bottomSheet=");
        sbM38567n.append(bottomSheet);
        sbM38567n.append(", followingState=");
        sbM38567n.append(str4);
        sbM38567n.append(", communityVisible=");
        AbstractC3855a.m11839w(sbM38567n, bool, ", ageVisible=", bool2, ", locationVisible=");
        return AbstractC11478a.m30858j(sbM38567n, bool3, ")");
    }

    public MembershipData(boolean z4, String memberSinceTitle, String str, String icon, BottomSheet bottomSheet, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC22676k.m65750j(memberSinceTitle, "memberSinceTitle");
        AbstractC22676k.m65750j(icon, "icon");
        this.isFoundingMember = z4;
        this.memberSinceTitle = memberSinceTitle;
        this.memberSinceDate = str;
        this.icon = icon;
        this.bottomSheet = bottomSheet;
        this.followingState = str2;
        this.communityVisible = bool;
        this.ageVisible = bool2;
        this.locationVisible = bool3;
    }

    public /* synthetic */ MembershipData(boolean z4, String str, String str2, String str3, BottomSheet bottomSheet, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, str2, str3, (i13 & 16) != 0 ? null : bottomSheet, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : bool, (i13 & 128) != 0 ? null : bool2, (i13 & 256) != 0 ? null : bool3);
    }
}
