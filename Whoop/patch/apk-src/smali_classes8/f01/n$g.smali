.class public final Lf01/n$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/n;->C(Landroidx/compose/runtime/Composer;I)V
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
    .locals 42

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

    const v0, 0x1f257f0a

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v0, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v9

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v9, v10, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

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

    new-instance v5, Lf01/q;

    new-instance v13, Lkd1/o$a;

    sget v0, Lgy0/a;->s:I

    invoke-direct {v13, v0}, Lkd1/o$a;-><init>(I)V

    const-string v0, "SCHEDULE YOUR NEXT TEST"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v21, Lny0/p;->HIGHLIGHT:Lny0/p;

    new-instance v22, Lcom/whoop/navigation/e;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lny0/h;

    const v40, 0x1ff9f0c

    const/16 v41, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v14 .. v41}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "Starting at $150/test"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v20, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v18, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    new-instance v15, Lhy0/h1;

    const v38, 0x3fffea

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v15 .. v39}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v27, 0x1ff20

    const/16 v28, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const-string v10, "schedule_test_button_card"

    const-string v11, "Time to Update"

    const-string v12, "Your clinical report and action plan are outdated based on newer tests you have uploaded."

    move-object v9, v5

    invoke-direct/range {v9 .. v28}, Lf01/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/c0;Ljava/lang/Integer;Lny0/h;Lhy0/h1;Ljava/util/List;Ljava/util/List;ZLgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lf01/p;Lf01/o;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lf01/n;->n(Lf01/q;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

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

    invoke-virtual {p0, p1, p2}, Lf01/n$g;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
