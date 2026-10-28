.class public final Lf01/k1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/k1;->k(Landroidx/compose/runtime/Composer;I)V
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
    .locals 41

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

    if-eqz v0, :cond_9

    const v0, 0x52f1c448

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

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

    invoke-static {v8, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

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
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_4

    sget-object v0, Lf01/k1$c;->w:Lf01/k1$c;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v9

    const/16 v17, 0x6f

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lf01/l1;->b(Lf01/l1;Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf01/l1;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    sget-object v0, Lf01/k1$d;->w:Lf01/k1$d;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v9

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v0

    invoke-virtual {v0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v10

    const/16 v17, 0x2f

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lf01/f1;->b(Lf01/f1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ly81/f;ILjava/lang/Object;)Lf01/f1;

    move-result-object v12

    const/16 v17, 0x6b

    const/4 v10, 0x0

    invoke-static/range {v9 .. v18}, Lf01/l1;->b(Lf01/l1;Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf01/l1;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    sget-object v0, Lf01/k1$e;->w:Lf01/k1$e;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v9

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v0

    invoke-virtual {v0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v10

    sget-object v16, Ly81/f;->SLEEP:Ly81/f;

    const/16 v17, 0xa

    const/16 v18, 0x0

    const-string v11, "HORMONAL BIRTH CONTROL"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v18}, Lf01/f1;->b(Lf01/f1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ly81/f;ILjava/lang/Object;)Lf01/f1;

    move-result-object v12

    const/16 v17, 0x6b

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lf01/l1;->b(Lf01/l1;Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf01/l1;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    sget-object v0, Lf01/k1$f;->w:Lf01/k1$f;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v9

    invoke-static {}, Lf01/k1;->m()Lf01/l1;

    move-result-object v0

    invoke-virtual {v0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v10

    const/16 v17, 0x28

    const/16 v18, 0x0

    const/4 v11, 0x0

    const-string v12, "NEXT PREDICTED PERIOD IN"

    const-string v13, "5-9 Days"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lf01/f1;->b(Lf01/f1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ly81/f;ILjava/lang/Object;)Lf01/f1;

    move-result-object v12

    const-string v0, "LOG PERIOD"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v15, Lgz0/m0;->ADD:Lgz0/m0;

    new-instance v16, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lny0/h;

    const v39, 0x1ff9f7c

    const/16 v40, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v13 .. v40}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x4b

    const/4 v10, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v18}, Lf01/l1;->b(Lf01/l1;Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf01/l1;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_8

    sget-object v0, Lf01/k1$g;->w:Lf01/k1$g;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lf01/k1$b;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
