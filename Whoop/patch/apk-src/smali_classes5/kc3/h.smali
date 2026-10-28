.class public abstract Lkc3/h;
.super Lbc3/c1;
.source "SourceFile"


# instance fields
.field public w:Lkc3/c;


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lkc3/h;->w:Lkc3/c;

    const/4 v0, 0x6

    invoke-static {p1, p2, v0}, Lkc3/c;->i(Lkc3/c;Ljava/lang/Runnable;I)V

    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lkc3/h;->w:Lkc3/c;

    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Lkc3/c;->i(Lkc3/c;Ljava/lang/Runnable;I)V

    return-void
.end method

.method public final getExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lkc3/h;->w:Lkc3/c;

    return-object v0
.end method
