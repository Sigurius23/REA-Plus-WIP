.class public abstract Llb1/p2;
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
        "legendMapper",
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

    new-instance v0, Llb1/t1;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/p2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TrendIconsLegendModel;)Lm21/d;
    .locals 0

    invoke-static {p0}, Llb1/p2;->e(Lcom/whoop/design/models/items/TrendIconsLegendModel;)Lm21/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/p2;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/p2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TrendIconsLegendModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/p2$a;

    invoke-direct {v2, v0}, Llb1/p2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/TrendIconsLegendModel;)Lm21/d;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrendIconsLegendModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrendIconsLegendModel;->getIcons()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/TrendIconModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/TrendIconModel;->getIcon()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    move v10, v9

    :goto_1
    if-ge v10, v8, :cond_1

    aget-object v11, v7, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_2
    if-nez v11, :cond_2

    goto :goto_3

    :cond_2
    move-object v6, v11

    :goto_3
    invoke-virtual {v4}, Lcom/whoop/design/models/items/TrendIconModel;->getType()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/models/TrendStateEnum;->UNKNOWN:Lcom/whoop/design/models/TrendStateEnum;

    invoke-static {}, Lcom/whoop/design/models/TrendStateEnum;->values()[Lcom/whoop/design/models/TrendStateEnum;

    move-result-object v7

    array-length v8, v7

    :goto_4
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_4
    move-object v10, v2

    :goto_5
    if-nez v10, :cond_5

    goto :goto_6

    :cond_5
    move-object v5, v10

    :goto_6
    invoke-static {v5}, Llb1/o;->b(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;

    move-result-object v4

    new-instance v5, Lm21/a;

    invoke-direct {v5, v6, v4}, Lm21/a;-><init>(Lgz0/m0;Ly81/f;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    move-object v2, v3

    :cond_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrendIconsLegendModel;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lm21/d;

    invoke-direct {v1, v0, p0, v2}, Lm21/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method
