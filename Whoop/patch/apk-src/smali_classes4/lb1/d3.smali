.class public abstract Llb1/d3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MilestoneItem;",
        "Lu21/e;",
        "g",
        "(Lcom/whoop/design/models/items/MilestoneItem;)Lu21/e;",
        "",
        "style",
        "Ly81/f;",
        "d",
        "(Ljava/lang/String;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "milestoneProgressCardMapper",
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

    new-instance v0, Llb1/t2;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/d3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/MilestoneProgressCardModel;)Lu21/d;
    .locals 0

    invoke-static {p0}, Llb1/d3;->f(Lcom/whoop/design/models/items/MilestoneProgressCardModel;)Lu21/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/d3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Ljava/lang/String;)Ly81/f;
    .locals 1

    if-eqz p0, :cond_12

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
    const-string v0, "STREAK_WHITE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object p0

    :sswitch_3
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0

    :sswitch_4
    const-string v0, "GOLD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p0, Ly81/f;->GOLD:Ly81/f;

    return-object p0

    :sswitch_5
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p0, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    return-object p0

    :sswitch_6
    const-string v0, "STREAK_PINK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p0, Ly81/f;->ACCENT_ONBOARDING_ACTION:Ly81/f;

    return-object p0

    :sswitch_7
    const-string v0, "STREAK_GOLD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p0, Ly81/f;->BRAND_WHOOP_PRO:Ly81/f;

    return-object p0

    :sswitch_8
    const-string v0, "STREAK_BLUE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :sswitch_9
    const-string v0, "ACTIVITY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    sget-object p0, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    return-object p0

    :sswitch_a
    const-string v0, "PURPLE_AQUA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    sget-object p0, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p0

    :sswitch_b
    const-string v0, "STREAKS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    sget-object p0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p0

    :sswitch_c
    const-string v0, "STREAK_YELLOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :sswitch_d
    const-string v0, "STREAK_PURPLE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    sget-object p0, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p0

    :sswitch_e
    const-string v0, "STREAK_ORANGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    sget-object p0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p0

    :sswitch_f
    const-string v0, "PLATINUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_0

    :cond_e
    sget-object p0, Ly81/f;->PLATINUM:Ly81/f;

    return-object p0

    :sswitch_10
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_0

    :cond_f
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :sswitch_11
    const-string v0, "SILVER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    :cond_10
    :goto_0
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :cond_11
    sget-object p0, Ly81/f;->SILVER:Ly81/f;

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x6e3538f3 -> :sswitch_11
        -0x6d97ca8b -> :sswitch_10
        -0x619b4dd4 -> :sswitch_f
        -0x5af475f1 -> :sswitch_e
        -0x590d9463 -> :sswitch_d
        -0x4a9637ab -> :sswitch_c
        -0x455fd36b -> :sswitch_b
        -0x386a86a1 -> :sswitch_a
        -0x340e1cf1 -> :sswitch_9
        -0x2059e385 -> :sswitch_8
        -0x2057937f -> :sswitch_7
        -0x20539269 -> :sswitch_6
        -0xfb906b -> :sswitch_5
        0x217860 -> :sswitch_4
        0x4b536b7 -> :sswitch_3
        0x16436408 -> :sswitch_2
        0x531457a6 -> :sswitch_1
        0x7548799a -> :sswitch_0
    .end sparse-switch
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/d3$a;

    invoke-direct {v2, v0}, Llb1/d3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/MilestoneProgressCardModel;)Lu21/d;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lu21/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

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
    move-object v4, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/d3;->d(Ljava/lang/String;)Ly81/f;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getCurrentMilestone()Lcom/whoop/design/models/items/MilestoneItem;

    move-result-object v0

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Llb1/d3;->g(Lcom/whoop/design/models/items/MilestoneItem;)Lu21/e;

    move-result-object v0

    goto :goto_3

    :cond_2
    move-object v0, v5

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getNextMilestone()Lcom/whoop/design/models/items/MilestoneItem;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Llb1/d3;->g(Lcom/whoop/design/models/items/MilestoneItem;)Lu21/e;

    move-result-object v5

    :cond_3
    move-object v6, v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->getProgressPercent()D

    move-result-wide v7

    move-object v5, v0

    invoke-direct/range {v1 .. v8}, Lu21/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lu21/e;Lu21/e;D)V

    return-object v1
.end method

.method private static final g(Lcom/whoop/design/models/items/MilestoneItem;)Lu21/e;
    .locals 19

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneItem;->getMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/a0;->e(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    new-instance v2, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneItem;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    const-string v9, ""

    if-nez v3, :cond_1

    move-object v3, v9

    :cond_1
    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneItem;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v10, Li51/i;

    new-instance v11, Li51/h$c;

    new-instance v12, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneItem;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v13, v9

    goto :goto_1

    :cond_2
    move-object v13, v1

    :goto_1
    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v11, v12}, Li51/h$c;-><init>(Lkd1/o;)V

    sget-object v12, Li51/g;->SMALL:Li51/g;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0x38

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v18}, Li51/i;-><init>(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v10

    goto :goto_2

    :cond_3
    move-object v1, v0

    :cond_4
    :goto_2
    new-instance v0, Lu21/e;

    invoke-direct {v0, v2, v1}, Lu21/e;-><init>(Lkd1/o;Li51/i;)V

    return-object v0
.end method
