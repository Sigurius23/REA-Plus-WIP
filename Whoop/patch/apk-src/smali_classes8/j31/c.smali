.class public abstract Lj31/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\t\u001a\u00020\u0008*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lu2/v;",
        "Lu2/r;",
        "initialDown",
        "b",
        "(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;",
        "Lu2/k;",
        "Lu2/q;",
        "pointerId",
        "",
        "c",
        "(Lu2/k;J)Z",
        "Ly3/f;",
        "a",
        "F",
        "mouseSlop",
        "defaultTouchSlop",
        "",
        "mouseToTouchSlopRatio",
        "design_release"
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
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    sput v0, Lj31/c;->a:F

    const/16 v1, 0x12

    int-to-float v1, v1

    sput v1, Lj31/c;->b:F

    div-float/2addr v0, v1

    sput v0, Lj31/c;->c:F

    return-void
.end method

.method public static final synthetic a(Lu2/k;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lj31/c;->c(Lu2/k;J)Z

    move-result p0

    return p0
.end method

.method public static final b(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lu2/r;",
            "Lq83/d<",
            "-",
            "Lu2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lj31/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj31/c$a;

    iget v1, v0, Lj31/c$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj31/c$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj31/c$a;

    invoke-direct {v0, p2}, Lj31/c$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lj31/c$a;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lj31/c$a;->G:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lj31/c$a;->z:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/g0;

    iget-object p0, v0, Lj31/c$a;->y:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/g0;

    iget-object p1, v0, Lj31/c$a;->x:Ljava/lang/Object;

    check-cast p1, Lu2/r;

    iget-object v0, v0, Lj31/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v5, p0

    check-cast v5, Lu2/h0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v5

    iget-object v5, v5, La3/n0;->Z:Lb3/j3;

    invoke-interface {v5}, Lb3/j3;->c()J

    move-result-wide v5

    :try_start_1
    new-instance v7, Lj31/c$b;

    invoke-direct {v7, p0, v2, p2, v4}, Lj31/c$b;-><init>(Lu2/v;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object v4, v0, Lj31/c$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lj31/c$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj31/c$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lj31/c$a;->z:Ljava/lang/Object;

    iput-wide v5, v0, Lj31/c$a;->E:J

    iput v3, v0, Lj31/c$a;->G:I

    invoke-static {v5, v6, v7, v0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object v4

    :catch_0
    move-object p0, p2

    :catch_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lu2/r;

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_2
    return-object p1
.end method

.method private static final c(Lu2/k;J)Z
    .locals 6

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lu2/r;

    iget-wide v4, v4, Lu2/r;->a:J

    invoke-static {v4, v5, p1, p2}, Lu2/q;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lu2/r;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    iget-boolean p1, v3, Lu2/r;->d:Z

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method
