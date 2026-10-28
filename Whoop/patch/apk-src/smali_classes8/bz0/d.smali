.class public abstract Lbz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\"\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "f",
        "h",
        "",
        "",
        "a",
        "Ljava/util/List;",
        "positionsInParent",
        "Ly81/e;",
        "b",
        "colors",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly81/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lbz0/d;->a:Ljava/util/List;

    sget-object v0, Lbz0/d$a;->w:Lbz0/d$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v1, Lbz0/d$b;->w:Lbz0/d$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object v2, Lbz0/d$c;->w:Lbz0/d$c;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    sget-object v3, Lbz0/d$d;->w:Lbz0/d$d;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    sget-object v4, Lbz0/d$e;->w:Lbz0/d$e;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Ly81/e;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lbz0/d;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbz0/d;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbz0/d;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbz0/d;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x341da2e6    # -2.966994E7f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    const/16 v4, 0x190

    int-to-float v4, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->o()J

    move-result-wide v9

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v9, v10, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v7, v9, v1, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v9, v1, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v1, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v13, 0x3

    int-to-float v13, v13

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v13, v14

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v1, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v1, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-eqz v2, :cond_4

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v1, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v14, v1, v14, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v1, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x2bdb867b

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const-string v2, "70%"

    const-string v4, "90%"

    const-string v7, "10%"

    const-string v9, "30%"

    const-string v10, "50%"

    filled-new-array {v7, v9, v10, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_3
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v4, v7

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v25, 0x0

    const v26, 0x3fff8

    move-object v11, v5

    move v7, v6

    const-wide/16 v5, 0x0

    move v12, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v23, v1

    move-object v1, v2

    move-object v2, v4

    move-wide/from16 v33, v9

    move v10, v3

    move-wide/from16 v3, v33

    const/4 v9, 0x0

    move v15, v10

    move-object v14, v11

    const-wide/16 v10, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v24

    const/16 v24, 0x30

    move-object/from16 v32, v30

    const/4 v0, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v23

    move/from16 v8, v29

    move-object/from16 v5, v32

    const/4 v3, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_7
    move-object/from16 v32, v5

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    const/4 v15, 0x1

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    move-object/from16 v14, v32

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lbz0/d;->f(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1, v0}, Lbz0/d;->h(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, La11/h;

    const/16 v2, 0x1c

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, La11/h;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lbz0/d;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x6fb9cb2b    # 1.1500068E29f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lbz0/d;->a:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    const/4 v8, 0x0

    if-ltz v5, :cond_3

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v10

    sget-object v12, Lg61/f;->X_AXIS:Lg61/f;

    sget-object v6, Lbz0/d;->b:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ly81/e;

    rem-int/lit8 v6, v5, 0x2

    if-nez v6, :cond_1

    const-string v6, " Label"

    move-object v14, v6

    goto :goto_2

    :cond_1
    move-object v14, v8

    :goto_2
    rem-int/lit8 v5, v5, 0x4

    if-nez v5, :cond_2

    sget-object v5, Lj61/i;->SAGE_HIGH:Lj61/i;

    :goto_3
    move-object v15, v5

    goto :goto_4

    :cond_2
    sget-object v5, Lj61/i;->DEFAULT:Lj61/i;

    goto :goto_3

    :goto_4
    new-instance v9, Lj61/f;

    const/16 v17, 0x48

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8, v9, v1, v2, v3}, Lbz0/b;->b(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V

    move v5, v7

    goto :goto_1

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_5
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, La11/h;

    const/16 v3, 0x1d

    invoke-direct {v2, v0, v3}, La11/h;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lbz0/d;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x15a0a5fd

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lbz0/d;->a:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    const/4 v8, 0x0

    if-ltz v5, :cond_1

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v10

    sget-object v12, Lg61/f;->Y_AXIS:Lg61/f;

    sget-object v6, Lbz0/d;->b:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ly81/e;

    new-instance v9, Lj61/f;

    const/16 v17, 0x78

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8, v9, v1, v2, v3}, Lbz0/b;->b(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V

    move v5, v7

    goto :goto_1

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_3
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lbz0/c;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lbz0/c;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lbz0/d;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
