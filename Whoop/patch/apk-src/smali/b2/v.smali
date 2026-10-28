.class public abstract Lb2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/n;


# instance fields
.field public E:Lb2/v;

.field public F:Lb2/v;

.field public G:La3/x1;

.field public H:Landroidx/compose/ui/node/NodeCoordinator;

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Lr5/c;

.field public N:Z

.field public w:Lb2/v;

.field public x:Lhc3/d;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lb2/v;->w:Lb2/v;

    const/4 v0, -0x1

    iput v0, p0, Lb2/v;->z:I

    return-void
.end method


# virtual methods
.method public final L0()Lbc3/c0;
    .locals 3

    iget-object v0, p0, Lb2/v;->x:Lhc3/d;

    if-nez v0, :cond_0

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getCoroutineContext()Lq83/j;

    move-result-object v1

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {v0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Lb2/v;->x:Lhc3/d;

    :cond_0
    return-object v0
.end method

.method public M0()Z
    .locals 1

    instance-of v0, p0, Lf0/n;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public N0()V
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    const-string v0, "node attached multiple times"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "attach invoked on a node without a coordinator"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb2/v;->N:Z

    iput-boolean v0, p0, Lb2/v;->K:Z

    return-void
.end method

.method public O0()V
    .locals 2

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot detach a node that is not attached"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lb2/v;->K:Z

    if-eqz v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Lb2/v;->L:Z

    if-eqz v0, :cond_2

    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb2/v;->N:Z

    iget-object v0, p0, Lb2/v;->x:Lhc3/d;

    if-eqz v0, :cond_3

    new-instance v1, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;

    invoke-direct {v1}, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;-><init>()V

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lb2/v;->x:Lhc3/d;

    :cond_3
    return-void
.end method

.method public P0()V
    .locals 0

    return-void
.end method

.method public Q0()V
    .locals 0

    return-void
.end method

.method public R0()V
    .locals 0

    return-void
.end method

.method public S0()V
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "reset() called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lb2/v;->R0()V

    return-void
.end method

.method public T0()V
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lb2/v;->K:Z

    if-nez v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb2/v;->K:Z

    invoke-virtual {p0}, Lb2/v;->P0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb2/v;->L:Z

    return-void
.end method

.method public U0()V
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "node detached multiple times"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "detach invoked on a node without a coordinator"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lb2/v;->L:Z

    if-nez v0, :cond_2

    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb2/v;->L:Z

    iget-object v0, p0, Lb2/v;->M:Lr5/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lr5/c;->invoke()Ljava/lang/Object;

    :cond_3
    invoke-virtual {p0}, Lb2/v;->Q0()V

    return-void
.end method

.method public V0(Lb2/v;)V
    .locals 0

    iput-object p1, p0, Lb2/v;->w:Lb2/v;

    return-void
.end method

.method public W0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 0

    iput-object p1, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    return-void
.end method
