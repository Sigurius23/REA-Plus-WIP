.class public final Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/TeamPrivacyProfile$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bs\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010$J|\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010 J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u0016J\u001a\u00100\u001a\u00020\u00062\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001e\"\u0004\u00084\u00105R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u0010 \"\u0004\u00088\u00109R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008;\u0010\"\"\u0004\u0008<\u0010=R$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010>\u001a\u0004\u0008?\u0010$\"\u0004\u0008@\u0010AR$\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010>\u001a\u0004\u0008B\u0010$\"\u0004\u0008C\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010>\u001a\u0004\u0008D\u0010$\"\u0004\u0008E\u0010AR$\u0010\u000c\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008F\u0010$\"\u0004\u0008G\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010>\u001a\u0004\u0008H\u0010$\"\u0004\u0008I\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008J\u0010$\"\u0004\u0008K\u0010A\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "name",
        "",
        "basic",
        "Lcom/whoop/domain/model/teams/PrivacyType;",
        "stats",
        "comps",
        "overview",
        "intensity",
        "recovery",
        "sleep",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V",
        "Lcom/whoop/ui/ScoreContext;",
        "scoreContext",
        "forContext",
        "(Lcom/whoop/ui/ScoreContext;)Lcom/whoop/domain/model/teams/PrivacyType;",
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
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/lang/Boolean;",
        "component4",
        "()Lcom/whoop/domain/model/teams/PrivacyType;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getId",
        "setId",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/String;",
        "getName",
        "setName",
        "(Ljava/lang/String;)V",
        "Ljava/lang/Boolean;",
        "getBasic",
        "setBasic",
        "(Ljava/lang/Boolean;)V",
        "Lcom/whoop/domain/model/teams/PrivacyType;",
        "getStats",
        "setStats",
        "(Lcom/whoop/domain/model/teams/PrivacyType;)V",
        "getComps",
        "setComps",
        "getOverview",
        "setOverview",
        "getIntensity",
        "setIntensity",
        "getRecovery",
        "setRecovery",
        "getSleep",
        "setSleep",
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
            "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private basic:Ljava/lang/Boolean;

.field private comps:Lcom/whoop/domain/model/teams/PrivacyType;

.field private id:Ljava/lang/Integer;

.field private intensity:Lcom/whoop/domain/model/teams/PrivacyType;

.field private name:Ljava/lang/String;

.field private overview:Lcom/whoop/domain/model/teams/PrivacyType;

.field private recovery:Lcom/whoop/domain/model/teams/PrivacyType;

.field private sleep:Lcom/whoop/domain/model/teams/PrivacyType;

.field private stats:Lcom/whoop/domain/model/teams/PrivacyType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    .line 6
    iput-object p4, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    .line 7
    iput-object p5, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    .line 8
    iput-object p6, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 12
    sget-object p4, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 13
    sget-object p5, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    .line 14
    sget-object p6, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 15
    sget-object p7, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    .line 16
    sget-object p8, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    .line 17
    sget-object p9, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_8
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 18
    invoke-direct/range {p1 .. p10}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final component5()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final component6()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final component7()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final component8()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final component9()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 10

    new-instance v0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V

    return-object v0
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
    instance-of v1, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final forContext(Lcom/whoop/ui/ScoreContext;)Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p1, :cond_0

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p1, :cond_3

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_3
    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p1, :cond_5

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    :cond_5
    return-object p1
.end method

.method public final getBasic()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getComps()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIntensity()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOverview()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final getRecovery()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final getSleep()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public final getStats()Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public final setBasic(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    return-void
.end method

.method public final setComps(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public final setId(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    return-void
.end method

.method public final setIntensity(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    return-void
.end method

.method public final setOverview(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public final setRecovery(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public final setSleep(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public final setStats(Lcom/whoop/domain/model/teams/PrivacyType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v4, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v5, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v6, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v7, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    iget-object v8, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    const-string v9, ", name="

    const-string v10, ", basic="

    const-string v11, "TeamPrivacyProfile(id="

    invoke-static {v11, v9, v0, v1, v10}, Lr80/c;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", comps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", intensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recovery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->id:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->basic:Ljava/lang/Boolean;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_1
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->stats:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_2
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->comps:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->overview:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->intensity:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_5
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->recovery:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_6
    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->sleep:Lcom/whoop/domain/model/teams/PrivacyType;

    if-nez p2, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_7
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
