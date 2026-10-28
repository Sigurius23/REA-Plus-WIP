.class public final Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0001@Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0013J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0098\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010 J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u0013J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00089\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008:\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u0008;\u0010\u001eR\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00101\u001a\u0004\u0008<\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008=\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00107\u001a\u0004\u0008>\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00107\u001a\u0004\u0008?\u0010 \u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
        "Landroid/os/Parcelable;",
        "",
        "currentLevelId",
        "memberExperience",
        "currentLevelMinExperience",
        "currentLevelMaxExperience",
        "",
        "currentBadgeUrl",
        "currentMiniBadgeUrl",
        "currentLevelType",
        "nextLevelId",
        "nextLevelExperience",
        "nextLevelBadgeUrl",
        "nextMiniBadgeUrl",
        "nextLevelType",
        "<init>",
        "(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
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
        "component3",
        "component4",
        "()Ljava/lang/Integer;",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCurrentLevelId",
        "getMemberExperience",
        "getCurrentLevelMinExperience",
        "Ljava/lang/Integer;",
        "getCurrentLevelMaxExperience",
        "Ljava/lang/String;",
        "getCurrentBadgeUrl",
        "getCurrentMiniBadgeUrl",
        "getCurrentLevelType",
        "getNextLevelId",
        "getNextLevelExperience",
        "getNextLevelBadgeUrl",
        "getNextMiniBadgeUrl",
        "getNextLevelType",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;


# instance fields
.field private final currentBadgeUrl:Ljava/lang/String;

.field private final currentLevelId:I

.field private final currentLevelMaxExperience:Ljava/lang/Integer;

.field private final currentLevelMinExperience:I

.field private final currentLevelType:Ljava/lang/String;

.field private final currentMiniBadgeUrl:Ljava/lang/String;

.field private final memberExperience:I

.field private final nextLevelBadgeUrl:Ljava/lang/String;

.field private final nextLevelExperience:I

.field private final nextLevelId:Ljava/lang/Integer;

.field private final nextLevelType:Ljava/lang/String;

.field private final nextMiniBadgeUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->Companion:Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Companion;

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    iput p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    iput p3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    iput-object p4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    iput p9, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    iput-object p10, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->copy(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    return v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    return v0
.end method

.method public final copy(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 13

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;-><init>(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    iget v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    iget v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    iget v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    iget v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCurrentBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentLevelId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    return v0
.end method

.method public final getCurrentLevelMaxExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCurrentLevelMinExperience()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    return v0
.end method

.method public final getCurrentLevelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentMiniBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMemberExperience()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    return v0
.end method

.method public final getNextLevelBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextLevelExperience()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    return v0
.end method

.method public final getNextLevelId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNextLevelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextMiniBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    iget v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    iget-object v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    iget v8, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    iget-object v9, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    const-string v12, ", memberExperience="

    const-string v13, ", currentLevelMinExperience="

    const-string v14, "MemberLevelProfileViewData(currentLevelId="

    invoke-static {v0, v1, v14, v12, v13}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentLevelMaxExperience="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentBadgeUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", currentMiniBadgeUrl="

    const-string v2, ", currentLevelType="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", nextLevelId="

    const-string v2, ", nextLevelExperience="

    invoke-static {v7, v6, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", nextLevelBadgeUrl="

    const-string v2, ", nextMiniBadgeUrl="

    invoke-static {v8, v1, v9, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", nextLevelType="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->memberExperience:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMinExperience:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelMaxExperience:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentBadgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentMiniBadgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->currentLevelType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelId:Ljava/lang/Integer;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelExperience:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelBadgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextMiniBadgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->nextLevelType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
