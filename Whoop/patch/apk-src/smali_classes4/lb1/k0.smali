.class public abstract Llb1/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\r\"\u001a\u0010\u0016\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\r\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/design/models/items/FollowerRequestButtonModel;",
        "Lv11/b;",
        "p",
        "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/b;",
        "Lv11/k;",
        "o",
        "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/k;",
        "",
        "Ly81/f;",
        "n",
        "(Ljava/lang/String;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "communityFollowerMapper",
        "b",
        "communityFollowerLookupMapper",
        "c",
        "communityTeamTileMapper",
        "d",
        "m",
        "()Llb1/y0;",
        "communityMapper",
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

.field private static final b:Llb1/y0;

.field private static final c:Llb1/y0;

.field private static final d:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llb1/i0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k0;->a:Llb1/y0;

    new-instance v1, Llb1/i0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Llb1/i0;-><init>(I)V

    invoke-static {v1}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v1

    sput-object v1, Llb1/k0;->b:Llb1/y0;

    new-instance v2, Llb1/i0;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Llb1/i0;-><init>(I)V

    invoke-static {v2}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v2

    sput-object v2, Llb1/k0;->c:Llb1/y0;

    invoke-virtual {v0, v1}, Llb1/y0;->c(Llb1/y0;)Llb1/y0;

    move-result-object v0

    invoke-virtual {v0, v2}, Llb1/y0;->c(Llb1/y0;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k0;->d:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k0;->i(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/CommunityTeamTileModel;)Lx01/c;
    .locals 0

    invoke-static {p0}, Llb1/k0;->l(Lcom/whoop/design/models/items/CommunityTeamTileModel;)Lx01/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k0;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/CommunityFollowerModel;)Lu01/e;
    .locals 0

    invoke-static {p0}, Llb1/k0;->j(Lcom/whoop/design/models/items/CommunityFollowerModel;)Lu01/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k0;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/design/models/items/FollowerRequestModel;)Lv11/j;
    .locals 0

    invoke-static {p0}, Llb1/k0;->h(Lcom/whoop/design/models/items/FollowerRequestModel;)Lv11/j;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/FollowerRequestModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k0$a;

    invoke-direct {v2, v0}, Llb1/k0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/FollowerRequestModel;)Lv11/j;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v4, v0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getSubtext()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v5, v0

    goto :goto_6

    :cond_4
    move-object v5, v1

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getAvatarUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_5
    move-object v6, v1

    :goto_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Llb1/k0;->p(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/b;

    move-result-object v0

    move-object v7, v0

    goto :goto_8

    :cond_6
    move-object v7, v1

    :goto_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getEndButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Llb1/k0;->p(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/b;

    move-result-object v1

    :cond_7
    move-object v8, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v9

    new-instance v1, Lv11/j;

    invoke-direct/range {v1 .. v9}, Lv11/j;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lv11/b;Lv11/b;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final i(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/CommunityFollowerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k0$b;

    invoke-direct {v2, v0}, Llb1/k0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/CommunityFollowerModel;)Lu01/e;
    .locals 30

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getNoDataLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getAvatarUrl()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v5, Lkd1/o$c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_3
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getStreak()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getStreakImageUrl()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_6

    new-instance v7, Lkd1/o$c;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_6
    const/4 v7, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getRecoveryScore()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getRecoveryLabel()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    :cond_a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getDayStrain()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_b

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    :cond_c
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getStrainLabel()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_d

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-nez v11, :cond_e

    :cond_d
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    :cond_e
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getSleepScore()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_f

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    :cond_10
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getSleepLabel()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_11

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_12

    :cond_11
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :cond_12
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getRecoveryColor()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_13

    invoke-static {v14}, Llb1/k0;->n(Ljava/lang/String;)Ly81/f;

    move-result-object v14

    if-nez v14, :cond_14

    :cond_13
    sget-object v14, Ly81/f;->WHITE_70:Ly81/f;

    :cond_14
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getStrainColor()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_15

    invoke-static {v15}, Llb1/k0;->n(Ljava/lang/String;)Ly81/f;

    move-result-object v15

    if-nez v15, :cond_16

    :cond_15
    sget-object v15, Ly81/f;->WHITE_70:Ly81/f;

    :cond_16
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getSleepColor()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_17

    invoke-static/range {v16 .. v16}, Llb1/k0;->n(Ljava/lang/String;)Ly81/f;

    move-result-object v16

    if-nez v16, :cond_18

    :cond_17
    sget-object v16, Ly81/f;->WHITE_70:Ly81/f;

    :cond_18
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v18, v0

    if-eqz v4, :cond_1c

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "ROOT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lu01/a;->DEFAULT:Lu01/a;

    invoke-static {}, Lu01/a;->values()[Lu01/a;

    move-result-object v4

    move-object/from16 v19, v1

    array-length v1, v4

    const/16 v20, 0x0

    move-object/from16 v21, v2

    move/from16 v2, v20

    :goto_6
    if-ge v2, v1, :cond_1a

    aget-object v20, v4, v2

    move/from16 v22, v1

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_7

    :cond_19
    add-int/lit8 v2, v2, 0x1

    move/from16 v1, v22

    goto :goto_6

    :cond_1a
    const/16 v20, 0x0

    :goto_7
    if-nez v20, :cond_1b

    move-object/from16 v1, v19

    goto :goto_8

    :cond_1b
    move-object/from16 v1, v20

    :goto_8
    if-nez v1, :cond_1d

    goto :goto_9

    :cond_1c
    move-object/from16 v21, v2

    :goto_9
    sget-object v1, Lu01/a;->DEFAULT:Lu01/a;

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getAvatarRingColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-static {v0}, Llb1/k0;->n(Ljava/lang/String;)Ly81/f;

    move-result-object v4

    goto :goto_a

    :cond_1e
    const/4 v4, 0x0

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getIconUrls()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1f

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1f
    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v17, v1

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Ljava/lang/String;

    new-instance v22, Lkd1/o$c;

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v22 .. v28}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v22

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_20
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v20

    move-object/from16 v19, v2

    move-object/from16 v2, v21

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CommunityFollowerModel;->getTitleInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v22

    new-instance v1, Lu01/e;

    move-object/from16 v29, v18

    move-object/from16 v18, v4

    move-object/from16 v4, v29

    invoke-direct/range {v1 .. v22}, Lu01/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;Lu01/a;Ly81/f;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/CommunityTeamTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k0$c;

    invoke-direct {v2, v0}, Llb1/k0$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/CommunityTeamTileModel;)Lx01/c;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lgy0/a;->L3:I

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CommunityTeamTileModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CommunityTeamTileModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    move-object v1, v2

    :goto_3
    new-instance v4, Lkd1/o$c;

    invoke-direct {v4, v1, v0, v0, v0}, Lkd1/o$c;-><init>(Ljava/lang/Object;III)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CommunityTeamTileModel;->getEndText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    :goto_4
    move-object v5, v0

    goto :goto_6

    :cond_4
    :goto_5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_4

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CommunityTeamTileModel;->getEndSubText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_8

    :cond_5
    :goto_7
    move-object v6, v0

    goto :goto_9

    :cond_6
    :goto_8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_7

    :goto_9
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CommunityTeamTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    new-instance v2, Lx01/c;

    invoke-direct/range {v2 .. v7}, Lx01/c;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    return-object v2
.end method

.method public static final m()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/k0;->d:Llb1/y0;

    return-object v0
.end method

.method private static final n(Ljava/lang/String;)Ly81/f;
    .locals 6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x194f38a

    if-eq v0, v1, :cond_4

    const v1, 0x15c14f5f

    if-eq v0, v1, :cond_2

    const v1, 0x3107940c

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "RECOVERY_HIGH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    return-object p0

    :cond_2
    const-string v0, "RECOVERY_MEDIUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Ly81/f;->RECOVERY_MEDIUM_RECOVERY:Ly81/f;

    return-object p0

    :cond_4
    const-string v0, "RECOVERY_LOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :goto_0
    sget-object v0, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_7

    return-object v0

    :cond_7
    return-object v4

    :cond_8
    sget-object p0, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/k;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/whoop/design/models/modal/DialogModel;

    goto :goto_1

    :cond_1
    move-object p0, v0

    :goto_1
    if-nez p0, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogButton;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v0

    :goto_2
    if-nez v2, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v3, v2

    new-instance v2, Lv11/k;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getDescription()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_4

    :cond_7
    move-object v4, v0

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_5

    :cond_8
    move-object v7, v0

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getShowCloseButton()Z

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogButton;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogButton;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    :cond_9
    move-object v10, v0

    invoke-direct/range {v2 .. v10}, Lv11/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/util/TextResource;ZLcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v2
.end method

.method private static final p(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/b;
    .locals 18

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getSize()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lv11/a;->values()[Lv11/a;

    move-result-object v3

    array-length v4, v3

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v2

    :goto_1
    if-nez v6, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object/from16 v16, v6

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v6, Lv11/a;->COMPACT:Lv11/a;

    goto :goto_2

    :goto_4
    invoke-static/range {p0 .. p0}, Llb1/k0;->o(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/k;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, ""

    :cond_4
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lv11/c;->values()[Lv11/c;

    move-result-object v3

    array-length v4, v3

    move v5, v1

    :goto_5
    if-ge v5, v4, :cond_6

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_6
    move-object v6, v2

    :goto_6
    move-object v10, v6

    goto :goto_7

    :cond_7
    move-object v10, v2

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    if-eqz v0, :cond_8

    goto :goto_9

    :cond_8
    :goto_8
    move v12, v1

    goto :goto_a

    :cond_9
    :goto_9
    const/4 v1, 0x1

    goto :goto_8

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v13

    if-eqz v15, :cond_a

    :goto_b
    move-object v14, v2

    goto :goto_c

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v2

    goto :goto_b

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v17

    new-instance v7, Lv11/b;

    invoke-direct/range {v7 .. v17}, Lv11/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lv11/c;Lgz0/m0;ZLcom/whoop/whoopaction/domain/models/Action;Ljava/lang/Object;Lv11/k;Lv11/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v7
.end method
