.class public final Lcom/whoop/service/network/model/Sport;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJb\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0011J\u001a\u0010)\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u00081\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u0008\u000b\u0010\u001cR\u0017\u0010\u000c\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010/\u001a\u0004\u0008\u000c\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010-\u001a\u0004\u00084\u0010\u001a\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/service/network/model/Sport;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "name",
        "",
        "hasGps",
        "iconUrl",
        "Lcom/whoop/ui/activities/realtime/SportCategory;",
        "category",
        "isCurrent",
        "isHasSurvey",
        "activityTypeInternalName",
        "<init>",
        "(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V",
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
        "()Z",
        "component4",
        "component5",
        "()Lcom/whoop/ui/activities/realtime/SportCategory;",
        "component6",
        "component7",
        "component8",
        "copy",
        "(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)Lcom/whoop/service/network/model/Sport;",
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
        "Z",
        "getHasGps",
        "getIconUrl",
        "Lcom/whoop/ui/activities/realtime/SportCategory;",
        "getCategory",
        "getActivityTypeInternalName",
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
            "Lcom/whoop/service/network/model/Sport;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final activityTypeInternalName:Ljava/lang/String;

.field private final category:Lcom/whoop/ui/activities/realtime/SportCategory;

.field private final hasGps:Z

.field private final iconUrl:Ljava/lang/String;

.field private final id:I

.field private final isCurrent:Z

.field private final isHasSurvey:Z

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/service/network/model/Sport$Creator;

    invoke-direct {v0}, Lcom/whoop/service/network/model/Sport$Creator;-><init>()V

    sput-object v0, Lcom/whoop/service/network/model/Sport;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/service/network/model/Sport;->id:I

    .line 3
    iput-object p2, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    .line 5
    iput-object p4, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    .line 7
    iput-boolean p6, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    .line 8
    iput-boolean p7, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    .line 9
    iput-object p8, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/network/model/Sport;-><init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/Sport;ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/service/network/model/Sport;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/whoop/service/network/model/Sport;->id:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    :cond_7
    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/service/network/model/Sport;->copy(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)Lcom/whoop/service/network/model/Sport;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/Sport;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/ui/activities/realtime/SportCategory;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)Lcom/whoop/service/network/model/Sport;
    .locals 10

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/Sport;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/network/model/Sport;-><init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/whoop/service/network/model/Sport;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/Sport;

    iget v1, p0, Lcom/whoop/service/network/model/Sport;->id:I

    iget v3, p1, Lcom/whoop/service/network/model/Sport;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    iget-boolean v3, p1, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    iget-object v3, p1, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    iget-boolean v3, p1, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    iget-boolean v3, p1, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActivityTypeInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCategory()Lcom/whoop/ui/activities/realtime/SportCategory;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    return-object v0
.end method

.method public final getHasGps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    return v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/Sport;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/service/network/model/Sport;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCurrent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    return v0
.end method

.method public final isHasSurvey()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/service/network/model/Sport;->id:I

    iget-object v1, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    iget-object v3, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    iget-boolean v5, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    iget-boolean v6, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    iget-object v7, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    const-string v8, ", name="

    const-string v9, ", hasGps="

    const-string v10, "Sport(id="

    invoke-static {v0, v10, v8, v1, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v8, ", category="

    invoke-static {v0, v2, v1, v3, v8}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCurrent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isHasSurvey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activityTypeInternalName="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/service/network/model/Sport;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/service/network/model/Sport;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/service/network/model/Sport;->hasGps:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/service/network/model/Sport;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/service/network/model/Sport;->category:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/service/network/model/Sport;->isCurrent:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/service/network/model/Sport;->isHasSurvey:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/service/network/model/Sport;->activityTypeInternalName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
