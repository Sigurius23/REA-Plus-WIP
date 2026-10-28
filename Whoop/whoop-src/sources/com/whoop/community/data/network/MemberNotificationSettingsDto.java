package com.whoop.community.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import bq0.C3548d;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010*JP\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u001a\u00102\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010'R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010*¨\u0006@"}, m65681d2 = {"Lcom/whoop/community/data/network/MemberNotificationSettingsDto;", "Landroid/os/Parcelable;", "", "userId", ProfileApiKt.COMMUNITY_ID_PARAM, "", "deleted", "online", "", "memberType", "notificationSetting", "<init>", "(IIZZLjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/MemberNotificationSettingsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lbq0/d;", "toMemberNotificationSettings", "()Lbq0/d;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Z", "component4", "component5", "()Ljava/lang/String;", "component6", "copy", "(IIZZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/community/data/network/MemberNotificationSettingsDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUserId", "getCommunityId", "Z", "getDeleted", "getOnline", "Ljava/lang/String;", "getMemberType", "getNotificationSetting", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MemberNotificationSettingsDto implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("community_id")
    private final int communityId;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("member_type")
    private final String memberType;

    @SerializedName("notification_setting")
    private final String notificationSetting;

    @SerializedName("online")
    private final boolean online;

    @SerializedName("user_id")
    private final int userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MemberNotificationSettingsDto> CREATOR = new C6323b();

    /* JADX INFO: renamed from: com.whoop.community.data.network.MemberNotificationSettingsDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MemberNotificationSettingsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.data.network.MemberNotificationSettingsDto$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6323b implements Parcelable.Creator<MemberNotificationSettingsDto> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MemberNotificationSettingsDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            return new MemberNotificationSettingsDto(i13, i14, z4, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MemberNotificationSettingsDto[] newArray(int i13) {
            return new MemberNotificationSettingsDto[i13];
        }
    }

    public /* synthetic */ MemberNotificationSettingsDto(int i13, int i14, int i15, boolean z4, boolean z13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MemberNotificationSettingsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = i14;
        this.communityId = i15;
        this.deleted = z4;
        this.online = z13;
        this.memberType = str;
        this.notificationSetting = str2;
    }

    public static /* synthetic */ MemberNotificationSettingsDto copy$default(MemberNotificationSettingsDto memberNotificationSettingsDto, int i13, int i14, boolean z4, boolean z13, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = memberNotificationSettingsDto.userId;
        }
        if ((i15 & 2) != 0) {
            i14 = memberNotificationSettingsDto.communityId;
        }
        if ((i15 & 4) != 0) {
            z4 = memberNotificationSettingsDto.deleted;
        }
        if ((i15 & 8) != 0) {
            z13 = memberNotificationSettingsDto.online;
        }
        if ((i15 & 16) != 0) {
            str = memberNotificationSettingsDto.memberType;
        }
        if ((i15 & 32) != 0) {
            str2 = memberNotificationSettingsDto.notificationSetting;
        }
        String str3 = str;
        String str4 = str2;
        return memberNotificationSettingsDto.copy(i13, i14, z4, z13, str3, str4);
    }

    public static final /* synthetic */ void write$Self$community_release(MemberNotificationSettingsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.userId);
        output.encodeIntElement(serialDesc, 1, self.communityId);
        output.encodeBooleanElement(serialDesc, 2, self.deleted);
        output.encodeBooleanElement(serialDesc, 3, self.online);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.memberType);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.notificationSetting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMemberType() {
        return this.memberType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNotificationSetting() {
        return this.notificationSetting;
    }

    public final MemberNotificationSettingsDto copy(int userId, int communityId, boolean deleted, boolean online, String memberType, String notificationSetting) {
        return new MemberNotificationSettingsDto(userId, communityId, deleted, online, memberType, notificationSetting);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberNotificationSettingsDto)) {
            return false;
        }
        MemberNotificationSettingsDto memberNotificationSettingsDto = (MemberNotificationSettingsDto) other;
        return this.userId == memberNotificationSettingsDto.userId && this.communityId == memberNotificationSettingsDto.communityId && this.deleted == memberNotificationSettingsDto.deleted && this.online == memberNotificationSettingsDto.online && AbstractC22676k.m65745e(this.memberType, memberNotificationSettingsDto.memberType) && AbstractC22676k.m65745e(this.notificationSetting, memberNotificationSettingsDto.notificationSetting);
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getMemberType() {
        return this.memberType;
    }

    public final String getNotificationSetting() {
        return this.notificationSetting;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.communityId, Integer.hashCode(this.userId) * 31, 31), 31, this.deleted), 31, this.online);
        String str = this.memberType;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notificationSetting;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final C3548d toMemberNotificationSettings() {
        int i13 = this.userId;
        int i14 = this.communityId;
        boolean z4 = this.deleted;
        boolean z13 = this.online;
        String str = this.memberType;
        AbstractC22676k.m65747g(str);
        String str2 = this.notificationSetting;
        AbstractC22676k.m65747g(str2);
        return new C3548d(i13, i14, z4, z13, str, str2);
    }

    public String toString() {
        int i13 = this.userId;
        int i14 = this.communityId;
        boolean z4 = this.deleted;
        boolean z13 = this.online;
        String str = this.memberType;
        String str2 = this.notificationSetting;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "MemberNotificationSettingsDto(userId=", ", communityId=", ", deleted=");
        AbstractC38963t7.m124392v(sbM30465s, z4, ", online=", z13, ", memberType=");
        return AbstractC11266d.m30464r(sbM30465s, str, ", notificationSetting=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.userId);
        dest.writeInt(this.communityId);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeInt(this.online ? 1 : 0);
        dest.writeString(this.memberType);
        dest.writeString(this.notificationSetting);
    }

    public MemberNotificationSettingsDto(int i13, int i14, boolean z4, boolean z13, String str, String str2) {
        this.userId = i13;
        this.communityId = i14;
        this.deleted = z4;
        this.online = z13;
        this.memberType = str;
        this.notificationSetting = str2;
    }
}
