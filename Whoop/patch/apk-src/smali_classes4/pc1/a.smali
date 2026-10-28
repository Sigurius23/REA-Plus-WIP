.class public abstract Lpc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "recommendationTileButtonMapper",
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

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpc1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;)Lh31/g;
    .locals 0

    invoke-static {p0}, Lpc1/a;->e(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;)Lh31/g;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lpc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm1/g;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpc1/a$a;

    invoke-direct {v2, v0}, Lpc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;)Lh31/g;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lh31/f;->LOADING:Lh31/f;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->getStatus()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    move-result-object v0

    invoke-static {v0}, Lpc1/d;->b(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/f;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->getStyle()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    move-result-object v0

    invoke-static {v0}, Lpc1/d;->a(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/c;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v1, v8

    goto :goto_3

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    move-object v5, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_4
    move v6, v0

    goto :goto_5

    :cond_3
    const/4 v0, 0x1

    goto :goto_4

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    new-instance v1, Lh31/g;

    invoke-direct/range {v1 .. v7}, Lh31/g;-><init>(Lcom/whoop/design/util/TextResource;Lh31/f;Lh31/c;Lgz0/m0;ZLcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method
