.class public final Lg1/r6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lg1/r6;->w:I

    iput-wide p2, p0, Lg1/r6;->x:J

    iput-object p1, p0, Lg1/r6;->y:Ljava/lang/Object;

    iput-object p4, p0, Lg1/r6;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lg1/r6;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lg1/r6;->z:Ljava/lang/Object;

    iget-object v4, v0, Lg1/r6;->y:Ljava/lang/Object;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_0

    move v6, v7

    :cond_0
    and-int/lit8 v5, v8, 0x1

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v9, v4

    check-cast v9, Ll3/v0;

    move-object v10, v3

    check-cast v10, Lc93/m;

    const/4 v12, 0x0

    iget-wide v7, v0, Lg1/r6;->x:J

    invoke-static/range {v7 .. v12}, Lm1/l0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_0
    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_2

    move v6, v7

    :cond_2
    and-int/lit8 v5, v8, 0x1

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ll1/z4;->a:Lp1/u2;

    invoke-virtual {v11, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/y4;

    iget-object v9, v1, Ll1/y4;->m:Ll3/v0;

    new-instance v1, Lb30/w2;

    check-cast v4, Ll0/k1;

    check-cast v3, Lx1/b;

    const/16 v5, 0x11

    invoke-direct {v1, v5, v4, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x18e49c83

    invoke-static {v3, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x180

    iget-wide v7, v0, Lg1/r6;->x:J

    invoke-static/range {v7 .. v12}, Lm1/e0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    return-object v2

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    check-cast v4, Lg1/l6;

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_4

    move v5, v7

    goto :goto_2

    :cond_4
    move v5, v6

    :goto_2
    and-int/2addr v8, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    iget-wide v8, v0, Lg1/r6;->x:J

    const/4 v5, 0x5

    invoke-static {v8, v9, v1, v5}, Lg1/v0;->d(JLandroidx/compose/runtime/Composer;I)Lg1/m1;

    move-result-object v14

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_5

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v8, v5, :cond_6

    :cond_5
    new-instance v8, Lg1/i6;

    invoke-direct {v8, v4, v7}, Lg1/i6;-><init>(Lg1/l6;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v9, v8

    check-cast v9, Lc93/a;

    new-instance v4, Lg1/q6;

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3, v6}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const v3, -0x3761b3ed

    invoke-static {v3, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0x30000000

    const/16 v19, 0x17e

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v9 .. v19}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_7
    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
