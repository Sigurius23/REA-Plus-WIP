.class public final Lg1/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lj0/i;

.field public final synthetic F:Z

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:Li2/a1;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lq3/g0;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/h4;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/h4;->K:Ljava/lang/Object;

    iput-boolean p2, p0, Lg1/h4;->x:Z

    iput-boolean p3, p0, Lg1/h4;->y:Z

    iput-object p4, p0, Lg1/h4;->z:Lq3/g0;

    iput-object p5, p0, Lg1/h4;->E:Lj0/i;

    iput-boolean p6, p0, Lg1/h4;->F:Z

    iput-object p7, p0, Lg1/h4;->G:Lc93/m;

    iput-object p8, p0, Lg1/h4;->H:Lc93/m;

    iput-object p9, p0, Lg1/h4;->I:Lc93/m;

    iput-object p10, p0, Lg1/h4;->J:Li2/a1;

    iput-object p11, p0, Lg1/h4;->L:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq3/y;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Li2/a1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/h4;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/h4;->K:Ljava/lang/Object;

    iput-boolean p2, p0, Lg1/h4;->x:Z

    iput-boolean p3, p0, Lg1/h4;->y:Z

    iput-object p4, p0, Lg1/h4;->z:Lq3/g0;

    iput-object p5, p0, Lg1/h4;->E:Lj0/i;

    iput-boolean p6, p0, Lg1/h4;->F:Z

    iput-object p7, p0, Lg1/h4;->G:Lc93/m;

    iput-object p8, p0, Lg1/h4;->H:Lc93/m;

    iput-object p9, p0, Lg1/h4;->I:Lc93/m;

    iput-object p10, p0, Lg1/h4;->L:Ljava/lang/Object;

    iput-object p11, p0, Lg1/h4;->J:Li2/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lg1/h4;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-eq v3, v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v5, v2, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v2

    sget-object v2, Ll1/t2;->a:Ll1/t2;

    iget-object v5, v0, Lg1/h4;->K:Ljava/lang/Object;

    check-cast v5, Lq3/y;

    iget-object v5, v5, Lq3/y;->a:Ll3/g;

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    iget-object v6, v0, Lg1/h4;->L:Ljava/lang/Object;

    move-object v13, v6

    check-cast v13, Ll1/e4;

    new-instance v7, Lb30/s4;

    iget-object v12, v0, Lg1/h4;->J:Li2/a1;

    move-object v11, v13

    const/4 v13, 0x2

    iget-boolean v8, v0, Lg1/h4;->x:Z

    iget-boolean v9, v0, Lg1/h4;->F:Z

    iget-object v10, v0, Lg1/h4;->E:Lj0/i;

    invoke-direct/range {v7 .. v13}, Lb30/s4;-><init>(ZZLj0/i;Ljava/lang/Object;Li2/a1;I)V

    const v6, 0x53ffaf45

    invoke-static {v6, v1, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v17, v3, 0x70

    iget-boolean v6, v0, Lg1/h4;->y:Z

    iget-object v7, v0, Lg1/h4;->z:Lq3/g0;

    move-object v3, v5

    move v5, v8

    move-object v8, v10

    iget-object v10, v0, Lg1/h4;->G:Lc93/m;

    move-object v13, v11

    iget-object v11, v0, Lg1/h4;->H:Lc93/m;

    iget-object v12, v0, Lg1/h4;->I:Lc93/m;

    const/4 v14, 0x0

    move-object/from16 v16, v1

    invoke-virtual/range {v2 .. v17}, Ll1/t2;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_3
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v4, p1

    check-cast v4, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_5

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x4

    goto :goto_3

    :cond_4
    const/4 v3, 0x2

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-eq v3, v5, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v5, v2, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    move v3, v2

    sget-object v2, Lg1/i8;->a:Lg1/i8;

    iget-object v5, v0, Lg1/h4;->K:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lg1/h4;->L:Ljava/lang/Object;

    move-object v15, v6

    check-cast v15, Lg1/y1;

    new-instance v7, Lb30/s4;

    const/4 v13, 0x1

    iget-boolean v8, v0, Lg1/h4;->x:Z

    iget-boolean v9, v0, Lg1/h4;->F:Z

    iget-object v10, v0, Lg1/h4;->E:Lj0/i;

    iget-object v12, v0, Lg1/h4;->J:Li2/a1;

    move-object v11, v15

    invoke-direct/range {v7 .. v13}, Lb30/s4;-><init>(ZZLj0/i;Ljava/lang/Object;Li2/a1;I)V

    const v6, -0x42ae0811

    invoke-static {v6, v1, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v19, v3, 0x70

    const/16 v20, 0x2000

    iget-boolean v6, v0, Lg1/h4;->y:Z

    iget-object v7, v0, Lg1/h4;->z:Lq3/g0;

    move-object v3, v5

    move v5, v8

    move-object v8, v10

    iget-object v10, v0, Lg1/h4;->G:Lc93/m;

    iget-object v11, v0, Lg1/h4;->H:Lc93/m;

    move-object v14, v12

    const/4 v12, 0x0

    iget-object v13, v0, Lg1/h4;->I:Lc93/m;

    const/16 v16, 0x0

    move-object/from16 v18, v1

    invoke-virtual/range {v2 .. v20}, Lg1/i8;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    move-object/from16 v18, v1

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
