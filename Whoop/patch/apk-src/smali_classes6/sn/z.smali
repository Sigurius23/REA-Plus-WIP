.class public final Lsn/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lsn/v;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    return-void

    .line 3
    :pswitch_0
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lsn/z;->a:I

    iput-object p3, p0, Lsn/z;->b:Lsn/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 3

    invoke-static {p1, p2}, Llo/y;->G(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    return-wide p1
.end method

.method public b(Ll9/y;)V
    .locals 5

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/y;

    iget-object v2, v1, Lsn/y;->b:Lsn/a0;

    iget-object v1, v1, Lsn/y;->a:Landroid/os/Handler;

    new-instance v3, Landroidx/fragment/app/d;

    const/16 v4, 0x15

    invoke-direct {v3, p0, v2, p1, v4}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v3}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V
    .locals 10

    new-instance v0, Ll9/y;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v6

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lsn/z;->d(Lsn/m;Ll9/y;)V

    return-void
.end method

.method public d(Lsn/m;Ll9/y;)V
    .locals 8

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/y;

    iget-object v4, v1, Lsn/y;->b:Lsn/a0;

    iget-object v1, v1, Lsn/y;->a:Landroid/os/Handler;

    new-instance v2, Lsn/x;

    const/4 v7, 0x2

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lsn/x;-><init>(Lsn/z;Lsn/a0;Lsn/m;Ll9/y;I)V

    invoke-static {v1, v2}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V
    .locals 10

    new-instance v0, Ll9/y;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v6

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lsn/z;->f(Lsn/m;Ll9/y;)V

    return-void
.end method

.method public f(Lsn/m;Ll9/y;)V
    .locals 8

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/y;

    iget-object v4, v1, Lsn/y;->b:Lsn/a0;

    iget-object v1, v1, Lsn/y;->a:Landroid/os/Handler;

    new-instance v2, Lsn/x;

    const/4 v7, 0x1

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lsn/x;-><init>(Lsn/z;Lsn/a0;Lsn/m;Ll9/y;I)V

    invoke-static {v1, v2}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    new-instance v0, Ll9/y;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v6

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    move-object/from16 p2, p11

    move/from16 p3, p12

    invoke-virtual {p0, p1, v0, p2, p3}, Lsn/z;->h(Lsn/m;Ll9/y;Ljava/io/IOException;Z)V

    return-void
.end method

.method public h(Lsn/m;Ll9/y;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/y;

    iget-object v4, v1, Lsn/y;->b:Lsn/a0;

    iget-object v1, v1, Lsn/y;->a:Landroid/os/Handler;

    new-instance v2, Lb9/x0;

    const/4 v9, 0x1

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v9}, Lb9/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/IOException;ZI)V

    invoke-static {v1, v2}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V
    .locals 10

    new-instance v0, Ll9/y;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v6

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lsn/z;->j(Lsn/m;Ll9/y;)V

    return-void
.end method

.method public j(Lsn/m;Ll9/y;)V
    .locals 8

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/y;

    iget-object v4, v1, Lsn/y;->b:Lsn/a0;

    iget-object v1, v1, Lsn/y;->a:Landroid/os/Handler;

    new-instance v2, Lsn/x;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lsn/x;-><init>(Lsn/z;Lsn/a0;Lsn/m;Ll9/y;I)V

    invoke-static {v1, v2}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(Ll9/y;)V
    .locals 8

    iget-object v3, p0, Lsn/z;->b:Lsn/v;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/y;

    iget-object v2, v0, Lsn/y;->b:Lsn/a0;

    iget-object v7, v0, Lsn/y;->a:Landroid/os/Handler;

    new-instance v0, Lbv/a;

    const/4 v5, 0x4

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lbv/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v7, v0}, Llo/y;->C(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
