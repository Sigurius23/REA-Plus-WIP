.class public abstract Lf0/h;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/f2;
.implements Ls2/f;
.implements La3/j2;
.implements La3/p2;
.implements La3/m;
.implements La3/w1;


# static fields
.field public static final j0:Lf0/b;


# instance fields
.field public Q:Lj0/i;

.field public R:Lf0/v0;

.field public S:Z

.field public T:Ljava/lang/String;

.field public U:Li3/i;

.field public V:Z

.field public W:Lc93/a;

.field public final X:Lf0/i0;

.field public Y:Lf0/v0;

.field public Z:Lu2/h0;

.field public a0:La3/n;

.field public b0:Lj0/l;

.field public c0:Lj0/f;

.field public final d0:La0/k0;

.field public e0:J

.field public f0:Lj0/i;

.field public g0:Z

.field public h0:Lbc3/c2;

.field public final i0:Lf0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/h;->j0:Lf0/b;

    return-void
.end method

.method public constructor <init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V
    .locals 8

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, Lf0/h;->Q:Lj0/i;

    iput-object p2, p0, Lf0/h;->R:Lf0/v0;

    iput-boolean p3, p0, Lf0/h;->S:Z

    iput-object p5, p0, Lf0/h;->T:Ljava/lang/String;

    iput-object p6, p0, Lf0/h;->U:Li3/i;

    iput-boolean p4, p0, Lf0/h;->V:Z

    iput-object p7, p0, Lf0/h;->W:Lc93/a;

    new-instance p2, Lf0/i0;

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v1, 0x1

    const-class v3, Lf0/h;

    const-string v4, "onFocusChange"

    const-string v5, "onFocusChange(Z)V"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3, v0}, Lf0/i0;-><init>(Lj0/i;ILandroidx/room/u;)V

    iput-object p2, v2, Lf0/h;->X:Lf0/i0;

    sget-object p1, La0/w;->a:La0/k0;

    new-instance p1, La0/k0;

    invoke-direct {p1}, La0/k0;-><init>()V

    iput-object p1, v2, Lf0/h;->d0:La0/k0;

    const-wide/16 p1, 0x0

    iput-wide p1, v2, Lf0/h;->e0:J

    iget-object p1, v2, Lf0/h;->Q:Lj0/i;

    iput-object p1, v2, Lf0/h;->f0:Lj0/i;

    if-nez p1, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, v2, Lf0/h;->g0:Z

    sget-object p1, Lf0/h;->j0:Lf0/b;

    iput-object p1, v2, Lf0/h;->i0:Lf0/b;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    iget-boolean v0, p0, Lf0/h;->S:Z

    if-eqz v0, :cond_0

    new-instance v0, Lf0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf0/a;-><init>(Lf0/h;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    :cond_0
    return-void
.end method

.method public final H0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 1

    invoke-virtual {p0}, Lf0/h;->C()V

    iget-boolean v0, p0, Lf0/h;->g0:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf0/h;->f1()V

    :cond_0
    iget-boolean v0, p0, Lf0/h;->V:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf0/h;->X:Lf0/i0;

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    :cond_1
    return-void
.end method

.method public final Q(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final Q0()V
    .locals 2

    invoke-virtual {p0}, Lf0/h;->d1()V

    iget-object v0, p0, Lf0/h;->f0:Lj0/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lf0/h;->Q:Lj0/i;

    :cond_0
    iget-object v0, p0, Lf0/h;->a0:La3/n;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, La3/o;->Y0(La3/n;)V

    :cond_1
    iput-object v1, p0, Lf0/h;->a0:La3/n;

    return-void
.end method

.method public final Z(Landroid/view/KeyEvent;)Z
    .locals 10

    invoke-virtual {p0}, Lf0/h;->f1()V

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v0

    iget-boolean v2, p0, Lf0/h;->V:Z

    const/4 v3, 0x3

    const/4 v4, 0x0

    iget-object v5, p0, Lf0/h;->d0:La0/k0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v2

    const/4 v8, 0x2

    invoke-static {v2, v8}, Ls2/d;->j(II)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1}, Landroidx/compose/foundation/a;->i(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v5, v0, v1}, La0/k0;->b(J)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lj0/l;

    iget-wide v8, p0, Lf0/h;->e0:J

    invoke-direct {v2, v8, v9}, Lj0/l;-><init>(J)V

    invoke-virtual {v5, v0, v1, v2}, La0/k0;->h(JLjava/lang/Object;)V

    iget-object v0, p0, Lf0/h;->Q:Lj0/i;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lf0/f;

    const/4 v5, 0x1

    invoke-direct {v1, p0, v2, v4, v5}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    invoke-static {v0, v4, v4, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    move v0, v6

    goto :goto_0

    :cond_1
    move v0, v7

    :goto_0
    invoke-virtual {p0, p1}, Lf0/h;->h1(Landroid/view/KeyEvent;)Z

    move-result p1

    if-nez p1, :cond_5

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lf0/h;->V:Z

    if-eqz v2, :cond_6

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v2

    invoke-static {v2, v6}, Ls2/d;->j(II)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {p1}, Landroidx/compose/foundation/a;->i(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v5, v0, v1}, La0/k0;->g(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj0/l;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lf0/h;->Q:Lj0/i;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lf0/f;

    const/4 v5, 0x2

    invoke-direct {v2, p0, v0, v4, v5}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    invoke-static {v1, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    invoke-virtual {p0, p1}, Lf0/h;->i1(Landroid/view/KeyEvent;)V

    :cond_4
    if-eqz v0, :cond_6

    :cond_5
    :goto_1
    return v6

    :cond_6
    return v7
.end method

.method public a1(Li3/z;)V
    .locals 0

    return-void
.end method

.method public b0()V
    .locals 3

    iget-object v0, p0, Lf0/h;->Q:Lj0/i;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lf0/h;->c0:Lj0/f;

    if-eqz v1, :cond_0

    new-instance v2, Lj0/g;

    invoke-direct {v2, v1}, Lj0/g;-><init>(Lj0/f;)V

    check-cast v0, Lj0/j;

    invoke-virtual {v0, v2}, Lj0/j;->b(Lj0/h;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lf0/h;->c0:Lj0/f;

    iget-object v0, p0, Lf0/h;->Z:Lu2/h0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu2/h0;->b0()V

    :cond_1
    return-void
.end method

.method public abstract b1()Lu2/h0;
.end method

.method public final c1()Z
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lf0/u;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lf0/u;-><init>(Lkotlin/jvm/internal/b0;I)V

    sget-object v2, Lh0/l2;->P:Lqt/e;

    invoke-static {p0, v2, v1}, La3/g;->r(La3/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v0, :cond_1

    invoke-static {p0}, Lf0/x;->a(Lf0/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d1()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lf0/h;->Q:Lj0/i;

    iget-object v2, v0, Lf0/h;->d0:La0/k0;

    if-eqz v1, :cond_5

    iget-object v3, v0, Lf0/h;->b0:Lj0/l;

    if-eqz v3, :cond_0

    new-instance v4, Lj0/k;

    invoke-direct {v4, v3}, Lj0/k;-><init>(Lj0/l;)V

    move-object v3, v1

    check-cast v3, Lj0/j;

    invoke-virtual {v3, v4}, Lj0/j;->b(Lj0/h;)Z

    :cond_0
    iget-object v3, v0, Lf0/h;->c0:Lj0/f;

    if-eqz v3, :cond_1

    new-instance v4, Lj0/g;

    invoke-direct {v4, v3}, Lj0/g;-><init>(Lj0/f;)V

    move-object v3, v1

    check-cast v3, Lj0/j;

    invoke-virtual {v3, v4}, Lj0/j;->b(Lj0/h;)Z

    :cond_1
    iget-object v3, v2, La0/k0;->c:[Ljava/lang/Object;

    iget-object v4, v2, La0/k0;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v4, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_4

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_3

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_2

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v3, v13

    check-cast v13, Lj0/l;

    new-instance v14, Lj0/k;

    invoke-direct {v14, v13}, Lj0/k;-><init>(Lj0/l;)V

    move-object v13, v1

    check-cast v13, Lj0/j;

    invoke-virtual {v13, v14}, Lj0/j;->b(Lj0/h;)Z

    :cond_2
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_3
    if-ne v10, v11, :cond_5

    :cond_4
    if-eq v7, v5, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    iput-object v1, v0, Lf0/h;->b0:Lj0/l;

    iput-object v1, v0, Lf0/h;->c0:Lj0/f;

    invoke-virtual {v2}, La0/k0;->a()V

    return-void
.end method

.method public final e1()V
    .locals 6

    iget-object v0, p0, Lf0/h;->Q:Lj0/i;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lf0/h;->h0:Lbc3/c2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lbc3/t1;->isActive()Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lf0/h;->h0:Lbc3/c2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf0/h;->b0:Lj0/l;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v3

    new-instance v4, Lf0/e;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v0, v2, v5}, Lf0/e;-><init>(Lj0/l;Lj0/i;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v3, v2, v2, v4, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    iput-object v2, p0, Lf0/h;->b0:Lj0/l;

    :cond_2
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf0/h;->i0:Lf0/b;

    return-object v0
.end method

.method public final f1()V
    .locals 3

    iget-object v0, p0, Lf0/h;->a0:La3/n;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lf0/h;->S:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf0/h;->Y:Lf0/v0;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lf0/h;->R:Lf0/v0;

    :goto_0
    if-eqz v0, :cond_3

    iget-object v1, p0, Lf0/h;->Q:Lj0/i;

    if-nez v1, :cond_2

    new-instance v1, Lj0/j;

    invoke-direct {v1}, Lj0/j;-><init>()V

    iput-object v1, p0, Lf0/h;->Q:Lj0/i;

    :cond_2
    iget-object v1, p0, Lf0/h;->X:Lf0/i0;

    iget-object v2, p0, Lf0/h;->Q:Lj0/i;

    invoke-virtual {v1, v2}, Lf0/i0;->c1(Lj0/i;)V

    iget-object v1, p0, Lf0/h;->Q:Lj0/i;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lf0/v0;->a(Lj0/i;)La3/n;

    move-result-object v0

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    iput-object v0, p0, Lf0/h;->a0:La3/n;

    :cond_3
    :goto_1
    return-void
.end method

.method public g1()V
    .locals 0

    return-void
.end method

.method public abstract h1(Landroid/view/KeyEvent;)Z
.end method

.method public abstract i1(Landroid/view/KeyEvent;)V
.end method

.method public final j1(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V
    .locals 3

    iget-object v0, p0, Lf0/h;->f0:Lj0/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf0/h;->d1()V

    iput-object p1, p0, Lf0/h;->f0:Lj0/i;

    iput-object p1, p0, Lf0/h;->Q:Lj0/i;

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-object v0, p0, Lf0/h;->R:Lf0/v0;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p2, p0, Lf0/h;->R:Lf0/v0;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Lf0/h;->S:Z

    if-eq p2, p3, :cond_3

    iput-boolean p3, p0, Lf0/h;->S:Z

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lf0/h;->C()V

    :cond_2
    move p1, v1

    :cond_3
    iget-boolean p2, p0, Lf0/h;->V:Z

    iget-object p3, p0, Lf0/h;->X:Lf0/i0;

    if-eq p2, p4, :cond_5

    if-eqz p4, :cond_4

    invoke-virtual {p0, p3}, La3/o;->X0(La3/n;)La3/n;

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p3}, La3/o;->Y0(La3/n;)V

    invoke-virtual {p0}, Lf0/h;->d1()V

    :goto_1
    invoke-static {p0}, La3/g;->j(La3/j2;)V

    iput-boolean p4, p0, Lf0/h;->V:Z

    :cond_5
    iget-object p2, p0, Lf0/h;->T:Ljava/lang/String;

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    iput-object p5, p0, Lf0/h;->T:Ljava/lang/String;

    invoke-static {p0}, La3/g;->j(La3/j2;)V

    :cond_6
    iget-object p2, p0, Lf0/h;->U:Li3/i;

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    iput-object p6, p0, Lf0/h;->U:Li3/i;

    invoke-static {p0}, La3/g;->j(La3/j2;)V

    :cond_7
    iput-object p7, p0, Lf0/h;->W:Lc93/a;

    iget-boolean p2, p0, Lf0/h;->g0:Z

    iget-object p4, p0, Lf0/h;->f0:Lj0/i;

    if-nez p4, :cond_8

    move p5, v1

    goto :goto_2

    :cond_8
    move p5, v2

    :goto_2
    if-eq p2, p5, :cond_a

    if-nez p4, :cond_9

    move v2, v1

    :cond_9
    iput-boolean v2, p0, Lf0/h;->g0:Z

    if-nez v2, :cond_a

    iget-object p2, p0, Lf0/h;->a0:La3/n;

    if-nez p2, :cond_a

    goto :goto_3

    :cond_a
    move v1, p1

    :goto_3
    if-eqz v1, :cond_d

    iget-object p1, p0, Lf0/h;->a0:La3/n;

    if-nez p1, :cond_b

    iget-boolean p2, p0, Lf0/h;->g0:Z

    if-nez p2, :cond_d

    :cond_b
    if-eqz p1, :cond_c

    invoke-virtual {p0, p1}, La3/o;->Y0(La3/n;)V

    :cond_c
    const/4 p1, 0x0

    iput-object p1, p0, Lf0/h;->a0:La3/n;

    invoke-virtual {p0}, Lf0/h;->f1()V

    :cond_d
    iget-object p1, p0, Lf0/h;->Q:Lj0/i;

    invoke-virtual {p3, p1}, Lf0/i0;->c1(Lj0/i;)V

    return-void
.end method

.method public final n(Li3/z;)V
    .locals 4

    iget-object v0, p0, Lf0/h;->U:Li3/i;

    if-eqz v0, :cond_0

    iget v0, v0, Li3/i;->a:I

    invoke-static {p1, v0}, Li3/w;->i(Li3/z;I)V

    :cond_0
    iget-object v0, p0, Lf0/h;->T:Ljava/lang/String;

    new-instance v1, Lf0/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lf0/a;-><init>(Lf0/h;I)V

    sget-object v2, Li3/w;->a:[Lj93/z;

    sget-object v2, Li3/k;->b:Li3/y;

    new-instance v3, Li3/a;

    invoke-direct {v3, v0, v1}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    move-object v0, p1

    check-cast v0, Li3/l;

    invoke-virtual {v0, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lf0/h;->V:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf0/h;->X:Lf0/i0;

    invoke-virtual {v0, p1}, Lf0/i0;->n(Li3/z;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Li3/w;->a(Li3/z;)V

    :goto_0
    invoke-virtual {p0, p1}, Lf0/h;->a1(Li3/z;)V

    return-void
.end method

.method public r0(Lu2/k;Lu2/l;J)V
    .locals 8

    const/16 v0, 0x21

    shr-long v1, p3, v0

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    shl-long v4, p3, v3

    shr-long/2addr v4, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v0, v1, v4

    shr-long v4, v0, v3

    long-to-int v2, v4

    int-to-float v2, v2

    and-long/2addr v0, v6

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    shl-long v0, v1, v3

    and-long v2, v4, v6

    or-long/2addr v0, v2

    iput-wide v0, p0, Lf0/h;->e0:J

    invoke-virtual {p0}, Lf0/h;->f1()V

    iget-boolean v0, p0, Lf0/h;->V:Z

    if-eqz v0, :cond_1

    sget-object v0, Lu2/l;->x:Lu2/l;

    if-ne p2, v0, :cond_1

    iget v0, p1, Lu2/k;->f:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lf0/g;

    const/4 v4, 0x0

    invoke-direct {v1, p0, v3, v4}, Lf0/g;-><init>(Lf0/h;Lq83/d;I)V

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lf0/g;

    const/4 v4, 0x1

    invoke-direct {v1, p0, v3, v4}, Lf0/g;-><init>(Lf0/h;Lq83/d;I)V

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    iget-object v0, p0, Lf0/h;->Z:Lu2/h0;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lf0/h;->b1()Lu2/h0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    iput-object v0, p0, Lf0/h;->Z:Lu2/h0;

    :cond_2
    iget-object v0, p0, Lf0/h;->Z:Lu2/h0;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p2, p3, p4}, Lu2/h0;->r0(Lu2/k;Lu2/l;J)V

    :cond_3
    return-void
.end method
