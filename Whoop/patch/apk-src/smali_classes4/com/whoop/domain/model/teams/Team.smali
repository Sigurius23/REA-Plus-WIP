.class public final Lcom/whoop/domain/model/teams/Team;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0000\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0010\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0010\u0010+\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010\u001fJ\u0010\u00102\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010\u001fJ\u0010\u00105\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010\u001fJ\u0012\u00106\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010\u001fJ\u00b0\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010(J\u0010\u0010>\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010\u001fJ\u001a\u0010A\u001a\u00020\u00162\u0008\u0010@\u001a\u0004\u0018\u00010?H\u00d6\u0003\u00a2\u0006\u0004\u0008A\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010C\u001a\u0004\u0008D\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010E\u001a\u0004\u0008F\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010E\u001a\u0004\u0008G\u0010(R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010E\u001a\u0004\u0008H\u0010(R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008I\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008J\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010K\u001a\u0004\u0008L\u0010.R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010M\u001a\u0004\u0008N\u00100R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008O\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010P\u001a\u0004\u0008Q\u00103R\u0017\u0010\u0012\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010C\u001a\u0004\u0008R\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010C\u001a\u0004\u0008S\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010T\u001a\u0004\u0008U\u00107R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010V\u001a\u0004\u0008W\u00109R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010C\u001a\u0004\u0008X\u0010\u001f\"\u0004\u0008Y\u0010Z\u00a8\u0006["
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/Team;",
        "Landroid/os/Parcelable;",
        "",
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
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "toCommunityDto",
        "()Lcom/whoop/domain/model/teams/CommunityDto;",
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
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "component8",
        "()Ljava/util/List;",
        "component9",
        "component10",
        "()Lcom/whoop/domain/model/teams/TeamType;",
        "component11",
        "component12",
        "component13",
        "()Lcom/whoop/domain/model/teams/ChatChannel;",
        "component14",
        "()Z",
        "component15",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/domain/model/teams/Team;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
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
        "setUnreadCount",
        "(I)V",
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
            "Lcom/whoop/domain/model/teams/Team;",
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

.field private unreadCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/Team$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/Team$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/Team;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
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

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledTabs"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    .line 3
    iput-object p2, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    .line 7
    iput p6, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    .line 8
    iput-object p7, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    .line 9
    iput-object p8, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    .line 10
    iput p9, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    .line 11
    iput-object p10, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    .line 12
    iput p11, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    .line 13
    iput p12, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    .line 14
    iput-object p13, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    .line 15
    iput-boolean p14, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v10, v0

    :goto_0
    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    goto :goto_1

    :cond_0
    move/from16 v10, p9

    goto :goto_0

    .line 17
    :goto_1
    invoke-direct/range {v1 .. v16}, Lcom/whoop/domain/model/teams/Team;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/Team;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZIILjava/lang/Object;)Lcom/whoop/domain/model/teams/Team;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/domain/model/teams/Team;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/whoop/domain/model/teams/Team;->rank:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/whoop/domain/model/teams/Team;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    return v0
.end method

.method public final component10()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    return v0
.end method

.method public final component13()Lcom/whoop/domain/model/teams/ChatChannel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    return v0
.end method

.method public final component7()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/domain/model/teams/Team;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
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
            "Lcom/whoop/domain/model/teams/Team;"
        }
    .end annotation

    const-string v0, "name"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledTabs"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/Team;

    move/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v7, p6

    move/from16 v10, p9

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/domain/model/teams/Team;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

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
    instance-of v1, p1, Lcom/whoop/domain/model/teams/Team;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/Team;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/Team;->adminId:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    iget v3, p1, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    iget v3, p1, Lcom/whoop/domain/model/teams/Team;->rank:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    iget p1, p1, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAdminId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    return v0
.end method

.method public final getAthletePrivacyId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    return v0
.end method

.method public final getBannerUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    return-object v0
.end method

.method public final getChatEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    return v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final getRank()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    return v0
.end method

.method public final getTeamType()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final getUnreadCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/ChatChannel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v1, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setUnreadCount(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    return-void
.end method

.method public final toCommunityDto()Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 19

    move-object/from16 v0, p0

    iget v2, v0, Lcom/whoop/domain/model/teams/Team;->id:I

    iget-object v4, v0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    iget v5, v0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    iget-object v1, v0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    sget-object v3, Lcom/whoop/ui/ScoreContext;->STRAIN:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    iget-object v1, v0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    sget-object v3, Lcom/whoop/ui/ScoreContext;->RECOVERY:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    iget-object v1, v0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    sget-object v3, Lcom/whoop/ui/ScoreContext;->SLEEP:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    iget-object v9, v0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, v0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    iget v3, v0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    move/from16 v17, v1

    new-instance v1, Lcom/whoop/domain/model/teams/CommunityDto;

    const/4 v15, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/4 v3, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v18}, Lcom/whoop/domain/model/teams/CommunityDto;-><init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/domain/model/teams/Team;->id:I

    iget-object v2, v0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    iget v6, v0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    iget-object v7, v0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v8, v0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    iget v9, v0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    iget-object v10, v0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget v11, v0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    iget v12, v0, Lcom/whoop/domain/model/teams/Team;->rank:I

    iget-object v13, v0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    iget-boolean v14, v0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    iget v15, v0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    const-string v0, ", name="

    move/from16 v16, v15

    const-string v15, ", description="

    move/from16 v17, v14

    const-string v14, "Team(id="

    invoke-static {v1, v14, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v2, ", bannerUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", athletePrivacyId="

    const-string v2, ", privacyProfile="

    invoke-static {v6, v5, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabledTabs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adminId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", teamType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memberCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rank="

    const-string v2, ", chatChannel="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", chatEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move/from16 v2, v16

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->bannerUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->athletePrivacyId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->enabledTabs:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->adminId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamType;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->memberCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/whoop/domain/model/teams/Team;->rank:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/Team;->chatChannel:Lcom/whoop/domain/model/teams/ChatChannel;

    if-nez v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/ChatChannel;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-boolean p2, p0, Lcom/whoop/domain/model/teams/Team;->chatEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/domain/model/teams/Team;->unreadCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
