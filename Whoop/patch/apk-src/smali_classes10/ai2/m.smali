.class public final Lai2/m;
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
        "Lai2/m;",
        "Lai2/h;",
        "Ly62/b;",
        "researchPacketDbManager",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly62/b;Ltr2/n;)V",
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
        "Ly62/b;",
        "Ltr2/n;",
        "Ly62/a;",
        "Ly62/a;",
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
.field private final a:Ly62/b;

.field private final b:Ltr2/n;

.field private c:Ly62/a;

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
.method public constructor <init>(Ly62/b;Ltr2/n;)V
    .locals 1

    const-string v0, "researchPacketDbManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai2/m;->a:Ly62/b;

    .line 3
    iput-object p2, p0, Lai2/m;->b:Ltr2/n;

    .line 4
    sget-object p1, Llt0/g;->a:Llt0/g$a;

    const/4 p2, 0x2

    new-array p2, p2, [S

    fill-array-data p2, :array_0

    invoke-virtual {p1, p2}, Llt0/g$a;->a([S)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lai2/m;->d:Ljava/util/Set;

    return-void

    :array_0
    .array-data 2
        0x13s
        0x16s
    .end array-data
.end method

.method public synthetic constructor <init>(Ly62/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ResearchCollector"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lai2/m;-><init>(Ly62/b;Ltr2/n;)V

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

    instance-of v1, p1, Lai2/m$a;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lai2/m$a;

    iget v2, v1, Lai2/m$a;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lai2/m$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lai2/m$a;

    invoke-direct {v1, p0, p1}, Lai2/m$a;-><init>(Lai2/m;Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lai2/m$a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lai2/m$a;->z:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v1, v1, Lai2/m$a;->w:Ljava/lang/Object;

    check-cast v1, Ly62/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lai2/m;->c:Ly62/a;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ly62/a;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object p1, p0, Lai2/m;->b:Ltr2/n;

    const-string v0, "No research packets to flush"

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    :try_start_1
    iget-object v3, p0, Lai2/m;->a:Ly62/b;

    invoke-virtual {p1}, Ly62/a;->b()Loh2/a;

    move-result-object v6

    invoke-virtual {p1}, Ly62/a;->c()Ljava/util/List;

    move-result-object v7

    iput-object p1, v1, Lai2/m$a;->w:Ljava/lang/Object;

    iput v4, v1, Lai2/m$a;->z:I

    invoke-virtual {v3, v6, v7, v1}, Ly62/b;->c(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

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

    iget-object v2, p0, Lai2/m;->b:Ltr2/n;

    invoke-virtual {v1}, Ly62/a;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " research packets"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lai2/m;->b:Ltr2/n;

    const-string v1, "Failed to flush research packets"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    move v5, p1

    goto :goto_4

    :goto_3
    iget-object v0, p0, Lai2/m;->b:Ltr2/n;

    const-string v1, "Exception flushing research packets"

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

    invoke-virtual {p0}, Lai2/m;->reset()V

    new-instance v0, Ly62/a;

    invoke-direct {v0, p1}, Ly62/a;-><init>(Loh2/a;)V

    iput-object v0, p0, Lai2/m;->c:Ly62/a;

    return-void
.end method

.method public c(Llt0/m;Llt0/f;)V
    .locals 3

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lai2/m;->c:Ly62/a;

    if-eqz v0, :cond_2

    invoke-static {p2}, Lai2/i;->a(Llt0/f;)Llt0/b;

    move-result-object p2

    invoke-virtual {p2}, Llt0/b;->U()S

    move-result v1

    const/16 v2, 0x13

    if-ne v1, v2, :cond_0

    new-instance v1, Lnt0/c;

    invoke-direct {v1, p1, p2}, Lnt0/c;-><init>(Llt0/m;Llt0/b;)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x16

    if-ne v1, v2, :cond_1

    new-instance v1, Lnt0/f;

    invoke-direct {v1, p1, p2}, Lnt0/f;-><init>(Llt0/m;Llt0/b;)V

    :goto_0
    invoke-virtual {v0, v1}, Ly62/a;->a(Lnt0/h;)V

    :cond_1
    return-void

    :cond_2
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

    iget-object v0, p0, Lai2/m;->d:Ljava/util/Set;

    return-object v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lai2/m;->c:Ly62/a;

    return-void
.end method
