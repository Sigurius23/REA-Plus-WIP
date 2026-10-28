.class public final Lai2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai2/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lai2/a;",
        "Lai2/f;",
        "Lat0/b;",
        "consolePacketService",
        "",
        "deviceGenCodeName",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lat0/b;Ljava/lang/String;Ltr2/n;)V",
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
        "Lat0/b;",
        "Ljava/lang/String;",
        "Ltr2/n;",
        "d",
        "Loh2/a;",
        "",
        "Lat0/a;",
        "e",
        "Ljava/util/List;",
        "pendingPackets",
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
.field private final a:Lat0/b;

.field private final b:Ljava/lang/String;

.field private final c:Ltr2/n;

.field private d:Loh2/a;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lat0/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lat0/b;Ljava/lang/String;Ltr2/n;)V
    .locals 1

    const-string v0, "consolePacketService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceGenCodeName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai2/a;->a:Lat0/b;

    .line 3
    iput-object p2, p0, Lai2/a;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lai2/a;->c:Ltr2/n;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lai2/a;->e:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lat0/b;Ljava/lang/String;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ConsoleLogCollector"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lai2/a;-><init>(Lat0/b;Ljava/lang/String;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lai2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lai2/a$a;

    iget v1, v0, Lai2/a$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lai2/a$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lai2/a$a;

    invoke-direct {v0, p0, p1}, Lai2/a$a;-><init>(Lai2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lai2/a$a;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lai2/a$a;->I:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v2, v0, Lai2/a$a;->E:I

    iget-object v5, v0, Lai2/a$a;->z:Ljava/lang/Object;

    check-cast v5, Lat0/a;

    iget-object v5, v0, Lai2/a$a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Lai2/a$a;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lai2/a;->d:Loh2/a;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lai2/a;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lai2/a;->c:Ltr2/n;

    const-string v0, "No console packets to flush"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    :try_start_1
    iget-object p1, p0, Lai2/a;->e:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    move v2, v4

    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lat0/a;

    iget-object v6, p0, Lai2/a;->a:Lat0/b;

    const/4 v7, 0x0

    iput-object v7, v0, Lai2/a$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lai2/a$a;->x:Ljava/lang/Object;

    iput-object v7, v0, Lai2/a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lai2/a$a;->z:Ljava/lang/Object;

    iput v2, v0, Lai2/a$a;->E:I

    iput v4, v0, Lai2/a$a;->F:I

    iput v3, v0, Lai2/a$a;->I:I

    invoke-interface {v6, p1, v0}, Lat0/b;->a(Lat0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_5
    iget-object p1, p0, Lai2/a;->c:Ltr2/n;

    iget-object v0, p0, Lai2/a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Flushed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " console packets"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v0, p0, Lai2/a;->c:Ltr2/n;

    const-string v1, "Exception flushing console packets"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move v3, v4

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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

    invoke-virtual {p0}, Lai2/a;->reset()V

    iput-object p1, p0, Lai2/a;->d:Loh2/a;

    return-void
.end method

.method public c(Llt0/m;Lot0/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "receivedPacket"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "eventPacket"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lai2/a;->d:Loh2/a;

    if-eqz v2, :cond_a

    instance-of v4, v1, Lek0/l;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Lek0/l;

    invoke-virtual {v4}, Llt0/c;->N()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    :goto_0
    move v14, v4

    goto :goto_1

    :cond_0
    instance-of v4, v1, Lhk0/c;

    if-eqz v4, :cond_9

    move-object v4, v1

    check-cast v4, Lhk0/c;

    invoke-virtual {v4}, Lhk0/b;->W()J

    move-result-wide v6

    long-to-int v4, v6

    goto :goto_0

    :goto_1
    invoke-interface {v1}, Lot0/b;->getTimestamp()Lfk2/a;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lai2/a;->c:Ltr2/n;

    const-string v2, "Console packet has null timestamp (malformed packet), dropping"

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    new-instance v6, Lat0/a;

    invoke-virtual {v1}, Lfk2/a;->j()J

    move-result-wide v7

    invoke-virtual {v2}, Loh2/a;->f()Ljava/lang/String;

    move-result-object v1

    const-string v4, ""

    if-nez v1, :cond_2

    move-object v9, v4

    goto :goto_2

    :cond_2
    move-object v9, v1

    :goto_2
    iget-object v10, v0, Lai2/a;->b:Ljava/lang/String;

    invoke-virtual {v2}, Loh2/a;->d()Loh2/c;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v11, v1

    goto :goto_4

    :cond_4
    :goto_3
    move-object v11, v4

    :goto_4
    invoke-virtual {v2}, Loh2/a;->c()Loh2/b;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v12, v1

    goto :goto_6

    :cond_6
    :goto_5
    move-object v12, v4

    :goto_6
    invoke-virtual {v2}, Loh2/a;->e()Loh2/e;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    move-object v13, v1

    goto :goto_8

    :cond_8
    :goto_7
    move-object v13, v4

    :goto_8
    invoke-virtual {v2}, Loh2/a;->g()B

    move-result v15

    invoke-virtual {v3}, Llt0/k;->a()Lmt0/b;

    move-result-object v1

    invoke-virtual {v1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v16

    invoke-direct/range {v6 .. v16}, Lat0/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/nio/ByteBuffer;)V

    iget-object v1, v0, Lai2/a;->e:Ljava/util/List;

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_9
    iget-object v2, v0, Lai2/a;->c:Ltr2/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ConsoleLogCollector received non-console packet: "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v2, v1, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "collect() called before startBurst()"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lai2/a;->d:Loh2/a;

    iget-object v0, p0, Lai2/a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
