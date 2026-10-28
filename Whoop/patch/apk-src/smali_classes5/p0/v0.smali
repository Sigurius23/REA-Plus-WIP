.class public final Lp0/v0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/j2;


# instance fields
.field public O:Lc93/a;

.field public P:Lp0/s0;

.field public Q:Lh0/d2;

.field public R:Z

.field public S:Li3/j;

.field public final T:Lp0/t0;

.field public U:Lp0/t0;


# direct methods
.method public constructor <init>(Lc93/a;Lp0/s0;Lh0/d2;Z)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lp0/v0;->O:Lc93/a;

    iput-object p2, p0, Lp0/v0;->P:Lp0/s0;

    iput-object p3, p0, Lp0/v0;->Q:Lh0/d2;

    iput-boolean p4, p0, Lp0/v0;->R:Z

    new-instance p1, Lp0/t0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lp0/t0;-><init>(Lp0/v0;I)V

    iput-object p1, p0, Lp0/v0;->T:Lp0/t0;

    invoke-virtual {p0}, Lp0/v0;->X0()V

    return-void
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final X0()V
    .locals 4

    new-instance v0, Li3/j;

    new-instance v1, Lp0/u0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lp0/u0;-><init>(Lp0/v0;I)V

    new-instance v2, Lp0/u0;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lp0/u0;-><init>(Lp0/v0;I)V

    invoke-direct {v0, v1, v2}, Li3/j;-><init>(Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lp0/v0;->S:Li3/j;

    iget-boolean v0, p0, Lp0/v0;->R:Z

    if-eqz v0, :cond_0

    new-instance v0, Lp0/t0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lp0/t0;-><init>(Lp0/v0;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lp0/v0;->U:Lp0/t0;

    return-void
.end method

.method public final n(Li3/z;)V
    .locals 7

    invoke-static {p1}, Li3/w;->n(Li3/z;)V

    sget-object v0, Li3/u;->L:Li3/y;

    move-object v1, p1

    check-cast v1, Li3/l;

    iget-object v2, p0, Lp0/v0;->T:Lp0/t0;

    invoke-virtual {v1, v0, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    iget-object v0, p0, Lp0/v0;->Q:Lh0/d2;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    const-string v3, "scrollAxisRange"

    const/4 v4, 0x0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lp0/v0;->S:Li3/j;

    if-eqz v0, :cond_0

    sget-object v2, Li3/u;->u:Li3/y;

    sget-object v3, Li3/w;->a:[Lj93/z;

    const/16 v5, 0xc

    aget-object v3, v3, v5

    invoke-virtual {v2, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_1
    iget-object v0, p0, Lp0/v0;->S:Li3/j;

    if-eqz v0, :cond_3

    sget-object v2, Li3/u;->t:Li3/y;

    sget-object v3, Li3/w;->a:[Lj93/z;

    const/16 v5, 0xb

    aget-object v3, v3, v5

    invoke-virtual {v2, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lp0/v0;->U:Lp0/t0;

    if-eqz v0, :cond_2

    sget-object v2, Li3/k;->f:Li3/y;

    new-instance v3, Li3/a;

    invoke-direct {v3, v4, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_2
    new-instance v0, Lp0/u0;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lp0/u0;-><init>(Lp0/v0;I)V

    sget-object v2, Li3/k;->B:Li3/y;

    new-instance v3, Li3/a;

    new-instance v5, La0/a1;

    const/16 v6, 0x19

    invoke-direct {v5, v0, v6}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v3, v4, v5}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    iget-object v0, p0, Lp0/v0;->P:Lp0/s0;

    invoke-interface {v0}, Lp0/s0;->d()Li3/b;

    move-result-object v0

    sget-object v1, Li3/u;->f:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method
