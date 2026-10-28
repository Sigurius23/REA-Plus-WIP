.class public final Loo1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Loo1/i;",
        "Loo1/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Loo1/k;",
        "Lod1/g;",
        "Loo1/i;",
        "Loo1/j;",
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V",
        "",
        "initialPhase",
        "f",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;",
        "response",
        "Loo1/j$c;",
        "e",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Loo1/j$c;",
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
    iput-object p1, p0, Loo1/k;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    .line 3
    iput-object p2, p0, Loo1/k;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "PhaseCoachingInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Loo1/k;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Loo1/k;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Loo1/k;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Loo1/k;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
    .locals 0

    iget-object p0, p0, Loo1/k;->a:Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Loo1/j$c;
    .locals 1

    new-instance v0, Loo1/j$c;

    invoke-direct {v0, p1, p2}, Loo1/j$c;-><init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)V

    return-object v0
.end method

.method private final f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loo1/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Loo1/k$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Loo1/k$a;

    iget v1, v0, Loo1/k$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loo1/k$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Loo1/k$a;

    invoke-direct {v0, p0, p2}, Loo1/k$a;-><init>(Loo1/k;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Loo1/k$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Loo1/k$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Loo1/k$a;->w:Ljava/lang/Object;

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

    iget-object v2, p0, Loo1/k;->b:Ltr2/n;

    new-instance v5, Loo1/k$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Loo1/k$b;-><init>(Loo1/k;Lq83/d;)V

    iput-object p1, v6, Loo1/k$a;->w:Ljava/lang/Object;

    iput p2, v6, Loo1/k$a;->z:I

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

    instance-of v0, p2, Lu02/a$c;

    if-eqz v0, :cond_4

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;

    invoke-direct {p0, p1, p2}, Loo1/k;->e(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Loo1/j$c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    new-instance p1, Loo1/j$a;

    check-cast p2, Lu02/a$b;

    invoke-virtual {p2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Loo1/j$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
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

    sget-object v0, Loo1/j$b;->a:Loo1/j$b;

    new-instance v1, Loo1/k$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Loo1/k$c;-><init>(Loo1/k;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
