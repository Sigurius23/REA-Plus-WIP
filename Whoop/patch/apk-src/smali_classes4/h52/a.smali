.class public final Lh52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lh52/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Lhu0/a;",
        "sensorDataPacketDao",
        "Lmh2/a;",
        "strapMetadataDaoInteractor",
        "<init>",
        "(Ltr2/n;Lhu0/a;Lmh2/a;)V",
        "",
        "Llt0/b;",
        "",
        "versionId",
        "Lhu0/d;",
        "b",
        "(Ljava/util/List;I)Ljava/util/List;",
        "Loh2/a;",
        "acquisitionInfo",
        "packetsList",
        "",
        "a",
        "(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lhu0/a;",
        "c",
        "Lmh2/a;",
        "pulseInformationPacket_release"
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

.field private final b:Lhu0/a;

.field private final c:Lmh2/a;


# direct methods
.method public constructor <init>(Ltr2/n;Lhu0/a;Lmh2/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorDataPacketDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapMetadataDaoInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh52/a;->a:Ltr2/n;

    iput-object p2, p0, Lh52/a;->b:Lhu0/a;

    iput-object p3, p0, Lh52/a;->c:Lmh2/a;

    return-void
.end method

.method private final b(Ljava/util/List;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Llt0/b;",
            ">;I)",
            "Ljava/util/List<",
            "Lhu0/d;",
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

    check-cast v1, Llt0/b;

    new-instance v2, Lhu0/d;

    invoke-virtual {v1}, Llt0/b;->Y()Lfk2/a;

    move-result-object v3

    invoke-virtual {v3}, Lfk2/a;->j()J

    move-result-wide v3

    invoke-virtual {v1}, Llt0/b;->U()S

    move-result v5

    invoke-virtual {v1}, Llt0/b;->S()Ljava/nio/ByteBuffer;

    move-result-object v6

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lhu0/d;-><init>(JILjava/nio/ByteBuffer;I)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh2/a;",
            "Ljava/util/List<",
            "+",
            "Llt0/b;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lh52/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh52/a$a;

    iget v1, v0, Lh52/a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh52/a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh52/a$a;

    invoke-direct {v0, p0, p3}, Lh52/a$a;-><init>(Lh52/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lh52/a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh52/a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh52/a$a;->y:Ljava/lang/Object;

    check-cast p1, Loh2/d;

    iget-object p1, v0, Lh52/a$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/util/List;

    iget-object p1, v0, Lh52/a$a;->w:Ljava/lang/Object;

    check-cast p1, Loh2/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

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

    iget-object p3, p0, Lh52/a;->c:Lmh2/a;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lmh2/a;->j(Loh2/d;)I

    move-result p1

    iget-object p3, p0, Lh52/a;->b:Lhu0/a;

    invoke-direct {p0, p2, p1}, Lh52/a;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    iput-object v4, v0, Lh52/a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lh52/a$a;->x:Ljava/lang/Object;

    iput-object v4, v0, Lh52/a$a;->y:Ljava/lang/Object;

    iput p1, v0, Lh52/a$a;->z:I

    iput v3, v0, Lh52/a$a;->G:I

    invoke-interface {p3, v2, v0}, Lhu0/a;->c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_4

    return-object v1

    :goto_1
    iget-object p3, p0, Lh52/a;->a:Ltr2/n;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const-string v0, "Failed to save "

    const-string v1, " number of PIP packets in the database"

    invoke-static {p2, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v3, 0x0

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p3, p2, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_4
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
