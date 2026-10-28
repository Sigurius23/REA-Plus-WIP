.class public final Landroidx/lifecycle/x0;
.super Lbc3/z;
.source "SourceFile"


# instance fields
.field public final w:Landroidx/lifecycle/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lbc3/z;-><init>()V

    new-instance v0, Landroidx/lifecycle/n;

    invoke-direct {v0}, Landroidx/lifecycle/n;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x0;->w:Landroidx/lifecycle/n;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/x0;->w:Landroidx/lifecycle/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    invoke-virtual {v1, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-boolean v2, v0, Landroidx/lifecycle/n;->b:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Landroidx/lifecycle/n;->a:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v0, Landroidx/lifecycle/n;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroidx/lifecycle/n;->a()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot enqueue any more runnables"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    new-instance v2, Landroidx/lifecycle/m;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, p2}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/x0;->w:Landroidx/lifecycle/n;

    iget-boolean v1, p1, Landroidx/lifecycle/n;->b:Z

    if-nez v1, :cond_2

    iget-boolean p1, p1, Landroidx/lifecycle/n;->a:Z

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v0

    :goto_1
    xor-int/2addr p1, v0

    return p1
.end method
