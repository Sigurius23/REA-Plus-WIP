.class public final synthetic Ll1/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Ll1/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll1/k0;->x:J

    iput-object p3, p0, Ll1/k0;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p4, p0, Ll1/k0;->w:I

    iput-object p1, p0, Ll1/k0;->y:Ljava/lang/Object;

    iput-wide p2, p0, Ll1/k0;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ll1/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Ll1/k0;->x:J

    iget-object v2, p0, Ll1/k0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lrr1/b;->g(JLjava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll1/k0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stories/c;

    iget-wide v1, p0, Ll1/k0;->x:J

    invoke-static {v0, v1, v2}, Lcom/whoop/stories/c;->n(Lcom/whoop/stories/c;J)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll1/k0;->y:Ljava/lang/Object;

    check-cast v0, Lle3/g;

    iget-wide v1, p0, Ll1/k0;->x:J

    monitor-enter v0

    :try_start_0
    iget-boolean v3, v0, Lle3/g;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    :goto_0
    monitor-exit v0

    goto :goto_2

    :cond_0
    :try_start_1
    iget-object v3, v0, Lle3/g;->l:Lle3/k;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v4, v0, Lle3/g;->x:Z

    const/4 v5, -0x1

    if-eqz v4, :cond_2

    iget v4, v0, Lle3/g;->w:I

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    move v4, v5

    :goto_1
    iget v6, v0, Lle3/g;->w:I

    const/4 v7, 0x1

    add-int/2addr v6, v7

    iput v6, v0, Lle3/g;->w:I

    iput-boolean v7, v0, Lle3/g;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v6, 0x2

    const/4 v8, 0x0

    if-eq v4, v5, :cond_3

    new-instance v3, Ljava/net/SocketTimeoutException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "sent ping but didn\'t receive pong within "

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v9, v0, Lle3/g;->d:J

    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "ms (after "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v4, v7

    const-string v7, " successful ping/pongs)"

    invoke-static {v5, v4, v7}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3, v8, v6}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    goto :goto_2

    :cond_3
    :try_start_2
    sget-object v4, Lne3/l;->E:Lne3/l;

    const-string v5, "payload"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x9

    invoke-virtual {v3, v5, v4}, Lle3/k;->b(ILne3/l;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    invoke-static {v0, v3, v8, v6}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    :goto_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :goto_3
    monitor-exit v0

    throw v1

    :pswitch_2
    iget-object v0, p0, Ll1/k0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-wide v1, p0, Ll1/k0;->x:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
