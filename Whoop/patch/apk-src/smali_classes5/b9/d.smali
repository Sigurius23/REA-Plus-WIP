.class public final synthetic Lb9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Lb9/d;->w:I

    iput-object p1, p0, Lb9/d;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb9/d;->w:I

    const/16 v1, 0xa

    const/4 v2, 0x4

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    sget-object v1, Lko/q;->n:Lzr/w0;

    const-class v1, Lko/q;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lko/q;->t:Lko/q;

    if-nez v2, :cond_0

    new-instance v2, Lx8/m;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lx8/m;-><init>(Landroid/content/Context;I)V

    new-instance v4, Lko/q;

    iget-object v0, v2, Lx8/m;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/content/Context;

    iget-object v0, v2, Lx8/m;->d:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/HashMap;

    iget v7, v2, Lx8/m;->a:I

    iget-object v0, v2, Lx8/m;->e:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Llo/t;

    iget-boolean v9, v2, Lx8/m;->b:Z

    invoke-direct/range {v4 .. v9}, Lko/q;-><init>(Landroid/content/Context;Ljava/util/Map;ILlo/t;Z)V

    sput-object v4, Lko/q;->t:Lko/q;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lko/q;->t:Lko/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v1, Lio/m;

    invoke-direct {v1, v0}, Lio/m;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v1, Lsn/j;

    new-instance v2, Lwm/g;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, v0, v2}, Lsn/j;-><init>(Landroid/content/Context;Lwm/g;)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v1, Lq3/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lq3/i;->w:Ljava/lang/Object;

    new-instance v0, Lg73/d;

    invoke-direct {v0, v2}, Lg73/d;-><init>(I)V

    iput-object v0, v1, Lq3/i;->x:Ljava/lang/Object;

    return-object v1

    :pswitch_3
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    sget-object v3, Lp9/f;->p:Lzr/w0;

    const-class v3, Lp9/f;

    monitor-enter v3

    :try_start_2
    sget-object v4, Lp9/f;->v:Lp9/f;

    if-nez v4, :cond_2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_2
    new-instance v5, Ljava/util/HashMap;

    const/16 v6, 0x8

    invoke-direct {v5, v6}, Ljava/util/HashMap;-><init>(I)V

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-wide/32 v7, 0xf4240

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lp9/f;

    invoke-direct {v1, v0, v5}, Lp9/f;-><init>(Landroid/content/Context;Ljava/util/HashMap;)V

    sput-object v1, Lp9/f;->v:Lp9/f;

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    sget-object v0, Lp9/f;->v:Lp9/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    return-object v0

    :goto_4
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :pswitch_4
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v1, Lo9/q;

    invoke-direct {v1, v0}, Lo9/q;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_5
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v2, Ll9/p;

    new-instance v3, Lt9/l;

    invoke-direct {v3}, Lt9/l;-><init>()V

    new-instance v4, Lpg3/o;

    invoke-direct {v4, v0, v1}, Lpg3/o;-><init>(Landroid/content/Context;I)V

    invoke-direct {v2, v4, v3}, Ll9/p;-><init>(Lz8/e;Lt9/l;)V

    return-object v2

    :pswitch_6
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_7
    iget-object v0, p0, Lb9/d;->x:Landroid/content/Context;

    invoke-static {v0}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
