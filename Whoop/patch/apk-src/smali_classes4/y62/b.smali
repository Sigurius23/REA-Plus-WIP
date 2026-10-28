.class public final Ly62/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J&\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u001c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\nH\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Ly62/b;",
        "",
        "Ltr2/n;",
        "logger",
        "Lqu0/a;",
        "researchPacketDao",
        "Lmh2/a;",
        "strapMetadataDaoInteractor",
        "<init>",
        "(Ltr2/n;Lqu0/a;Lmh2/a;)V",
        "",
        "Lnt0/h;",
        "",
        "versionId",
        "Lru0/a;",
        "d",
        "(Ljava/util/List;I)Ljava/util/List;",
        "Loh2/a;",
        "acquisitionInfo",
        "packets",
        "",
        "c",
        "(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "revision",
        "numberOfPackets",
        "b",
        "(IILq83/d;)Ljava/lang/Object;",
        "packetsToDelete",
        "Ll83/a0;",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lqu0/a;",
        "Lmh2/a;",
        "research-packet_release"
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
.field private final a:Ltr2/n;

.field private final b:Lqu0/a;

.field private final c:Lmh2/a;


# direct methods
.method public constructor <init>(Ltr2/n;Lqu0/a;Lmh2/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "researchPacketDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapMetadataDaoInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly62/b;->a:Ltr2/n;

    iput-object p2, p0, Ly62/b;->b:Lqu0/a;

    iput-object p3, p0, Ly62/b;->c:Lmh2/a;

    return-void
.end method

.method private final d(Ljava/util/List;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnt0/h;",
            ">;I)",
            "Ljava/util/List<",
            "Lru0/a;",
            ">;"
        }
    .end annotation

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

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnt0/h;

    invoke-virtual {v1}, Llt0/b;->Y()Lfk2/a;

    move-result-object v2

    invoke-virtual {v2}, Lfk2/a;->j()J

    move-result-wide v5

    invoke-virtual {v1}, Llt0/b;->U()S

    move-result v4

    invoke-virtual {v1}, Lnt0/h;->d0()Ljava/nio/ByteBuffer;

    move-result-object v7

    new-instance v3, Lru0/a;

    move v8, p2

    invoke-direct/range {v3 .. v8}, Lru0/a;-><init>(IJLjava/nio/ByteBuffer;I)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lru0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ly62/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly62/b$a;

    iget v1, v0, Ly62/b$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly62/b$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly62/b$a;

    invoke-direct {v0, p0, p2}, Ly62/b$a;-><init>(Ly62/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ly62/b$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly62/b$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly62/b$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Ly62/b;->b:Lqu0/a;

    const/4 v2, 0x0

    iput-object v2, v0, Ly62/b$a;->w:Ljava/lang/Object;

    iput v3, v0, Ly62/b$a;->z:I

    invoke-interface {p2, p1, v0}, Lqu0/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_0
    iget-object p1, p0, Ly62/b;->a:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Error deleting research-packets from database"

    invoke-interface {p1, v0, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(IILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lru0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ly62/b$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ly62/b$b;

    iget v1, v0, Ly62/b$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly62/b$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly62/b$b;

    invoke-direct {v0, p0, p3}, Ly62/b$b;-><init>(Ly62/b;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ly62/b$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly62/b$b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Ly62/b;->b:Lqu0/a;

    iput p1, v0, Ly62/b$b;->w:I

    iput p2, v0, Ly62/b$b;->x:I

    iput v3, v0, Ly62/b$b;->E:I

    invoke-interface {p3, p1, p2, v0}, Lqu0/a;->b(IILq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p3

    :goto_2
    iget-object p2, p0, Ly62/b;->a:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Could not read from research-packets database"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final c(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh2/a;",
            "Ljava/util/List<",
            "+",
            "Lnt0/h;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ly62/b$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ly62/b$c;

    iget v1, v0, Ly62/b$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly62/b$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly62/b$c;

    invoke-direct {v0, p0, p3}, Ly62/b$c;-><init>(Ly62/b;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ly62/b$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly62/b$c;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly62/b$c;->y:Ljava/lang/Object;

    check-cast p1, Loh2/d;

    iget-object p1, v0, Ly62/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/util/List;

    iget-object p1, v0, Ly62/b$c;->w:Ljava/lang/Object;

    check-cast p1, Loh2/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    :try_start_1
    invoke-static {p1}, Loh2/d;->i(Loh2/a;)Loh2/d;

    move-result-object p1

    iget-object p3, p0, Ly62/b;->c:Lmh2/a;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lmh2/a;->j(Loh2/d;)I

    move-result p1

    iget-object p3, p0, Ly62/b;->b:Lqu0/a;

    invoke-direct {p0, p2, p1}, Ly62/b;->d(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    iput-object v4, v0, Ly62/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Ly62/b$c;->x:Ljava/lang/Object;

    iput-object v4, v0, Ly62/b$c;->y:Ljava/lang/Object;

    iput p1, v0, Ly62/b$c;->z:I

    iput v3, v0, Ly62/b$c;->G:I

    invoke-interface {p3, v2, v0}, Lqu0/a;->c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_4

    return-object v1

    :catch_0
    iget-object p1, p0, Ly62/b;->a:Ltr2/n;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const-string p3, "Failed to save "

    const-string v0, " number of R19 research packets in the database"

    invoke-static {p2, p3, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v3, 0x0

    new-array p3, v3, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
