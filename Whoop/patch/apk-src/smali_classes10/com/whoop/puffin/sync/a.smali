.class public final Lcom/whoop/puffin/sync/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/a;",
        "",
        "<init>",
        "()V",
        "Lfk2/a;",
        "timestamp",
        "Lf52/j;",
        "d",
        "(Lfk2/a;)Lf52/j;",
        "Lcom/whoop/puffin/sync/e$b;",
        "state",
        "Lpu0/a;",
        "a",
        "(Lcom/whoop/puffin/sync/e$b;)Lpu0/a;",
        "",
        "Lpu0/b;",
        "b",
        "(Lcom/whoop/puffin/sync/e$b;)Ljava/util/List;",
        "Lpu0/d;",
        "c",
        "puffin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/whoop/puffin/sync/e$b;)Lpu0/a;
    .locals 10

    new-instance v0, Lpu0/a;

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v1

    invoke-virtual {v1}, Lf52/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v2

    invoke-virtual {v2}, Lf52/b;->c()Loh2/c;

    move-result-object v2

    invoke-virtual {v2}, Loh2/c;->a()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v3

    invoke-virtual {v3}, Lf52/b;->c()Loh2/c;

    move-result-object v3

    invoke-virtual {v3}, Loh2/c;->c()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v4

    invoke-virtual {v4}, Lf52/b;->c()Loh2/c;

    move-result-object v4

    invoke-virtual {v4}, Loh2/c;->b()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v5

    invoke-virtual {v5}, Lf52/b;->b()Loh2/b$b;

    move-result-object v5

    invoke-virtual {v5}, Loh2/b$b;->c()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v6

    invoke-virtual {v6}, Lf52/b;->b()Loh2/b$b;

    move-result-object v6

    invoke-virtual {v6}, Loh2/b$b;->d()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object v7

    invoke-virtual {v7}, Lf52/b;->b()Loh2/b$b;

    move-result-object v7

    invoke-virtual {v7}, Loh2/b$b;->b()J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->c()Lf52/b;

    move-result-object p1

    invoke-virtual {p1}, Lf52/b;->b()Loh2/b$b;

    move-result-object p1

    invoke-virtual {p1}, Loh2/b$b;->e()J

    move-result-wide v8

    long-to-int v8, v8

    invoke-direct/range {v0 .. v8}, Lpu0/a;-><init>(Ljava/lang/String;IIIIIII)V

    return-object v0
.end method

.method private final d(Lfk2/a;)Lf52/j;
    .locals 4

    new-instance v0, Lf52/j;

    invoke-virtual {p1}, Lfk2/a;->f()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {p1}, Lfk2/a;->e()J

    move-result-wide v2

    long-to-int p1, v2

    invoke-direct {v0, v1, p1}, Lf52/j;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public final b(Lcom/whoop/puffin/sync/e$b;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/e$b;",
            ")",
            "Ljava/util/List<",
            "Lpu0/b;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/puffin/sync/a;->a(Lcom/whoop/puffin/sync/e$b;)Lpu0/a;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->a()Lf52/g;

    move-result-object p1

    invoke-virtual {p1}, Lf52/g;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llt0/k;

    invoke-virtual {v1}, Llt0/k;->b()Llt0/c;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.eventpackets.EventPacket"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lot0/a;

    invoke-virtual {v2}, Lot0/a;->getTimestamp()Lfk2/a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v3}, Lcom/whoop/puffin/sync/a;->d(Lfk2/a;)Lf52/j;

    move-result-object v3

    move-object v4, v1

    new-instance v1, Lpu0/b;

    move-object v5, v4

    invoke-virtual {v3}, Lf52/j;->a()I

    move-result v4

    invoke-virtual {v3}, Lf52/j;->b()I

    move-result v3

    invoke-virtual {v2}, Llt0/c;->N()B

    move-result v6

    invoke-virtual {v5}, Llt0/k;->a()Lmt0/b;

    move-result-object v2

    invoke-virtual {v2}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v7

    const/4 v9, 0x1

    const/4 v10, 0x0

    move v5, v3

    const-wide/16 v2, 0x0

    invoke-direct/range {v1 .. v10}, Lpu0/b;-><init>(JIIILjava/nio/ByteBuffer;Lpu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method

.method public final c(Lcom/whoop/puffin/sync/e$b;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/e$b;",
            ")",
            "Ljava/util/List<",
            "Lpu0/d;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/puffin/sync/a;->a(Lcom/whoop/puffin/sync/e$b;)Lpu0/a;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/puffin/sync/e$b;->a()Lf52/g;

    move-result-object p1

    invoke-virtual {p1}, Lf52/g;->d()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llt0/k;

    invoke-virtual {v1}, Llt0/k;->b()Llt0/c;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.eventpackets.EventPacket"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lot0/a;

    invoke-virtual {v2}, Lot0/a;->getTimestamp()Lfk2/a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v3}, Lcom/whoop/puffin/sync/a;->d(Lfk2/a;)Lf52/j;

    move-result-object v3

    move-object v4, v1

    new-instance v1, Lpu0/d;

    move-object v5, v4

    invoke-virtual {v3}, Lf52/j;->a()I

    move-result v4

    invoke-virtual {v3}, Lf52/j;->b()I

    move-result v3

    invoke-virtual {v2}, Llt0/c;->N()B

    move-result v6

    invoke-virtual {v5}, Llt0/k;->a()Lmt0/b;

    move-result-object v2

    invoke-virtual {v2}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v7

    const/4 v9, 0x1

    const/4 v10, 0x0

    move v5, v3

    const-wide/16 v2, 0x0

    invoke-direct/range {v1 .. v10}, Lpu0/d;-><init>(JIIILjava/nio/ByteBuffer;Lpu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method
