.class public final Lve/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;
.implements Lxf/c;
.implements Ljava/io/Closeable;


# instance fields
.field public final w:[Lxf/c;


# direct methods
.method public varargs constructor <init>([Lve/f;)V
    .locals 1

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lxf/c;

    const-string v0, "providers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/g;->w:[Lxf/c;

    array-length p1, p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "at least one provider must be in the chain"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static h(Lve/g;Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lxf/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxf/d;

    iget v1, v0, Lxf/d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxf/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxf/d;

    invoke-direct {v0, p0, p2}, Lxf/d;-><init>(Lve/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxf/d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxf/d;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lxf/d;->w:Lrg/f;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lrg/d;->w:Lrg/d;

    const-class v2, Lve/g;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v2

    invoke-interface {v2}, Lmg/h;->d()Lrg/n;

    move-result-object v2

    check-cast v2, Lrg/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lds/q;->z(Lq83/j;)Lng/f;

    sget-object v2, Lrg/k;->a:Lrg/b;

    const-string v4, "ResolveIdentityChain"

    sget-object v5, Lgf/i;->w:Lgf/i;

    invoke-virtual {v2, v4, v5, p2}, Lrg/b;->a(Ljava/lang/String;Lgf/b;Lrg/d;)Lrg/f;

    move-result-object p2

    :try_start_1
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v4, Lmg/i;->x:Lg73/d;

    invoke-interface {v2, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lmg/i;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lmg/i;->s()Lmg/h;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Lmg/h;->b()Lng/d;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v2, Lng/a;->a:Lng/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object p0, p2

    goto :goto_6

    :catch_1
    move-exception p1

    move-object p0, p2

    goto :goto_4

    :cond_3
    move-object v2, v4

    :goto_1
    sget-object v5, Lq83/k;->w:Lq83/k;

    if-eqz v2, :cond_4

    :try_start_2
    new-instance v6, Lng/h;

    invoke-direct {v6, v2}, Lng/h;-><init>(Lng/f;)V

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v6, Lng/h;->x:Lng/f;

    invoke-interface {v2, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lng/h;

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    move-object v6, v5

    :goto_2
    new-instance v2, Lrg/i;

    invoke-direct {v2, p2}, Lrg/i;-><init>(Lrg/h;)V

    invoke-interface {v2, v6}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-interface {v2, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    new-instance v5, Lxf/e;

    invoke-direct {v5, p2, v4, p0, p1}, Lxf/e;-><init>(Lrg/f;Lq83/d;Lve/g;Lgf/b;)V

    iput-object p2, v0, Lxf/d;->w:Lrg/f;

    iput v3, v0, Lxf/d;->z:I

    invoke-static {v2, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p0, v1, :cond_6

    return-object v1

    :cond_6
    move-object v7, p2

    move-object p2, p0

    move-object p0, v7

    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2

    :goto_4
    :try_start_3
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_7

    const-string p2, "cancelled"

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p2, v0}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    sget-object p2, Lrg/e;->w:[Lrg/e;

    invoke-virtual {p0}, Lrg/f;->b()V

    invoke-static {p0, p1}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    :goto_5
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "withSpan<T> cannot be used on an anonymous object"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lve/g;->h(Lve/g;Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lve/g;->w:[Lxf/c;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    :try_start_0
    instance-of v5, v4, Ljava/io/Closeable;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    check-cast v4, Ljava/io/Closeable;

    goto :goto_1

    :catch_0
    move-exception v4

    move-object v6, v4

    goto :goto_2

    :cond_0
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_2
    if-eqz v6, :cond_2

    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    throw v1

    :cond_5
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v4, 0x0

    const/16 v5, 0x3e

    iget-object v0, p0, Lve/g;->w:[Lxf/c;

    const-string v1, " -> "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
