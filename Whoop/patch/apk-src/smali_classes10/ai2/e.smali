.class public final Lai2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai2/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lai2/e;",
        "Lai2/f;",
        "Lgg1/a;",
        "firmwareEventsStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lgg1/a;Ltr2/n;)V",
        "Loh2/a;",
        "acquisitionInfo",
        "Ll83/a0;",
        "b",
        "(Loh2/a;)V",
        "Llt0/m;",
        "receivedPacket",
        "Lot0/b;",
        "eventPacket",
        "c",
        "(Llt0/m;Lot0/b;)V",
        "",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "reset",
        "()V",
        "Lgg1/a;",
        "Ltr2/n;",
        "Lfg1/a;",
        "Lfg1/a;",
        "batch",
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
.field private final a:Lgg1/a;

.field private final b:Ltr2/n;

.field private c:Lfg1/a;


# direct methods
.method public constructor <init>(Lgg1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "firmwareEventsStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai2/e;->a:Lgg1/a;

    .line 3
    iput-object p2, p0, Lai2/e;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lgg1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "EventCollector"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lai2/e;-><init>(Lgg1/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    const-string p1, "Flushed "

    iget-object v0, p0, Lai2/e;->c:Lfg1/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lfg1/a;->c()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object p1, p0, Lai2/e;->b:Ltr2/n;

    const-string v0, "No event packets to flush"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lai2/e;->a:Lgg1/a;

    invoke-interface {v1, v0}, Lgg1/a;->a(Lfg1/a;)V

    iget-object v1, p0, Lai2/e;->b:Ltr2/n;

    invoke-virtual {v0}, Lfg1/a;->c()I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " event packets"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lai2/e;->b:Ltr2/n;

    const-string v1, "Exception flushing event packets"

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "flush() called before startBurst()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Loh2/a;)V
    .locals 1

    const-string v0, "acquisitionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lai2/e;->reset()V

    new-instance v0, Lfg1/a;

    invoke-direct {v0, p1}, Lfg1/a;-><init>(Loh2/a;)V

    iput-object v0, p0, Lai2/e;->c:Lfg1/a;

    return-void
.end method

.method public c(Llt0/m;Lot0/b;)V
    .locals 1

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lai2/e;->c:Lfg1/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lfg1/a;->a(Llt0/m;Lot0/b;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "collect() called before startBurst()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lai2/e;->c:Lfg1/a;

    return-void
.end method
