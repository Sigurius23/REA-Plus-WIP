.class public final Led1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Led1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ3\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000fH\u0017\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Led1/a;",
        "Lm91/f;",
        "Led1/b;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "",
        "key",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "h",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;)Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Led1/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Led1/a;->f(Led1/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Led1/a;Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Led1/a;->g(Led1/a;Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Led1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Led1/a;->e(Lkotlin/jvm/functions/Function1;Led1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Led1/b;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Led1/b;->i()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Led1/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v6, v7, v4, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v4, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v7, v4, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Led1/b;->j()Lc93/m;

    move-result-object v5

    if-eqz v5, :cond_7

    const v5, 0x78ae2f05

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb2/e;->E:Lb2/m;

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v4, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->n()J

    move-result-wide v11

    sget-object v13, Li2/w0;->a:Li2/v0;

    move-object/from16 v14, p1

    invoke-static {v14, v11, v12, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v12, 0x10

    int-to-float v12, v12

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v11, v3

    const/16 v12, 0x8c

    int-to-float v12, v12

    invoke-static {v0, v11, v12}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v11, v4, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v4, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v11, v4, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Led1/b;->j()Lc93/m;

    move-result-object v0

    invoke-static {v3, v0, v4, v2, v3}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_3

    :cond_7
    const v0, 0x78b4a8ac

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Led1/b;->l()Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0x8

    int-to-float v5, v5

    move v6, v5

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v4, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->q()Lb91/a;

    move-result-object v24

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v28, v11, 0x12

    const v29, 0x2fff8

    move v11, v6

    move-object v12, v7

    move-wide v6, v9

    move v10, v8

    const-wide/16 v8, 0x0

    move v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    move-object/from16 v20, v18

    const-wide/16 v17, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x30

    move-object v2, v4

    move-object v4, v0

    move/from16 v0, v26

    move-object/from16 v26, v2

    move/from16 v3, v30

    move-object/from16 v2, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Led1/b;->k()Z

    move-result v5

    if-eqz v5, :cond_8

    const v5, 0x78b95780

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Led1/b;->h()Ljava/lang/String;

    move-result-object v11

    const/4 v7, 0x0

    const/4 v10, 0x2

    move v8, v0

    move v9, v0

    move v6, v0

    move-object v5, v1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->F()J

    move-result-wide v6

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    const/16 v27, 0x30

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v26, v4

    move-object v4, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    const v1, 0x78be35cc

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Led1/a;Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Led1/a;->d(Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final h(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/Object;",
            "Lc93/a;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    new-instance v0, Led1/a$a;

    invoke-direct {v0, p3}, Led1/a$a;-><init>(Lc93/a;)V

    invoke-static {p1, p2, v0}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Led1/b;

    invoke-virtual/range {p0 .. p5}, Led1/a;->d(Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Led1/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v1, p5

    const-string v0, "modifier"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x6855fd83

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v2, v1, 0x30

    const/16 v7, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v7

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v1, 0x180

    const/16 v8, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v8

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v1, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v0, v2

    :cond_7
    and-int/lit16 v2, v0, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v2, v9, :cond_8

    move v2, v11

    goto :goto_5

    :cond_8
    move v2, v10

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v14, v9, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v9, 0x40

    int-to-float v9, v9

    const/16 v12, 0x12c

    int-to-float v12, v12

    invoke-static {v2, v9, v12}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Led1/b;->l()Ljava/lang/String;

    move-result-object v9

    and-int/lit16 v12, v0, 0x380

    if-ne v12, v8, :cond_9

    move v8, v11

    goto :goto_6

    :cond_9
    move v8, v10

    :goto_6
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v7, :cond_a

    move v10, v11

    :cond_a
    or-int v0, v8, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v7, v0, :cond_c

    :cond_b
    new-instance v7, Ld30/l;

    const/16 v0, 0xe

    invoke-direct {v7, v0, v6, v5}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lc93/a;

    invoke-direct {v3, v2, v9, v7}, Led1/a;->h(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v0, 0x0

    const/16 v2, 0x18

    const/high16 v8, 0x3e800000    # 0.25f

    invoke-static {v8, v8, v8, v0, v2}, Li2/w0;->f(FFFFI)J

    move-result-wide v9

    new-instance v0, La0;

    const/16 v2, 0x19

    invoke-direct {v0, v2, v5, v4}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc9c1220

    invoke-static {v2, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const v15, 0x180180

    const/16 v16, 0x3a

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Le51/a;

    const/4 v2, 0x6

    invoke-direct/range {v0 .. v6}, Le51/a;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
