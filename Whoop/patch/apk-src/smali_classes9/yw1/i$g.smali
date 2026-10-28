.class public final Lyw1/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw1/i;->o(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Luw1/c$c;

.field final synthetic F:Lp1/c1;

.field final synthetic G:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lkotlin/jvm/functions/Function1;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lg1/y3;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Luw1/c$c;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lyw1/i$g;->w:Ljava/util/List;

    iput-object p2, p0, Lyw1/i$g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lyw1/i$g;->y:Lbc3/c0;

    iput-object p4, p0, Lyw1/i$g;->z:Lg1/y3;

    iput-object p5, p0, Lyw1/i$g;->E:Luw1/c$c;

    iput-object p6, p0, Lyw1/i$g;->F:Lp1/c1;

    iput-object p7, p0, Lyw1/i$g;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Lyw1/i$g;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljx1/f0;

    const v2, -0xa90c836

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x3

    int-to-float v4, v2

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x66923f4a

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljx1/f0;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lm91/u;

    instance-of v4, v8, Lq21/i;

    if-eqz v4, :cond_8

    const v4, -0x4758f965

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v6

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v4, v5, v15, v12, v7}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_6

    :cond_8
    const v4, -0x475763f9

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_6
    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v5, v12, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Luw1/e;->c()Lm91/p;

    move-result-object v9

    sget-object v10, Lyw1/i$b;->w:Lyw1/i$b;

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lyw1/i$g;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lyw1/i$g;->y:Lbc3/c0;

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lyw1/i$g;->z:Lg1/y3;

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lyw1/i$g;->E:Luw1/c$c;

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_c

    goto :goto_8

    :cond_c
    move/from16 p1, v2

    move-object/from16 v17, v8

    goto :goto_9

    :cond_d
    :goto_8
    new-instance v16, Lyw1/i$c;

    iget-object v4, v0, Lyw1/i$g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lyw1/i$g;->E:Luw1/c$c;

    iget-object v11, v0, Lyw1/i$g;->y:Lbc3/c0;

    iget-object v13, v0, Lyw1/i$g;->F:Lp1/c1;

    iget-object v14, v0, Lyw1/i$g;->G:Lp1/c1;

    move/from16 p1, v2

    iget-object v2, v0, Lyw1/i$g;->z:Lg1/y3;

    move-object/from16 v23, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v17, v8

    move-object/from16 v20, v11

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    invoke-direct/range {v16 .. v23}, Lyw1/i$c;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;Luw1/c$c;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)V

    move-object/from16 v5, v16

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object v11, v5

    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v2, Lm91/p;->b:I

    shl-int/lit8 v13, v2, 0x3

    const/4 v14, 0x0

    move-object/from16 v8, v17

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v2, p1

    goto/16 :goto_5

    :cond_e
    invoke-static {v12, v7, v6, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-void

    :cond_f
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lyw1/i$g;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
