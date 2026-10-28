.class public final Lts1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lts1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000cJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001dR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lts1/b;",
        "Lts1/c;",
        "Lts1/a;",
        "labradorReadingResultDbManager",
        "<init>",
        "(Lts1/a;)V",
        "Ll83/a0;",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ldk0/j;",
        "r17",
        "f",
        "(Ldk0/j;)V",
        "",
        "dataSequenceNum",
        "",
        "",
        "labradorData",
        "e",
        "(JLjava/util/List;)V",
        "Lvs1/a;",
        "h",
        "()Lvs1/a;",
        "b",
        "a",
        "d",
        "()V",
        "",
        "c",
        "Lts1/a;",
        "",
        "Ljava/util/List;",
        "accumulatedPackets",
        "",
        "Ljava/util/Map;",
        "savePacketMap",
        "labrador_release"
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
.field private final a:Lts1/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldk0/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lts1/a;)V
    .locals 1

    const-string v0, "labradorReadingResultDbManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lts1/b;->a:Lts1/a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "synchronizedList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lts1/b;->b:Ljava/util/List;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "synchronizedMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lts1/b;->c:Ljava/util/Map;

    return-void
.end method

.method private final e(JLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lts1/b;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final f(Ldk0/j;)V
    .locals 7

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldk0/j;

    invoke-virtual {p1}, Ldk0/j;->Q()J

    move-result-wide v1

    invoke-virtual {v0}, Ldk0/j;->Q()J

    move-result-wide v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    cmp-long p1, v1, v3

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ldk0/j;->Q()J

    move-result-wide v0

    add-long/2addr v0, v5

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, v0, v1, p1}, Lts1/b;->e(JLjava/util/List;)V

    :cond_0
    return-void
.end method

.method private final g(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lts1/b;->a:Lts1/a;

    invoke-virtual {v0, p1}, Lts1/a;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final h()Lvs1/a;
    .locals 14

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldk0/j;

    iget-object v1, p0, Lts1/b;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Lts1/b$a;

    invoke-direct {v2}, Lts1/b$a;-><init>()V

    invoke-static {v1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    new-instance v2, Lvs1/a;

    invoke-virtual {v0}, Ldk0/j;->f0()S

    move-result v1

    int-to-float v3, v1

    sget-object v1, Lrk1/c;->Companion:Lrk1/c$a;

    invoke-virtual {v0}, Ldk0/j;->d0()S

    move-result v4

    invoke-virtual {v0}, Ldk0/j;->f0()S

    move-result v6

    invoke-virtual {v1, v4, v6}, Lrk1/c$a;->b(II)Lrk1/c;

    move-result-object v1

    invoke-virtual {v1}, Lrk1/c;->getCheckResult()I

    move-result v4

    invoke-virtual {v0}, Llt0/b;->Y()Lfk2/a;

    move-result-object v0

    invoke-virtual {v0}, Lfk2/a;->j()J

    move-result-wide v6

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v8, 0x0

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lvs1/a;-><init>(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ldk0/j;)V
    .locals 7

    const-string v0, "r17"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ldk0/j;->Q()J

    move-result-wide v2

    invoke-virtual {p1}, Ldk0/j;->c0()[S

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    array-length v4, p1

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, p1

    :goto_0
    if-ge v1, v4, :cond_0

    aget-short v5, p1, v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v2, v3, v0}, Lts1/b;->e(JLjava/util/List;)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lts1/b;->f(Ldk0/j;)V

    invoke-virtual {p1}, Ldk0/j;->Q()J

    move-result-wide v2

    invoke-virtual {p1}, Ldk0/j;->c0()[S

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v0

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v0

    :goto_1
    if-ge v1, v5, :cond_2

    aget-short v6, v0, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-direct {p0, v2, v3, v4}, Lts1/b;->e(JLjava/util/List;)V

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Lts1/b;->d()V

    invoke-direct {p0, p1}, Lts1/b;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p1, Lts1/b$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lts1/b$b;

    iget v1, v0, Lts1/b$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lts1/b$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lts1/b$b;

    invoke-direct {v0, p0, p1}, Lts1/b$b;-><init>(Lts1/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lts1/b$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lts1/b$b;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lts1/b$b;->w:Ljava/lang/Object;

    check-cast v0, Lvs1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lts1/b;->h()Lvs1/a;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v2, p0, Lts1/b;->a:Lts1/a;

    const/4 v5, 0x0

    iput-object v5, v0, Lts1/b$b;->w:Ljava/lang/Object;

    iput v3, v0, Lts1/b$b;->x:I

    iput v4, v0, Lts1/b$b;->E:I

    invoke-virtual {v2, p1, v0}, Lts1/a;->f(Lvs1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lts1/b;->d()V

    move v3, v4

    :cond_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lts1/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lts1/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
