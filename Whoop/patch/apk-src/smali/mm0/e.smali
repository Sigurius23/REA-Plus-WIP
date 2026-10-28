.class public final Lmm0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0008J\u0018\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0008J\u0010\u0010\u0012\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0017R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lmm0/e;",
        "Lmm0/a;",
        "<init>",
        "()V",
        "",
        "uri",
        "",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lmm0/b;",
        "b",
        "entry",
        "Ll83/a0;",
        "g",
        "(Lmm0/b;Lq83/d;)Ljava/lang/Object;",
        "scope",
        "a",
        "c",
        "f",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "i",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "",
        "Ljava/util/Map;",
        "entries",
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
.field private final a:Lmc3/a;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lmm0/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lmm0/e;->a:Lmc3/a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lmm0/e;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lmm0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmm0/e$b;

    iget v1, v0, Lmm0/e$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$b;

    invoke-direct {v0, p0, p2}, Lmm0/e$b;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmm0/e$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$b;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmm0/e$b;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lmm0/e$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lmm0/e$b;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$b;->y:I

    iput v3, v0, Lmm0/e$b;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmm0/b;

    invoke-virtual {v4}, Lmm0/b;->c()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_5
    invoke-static {v2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lmm0/e;->b:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lmm0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmm0/e$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmm0/e$d;

    iget v1, v0, Lmm0/e$d;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$d;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$d;

    invoke-direct {v0, p0, p2}, Lmm0/e$d;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmm0/e$d;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$d;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmm0/e$d;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lmm0/e$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$d;->w:Ljava/lang/Object;

    iput-object p2, v0, Lmm0/e$d;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$d;->y:I

    iput v3, v0, Lmm0/e$d;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Lmm0/e$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmm0/e$c;

    iget v1, v0, Lmm0/e$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$c;

    invoke-direct {v0, p0, p2}, Lmm0/e$c;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmm0/e$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$c;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmm0/e$c;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lmm0/e$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lmm0/e$c;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$c;->y:I

    iput v3, v0, Lmm0/e$c;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmm0/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmm0/e$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmm0/e$a;

    iget v1, v0, Lmm0/e$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$a;

    invoke-direct {v0, p0, p2}, Lmm0/e$a;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmm0/e$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$a;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmm0/e$a;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lmm0/e$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lmm0/e$a;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$a;->y:I

    iput v3, v0, Lmm0/e$a;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public f(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Lmm0/e$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmm0/e$e;

    iget v1, v0, Lmm0/e$e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$e;

    invoke-direct {v0, p0, p1}, Lmm0/e$e;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lmm0/e$e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lmm0/e$e;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$e;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$e;->x:I

    iput v3, v0, Lmm0/e$e;->E:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v1

    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v1
.end method

.method public g(Lmm0/b;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmm0/e$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmm0/e$g;

    iget v1, v0, Lmm0/e$g;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$g;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$g;

    invoke-direct {v0, p0, p2}, Lmm0/e$g;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmm0/e$g;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$g;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmm0/e$g;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lmm0/e$g;->w:Ljava/lang/Object;

    check-cast v0, Lmm0/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$g;->w:Ljava/lang/Object;

    iput-object p2, v0, Lmm0/e$g;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmm0/e$g;->y:I

    iput v3, v0, Lmm0/e$g;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lmm0/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public bridge h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lmm0/a;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmm0/e$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmm0/e$f;

    iget v1, v0, Lmm0/e$f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmm0/e$f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmm0/e$f;

    invoke-direct {v0, p0, p1}, Lmm0/e$f;-><init>(Lmm0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lmm0/e$f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmm0/e$f;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lmm0/e$f;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmm0/e;->a:Lmc3/a;

    iput-object p1, v0, Lmm0/e$f;->w:Ljava/lang/Object;

    iput v3, v0, Lmm0/e$f;->x:I

    iput v4, v0, Lmm0/e$f;->E:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Lmm0/e;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmm0/b;

    invoke-virtual {v2}, Lmm0/b;->a()Lne3/l;

    move-result-object v2

    invoke-virtual {v2}, Lne3/l;->d()I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_4
    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v3}, Ljava/lang/Integer;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v1

    :goto_3
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v1
.end method
