.class public abstract Lnq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;",
        "Ly11/r;",
        "barViewState",
        "Lf51/a;",
        "j",
        "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ly11/r;)Lf51/a;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "i",
        "()Ljb1/a;",
        "behaviorDetailsDesignItemReducer",
        "behavior-impact_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lno1/g;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lno1/g;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lnq1/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/BehaviorDetailsTileModel;)Lf51/e;
    .locals 0

    invoke-static {p0}, Lnq1/a;->h(Lcom/whoop/design/models/items/BehaviorDetailsTileModel;)Lf51/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnq1/a;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnq1/a;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/ArchMiniBehaviorDetailsModel;)Lpq1/g;
    .locals 0

    invoke-static {p0}, Lnq1/a;->g(Lcom/whoop/design/models/items/ArchMiniBehaviorDetailsModel;)Lpq1/g;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lno1/g;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lno1/g;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lno1/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lno1/g;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/ArchMiniBehaviorDetailsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lnq1/a$a;

    invoke-direct {v3, v0}, Lnq1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lno1/g;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lno1/g;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/BehaviorDetailsTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lnq1/a$b;

    invoke-direct {v2, v0}, Lnq1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/ArchMiniBehaviorDetailsModel;)Lpq1/g;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpq1/g;

    new-instance v1, Liq1/a;

    new-instance v2, Liq1/a$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Liq1/a$a;-><init>(Le31/c;Liq1/c;Liq1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ArchMiniBehaviorDetailsModel;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lpq1/g;-><init>(Liq1/a;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/models/items/BehaviorDetailsTileModel;)Lf51/e;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileModel;->getImpactCard()Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getImpactBarSegment()Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v3, v2, Ly11/r;

    if-eqz v3, :cond_0

    check-cast v2, Ly11/r;

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ly11/r;->i()Ly11/t;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Ly11/t;->b(Ly11/t;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Ly11/t;

    move-result-object v1

    :cond_1
    move-object v10, v1

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v12}, Ly11/r;->b(Ly11/r;FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILjava/lang/Object;)Ly11/r;

    move-result-object v1

    :cond_2
    new-instance v2, Lf51/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileModel;->getImpactCard()Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    move-result-object v3

    invoke-static {v3, v1}, Lnq1/a;->j(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ly11/r;)Lf51/a;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileModel;->getImpactAdditionalDetails()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v2, v1, p0}, Lf51/e;-><init>(Lf51/a;Ljava/util/List;)V

    return-object v2
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Lnq1/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final j(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ly11/r;)Lf51/a;
    .locals 9

    new-instance v0, Lf51/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Llb1/h2;->a:Llb1/h2;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v3

    invoke-virtual {v2, v3}, Llb1/h2;->d(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getTileTag()Lcom/whoop/design/models/items/TileTagModel;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, Lpb1/a;->a(Lcom/whoop/design/models/items/TileTagModel;)Li21/u;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getImpactPercentageValue()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getImpactPercentageSymbol()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v4

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getSubBarLabel()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object v7, v4

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->getSubBarPercent()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :cond_4
    move-object v8, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, p1

    invoke-direct/range {v0 .. v8}, Lf51/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
