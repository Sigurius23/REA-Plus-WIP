.class public final Lr0/f;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lf3/a;
.implements La3/a0;


# instance fields
.field public O:Lh0/w;

.field public P:Z


# direct methods
.method public static final X0(Lr0/f;Landroidx/compose/ui/node/NodeCoordinator;La3/z0;)Lh2/c;
    .locals 2

    iget-boolean v0, p0, Lb2/v;->N:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lr0/f;->P:Z

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0}, La3/g;->o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh2/c;

    if-nez p2, :cond_4

    :goto_1
    return-object v1

    :cond_4
    invoke-static {p0, p1, p2}, Lup/d;->k(Landroidx/compose/ui/node/NodeCoordinator;Ly2/y;Lh2/c;)Lh2/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final N(Ly2/y;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/f;->P:Z

    return-void
.end method

.method public final o0(Landroidx/compose/ui/node/NodeCoordinator;La3/z0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    new-instance v4, Ln0/j;

    const/16 v0, 0x18

    invoke-direct {v4, p0, p1, p2, v0}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v0, Ll1/v;

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Ll1/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
