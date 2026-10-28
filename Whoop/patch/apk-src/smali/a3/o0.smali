.class public final La3/o0;
.super La3/a;
.source "SourceFile"


# virtual methods
.method public final b(Landroidx/compose/ui/node/NodeCoordinator;J)J
    .locals 1

    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-virtual {p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->B1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->O0()Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroidx/compose/ui/node/NodeCoordinator;Ly2/a;)I
    .locals 0

    invoke-virtual {p1, p2}, La3/w0;->c0(Ly2/a;)I

    move-result p1

    return p1
.end method
