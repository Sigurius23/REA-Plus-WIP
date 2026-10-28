.class public final synthetic La11/l;
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
    iput p1, p0, La11/l;->w:I

    iput-object p2, p0, La11/l;->x:Ljava/lang/Object;

    iput-object p3, p0, La11/l;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, La11/l;->w:I

    iput-object p1, p0, La11/l;->y:Ljava/lang/Object;

    iput-object p2, p0, La11/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, La11/l;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lkd1/l;

    invoke-static {v0, v2}, Lk71/z;->f(Lkotlin/jvm/functions/Function1;Lkd1/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v0, Lk71/m;

    iget-object v2, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lk71/j;->g(Lk71/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v0, Ljs1/h;

    iget-object v2, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Ljs1/l;->o(Ljs1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v0, Lh11/h;

    iget-object v2, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Ljs1/e;->h(Lh11/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lfm1/i;

    invoke-static {v0, v2}, Ljk2/i;->c(Lkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lik2/b;

    invoke-static {v0, v2}, Ljk2/e;->d(Lkotlin/jvm/functions/Function1;Lik2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->F(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;->a(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;->a(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultNotificationPermissionHandler$1;)La13/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->a(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v2}, Lim1/t0;->K(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v0, Lh01/q;

    iget-object v2, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lh01/p;->j(Lh01/q;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lf0/n;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, La3/p0;

    iget-object v3, v0, Lf0/n;->R:Li2/a1;

    iget-object v4, v2, La3/p0;->w:Lk2/b;

    invoke-interface {v4}, Lk2/e;->d()J

    move-result-wide v4

    invoke-virtual {v2}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, v2}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v2

    iput-object v2, v0, Lf0/n;->W:Li2/p0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_c
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Le6/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Le6/a;->w:Ljava/lang/String;

    invoke-static {v0, v2}, Ljc/x;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "getSharedPreferences(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_e
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_f
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, v0, Lce3/q;->w:Lce3/n;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lce3/d0;

    invoke-virtual {v3, v0, v2}, Lce3/n;->a(Lce3/q;Lce3/d0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lce3/p;

    iget-object v4, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v4, Lce3/d0;

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lce3/q;

    iget-object v7, v6, Lce3/q;->X:Lce3/z;

    monitor-enter v7

    :try_start_0
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, v6, Lce3/q;->S:Lce3/d0;

    new-instance v8, Lce3/d0;

    invoke-direct {v8}, Lce3/d0;-><init>()V

    invoke-virtual {v8, v0}, Lce3/d0;->b(Lce3/d0;)V

    invoke-virtual {v8, v4}, Lce3/d0;->b(Lce3/d0;)V

    iput-object v8, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v8}, Lce3/d0;->a()I

    move-result v4

    int-to-long v8, v4

    invoke-virtual {v0}, Lce3/d0;->a()I

    move-result v0

    int-to-long v10, v0

    sub-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v4, v8, v10

    if-eqz v4, :cond_1

    iget-object v0, v6, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v6, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-array v2, v3, [Lce3/y;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Lce3/y;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lce3/d0;

    const-string v10, "<set-?>"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v6, Lce3/q;->S:Lce3/d0;

    iget-object v11, v6, Lce3/q;->J:Lyd3/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v6, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " onSettings"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v15, La11/l;

    const/16 v0, 0xd

    invoke-direct {v15, v0, v6, v5}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v16, 0x6

    const-wide/16 v13, 0x0

    invoke-static/range {v11 .. v16}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, v6, Lce3/q;->X:Lce3/z;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Lce3/d0;

    invoke-virtual {v0, v5}, Lce3/z;->b(Lce3/d0;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_4
    sget-object v5, Lce3/a;->z:Lce3/a;

    invoke-virtual {v6, v5, v5, v0}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_1
    monitor-exit v7

    if-eqz v2, :cond_3

    array-length v0, v2

    :goto_2
    if-ge v3, v0, :cond_3

    aget-object v5, v2, v3

    monitor-enter v5

    :try_start_5
    iget-wide v6, v5, Lce3/y;->E:J

    add-long/2addr v6, v8

    iput-wide v6, v5, Lce3/y;->E:J

    if-lez v4, :cond_2

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_2
    monitor-exit v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catchall_2
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_3
    :try_start_6
    monitor-exit v6

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_4
    monitor-exit v7

    throw v0

    :pswitch_11
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lce3/q;

    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lce3/y;

    :try_start_7
    iget-object v0, v2, Lce3/q;->w:Lce3/n;

    invoke-virtual {v0, v3}, Lce3/n;->b(Lce3/y;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    sget-object v4, Lfe3/e;->a:Lfe3/e;

    sget-object v4, Lfe3/e;->a:Lfe3/e;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Http2Connection.Listener failure for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x4

    invoke-virtual {v4, v2, v5, v0}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_8
    sget-object v2, Lce3/a;->z:Lce3/a;

    invoke-virtual {v3, v2, v0}, Lce3/y;->c(Lce3/a;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_12
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/util/TrendKey;

    invoke-static {v0, v2}, Lc41/v5;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v0, Lc41/i3;

    iget-object v2, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lc41/m3;->a(Lc41/i3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lc41/x$a;

    invoke-static {v0, v2}, Lc41/n;->g(Lkotlin/jvm/functions/Function1;Lc41/x$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lcp0/t;

    invoke-static {v0, v2}, Lbp0/s;->C(Lbc3/c0;Lcp0/t;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Ldp0/g;

    invoke-static {v0, v2}, Lbp0/s;->y(Lbc3/c0;Ldp0/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lzo0/c;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Ldp0/g;

    invoke-static {v0, v2}, Lbp0/s;->w(Lzo0/c;Ldp0/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Ldp0/g;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-static {v0, v2}, Lbp0/s;->E(Ldp0/g;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lep0/e;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Ldp0/g;

    invoke-static {v0, v2}, Lbp0/s;->l(Lep0/e;Ldp0/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lyc3/g;

    iget-object v4, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v4, Lad3/c;

    const-string v5, "toLowerCase(...)"

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v7, v4, Lad3/c;->a:Lad3/i;

    iget-boolean v7, v7, Lad3/i;->m:Z

    if-eqz v7, :cond_4

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v7

    sget-object v8, Lyc3/j;->a:Lyc3/j;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v7, 0x1

    goto :goto_6

    :cond_4
    move v7, v3

    :goto_6
    invoke-static {v4, v0}, Lbd3/q;->s(Lad3/c;Lyc3/g;)Lad3/v;

    move-result-object v4

    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result v8

    move v9, v3

    :goto_7
    if-ge v9, v8, :cond_c

    invoke-interface {v0, v9}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Lad3/u;

    if-eqz v13, :cond_5

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_6
    invoke-static {v11}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lad3/u;

    if-eqz v10, :cond_8

    invoke-interface {v10}, Lad3/u;->names()[Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    array-length v11, v10

    move v12, v3

    :goto_9
    if-ge v12, v11, :cond_8

    aget-object v13, v10, v12

    if-eqz v7, :cond_7

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    invoke-static {v6, v0, v13, v9}, Lbd3/q;->f(Ljava/util/LinkedHashMap;Lyc3/g;Ljava/lang/String;I)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_9

    :cond_8
    if-eqz v7, :cond_9

    invoke-interface {v0, v9}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_9
    if-eqz v4, :cond_a

    invoke-interface {v0, v9}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v0, v10}, Lad3/v;->a(Lyc3/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_a

    :cond_a
    move-object v10, v2

    :goto_a
    if-eqz v10, :cond_b

    invoke-static {v6, v0, v10, v9}, Lbd3/q;->f(Ljava/util/LinkedHashMap;Lyc3/g;Ljava/lang/String;I)V

    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_c
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v6, Lm83/z;->w:Lm83/z;

    :cond_d
    return-object v6

    :pswitch_1b
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, Lj71/c;

    invoke-static {v0, v2}, Lb61/k;->e(Lkotlin/jvm/functions/Function1;Lj71/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, v1, La11/l;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, La11/l;->y:Ljava/lang/Object;

    check-cast v2, La11/b;

    invoke-static {v0, v2}, La11/q;->j(Lkotlin/jvm/functions/Function1;La11/b;)Ll83/a0;

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
