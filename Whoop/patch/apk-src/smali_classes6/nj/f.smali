.class public final Lnj/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;I)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lnj/f;->w:I

    .line 1
    iput-object p1, p0, Lnj/f;->x:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lnj/f;->w:I

    iput-object p1, p0, Lnj/f;->x:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lrj/p;Lp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;Lp1/c1;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lnj/f;->w:I

    .line 3
    iput-object p4, p0, Lnj/f;->x:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v0, p0

    iget v1, v0, Lnj/f;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$conditional"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/q;

    const v3, -0x1c74e98f    # -5.131429E21f

    invoke-virtual {v2, v3}, Lp1/q;->f0(I)V

    const/high16 v3, 0x3d000000    # 0.03125f

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v9

    const/4 v3, 0x0

    int-to-float v7, v3

    const/4 v4, 0x1

    int-to-float v6, v4

    const/4 v4, 0x3

    int-to-float v5, v4

    iget-object v4, v0, Lnj/f;->x:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Lt0/i;

    new-instance v4, Lmj/j;

    invoke-direct/range {v4 .. v10}, Lmj/j;-><init>(FFFLt0/i;J)V

    invoke-static {v1, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_0
    if-nez p1, :cond_0

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    const-string v1, "$this$ExposedDropdownMenuBox"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    throw v2

    :cond_0
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v19, p2

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$Button"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x51

    const/16 v2, 0x10

    if-ne v1, v2, :cond_2

    move-object/from16 v1, v19

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_2
    :goto_0
    iget-object v1, v0, Lnj/f;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    move-object/from16 v1, v19

    check-cast v1, Lp1/q;

    const v3, -0x240eac8a

    invoke-virtual {v1, v3}, Lp1/q;->f0(I)V

    sget-object v3, Luj/e;->i:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/f;

    iget v3, v3, Ly3/f;->w:F

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v11, Lw3/k;

    const/4 v5, 0x3

    invoke-direct {v11, v5}, Lw3/k;-><init>(I)V

    const v5, -0x1896950d

    invoke-virtual {v1, v5}, Lp1/q;->f0(I)V

    sget-object v5, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luj/m;

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, -0x33ea0346    # -3.931825E7f

    invoke-virtual {v1, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v5, v1}, Luj/m;->c(Landroidx/compose/runtime/Composer;)Lp3/i;

    move-result-object v27

    iget v6, v5, Luj/m;->d:F

    const-wide v7, 0x100000000L

    invoke-static {v6, v7, v8}, Lv63/c;->j(FJ)J

    move-result-wide v23

    new-instance v6, Lp3/r;

    iget v5, v5, Luj/m;->i:I

    invoke-direct {v6, v5}, Lp3/r;-><init>(I)V

    new-instance v18, Ll3/v0;

    const-wide/16 v33, 0x0

    const v35, 0xffffd9

    const-wide/16 v21, 0x0

    const/16 v26, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v25, v6

    move-object/from16 v20, v18

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    const/16 v21, 0x0

    const v22, 0xfdfc

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$conditional"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/q;

    const v1, 0xce2c9da

    invoke-virtual {v2, v1}, Lp1/q;->f0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_3

    invoke-static {v2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_3
    move-object v4, v1

    check-cast v4, Lj0/i;

    iget-object v1, v0, Lnj/f;->x:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lmj/n;

    const/16 v9, 0x1c

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$conditional"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/q;

    const v3, -0x7f7c9509

    invoke-virtual {v2, v3}, Lp1/q;->f0(I)V

    iget-object v3, v0, Lnj/f;->x:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, Lch/c;

    const/4 v4, 0x5

    invoke-direct {v5, v3, v4}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lc93/a;

    const/4 v3, 0x7

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v4, v6, v5, v3}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
