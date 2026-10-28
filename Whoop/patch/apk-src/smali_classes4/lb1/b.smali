.class public abstract Llb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\"\u0017\u0010\u0014\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "Lkd1/o;",
        "i",
        "(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Lkd1/o;",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "Li51/s;",
        "h",
        "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/s;",
        "",
        "style",
        "Ly81/f;",
        "g",
        "(Ljava/lang/String;)Ly81/f;",
        "backgroundStyle",
        "f",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "achievementProgressCardMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Ltz0/c;
    .locals 0

    invoke-static {p0}, Llb1/b;->d(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Ltz0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b$b;

    invoke-direct {v2, v0}, Llb1/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Ltz0/c;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getNumerator()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getDenominator()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getAccentColor()Lcom/whoop/design/models/colortheme/ColorValueModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/f0;->b(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v5, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/b;->g(Ljava/lang/String;)Ly81/f;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/b;->f(Ljava/lang/String;)Ly81/f;

    move-result-object v6

    invoke-static {p0}, Llb1/b;->i(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Lkd1/o;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Llb1/b;->h(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/s;

    move-result-object v0

    :goto_3
    move-object v8, v0

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getProgressPercent()Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getShowArrowIcon()Z

    move-result v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Ltz0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/f;Lkd1/o;Li51/s;Ljava/lang/Double;ZLcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Ljava/lang/String;)Ly81/f;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "BRONZE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Ly81/f;->BRONZE:Ly81/f;

    return-object p0

    :sswitch_1
    const-string v0, "EMPTY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ly81/f;->TRANSPARENT:Ly81/f;

    return-object p0

    :sswitch_2
    const-string v0, "BLACK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Ly81/f;->BRAND_BLACK:Ly81/f;

    return-object p0

    :sswitch_3
    const-string v0, "GOLD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Ly81/f;->GOLD:Ly81/f;

    return-object p0

    :sswitch_4
    const-string v0, "PURPLE_AQUA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p0

    :sswitch_5
    const-string v0, "PLATINUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    sget-object p0, Ly81/f;->PLATINUM:Ly81/f;

    return-object p0

    :sswitch_6
    const-string v0, "SILVER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    :goto_0
    sget-object p0, Ly81/f;->BRAND_BLACK:Ly81/f;

    return-object p0

    :cond_6
    sget-object p0, Ly81/f;->SILVER:Ly81/f;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e3538f3 -> :sswitch_6
        -0x619b4dd4 -> :sswitch_5
        -0x386a86a1 -> :sswitch_4
        0x217860 -> :sswitch_3
        0x3c597df -> :sswitch_2
        0x3f08d2d -> :sswitch_1
        0x7548799a -> :sswitch_0
    .end sparse-switch
.end method

.method public static final g(Ljava/lang/String;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "BRONZE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p0, Ly81/f;->BRONZE:Ly81/f;

    return-object p0

    :sswitch_1
    const-string v0, "HEALTHSPAN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p0, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    return-object p0

    :sswitch_2
    const-string v0, "LOW_RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p0, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    return-object p0

    :sswitch_3
    const-string v0, "STREAK_WHITE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object p0

    :sswitch_4
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0

    :sswitch_5
    const-string v0, "GOLD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p0, Ly81/f;->GOLD:Ly81/f;

    return-object p0

    :sswitch_6
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p0, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    return-object p0

    :sswitch_7
    const-string v0, "STREAK_PINK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p0, Ly81/f;->ACCENT_ONBOARDING_ACTION:Ly81/f;

    return-object p0

    :sswitch_8
    const-string v0, "STREAK_GOLD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p0, Ly81/f;->BRAND_WHOOP_PRO:Ly81/f;

    return-object p0

    :sswitch_9
    const-string v0, "STREAK_BLUE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :sswitch_a
    const-string v0, "ACTIVITY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_11

    sget-object p0, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    return-object p0

    :sswitch_b
    const-string v0, "PURPLE_AQUA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    sget-object p0, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p0

    :sswitch_c
    const-string v0, "STREAKS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    sget-object p0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p0

    :sswitch_d
    const-string v0, "STREAK_YELLOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :sswitch_e
    const-string v0, "STREAK_PURPLE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    sget-object p0, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p0

    :sswitch_f
    const-string v0, "STREAK_ORANGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_0

    :cond_e
    sget-object p0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p0

    :sswitch_10
    const-string v0, "PLATINUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_0

    :cond_f
    sget-object p0, Ly81/f;->PLATINUM:Ly81/f;

    return-object p0

    :sswitch_11
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto :goto_0

    :cond_10
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :sswitch_12
    const-string v0, "SILVER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    :cond_11
    :goto_0
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :cond_12
    sget-object p0, Ly81/f;->SILVER:Ly81/f;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x6e3538f3 -> :sswitch_12
        -0x6d97ca8b -> :sswitch_11
        -0x619b4dd4 -> :sswitch_10
        -0x5af475f1 -> :sswitch_f
        -0x590d9463 -> :sswitch_e
        -0x4a9637ab -> :sswitch_d
        -0x455fd36b -> :sswitch_c
        -0x386a86a1 -> :sswitch_b
        -0x340e1cf1 -> :sswitch_a
        -0x2059e385 -> :sswitch_9
        -0x2057937f -> :sswitch_8
        -0x20539269 -> :sswitch_7
        -0xfb906b -> :sswitch_6
        0x217860 -> :sswitch_5
        0x4b536b7 -> :sswitch_4
        0x16436408 -> :sswitch_3
        0x44af5440 -> :sswitch_2
        0x531457a6 -> :sswitch_1
        0x7548799a -> :sswitch_0
    .end sparse-switch
.end method

.method private static final h(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/s;
    .locals 9

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getContentType()Lcom/whoop/design/models/ContentType;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/ContentType;->DYNAMIC_LOTTIE:Lcom/whoop/design/models/ContentType;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getDynamicLottieProperties()Lcom/whoop/design/models/celebration/DynamicLottieModel;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getContentUrl()Ljava/lang/String;

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

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getShowLoadingShimmer()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_4
    move v8, p0

    goto :goto_5

    :cond_7
    const/4 p0, 0x1

    goto :goto_4

    :goto_5
    new-instance v2, Li51/s;

    invoke-direct/range {v2 .. v8}, Li51/s;-><init>(Lv41/r0;Ljava/lang/String;Ljava/util/List;Li51/a;Ljava/util/List;Z)V

    return-object v2
.end method

.method private static final i(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Lkd1/o;
    .locals 9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v2, Lkd1/o$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    return-object v1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getContentType()Lcom/whoop/design/models/ContentType;

    move-result-object v2

    sget-object v3, Llb1/b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_6

    const/4 v3, 0x2

    if-eq v2, v3, :cond_5

    const/4 v3, 0x3

    if-eq v2, v3, :cond_5

    const/4 v0, 0x4

    if-eq v2, v0, :cond_2

    const/4 v0, 0x5

    if-ne v2, v0, :cond_3

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    return-object v0

    :cond_5
    new-instance v1, Lkd1/o$c;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->getContentUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_6
    move-object v0, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    new-instance v2, Lkd1/o$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_7
    return-object v0
.end method
