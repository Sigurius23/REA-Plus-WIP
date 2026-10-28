.class public final Lcom/whoop/domain/model/teams/FeatureTeam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0013\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u0016J\u0010\u0010(\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jv\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u0016J\u001a\u00100\u001a\u00020\u000e2\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00085\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00086\u0010\u001eR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00089\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u0008:\u0010\u001eR\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010&R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008=\u0010\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010>\u001a\u0004\u0008?\u0010)\"\u0004\u0008@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010H\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/FeatureTeam;",
        "Landroid/os/Parcelable;",
        "",
        "name",
        "description",
        "iconUrl",
        "bannerUrl",
        "",
        "athletePrivacyId",
        "memberCount",
        "inviteCode",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "teamType",
        "communityId",
        "",
        "showBadge",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V",
        "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "toDrawerDisplayInvite",
        "()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/domain/model/teams/TeamType;",
        "component9",
        "component10",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)Lcom/whoop/domain/model/teams/FeatureTeam;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getName",
        "getDescription",
        "getIconUrl",
        "getBannerUrl",
        "I",
        "getAthletePrivacyId",
        "getMemberCount",
        "getInviteCode",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "getTeamType",
        "getCommunityId",
        "Z",
        "getShowBadge",
        "setShowBadge",
        "(Z)V",
        "",
        "id",
        "J",
        "getId",
        "()J",
        "setId",
        "(J)V",
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
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final athletePrivacyId:I

.field private final bannerUrl:Ljava/lang/String;

.field private final communityId:I

.field private final description:Ljava/lang/String;

.field private final iconUrl:Ljava/lang/String;

.field private id:J

.field private final inviteCode:Ljava/lang/String;

.field private final memberCount:I

.field private final name:Ljava/lang/String;

.field private showBadge:Z

.field private final teamType:Lcom/whoop/domain/model/teams/TeamType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/FeatureTeam$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/FeatureTeam$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/FeatureTeam;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inviteCode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    .line 7
    iput p6, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    .line 8
    iput-object p7, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    .line 10
    iput p9, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    .line 11
    iput-boolean p10, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v11, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    goto :goto_1

    :cond_0
    move/from16 v11, p10

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {v1 .. v11}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/FeatureTeam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZILjava/lang/Object;)Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget p9, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    :cond_9
    move p11, p9

    move p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/domain/model/teams/FeatureTeam;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)Lcom/whoop/domain/model/teams/FeatureTeam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 12

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inviteCode"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamType"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/FeatureTeam;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V

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
    instance-of v1, p1, Lcom/whoop/domain/model/teams/FeatureTeam;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/FeatureTeam;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    iget v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAthletePrivacyId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    return v0
.end method

.method public final getBannerUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommunityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->id:J

    return-wide v0
.end method

.method public final getInviteCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowBadge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    return v0
.end method

.method public final getTeamType()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->id:J

    return-void
.end method

.method public final setShowBadge(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    return-void
.end method

.method public final toDrawerDisplayInvite()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;
    .locals 9

    iget v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    iget-object v4, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    new-instance v0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    const/4 v6, 0x0

    const-string v7, ""

    const-string v2, ""

    move v3, v1

    invoke-direct/range {v0 .. v8}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    iget v4, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    iget v5, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    iget-object v6, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    iget v8, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    iget-boolean v9, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    const-string v10, ", description="

    const-string v11, ", iconUrl="

    const-string v12, "FeatureTeam(name="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bannerUrl="

    const-string v10, ", athletePrivacyId="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", memberCount="

    const-string v2, ", inviteCode="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", teamType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", communityId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", showBadge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->bannerUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->athletePrivacyId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->memberCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->inviteCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamType;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->communityId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/domain/model/teams/FeatureTeam;->showBadge:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
