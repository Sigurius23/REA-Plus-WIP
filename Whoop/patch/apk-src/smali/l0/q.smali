.class public abstract Ll0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/v0;

.field public static final b:La0/v0;

.field public static final c:Ll0/t;

.field public static final d:Ll0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Ll0/q;->c(Z)La0/v0;

    move-result-object v0

    sput-object v0, Ll0/q;->a:La0/v0;

    const/4 v0, 0x0

    invoke-static {v0}, Ll0/q;->c(Z)La0/v0;

    move-result-object v1

    sput-object v1, Ll0/q;->b:La0/v0;

    new-instance v1, Ll0/t;

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-direct {v1, v2, v0}, Ll0/t;-><init>(Lb2/h;Z)V

    sput-object v1, Ll0/q;->c:Ll0/t;

    sget-object v0, Ll0/p;->b:Ll0/p;

    sput-object v0, Ll0/q;->d:Ll0/p;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p1, Lp1/q;

    const v0, -0xc96ce69

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    if-eq v2, v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-wide v0, p1, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-static {p1, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {p1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_3
    sget-object v4, La3/k;->g:La3/i;

    sget-object v5, Ll0/q;->d:Ll0/p;

    invoke-static {p1, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p1, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p1, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, p1, Lp1/q;->S:Z

    if-nez v2, :cond_4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    invoke-static {v0, p1, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lbp0/o;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p2, v1}, Lbp0/o;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final b(Ly2/i1;Ly2/j1;Ly2/q0;Ly3/m;IILb2/h;)V
    .locals 7

    invoke-interface {p2}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ll0/o;

    if-eqz v0, :cond_0

    check-cast p2, Ll0/o;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Ll0/o;->O:Lb2/h;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v0, p6

    :goto_2
    iget p2, p1, Ly2/j1;->w:I

    iget p6, p1, Ly2/j1;->x:I

    int-to-long v1, p2

    const/16 p2, 0x20

    shl-long/2addr v1, p2

    int-to-long v3, p6

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    int-to-long v3, p4

    shl-long/2addr v3, p2

    int-to-long p4, p5

    and-long/2addr p4, v5

    or-long/2addr v3, p4

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    return-void
.end method

.method public static final c(Z)La0/v0;
    .locals 3

    new-instance v0, La0/v0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, La0/v0;-><init>(I)V

    sget-object v1, Lb2/e;->w:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->x:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->y:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->z:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->E:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->F:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->G:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->H:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->I:Lb2/m;

    new-instance v2, Ll0/t;

    invoke-direct {v2, v1, p0}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final d(Lb2/h;Z)Ly2/r0;
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Ll0/q;->a:La0/v0;

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/q;->b:La0/v0;

    :goto_0
    invoke-virtual {v0, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/r0;

    if-nez v0, :cond_1

    new-instance v0, Ll0/t;

    invoke-direct {v0, p0, p1}, Ll0/t;-><init>(Lb2/h;Z)V

    :cond_1
    return-object v0
.end method

.method public static final e(Lb2/h;ZLandroidx/compose/runtime/Composer;I)Ll0/t;
    .locals 5

    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    check-cast p2, Lp1/q;

    const p0, 0xe90bed7

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    sget-object p0, Ll0/q;->c:Ll0/t;

    return-object p0

    :cond_0
    check-cast p2, Lp1/q;

    const v0, 0xe917915

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_4
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v4, :cond_5

    goto :goto_1

    :cond_5
    move v2, v1

    :cond_6
    :goto_1
    or-int p3, v0, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_7

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v0, p3, :cond_8

    :cond_7
    new-instance v0, Ll0/t;

    invoke-direct {v0, p0, p1}, Ll0/t;-><init>(Lb2/h;Z)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Ll0/t;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method
