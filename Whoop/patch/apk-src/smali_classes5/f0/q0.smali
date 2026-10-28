.class public final Lf0/q0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/f2;


# instance fields
.field public O:Lj0/i;

.field public P:Lj0/f;


# direct methods
.method public static final X0(Lf0/q0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lf0/n0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf0/n0;

    iget v1, v0, Lf0/n0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf0/n0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf0/n0;

    invoke-direct {v0, p0, p1}, Lf0/n0;-><init>(Lf0/q0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf0/n0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf0/n0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lf0/n0;->w:Lj0/f;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/q0;->P:Lj0/f;

    if-nez p1, :cond_4

    new-instance p1, Lj0/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lf0/q0;->O:Lj0/i;

    iput-object p1, v0, Lf0/n0;->w:Lj0/f;

    iput v3, v0, Lf0/n0;->z:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, p1, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    iput-object v0, p0, Lf0/q0;->P:Lj0/f;

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final Y0(Lf0/q0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lf0/o0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf0/o0;

    iget v1, v0, Lf0/o0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf0/o0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf0/o0;

    invoke-direct {v0, p0, p1}, Lf0/o0;-><init>(Lf0/q0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf0/o0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf0/o0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/q0;->P:Lj0/f;

    if-eqz p1, :cond_4

    new-instance v2, Lj0/g;

    invoke-direct {v2, p1}, Lj0/g;-><init>(Lj0/f;)V

    iget-object p1, p0, Lf0/q0;->O:Lj0/i;

    iput v3, v0, Lf0/o0;->y:I

    check-cast p1, Lj0/j;

    invoke-virtual {p1, v2, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lf0/q0;->P:Lj0/f;

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final Q0()V
    .locals 0

    invoke-virtual {p0}, Lf0/q0;->Z0()V

    return-void
.end method

.method public final Z0()V
    .locals 2

    iget-object v0, p0, Lf0/q0;->P:Lj0/f;

    if-eqz v0, :cond_0

    new-instance v1, Lj0/g;

    invoke-direct {v1, v0}, Lj0/g;-><init>(Lj0/f;)V

    iget-object v0, p0, Lf0/q0;->O:Lj0/i;

    check-cast v0, Lj0/j;

    invoke-virtual {v0, v1}, Lj0/j;->b(Lj0/h;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/q0;->P:Lj0/f;

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 0

    invoke-virtual {p0}, Lf0/q0;->Z0()V

    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 1

    sget-object p3, Lu2/l;->x:Lu2/l;

    if-ne p2, p3, :cond_1

    iget p1, p1, Lu2/k;->f:I

    const/4 p2, 0x4

    const/4 p3, 0x3

    const/4 p4, 0x0

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p1

    new-instance p2, Lf0/p0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p4, v0}, Lf0/p0;-><init>(Lf0/q0;Lq83/d;I)V

    invoke-static {p1, p4, p4, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    const/4 p2, 0x5

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p1

    new-instance p2, Lf0/p0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p4, v0}, Lf0/p0;-><init>(Lf0/q0;Lq83/d;I)V

    invoke-static {p1, p4, p4, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-void
.end method
