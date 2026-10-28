.class public final Lf53/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lqg3/d;

.field public final d:Lq/f;

.field public final e:Lc53/a;

.field public final f:La43/f;

.field public final g:Lz33/b;

.field public h:Lq/f;

.field public final i:Ll83/p;

.field public j:Lrb3/g;

.field public final k:Ljava/util/LinkedHashSet;

.field public final l:Lio/sentry/internal/debugmeta/c;

.field public m:Lbc3/c2;

.field public final n:Lx43/h;

.field public final o:La43/a;

.field public final p:Lf53/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lqg3/d;Lq/f;Lc53/a;La43/f;Lz33/b;)V
    .locals 6

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wssUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkStateProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf53/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lf53/j;->b:Ljava/lang/String;

    iput-object p3, p0, Lf53/j;->c:Lqg3/d;

    iput-object p4, p0, Lf53/j;->d:Lq/f;

    iput-object p5, p0, Lf53/j;->e:Lc53/a;

    iput-object p6, p0, Lf53/j;->f:La43/f;

    iput-object p7, p0, Lf53/j;->g:Lz33/b;

    const-string p1, "Video:Socket"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lf53/j;->i:Ll83/p;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    const/16 p2, 0xd

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lio/sentry/internal/debugmeta/c;-><init>(IB)V

    iput-object p1, p0, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    new-instance v0, Lx43/h;

    new-instance v2, Ld0/d;

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-direct {v2, p0, p3, p2}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v3, La6/e;

    const/4 p2, 0x3

    invoke-direct {v3, p0, p3, p2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v4, Lav/b;

    const/16 p2, 0xe

    invoke-direct {v4, p0, p2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    const/16 v5, 0x1f

    move-object v1, p5

    invoke-direct/range {v0 .. v5}, Lx43/h;-><init>(Lc53/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    iput-object v0, p0, Lf53/j;->n:Lx43/h;

    new-instance p2, Lx43/a;

    sget-object p3, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lt23/i3;->c:Lec3/h2;

    invoke-direct {p2, p3}, Lx43/a;-><init>(Lec3/f2;)V

    new-instance p3, Lx43/a;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p4

    iget-object p4, p4, Ly43/b;->e:Lec3/h2;

    invoke-direct {p3, p4}, Lx43/a;-><init>(Lec3/h2;)V

    filled-new-array {p2, p3}, [Lx43/a;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance p3, La43/a;

    invoke-direct {p3, p2, p1}, La43/a;-><init>(Ljava/util/List;Lio/sentry/internal/debugmeta/c;)V

    iput-object p3, p0, Lf53/j;->o:La43/a;

    new-instance p1, Lf53/f;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lf53/f;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lf53/j;->p:Lf53/f;

    return-void
.end method

.method public static final a(Lf53/j;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lf53/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf53/c;

    iget v1, v0, Lf53/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf53/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf53/c;

    invoke-direct {v0, p0, p1}, Lf53/c;-><init>(Lf53/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf53/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf53/c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lf53/c;->w:Lf53/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf53/j;->f:La43/f;

    iget-object v2, p0, Lf53/j;->o:La43/a;

    iput-object p0, v0, Lf53/c;->w:Lf53/j;

    iput v3, v0, Lf53/c;->z:I

    invoke-virtual {p1, v2, v0}, La43/f;->a(La43/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Lf53/j;->g:Lz33/b;

    iget-object p0, p0, Lf53/j;->p:Lf53/f;

    invoke-virtual {p1, p0}, Lz33/b;->e(Lf53/f;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Lf53/j;Lx43/m;Ld30/o;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lf53/j;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[handleError] error: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p1, Lx43/m;->a:Ln23/e;

    instance-of v1, v0, Ln23/c;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_2

    check-cast v0, Ln23/c;

    invoke-virtual {p0, v0, p2}, Lf53/j;->h(Ln23/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    return-object v2

    :cond_2
    new-instance p2, Lf53/d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lf53/d;-><init>(Lx43/m;I)V

    invoke-virtual {p0, p2}, Lf53/j;->e(Lkotlin/jvm/functions/Function1;)V

    return-object v2
.end method

.method public static final c(Lf53/j;Lkotlin/jvm/internal/g0;Lrb3/g;Lb2/y;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lf53/j;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[reconnect] connectionConf: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p2, Lrb3/g;->a:Z

    invoke-static {p0, p1, p2, p3}, Lf53/j;->g(Lf53/j;Lkotlin/jvm/internal/g0;Lrb3/g;Lb2/y;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Lf53/j;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lf53/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf53/i;

    iget v1, v0, Lf53/i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf53/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf53/i;

    invoke-direct {v0, p0, p1}, Lf53/i;-><init>(Lf53/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf53/i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf53/i;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lf53/i;->w:Lf53/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf53/j;->f:La43/f;

    iget-object v2, p0, Lf53/j;->o:La43/a;

    iput-object p0, v0, Lf53/i;->w:Lf53/j;

    iput v3, v0, Lf53/i;->z:I

    invoke-virtual {p1, v2, v0}, La43/f;->b(La43/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Lf53/j;->g:Lz33/b;

    iget-object p0, p0, Lf53/j;->p:Lf53/f;

    invoke-virtual {p1, p0}, Lz33/b;->d(Lf53/f;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lf53/j;Lkotlin/jvm/internal/g0;Lrb3/g;Lb2/y;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Lf53/j;->f()Lb23/k;

    move-result-object v0

    iget-object v1, p0, Lf53/j;->e:Lc53/a;

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "[connectUser] connectionConf: "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lf53/a;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v5, v2}, Lf53/a;-><init>(Lf53/j;Lq83/d;I)V

    invoke-static {v1, v5, v5, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput-object p2, p0, Lf53/j;->j:Lrb3/g;

    iget-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Lf53/j;->g:Lz33/b;

    invoke-virtual {v0}, Lz33/b;->c()Z

    move-result v0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    iget-object p3, p0, Lf53/j;->d:Lq/f;

    const-string v0, "#coordinator"

    invoke-virtual {p3, p2, v0}, Lq/f;->n0(Lrb3/g;Ljava/lang/String;)Lq/f;

    move-result-object p2

    iget-object p3, p0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx43/k;

    invoke-virtual {v0}, Lx43/k;->e()V

    goto :goto_0

    :cond_2
    iget-object p3, p2, Lq/f;->z:Ljava/lang/Object;

    check-cast p3, Lec3/w1;

    invoke-static {p3}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p3

    new-instance v0, Ld30/o;

    const/16 v3, 0xd

    invoke-direct {v0, p0, v5, v3}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, p3, v0, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v3, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    move-result-object p3

    iput-object p3, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object p2, p0, Lf53/j;->h:Lq/f;

    return-object v2

    :cond_3
    if-nez v0, :cond_4

    iget-object p0, p0, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0, p3}, Lio/sentry/internal/debugmeta/c;->B(Ls83/i;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    return-object v2
.end method


# virtual methods
.method public final e(Lkotlin/jvm/functions/Function1;)V
    .locals 8

    iget-object v0, p0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx43/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt33/a;->a:Lbc3/w1;

    iget-object v4, p0, Lf53/j;->e:Lc53/a;

    new-instance v5, Lf53/b;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, p1, v2, v7, v6}, Lf53/b;-><init>(Lkotlin/jvm/functions/Function1;Lx43/k;Lq83/d;I)V

    const/4 v2, 0x2

    invoke-static {v4, v3, v7, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final f()Lb23/k;
    .locals 1

    iget-object v0, p0, Lf53/j;->i:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final h(Ln23/c;Ls83/c;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    instance-of v1, p2, Lf53/h;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lf53/h;

    iget v2, v1, Lf53/h;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lf53/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lf53/h;

    invoke-direct {v1, p0, p2}, Lf53/h;-><init>(Lf53/j;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lf53/h;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lf53/h;->E:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v5, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    iget-object p1, v1, Lf53/h;->x:Ln23/c;

    iget-object v3, v1, Lf53/h;->w:Lf53/j;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lu33/e;->y:Lt9/p;

    iget v3, p1, Ln23/c;->b:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lu33/e;->z:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    const-string v3, ""

    if-eqz p2, :cond_5

    iget-object p2, p0, Lf53/j;->c:Lqg3/d;

    iget-object p2, p2, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p2, Le53/d;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, p2, Le53/d;->a:Ljava/lang/Object;

    :cond_5
    iget p2, p1, Ln23/c;->b:I

    const/16 v7, 0x28

    if-ne p2, v7, :cond_7

    iget-object p2, p0, Lf53/j;->c:Lqg3/d;

    iget-object p2, p2, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p2, Le53/d;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, p2, Le53/d;->a:Ljava/lang/Object;

    iget-object p2, p0, Lf53/j;->c:Lqg3/d;

    iput-object p0, v1, Lf53/h;->w:Lf53/j;

    iput-object p1, v1, Lf53/h;->x:Ln23/c;

    iput v5, v1, Lf53/h;->E:I

    invoke-virtual {p2, v1}, Lqg3/d;->w(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v3, p0

    :goto_1
    check-cast p2, Ljava/lang/String;

    iget-object v5, v3, Lf53/j;->c:Lqg3/d;

    const-string v7, "token"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v5, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v5, Le53/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, v5, Le53/d;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_7
    move-object v3, p0

    :goto_2
    iget p2, p1, Ln23/c;->b:I

    sget-object v5, Lu33/e;->y:Lt9/p;

    const/16 v5, 0x3ef

    const/4 v7, 0x0

    if-ne p2, v5, :cond_8

    goto :goto_3

    :cond_8
    const/16 v5, 0x3ee

    if-ne p2, v5, :cond_9

    goto :goto_3

    :cond_9
    if-ne p2, v6, :cond_d

    :goto_3
    invoke-virtual {v3}, Lf53/j;->f()Lb23/k;

    move-result-object p2

    iget-object v4, p2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v8, p2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, p2, Lb23/k;->b:Lb23/j;

    iget-object p2, p2, Lb23/k;->a:Ljava/lang/String;

    iget v8, p1, Ln23/c;->b:I

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "One unrecoverable error happened. Error: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ". Error code: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v5, p2, v8, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object p2, v3, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    iput-object v7, v1, Lf53/h;->w:Lf53/j;

    iput-object v7, v1, Lf53/h;->x:Ln23/c;

    iput v6, v1, Lf53/h;->E:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Lio/sentry/internal/debugmeta/c;->z:I

    sput v3, Lio/sentry/internal/debugmeta/c;->E:I

    const/4 v3, 0x0

    sput v3, Lio/sentry/internal/debugmeta/c;->z:I

    invoke-virtual {p2}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "[onUnrecoverableError] error: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v3, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    invoke-virtual {p2}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p2

    new-instance v3, Lg53/v;

    invoke-direct {v3, p1}, Lg53/v;-><init>(Ln23/c;)V

    invoke-virtual {p2, v3, v1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_c

    goto :goto_4

    :cond_c
    move-object p1, v0

    :goto_4
    if-ne p1, v2, :cond_10

    goto :goto_6

    :cond_d
    iget-object p2, v3, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    iput-object v7, v1, Lf53/h;->w:Lf53/j;

    iput-object v7, v1, Lf53/h;->x:Ln23/c;

    iput v4, v1, Lf53/h;->E:I

    invoke-virtual {p2}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "[onNetworkError] error: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v3, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {p2}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p2

    new-instance v3, Lg53/q;

    invoke-direct {v3, p1}, Lg53/q;-><init>(Ln23/c;)V

    invoke-virtual {p2, v3, v1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_f

    goto :goto_5

    :cond_f
    move-object p1, v0

    :goto_5
    if-ne p1, v2, :cond_10

    :goto_6
    return-object v2

    :cond_10
    return-object v0
.end method
