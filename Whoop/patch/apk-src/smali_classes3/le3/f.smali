.class public final Lle3/f;
.super Lyd3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc93/a;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lle3/f;->e:I

    iput-object p2, p0, Lle3/f;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lle3/g;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lle3/f;->e:I

    .line 3
    iput-object p1, p0, Lle3/f;->f:Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    iget-object p1, p1, Lle3/g;->n:Ljava/lang/String;

    .line 5
    const-string v1, " writer"

    .line 6
    invoke-static {p1, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lxd3/f;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lle3/f;->e:I

    iput-object p1, p0, Lle3/f;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p1}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    iget v0, p0, Lle3/f;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lle3/f;->f:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lle3/f;->f:Ljava/lang/Object;

    check-cast v0, Lxd3/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lxd3/f;->M:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lxd3/f;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    invoke-virtual {v0}, Lxd3/f;->o0()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    :try_start_2
    iput-boolean v1, v0, Lxd3/f;->O:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    invoke-virtual {v0}, Lxd3/f;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lxd3/f;->a0()V

    const/4 v2, 0x0

    iput v2, v0, Lxd3/f;->J:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    iput-boolean v1, v0, Lxd3/f;->P:Z

    iget-object v1, v0, Lxd3/f;->H:Lne3/h0;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_1
    new-instance v1, Lne3/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v1

    iput-object v1, v0, Lxd3/f;->H:Lne3/h0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    :goto_1
    monitor-exit v0

    const-wide/16 v0, -0x1

    return-wide v0

    :goto_2
    monitor-exit v0

    throw v1

    :pswitch_1
    iget-object v0, p0, Lle3/f;->f:Ljava/lang/Object;

    check-cast v0, Lle3/g;

    :try_start_5
    invoke-virtual {v0}, Lle3/g;->i()Z

    move-result v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x0

    goto :goto_3

    :catch_2
    move-exception v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    :cond_3
    const-wide/16 v0, -0x1

    :goto_3
    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
