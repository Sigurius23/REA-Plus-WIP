.class public abstract Llb1/e5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/e5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TrendBarModel;",
        "trendBarModel",
        "Li41/d;",
        "e",
        "(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;",
        "Li41/b;",
        "trendBarPosition",
        "Li91/a;",
        "c",
        "(Li41/b;)Li91/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "trendBarMapper",
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

    new-instance v0, Llb1/z4;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/e5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;
    .locals 0

    invoke-static {p0}, Llb1/e5;->g(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e5;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Li41/b;)Li91/a;
    .locals 1

    const-string v0, "trendBarPosition"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/e5$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Llb1/e5$d;->w:Llb1/e5$d;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Llb1/e5$c;->w:Llb1/e5$c;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Llb1/e5$b;->w:Llb1/e5$b;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/e5;->a:Llb1/y0;

    return-object v0
.end method

.method public static final e(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;
    .locals 6

    const-string v0, "trendBarModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrendBarModel;->getSegments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/TrendBarType;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TrendBarType;->getTrend()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Li41/b;->valueOf(Ljava/lang/String;)Li41/b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrendBarModel;->getCurrentPosition()Lcom/whoop/design/models/items/TrendBarType;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/design/models/items/TrendBarType;->getTrend()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TrendBarType;->getTrend()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    new-instance v4, Li41/c;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v2, :cond_1

    invoke-static {v3}, Llb1/e5;->c(Li41/b;)Li91/a;

    move-result-object v2

    goto :goto_2

    :cond_1
    sget-object v2, Llb1/e5$e;->w:Llb1/e5$e;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    :goto_2
    invoke-direct {v4, v3, v5, v2}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Li41/d;

    invoke-direct {p0, v1}, Li41/d;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TrendBarModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/e5$f;

    invoke-direct {v2, v0}, Llb1/e5$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/e5;->e(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;

    move-result-object p0

    return-object p0
.end method
