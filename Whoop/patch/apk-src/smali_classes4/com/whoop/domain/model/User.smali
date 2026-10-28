.class public final Lcom/whoop/domain/model/User;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/User$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0086\u0008\u0018\u0000 Y2\u00020\u0001:\u0001YB\u00a5\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0019\u001a\u0004\u0018\u00010+J\u0014\u0010D\u001a\u00020\u00132\u0008\u0010E\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010F\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010G\u001a\u00020\u0005H\u0096\u0080\u0004J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\u00ac\u0001\u0010W\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010XR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0018R\u0011\u0010,\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u0018R\u0011\u0010.\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u0018R\u0011\u00100\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u0018R\u0011\u00102\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0011\u00106\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\u00087\u00105R\u0011\u00108\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\u00089\u00105R\u0011\u0010:\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\u0008;\u00105R\u0011\u0010<\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\u0008=\u00105R\u0011\u0010>\u001a\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R\u0013\u0010@\u001a\u0004\u0018\u00010A8F\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010C\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/whoop/domain/model/User;",
        "",
        "id",
        "",
        "createdAt",
        "",
        "firstName",
        "lastName",
        "fullName",
        "emailAddress",
        "password",
        "username",
        "avatarUrl",
        "city",
        "adminDivision",
        "country",
        "profile",
        "Lcom/whoop/domain/model/UserProfile;",
        "concealed",
        "",
        "age",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V",
        "getId",
        "()I",
        "getCreatedAt",
        "()Ljava/lang/String;",
        "getFirstName",
        "getLastName",
        "getFullName",
        "getEmailAddress",
        "getPassword",
        "getUsername",
        "getAvatarUrl",
        "getCity",
        "getAdminDivision",
        "getCountry",
        "getProfile",
        "()Lcom/whoop/domain/model/UserProfile;",
        "getConcealed",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getAge",
        "Lorg/joda/time/DateTime;",
        "ageYrs",
        "getAgeYrs",
        "maxHeartRate",
        "getMaxHeartRate",
        "minHeartRate",
        "getMinHeartRate",
        "weightLbs",
        "",
        "getWeightLbs",
        "()F",
        "heightIns",
        "getHeightIns",
        "weightKg",
        "getWeightKg",
        "heightCm",
        "getHeightCm",
        "heightMeters",
        "getHeightMeters",
        "canUploadData",
        "()Z",
        "fitnessLevel",
        "Lcom/whoop/domain/model/FitnessLevel;",
        "getFitnessLevel",
        "()Lcom/whoop/domain/model/FitnessLevel;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)Lcom/whoop/domain/model/User;",
        "Companion",
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
.field public static final Companion:Lcom/whoop/domain/model/User$Companion;

.field private static final DEFAULT_MAX_HR:I = 0xb4


# instance fields
.field private final adminDivision:Ljava/lang/String;

.field private final age:I

.field private final avatarUrl:Ljava/lang/String;

.field private final city:Ljava/lang/String;

.field private final concealed:Ljava/lang/Boolean;

.field private final country:Ljava/lang/String;

.field private final createdAt:Ljava/lang/String;

.field private final emailAddress:Ljava/lang/String;

.field private final firstName:Ljava/lang/String;

.field private final fullName:Ljava/lang/String;

.field private final id:I

.field private final lastName:Ljava/lang/String;

.field private final password:Ljava/lang/String;

.field private final profile:Lcom/whoop/domain/model/UserProfile;

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/User$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/User$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/User;->Companion:Lcom/whoop/domain/model/User$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 18

    .line 1
    const/16 v16, 0x7fff

    const/16 v17, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v17}, Lcom/whoop/domain/model/User;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V
    .locals 2

    move-object v0, p12

    const-string v1, "createdAt"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "firstName"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lastName"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fullName"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "emailAddress"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "password"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "username"

    invoke-static {p8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "avatarUrl"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "country"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/User;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/User;->firstName:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/domain/model/User;->lastName:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/domain/model/User;->fullName:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/domain/model/User;->emailAddress:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/model/User;->password:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/User;->username:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/User;->avatarUrl:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/domain/model/User;->city:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/domain/model/User;->adminDivision:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/whoop/domain/model/User;->country:Ljava/lang/String;

    move-object p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/domain/model/User;->concealed:Ljava/lang/Boolean;

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/whoop/domain/model/User;->age:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 18
    const-string v4, ""

    if-eqz v3, :cond_1

    move-object v3, v4

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    move-object v5, v4

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v4

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v4

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v4

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    move-object v9, v4

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v4

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v4

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-object v12, v4

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    move-object v13, v4

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v4, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    const/4 v15, 0x0

    if-eqz v14, :cond_c

    move-object v14, v15

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    const/16 p16, 0x0

    :goto_e
    move-object/from16 p1, p0

    move/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p13, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-direct/range {p1 .. p16}, Lcom/whoop/domain/model/User;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/User;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;IILjava/lang/Object;)Lcom/whoop/domain/model/User;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/domain/model/User;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/domain/model/User;->firstName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/domain/model/User;->lastName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/domain/model/User;->fullName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/domain/model/User;->emailAddress:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/domain/model/User;->password:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/User;->username:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/domain/model/User;->avatarUrl:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/User;->city:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/domain/model/User;->adminDivision:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/domain/model/User;->country:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/domain/model/User;->concealed:Ljava/lang/Boolean;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/whoop/domain/model/User;->age:I

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/whoop/domain/model/User;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)Lcom/whoop/domain/model/User;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final canUploadData()Z
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getCanUploadData()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/User;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->adminDivision:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/domain/model/UserProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    return-object v0
.end method

.method public final component14()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->concealed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/User;->age:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->emailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->password:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)Lcom/whoop/domain/model/User;
    .locals 17

    const-string v0, "createdAt"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fullName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailAddress"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatarUrl"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/User;

    move/from16 v2, p1

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/domain/model/User;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/whoop/domain/model/User;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.whoop.domain.model.User"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/domain/model/User;

    iget v1, p0, Lcom/whoop/domain/model/User;->id:I

    iget p1, p1, Lcom/whoop/domain/model/User;->id:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final getAdminDivision()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->adminDivision:Ljava/lang/String;

    return-object v0
.end method

.method public final getAge()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/User;->age:I

    return v0
.end method

.method public final getAgeYrs()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getBirthday()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-static {}, Lorg/joda/time/LocalDate;->now()Lorg/joda/time/LocalDate;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/joda/time/Years;->yearsBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Years;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Years;->getYears()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final getConcealed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->concealed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lorg/joda/time/DateTime;

    iget-object v1, p0, Lcom/whoop/domain/model/User;->createdAt:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/joda/time/DateTime;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getEmailAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->emailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFitnessLevel()Lcom/whoop/domain/model/FitnessLevel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getFitnessLevel()Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFullName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeightCm()F
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getHeight()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x64

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method public final getHeightIns()F
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getHeight()F

    move-result v0

    const/16 v1, 0x64

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lor2/l;->a(F)F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getHeightMeters()F
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getHeight()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/User;->id:I

    return v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxHeartRate()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    const/16 v1, 0xb4

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getMaxHeartRate()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/domain/model/User;->getAgeYrs()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/domain/model/User;->getAgeYrs()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v0, v2

    double-to-int v0, v0

    rsub-int v0, v0, 0xd0

    return v0

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getMaxHeartRate()I

    move-result v0

    return v0

    :cond_2
    return v1
.end method

.method public final getMinHeartRate()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getMinHeartRate()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->password:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfile()Lcom/whoop/domain/model/UserProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightKg()F
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getWeight()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getWeightLbs()F
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/User;->profile:Lcom/whoop/domain/model/UserProfile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getWeight()F

    move-result v0

    invoke-static {v0}, Lor2/l;->b(F)F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/User;->id:I

    add-int/lit16 v0, v0, 0x20f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/User;->id:I

    const-string v1, "User(id="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
