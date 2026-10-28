package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 K2\u00020\u0001:\u0002LKB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020!2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b7\u0010)R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u00103R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u00103R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b;\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b<\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b=\u00106R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b>\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010G\u0012\u0004\bJ\u0010F\u001a\u0004\bH\u0010I¨\u0006M"}, m65681d2 = {"Lcom/whoop/domain/model/teams/FeatureCommunityDto;", "Landroid/os/Parcelable;", "", "id", "", "deleted", "", "name", "ownerId", "shareStrain", "shareRecovery", "shareSleep", "about", "banner", "avatar", "private", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Lcom/whoop/domain/model/teams/InviteCodeDto;", "inviteCodeDto", "Lcom/whoop/domain/model/teams/MetaDataDto;", "metaDataDto", "<init>", "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/FeatureCommunityDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/FeatureTeam;", "toFeatureTeam", "()Lcom/whoop/domain/model/teams/FeatureTeam;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Z", "getDeleted", "()Z", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getOwnerId", "getShareStrain", "getShareRecovery", "getShareSleep", "getAbout", "getBanner", "getAvatar", "getPrivate", "Lcom/whoop/domain/model/teams/TeamType;", "getTeamType", "()Lcom/whoop/domain/model/teams/TeamType;", "Lcom/whoop/domain/model/teams/InviteCodeDto;", "getInviteCodeDto", "()Lcom/whoop/domain/model/teams/InviteCodeDto;", "getInviteCodeDto$annotations", "()V", "Lcom/whoop/domain/model/teams/MetaDataDto;", "getMetaDataDto", "()Lcom/whoop/domain/model/teams/MetaDataDto;", "getMetaDataDto$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class FeatureCommunityDto implements Parcelable {

    @SerializedName("about")
    private final String about;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("banner")
    private final String banner;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("id")
    private final int id;

    @SerializedName("invite_code")
    private final InviteCodeDto inviteCodeDto;

    @SerializedName("metadata")
    private final MetaDataDto metaDataDto;

    @SerializedName("name")
    private final String name;

    @SerializedName("owner_id")
    private final int ownerId;

    @SerializedName("private")
    private final boolean private;

    @SerializedName("share_recovery")
    private final boolean shareRecovery;

    @SerializedName("share_sleep")
    private final boolean shareSleep;

    @SerializedName("share_strain")
    private final boolean shareStrain;

    @SerializedName("team_type")
    private final TeamType teamType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FeatureCommunityDto> CREATOR = new Creator();
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(22)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/FeatureCommunityDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureCommunityDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureCommunityDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureCommunityDto createFromParcel(Parcel parcel) {
            boolean z4;
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            boolean z13 = false;
            if (parcel.readInt() != 0) {
                z13 = true;
                z4 = true;
            } else {
                z4 = true;
            }
            String string = parcel.readString();
            boolean z14 = z4;
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z14 = z13;
            }
            if (parcel.readInt() == 0) {
                z14 = z13;
            }
            if (parcel.readInt() == 0) {
                z14 = z13;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z15 = z14;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                z15 = false;
            }
            return new FeatureCommunityDto(i13, z13, string, i14, z14, z14, z14, string2, string3, string4, z15, parcel.readInt() == 0 ? null : TeamType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InviteCodeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MetaDataDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureCommunityDto[] newArray(int i13) {
            return new FeatureCommunityDto[i13];
        }
    }

    public /* synthetic */ FeatureCommunityDto(int i13, int i14, boolean z4, String str, int i15, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4, boolean z16, TeamType teamType, InviteCodeDto inviteCodeDto, MetaDataDto metaDataDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, FeatureCommunityDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.deleted = z4;
        this.name = str;
        this.ownerId = i15;
        this.shareStrain = z13;
        this.shareRecovery = z14;
        this.shareSleep = z15;
        this.about = str2;
        this.banner = str3;
        this.avatar = str4;
        this.private = z16;
        this.teamType = teamType;
        this.inviteCodeDto = inviteCodeDto;
        this.metaDataDto = metaDataDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.domain.model.teams.TeamType", TeamType.values());
    }

    @InterfaceC37143h("invite_code")
    public static /* synthetic */ void getInviteCodeDto$annotations() {
    }

    @InterfaceC37143h("metadata")
    public static /* synthetic */ void getMetaDataDto$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(FeatureCommunityDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.deleted);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeIntElement(serialDesc, 3, self.ownerId);
        output.encodeBooleanElement(serialDesc, 4, self.shareStrain);
        output.encodeBooleanElement(serialDesc, 5, self.shareRecovery);
        output.encodeBooleanElement(serialDesc, 6, self.shareSleep);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.about);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.banner);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.avatar);
        output.encodeBooleanElement(serialDesc, 10, self.private);
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.teamType);
        output.encodeNullableSerializableElement(serialDesc, 12, InviteCodeDto$$serializer.INSTANCE, self.inviteCodeDto);
        output.encodeNullableSerializableElement(serialDesc, 13, MetaDataDto$$serializer.INSTANCE, self.metaDataDto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAbout() {
        return this.about;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getId() {
        return this.id;
    }

    public final InviteCodeDto getInviteCodeDto() {
        return this.inviteCodeDto;
    }

    public final MetaDataDto getMetaDataDto() {
        return this.metaDataDto;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOwnerId() {
        return this.ownerId;
    }

    public final boolean getPrivate() {
        return this.private;
    }

    public final boolean getShareRecovery() {
        return this.shareRecovery;
    }

    public final boolean getShareSleep() {
        return this.shareSleep;
    }

    public final boolean getShareStrain() {
        return this.shareStrain;
    }

    public final TeamType getTeamType() {
        return this.teamType;
    }

    public final FeatureTeam toFeatureTeam() {
        String inviteCode;
        String str = this.name;
        String str2 = this.about;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.avatar;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.banner;
        if (str5 == null) {
            str5 = "";
        }
        MetaDataDto metaDataDto = this.metaDataDto;
        int memberCount = metaDataDto != null ? metaDataDto.getMemberCount() : 0;
        InviteCodeDto inviteCodeDto = this.inviteCodeDto;
        if (inviteCodeDto != null && (inviteCode = inviteCodeDto.getInviteCode()) != null) {
            str3 = inviteCode;
        }
        TeamType teamType = this.teamType;
        if (teamType == null) {
            teamType = TeamType.COMMUNITY;
        }
        MetaDataDto metaDataDto2 = this.metaDataDto;
        return new FeatureTeam(str, str2, str4, str5, 0, memberCount, str3, teamType, metaDataDto2 != null ? metaDataDto2.getCommunityId() : 0, false, 512, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeString(this.name);
        dest.writeInt(this.ownerId);
        dest.writeInt(this.shareStrain ? 1 : 0);
        dest.writeInt(this.shareRecovery ? 1 : 0);
        dest.writeInt(this.shareSleep ? 1 : 0);
        dest.writeString(this.about);
        dest.writeString(this.banner);
        dest.writeString(this.avatar);
        dest.writeInt(this.private ? 1 : 0);
        TeamType teamType = this.teamType;
        if (teamType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            teamType.writeToParcel(dest, flags);
        }
        InviteCodeDto inviteCodeDto = this.inviteCodeDto;
        if (inviteCodeDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inviteCodeDto.writeToParcel(dest, flags);
        }
        MetaDataDto metaDataDto = this.metaDataDto;
        if (metaDataDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            metaDataDto.writeToParcel(dest, flags);
        }
    }

    public FeatureCommunityDto(int i13, boolean z4, String name, int i14, boolean z13, boolean z14, boolean z15, String str, String str2, String str3, boolean z16, TeamType teamType, InviteCodeDto inviteCodeDto, MetaDataDto metaDataDto) {
        AbstractC22676k.m65750j(name, "name");
        this.id = i13;
        this.deleted = z4;
        this.name = name;
        this.ownerId = i14;
        this.shareStrain = z13;
        this.shareRecovery = z14;
        this.shareSleep = z15;
        this.about = str;
        this.banner = str2;
        this.avatar = str3;
        this.private = z16;
        this.teamType = teamType;
        this.inviteCodeDto = inviteCodeDto;
        this.metaDataDto = metaDataDto;
    }
}
