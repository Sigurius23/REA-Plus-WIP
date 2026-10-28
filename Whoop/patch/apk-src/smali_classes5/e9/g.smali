.class public final Le9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Le9/g;->w:I

    iput-object p1, p0, Le9/g;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lp9/i;JJZ)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final p(Lp9/i;JJ)V
    .locals 12

    iget v0, p0, Le9/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Le9/g;->x:Ljava/lang/Object;

    check-cast p1, Le9/d;

    sget-object v1, Lq9/b;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lq9/b;->c:Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/util/ConcurrentModificationException;

    invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p1, Le9/d;->w:Le9/h;

    invoke-virtual {p1, v0}, Le9/h;->v(Ljava/io/IOException;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le9/d;->a()V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_0
    check-cast p1, Lp9/n;

    iget-object v0, p0, Le9/g;->x:Ljava/lang/Object;

    check-cast v0, Le9/h;

    new-instance v2, Ll9/t;

    iget-wide v3, p1, Lp9/n;->w:J

    iget-object v1, p1, Lp9/n;->z:Lz8/m;

    iget-object v1, v1, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Le9/h;->m:Ljc/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Le9/h;->q:Lg9/d;

    iget v3, p1, Lp9/n;->y:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Lg9/d;->d(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    iget-object p1, p1, Lp9/n;->F:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sub-long/2addr v1, p2

    iput-wide v1, v0, Le9/h;->L:J

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Le9/h;->w(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lp9/i;JJZ)V
    .locals 0

    iget p2, p0, Le9/g;->w:I

    packed-switch p2, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p1, Lp9/n;

    iget-object p2, p0, Le9/g;->x:Ljava/lang/Object;

    check-cast p2, Le9/h;

    invoke-virtual {p2, p1}, Le9/h;->u(Lp9/n;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Lp9/i;Ljava/io/IOException;I)Lbb/f;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    iget v1, v0, Le9/g;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Le9/g;->x:Ljava/lang/Object;

    check-cast v1, Le9/d;

    iget-object v1, v1, Le9/d;->w:Le9/h;

    invoke-virtual {v1, v12}, Le9/h;->v(Ljava/io/IOException;)V

    sget-object v1, Lp9/k;->z:Lbb/f;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lp9/n;

    iget-object v2, v0, Le9/g;->x:Ljava/lang/Object;

    move-object v14, v2

    check-cast v14, Le9/h;

    iget-object v2, v14, Le9/h;->q:Lg9/d;

    move-object v3, v2

    new-instance v2, Ll9/t;

    iget-wide v4, v1, Lp9/n;->w:J

    iget-object v4, v1, Lp9/n;->z:Lz8/m;

    iget-object v4, v4, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget v1, v1, Lp9/n;->y:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x1

    move-object v15, v3

    move v3, v1

    move-object v1, v15

    invoke-virtual/range {v1 .. v13}, Lg9/d;->e(Ll9/t;IILu8/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    iget-object v1, v14, Le9/h;->m:Ljc/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v14, v12}, Le9/h;->v(Ljava/io/IOException;)V

    sget-object v1, Lp9/k;->z:Lbb/f;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
