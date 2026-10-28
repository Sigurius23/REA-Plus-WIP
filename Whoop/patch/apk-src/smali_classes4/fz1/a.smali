.class public final Lfz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfz1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0007J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lfz1/a;",
        "",
        "<init>",
        "()V",
        "",
        "Ly81/f;",
        "f",
        "(Ljava/lang/String;)Ly81/f;",
        "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "Lv41/r0;",
        "e",
        "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lv41/r0;",
        "Lkd1/o;",
        "d",
        "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lkd1/o;",
        "Li51/s;",
        "c",
        "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Li51/s;",
        "style",
        "a",
        "Lcz1/c;",
        "domainState",
        "Lt21/d;",
        "b",
        "(Lcz1/c;)Lt21/d;",
        "milestone-pill-arch-mini_release"
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
.field public static final a:Lfz1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfz1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfz1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfz1/a;->a:Lfz1/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;)Ly81/f;
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "BRONZE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object p1, Ly81/f;->BRONZE:Ly81/f;

    return-object p1

    :sswitch_1
    const-string v0, "HEALTHSPAN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    :cond_2
    sget-object p1, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    return-object p1

    :sswitch_2
    const-string v0, "SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p1

    :sswitch_3
    const-string v0, "GOLD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object p1, Ly81/f;->GOLD:Ly81/f;

    return-object p1

    :sswitch_4
    const-string v0, "RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    sget-object p1, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    return-object p1

    :sswitch_5
    const-string v0, "ACTIVITY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    return-object p1

    :sswitch_6
    const-string v0, "PURPLE_AQUA"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    sget-object p1, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p1

    :sswitch_7
    const-string v0, "STREAKS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    sget-object p1, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p1

    :sswitch_8
    const-string v0, "PLATINUM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    sget-object p1, Ly81/f;->PLATINUM:Ly81/f;

    return-object p1

    :sswitch_9
    const-string v0, "STRAIN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    sget-object p1, Ly81/f;->STRAIN:Ly81/f;

    return-object p1

    :sswitch_a
    const-string v0, "SILVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    sget-object p1, Ly81/f;->SILVER:Ly81/f;

    return-object p1

    :cond_b
    :goto_1
    sget-object p1, Ly81/f;->STRAIN:Ly81/f;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6e3538f3 -> :sswitch_a
        -0x6d97ca8b -> :sswitch_9
        -0x619b4dd4 -> :sswitch_8
        -0x455fd36b -> :sswitch_7
        -0x386a86a1 -> :sswitch_6
        -0x340e1cf1 -> :sswitch_5
        -0xfb906b -> :sswitch_4
        0x217860 -> :sswitch_3
        0x4b536b7 -> :sswitch_2
        0x531457a6 -> :sswitch_1
        0x7548799a -> :sswitch_0
    .end sparse-switch
.end method

.method private final c(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Li51/s;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DYNAMIC_LOTTIE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getDynamicLottieProperties()Lcom/whoop/design/models/celebration/DynamicLottieModel;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->getOverlayUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->getSlots()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/celebration/SlotConfigModel;

    invoke-static {v2}, Llb1/h1;->b(Lcom/whoop/design/models/celebration/SlotConfigModel;)Li51/v;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->getAnimationMode()Lcom/whoop/design/models/celebration/AnimationModeModel;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Llb1/h1;->a(Lcom/whoop/design/models/celebration/AnimationModeModel;)Li51/a;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v6, v1

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->getAnimated()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object v1, Li51/a;->LOOP:Li51/a;

    goto :goto_1

    :cond_6
    sget-object v1, Li51/a;->OFF:Li51/a;

    goto :goto_1

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->getHighlightGradient()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getShowLoadingShimmer()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_4
    move v8, p1

    goto :goto_5

    :cond_7
    const/4 p1, 0x1

    goto :goto_4

    :goto_5
    new-instance v2, Li51/s;

    invoke-direct/range {v2 .. v8}, Li51/s;-><init>(Lv41/r0;Ljava/lang/String;Ljava/util/List;Li51/a;Ljava/util/List;Z)V

    return-object v2
.end method

.method private final d(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lkd1/o;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IMAGE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final e(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lv41/r0;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LOTTIE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DYNAMIC_LOTTIE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getDynamicLottieProperties()Lcom/whoop/design/models/celebration/DynamicLottieModel;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getContentUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object p1

    return-object p1
.end method

.method private final f(Ljava/lang/String;)Ly81/f;
    .locals 1

    const-string v0, "PRIMARY"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1

    :cond_0
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1
.end method


# virtual methods
.method public final b(Lcz1/c;)Lt21/d;
    .locals 12

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcz1/c;->c()Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    move-result-object v0

    new-instance v1, Lt21/d;

    invoke-virtual {p1}, Lcz1/c;->f()Z

    move-result v2

    invoke-virtual {p1}, Lcz1/c;->e()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getCount()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getTextStyle()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    invoke-direct {p0, v6}, Lfz1/a;->f(Ljava/lang/String;)Ly81/f;

    move-result-object v6

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lfz1/a;->e(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lv41/r0;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v4

    :goto_2
    if-eqz v0, :cond_3

    invoke-direct {p0, v0}, Lfz1/a;->d(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lkd1/o;

    move-result-object v8

    goto :goto_3

    :cond_3
    move-object v8, v4

    :goto_3
    if-eqz v0, :cond_4

    invoke-direct {p0, v0}, Lfz1/a;->c(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Li51/s;

    move-result-object v9

    goto :goto_4

    :cond_4
    move-object v9, v4

    :goto_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getAccentColor()Lcom/whoop/design/models/colortheme/ColorValueModel;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v10}, Llb1/f0;->b(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;

    move-result-object v10

    if-nez v10, :cond_7

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getStyle()Ljava/lang/String;

    move-result-object v10

    goto :goto_5

    :cond_6
    move-object v10, v4

    :goto_5
    invoke-direct {p0, v10}, Lfz1/a;->a(Ljava/lang/String;)Ly81/f;

    move-result-object v10

    :cond_7
    invoke-virtual {p1}, Lcz1/c;->d()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v4

    :cond_8
    move-object v11, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move v10, p1

    invoke-direct/range {v1 .. v11}, Lt21/d;-><init>(ZZLjava/lang/String;Ly81/f;Lv41/r0;Lkd1/o;Li51/s;Ly81/e;ZLcom/whoop/navigation/e;)V

    return-object v1
.end method
