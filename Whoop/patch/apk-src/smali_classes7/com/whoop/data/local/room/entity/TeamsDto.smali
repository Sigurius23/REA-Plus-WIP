.class public final Lcom/whoop/data/local/room/entity/TeamsDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0008\u0001\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0010\u0010*\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010+J\u0010\u0010-\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010+J\u0010\u0010.\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010+J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010 J\u0010\u00100\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0016\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010 J\u0010\u00105\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010 J\u0010\u00108\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010 J\u0012\u00109\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010 J\u00bc\u0001\u0010>\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000e\u0008\u0003\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u0010\u0010@\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010+J\u0010\u0010A\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008A\u0010 J\u001a\u0010D\u001a\u00020\u00172\u0008\u0010C\u001a\u0004\u0018\u00010BH\u00d6\u0003\u00a2\u0006\u0004\u0008D\u0010ER$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008G\u0010(\"\u0004\u0008H\u0010IR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010J\u001a\u0004\u0008K\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010L\u001a\u0004\u0008M\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010L\u001a\u0004\u0008N\u0010+R\u001a\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010L\u001a\u0004\u0008O\u0010+R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010L\u001a\u0004\u0008P\u0010+R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010J\u001a\u0004\u0008Q\u0010 R\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010R\u001a\u0004\u0008S\u00101R \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010T\u001a\u0004\u0008U\u00103R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008V\u0010 R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010W\u001a\u0004\u0008X\u00106R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010J\u001a\u0004\u0008Y\u0010 R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010J\u001a\u0004\u0008Z\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010[\u001a\u0004\u0008\\\u0010:R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010]\u001a\u0004\u0008^\u0010<R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010J\u001a\u0004\u0008_\u0010 \u00a8\u0006`"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        "Landroid/os/Parcelable;",
        "",
        "userId",
        "id",
        "",
        "name",
        "description",
        "iconUrl",
        "bannerUrl",
        "athletePrivacyId",
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "privacyProfile",
        "",
        "Lcom/whoop/ui/ScoreContext;",
        "enabledTabs",
        "adminId",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "teamType",
        "memberCount",
        "rank",
        "Lcom/whoop/domain/model/teams/ChatChannel;",
        "chatChannel",
        "",
        "chatEnabled",
        "unreadCount",
        "<init>",
        "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V",
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
        "()Ljava/lang/Integer;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "component11",
        "()Lcom/whoop/domain/model/teams/TeamType;",
        "component12",
        "component13",
        "component14",
        "()Lcom/whoop/domain/model/teams/ChatChannel;",
        "component15",
        "()Z",
        "component16",
        "copy",
        "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/data/local/room/entity/TeamsDto;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getUserId",
        "setUserId",
        "(Ljava/lang/Integer;)V",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getName",
        "getDescription",
        "getIconUrl",
        "getBannerUrl",
        "getAthletePrivacyId",
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "getPrivacyProfile",
        "Ljava/util/List;",
        "getEnabledTabs",
        "getAdminId",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "getTeamType",
        "getMemberCount",
        "getRank",
        "Lcom/whoop/domain/model/teams/ChatChannel;",
        "getChatChannel",
        "Z",
        "getChatEnabled",
        "getUnreadCount",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final adminId:I

.field private final athletePrivacyId:I

.field private final bannerUrl:Ljava/lang/String;

.field private final chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

.field private final chatEnabled:Z

.field private final description:Ljava/lang/String;

.field private final enabledTabs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;"
        }
    .end annotation
.end field

.field private final iconUrl:Ljava/lang/String;

.field private final id:I

.field private final memberCount:I

.field private final name:Ljava/lang/String;

.field private final privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

.field private final rank:I

.field private final teamType:Lcom/whoop/domain/model/teams/TeamType;

.field private final unreadCount:I

.field private userId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/data/local/room/entity/TeamsDto$Creator;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/TeamsDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/data/local/room/entity/TeamsDto;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/ui/ScoreContext;",
            ">;I",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "II",
            "Lcom/whoop/domain/model/teams/ChatChannel;",
            "ZI)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledTabs"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    .line 3
    iput p2, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    .line 4
    iput-object p3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    .line 9
    iput-object p8, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    .line 10
    iput-object p9, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    .line 11
    iput p10, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    .line 12
    iput-object p11, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    .line 13
    iput p12, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    .line 14
    iput p13, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    move-object p1, p14

    .line 15
    iput-object p1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    move v13, v2

    :goto_1
    move-object/from16 v3, p0

    move/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v14, p11

    move/from16 v15, p12

    move/from16 v16, p13

    move-object/from16 v17, p14

    move/from16 v18, p15

    move/from16 v19, p16

    goto :goto_2

    :cond_1
    move/from16 v13, p10

    goto :goto_1

    .line 19
    :goto_2
    invoke-direct/range {v3 .. v19}, Lcom/whoop/data/local/room/entity/TeamsDto;-><init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/TeamsDto;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZIILjava/lang/Object;)Lcom/whoop/data/local/room/entity/TeamsDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    move/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/data/local/room/entity/TeamsDto;->copy(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/data/local/room/entity/TeamsDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    return v0
.end method

.method public final component11()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    return v0
.end method

.method public final component14()Lcom/whoop/domain/model/teams/ChatChannel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    return v0
.end method

.method public final component8()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/data/local/room/entity/TeamsDto;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/ui/ScoreContext;",
            ">;I",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "II",
            "Lcom/whoop/domain/model/teams/ChatChannel;",
            "ZI)",
            "Lcom/whoop/data/local/room/entity/TeamsDto;"
        }
    .end annotation

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledTabs"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/local/room/entity/TeamsDto;

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v8, p7

    move/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/data/local/room/entity/TeamsDto;-><init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

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
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/TeamsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/TeamsDto;

    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    iget p1, p1, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAdminId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    return v0
.end method

.method public final getAthletePrivacyId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    return v0
.end method

.method public final getBannerUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    return-object v0
.end method

.method public final getChatEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnabledTabs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    return v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final getRank()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    return v0
.end method

.method public final getTeamType()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final getUnreadCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    return v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v3}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    invoke-static {v0, v3, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/domain/model/teams/ChatChannel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setUserId(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    iget v2, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    iget-object v3, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    iget v7, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    iget-object v8, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v9, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    iget v10, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    iget-object v11, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget v12, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    iget v13, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    iget-object v14, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    iget-boolean v15, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    move/from16 v16, v15

    iget v15, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v17, v15

    const-string v15, "TeamsDto(userId="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    const-string v2, ", iconUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", bannerUrl="

    const-string v2, ", athletePrivacyId="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", privacyProfile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabledTabs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adminId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", teamType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memberCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rank="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", chatChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", chatEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTeam()Lcom/whoop/domain/model/teams/Team;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lcom/whoop/domain/model/teams/Team;

    iget v2, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    iget-object v3, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    iget v7, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    iget-object v8, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v9, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    iget v10, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    iget-object v11, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget v12, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    iget v13, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    iget-object v14, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    iget-boolean v15, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    move-object/from16 v16, v1

    iget v1, v0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    move-object/from16 v17, v16

    move/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lcom/whoop/domain/model/teams/Team;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->userId:Ljava/lang/Integer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->bannerUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->athletePrivacyId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->enabledTabs:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->adminId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamType;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->memberCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->rank:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/ChatChannel;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-boolean p2, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->chatEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/data/local/room/entity/TeamsDto;->unreadCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
