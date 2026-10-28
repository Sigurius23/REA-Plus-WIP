.class public abstract Lpc1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lm91/u;",
        "",
        "isSelected",
        "i",
        "(Lm91/u;Z)Lm91/u;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "e",
        "()Ljb1/a;",
        "recommendationTileNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "recommendationTileMapper",
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

    new-instance v0, Lma1/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lpc1/c;->a:Ll83/h;

    new-instance v0, Lnm1/g;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpc1/c;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;)Lh31/q;
    .locals 0

    invoke-static {p0}, Lpc1/c;->g(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;)Lh31/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Lpc1/c;->h()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpc1/c;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Lpc1/c;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lpc1/c;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm1/g;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpc1/c$a;

    invoke-direct {v2, v0}, Lpc1/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;)Lh31/q;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getRecommendationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getStatus()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v0

    invoke-static {v0}, Lpc1/d;->e(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/n;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getHeader()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lpc1/c;->e()Ljb1/a;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected()Z

    move-result v4

    invoke-static {v0, v4}, Lpc1/c;->i(Lm91/u;Z)Lm91/u;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-static {}, Lpc1/c;->e()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBody()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getCta()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lpc1/c;->e()Ljb1/a;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded()Z

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected()Z

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getStyle()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lpc1/d;->d(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/b;

    move-result-object v1

    :cond_2
    move-object v9, v1

    new-instance v1, Lh31/q;

    invoke-direct/range {v1 .. v9}, Lh31/q;-><init>(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZZLh31/b;)V

    return-object v1
.end method

.method private static final h()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final i(Lm91/u;Z)Lm91/u;
    .locals 16

    move-object/from16 v0, p0

    instance-of v1, v0, Li31/g;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Li31/g;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_1

    const/16 v14, 0x6ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v11, p1

    invoke-static/range {v2 .. v15}, Li31/g;->b(Li31/g;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method
