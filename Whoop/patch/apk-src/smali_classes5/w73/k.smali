.class public final Lw73/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ls73/a;


# instance fields
.field public final synthetic E:I

.field public final F:Ljava/lang/Object;

.field public final w:Ll73/d;

.field public x:Ln73/b;

.field public y:Ls73/a;

.field public z:Z


# direct methods
.method public constructor <init>(Ll73/d;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lw73/k;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/k;->w:Ll73/d;

    iput-object p2, p0, Lw73/k;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lw73/k;->E:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ln73/b;)V
    .locals 1

    iget-object v0, p0, Lw73/k;->x:Ln73/b;

    invoke-static {v0, p1}, Lq73/c;->c(Ln73/b;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lw73/k;->x:Ln73/b;

    instance-of v0, p1, Ls73/a;

    if-eqz v0, :cond_0

    check-cast p1, Ls73/a;

    iput-object p1, p0, Lw73/k;->y:Ls73/a;

    :cond_0
    iget-object p1, p0, Lw73/k;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    :cond_1
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lw73/k;->y:Ls73/a;

    invoke-interface {v0}, Ls73/e;->clear()V

    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lw73/k;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lw73/k;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lw73/k;->y:Ls73/a;

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onComplete()V
    .locals 1

    iget-boolean v0, p0, Lw73/k;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/k;->z:Z

    iget-object v0, p0, Lw73/k;->w:Ll73/d;

    invoke-interface {v0}, Ll73/d;->onComplete()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lw73/k;->z:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/k;->z:Z

    iget-object v0, p0, Lw73/k;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lw73/k;->E:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lw73/k;->z:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw73/k;->F:Ljava/lang/Object;

    check-cast v0, Lbu/c;

    iget-object v0, v0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper function returned a null value."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lw73/k;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw73/k;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    invoke-virtual {p0, p1}, Lw73/k;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lw73/k;->F:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw73/k;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw73/k;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    invoke-virtual {p0, p1}, Lw73/k;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lw73/k;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw73/k;->y:Ls73/a;

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw73/k;->F:Ljava/lang/Object;

    check-cast v1, Lbu/c;

    iget-object v1, v1, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper function returned a null value."

    invoke-static {v0, v1}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    :pswitch_0
    iget-object v0, p0, Lw73/k;->y:Ls73/a;

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lw73/k;->F:Ljava/lang/Object;

    check-cast v1, Lad3/z;

    iget-object v1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
