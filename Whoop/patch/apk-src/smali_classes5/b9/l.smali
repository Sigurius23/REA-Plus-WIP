.class public final Lb9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/p0;
.implements Llo/l;


# instance fields
.field public final E:Landroid/os/Handler$Callback;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Z

.field public y:Z

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb9/l0;Lx8/p;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/l;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lb9/l;->E:Landroid/os/Handler$Callback;

    .line 7
    new-instance p1, Lb9/l1;

    invoke-direct {p1, p2}, Lb9/l1;-><init>(Lx8/p;)V

    iput-object p1, p0, Lb9/l;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lb9/l;->x:Z

    return-void
.end method

.method public constructor <init>(Lrm/z;Llo/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb9/l;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb9/l;->E:Landroid/os/Handler$Callback;

    .line 3
    new-instance p1, Lb9/l1;

    invoke-direct {p1, p2}, Lb9/l1;-><init>(Llo/t;)V

    iput-object p1, p0, Lb9/l;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lb9/l;->x:Z

    return-void
.end method


# virtual methods
.method public a(Lb9/f;)V
    .locals 3

    invoke-virtual {p1}, Lb9/f;->i()Lb9/p0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v1, Lb9/p0;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    iput-object p1, p0, Lb9/l;->F:Ljava/lang/Object;

    iget-object p1, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast p1, Lb9/l1;

    iget-object p1, p1, Lb9/l1;->F:Ljava/lang/Object;

    check-cast p1, Lu8/e0;

    check-cast v0, Ld9/a0;

    invoke-virtual {v0, p1}, Ld9/a0;->d(Lu8/e0;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    const/4 v1, 0x2

    const/16 v2, 0x3e8

    invoke-direct {v0, v1, p1, v2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    throw v0

    :cond_1
    return-void
.end method

.method public b()Lrm/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Llo/l;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Llo/l;->b()Lrm/w0;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    .line 4
    iget-object v0, v0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v0, Lrm/w0;

    return-object v0
.end method

.method public b()Lu8/e0;
    .locals 1

    .line 5
    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Lb9/p0;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Lb9/p0;->b()Lu8/e0;

    move-result-object v0

    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    .line 8
    iget-object v0, v0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v0, Lu8/e0;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget v0, p0, Lb9/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lb9/l;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    invoke-virtual {v0}, Lb9/l1;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Llo/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Llo/l;->c()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :pswitch_0
    iget-boolean v0, p0, Lb9/l;->x:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    invoke-virtual {v0}, Lb9/l1;->c()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Lb9/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lb9/p0;->c()J

    move-result-wide v0

    :goto_1
    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lu8/e0;)V
    .locals 1

    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Lb9/p0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb9/p0;->d(Lu8/e0;)V

    iget-object p1, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast p1, Lb9/p0;

    invoke-interface {p1}, Lb9/p0;->b()Lu8/e0;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    invoke-virtual {v0, p1}, Lb9/l1;->d(Lu8/e0;)V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lb9/l;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Lb9/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lb9/p0;->e()Z

    move-result v0

    return v0
.end method

.method public f(Lrm/w0;)V
    .locals 1

    iget-object v0, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast v0, Llo/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Llo/l;->f(Lrm/w0;)V

    iget-object p1, p0, Lb9/l;->G:Ljava/lang/Object;

    check-cast p1, Llo/l;

    invoke-interface {p1}, Llo/l;->b()Lrm/w0;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    invoke-virtual {v0, p1}, Lb9/l1;->f(Lrm/w0;)V

    return-void
.end method
