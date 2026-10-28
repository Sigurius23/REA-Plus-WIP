.class public abstract Lpc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "e",
        "()Ljb1/a;",
        "recommendationTileGroupNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "recommendationTileGroupMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lou1/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lou1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lpc1/b;->a:Ll83/h;

    new-instance v0, Lp6/h1;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lp6/h1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpc1/b;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;)Lg81/c;
    .locals 0

    invoke-static {p0}, Lpc1/b;->g(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;)Lg81/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Lpc1/b;->h()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpc1/b;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Lpc1/b;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lpc1/b;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp6/h1;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lp6/h1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpc1/b$a;

    invoke-direct {v2, v0}, Lpc1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;)Lg81/c;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;->getHeader()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lpc1/b;->e()Ljb1/a;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {}, Lpc1/b;->e()Ljb1/a;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;->getFooter()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {}, Lpc1/b;->e()Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    :cond_1
    new-instance p0, Lg81/c;

    invoke-direct {p0, v0, v1, v3, v2}, Lg81/c;-><init>(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)V

    return-object p0
.end method

.method private static final h()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method
