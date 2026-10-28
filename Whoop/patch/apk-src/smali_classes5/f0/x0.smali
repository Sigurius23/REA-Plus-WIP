.class public final Lf0/x0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/s;
.implements La3/r;
.implements La3/j2;
.implements La3/w1;


# instance fields
.field public O:Lkotlin/jvm/functions/Function1;

.field public P:Lkotlin/jvm/functions/Function1;

.field public Q:Lf0/h1;

.field public R:Landroid/view/View;

.field public S:Ly3/c;

.field public T:Le10/k0;

.field public final U:Lp1/k1;

.field public V:Lp1/f0;

.field public W:J

.field public X:Ly3/l;

.field public Y:Ldc3/h;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf0/h1;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lf0/x0;->O:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lf0/x0;->P:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lf0/x0;->Q:Lf0/h1;

    sget-object p1, Lp1/v0;->y:Lp1/v0;

    new-instance p2, Lp1/k1;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object p2, p0, Lf0/x0;->U:Lp1/k1;

    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide p1, p0, Lf0/x0;->W:J

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    new-instance v0, Lf0/w0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf0/w0;-><init>(Lf0/x0;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    return-void
.end method

.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iget-object v0, p0, Lf0/x0;->U:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final O(La3/p0;)V
    .locals 1

    invoke-virtual {p1}, La3/p0;->a()V

    iget-object p1, p0, Lf0/x0;->Y:Ldc3/h;

    if-eqz p1, :cond_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final P0()V
    .locals 5

    invoke-virtual {p0}, Lf0/x0;->C()V

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    iput-object v0, p0, Lf0/x0;->Y:Ldc3/h;

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, La20/b;

    const/16 v4, 0x11

    invoke-direct {v3, p0, v2, v4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x1

    invoke-static {v0, v2, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final Q0()V
    .locals 1

    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lf0/x0;->T:Le10/k0;

    return-void
.end method

.method public final X0()J
    .locals 2

    iget-object v0, p0, Lf0/x0;->V:Lp1/f0;

    if-nez v0, :cond_0

    new-instance v0, Lf0/w0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lf0/w0;-><init>(Lf0/x0;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lf0/x0;->V:Lp1/f0;

    :cond_0
    iget-object v0, p0, Lf0/x0;->V:Lp1/f0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    return-wide v0

    :cond_1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide v0
.end method

.method public final Y0()V
    .locals 3

    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->dismiss()V

    :cond_0
    iget-object v0, p0, Lf0/x0;->R:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lf0/x0;->R:Landroid/view/View;

    iget-object v1, p0, Lf0/x0;->S:Ly3/c;

    if-nez v1, :cond_2

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->X:Ly3/c;

    :cond_2
    iput-object v1, p0, Lf0/x0;->S:Ly3/c;

    iget-object v2, p0, Lf0/x0;->Q:Lf0/h1;

    invoke-interface {v2, v0, v1}, Lf0/h1;->a(Landroid/view/View;Ly3/c;)Le10/k0;

    move-result-object v0

    iput-object v0, p0, Lf0/x0;->T:Le10/k0;

    invoke-virtual {p0}, Lf0/x0;->a1()V

    return-void
.end method

.method public final Z0()V
    .locals 8

    iget-object v0, p0, Lf0/x0;->S:Ly3/c;

    if-nez v0, :cond_0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    iput-object v0, p0, Lf0/x0;->S:Ly3/c;

    :cond_0
    iget-object v1, p0, Lf0/x0;->O:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    const-wide v2, 0x7fffffff7fffffffL

    and-long v4, v0, v2

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lf0/x0;->X0()J

    move-result-wide v4

    and-long/2addr v2, v4

    cmp-long v2, v2, v6

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lf0/x0;->X0()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Lh2/b;->h(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lf0/x0;->W:J

    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf0/x0;->Y0()V

    :cond_1
    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-eqz v0, :cond_2

    iget-wide v1, p0, Lf0/x0;->W:J

    invoke-virtual {v0, v1, v2, v6, v7}, Le10/k0;->O(JJ)V

    :cond_2
    invoke-virtual {p0}, Lf0/x0;->a1()V

    return-void

    :cond_3
    iput-wide v6, p0, Lf0/x0;->W:J

    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-eqz v0, :cond_4

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->dismiss()V

    :cond_4
    return-void
.end method

.method public final a1()V
    .locals 6

    iget-object v0, p0, Lf0/x0;->T:Le10/k0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf0/x0;->S:Ly3/c;

    if-nez v1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Le10/k0;->F()J

    move-result-wide v2

    iget-object v4, p0, Lf0/x0;->X:Ly3/l;

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v4, v4, Ly3/l;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    :goto_1
    iget-object v2, p0, Lf0/x0;->P:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Le10/k0;->F()J

    move-result-wide v3

    invoke-static {v3, v4}, Lv63/b;->l(J)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Ly3/c;->i(J)J

    move-result-wide v3

    new-instance v1, Ly3/h;

    invoke-direct {v1, v3, v4}, Ly3/h;-><init>(J)V

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Le10/k0;->F()J

    move-result-wide v0

    new-instance v2, Ly3/l;

    invoke-direct {v2, v0, v1}, Ly3/l;-><init>(J)V

    iput-object v2, p0, Lf0/x0;->X:Ly3/l;

    :cond_3
    return-void
.end method

.method public final n(Li3/z;)V
    .locals 3

    sget-object v0, Lf0/y0;->a:Li3/y;

    new-instance v1, Lf0/w0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lf0/w0;-><init>(Lf0/x0;I)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-void
.end method
