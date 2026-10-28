.class public final synthetic Lui0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lui0/q;->w:I

    iput-object p2, p0, Lui0/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lui0/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lui0/q;->w:I

    iput-object p1, p0, Lui0/q;->y:Ljava/lang/Object;

    iput-object p2, p0, Lui0/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lui0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lso1/n0;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lwo1/p0;->j(Lso1/n0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lso1/e0;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lwo1/j0;->a(Lso1/e0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lwo1/c;

    invoke-static {v0, v1}, Lwo1/f;->f(Lkotlin/jvm/functions/Function1;Lwo1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lqy0/a;

    invoke-static {v0, v1}, Lwo1/b;->b(Lkotlin/jvm/functions/Function1;Lqy0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lwc3/g;

    sget-object v2, Lyc3/c;->b:Lyc3/c;

    const/4 v3, 0x0

    new-array v3, v3, [Lyc3/g;

    new-instance v4, Lwc3/f;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lwc3/f;-><init>(Lwc3/g;I)V

    invoke-static {v0, v2, v3, v4}, Lvf3/b;->d(Ljava/lang/String;Lyc3/k;[Lyc3/g;Lkotlin/jvm/functions/Function1;)Lyc3/h;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lwc/m0;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lwd/l;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Resolving credentials from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lwd/l;->a()Lrv/n;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, v1, Lwd/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "named source "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v1, Lwd/d;

    invoke-virtual {v1}, Lwd/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, v1, Lwd/a;

    if-eqz v0, :cond_1

    const-string v0, "static credentials"

    goto :goto_0

    :cond_1
    instance-of v0, v1, Lwd/g;

    if-eqz v0, :cond_2

    const-string v0, "web identity token"

    goto :goto_0

    :cond_2
    instance-of v0, v1, Lwd/f;

    if-eqz v0, :cond_3

    const-string v0, "single sign-on (session)"

    goto :goto_0

    :cond_3
    instance-of v0, v1, Lwd/b;

    if-eqz v0, :cond_4

    const-string v0, "single sign-on (legacy)"

    goto :goto_0

    :cond_4
    instance-of v0, v1, Lwd/c;

    if-eqz v0, :cond_5

    const-string v0, "aws login"

    goto :goto_0

    :cond_5
    instance-of v0, v1, Lwd/e;

    if-eqz v0, :cond_6

    const-string v0, "process"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_5
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Ly61/a;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lw61/c;->c(Ly61/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lu60/c$d;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lw60/e;->b(Lu60/c$d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lw11/c;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lw11/b;->g(Lw11/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lvz0/b;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lvz0/a;->b(Lvz0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1}, Lvy1/b;->j(Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Ltp1/e;

    invoke-static {v0, v1}, Lvp1/d;->a(Lkotlin/jvm/functions/Function1;Ltp1/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lol0/c$a;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lvl0/d;->i(Lol0/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lvh2/e;

    invoke-static {v0, v1}, Lvh2/e;->f(Ljava/util/concurrent/atomic/AtomicLong;Lvh2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lvh/d;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/b0;

    iget-object v2, v0, Lvh/d;->a:Lsh/q;

    iget-boolean v3, v0, Lvh/d;->c:Z

    if-eqz v3, :cond_8

    invoke-interface {v2}, Lsh/q;->d1()Lne3/j;

    move-result-object v3

    sget-object v4, Lvh/e;->b:Lne3/l;

    const-wide/16 v5, 0x0

    invoke-interface {v3, v5, v6, v4}, Lne3/j;->d0(JLne3/l;)Z

    move-result v4

    if-nez v4, :cond_7

    sget-object v4, Lvh/e;->a:Lne3/l;

    invoke-interface {v3, v5, v6, v4}, Lne3/j;->d0(JLne3/l;)Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    new-instance v3, Lwh/a;

    invoke-interface {v2}, Lsh/q;->d1()Lne3/j;

    move-result-object v4

    invoke-direct {v3, v4}, Lwh/a;-><init>(Lne3/j;)V

    invoke-static {v3}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v3

    invoke-interface {v2}, Lsh/q;->getFileSystem()Lne3/p;

    move-result-object v2

    invoke-static {v3, v2}, Ls2/d;->h(Lne3/j;Lne3/p;)Lsh/s;

    move-result-object v2

    :cond_8
    :try_start_0
    iget-object v3, v0, Lvh/d;->b:Lfi/o;

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, La4/a;->E(Lsh/q;Lfi/o;Z)Landroid/graphics/ImageDecoder$Source;

    move-result-object v3

    if-nez v3, :cond_a

    invoke-interface {v2}, Lsh/q;->d1()Lne3/j;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v4, 0x7fffffffffffffffL

    :try_start_1
    invoke-interface {v3, v4, v5}, Lne3/j;->request(J)Z

    invoke-interface {v3}, Lne3/j;->f()Lne3/h;

    move-result-object v4

    iget-wide v4, v4, Lne3/h;->x:J

    long-to-int v4, v4

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    :goto_1
    invoke-interface {v3}, Lne3/j;->f()Lne3/h;

    move-result-object v5

    invoke-virtual {v5}, Lne3/h;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v3}, Lne3/j;->f()Lne3/h;

    move-result-object v5

    invoke-virtual {v5, v4}, Lne3/h;->read(Ljava/nio/ByteBuffer;)I

    goto :goto_1

    :cond_9
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    invoke-static {v4}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {v3, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    :goto_2
    new-instance v4, Lsh/w;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v1, v5}, Lsh/w;-><init>(Lsh/k;Lkotlin/jvm/internal/b0;I)V

    invoke-static {v3, v4}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v1, 0x0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v0

    :goto_3
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {v2, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :pswitch_e
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lte0/h;

    invoke-static {v0, v1}, Lve0/e;->d(Lkotlin/jvm/functions/Function1;Lte0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lte0/b;

    invoke-static {v0, v1}, Lve0/e;->y(Lkotlin/jvm/functions/Function1;Lte0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lv80/c;

    invoke-static {v0, v1}, Lv80/b;->j(Lkotlin/jvm/functions/Function1;Lv80/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lv71/c;

    invoke-static {v0, v1}, Lv71/b;->a(Lkotlin/jvm/functions/Function1;Lv71/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/components/StreaksTileViewState;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/components/StreaksTileKt;->c(Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/components/ReferralsTileViewState;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/components/ReferralsTileKt;->k(Lcom/whoop/profile/view/components/ReferralsTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/components/ContextHubTileViewState;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/components/ContextHubTileKt;->b(Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v0, Lv21/c;

    iget-object v1, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lv21/b;->a(Lv21/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lv01/d;

    invoke-static {v0, v1}, Lv01/c;->f(Lkotlin/jvm/functions/Function1;Lv01/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Luz1/u;

    invoke-static {v0, v1}, Luz1/t;->b(Lkotlin/jvm/functions/Function1;Luz1/u;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Luz1/r;

    invoke-static {v0, v1}, Luz1/q;->c(Lkotlin/jvm/functions/Function1;Luz1/r;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lux2/b;

    invoke-static {v0, v1}, Lux2/a;->f(Lkotlin/jvm/functions/Function1;Lux2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Leb/a0;

    invoke-static {v0, v1}, Luu2/w;->c(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Luu2/b0;

    invoke-static {v0, v1}, Luu2/l;->k(Lkotlin/jvm/functions/Function1;Luu2/b0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lui0/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lui0/q;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/p;

    invoke-static {v0, v1}, Lui0/r;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/archv2/feature/domain/p;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
