.class public final Lik0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lik0/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\r\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R&\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00120\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u0013\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lik0/b;",
        "Lik0/d;",
        "<init>",
        "()V",
        "Lik0/c;",
        "record",
        "Ll83/a0;",
        "a",
        "(Lik0/c;Lq83/d;)Ljava/lang/Object;",
        "Lmj0/d;",
        "deviceId",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "c",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "Lec3/p1;",
        "",
        "b",
        "Lec3/p1;",
        "_records",
        "Lec3/f2;",
        "Lec3/f2;",
        "e",
        "()Lec3/f2;",
        "records",
        "_primaryDeviceId",
        "primaryDeviceId",
        "whoop-ble_release"
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

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final c:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final d:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final e:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lik0/b;->a:Lmc3/a;

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lik0/b;->b:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lik0/b;->c:Lec3/f2;

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lik0/b;->d:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lik0/b;->e:Lec3/f2;

    return-void
.end method


# virtual methods
.method public a(Lik0/c;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lik0/b$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lik0/b$c;

    iget v1, v0, Lik0/b$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lik0/b$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lik0/b$c;

    invoke-direct {v0, p0, p2}, Lik0/b$c;-><init>(Lik0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lik0/b$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lik0/b$c;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lik0/b$c;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lik0/b$c;->w:Ljava/lang/Object;

    check-cast v0, Lik0/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lik0/b;->a:Lmc3/a;

    iput-object p1, v0, Lik0/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lik0/b$c;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lik0/b$c;->y:I

    iput v3, v0, Lik0/b$c;->F:I

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
    iget-object v1, p0, Lik0/b;->b:Lec3/p1;

    :cond_4
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lik0/c;

    invoke-virtual {v7}, Lik0/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lik0/c;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lmj0/d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_6
    invoke-static {v0, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public b()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lik0/b;->e:Lec3/f2;

    return-object v0
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

    instance-of v0, p2, Lik0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lik0/b$b;

    iget v1, v0, Lik0/b$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lik0/b$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lik0/b$b;

    invoke-direct {v0, p0, p2}, Lik0/b$b;-><init>(Lik0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lik0/b$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lik0/b$b;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lik0/b$b;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lik0/b$b;->w:Ljava/lang/Object;

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

    iget-object p2, p0, Lik0/b;->a:Lmc3/a;

    iput-object p1, v0, Lik0/b$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lik0/b$b;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lik0/b$b;->y:I

    iput v3, v0, Lik0/b$b;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    :try_start_0
    iget-object v2, p0, Lik0/b;->b:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lik0/c;

    invoke-virtual {v3}, Lik0/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lmj0/d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_6
    :goto_2
    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :cond_7
    :goto_3
    :try_start_1
    iget-object v2, p0, Lik0/b;->d:Lec3/p1;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lmj0/d;->a(Ljava/lang/String;)Lmj0/d;

    move-result-object p1

    goto :goto_4

    :cond_8
    move-object p1, v1

    :goto_4
    check-cast v2, Lec3/h2;

    invoke-virtual {v2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :goto_5
    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p2, Lik0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lik0/b$a;

    iget v1, v0, Lik0/b$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lik0/b$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lik0/b$a;

    invoke-direct {v0, p0, p2}, Lik0/b$a;-><init>(Lik0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lik0/b$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lik0/b$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lik0/b$a;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lik0/b$a;->w:Ljava/lang/Object;

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

    iget-object p2, p0, Lik0/b;->a:Lmc3/a;

    iput-object p1, v0, Lik0/b$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lik0/b$a;->x:Ljava/lang/Object;

    iput v3, v0, Lik0/b$a;->y:I

    iput v4, v0, Lik0/b$a;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lik0/b;->b:Lec3/p1;

    :cond_4
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lik0/c;

    invoke-virtual {v8}, Lik0/c;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lmj0/d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    invoke-virtual {v2, v4, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v1, p0, Lik0/b;->d:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmj0/d;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lmj0/d;->g()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_7
    move-object v1, v0

    :goto_3
    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {v1, p1}, Lmj0/d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    :goto_4
    if-eqz v3, :cond_9

    iget-object p1, p0, Lik0/b;->d:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_5
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public e()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lik0/b;->c:Lec3/f2;

    return-object v0
.end method
