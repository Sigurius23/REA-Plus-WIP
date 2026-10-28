package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.p069ui.ScoreContext;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u0002nmB¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bB»\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010/J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJÐ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bD\u0010/J\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010$J\u001a\u0010H\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010/R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bX\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010T\u001a\u0004\bY\u0010-R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bZ\u0010-R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010T\u001a\u0004\b[\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\b\\\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\b]\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\b^\u0010/R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\b_\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010`\u001a\u0004\ba\u00109R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010b\u0012\u0004\bd\u0010e\u001a\u0004\bc\u0010;R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010f\u0012\u0004\bh\u0010e\u001a\u0004\bg\u0010=R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\bi\u0010=R\u001a\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010T\u001a\u0004\bj\u0010-R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010k\u001a\u0004\bl\u0010A¨\u0006o"}, m65681d2 = {"Lcom/whoop/domain/model/teams/CommunityDto;", "Landroid/os/Parcelable;", "", "id", "", "deleted", "", "name", "ownerId", "shareStrain", "shareRecovery", "shareSleep", "about", "banner", "avatar", "private", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;", "metaDataDto", "rank", "unreadCount", "chatEnabled", "", "Lcom/whoop/domain/model/teams/ChatChannelDto;", "chatChannels", "<init>", "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/domain/model/teams/Team;", "toTeam", "()Lcom/whoop/domain/model/teams/Team;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/domain/model/teams/TeamType;", "component13", "()Lcom/whoop/domain/model/teams/CommunityMetaDataDto;", "component14", "()Ljava/lang/Integer;", "component15", "component16", "component17", "()Ljava/util/List;", "copy", "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)Lcom/whoop/domain/model/teams/CommunityDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/CommunityDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "Z", "getDeleted", "Ljava/lang/String;", "getName", "getOwnerId", "getShareStrain", "getShareRecovery", "getShareSleep", "getAbout", "getBanner", "getAvatar", "getPrivate", "Lcom/whoop/domain/model/teams/TeamType;", "getTeamType", "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;", "getMetaDataDto", "getMetaDataDto$annotations", "()V", "Ljava/lang/Integer;", "getRank", "getRank$annotations", "getUnreadCount", "getChatEnabled", "Ljava/util/List;", "getChatChannels", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityDto implements Parcelable {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("about")
    private final String about;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("banner")
    private final String banner;

    @SerializedName("chat_channels")
    private final List<ChatChannelDto> chatChannels;

    @SerializedName("chat_enabled")
    private final boolean chatEnabled;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("id")
    private final int id;

    @SerializedName("metadata")
    private final CommunityMetaDataDto metaDataDto;

    @SerializedName("name")
    private final String name;

    @SerializedName("owner_id")
    private final int ownerId;

    @SerializedName("private")
    private final boolean private;

    @SerializedName("user_rank")
    private final Integer rank;

    @SerializedName("share_recovery")
    private final boolean shareRecovery;

    @SerializedName("share_sleep")
    private final boolean shareSleep;

    @SerializedName("share_strain")
    private final boolean shareStrain;

    @SerializedName("team_type")
    private final TeamType teamType;

    @SerializedName("unread_count")
    private final Integer unreadCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CommunityDto> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/CommunityDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/CommunityDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<CommunityDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            boolean z4 = parcel.readInt() != 0;
            String string = parcel.readString();
            int i14 = parcel.readInt();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z16 = parcel.readInt() != 0;
            ArrayList arrayList = null;
            TeamType teamTypeCreateFromParcel = parcel.readInt() == 0 ? null : TeamType.CREATOR.createFromParcel(parcel);
            CommunityMetaDataDto communityMetaDataDtoCreateFromParcel = parcel.readInt() == 0 ? null : CommunityMetaDataDto.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iM79498b = 0;
                while (iM79498b != i15) {
                    iM79498b = AbstractC26725a.m79498b(ChatChannelDto.CREATOR, parcel, arrayList2, iM79498b, 1);
                    communityMetaDataDtoCreateFromParcel = communityMetaDataDtoCreateFromParcel;
                    i13 = i13;
                }
                arrayList = arrayList2;
            }
            return new CommunityDto(i13, z4, string, i14, z13, z14, z15, string2, string3, string4, z16, teamTypeCreateFromParcel, communityMetaDataDtoCreateFromParcel, numValueOf, numValueOf2, z17, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityDto[] newArray(int i13) {
            return new CommunityDto[i13];
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(20)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(21))};
    }

    public /* synthetic */ CommunityDto(int i13, int i14, boolean z4, String str, int i15, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4, boolean z16, TeamType teamType, CommunityMetaDataDto communityMetaDataDto, Integer num, Integer num2, boolean z17, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i13 & 131071)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131071, CommunityDto$$serializer.INSTANCE.getDescriptor());
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
        this.metaDataDto = communityMetaDataDto;
        this.rank = num;
        this.unreadCount = num2;
        this.chatEnabled = z17;
        this.chatChannels = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.domain.model.teams.TeamType", TeamType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ChatChannelDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityDto copy$default(CommunityDto communityDto, int i13, boolean z4, String str, int i14, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4, boolean z16, TeamType teamType, CommunityMetaDataDto communityMetaDataDto, Integer num, Integer num2, boolean z17, List list, int i15, Object obj) {
        List list2;
        boolean z18;
        int i16 = (i15 & 1) != 0 ? communityDto.id : i13;
        boolean z19 = (i15 & 2) != 0 ? communityDto.deleted : z4;
        String str5 = (i15 & 4) != 0 ? communityDto.name : str;
        int i17 = (i15 & 8) != 0 ? communityDto.ownerId : i14;
        boolean z24 = (i15 & 16) != 0 ? communityDto.shareStrain : z13;
        boolean z25 = (i15 & 32) != 0 ? communityDto.shareRecovery : z14;
        boolean z26 = (i15 & 64) != 0 ? communityDto.shareSleep : z15;
        String str6 = (i15 & 128) != 0 ? communityDto.about : str2;
        String str7 = (i15 & 256) != 0 ? communityDto.banner : str3;
        String str8 = (i15 & 512) != 0 ? communityDto.avatar : str4;
        boolean z27 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? communityDto.private : z16;
        TeamType teamType2 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? communityDto.teamType : teamType;
        CommunityMetaDataDto communityMetaDataDto2 = (i15 & 4096) != 0 ? communityDto.metaDataDto : communityMetaDataDto;
        Integer num3 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? communityDto.rank : num;
        int i18 = i16;
        Integer num4 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? communityDto.unreadCount : num2;
        boolean z28 = (i15 & 32768) != 0 ? communityDto.chatEnabled : z17;
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            z18 = z28;
            list2 = communityDto.chatChannels;
        } else {
            list2 = list;
            z18 = z28;
        }
        return communityDto.copy(i18, z19, str5, i17, z24, z25, z26, str6, str7, str8, z27, teamType2, communityMetaDataDto2, num3, num4, z18, list2);
    }

    @InterfaceC37143h("metadata")
    public static /* synthetic */ void getMetaDataDto$annotations() {
    }

    @InterfaceC37143h("user_rank")
    public static /* synthetic */ void getRank$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(CommunityDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
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
        output.encodeNullableSerializableElement(serialDesc, 12, CommunityMetaDataDto$$serializer.INSTANCE, self.metaDataDto);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 13, intSerializer, self.rank);
        output.encodeNullableSerializableElement(serialDesc, 14, intSerializer, self.unreadCount);
        output.encodeBooleanElement(serialDesc, 15, self.chatEnabled);
        output.encodeNullableSerializableElement(serialDesc, 16, (InterfaceC37145j) interfaceC23462hArr[16].getValue(), self.chatChannels);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getPrivate() {
        return this.private;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TeamType getTeamType() {
        return this.teamType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final CommunityMetaDataDto getMetaDataDto() {
        return this.metaDataDto;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    public final List<ChatChannelDto> component17() {
        return this.chatChannels;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShareStrain() {
        return this.shareStrain;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShareRecovery() {
        return this.shareRecovery;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShareSleep() {
        return this.shareSleep;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAbout() {
        return this.about;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    public final CommunityDto copy(int id4, boolean deleted, String name, int ownerId, boolean shareStrain, boolean shareRecovery, boolean shareSleep, String about, String banner, String avatar, boolean z4, TeamType teamType, CommunityMetaDataDto metaDataDto, Integer rank, Integer unreadCount, boolean chatEnabled, List<ChatChannelDto> chatChannels) {
        AbstractC22676k.m65750j(name, "name");
        return new CommunityDto(id4, deleted, name, ownerId, shareStrain, shareRecovery, shareSleep, about, banner, avatar, z4, teamType, metaDataDto, rank, unreadCount, chatEnabled, chatChannels);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityDto)) {
            return false;
        }
        CommunityDto communityDto = (CommunityDto) other;
        return this.id == communityDto.id && this.deleted == communityDto.deleted && AbstractC22676k.m65745e(this.name, communityDto.name) && this.ownerId == communityDto.ownerId && this.shareStrain == communityDto.shareStrain && this.shareRecovery == communityDto.shareRecovery && this.shareSleep == communityDto.shareSleep && AbstractC22676k.m65745e(this.about, communityDto.about) && AbstractC22676k.m65745e(this.banner, communityDto.banner) && AbstractC22676k.m65745e(this.avatar, communityDto.avatar) && this.private == communityDto.private && this.teamType == communityDto.teamType && AbstractC22676k.m65745e(this.metaDataDto, communityDto.metaDataDto) && AbstractC22676k.m65745e(this.rank, communityDto.rank) && AbstractC22676k.m65745e(this.unreadCount, communityDto.unreadCount) && this.chatEnabled == communityDto.chatEnabled && AbstractC22676k.m65745e(this.chatChannels, communityDto.chatChannels);
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

    public final List<ChatChannelDto> getChatChannels() {
        return this.chatChannels;
    }

    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getId() {
        return this.id;
    }

    public final CommunityMetaDataDto getMetaDataDto() {
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

    public final Integer getRank() {
        return this.rank;
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

    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.ownerId, AbstractC11266d.m30450d(AbstractC2875y.m8289b(Integer.hashCode(this.id) * 31, 31, this.deleted), 31, this.name), 31), 31, this.shareStrain), 31, this.shareRecovery), 31, this.shareSleep);
        String str = this.about;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.banner;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.private);
        TeamType teamType = this.teamType;
        int iHashCode3 = (iM8289b2 + (teamType == null ? 0 : teamType.hashCode())) * 31;
        CommunityMetaDataDto communityMetaDataDto = this.metaDataDto;
        int iHashCode4 = (iHashCode3 + (communityMetaDataDto == null ? 0 : communityMetaDataDto.hashCode())) * 31;
        Integer num = this.rank;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unreadCount;
        int iM8289b3 = AbstractC2875y.m8289b((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.chatEnabled);
        List<ChatChannelDto> list = this.chatChannels;
        return iM8289b3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        boolean z4 = this.deleted;
        String str = this.name;
        int i14 = this.ownerId;
        boolean z13 = this.shareStrain;
        boolean z14 = this.shareRecovery;
        boolean z15 = this.shareSleep;
        String str2 = this.about;
        String str3 = this.banner;
        String str4 = this.avatar;
        boolean z16 = this.private;
        TeamType teamType = this.teamType;
        CommunityMetaDataDto communityMetaDataDto = this.metaDataDto;
        Integer num = this.rank;
        Integer num2 = this.unreadCount;
        boolean z17 = this.chatEnabled;
        List<ChatChannelDto> list = this.chatChannels;
        StringBuilder sb4 = new StringBuilder("CommunityDto(id=");
        sb4.append(i13);
        sb4.append(", deleted=");
        sb4.append(z4);
        sb4.append(", name=");
        AbstractC11266d.m30470x(i14, str, ", ownerId=", ", shareStrain=", sb4);
        AbstractC38963t7.m124392v(sb4, z13, ", shareRecovery=", z14, ", shareSleep=");
        AbstractC38963t7.m124391u(sb4, z15, ", about=", str2, ", banner=");
        AbstractC11266d.m30444B(sb4, str3, ", avatar=", str4, ", private=");
        sb4.append(z16);
        sb4.append(", teamType=");
        sb4.append(teamType);
        sb4.append(", metaDataDto=");
        sb4.append(communityMetaDataDto);
        sb4.append(", rank=");
        sb4.append(num);
        sb4.append(", unreadCount=");
        sb4.append(num2);
        sb4.append(", chatEnabled=");
        sb4.append(z17);
        sb4.append(", chatChannels=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public final Team toTeam() {
        ChatChannelDto chatChannelDto;
        ChatChannel chatChannels = null;
        if (this.deleted) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScoreContext.OVERVIEW);
        if (this.shareStrain) {
            arrayList.add(ScoreContext.STRAIN);
        }
        if (this.shareRecovery) {
            arrayList.add(ScoreContext.RECOVERY);
        }
        if (this.shareSleep) {
            arrayList.add(ScoreContext.SLEEP);
        }
        TeamPrivacyProfile teamPrivacyProfile = new TeamPrivacyProfile(null, null, null, null, null, PrivacyType.DETAIL, this.shareStrain ? PrivacyType.DETAIL : PrivacyType.HIDDEN, this.shareRecovery ? PrivacyType.DETAIL : PrivacyType.HIDDEN, this.shareSleep ? PrivacyType.DETAIL : PrivacyType.HIDDEN, 7, null);
        int i13 = this.id;
        String str = this.name;
        String str2 = this.about;
        String str3 = this.avatar;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.banner;
        String str6 = str5 == null ? "" : str5;
        TeamType teamType = this.teamType;
        if (teamType == null) {
            teamType = TeamType.COMMUNITY;
        }
        TeamType teamType2 = teamType;
        int i14 = this.ownerId;
        CommunityMetaDataDto communityMetaDataDto = this.metaDataDto;
        int memberCount = communityMetaDataDto != null ? communityMetaDataDto.getMemberCount() : 0;
        Integer num = this.rank;
        int iIntValue = num != null ? num.intValue() : 0;
        List<ChatChannelDto> list = this.chatChannels;
        if (list != null && (chatChannelDto = (ChatChannelDto) AbstractC25265s.m74096F0(list)) != null) {
            chatChannels = chatChannelDto.toChatChannels();
        }
        ChatChannel chatChannel = chatChannels;
        boolean z4 = this.chatEnabled;
        Integer num2 = this.unreadCount;
        return new Team(i13, str, str2, str4, str6, 0, teamPrivacyProfile, arrayList, i14, teamType2, memberCount, iIntValue, chatChannel, z4, num2 != null ? num2.intValue() : 0);
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
        CommunityMetaDataDto communityMetaDataDto = this.metaDataDto;
        if (communityMetaDataDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            communityMetaDataDto.writeToParcel(dest, flags);
        }
        Integer num = this.rank;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.unreadCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeInt(this.chatEnabled ? 1 : 0);
        List<ChatChannelDto> list = this.chatChannels;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ChatChannelDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public CommunityDto(int i13, boolean z4, String name, int i14, boolean z13, boolean z14, boolean z15, String str, String str2, String str3, boolean z16, TeamType teamType, CommunityMetaDataDto communityMetaDataDto, Integer num, Integer num2, boolean z17, List<ChatChannelDto> list) {
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
        this.metaDataDto = communityMetaDataDto;
        this.rank = num;
        this.unreadCount = num2;
        this.chatEnabled = z17;
        this.chatChannels = list;
    }
}
