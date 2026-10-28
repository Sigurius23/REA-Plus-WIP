.class public final Lq81/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq81/g;->C(Landroidx/compose/runtime/Composer;I)V
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
    .locals 26

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, 0x4e2b62bb    # 7.188436E8f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v9, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0xc8

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lq81/i;->ACTIVE:Lq81/i;

    new-instance v12, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "ACTIVE"

    invoke-direct {v12, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_4

    sget-object v6, Lq81/g$c;->w:Lq81/g$c;

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v17, v6

    check-cast v17, Lc93/a;

    new-instance v13, Lq81/b;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x77

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v22}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lq81/h;

    const/4 v14, 0x0

    const/16 v15, 0x8

    move-object v10, v8

    invoke-direct/range {v10 .. v16}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/16 v11, 0xe

    move-object v6, v5

    const/4 v5, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    invoke-static/range {v4 .. v11}, Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lq81/g;->R()F

    move-result v4

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lq81/i;->REST:Lq81/i;

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    const-string v6, "REST"

    invoke-direct {v5, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_5

    sget-object v6, Lq81/g$d;->w:Lq81/g$d;

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    new-instance v16, Lq81/b;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x77

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lq81/h;

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object/from16 v17, v16

    move-object/from16 v16, v5

    invoke-direct/range {v14 .. v20}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/16 v11, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v4 .. v11}, Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lq81/i;->WARMUP:Lq81/i;

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    const-string v6, "WARMUP"

    invoke-direct {v5, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_6

    sget-object v6, Lq81/g$e;->w:Lq81/g$e;

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    new-instance v16, Lq81/b;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x77

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lq81/h;

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object/from16 v17, v16

    move-object/from16 v16, v5

    invoke-direct/range {v14 .. v20}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/16 v11, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v4 .. v11}, Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lq81/i;->COOLDOWN:Lq81/i;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "COOLDOWN"

    invoke-direct {v1, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_7

    sget-object v5, Lq81/g$f;->w:Lq81/g$f;

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v20, v5

    check-cast v20, Lc93/a;

    new-instance v16, Lq81/b;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x77

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lq81/h;

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object/from16 v17, v16

    move-object/from16 v16, v1

    invoke-direct/range {v14 .. v20}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/16 v11, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v4 .. v11}, Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V

    const/16 v1, 0xd2

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lq81/i;->TARGET_TIME_ELAPSED:Lq81/i;

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v0, v12}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_8

    sget-object v1, Lq81/g$g;->w:Lq81/g$g;

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v20, v1

    check-cast v20, Lc93/a;

    new-instance v16, Lq81/b;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x77

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lq81/h;

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object/from16 v17, v16

    move-object/from16 v16, v0

    invoke-direct/range {v14 .. v20}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/16 v11, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v4 .. v11}, Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v9}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq81/g$b;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
