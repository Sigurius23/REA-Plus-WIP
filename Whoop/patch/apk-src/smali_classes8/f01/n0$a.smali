.class public final Lf01/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/n0;->w(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 35

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, 0x79084532

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v0, v3

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v0, v4, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lo61/f;->a:Lo61/f;

    invoke-virtual {v0}, Lo61/f;->e()Lf01/o0;

    move-result-object v9

    new-instance v18, Lhy0/h1;

    const-string v3, "BETA V1.0"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const v33, 0x3ffffe

    const/16 v34, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v10, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v10 .. v34}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x2ff

    const/16 v21, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x0

    invoke-static/range {v9 .. v21}, Lf01/o0;->b(Lf01/o0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lj71/c;Lf01/k0;Lf01/p0;Lcom/whoop/navigation/e;Lm91/u;Ljava/util/List;ILjava/lang/Object;)Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_4

    sget-object v3, Lf01/n0$b;->w:Lf01/n0$b;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lo61/f;->b()Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_5

    sget-object v3, Lf01/n0$c;->w:Lf01/n0$c;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lo61/f;->d()Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_6

    sget-object v3, Lf01/n0$d;->w:Lf01/n0$d;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lo61/f;->c()Lf01/o0;

    move-result-object v9

    new-instance v3, Lv31/g;

    const-string v5, "Wear WHOOP to sleep for 4 nights to fully calibrate your Recovery Score."

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lv31/a;

    sget-object v7, Lv31/b;->DISCRETE:Lv31/b;

    const/4 v10, 0x7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct {v6, v7, v10, v11, v12}, Lv31/a;-><init>(Lv31/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V

    sget-object v7, Lv31/h;->ONBOARDING:Lv31/h;

    invoke-direct {v3, v5, v6, v12, v7}, Lv31/g;-><init>(Lcom/whoop/design/util/TextResource;Lv31/a;Lgz0/m0;Lv31/h;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x1ff

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v3, v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v9 .. v21}, Lf01/o0;->b(Lf01/o0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lj71/c;Lf01/k0;Lf01/p0;Lcom/whoop/navigation/e;Lm91/u;Ljava/util/List;ILjava/lang/Object;)Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_7

    sget-object v5, Lf01/n0$e;->w:Lf01/n0$e;

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v7, v5

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lo61/f;->f()Lf01/o0;

    move-result-object v9

    invoke-virtual {v0}, Lo61/f;->f()Lf01/o0;

    move-result-object v5

    invoke-virtual {v5}, Lf01/o0;->h()Lf01/p0;

    move-result-object v10

    if-eqz v10, :cond_8

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static/range {v10 .. v16}, Lf01/p0;->b(Lf01/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;ZILjava/lang/Object;)Lf01/p0;

    move-result-object v12

    move-object/from16 v16, v12

    goto :goto_2

    :cond_8
    move-object/from16 v16, v3

    :goto_2
    const/16 v20, 0x3bf

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v9 .. v21}, Lf01/o0;->b(Lf01/o0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lj71/c;Lf01/k0;Lf01/p0;Lcom/whoop/navigation/e;Lm91/u;Ljava/util/List;ILjava/lang/Object;)Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    sget-object v3, Lf01/n0$f;->w:Lf01/n0$f;

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lo61/f;->g()Lf01/o0;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    sget-object v0, Lf01/n0$g;->w:Lf01/n0$g;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lf01/n0$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
