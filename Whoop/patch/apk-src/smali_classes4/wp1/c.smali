.class public final Lwp1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lwp1/a;",
        "Lwp1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00032\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00192\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lwp1/c;",
        "Lod1/g;",
        "Lwp1/a;",
        "Lwp1/b;",
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V",
        "",
        "useMenstrualEndpoint",
        "",
        "pregnancyId",
        "g",
        "(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "i",
        "(Lq83/d;)Ljava/lang/Object;",
        "j",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;",
        "response",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;",
        "k",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "b",
        "Ltr2/n;",
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


# direct methods
.method public constructor <init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwp1/c;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    .line 3
    iput-object p2, p0, Lwp1/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "SymptomPatternsInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lwp1/c;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lwp1/c;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwp1/c;->g(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lwp1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwp1/c;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lwp1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwp1/c;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lwp1/c;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
    .locals 0

    iget-object p0, p0, Lwp1/c;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    return-object p0
.end method

.method private final g(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwp1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-direct {p0, p3}, Lwp1/c;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p2, p3}, Lwp1/c;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic h(Lwp1/c;ZLjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwp1/c;->g(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lwp1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwp1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwp1/c$a;

    iget v1, v0, Lwp1/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwp1/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwp1/c$a;

    invoke-direct {v0, p0, p1}, Lwp1/c$a;-><init>(Lwp1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lwp1/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwp1/c$a;->y:I

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

    iget-object v2, p0, Lwp1/c;->b:Ltr2/n;

    new-instance v5, Lwp1/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lwp1/c$b;-><init>(Lwp1/c;Lq83/d;)V

    iput p1, v6, Lwp1/c$a;->y:I

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

    if-eqz v0, :cond_6

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    invoke-direct {p0, p1}, Lwp1/c;->k(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;->getSegmentedControlDisplays()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;->getSegments()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_5
    new-instance v1, Lwp1/b$c;

    invoke-direct {v1, p1, v0}, Lwp1/b$c;-><init>(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Ljava/lang/String;)V

    return-object v1

    :cond_6
    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_7

    new-instance v0, Lwp1/b$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwp1/b$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwp1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwp1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwp1/c$c;

    iget v1, v0, Lwp1/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwp1/c$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwp1/c$c;

    invoke-direct {v0, p0, p2}, Lwp1/c$c;-><init>(Lwp1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lwp1/c$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwp1/c$c;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lwp1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lwp1/c;->b:Ltr2/n;

    new-instance v5, Lwp1/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lwp1/c$d;-><init>(Lwp1/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lwp1/c$c;->w:Ljava/lang/Object;

    iput p2, v6, Lwp1/c$c;->z:I

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

    if-eqz p1, :cond_6

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;->getSegmentedControlDisplays()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;->getSegments()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_5
    new-instance v0, Lwp1/b$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;

    invoke-direct {v0, p2, p1}, Lwp1/b$c;-><init>(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_7

    new-instance p1, Lwp1/b$a;

    check-cast p2, Lu02/a$b;

    invoke-virtual {p2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lwp1/b$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final k(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->getSegmentedControlDisplays()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->getCurrentCycleSegment()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->getLastThreeCyclesSegment()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    move-result-object v2

    filled-new-array {v1, v2}, [Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    const/4 v6, 0x0

    if-ltz v3, :cond_2

    check-cast v4, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;

    invoke-static {v3, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;

    if-eqz v3, :cond_0

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    if-eqz v6, :cond_1

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    move v3, v5

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v6

    :cond_3
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;->getSegmentedControlDisplays()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v2, p1, v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
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

    sget-object v0, Lwp1/b$b;->a:Lwp1/b$b;

    new-instance v1, Lwp1/c$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lwp1/c$e;-><init>(Lwp1/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
