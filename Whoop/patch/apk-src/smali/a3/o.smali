.class public abstract La3/o;
.super Lb2/v;
.source "SourceFile"


# instance fields
.field public final O:I

.field public P:Lb2/v;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb2/v;-><init>()V

    invoke-static {p0}, La3/r1;->e(Lb2/v;)I

    move-result v0

    iput v0, p0, La3/o;->O:I

    return-void
.end method


# virtual methods
.method public final N0()V
    .locals 2

    invoke-super {p0}, Lb2/v;->N0()V

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0, v1}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lb2/v;->N0()V

    :cond_0
    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final O0()V
    .locals 1

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb2/v;->O0()V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lb2/v;->O0()V

    return-void
.end method

.method public final S0()V
    .locals 1

    invoke-super {p0}, Lb2/v;->S0()V

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb2/v;->S0()V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final T0()V
    .locals 1

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb2/v;->T0()V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lb2/v;->T0()V

    return-void
.end method

.method public final U0()V
    .locals 1

    invoke-super {p0}, Lb2/v;->U0()V

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb2/v;->U0()V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final V0(Lb2/v;)V
    .locals 1

    iput-object p1, p0, Lb2/v;->w:Lb2/v;

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lb2/v;->V0(Lb2/v;)V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final W0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iput-object p1, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final X0(La3/n;)La3/n;
    .locals 7

    move-object v0, p1

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    const/4 v1, 0x0

    if-eq v0, p1, :cond_3

    instance-of v2, p1, Lb2/v;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lb2/v;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    iget-object v1, v2, Lb2/v;->E:Lb2/v;

    :cond_1
    iget-object v2, p0, Lb2/v;->w:Lb2/v;

    if-ne v0, v2, :cond_2

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot delegate to an already delegated node"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-boolean v2, v0, Lb2/v;->N:Z

    if-eqz v2, :cond_4

    const-string v2, "Cannot delegate to an already attached node"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_4
    iget-object v2, p0, Lb2/v;->w:Lb2/v;

    invoke-virtual {v0, v2}, Lb2/v;->V0(Lb2/v;)V

    iget v2, p0, Lb2/v;->y:I

    invoke-static {v0}, La3/r1;->f(Lb2/v;)I

    move-result v3

    iput v3, v0, Lb2/v;->y:I

    iget v4, p0, Lb2/v;->y:I

    and-int/lit8 v5, v3, 0x2

    if-eqz v5, :cond_5

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_5

    instance-of v4, p0, La3/c0;

    if-nez v4, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "\nDelegate Node: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_5
    iget-object v4, p0, La3/o;->P:Lb2/v;

    iput-object v4, v0, Lb2/v;->F:Lb2/v;

    iput-object v0, p0, La3/o;->P:Lb2/v;

    iput-object p0, v0, Lb2/v;->E:Lb2/v;

    iget v4, p0, Lb2/v;->y:I

    or-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, La3/o;->Z0(IZ)V

    iget-boolean v3, p0, Lb2/v;->N:Z

    if-eqz v3, :cond_9

    if-eqz v5, :cond_7

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v2

    iget-object v2, v2, La3/n0;->e0:La3/l1;

    iget-object v3, p0, Lb2/v;->w:Lb2/v;

    invoke-virtual {v3, v1}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    invoke-virtual {v2}, La3/l1;->o()V

    goto :goto_2

    :cond_7
    :goto_1
    iget-object v1, p0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p0, v1}, La3/o;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    :goto_2
    invoke-virtual {v0}, Lb2/v;->N0()V

    invoke-virtual {v0}, Lb2/v;->T0()V

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-nez v1, :cond_8

    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_8
    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, La3/r1;->a(Lb2/v;II)V

    :cond_9
    :goto_3
    return-object p1
.end method

.method public final Y0(La3/n;)V
    .locals 6

    iget-object v0, p0, La3/o;->P:Lb2/v;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_6

    if-ne v0, p1, :cond_5

    iget-boolean p1, v0, Lb2/v;->N:Z

    const/4 v3, 0x2

    if-eqz p1, :cond_1

    sget-object v4, La3/r1;->a:La0/m0;

    if-nez p1, :cond_0

    const-string p1, "autoInvalidateRemovedNode called on unattached node"

    invoke-static {p1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 p1, -0x1

    invoke-static {v0, p1, v3}, La3/r1;->a(Lb2/v;II)V

    invoke-virtual {v0}, Lb2/v;->U0()V

    invoke-virtual {v0}, Lb2/v;->O0()V

    :cond_1
    invoke-virtual {v0, v0}, Lb2/v;->V0(Lb2/v;)V

    const/4 p1, 0x0

    iput p1, v0, Lb2/v;->z:I

    if-nez v2, :cond_2

    iget-object p1, v0, Lb2/v;->F:Lb2/v;

    iput-object p1, p0, La3/o;->P:Lb2/v;

    goto :goto_1

    :cond_2
    iget-object p1, v0, Lb2/v;->F:Lb2/v;

    iput-object p1, v2, Lb2/v;->F:Lb2/v;

    :goto_1
    iput-object v1, v0, Lb2/v;->F:Lb2/v;

    iput-object v1, v0, Lb2/v;->E:Lb2/v;

    iget p1, p0, Lb2/v;->y:I

    invoke-static {p0}, La3/r1;->f(Lb2/v;)I

    move-result v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, La3/o;->Z0(IZ)V

    iget-boolean v2, p0, Lb2/v;->N:Z

    if-eqz v2, :cond_4

    and-int/2addr p1, v3

    if-eqz p1, :cond_4

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    invoke-virtual {v0, v1}, Lb2/v;->W0(Landroidx/compose/ui/node/NodeCoordinator;)V

    invoke-virtual {p1}, La3/l1;->o()V

    :cond_4
    :goto_2
    return-void

    :cond_5
    iget-object v2, v0, Lb2/v;->F:Lb2/v;

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find delegate: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z0(IZ)V
    .locals 3

    iget v0, p0, Lb2/v;->y:I

    iput p1, p0, Lb2/v;->y:I

    if-eq v0, p1, :cond_4

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    if-ne v0, p0, :cond_0

    iput p1, p0, Lb2/v;->z:I

    :cond_0
    iget-boolean v1, p0, Lb2/v;->N:Z

    if-eqz v1, :cond_4

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_1

    iget v2, v1, Lb2/v;->y:I

    or-int/2addr p1, v2

    iput p1, v1, Lb2/v;->y:I

    if-eq v1, v0, :cond_1

    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    if-ne v1, v0, :cond_2

    invoke-static {v0}, La3/r1;->f(Lb2/v;)I

    move-result p1

    iput p1, v0, Lb2/v;->y:I

    :cond_2
    if-eqz v1, :cond_3

    iget-object p2, v1, Lb2/v;->F:Lb2/v;

    if-eqz p2, :cond_3

    iget p2, p2, Lb2/v;->z:I

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    or-int/2addr p1, p2

    :goto_2
    if-eqz v1, :cond_4

    iget p2, v1, Lb2/v;->y:I

    or-int/2addr p1, p2

    iput p1, v1, Lb2/v;->z:I

    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_4
    return-void
.end method
