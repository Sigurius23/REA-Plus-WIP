.class public final Lai2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai2/h;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001bR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lai2/g;",
        "Lai2/h;",
        "Lbi2/d;",
        "dataStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lbi2/d;Ltr2/n;)V",
        "Loh2/a;",
        "acquisitionInfo",
        "Ll83/a0;",
        "b",
        "(Loh2/a;)V",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/f;",
        "dataPacket",
        "c",
        "(Llt0/m;Llt0/f;)V",
        "",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "reset",
        "()V",
        "Lbi2/d;",
        "Ltr2/n;",
        "Lbi2/f;",
        "Lbi2/f;",
        "batch",
        "",
        "Llt0/g;",
        "d",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "supportedFormatRevisions",
        "strap-history-sync_release"
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
.field private final a:Lbi2/d;

.field private final b:Ltr2/n;

.field private c:Lbi2/f;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbi2/d;Ltr2/n;)V
    .locals 1

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai2/g;->a:Lbi2/d;

    .line 3
    iput-object p2, p0, Lai2/g;->b:Ltr2/n;

    .line 4
    invoke-static {}, Lbi2/e;->a()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lai2/g;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lbi2/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "MetricsCollector"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lai2/g;-><init>(Lbi2/d;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Flushed "

    instance-of v1, p1, Lai2/g$a;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lai2/g$a;

    iget v2, v1, Lai2/g$a;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lai2/g$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lai2/g$a;

    invoke-direct {v1, p0, p1}, Lai2/g$a;-><init>(Lai2/g;Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lai2/g$a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lai2/g$a;->z:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v1, v1, Lai2/g$a;->w:Ljava/lang/Object;

    check-cast v1, Lbi2/f;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lai2/g;->c:Lbi2/f;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lbi2/f;->c()I

    move-result v3

    if-nez v3, :cond_3

    iget-object p1, p0, Lai2/g;->b:Ltr2/n;

    const-string v0, "No metrics packets to flush"

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    :try_start_1
    iget-object v3, p0, Lai2/g;->a:Lbi2/d;

    invoke-virtual {p1}, Lbi2/f;->e()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {p1}, Lbi2/f;->b()Loh2/a;

    move-result-object v7

    iput-object p1, v1, Lai2/g$a;->w:Ljava/lang/Object;

    iput v4, v1, Lai2/g$a;->z:I

    invoke-interface {v3, v6, v7, v1}, Lbi2/d;->d(Ljava/util/Map;Loh2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object v2, p0, Lai2/g;->b:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lai2/g;->b:Ltr2/n;

    const-string v1, "Failed to flush metrics packets"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    move v5, p1

    goto :goto_4

    :goto_3
    iget-object v0, p0, Lai2/g;->b:Ltr2/n;

    const-string v1, "Exception flushing metrics packets"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "flush() called before startBurst()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Loh2/a;)V
    .locals 1

    const-string v0, "acquisitionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lai2/g;->reset()V

    new-instance v0, Lbi2/f;

    invoke-direct {v0, p1}, Lbi2/f;-><init>(Loh2/a;)V

    iput-object v0, p0, Lai2/g;->c:Lbi2/f;

    return-void
.end method

.method public c(Llt0/m;Llt0/f;)V
    .locals 9

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lai2/g;->c:Lbi2/f;

    if-eqz v1, :cond_3

    invoke-interface {p2}, Llt0/f;->g()Llt0/g;

    move-result-object v0

    instance-of v2, v0, Llt0/g$b;

    if-eqz v2, :cond_1

    invoke-static {p2}, Lai2/i;->a(Llt0/f;)Llt0/b;

    move-result-object p2

    invoke-virtual {p2}, Llt0/b;->Y()Lfk2/a;

    move-result-object v0

    invoke-virtual {v0}, Lfk2/a;->j()J

    move-result-wide v3

    invoke-virtual {p2}, Llt0/b;->Q()J

    move-result-wide v5

    invoke-virtual {p2}, Llt0/b;->T()S

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p2}, Llt0/b;->g()Llt0/g;

    move-result-object v8

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lbi2/f;->a(Llt0/m;JJZLlt0/g;)V

    return-void

    :cond_1
    move-object v2, p1

    instance-of p1, v0, Llt0/g$c;

    if-eqz p1, :cond_2

    invoke-static {p2}, Lai2/i;->b(Llt0/f;)Lhk0/d;

    move-result-object p1

    invoke-virtual {p1}, Lhk0/b;->X()Lfk2/a;

    move-result-object p2

    invoke-virtual {p2}, Lfk2/a;->j()J

    move-result-wide v3

    invoke-virtual {p1}, Lhk0/b;->W()J

    move-result-wide v5

    const/4 v7, 0x1

    invoke-virtual {p1}, Lhk0/d;->g()Llt0/g;

    move-result-object v8

    invoke-virtual/range {v1 .. v8}, Lbi2/f;->a(Llt0/m;JJZLlt0/g;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "collect() called before startBurst()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lai2/g;->d:Ljava/util/Set;

    return-object v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lai2/g;->c:Lbi2/f;

    return-void
.end method
