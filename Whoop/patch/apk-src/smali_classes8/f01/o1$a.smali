.class public final Lf01/o1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/o1;->p(Landroidx/compose/runtime/Composer;I)V
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
    .locals 65

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

    const v0, -0x584ff256

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/k1;

    const-string v0, "Female Health Panel"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v0, "Get insights from hormones and fertility to bone health and libido."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v15, Lb91/c;->B1:Lb91/c;

    sget-object v16, Lb91/c;->B2:Lb91/c;

    const/16 v21, 0x498

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x2

    const/16 v20, 0x0

    invoke-direct/range {v9 .. v22}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lsz0/c0;

    sget-object v12, Lb91/c;->N8:Lb91/c;

    sget-object v18, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v15, Lgz0/m0;->EDUCATION:Lgz0/m0;

    const/16 v21, 0x3e0

    const-string v11, "**$299** | 73 biomarkers tested"

    const/4 v14, 0x5

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v10 .. v22}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v10

    new-instance v14, Lhy0/h1;

    const-string v4, "Recommended"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v22, Lhy0/o1;->COACH_RECOMMENDED:Lhy0/o1;

    int-to-float v4, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v39, v4, v5

    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v24

    const v37, 0x3ffd7e

    const/16 v38, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v14 .. v38}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x3

    new-array v6, v5, [Lm91/u;

    aput-object v14, v6, v1

    aput-object v9, v6, v2

    aput-object v0, v6, v3

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    new-instance v19, Lf01/p1;

    new-instance v6, Lkd1/o$a;

    sget v7, Lgy0/a;->s:I

    invoke-direct {v6, v7}, Lkd1/o$a;-><init>(I)V

    const/16 v22, 0x20

    const/16 v23, 0x0

    const-string v16, "product-test-card"

    move-object/from16 v15, v19

    const/16 v19, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v15 .. v23}, Lf01/p1;-><init>(Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v15

    int-to-float v7, v2

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v7, v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    mul-float/2addr v4, v10

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v4, v10, v8, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v10, v8, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v4, Lsz0/m;

    const-string v38, " 0 Test remaining "

    invoke-static/range {v38 .. v38}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v21, Lhy0/o1;->OVULATION:Lhy0/o1;

    sget-object v16, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v23

    new-instance v7, Lhy0/c1;

    sget-object v10, Ly81/f;->WHITE_20:Ly81/f;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct {v7, v10, v11, v3, v12}, Lhy0/c1;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v13

    new-instance v13, Lhy0/h1;

    const v36, 0x3bfd6a

    const/16 v37, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v32, v7

    invoke-direct/range {v13 .. v37}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v16

    move-object/from16 v28, v18

    const-string v7, "Retest in 64 days"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v41

    sget-object v7, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v43, Ly81/f;->RECOVERY_10:Ly81/f;

    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v50

    new-instance v11, Lhy0/c1;

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct {v11, v7, v12, v3, v14}, Lhy0/c1;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lhy0/h1;

    const v63, 0x3bfd6a

    const/16 v64, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    move-object/from16 v45, v7

    move-object/from16 v59, v11

    move-object/from16 v48, v21

    invoke-direct/range {v40 .. v64}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v40

    filled-new-array {v13, v7}, [Lhy0/h1;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v4

    invoke-direct/range {v14 .. v19}, Lsz0/m;-><init>(Ljava/util/List;Lb2/g;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v40, "Comprehensive Health Panel"

    invoke-static/range {v40 .. v40}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v41, "Expiring on Sep 12, 2026"

    invoke-static/range {v41 .. v41}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/16 v21, 0x7f9

    const/16 v22, 0x0

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v9 .. v22}, Lsz0/k1;->b(Lsz0/k1;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILjava/lang/Object;)Lsz0/k1;

    move-result-object v10

    move-object v11, v9

    new-array v9, v5, [Lm91/u;

    aput-object v4, v9, v1

    aput-object v10, v9, v2

    aput-object v0, v9, v3

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    new-instance v23, Lf01/r1;

    sget-object v13, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/16 v17, 0x1

    move-object/from16 v12, v23

    invoke-direct/range {v12 .. v17}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    move-object v4, v13

    const/16 v26, 0x32

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v20, "product-test-card-multiple-tags"

    move-object/from16 v19, v6

    invoke-static/range {v19 .. v27}, Lf01/p1;->b(Lf01/p1;Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILjava/lang/Object;)Lf01/p1;

    move-result-object v6

    move-object/from16 v42, v19

    const/4 v9, 0x0

    const/4 v10, 0x6

    move v12, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lf01/o1;->j(Lf01/p1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v38 .. v38}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v23

    new-instance v5, Lhy0/c1;

    const/4 v6, 0x0

    invoke-direct {v5, v13, v6, v3, v7}, Lhy0/c1;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lhy0/h1;

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v18, v28

    const/16 v28, 0x0

    move-object/from16 v16, v29

    const/16 v29, 0x0

    move-object/from16 v32, v5

    move-object/from16 v21, v48

    invoke-direct/range {v13 .. v37}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v13

    invoke-static/range {v40 .. v40}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v41 .. v41}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v21, 0x7f9

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v9, v11

    move-object v11, v6

    move v6, v12

    move-object v12, v7

    invoke-static/range {v9 .. v22}, Lsz0/k1;->b(Lsz0/k1;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILjava/lang/Object;)Lsz0/k1;

    move-result-object v7

    new-array v6, v6, [Lm91/u;

    aput-object v5, v6, v1

    aput-object v7, v6, v2

    aput-object v0, v6, v3

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    new-instance v23, Lf01/r1;

    const/16 v17, 0x1

    move-object v13, v4

    move-object/from16 v12, v23

    invoke-direct/range {v12 .. v17}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    const/16 v26, 0x32

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v20, "product-test-card-multiple-tags"

    move-object/from16 v19, v42

    invoke-static/range {v19 .. v27}, Lf01/p1;->b(Lf01/p1;Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILjava/lang/Object;)Lf01/p1;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lf01/o1;->j(Lf01/p1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v23, Lf01/r1;

    move-object/from16 v12, v23

    invoke-direct/range {v12 .. v17}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    const/16 v26, 0x36

    const/16 v22, 0x0

    const-string v20, "product-test-card-caret"

    invoke-static/range {v19 .. v27}, Lf01/p1;->b(Lf01/p1;Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILjava/lang/Object;)Lf01/p1;

    move-result-object v5

    invoke-static/range {v5 .. v10}, Lf01/o1;->j(Lf01/p1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v23, Lf01/r1;

    sget-object v10, Lgz0/m0;->ADD:Lgz0/m0;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v23

    invoke-direct/range {v9 .. v14}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    const-string v20, "product-test-card-add"

    invoke-static/range {v19 .. v27}, Lf01/p1;->b(Lf01/p1;Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILjava/lang/Object;)Lf01/p1;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x6

    invoke-static/range {v5 .. v10}, Lf01/o1;->j(Lf01/p1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v23, Lf01/r1;

    sget-object v10, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    const/4 v14, 0x0

    move-object/from16 v9, v23

    invoke-direct/range {v9 .. v14}, Lf01/r1;-><init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V

    const-string v20, "product-test-card-checkmark-selected"

    invoke-static/range {v19 .. v27}, Lf01/p1;->b(Lf01/p1;Ljava/lang/String;Lkd1/o;Ljava/util/List;Lf01/r1;Lcom/whoop/navigation/e;Ljava/lang/Object;ILjava/lang/Object;)Lf01/p1;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x6

    invoke-static/range {v5 .. v10}, Lf01/o1;->j(Lf01/p1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

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

    invoke-virtual {p0, p1, p2}, Lf01/o1$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
