.class public final Lzc1/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/j0;->b(Landroidx/compose/runtime/Composer;I)V
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
    .locals 24

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

    if-eqz v0, :cond_4

    const v0, -0x4b17086a

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

    new-instance v6, Lf01/u;

    sget-object v12, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    sget-object v0, Le81/b;->a:Le81/b;

    invoke-virtual {v0}, Le81/b;->n()Le81/n;

    move-result-object v14

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x88

    const/16 v19, 0x0

    const-string v10, "advanced_labs_populated"

    const-string v11, "ADVANCED LABS"

    const/4 v13, 0x0

    move-object/from16 v16, v15

    const-string v15, "ADVANCED LABS"

    move-object v9, v6

    invoke-direct/range {v9 .. v19}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lf01/u;->i:I

    shl-int/lit8 v9, v3, 0x3

    const/4 v10, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t;->f(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v13, Lf01/u;

    invoke-virtual {v0}, Le81/b;->h()Le81/n;

    move-result-object v18

    const/16 v22, 0xc8

    const/16 v23, 0x0

    const-string v14, "simple_container_empty"

    const-string v15, "SIMPLE CONTAINER"

    const/16 v16, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v13

    invoke-static/range {v5 .. v10}, Lf01/t;->f(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v3, v9

    new-instance v6, Lf01/u;

    invoke-virtual {v0}, Le81/b;->k()Le81/n;

    move-result-object v14

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x88

    const/16 v19, 0x0

    const-string v10, "full_biomarker_data"

    const-string v11, "FULL BIOMARKER DATA"

    const/4 v13, 0x0

    move-object/from16 v16, v15

    const-string v15, "FULL DATA"

    move-object v9, v6

    invoke-direct/range {v9 .. v19}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x5

    move v9, v3

    invoke-static/range {v5 .. v10}, Lf01/t;->f(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/j0$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
