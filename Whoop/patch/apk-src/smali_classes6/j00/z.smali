.class public final Lj00/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lj00/z;->w:I

    iput-wide p1, p0, Lj00/z;->x:J

    iput-object p3, p0, Lj00/z;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj00/z;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/z;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lj00/z;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Lj00/z;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v0, Lj00/z;->y:Ljava/lang/Object;

    check-cast v4, Ln1/o;

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    move-object v5, v2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    :cond_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_2
    move v5, v8

    :goto_1
    and-int/2addr v3, v7

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v1, :cond_3

    const v1, -0x1dca1a97

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    sget v12, Ln1/h;->a:F

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget v3, Ln1/h;->c:F

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v18, 0x186

    const/16 v19, 0x38

    iget-wide v10, v0, Lj00/z;->x:J

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v9 .. v19}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    const v1, -0x1dc66309

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_5

    :cond_4
    new-instance v3, Ln1/f;

    invoke-direct {v3, v4}, Ln1/f;-><init>(Ln1/o;)V

    invoke-virtual {v2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lm1/x;

    iget-wide v4, v0, Lj00/z;->x:J

    invoke-static {v3, v4, v5, v2, v8}, Ln1/h;->a(Lm1/x;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v23, p2

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$TextButton"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_8

    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_4

    :cond_8
    :goto_3
    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    const v2, -0x548d6062

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/e;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-object v1, v2, Lg00/e;->c:Ll3/v0;

    iget-object v2, v0, Lj00/z;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const/16 v25, 0x0

    const v26, 0xfffa

    const/4 v3, 0x0

    iget-wide v4, v0, Lj00/z;->x:J

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v22, v1

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "it"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_a

    move-object v1, v9

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_6

    :cond_a
    :goto_5
    const v1, 0x7f14102c

    invoke-static {v9, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v8, Li2/p;

    iget-wide v1, v0, Lj00/z;->x:J

    const/4 v4, 0x5

    invoke-direct {v8, v1, v2, v4}, Li2/p;-><init>(JI)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    iget-object v1, v0, Lj00/z;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ln2/a;

    const/16 v10, 0x180

    const/16 v11, 0x38

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
