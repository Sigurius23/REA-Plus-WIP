.class public final Ltv2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltv2/b;",
        "Ltv2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000c\u001a\u00020\u0003*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltv2/d;",
        "Lod1/g;",
        "Ltv2/b;",
        "Ltv2/c;",
        "Lfu2/i;",
        "strengthTrainerInteractor",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V",
        "h",
        "(Ltv2/c;)Ltv2/c;",
        "",
        "activityId",
        "g",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "currentState",
        "i",
        "(Ltv2/c;Ljava/lang/String;)Ltv2/c;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lfu2/i;",
        "b",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "c",
        "Ltr2/n;",
        "weightlifting_release"
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
.field private final a:Lfu2/i;

.field private final b:Lcom/whoop/weightlifting/data/WeightliftingApi;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V
    .locals 1

    const-string v0, "strengthTrainerInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltv2/d;->a:Lfu2/i;

    iput-object p2, p0, Ltv2/d;->b:Lcom/whoop/weightlifting/data/WeightliftingApi;

    iput-object p3, p0, Ltv2/d;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Ltv2/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltv2/d;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltv2/d;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 0

    iget-object p0, p0, Ltv2/d;->b:Lcom/whoop/weightlifting/data/WeightliftingApi;

    return-object p0
.end method

.method public static final synthetic e(Ltv2/d;Ltv2/c;)Ltv2/c;
    .locals 0

    invoke-direct {p0, p1}, Ltv2/d;->h(Ltv2/c;)Ltv2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ltv2/d;Ltv2/c;Ljava/lang/String;)Ltv2/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltv2/d;->i(Ltv2/c;Ljava/lang/String;)Ltv2/c;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ltv2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltv2/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltv2/d$a;

    iget v1, v0, Ltv2/d$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltv2/d$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltv2/d$a;

    invoke-direct {v0, p0, p2}, Ltv2/d$a;-><init>(Ltv2/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ltv2/d$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltv2/d$a;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ltv2/d$a;->w:Ljava/lang/Object;

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

    iget-object v2, p0, Ltv2/d;->c:Ltr2/n;

    new-instance v5, Ltv2/d$b;

    invoke-direct {v5, p0, p1, v9}, Ltv2/d$b;-><init>(Ltv2/d;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v6, Ltv2/d$a;->w:Ljava/lang/Object;

    iput p2, v6, Ltv2/d$a;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch LinkWorkout BFF"

    const/4 v7, 0x2

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

    new-instance p1, Ltv2/c;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;

    invoke-direct {p1, v9, p2}, Ltv2/c;-><init>(Ltv2/a;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b$b;

    if-eqz p1, :cond_5

    new-instance p1, Ltv2/c;

    sget-object p2, Ltv2/a$c;->a:Ltv2/a$c;

    invoke-direct {p1, p2, v9}, Ltv2/c;-><init>(Ltv2/a;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V

    return-object p1

    :cond_5
    instance-of p1, p2, Lu02/a$b$a;

    if-eqz p1, :cond_6

    new-instance p1, Ltv2/c;

    sget-object p2, Ltv2/a$d;->a:Ltv2/a$d;

    invoke-direct {p1, p2, v9}, Ltv2/c;-><init>(Ltv2/a;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Ltv2/c;)Ltv2/c;
    .locals 2

    iget-object v0, p0, Ltv2/d;->a:Lfu2/i;

    sget-object v1, Lfu2/g$e;->a:Lfu2/g$e;

    invoke-virtual {v0, v1}, Lfu2/i;->j(Lfu2/g;)V

    return-object p1
.end method

.method private final i(Ltv2/c;Ljava/lang/String;)Ltv2/c;
    .locals 2

    iget-object v0, p0, Ltv2/d;->a:Lfu2/i;

    new-instance v1, Lfu2/g$f;

    invoke-direct {v1, p2}, Lfu2/g$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lfu2/i;->j(Lfu2/g;)V

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

    new-instance v0, Ltv2/c;

    sget-object v1, Ltv2/a$b;->a:Ltv2/a$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltv2/c;-><init>(Ltv2/a;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V

    new-instance v1, Ltv2/d$c;

    invoke-direct {v1, p0, v2}, Ltv2/d$c;-><init>(Ltv2/d;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
