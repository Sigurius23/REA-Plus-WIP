.class public final La3/b1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:La3/c1;

.field public final synthetic x:Landroidx/compose/ui/node/Owner;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(La3/c1;Landroidx/compose/ui/node/Owner;J)V
    .locals 0

    iput-object p1, p0, La3/b1;->w:La3/c1;

    iput-object p2, p0, La3/b1;->x:Landroidx/compose/ui/node/Owner;

    iput-wide p3, p0, La3/b1;->y:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, La3/b1;->w:La3/c1;

    iget-object v0, v0, La3/c1;->F:La3/r0;

    iget-object v1, v0, La3/r0;->a:La3/n0;

    invoke-static {v1}, La3/g;->k(La3/n0;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-boolean v1, v0, La3/r0;->c:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v1, La3/w0;->L:Ly2/o0;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v1, :cond_1

    iget-object v2, v1, La3/w0;->L:Ly2/o0;

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    iget-object v1, p0, La3/b1;->x:Landroidx/compose/ui/node/Owner;

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getPlacementScope()Ly2/i1;

    move-result-object v2

    :cond_2
    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v3, p0, La3/b1;->y:J

    invoke-static {v2, v0, v3, v4}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
