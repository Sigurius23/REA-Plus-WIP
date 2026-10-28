.class public final Lo8/c;
.super Landroidx/lifecycle/u0;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lro/d;

.field public c:Ljava/lang/Object;

.field public d:Lo8/d;


# direct methods
.method public constructor <init>(ILro/d;)V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    iput p1, p0, Lo8/c;->a:I

    iput-object p2, p0, Lo8/c;->b:Lro/d;

    iget-object v0, p2, Lro/d;->b:Lo8/c;

    if-nez v0, :cond_0

    iput-object p0, p2, Lro/d;->b:Lo8/c;

    iput p1, p2, Lro/d;->a:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "There is already a listener registered"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lo8/c;->b:Lro/d;

    invoke-virtual {v0}, Lro/d;->a()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lro/d;->e:Z

    iget-object v2, p0, Lo8/c;->d:Lo8/d;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lo8/c;->removeObserver(Landroidx/lifecycle/v0;)V

    iget-boolean v3, v2, Lo8/d;->x:Z

    if-eqz v3, :cond_0

    iget-object v3, v2, Lo8/d;->w:Lo8/a;

    invoke-interface {v3}, Lo8/a;->l()V

    :cond_0
    iget-object v3, v0, Lro/d;->b:Lo8/c;

    if-eqz v3, :cond_3

    if-ne v3, p0, :cond_2

    const/4 v3, 0x0

    iput-object v3, v0, Lro/d;->b:Lo8/c;

    if-eqz v2, :cond_1

    iget-boolean v2, v2, Lo8/d;->x:Z

    :cond_1
    iput-boolean v1, v0, Lro/d;->f:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lro/d;->d:Z

    iput-boolean v1, v0, Lro/d;->e:Z

    iput-boolean v1, v0, Lro/d;->g:Z

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attempting to unregister the wrong listener"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No listener register"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 7

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mId="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v1, p0, Lo8/c;->a:I

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v1, " mArgs="

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mLoader="

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Lo8/c;->b:Lro/d;

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v1, p0, Lo8/c;->b:Lro/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, v1, Lro/d;->a:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mListener="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v1, Lro/d;->b:Lo8/c;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-boolean v0, v1, Lro/d;->d:Z

    const/4 v4, 0x0

    const-string v5, "mStarted="

    if-nez v0, :cond_0

    iget-boolean v0, v1, Lro/d;->g:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v1, Lro/d;->d:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mContentChanged="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v1, Lro/d;->g:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mProcessingChange="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    :goto_0
    iget-boolean v0, v1, Lro/d;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, v1, Lro/d;->f:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAbandoned="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v1, Lro/d;->e:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mReset="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v1, Lro/d;->f:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    :cond_2
    iget-object v0, v1, Lro/d;->i:Lp8/a;

    const-string v6, " waiting="

    if-eqz v0, :cond_3

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTask="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v1, Lro/d;->i:Lp8/a;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v1, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    :cond_3
    iget-object v0, v1, Lro/d;->j:Lp8/a;

    if-eqz v0, :cond_4

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mCancellingTask="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v1, Lro/d;->j:Lp8/a;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v1, Lro/d;->j:Lp8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    :cond_4
    iget-object v0, p0, Lo8/c;->d:Lo8/d;

    if-eqz v0, :cond_5

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mCallbacks="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lo8/c;->d:Lo8/d;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Lo8/c;->d:Lo8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mDeliveredData="

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v0, Lo8/d;->x:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mData="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lo8/c;->b:Lro/d;

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x40

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v0, v1}, Ltx/f;->y(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->hasActiveObservers()Z

    move-result p1

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    iget-object v1, p0, Lo8/c;->d:Lo8/d;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-super {p0, v1}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_0
    return-void
.end method

.method public final e(Landroidx/lifecycle/g0;Lo8/a;)Lro/d;
    .locals 2

    new-instance v0, Lo8/d;

    iget-object v1, p0, Lo8/c;->b:Lro/d;

    invoke-direct {v0, v1, p2}, Lo8/d;-><init>(Lro/d;Lo8/a;)V

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    iget-object p2, p0, Lo8/c;->d:Lo8/d;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lo8/c;->removeObserver(Landroidx/lifecycle/v0;)V

    :cond_0
    iput-object p1, p0, Lo8/c;->c:Ljava/lang/Object;

    iput-object v0, p0, Lo8/c;->d:Lo8/d;

    return-object v1
.end method

.method public final onActive()V
    .locals 2

    iget-object v0, p0, Lo8/c;->b:Lro/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lro/d;->d:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lro/d;->f:Z

    iput-boolean v1, v0, Lro/d;->e:Z

    iget v1, v0, Lro/d;->k:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lro/d;->l:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lro/d;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lro/d;->a()V

    new-instance v1, Lp8/a;

    invoke-direct {v1, v0}, Lp8/a;-><init>(Lro/d;)V

    iput-object v1, v0, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Lro/d;->c()V

    goto :goto_0

    :pswitch_0
    iget-object v1, v0, Lro/d;->l:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->drainPermits()I

    invoke-virtual {v0}, Lro/d;->a()V

    new-instance v1, Lp8/a;

    invoke-direct {v1, v0}, Lp8/a;-><init>(Lro/d;)V

    iput-object v1, v0, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Lro/d;->c()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onInactive()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lo8/c;->b:Lro/d;

    iput-boolean v0, v1, Lro/d;->d:Z

    iget v0, v1, Lro/d;->k:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1}, Lro/d;->a()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final removeObserver(Landroidx/lifecycle/v0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lo8/c;->c:Ljava/lang/Object;

    iput-object p1, p0, Lo8/c;->d:Lo8/d;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo8/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo8/c;->b:Lro/d;

    invoke-static {v0, v1}, Ltx/f;->y(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
