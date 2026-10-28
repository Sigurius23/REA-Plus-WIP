package com.whoop.profile.domain.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JP\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b\u0006\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010'¨\u0006<"}, m65681d2 = {"Lcom/whoop/profile/domain/models/ProfileMetadata;", "", "", "entitlementsImageUrl", "editButtonTitle", "", "isSelfProfile", "Lcom/whoop/profile/domain/models/UserData;", "userData", "Lcom/whoop/profile/domain/models/MembershipData;", "membershipData", "Lcom/whoop/analytics/AnalyticEventModel;", "editButtonAnalyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/ProfileMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/profile/domain/models/UserData;", "component5", "()Lcom/whoop/profile/domain/models/MembershipData;", "component6", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/profile/domain/models/UserData;Lcom/whoop/profile/domain/models/MembershipData;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/models/ProfileMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEntitlementsImageUrl", "getEditButtonTitle", "Z", "Lcom/whoop/profile/domain/models/UserData;", "getUserData", "Lcom/whoop/profile/domain/models/MembershipData;", "getMembershipData", "Lcom/whoop/analytics/AnalyticEventModel;", "getEditButtonAnalyticEvent", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProfileMetadata {
    private final AnalyticEventModel editButtonAnalyticEvent;
    private final String editButtonTitle;
    private final String entitlementsImageUrl;
    private final boolean isSelfProfile;
    private final MembershipData membershipData;
    private final UserData userData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/ProfileMetadata$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/ProfileMetadata;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProfileMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProfileMetadata(int i13, String str, String str2, boolean z4, UserData userData, MembershipData membershipData, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ProfileMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.entitlementsImageUrl = str;
        this.editButtonTitle = str2;
        this.isSelfProfile = z4;
        this.userData = userData;
        this.membershipData = membershipData;
        this.editButtonAnalyticEvent = analyticEventModel;
    }

    public static /* synthetic */ ProfileMetadata copy$default(ProfileMetadata profileMetadata, String str, String str2, boolean z4, UserData userData, MembershipData membershipData, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = profileMetadata.entitlementsImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = profileMetadata.editButtonTitle;
        }
        if ((i13 & 4) != 0) {
            z4 = profileMetadata.isSelfProfile;
        }
        if ((i13 & 8) != 0) {
            userData = profileMetadata.userData;
        }
        if ((i13 & 16) != 0) {
            membershipData = profileMetadata.membershipData;
        }
        if ((i13 & 32) != 0) {
            analyticEventModel = profileMetadata.editButtonAnalyticEvent;
        }
        MembershipData membershipData2 = membershipData;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return profileMetadata.copy(str, str2, z4, userData, membershipData2, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$profile_release(ProfileMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.entitlementsImageUrl);
        output.encodeStringElement(serialDesc, 1, self.editButtonTitle);
        output.encodeBooleanElement(serialDesc, 2, self.isSelfProfile);
        output.encodeSerializableElement(serialDesc, 3, UserData$$serializer.INSTANCE, self.userData);
        output.encodeSerializableElement(serialDesc, 4, MembershipData$$serializer.INSTANCE, self.membershipData);
        output.encodeNullableSerializableElement(serialDesc, 5, AnalyticEventModel$$serializer.INSTANCE, self.editButtonAnalyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEntitlementsImageUrl() {
        return this.entitlementsImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelfProfile() {
        return this.isSelfProfile;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserData getUserData() {
        return this.userData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MembershipData getMembershipData() {
        return this.membershipData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnalyticEventModel getEditButtonAnalyticEvent() {
        return this.editButtonAnalyticEvent;
    }

    public final ProfileMetadata copy(String entitlementsImageUrl, String editButtonTitle, boolean isSelfProfile, UserData userData, MembershipData membershipData, AnalyticEventModel editButtonAnalyticEvent) {
        AbstractC22676k.m65750j(editButtonTitle, "editButtonTitle");
        AbstractC22676k.m65750j(userData, "userData");
        AbstractC22676k.m65750j(membershipData, "membershipData");
        return new ProfileMetadata(entitlementsImageUrl, editButtonTitle, isSelfProfile, userData, membershipData, editButtonAnalyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileMetadata)) {
            return false;
        }
        ProfileMetadata profileMetadata = (ProfileMetadata) other;
        return AbstractC22676k.m65745e(this.entitlementsImageUrl, profileMetadata.entitlementsImageUrl) && AbstractC22676k.m65745e(this.editButtonTitle, profileMetadata.editButtonTitle) && this.isSelfProfile == profileMetadata.isSelfProfile && AbstractC22676k.m65745e(this.userData, profileMetadata.userData) && AbstractC22676k.m65745e(this.membershipData, profileMetadata.membershipData) && AbstractC22676k.m65745e(this.editButtonAnalyticEvent, profileMetadata.editButtonAnalyticEvent);
    }

    public final AnalyticEventModel getEditButtonAnalyticEvent() {
        return this.editButtonAnalyticEvent;
    }

    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    public final String getEntitlementsImageUrl() {
        return this.entitlementsImageUrl;
    }

    public final MembershipData getMembershipData() {
        return this.membershipData;
    }

    public final UserData getUserData() {
        return this.userData;
    }

    public int hashCode() {
        String str = this.entitlementsImageUrl;
        int iHashCode = (this.membershipData.hashCode() + ((this.userData.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.editButtonTitle), 31, this.isSelfProfile)) * 31)) * 31;
        AnalyticEventModel analyticEventModel = this.editButtonAnalyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public final boolean isSelfProfile() {
        return this.isSelfProfile;
    }

    public String toString() {
        String str = this.entitlementsImageUrl;
        String str2 = this.editButtonTitle;
        boolean z4 = this.isSelfProfile;
        UserData userData = this.userData;
        MembershipData membershipData = this.membershipData;
        AnalyticEventModel analyticEventModel = this.editButtonAnalyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProfileMetadata(entitlementsImageUrl=", str, ", editButtonTitle=", str2, ", isSelfProfile=");
        sbM32001t.append(z4);
        sbM32001t.append(", userData=");
        sbM32001t.append(userData);
        sbM32001t.append(", membershipData=");
        sbM32001t.append(membershipData);
        sbM32001t.append(", editButtonAnalyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ProfileMetadata(String str, String editButtonTitle, boolean z4, UserData userData, MembershipData membershipData, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(editButtonTitle, "editButtonTitle");
        AbstractC22676k.m65750j(userData, "userData");
        AbstractC22676k.m65750j(membershipData, "membershipData");
        this.entitlementsImageUrl = str;
        this.editButtonTitle = editButtonTitle;
        this.isSelfProfile = z4;
        this.userData = userData;
        this.membershipData = membershipData;
        this.editButtonAnalyticEvent = analyticEventModel;
    }
}
