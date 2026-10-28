.class public final Le2/f;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;
.implements La3/a0;


# instance fields
.field public O:Le2/f;

.field public P:Le2/f;

.field public Q:J


# virtual methods
.method public final Q0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Le2/f;->P:Le2/f;

    iput-object v0, p0, Le2/f;->O:Le2/f;

    return-void
.end method

.method public final X0(Le10/k0;)Z
    .locals 1

    iget-object v0, p0, Le2/f;->O:Le2/f;

    if-nez v0, :cond_1

    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le2/f;->X0(Le10/k0;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Le2/f;->X0(Le10/k0;)Z

    move-result p1

    return p1
.end method

.method public final Y0(Le10/k0;)V
    .locals 1

    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-nez v0, :cond_1

    iget-object v0, p0, Le2/f;->O:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le2/f;->Y0(Le10/k0;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0, p1}, Le2/f;->Y0(Le10/k0;)V

    return-void
.end method

.method public final Z0(Le10/k0;)V
    .locals 1

    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le2/f;->Z0(Le10/k0;)V

    :cond_0
    iget-object v0, p0, Le2/f;->O:Le2/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Le2/f;->Z0(Le10/k0;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Le2/f;->O:Le2/f;

    return-void
.end method

.method public final a1(Le10/k0;)V
    .locals 4

    iget-object v0, p0, Le2/f;->O:Le2/f;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/sentry/config/a;->D(Le10/k0;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Le4/a;->n(Le2/f;J)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move-object v1, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lb4/g;

    const/4 v3, 0x2

    invoke-direct {v2, v1, p0, p1, v3}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p0, v2}, La3/g;->t(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, La3/p2;

    :goto_0
    check-cast v1, Le2/f;

    :goto_1
    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    invoke-static {v1, p1}, Le4/a;->o(Le2/f;Le10/k0;)V

    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Le2/f;->Z0(Le10/k0;)V

    goto :goto_2

    :cond_2
    if-nez v1, :cond_4

    if-eqz v0, :cond_4

    iget-object v2, p0, Le2/f;->P:Le2/f;

    if-eqz v2, :cond_3

    invoke-static {v2, p1}, Le4/a;->o(Le2/f;Le10/k0;)V

    :cond_3
    invoke-virtual {v0, p1}, Le2/f;->Z0(Le10/k0;)V

    goto :goto_2

    :cond_4
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v1, :cond_5

    invoke-static {v1, p1}, Le4/a;->o(Le2/f;Le10/k0;)V

    :cond_5
    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Le2/f;->Z0(Le10/k0;)V

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {v1, p1}, Le2/f;->a1(Le10/k0;)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Le2/f;->a1(Le10/k0;)V

    :cond_8
    :goto_2
    iput-object v1, p0, Le2/f;->O:Le2/f;

    return-void
.end method

.method public final b1(Le10/k0;)V
    .locals 1

    iget-object v0, p0, Le2/f;->P:Le2/f;

    if-nez v0, :cond_1

    iget-object v0, p0, Le2/f;->O:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le2/f;->b1(Le10/k0;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0, p1}, Le2/f;->b1(Le10/k0;)V

    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    sget-object v0, Le2/d;->a:Le2/d;

    return-object v0
.end method

.method public final g(J)V
    .locals 0

    iput-wide p1, p0, Le2/f;->Q:J

    return-void
.end method
