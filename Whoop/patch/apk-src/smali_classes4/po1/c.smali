.class public final Lpo1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpo1/a;",
        "Lpo1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00032\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpo1/c;",
        "Lod1/g;",
        "Lpo1/a;",
        "Lpo1/b;",
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;)V",
        "h",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "",
        "dates",
        "i",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "ids",
        "j",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lbc3/c0;",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

.field private final b:Ltr2/n;

.field private final c:Lbc3/c0;


# direct methods
.method public constructor <init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpo1/c;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    .line 3
    iput-object p2, p0, Lpo1/c;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lpo1/c;->c:Lbc3/c0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "CycleInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpo1/c;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic c(Lpo1/c;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
    .locals 0

    iget-object p0, p0, Lpo1/c;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    return-object p0
.end method

.method public static final synthetic d(Lpo1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lpo1/c;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lpo1/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lpo1/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lpo1/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpo1/c;->i(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lpo1/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpo1/c;->j(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpo1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lpo1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpo1/c$a;

    iget v1, v0, Lpo1/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpo1/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lpo1/c$a;

    invoke-direct {v0, p0, p1}, Lpo1/c$a;-><init>(Lpo1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lpo1/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lpo1/c$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lpo1/c;->b:Ltr2/n;

    new-instance v5, Lpo1/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lpo1/c$b;-><init>(Lpo1/c;Lq83/d;)V

    iput p1, v6, Lpo1/c$a;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance v0, Lpo1/b$f;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;

    invoke-direct {v0, p1}, Lpo1/b$f;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lpo1/b$a;->a:Lpo1/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpo1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lpo1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpo1/c$c;

    iget v1, v0, Lpo1/c$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpo1/c$c;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lpo1/c$c;

    invoke-direct {v0, p0, p2}, Lpo1/c$c;-><init>(Lpo1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lpo1/c$c;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lpo1/c$c;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lpo1/c$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lpo1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p1

    check-cast v7, Ljava/lang/Iterable;

    const/4 v11, 0x0

    const/16 v12, 0x3e

    const-string v8, ","

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "["

    const-string v1, "]"

    invoke-static {p2, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lpo1/c;->b:Ltr2/n;

    new-instance v5, Lpo1/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lpo1/c$d;-><init>(Lpo1/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lpo1/c$c;->w:Ljava/lang/Object;

    iput-object v3, v6, Lpo1/c$c;->x:Ljava/lang/Object;

    iput p2, v6, Lpo1/c$c;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    sget-object p1, Lpo1/b$e;->a:Lpo1/b$e;

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lpo1/b$d;->a:Lpo1/b$d;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpo1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lpo1/c$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpo1/c$g;

    iget v1, v0, Lpo1/c$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpo1/c$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpo1/c$g;

    invoke-direct {v0, p0, p2}, Lpo1/c$g;-><init>(Lpo1/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lpo1/c$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpo1/c$g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lpo1/c$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lpo1/c;->c:Lbc3/c0;

    new-instance v2, Lpo1/c$h;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p0, v4}, Lpo1/c$h;-><init>(Ljava/util/List;Lpo1/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v4, v2, p1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    iput-object v4, v0, Lpo1/c$g;->w:Ljava/lang/Object;

    iput v3, v0, Lpo1/c$g;->z:I

    invoke-virtual {p1, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    instance-of p1, p2, Ljava/util/Collection;

    if-eqz p1, :cond_4

    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu02/a;

    instance-of p2, p2, Lu02/a$b;

    if-eqz p2, :cond_5

    sget-object p1, Lpo1/b$d;->a:Lpo1/b$d;

    return-object p1

    :cond_6
    :goto_2
    sget-object p1, Lpo1/b$e;->a:Lpo1/b$e;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lpo1/b$d;->a:Lpo1/b$d;

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpo1/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpo1/c$e;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object v0, Lpo1/b$b;->a:Lpo1/b$b;

    new-instance v2, Lpo1/c$f;

    invoke-direct {v2, p0, v1}, Lpo1/c$f;-><init>(Lpo1/c;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
