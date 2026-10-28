.class public final Ly2/f1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/w1;


# instance fields
.field public O:Lch0/i;

.field public P:Ly2/w;

.field public Q:Lj3/d;

.field public R:Lbc3/c2;

.field public S:Z

.field public T:Z

.field public U:Lj3/c;

.field public V:Lj3/c;

.field public final W:Lj43/a;


# direct methods
.method public constructor <init>(Ly2/w;Lch0/i;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p2, p0, Ly2/f1;->O:Lch0/i;

    iput-object p1, p0, Ly2/f1;->P:Ly2/w;

    new-instance p1, Lj43/a;

    const/16 p2, 0x16

    invoke-direct {p1, p0, p2}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ly2/f1;->W:Lj43/a;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 0

    invoke-virtual {p0}, Ly2/f1;->Z0()V

    return-void
.end method

.method public final P0()V
    .locals 1

    iget-object v0, p0, Ly2/f1;->Q:Lj3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj3/d;->b()V

    :cond_0
    iget-object v0, p0, Ly2/f1;->W:Lj43/a;

    invoke-static {p0, v0}, Ls4/d;->h(Lb2/v;Lkotlin/jvm/functions/Function1;)Lj3/d;

    move-result-object v0

    iput-object v0, p0, Ly2/f1;->Q:Lj3/d;

    invoke-virtual {p0}, Ly2/f1;->Z0()V

    return-void
.end method

.method public final Q0()V
    .locals 1

    iget-object v0, p0, Ly2/f1;->Q:Lj3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj3/d;->b()V

    :cond_0
    invoke-virtual {p0}, Ly2/f1;->Y0()V

    return-void
.end method

.method public final R0()V
    .locals 3

    invoke-virtual {p0}, Ly2/f1;->Y0()V

    iget-object v0, p0, Ly2/f1;->R:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Ly2/f1;->R:Lbc3/c2;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/f1;->S:Z

    iput-object v1, p0, Ly2/f1;->U:Lj3/c;

    iget-object v2, p0, Ly2/f1;->V:Lj3/c;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iput-object v1, p0, Ly2/f1;->V:Lj3/c;

    iget-object v2, p0, Ly2/f1;->U:Lj3/c;

    if-eqz v2, :cond_1

    invoke-virtual {p0, v2, v1}, Ly2/f1;->X0(Lj3/c;Lj3/c;)V

    :cond_1
    iput-boolean v0, p0, Ly2/f1;->T:Z

    return-void
.end method

.method public final X0(Lj3/c;Lj3/c;)V
    .locals 8

    iput-object p1, p0, Ly2/f1;->U:Lj3/c;

    if-nez p2, :cond_0

    iget-object v0, p0, Ly2/f1;->P:Ly2/w;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x20

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v2, p2, Lj3/c;->a:J

    iget-wide v4, p2, Lj3/c;->b:J

    shr-long v6, v2, v1

    long-to-int p2, v6

    long-to-int v2, v2

    shr-long v6, v4, v1

    long-to-int v1, v6

    long-to-int v3, v4

    invoke-virtual {p1, p2, v2, v1, v3}, Lj3/c;->a(IIII)F

    move-result p1

    goto :goto_0

    :cond_1
    iget-wide v2, p1, Lj3/c;->e:J

    shr-long v4, v2, v1

    long-to-int p2, v4

    long-to-int v1, v2

    invoke-virtual {p1, v0, v0, p2, v1}, Lj3/c;->a(IIII)F

    move-result p1

    :goto_0
    const/4 p2, 0x0

    cmpl-float p2, p1, p2

    const/4 v1, 0x1

    if-gtz p2, :cond_2

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p1, p1, p2

    if-nez p1, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    iget-boolean p1, p0, Ly2/f1;->T:Z

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Ly2/f1;->S:Z

    if-eq v0, p1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    iput-boolean v0, p0, Ly2/f1;->S:Z

    iput-boolean v1, p0, Ly2/f1;->T:Z

    iget-object p1, p0, Ly2/f1;->R:Lbc3/c2;

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iget-object p1, p0, Ly2/f1;->O:Lch0/i;

    iget-boolean p2, p0, Ly2/f1;->S:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lch0/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final Y0()V
    .locals 2

    iget-boolean v0, p0, Ly2/f1;->S:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ly2/f1;->T:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly2/f1;->R:Lbc3/c2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/f1;->S:Z

    iget-object v0, p0, Ly2/f1;->O:Lch0/i;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lch0/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final Z0()V
    .locals 2

    iget-object v0, p0, Ly2/f1;->P:Ly2/w;

    if-nez v0, :cond_1

    iget-object v0, p0, Ly2/f1;->V:Lj3/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v1, p0, Ly2/f1;->V:Lj3/c;

    iget-object v0, p0, Ly2/f1;->U:Lj3/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, Ly2/f1;->X0(Lj3/c;Lj3/c;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lm5/k;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    return-void
.end method
