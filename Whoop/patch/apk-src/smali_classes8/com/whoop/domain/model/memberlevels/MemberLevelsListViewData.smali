.class public final Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u00014BE\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u000fJ\u001a\u0010&\u001a\u00020\n2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010(\u001a\u0004\u0008*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u00080\u0010\u001bR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00101\u001a\u0004\u0008\u000b\u0010\u001f\"\u0004\u00082\u00103\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "Landroid/os/Parcelable;",
        "",
        "minExperience",
        "maxExperience",
        "levelId",
        "",
        "badgeUrl",
        "miniBadgeUrl",
        "tier",
        "",
        "isLocked",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
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
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "component7",
        "()Z",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getMinExperience",
        "getMaxExperience",
        "I",
        "getLevelId",
        "Ljava/lang/String;",
        "getBadgeUrl",
        "getMiniBadgeUrl",
        "getTier",
        "Z",
        "setLocked",
        "(Z)V",
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
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;


# instance fields
.field private final badgeUrl:Ljava/lang/String;

.field private isLocked:Z

.field private final levelId:I

.field private final maxExperience:Ljava/lang/Integer;

.field private final minExperience:Ljava/lang/Integer;

.field private final miniBadgeUrl:Ljava/lang/String;

.field private final tier:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->Companion:Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Companion;

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "badgeUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tier"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    iput p3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    iput-object p4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->copy(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    return v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;
    .locals 9

    const-string v0, "badgeUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tier"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

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
    instance-of v1, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    iget v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLevelId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    return v0
.end method

.method public final getMaxExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMinExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMiniBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

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

    iget-object v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLocked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    return v0
.end method

.method public final setLocked(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    iget v2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    iget-object v3, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    const-string v7, ", maxExperience="

    const-string v8, ", levelId="

    const-string v9, "MemberLevelsListViewData(minExperience="

    invoke-static {v9, v0, v7, v1, v8}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", badgeUrl="

    const-string v7, ", miniBadgeUrl="

    invoke-static {v2, v1, v3, v7, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", tier="

    const-string v2, ", isLocked="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->minExperience:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->maxExperience:Ljava/lang/Integer;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->levelId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->badgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->miniBadgeUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->tier:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
