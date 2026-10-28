.class public final Lcom/whoop/domain/model/teams/CommunityDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/CommunityDto$$serializer;,
        Lcom/whoop/domain/model/teams/CommunityDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 m2\u00020\u0001:\u0002nmB\u00a5\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bB\u00bb\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001a\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008!\u0010\"J\r\u0010#\u001a\u00020\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010$J\u0010\u0010,\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010$J\u0010\u00101\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010-J\u0010\u00102\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010-J\u0010\u00103\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010/J\u0012\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010/J\u0010\u00107\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010=J\u0010\u0010?\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010-J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u00d0\u0001\u0010B\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00042\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u0008B\u0010CJ\u0010\u0010D\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008D\u0010/J\u0010\u0010E\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008E\u0010$J\u001a\u0010H\u001a\u00020\u00042\u0008\u0010G\u001a\u0004\u0018\u00010FH\u00d6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\'\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001\u00a2\u0006\u0004\u0008O\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010R\u001a\u0004\u0008S\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010T\u001a\u0004\u0008U\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010V\u001a\u0004\u0008W\u0010/R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010R\u001a\u0004\u0008X\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010T\u001a\u0004\u0008Y\u0010-R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010T\u001a\u0004\u0008Z\u0010-R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010T\u001a\u0004\u0008[\u0010-R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010V\u001a\u0004\u0008\\\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010V\u001a\u0004\u0008]\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010V\u001a\u0004\u0008^\u0010/R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010T\u001a\u0004\u0008_\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010`\u001a\u0004\u0008a\u00109R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010b\u0012\u0004\u0008d\u0010e\u001a\u0004\u0008c\u0010;R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010f\u0012\u0004\u0008h\u0010e\u001a\u0004\u0008g\u0010=R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010f\u001a\u0004\u0008i\u0010=R\u001a\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010T\u001a\u0004\u0008j\u0010-R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010k\u001a\u0004\u0008l\u0010A\u00a8\u0006o"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "deleted",
        "",
        "name",
        "ownerId",
        "shareStrain",
        "shareRecovery",
        "shareSleep",
        "about",
        "banner",
        "avatar",
        "private",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "teamType",
        "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;",
        "metaDataDto",
        "rank",
        "unreadCount",
        "chatEnabled",
        "",
        "Lcom/whoop/domain/model/teams/ChatChannelDto;",
        "chatChannels",
        "<init>",
        "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/domain/model/teams/Team;",
        "toTeam",
        "()Lcom/whoop/domain/model/teams/Team;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "()Z",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/domain/model/teams/TeamType;",
        "component13",
        "()Lcom/whoop/domain/model/teams/CommunityMetaDataDto;",
        "component14",
        "()Ljava/lang/Integer;",
        "component15",
        "component16",
        "component17",
        "()Ljava/util/List;",
        "copy",
        "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)Lcom/whoop/domain/model/teams/CommunityDto;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/CommunityDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "Z",
        "getDeleted",
        "Ljava/lang/String;",
        "getName",
        "getOwnerId",
        "getShareStrain",
        "getShareRecovery",
        "getShareSleep",
        "getAbout",
        "getBanner",
        "getAvatar",
        "getPrivate",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "getTeamType",
        "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;",
        "getMetaDataDto",
        "getMetaDataDto$annotations",
        "()V",
        "Ljava/lang/Integer;",
        "getRank",
        "getRank$annotations",
        "getUnreadCount",
        "getChatEnabled",
        "Ljava/util/List;",
        "getChatChannels",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/teams/CommunityDto$Companion;


# instance fields
.field private final about:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "about"
    .end annotation
.end field

.field private final avatar:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avatar"
    .end annotation
.end field

.field private final banner:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner"
    .end annotation
.end field

.field private final chatChannels:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chat_channels"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/ChatChannelDto;",
            ">;"
        }
    .end annotation
.end field

.field private final chatEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chat_enabled"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final ownerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "owner_id"
    .end annotation
.end field

.field private final private:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "private"
    .end annotation
.end field

.field private final rank:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_rank"
    .end annotation
.end field

.field private final shareRecovery:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_recovery"
    .end annotation
.end field

.field private final shareSleep:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_sleep"
    .end annotation
.end field

.field private final shareStrain:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_strain"
    .end annotation
.end field

.field private final teamType:Lcom/whoop/domain/model/teams/TeamType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "team_type"
    .end annotation
.end field

.field private final unreadCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unread_count"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/domain/model/teams/CommunityDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/CommunityDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/CommunityDto;->Companion:Lcom/whoop/domain/model/teams/CommunityDto$Companion;

    new-instance v0, Lcom/whoop/domain/model/teams/CommunityDto$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/CommunityDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/CommunityDto;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ls51/p;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Ls51/p;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0x11

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    const/16 v4, 0x8

    aput-object v1, v3, v4

    const/16 v4, 0x9

    aput-object v1, v3, v4

    const/16 v4, 0xa

    aput-object v1, v3, v4

    const/16 v4, 0xb

    aput-object v2, v3, v4

    const/16 v2, 0xc

    aput-object v1, v3, v2

    const/16 v2, 0xd

    aput-object v1, v3, v2

    const/16 v2, 0xe

    aput-object v1, v3, v2

    const/16 v2, 0xf

    aput-object v1, v3, v2

    const/16 v1, 0x10

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/domain/model/teams/CommunityDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/CommunityDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    iput-object p4, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    iput-boolean p6, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    iput-boolean p8, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    iput-object p9, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    iput-object p13, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    move/from16 p1, p17

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/lang/String;",
            "IZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/ChatChannelDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    .line 4
    iput-boolean p2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    .line 7
    iput-boolean p5, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    .line 8
    iput-boolean p6, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    .line 9
    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    .line 14
    iput-object p12, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    .line 15
    iput-object p13, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    .line 16
    iput-object p14, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.domain.model.teams.TeamType"

    invoke-static {}, Lcom/whoop/domain/model/teams/TeamType;->values()[Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/domain/model/teams/ChatChannelDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/ChatChannelDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/CommunityDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/domain/model/teams/CommunityDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/CommunityDto;IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move/from16 p2, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    move/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move/from16 p17, v1

    move/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/domain/model/teams/CommunityDto;->copy(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/domain/model/teams/CommunityDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getMetaDataDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metadata"
    .end annotation

    return-void
.end method

.method public static synthetic getRank$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "user_rank"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/CommunityDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/domain/model/teams/CommunityDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xb

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMetaDataDto$$serializer;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    const/16 v3, 0xd

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    return v0
.end method

.method public final component12()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final component13()Lcom/whoop/domain/model/teams/CommunityMetaDataDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    return v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/ChatChannelDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/lang/String;",
            "IZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "Lcom/whoop/domain/model/teams/CommunityMetaDataDto;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/ChatChannelDto;",
            ">;)",
            "Lcom/whoop/domain/model/teams/CommunityDto;"
        }
    .end annotation

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/CommunityDto;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/domain/model/teams/CommunityDto;-><init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/CommunityDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/CommunityDto;

    iget v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAbout()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatar()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final getBanner()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    return-object v0
.end method

.method public final getChatChannels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/ChatChannelDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    return-object v0
.end method

.method public final getChatEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    return v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    return v0
.end method

.method public final getMetaDataDto()Lcom/whoop/domain/model/teams/CommunityMetaDataDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    return v0
.end method

.method public final getPrivate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    return v0
.end method

.method public final getRank()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShareRecovery()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    return v0
.end method

.method public final getShareSleep()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    return v0
.end method

.method public final getShareStrain()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    return v0
.end method

.method public final getTeamType()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final getUnreadCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    iget-boolean v2, v0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    iget-object v3, v0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    iget v4, v0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    iget-boolean v5, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    iget-boolean v6, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    iget-boolean v7, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    iget-object v8, v0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    iget-object v12, v0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget-object v13, v0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    iget-object v14, v0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    move/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v18, v15

    const-string v15, "CommunityDto(id="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownerId="

    const-string v2, ", shareStrain="

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", shareRecovery="

    const-string v2, ", shareSleep="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", about="

    const-string v2, ", banner="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", avatar="

    const-string v2, ", private="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", teamType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metaDataDto="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rank="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", chatEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", chatChannels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v18

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTeam()Lcom/whoop/domain/model/teams/Team;
    .locals 24

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/whoop/ui/ScoreContext;->OVERVIEW:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    if-eqz v1, :cond_1

    sget-object v1, Lcom/whoop/ui/ScoreContext;->STRAIN:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    if-eqz v1, :cond_2

    sget-object v1, Lcom/whoop/ui/ScoreContext;->RECOVERY:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    if-eqz v1, :cond_3

    sget-object v1, Lcom/whoop/ui/ScoreContext;->SLEEP:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    if-eqz v1, :cond_4

    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :goto_0
    move-object/from16 v19, v1

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    goto :goto_0

    :goto_1
    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    if-eqz v1, :cond_5

    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :goto_2
    move-object/from16 v20, v1

    goto :goto_3

    :cond_5
    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    goto :goto_2

    :goto_3
    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    if-eqz v1, :cond_6

    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :goto_4
    move-object/from16 v21, v1

    goto :goto_5

    :cond_6
    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    goto :goto_4

    :goto_5
    sget-object v18, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    new-instance v10, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v23}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget v4, v0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    iget-object v5, v0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    const-string v3, ""

    if-nez v1, :cond_7

    move-object v7, v3

    goto :goto_6

    :cond_7
    move-object v7, v1

    :goto_6
    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    if-nez v1, :cond_8

    move-object v8, v3

    goto :goto_7

    :cond_8
    move-object v8, v1

    :goto_7
    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-nez v1, :cond_9

    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    :cond_9
    move-object v13, v1

    iget v12, v0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;->getMemberCount()I

    move-result v1

    move v14, v1

    goto :goto_8

    :cond_a
    move v14, v3

    :goto_8
    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v15, v1

    goto :goto_9

    :cond_b
    move v15, v3

    :goto_9
    iget-object v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/teams/ChatChannelDto;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/ChatChannelDto;->toChatChannels()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object v2

    :cond_c
    move-object/from16 v16, v2

    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    iget-object v2, v0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_d
    move/from16 v18, v3

    new-instance v3, Lcom/whoop/domain/model/teams/Team;

    const/4 v9, 0x0

    move/from16 v17, v1

    invoke-direct/range {v3 .. v18}, Lcom/whoop/domain/model/teams/Team;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    return-object v3
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->deleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->ownerId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareStrain:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareRecovery:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->shareSleep:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->about:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->banner:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->avatar:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->private:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamType;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->rank:Ljava/lang/Integer;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_2
    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->unreadCount:Ljava/lang/Integer;

    if-nez v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_3
    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityDto;->chatChannels:Ljava/util/List;

    if-nez v0, :cond_4

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/teams/ChatChannelDto;

    invoke-virtual {v1, p1, p2}, Lcom/whoop/domain/model/teams/ChatChannelDto;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_5
    return-void
.end method
