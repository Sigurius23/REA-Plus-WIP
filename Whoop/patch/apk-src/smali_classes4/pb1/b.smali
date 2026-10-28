.class public abstract Lpb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;",
        "model",
        "Ljb1/a;",
        "reducer",
        "Lf51/a;",
        "f",
        "(Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;Ljb1/a;)Lf51/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "behaviorDetailsTileMapper",
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

    new-instance v0, Lnm1/g;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpb1/b;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpb1/b;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;)Lf51/e;
    .locals 0

    invoke-static {p0}, Lpb1/b;->d(Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;)Lf51/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm1/g;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpb1/b$a;

    invoke-direct {v2, v0}, Lpb1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;)Lf51/e;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lf51/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;->getImpactCard()Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;

    move-result-object v2

    invoke-static {v2, v0}, Lpb1/b;->f(Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;Ljb1/a;)Lf51/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;->getImpactAdditionalDetails()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v2, p0}, Lf51/e;-><init>(Lf51/a;Ljava/util/List;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lpb1/b;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;Ljb1/a;)Lf51/a;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getImpactBarSegment()Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    instance-of v0, p1, Ly11/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ly11/r;

    move-object v2, p1

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ly11/r;->i()Ly11/t;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Ly11/t;->b(Ly11/t;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Ly11/t;

    move-result-object p1

    move-object v9, p1

    goto :goto_1

    :cond_1
    move-object v9, v1

    :goto_1
    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v11}, Ly11/r;->b(Ly11/r;FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILjava/lang/Object;)Ly11/r;

    move-result-object p1

    move-object v8, p1

    goto :goto_2

    :cond_2
    move-object v8, v1

    :goto_2
    new-instance v2, Lf51/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object p1, Llb1/h2;->a:Llb1/h2;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Llb1/h2;->d(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getTileTag()Lcom/whoop/design/models/items/TileTagModel;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lpb1/a;->a(Lcom/whoop/design/models/items/TileTagModel;)Li21/u;

    move-result-object p1

    move-object v5, p1

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getImpactPercentageValue()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    move-object v6, p1

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getImpactPercentageSymbol()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    move-object v7, p1

    goto :goto_5

    :cond_5
    move-object v7, v1

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getSubBarLabel()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    move-object v9, p1

    goto :goto_6

    :cond_6
    move-object v9, v1

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;->getSubBarPercent()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_7
    move-object v10, v1

    invoke-direct/range {v2 .. v10}, Lf51/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v2
.end method
