.class public final Lzc1/s6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/s6;->b(Landroidx/compose/runtime/Composer;I)V
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
    .locals 46

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

    if-eqz v0, :cond_a

    const v0, -0x7254cce6

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v4, v0

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v11, 0x4

    int-to-float v5, v11

    mul-float/2addr v0, v5

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x6

    invoke-static {v0, v5, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v8, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Header, Items And Footer"

    invoke-static {v0, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_4

    sget-object v0, Lzc1/s6$b;->w:Lzc1/s6$b;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v0, "Committed"

    invoke-static {v0, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v13, Lhy0/e;

    const-string v0, "WORKOUTS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v13 .. v18}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v20, Lh31/n;->COMMITTED:Lh31/n;

    const/16 v23, 0x138

    const/16 v24, 0x0

    const-string v14, "committed-rec-1"

    const-string v15, "STRENGTH TRAINING"

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v14 .. v24}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v5

    const-string v14, "committed-rec-2"

    const-string v15, "ZONE 2 RUN"

    invoke-static/range {v14 .. v24}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v6

    const/4 v14, 0x3

    new-array v7, v14, [Lm91/u;

    aput-object v13, v7, v1

    aput-object v5, v7, v2

    aput-object v6, v7, v3

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v23

    sget-object v24, Lh31/f;->COMMITTED:Lh31/f;

    sget-object v26, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    sget-object v28, Lh31/c;->LIST:Lh31/c;

    const/16 v29, 0x8

    const/16 v30, 0x0

    const-string v25, "COMMITTED"

    const/16 v27, 0x0

    invoke-static/range {v24 .. v30}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    move-object/from16 v13, v24

    move-object/from16 v27, v26

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v21, 0x0

    move-object/from16 v24, v5

    invoke-static/range {v21 .. v26}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_5

    sget-object v6, Lzc1/s6$c;->w:Lzc1/s6$c;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Committed - Multiple Dividers"

    invoke-static {v5, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v21, Lhy0/e;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v21 .. v26}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v21

    const/16 v23, 0x138

    const/16 v24, 0x0

    move v6, v14

    const-string v14, "dividers-rec-1"

    const-string v15, "STRENGTH TRAINING"

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v32, v6

    invoke-static/range {v14 .. v24}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v6

    const/16 v42, 0x17c

    const/16 v43, 0x0

    const-string v33, "dividers-rec-2"

    const-string v34, "ZONE 2 RUN"

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-static/range {v33 .. v43}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v7

    new-instance v14, Lhy0/e;

    const-string v33, "OTHER"

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x3

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v43, 0x17c

    const/16 v44, 0x0

    const-string v34, "dividers-rec-3"

    const-string v35, "PROTEIN"

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v9

    const/4 v15, 0x5

    new-array v10, v15, [Lm91/u;

    aput-object v5, v10, v1

    aput-object v6, v10, v2

    aput-object v7, v10, v3

    aput-object v14, v10, v32

    aput-object v9, v10, v11

    invoke-static {v10}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v23

    const/16 v29, 0x8

    const/16 v30, 0x0

    const-string v25, "COMMITTED"

    move-object/from16 v26, v27

    const/16 v27, 0x0

    move-object/from16 v24, v13

    invoke-static/range {v24 .. v30}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v5

    move-object/from16 v27, v26

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v21, 0x0

    move-object/from16 v24, v5

    invoke-static/range {v21 .. v26}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_6

    sget-object v6, Lzc1/s6$d;->w:Lzc1/s6$d;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Loading - Multiple Dividers"

    invoke-static {v5, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v21, Lhy0/e;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v21 .. v26}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v21

    const/16 v23, 0x138

    const/16 v24, 0x0

    const-string v14, "dividers-rec-1"

    move v6, v15

    const-string v15, "STRENGTH TRAINING"

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v14 .. v24}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v7

    const/16 v43, 0x17c

    const/16 v44, 0x0

    const-string v34, "dividers-rec-2"

    const-string v35, "ZONE 2 RUN"

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v9

    new-instance v14, Lhy0/e;

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x3

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v34, "dividers-rec-3"

    const-string v35, "PROTEIN"

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v10

    new-array v15, v6, [Lm91/u;

    aput-object v5, v15, v1

    aput-object v7, v15, v2

    aput-object v9, v15, v3

    aput-object v14, v15, v32

    aput-object v10, v15, v11

    invoke-static {v15}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v23

    sget-object v25, Lh31/f;->LOADING:Lh31/f;

    const/16 v30, 0x8

    const/16 v31, 0x0

    const-string v26, ""

    move-object/from16 v29, v28

    const/16 v28, 0x0

    invoke-static/range {v25 .. v31}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v24

    move-object/from16 v28, v29

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v21, 0x0

    invoke-static/range {v21 .. v26}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_7

    sget-object v7, Lzc1/s6$e;->w:Lzc1/s6$e;

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    move v14, v6

    move-object v6, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Uncommitted - Multiple Dividers"

    invoke-static {v5, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v21, Lhy0/e;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v21 .. v26}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v43, 0x178

    const/16 v44, 0x0

    const-string v34, "dividers-rec-1"

    const-string v35, "STRENGTH TRAINING"

    const/16 v36, 0x1

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v5

    const/16 v43, 0x17c

    const-string v34, "dividers-rec-2"

    const-string v35, "ZONE 2 RUN"

    const/16 v36, 0x0

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v6

    new-instance v34, Lhy0/e;

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    const/16 v38, 0x3

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v34 .. v39}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v44, 0x17c

    const/16 v45, 0x0

    const-string v35, "dividers-rec-3"

    const-string v36, "PROTEIN"

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v35 .. v45}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v7

    new-array v9, v14, [Lm91/u;

    aput-object v21, v9, v1

    aput-object v5, v9, v2

    aput-object v6, v9, v3

    aput-object v34, v9, v32

    aput-object v7, v9, v11

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v37

    sget-object v38, Lh31/f;->UNCOMMITTED:Lh31/f;

    sget-object v40, Lgz0/m0;->ADD:Lgz0/m0;

    const/16 v43, 0x18

    const/16 v44, 0x0

    const-string v39, "COMMIT"

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v38 .. v44}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v38

    const/16 v39, 0x3

    const/16 v40, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v35 .. v40}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_8

    sget-object v6, Lzc1/s6$f;->w:Lzc1/s6$f;

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Expansion"

    invoke-static {v5, v8, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v21, Lhy0/e;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v25, 0x3

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v21 .. v26}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v21

    const/16 v43, 0x17c

    const/16 v44, 0x0

    const-string v34, "expansion-rec-1"

    const-string v35, "STRENGTH TRAINING"

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v34 .. v44}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v5

    invoke-static {}, Lh31/l;->h()Ljava/util/List;

    move-result-object v18

    const/16 v23, 0x100

    const/16 v24, 0x0

    move v6, v14

    const-string v14, "expansion-rec-2"

    const-string v15, "ZONE 2 RUN"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v14 .. v24}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v7

    new-instance v14, Lhy0/e;

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x3

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x17c

    const/16 v25, 0x0

    const-string v15, "expansion-rec-3"

    const-string v16, "PROTEIN"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v15 .. v25}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v9

    new-array v6, v6, [Lm91/u;

    aput-object v0, v6, v1

    aput-object v5, v6, v2

    aput-object v7, v6, v3

    aput-object v14, v6, v32

    aput-object v9, v6, v11

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v29, 0x8

    const/16 v30, 0x0

    const-string v25, "COMMITTED"

    move-object/from16 v26, v27

    const/16 v27, 0x0

    move-object/from16 v24, v13

    invoke-static/range {v24 .. v30}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v18

    const/16 v19, 0x3

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v15 .. v20}, Lg81/b;->j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_9

    sget-object v0, Lzc1/s6$g;->w:Lzc1/s6$g;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/s6$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
