.class public final Ltt2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltt2/d;",
        "Ltt2/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ltt2/f;",
        "Lod1/g;",
        "Ltt2/d;",
        "Ltt2/e;",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lls2/b;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;)V",
        "",
        "planId",
        "Lec3/l;",
        "i",
        "(Ljava/lang/String;)Lec3/l;",
        "h",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "data",
        "Ll83/a0;",
        "j",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lls2/b;",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

.field private final b:Ltr2/n;

.field private final c:Lls2/b;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltt2/f;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    iput-object p2, p0, Ltt2/f;->b:Ltr2/n;

    iput-object p3, p0, Ltt2/f;->c:Lls2/b;

    return-void
.end method

.method public static final synthetic c(Ltt2/f;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltt2/f;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltt2/f;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;
    .locals 0

    iget-object p0, p0, Ltt2/f;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    return-object p0
.end method

.method public static final synthetic e(Ltt2/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltt2/f;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Ltt2/f;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ltt2/f;->i(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ltt2/f;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V
    .locals 0

    invoke-direct {p0, p1}, Ltt2/f;->j(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V

    return-void
.end method

.method private final h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltt2/f$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltt2/f$a;

    iget v1, v0, Ltt2/f$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltt2/f$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltt2/f$a;

    invoke-direct {v0, p0, p2}, Ltt2/f$a;-><init>(Ltt2/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ltt2/f$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltt2/f$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ltt2/f$a;->w:Ljava/lang/Object;

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

    iget-object v2, p0, Ltt2/f;->b:Ltr2/n;

    new-instance v5, Ltt2/f$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ltt2/f$b;-><init>(Ltt2/f;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Ltt2/f$a;->w:Ljava/lang/Object;

    iput p2, v6, Ltt2/f$a;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    const/4 p1, 0x0

    new-array p1, p1, [Ltt2/e;

    new-instance p2, Lbm/g;

    const/4 v0, 0x3

    invoke-direct {p2, p1, v0}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    return-object p2
.end method

.method private final i(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ltt2/f$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ltt2/f$d;-><init>(Ltt2/f;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final j(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;)V
    .locals 6

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getItems()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_4

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v1

    :goto_2
    sget-object v5, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-eq v4, v5, :cond_6

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v2

    goto :goto_3

    :cond_5
    move-object v2, v1

    :goto_3
    if-ne v2, v5, :cond_3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_7

    goto :goto_1

    :cond_7
    invoke-static {}, Lwb3/f;->c0()V

    throw v1

    :cond_8
    :goto_4
    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getChallengeProgressBar()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;

    move-result-object p1

    goto :goto_5

    :cond_9
    move-object p1, v1

    :goto_5
    if-eqz p1, :cond_a

    const-string v1, "jan_jump_recap"

    :cond_a
    iget-object p1, p0, Ltt2/f;->c:Lls2/b;

    new-instance v0, Lls2/a$r;

    invoke-direct {v0, v3, v1}, Lls2/a$r;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Ltt2/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ltt2/f$c;-><init>(Lq83/d;Ltt2/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
