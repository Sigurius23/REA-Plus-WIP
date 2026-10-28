.class public final Lh0/a2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lkotlin/jvm/internal/d0;

.field public final synthetic G:Lkotlin/jvm/internal/g0;

.field public final synthetic H:Lkotlin/jvm/internal/g0;

.field public final synthetic I:F

.field public final synthetic J:Ld30/f0;

.field public final synthetic K:F

.field public final synthetic L:Lh0/c3;

.field public w:Lkotlin/jvm/internal/b0;

.field public x:Lkotlin/jvm/internal/b0;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;FLd30/f0;FLh0/c3;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/a2;->F:Lkotlin/jvm/internal/d0;

    iput-object p2, p0, Lh0/a2;->G:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lh0/a2;->H:Lkotlin/jvm/internal/g0;

    iput p4, p0, Lh0/a2;->I:F

    iput-object p5, p0, Lh0/a2;->J:Ld30/f0;

    iput p6, p0, Lh0/a2;->K:F

    iput-object p7, p0, Lh0/a2;->L:Lh0/c3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    new-instance v0, Lh0/a2;

    iget v6, p0, Lh0/a2;->K:F

    iget-object v7, p0, Lh0/a2;->L:Lh0/c3;

    iget-object v1, p0, Lh0/a2;->F:Lkotlin/jvm/internal/d0;

    iget-object v2, p0, Lh0/a2;->G:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lh0/a2;->H:Lkotlin/jvm/internal/g0;

    iget v4, p0, Lh0/a2;->I:F

    iget-object v5, p0, Lh0/a2;->J:Ld30/f0;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lh0/a2;-><init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;FLd30/f0;FLh0/c3;Lq83/d;)V

    iput-object p1, v0, Lh0/a2;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/a2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/a2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/a2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v7, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Lh0/a2;->z:I

    iget-object v1, v7, Lh0/a2;->H:Lkotlin/jvm/internal/g0;

    iget-object v10, v7, Lh0/a2;->J:Ld30/f0;

    iget-object v2, v7, Lh0/a2;->F:Lkotlin/jvm/internal/d0;

    const/4 v6, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, v7, Lh0/a2;->G:Lkotlin/jvm/internal/g0;

    if-eqz v0, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v6, :cond_0

    iget-object v0, v7, Lh0/a2;->x:Lkotlin/jvm/internal/b0;

    iget-object v9, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    iget-object v11, v7, Lh0/a2;->E:Ljava/lang/Object;

    check-cast v11, Lh0/a3;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v4

    move-object v4, v5

    move/from16 v18, v6

    move-object v14, v9

    move v9, v3

    move-object/from16 v3, p1

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v7, Lh0/a2;->y:I

    iget-object v9, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    iget-object v11, v7, Lh0/a2;->E:Ljava/lang/Object;

    check-cast v11, Lh0/a3;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move v13, v4

    move-object v6, v5

    move-object v14, v9

    move v9, v3

    goto/16 :goto_2

    :cond_2
    iget-object v0, v7, Lh0/a2;->x:Lkotlin/jvm/internal/b0;

    iget-object v9, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    iget-object v11, v7, Lh0/a2;->E:Ljava/lang/Object;

    check-cast v11, Lh0/a3;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v4

    move-object v4, v5

    move/from16 v18, v6

    move-object v14, v9

    move v9, v3

    move-object/from16 v3, p1

    goto/16 :goto_7

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v7, Lh0/a2;->E:Ljava/lang/Object;

    check-cast v0, Lh0/a3;

    new-instance v9, Lkotlin/jvm/internal/b0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-boolean v4, v9, Lkotlin/jvm/internal/b0;->w:Z

    move-object v14, v9

    :goto_0
    iget-boolean v9, v14, Lkotlin/jvm/internal/b0;->w:Z

    sget-object v16, Ll83/a0;->a:Ll83/a0;

    if-eqz v9, :cond_c

    const/4 v9, 0x0

    iput-boolean v9, v14, Lkotlin/jvm/internal/b0;->w:Z

    iget v11, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v12, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Ld0/m;

    iget-object v12, v12, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v12}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    sub-float/2addr v11, v12

    iget-object v12, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Lh0/x1;

    iget-boolean v12, v12, Lh0/x1;->c:Z

    if-nez v12, :cond_4

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v12

    iget v13, v7, Lh0/a2;->I:F

    cmpg-float v12, v12, v13

    if-gez v12, :cond_5

    :cond_4
    move-object v12, v0

    move v9, v3

    move v13, v4

    move-object v4, v5

    move/from16 v18, v6

    move-object v15, v14

    goto/16 :goto_5

    :cond_5
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    move-result v11

    mul-float/2addr v11, v13

    invoke-virtual {v10, v0, v11}, Ld30/f0;->c(Lh0/a3;F)F

    iget-object v12, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Ld0/m;

    iget-object v13, v12, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v13}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    add-float/2addr v13, v11

    const/4 v11, 0x0

    const/16 v15, 0x1e

    invoke-static {v12, v13, v11, v15}, Ld0/f;->m(Ld0/m;FFI)Ld0/m;

    move-result-object v11

    iput-object v11, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget v12, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v11, v11, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v11}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    sub-float/2addr v12, v11

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v11

    iget v12, v7, Lh0/a2;->K:F

    div-float/2addr v11, v12

    invoke-static {v11}, Le93/b;->X(F)I

    move-result v11

    const/16 v12, 0x64

    if-le v11, v12, :cond_6

    move v11, v12

    :cond_6
    iget-object v12, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Ld0/m;

    iget v13, v2, Lkotlin/jvm/internal/d0;->w:F

    move v15, v9

    new-instance v9, Lam2/r;

    move/from16 v17, v15

    const/16 v15, 0xc

    move/from16 v18, v13

    iget-object v13, v7, Lh0/a2;->L:Lh0/c3;

    move v4, v11

    move-object v11, v1

    move v1, v4

    move-object v4, v12

    move-object v12, v2

    move-object v2, v4

    move/from16 v6, v17

    move/from16 v4, v18

    invoke-direct/range {v9 .. v15}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    move-object v15, v14

    iput-object v0, v7, Lh0/a2;->E:Ljava/lang/Object;

    iput-object v15, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    const/4 v11, 0x0

    iput-object v11, v7, Lh0/a2;->x:Lkotlin/jvm/internal/b0;

    iput v1, v7, Lh0/a2;->y:I

    iput v3, v7, Lh0/a2;->z:I

    move-object v11, v10

    new-instance v10, Lkotlin/jvm/internal/d0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iget-object v12, v2, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v12}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    iput v12, v10, Lkotlin/jvm/internal/d0;->w:F

    new-instance v12, Ljava/lang/Float;

    invoke-direct {v12, v4}, Ljava/lang/Float;-><init>(F)V

    sget-object v4, Ld0/b0;->c:Lb23/h;

    invoke-static {v1, v6, v4, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    move-object v13, v9

    new-instance v9, Lam2/s;

    const/16 v14, 0x17

    move-object/from16 v21, v12

    move-object v12, v0

    move-object/from16 v0, v21

    invoke-direct/range {v9 .. v14}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move v6, v3

    move-object v10, v11

    const/4 v3, 0x1

    move v11, v1

    const/4 v13, 0x1

    move-object v1, v0

    move-object v0, v2

    move-object v2, v4

    move-object v4, v9

    move v9, v6

    move-object v6, v5

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Ld0/f;->h(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_7

    goto :goto_1

    :cond_7
    move-object/from16 v0, v16

    :goto_1
    if-ne v0, v8, :cond_8

    goto/16 :goto_6

    :cond_8
    move v0, v11

    move-object v11, v12

    move-object v14, v15

    :goto_2
    iget-boolean v1, v14, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v1, :cond_a

    const-wide/16 v1, 0x32

    int-to-long v3, v0

    sub-long/2addr v1, v3

    iput-object v11, v7, Lh0/a2;->E:Ljava/lang/Object;

    iput-object v14, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    iput-object v14, v7, Lh0/a2;->x:Lkotlin/jvm/internal/b0;

    const/4 v0, 0x3

    iput v0, v7, Lh0/a2;->z:I

    iget-object v3, v7, Lh0/a2;->L:Lh0/c3;

    move/from16 v18, v0

    move-object v4, v6

    move-object v0, v10

    move-wide v5, v1

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-static/range {v0 .. v7}, Ld30/f0;->b(Ld30/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/d0;Lh0/c3;Lkotlin/jvm/internal/g0;JLs83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_9

    goto :goto_6

    :cond_9
    move-object v0, v14

    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iput-boolean v3, v0, Lkotlin/jvm/internal/b0;->w:Z

    :goto_4
    move-object v5, v4

    move v3, v9

    move-object v0, v11

    move v4, v13

    move/from16 v6, v18

    goto/16 :goto_0

    :cond_a
    const/16 v18, 0x3

    move-object v5, v6

    move v3, v9

    move-object v0, v11

    move v4, v13

    move/from16 v6, v18

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    goto/16 :goto_0

    :goto_5
    invoke-virtual {v10, v12, v11}, Ld30/f0;->c(Lh0/a3;F)F

    iput-object v12, v7, Lh0/a2;->E:Ljava/lang/Object;

    iput-object v15, v7, Lh0/a2;->w:Lkotlin/jvm/internal/b0;

    iput-object v15, v7, Lh0/a2;->x:Lkotlin/jvm/internal/b0;

    iput v13, v7, Lh0/a2;->z:I

    iget-object v3, v7, Lh0/a2;->L:Lh0/c3;

    const-wide/16 v5, 0x32

    move-object v0, v10

    invoke-static/range {v0 .. v7}, Ld30/f0;->b(Ld30/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/d0;Lh0/c3;Lkotlin/jvm/internal/g0;JLs83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_b

    :goto_6
    return-object v8

    :cond_b
    move-object v11, v12

    move-object v0, v15

    move-object v14, v0

    :goto_7
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iput-boolean v3, v0, Lkotlin/jvm/internal/b0;->w:Z

    move-object/from16 v7, p0

    goto :goto_4

    :cond_c
    return-object v16
.end method
