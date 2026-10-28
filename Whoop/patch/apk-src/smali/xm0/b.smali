.class public final Lxm0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ,\u0010\u0012\u001a\u00020\u0011\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lxm0/b;",
        "",
        "Lsr2/y;",
        "baseUrlProvider",
        "Lmm0/a;",
        "cache",
        "Lvm0/g;",
        "cacheReporter",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;)V",
        "T",
        "Lne3/l;",
        "data",
        "Lnm0/c;",
        "cacheableRequest",
        "Ll83/a0;",
        "c",
        "(Lne3/l;Lnm0/c;Lq83/d;)Ljava/lang/Object;",
        "",
        "uri",
        "b",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "scope",
        "a",
        "Lsr2/y;",
        "Lmm0/a;",
        "Lvm0/g;",
        "d",
        "Ljava/time/Clock;",
        "cache_release"
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
.field private final a:Lsr2/y;

.field private final b:Lmm0/a;

.field private final c:Lvm0/g;

.field private final d:Ljava/time/Clock;


# direct methods
.method public constructor <init>(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;)V
    .locals 1

    const-string v0, "baseUrlProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxm0/b;->a:Lsr2/y;

    .line 3
    iput-object p2, p0, Lxm0/b;->b:Lmm0/a;

    .line 4
    iput-object p3, p0, Lxm0/b;->c:Lvm0/g;

    .line 5
    iput-object p4, p0, Lxm0/b;->d:Ljava/time/Clock;

    return-void
.end method

.method public synthetic constructor <init>(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p4

    const-string p5, "systemDefaultZone(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lxm0/b;-><init>(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lxm0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxm0/b$a;

    iget v1, v0, Lxm0/b$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxm0/b$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxm0/b$a;

    invoke-direct {v0, p0, p2}, Lxm0/b$a;-><init>(Lxm0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxm0/b$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxm0/b$a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lxm0/b$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lxm0/b$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxm0/b;->b:Lmm0/a;

    iput-object v3, v0, Lxm0/b$a;->w:Ljava/lang/Object;

    iput v5, v0, Lxm0/b$a;->z:I

    invoke-interface {p2, p1, v0}, Lmm0/a;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    sget-object p2, Lvm0/f;->EVICT_SCOPE:Lvm0/f;

    invoke-interface {p1, p2}, Lvm0/g;->f(Lvm0/f;)V

    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    iput-object v3, v0, Lxm0/b$a;->w:Ljava/lang/Object;

    iput v4, v0, Lxm0/b$a;->z:I

    invoke-interface {p1, v0}, Lvm0/g;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lxm0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxm0/b$b;

    iget v1, v0, Lxm0/b$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxm0/b$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxm0/b$b;

    invoke-direct {v0, p0, p2}, Lxm0/b$b;-><init>(Lxm0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxm0/b$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxm0/b$b;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lxm0/b$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lxm0/b$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxm0/b;->b:Lmm0/a;

    iput-object v3, v0, Lxm0/b$b;->w:Ljava/lang/Object;

    iput v5, v0, Lxm0/b$b;->z:I

    invoke-interface {p2, p1, v0}, Lmm0/a;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    sget-object p2, Lvm0/f;->EVICT_URI:Lvm0/f;

    invoke-interface {p1, p2}, Lvm0/g;->f(Lvm0/f;)V

    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    iput-object v3, v0, Lxm0/b$b;->w:Ljava/lang/Object;

    iput v4, v0, Lxm0/b$b;->z:I

    invoke-interface {p1, v0}, Lvm0/g;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(Lne3/l;Lnm0/c;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lne3/l;",
            "Lnm0/c<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lxm0/b$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxm0/b$c;

    iget v1, v0, Lxm0/b$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxm0/b$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxm0/b$c;

    invoke-direct {v0, p0, p3}, Lxm0/b$c;-><init>(Lxm0/b;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lxm0/b$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxm0/b$c;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxm0/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lmm0/b;

    iget-object p1, v0, Lxm0/b$c;->x:Ljava/lang/Object;

    check-cast p1, Lnm0/c;

    iget-object p1, v0, Lxm0/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lne3/l;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lxm0/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lmm0/b;

    iget-object p1, v0, Lxm0/b$c;->x:Ljava/lang/Object;

    check-cast p1, Lnm0/c;

    iget-object p1, v0, Lxm0/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lne3/l;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v6, Lmm0/b;

    iget-object p3, p0, Lxm0/b;->a:Lsr2/y;

    invoke-virtual {p2, p3}, Lnm0/c;->d(Lsr2/y;)Ljava/lang/String;

    move-result-object v7

    iget-object p3, p0, Lxm0/b;->d:Ljava/time/Clock;

    invoke-virtual {p3}, Ljava/time/Clock;->millis()J

    move-result-wide v9

    invoke-virtual {p2}, Lnm0/c;->b()Ljava/util/Set;

    move-result-object v11

    move-object v8, p1

    invoke-direct/range {v6 .. v11}, Lmm0/b;-><init>(Ljava/lang/String;Lne3/l;JLjava/util/Set;)V

    iget-object p1, p0, Lxm0/b;->b:Lmm0/a;

    iput-object v5, v0, Lxm0/b$c;->w:Ljava/lang/Object;

    iput-object v5, v0, Lxm0/b$c;->x:Ljava/lang/Object;

    iput-object v5, v0, Lxm0/b$c;->y:Ljava/lang/Object;

    iput v4, v0, Lxm0/b$c;->F:I

    invoke-interface {p1, v6, v0}, Lmm0/a;->g(Lmm0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    sget-object p2, Lvm0/f;->UPDATE:Lvm0/f;

    invoke-interface {p1, p2}, Lvm0/g;->f(Lvm0/f;)V

    iget-object p1, p0, Lxm0/b;->c:Lvm0/g;

    iput-object v5, v0, Lxm0/b$c;->w:Ljava/lang/Object;

    iput-object v5, v0, Lxm0/b$c;->x:Ljava/lang/Object;

    iput-object v5, v0, Lxm0/b$c;->y:Ljava/lang/Object;

    iput v3, v0, Lxm0/b$c;->F:I

    invoke-interface {p1, v0}, Lvm0/g;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
