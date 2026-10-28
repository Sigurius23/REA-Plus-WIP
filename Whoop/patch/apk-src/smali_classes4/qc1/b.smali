.class public abstract Lqc1/b;
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
        "recommendationTileHeaderNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "recommendationTileHeaderMapper",
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

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc1/b;->a:Ll83/h;

    new-instance v0, Lqc1/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lqc1/b;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a()Ljb1/a;
    .locals 1

    invoke-static {}, Lqc1/b;->h()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;)Li31/g;
    .locals 0

    invoke-static {p0}, Lqc1/b;->g(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;)Li31/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqc1/b;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Lqc1/b;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lqc1/b;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc1/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqc1/b$a;

    invoke-direct {v2, v0}, Lqc1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;)Li31/g;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getTitleTypography()Lb91/c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lb91/c;->SH4:Lb91/c;

    :cond_0
    move-object v4, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getLeading()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lqc1/b;->e()Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_1
    move-object v5, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    invoke-static {}, Lqc1/b;->e()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getDescription()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getTrailing()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lqc1/b;->e()Ljb1/a;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object v8, v0

    goto :goto_2

    :cond_3
    move-object v8, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getEmoji()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lqc1/b;->e()Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    :cond_4
    move-object v9, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getIconBackgroundEnabled()Z

    move-result v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    new-instance v1, Li31/g;

    const/4 v10, 0x0

    const/16 v13, 0x100

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v14}, Li31/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
