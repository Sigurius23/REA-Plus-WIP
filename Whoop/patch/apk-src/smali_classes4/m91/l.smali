.class public abstract Lm91/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\n\u001aW\u0010\u000b\u001a\u00020\t\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0005H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aM\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0005H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"\u00a8\u0006%\u00b2\u0006\u000e\u0010$\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lm91/u;",
        "T",
        "item",
        "Lm91/p;",
        "itemFactory",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/Modifier;",
        "modifierBuilder",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "r",
        "(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/o;",
        "itemWrapper",
        "q",
        "(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "content",
        "l",
        "(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "Lp1/t1;",
        "a",
        "Lp1/t1;",
        "C",
        "()Lp1/t1;",
        "LocalItemViewFactory",
        "",
        "<set-?>",
        "b",
        "Lp1/c1;",
        "B",
        "()Z",
        "D",
        "(Z)V",
        "debugDesignSystemEnabled",
        "visible",
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:Lp1/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lm91/l;->a:Lp1/t1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    sput-object v0, Lm91/l;->b:Lp1/c1;

    return-void
.end method

.method private static final A()Lm91/p;
    .locals 1

    invoke-static {}, Lm91/m;->m()Lm91/p;

    move-result-object v0

    return-object v0
.end method

.method public static final B()Z
    .locals 1

    sget-object v0, Lm91/l;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static final C()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lm91/l;->a:Lp1/t1;

    return-object v0
.end method

.method public static final D(Z)V
    .locals 1

    sget-object v0, Lm91/l;->b:Lp1/c1;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {v0, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lm91/l;->v(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/p;Lm91/u;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lm91/l;->u(Lm91/p;Lm91/u;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lm91/l;->z(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lm91/l;->s(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm91/l;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lm91/l;->w(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lm91/o;Lkotlin/jvm/functions/Function1;Lm91/p;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm91/l;->y(Lm91/o;Lkotlin/jvm/functions/Function1;Lm91/p;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lm91/u;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm91/l;->p(Lm91/u;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Lm91/p;
    .locals 1

    invoke-static {}, Lm91/l;->A()Lm91/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm91/l;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm91/l;->o(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x1266c1fa

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v3, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-static {}, Lm91/l;->B()Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, -0x64055022

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v6, v3, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_9

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lp1/c1;

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Lm91/l;->m(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_b

    const v4, -0x95fce7c

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_a

    new-instance v9, Lh01/i;

    const/4 v6, 0x4

    invoke-direct {v9, v6, v5}, Lh01/i;-><init>(ILp1/c1;)V

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v14, v9

    check-cast v14, Lc93/a;

    const/16 v15, 0xf

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v5, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-wide v9, Li2/x;->b:J

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v9, v10, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v9, v4

    move-object v4, v5

    sget-wide v5, Li2/x;->h:J

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v10, v3, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v10

    invoke-virtual {v10}, Lb91/a;->d()Ll3/v0;

    move-result-object v19

    const/16 v22, 0x0

    const v23, 0x1fff8

    move v10, v7

    move v11, v8

    const-wide/16 v7, 0x0

    move-object/from16 v20, v3

    move-object v3, v9

    const/4 v9, 0x0

    move v12, v10

    move v13, v11

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move/from16 v25, v21

    const/16 v21, 0x180

    move/from16 v0, v24

    invoke-static/range {v3 .. v23}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v0, v8

    const v4, -0x959d6a5

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    move v0, v8

    const v5, -0x63fc52fd

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v4, v1, v3, v0}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v3, La11/j;

    const/16 v4, 0xc

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final m(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final n(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lm91/l;->n(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lm91/u;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm91/l;->l(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/o;",
            "Lm91/p;",
            "Lkotlin/jvm/functions/Function3;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v0, "itemWrapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x69ebdcef

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

    and-int/lit8 v2, p6, 0x2

    if-nez v2, :cond_2

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    and-int/lit8 v2, p6, 0x4

    if-nez v2, :cond_4

    invoke-virtual {v0, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0xc00

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v5, 0xc00

    if-nez v3, :cond_8

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x800

    goto :goto_4

    :cond_7
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v1, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v1, 0x493

    const/16 v4, 0x492

    const/4 v6, 0x1

    if-eq v3, v4, :cond_9

    move v3, v6

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_6
    and-int/2addr v1, v6

    invoke-virtual {v0, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v5, 0x1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_b
    :goto_7
    move-object v9, p1

    move-object v10, p2

    move-object v8, p3

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_d

    sget-object p1, Lm91/l;->a:Lp1/t1;

    invoke-virtual {v0, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm91/p;

    :cond_d
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_e

    new-instance p2, Lm91/k;

    invoke-direct {p2}, Lm91/k;-><init>()V

    :cond_e
    if-eqz v2, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p3, v1, :cond_f

    new-instance p3, Lm91/d;

    const/4 v1, 0x2

    invoke-direct {p3, v1}, Lm91/d;-><init>(I)V

    invoke-virtual {v0, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast p3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :goto_9
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-virtual {p0}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    new-instance v6, Lat2/u;

    const/16 v11, 0x17

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p2, -0x5a4ae0d7

    invoke-static {p2, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 p3, 0x30

    invoke-static {p1, p2, v0, p3}, Lm91/l;->l(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v8

    move-object v2, v9

    move-object v3, v10

    goto :goto_a

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance v0, Lkw1/c;

    const/16 v7, 0xe

    move-object v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm91/u;",
            ">(TT;",
            "Lm91/p;",
            "Lkotlin/jvm/functions/Function3;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move v6, p5

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p4

    check-cast v7, Lp1/q;

    const v0, -0xd0e34e2

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p6, 0x2

    if-nez v2, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_6

    and-int/lit8 v3, p6, 0x4

    if-nez v3, :cond_5

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_6
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0xc00

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_9

    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_5

    :cond_8
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_9
    :goto_6
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    if-eq v8, v9, :cond_a

    const/4 v8, 0x1

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    :goto_7
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v7, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    if-eqz v8, :cond_f

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_c

    and-int/lit8 v0, v0, -0x71

    :cond_c
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_d

    and-int/lit16 v0, v0, -0x381

    :cond_d
    move-object v2, p1

    move-object v3, p2

    :cond_e
    move-object v5, p3

    :goto_8
    move v4, v0

    goto :goto_c

    :cond_f
    :goto_9
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_10

    sget-object v2, Lm91/l;->a:Lp1/t1;

    invoke-virtual {v7, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/p;

    and-int/lit8 v0, v0, -0x71

    goto :goto_a

    :cond_10
    move-object v2, p1

    :goto_a
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_11

    new-instance v3, Lc41/c5;

    const/4 v8, 0x6

    invoke-direct {v3, v8}, Lc41/c5;-><init>(I)V

    and-int/lit16 v0, v0, -0x381

    goto :goto_b

    :cond_11
    move-object v3, p2

    :goto_b
    if-eqz v4, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_12

    new-instance v4, Llb1/z4;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Llb1/z4;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, v4

    goto :goto_8

    :goto_c
    invoke-virtual {v7}, Lp1/q;->r()V

    new-instance v0, La11/e;

    move-object v1, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, La11/e;-><init>(Lm91/p;Lm91/u;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function1;)V

    move-object v2, v1

    const v8, -0x4114ddfa

    invoke-static {v8, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit8 v8, v4, 0x8

    or-int/lit8 v8, v8, 0x30

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v4, v8

    invoke-static {p0, v0, v7, v4}, Lm91/l;->l(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v5

    goto :goto_d

    :cond_13
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lb11/c;

    const/4 v7, 0x4

    move-object v1, p0

    move v5, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb11/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final s(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x5c5a51cf

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lm91/p;Lm91/u;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p6, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p6, v2

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p6, v0}, Lp1/q;->U(IZ)Z

    move-result p6

    if-eqz p6, :cond_1

    invoke-virtual {p0, p1}, Lm91/p;->c(Lm91/u;)Lm91/f;

    move-result-object p0

    and-int/lit8 p3, p3, 0x8

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-interface {p2, p1, p5, p6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/compose/ui/Modifier;

    shl-int/lit8 p3, p3, 0x3

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    move-object v3, p5

    move p5, p3

    move-object p3, p4

    move-object p4, v3

    invoke-interface/range {p0 .. p5}, Lm91/f;->Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    move-object p4, p5

    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x2c599027

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lm91/o;Lkotlin/jvm/functions/Function1;Lm91/p;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p5, v3

    move-object v7, p4

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p5, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p4

    invoke-virtual {v7, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p5, Lpf3/a;->b:Lnf3/a;

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    iget-object p5, p5, Lnf3/a;->a:Lwf3/a;

    if-eqz p5, :cond_1

    iget-object p5, p5, Lwf3/a;->d:Lxf3/c;

    goto :goto_1

    :cond_1
    move-object p5, v0

    :goto_1
    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_5

    :cond_2
    if-eqz p5, :cond_4

    const-class v1, Lvc1/a;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p5, v0, v1, v0}, Lxf3/c;->c(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p5

    if-nez p5, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, p5

    goto :goto_3

    :cond_4
    :goto_2
    move-object v3, v0

    :goto_3
    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lvc1/a;

    sget-object p5, Lm91/g;->a:Lm91/g;

    const-string v1, "android-item-tap-reporter"

    invoke-interface {p4, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_6

    move-object v0, v3

    :cond_6
    invoke-virtual {p5, p0, p1, v0}, Lm91/g;->b(Lm91/o;Lkotlin/jvm/functions/Function1;Lvc1/a;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-virtual {p0}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm91/p;->c(Lm91/u;)Lm91/f;

    move-result-object v3

    invoke-virtual {p0}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p1, v7, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroidx/compose/ui/Modifier;

    invoke-virtual {p0}, Lm91/o;->e()Lm91/u;

    move-result-object v5

    const/4 v8, 0x0

    invoke-interface/range {v3 .. v8}, Lm91/f;->Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
