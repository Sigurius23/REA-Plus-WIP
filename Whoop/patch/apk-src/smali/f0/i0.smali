.class public final Lf0/i0;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/j2;
.implements La3/s;
.implements La3/m;
.implements La3/w1;
.implements La3/p2;


# static fields
.field public static final W:Lf0/b;


# instance fields
.field public Q:Lj0/i;

.field public final R:Lkotlin/jvm/functions/Function1;

.field public S:Lj0/d;

.field public T:Lp0/g0;

.field public U:Landroidx/compose/ui/node/NodeCoordinator;

.field public final V:Lg2/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/i0;->W:Lf0/b;

    return-void
.end method

.method public constructor <init>(Lj0/i;ILandroidx/room/u;)V
    .locals 8

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, Lf0/i0;->Q:Lj0/i;

    iput-object p3, p0, Lf0/i0;->R:Lkotlin/jvm/functions/Function1;

    new-instance v0, Landroidx/room/w0;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v1, 0x2

    const-class v3, Lf0/i0;

    const-string v4, "onFocusStateChange"

    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/w0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance p1, Lg2/x;

    const/4 p3, 0x4

    invoke-direct {p1, v0, p2, p3}, Lg2/x;-><init>(Lc93/m;II)V

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    iput-object p1, v2, Lf0/i0;->V:Lg2/x;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ld30/l;

    const/16 v2, 0x17

    invoke-direct {v1, v2, v0, p0}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v1}, La3/g;->l(Lb2/v;Lc93/a;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lp0/g0;

    iget-object v1, p0, Lf0/i0;->V:Lg2/x;

    invoke-virtual {v1}, Lg2/x;->Z0()Lg2/w;

    move-result-object v1

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lf0/i0;->T:Lp0/g0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lp0/g0;->b()V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lp0/g0;->a()Lp0/g0;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lf0/i0;->T:Lp0/g0;

    :cond_2
    return-void
.end method

.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iput-object p1, p0, Lf0/i0;->U:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, p0, Lf0/i0;->V:Lg2/x;

    invoke-virtual {v0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object p1

    iget-boolean p1, p1, Lb2/v;->N:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf0/i0;->U:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object p1

    iget-boolean p1, p1, Lb2/v;->N:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lf0/i0;->b1()Lf0/j0;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lf0/i0;->U:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p1, v0}, Lf0/j0;->X0(Ly2/y;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lf0/i0;->b1()Lf0/j0;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf0/j0;->X0(Ly2/y;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final R0()V
    .locals 1

    iget-object v0, p0, Lf0/i0;->T:Lp0/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp0/g0;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lf0/i0;->T:Lp0/g0;

    return-void
.end method

.method public final a1(Lj0/i;Lj0/h;)V
    .locals 7

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    check-cast v0, Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/profile/view/edit/n;

    const/16 v2, 0x17

    invoke-direct {v1, v2, p1, p2}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, La1/h;

    const/16 v6, 0x15

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    move-object v2, p1

    move-object v3, p2

    move-object p1, v2

    check-cast p1, Lj0/j;

    invoke-virtual {p1, v3}, Lj0/j;->b(Lj0/h;)Z

    return-void
.end method

.method public final b1()Lf0/j0;
    .locals 10

    iget-boolean v0, p0, Lb2/v;->N:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "visitAncestors called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_b

    iget-object v3, v2, La3/n0;->e0:La3/l1;

    iget-object v3, v3, La3/l1;->g:Ljava/lang/Object;

    check-cast v3, Lb2/v;

    iget v3, v3, Lb2/v;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v3, v4

    if-eqz v3, :cond_9

    :goto_1
    if-eqz v0, :cond_9

    iget v3, v0, Lb2/v;->y:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_8

    move-object v3, v0

    move-object v5, v1

    :goto_2
    if-eqz v3, :cond_8

    instance-of v6, v3, La3/p2;

    if-eqz v6, :cond_1

    check-cast v3, La3/p2;

    invoke-interface {v3}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lf0/j0;->P:Lf0/b;

    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_1
    iget v6, v3, Lb2/v;->y:I

    and-int/2addr v6, v4

    if-eqz v6, :cond_7

    instance-of v6, v3, La3/o;

    if-eqz v6, :cond_7

    move-object v6, v3

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_6

    iget v9, v6, Lb2/v;->y:I

    and-int/2addr v9, v4

    if-eqz v9, :cond_5

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_2

    move-object v3, v6

    goto :goto_4

    :cond_2
    if-nez v5, :cond_3

    new-instance v5, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v5, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v3, v1

    :cond_4
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_6
    if-ne v7, v8, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

    goto :goto_2

    :cond_8
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_9
    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v2, :cond_a

    iget-object v0, v2, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_a

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_0

    :cond_a
    move-object v0, v1

    goto :goto_0

    :cond_b
    move-object v3, v1

    :goto_5
    instance-of v0, v3, Lf0/j0;

    if-eqz v0, :cond_c

    check-cast v3, Lf0/j0;

    return-object v3

    :cond_c
    return-object v1
.end method

.method public final c1(Lj0/i;)V
    .locals 3

    iget-object v0, p0, Lf0/i0;->Q:Lj0/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf0/i0;->Q:Lj0/i;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lf0/i0;->S:Lj0/d;

    if-eqz v1, :cond_0

    new-instance v2, Lj0/e;

    invoke-direct {v2, v1}, Lj0/e;-><init>(Lj0/d;)V

    check-cast v0, Lj0/j;

    invoke-virtual {v0, v2}, Lj0/j;->b(Lj0/h;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lf0/i0;->S:Lj0/d;

    iput-object p1, p0, Lf0/i0;->Q:Lj0/i;

    :cond_1
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lf0/i0;->W:Lf0/b;

    return-object v0
.end method

.method public final n(Li3/z;)V
    .locals 10

    iget-object v0, p0, Lf0/i0;->V:Lg2/x;

    invoke-virtual {v0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->k:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    new-instance v2, Landroidx/room/u0;

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v3, 0x0

    const-class v5, Lf0/i0;

    const-string v6, "requestFocus"

    const-string v7, "requestFocus()Z"

    move-object v4, p0

    invoke-direct/range {v2 .. v9}, Landroidx/room/u0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    sget-object v0, Li3/k;->v:Li3/y;

    new-instance v1, Li3/a;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-void
.end method
