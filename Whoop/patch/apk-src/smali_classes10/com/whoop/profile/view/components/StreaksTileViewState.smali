.class public final Lcom/whoop/profile/view/components/StreaksTileViewState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008)\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008*\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008,\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010-\u001a\u0004\u0008.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00080\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00101\u001a\u0004\u00082\u0010\u001b\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/profile/view/components/StreaksTileViewState;",
        "Lm91/u;",
        "",
        "id",
        "title",
        "subtitle",
        "Lv41/r0;",
        "lottieUrl",
        "Lkd1/o;",
        "image",
        "Lgz0/m0;",
        "endIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lv41/r0;",
        "component5",
        "()Lkd1/o;",
        "component6",
        "()Lgz0/m0;",
        "component7",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/StreaksTileViewState;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getSubtitle",
        "Lv41/r0;",
        "getLottieUrl",
        "Lkd1/o;",
        "getImage",
        "Lgz0/m0;",
        "getEndIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "profile_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final endIcon:Lgz0/m0;

.field private final id:Ljava/lang/String;

.field private final image:Lkd1/o;

.field private final lottieUrl:Lv41/r0;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    iput-object p5, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    iput-object p6, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    iput-object p7, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/components/StreaksTileViewState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/profile/view/components/StreaksTileViewState;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lv41/r0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    return-object v0
.end method

.method public final component5()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    return-object v0
.end method

.method public final component6()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEndIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    return-object v0
.end method

.method public bridge getEvent()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lm91/u;->getEvent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    return-object v0
.end method

.method public final getLottieUrl()Lv41/r0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

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

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->lottieUrl:Lv41/r0;

    iget-object v4, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->image:Lkd1/o;

    iget-object v5, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->endIcon:Lgz0/m0;

    iget-object v6, p0, Lcom/whoop/profile/view/components/StreaksTileViewState;->destination:Lcom/whoop/navigation/e;

    const-string v7, ", title="

    const-string v8, ", subtitle="

    const-string v9, "StreaksTileViewState(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lottieUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
