.class public final Landroidx/room/z1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILq83/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Landroidx/room/z1;->w:I

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/room/z1;->w:I

    iput-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget v0, p0, Landroidx/room/z1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lz53/g;

    const/16 v1, 0xc

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lnk/i;

    const/16 v1, 0xb

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lmk/a;

    const/16 v1, 0xa

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Llk/g;

    const/16 v1, 0x9

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/t;

    const/16 v1, 0x8

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lkk/b;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/work/CoroutineWorker;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance v0, Landroidx/room/z1;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Landroidx/room/z1;-><init>(ILq83/d;)V

    iput-object p1, v0, Landroidx/room/z1;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_8
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lf0/d0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Landroidx/room/z1;

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/i2;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/room/z1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lf63/c;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/z1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/z1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/z1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Landroidx/room/z1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lz53/g;

    iget-object v1, v0, Lz53/g;->z:Ll83/p;

    iget-object v2, v0, Lz53/g;->H:Ljava/util/Map;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Landroidx/room/z1;->x:I

    const-string v5, "null cannot be cast to non-null type java.io.Closeable"

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v6, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, v0, Lz53/g;->F:Lq83/j;

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lbc3/k1;

    iput v6, p0, Landroidx/room/z1;->x:I

    invoke-interface {p1, p0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v3, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/l0;

    iget-object v2, v0, Lud3/l0;->F:Lud3/q;

    invoke-virtual {v2}, Lud3/q;->a()V

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v0}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/z;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/io/Closeable;

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v3

    :goto_3
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lud3/l0;

    iget-object v3, v2, Lud3/l0;->F:Lud3/q;

    invoke-virtual {v3}, Lud3/q;->a()V

    iget-object v2, v2, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v2}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/z;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Lnk/i;

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-static {p1, p0}, Lnk/i;->a(Lnk/i;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_1
    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lmk/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Landroidx/room/z1;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_9

    if-ne v2, v4, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lmk/a;->E:Llk/g;

    if-eqz p1, :cond_c

    iput v4, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, p0}, Llk/g;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_8

    :cond_a
    :goto_7
    iget-object p1, v0, Lmk/a;->z:Lkk/b;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lkk/b;->g:Ldc3/l;

    new-instance v0, Lkk/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v3}, Lkk/f;-><init>(ILjk/a;)V

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v1

    :cond_b
    const-string p1, "pipeline"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_c
    const-string p1, "identifyInterceptor"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :pswitch_2
    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Llk/g;

    iget-object v1, v0, Llk/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Landroidx/room/z1;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_f

    if-eq v3, v5, :cond_e

    if-ne v3, v4, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_12

    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    iget-object p1, v0, Llk/g;->d:Lgj/g;

    iget-wide v6, p1, Lgj/g;->l:J

    iput v5, p0, Landroidx/room/z1;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_10

    goto :goto_b

    :cond_10
    :goto_9
    iput v4, p0, Landroidx/room/z1;->x:I

    invoke-virtual {v0, p0}, Llk/g;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_11

    goto :goto_b

    :cond_11
    :goto_a
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_12
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v2

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_14

    if-ne v1, v2, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/t;

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    move-object p1, v0

    :cond_15
    :goto_c
    return-object p1

    :pswitch_4
    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkk/b;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, Landroidx/room/z1;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_18

    if-ne v2, v4, :cond_17

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_16
    :goto_d
    move-object v0, v3

    goto :goto_f

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_e

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, v1, Lkk/b;->e:Lik/b;

    iput v4, p0, Landroidx/room/z1;->x:I

    invoke-interface {p1, p0}, Lik/b;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v0, :cond_16

    goto :goto_f

    :goto_e
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_19

    iget-object v0, v1, Lkk/b;->a:Lgj/d;

    iget-object v0, v0, Lgj/d;->k:Lfk/a;

    const-string v1, "Event storage file not found: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfk/a;->warn(Ljava/lang/String;)V

    goto :goto_d

    :cond_19
    const/4 p1, 0x0

    move-object v0, p1

    :goto_f
    return-object v0

    :pswitch_5
    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Landroidx/room/z1;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1b

    if-ne v2, v3, :cond_1a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lgj/d;->m:Lbc3/j0;

    iput v3, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1c

    goto :goto_13

    :cond_1c
    :goto_10
    iget-object p1, v0, Lgj/d;->g:Lgj/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lwe/o;->w:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkk/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lkk/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkk/e;

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lmk/a;

    const/4 v3, 0x0

    if-eqz v2, :cond_1f

    check-cast v1, Lmk/a;

    goto :goto_12

    :cond_1f
    move-object v1, v3

    :goto_12
    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Lmk/a;->d()Lgj/d;

    move-result-object v2

    iget-object v2, v2, Lgj/d;->c:Lbc3/c0;

    invoke-virtual {v1}, Lmk/a;->d()Lgj/d;

    move-result-object v4

    iget-object v4, v4, Lgj/d;->f:Lbc3/z;

    new-instance v5, Landroidx/room/z1;

    const/16 v6, 0xa

    invoke-direct {v5, v1, v3, v6}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x2

    invoke-static {v2, v4, v3, v5, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_11

    :cond_20
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_13
    return-object v1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_22

    if-ne v1, v2, :cond_21

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_21
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_22
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/work/CoroutineWorker;

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, p0}, Landroidx/work/CoroutineWorker;->doWork(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_23

    move-object p1, v0

    :cond_23
    :goto_14
    return-object p1

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_25

    if-ne v1, v2, :cond_24

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_25
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Lf63/c;

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-static {p1, p0}, Lv63/h;->f(Lw53/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_26

    goto :goto_16

    :cond_26
    :goto_15
    check-cast p1, Lw53/b;

    invoke-virtual {p1}, Lw53/b;->d()Lf63/c;

    move-result-object v0

    :goto_16
    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_28

    if-ne v1, v2, :cond_27

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_17

    :cond_27
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lkotlin/jvm/internal/e0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkotlin/jvm/internal/e0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lf0/d0;

    iget-object p1, v7, Lf0/d0;->O:Lj0/i;

    check-cast p1, Lj0/j;

    iget-object p1, p1, Lj0/j;->a:Lec3/w1;

    new-instance v3, Landroidx/room/b2;

    const/4 v8, 0x1

    invoke-direct/range {v3 .. v8}, Landroidx/room/b2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, v3, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_17
    return-object v0

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2a

    if-ne v1, v2, :cond_29

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :cond_29
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-static {p1, p0}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2b

    goto :goto_19

    :cond_2b
    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_19
    return-object v0

    :pswitch_a
    iget-object v0, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Landroidx/room/z1;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2d

    if-ne v2, v3, :cond_2c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_2c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, La6/l0;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v2}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, La6/c;

    const/4 v4, 0x0

    const/16 v5, 0xa

    invoke-direct {v2, v0, v4, v5}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, p1}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lch/g;

    invoke-direct {v2, v0}, Lch/g;-><init>(Lcoil/compose/AsyncImagePainter;)V

    iput v3, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, v2, p0}, Lfc3/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2e

    goto :goto_1b

    :cond_2e
    :goto_1a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1b
    return-object v1

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/z1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_30

    if-ne v1, v2, :cond_2f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_30
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/z1;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/room/i2;

    iput v2, p0, Landroidx/room/z1;->x:I

    invoke-virtual {p1, p0}, Landroidx/room/i2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_31

    goto :goto_1d

    :cond_31
    :goto_1c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1d
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
