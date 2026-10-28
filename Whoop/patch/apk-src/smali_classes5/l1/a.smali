.class public abstract Ll1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Ll1/a;->a:F

    const/16 v0, 0x230

    int-to-float v0, v0

    sput v0, Ll1/a;->b:F

    const/16 v0, 0x18

    int-to-float v0, v0

    new-instance v1, Ll0/l1;

    invoke-direct {v1, v0, v0, v0, v0}, Ll0/l1;-><init>(FFFF)V

    const/16 v1, 0x10

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v2, v2, v2, v1, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    invoke-static {v2, v2, v2, v1, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    invoke-static {v2, v2, v2, v0, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    new-instance v0, Lku2/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lku2/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Ll1/a;->c:Lp1/b0;

    return-void
.end method

.method public static final a(FFLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p3, Lp1/q;

    const v0, -0x36b20a24    # -843613.75f

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit16 v0, p4, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    invoke-virtual {p3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lg1/h;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lg1/h;-><init>(FFI)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Ly2/r0;

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_2

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p3, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p3, Lp1/q;->S:Z

    if-nez v3, :cond_3

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    invoke-static {v1, p3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v0, p2, p3, v2}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_6

    new-instance v0, Lg1/a;

    const/4 v5, 0x1

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lg1/a;-><init>(FFLx1/b;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Lc93/a;Landroidx/compose/ui/Modifier;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x17c55da

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v5, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v5, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eq v2, v3, :cond_8

    move v2, v6

    goto :goto_5

    :cond_8
    move v2, v4

    :goto_5
    and-int/2addr v1, v6

    invoke-virtual {v0, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Ll1/a;->c:Lp1/b0;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/j1;

    new-instance v6, La00/g;

    const/16 v11, 0x14

    move-object v7, p0

    move-object v8, p1

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v6 .. v11}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v6, v0, v4}, Ll1/j1;->a(La00/g;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Ll01/j;

    const/4 v6, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Ll01/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method
