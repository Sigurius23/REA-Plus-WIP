.class public final synthetic Lf0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lf0/m1;->w:I

    iput-object p1, p0, Lf0/m1;->y:Ljava/lang/Object;

    iput p2, p0, Lf0/m1;->x:I

    iput-object p3, p0, Lf0/m1;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lf0/m1;->w:I

    iput-object p1, p0, Lf0/m1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lf0/m1;->z:Ljava/lang/Object;

    iput p3, p0, Lf0/m1;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lf0/m1;->w:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, v0, Lf0/m1;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lf0/m1;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget v4, v0, Lf0/m1;->x:I

    invoke-static {v2, v3, v4, v1}, Lv71/h;->j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v2, v0, Lf0/m1;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lf0/m1;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget v4, v0, Lf0/m1;->x:I

    check-cast v1, Ltb/a;

    invoke-static {v2, v3, v4, v1}, Ltr2/g;->p(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v2, v0, Lf0/m1;->y:Ljava/lang/Object;

    check-cast v2, Lp1/v1;

    iget-object v3, v0, Lf0/m1;->z:Ljava/lang/Object;

    check-cast v3, La0/m0;

    check-cast v1, Lp1/s;

    iget v4, v2, Lp1/v1;->e:I

    iget v5, v0, Lf0/m1;->x:I

    if-ne v4, v5, :cond_8

    iget-object v4, v2, Lp1/v1;->f:La0/m0;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    instance-of v4, v1, Lp1/w;

    if-eqz v4, :cond_8

    iget-object v4, v3, La0/m0;->a:[J

    array-length v6, v4

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_8

    const/4 v8, 0x0

    :goto_0
    aget-wide v9, v4, v8

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_7

    sub-int v11, v8, v6

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_6

    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_4

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    iget-object v15, v3, La0/m0;->b:[Ljava/lang/Object;

    aget-object v15, v15, v14

    iget-object v7, v3, La0/m0;->c:[I

    aget v7, v7, v14

    if-eq v7, v5, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_2

    move/from16 v16, v12

    move-object v12, v1

    check-cast v12, Lp1/w;

    move-object/from16 v17, v1

    iget-object v1, v12, Lp1/w;->G:La0/v0;

    invoke-static {v1, v15, v2}, Ldt/b;->I(La0/v0;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-object/from16 v18, v4

    instance-of v4, v15, Lp1/f0;

    if-eqz v4, :cond_3

    move-object v4, v15

    check-cast v4, Lp1/f0;

    invoke-virtual {v1, v4}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v12, Lp1/w;->J:La0/v0;

    invoke-static {v1, v4}, Ldt/b;->J(La0/v0;Ljava/lang/Object;)V

    :cond_1
    iget-object v1, v2, Lp1/v1;->g:La0/v0;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v15}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move-object/from16 v17, v1

    move-object/from16 v18, v4

    move/from16 v16, v12

    :cond_3
    :goto_3
    if-eqz v7, :cond_5

    invoke-virtual {v3, v14}, La0/m0;->g(I)V

    goto :goto_4

    :cond_4
    move-object/from16 v17, v1

    move-object/from16 v18, v4

    move/from16 v16, v12

    :cond_5
    :goto_4
    shr-long v9, v9, v16

    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v16

    move-object/from16 v1, v17

    move-object/from16 v4, v18

    goto :goto_1

    :cond_6
    move-object/from16 v17, v1

    move-object/from16 v18, v4

    move v1, v12

    if-ne v11, v1, :cond_8

    goto :goto_5

    :cond_7
    move-object/from16 v17, v1

    move-object/from16 v18, v4

    :goto_5
    if-eq v8, v6, :cond_8

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v17

    move-object/from16 v4, v18

    goto/16 :goto_0

    :cond_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    iget-object v2, v0, Lf0/m1;->y:Ljava/lang/Object;

    check-cast v2, Lf0/o1;

    iget-object v3, v0, Lf0/m1;->z:Ljava/lang/Object;

    check-cast v3, Ly2/j1;

    check-cast v1, Ly2/i1;

    iget-object v4, v2, Lf0/o1;->O:Lf0/r1;

    iget-object v4, v4, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v4}, Lp1/h1;->x()I

    move-result v4

    const/4 v5, 0x0

    if-gez v4, :cond_9

    move v4, v5

    :cond_9
    iget v6, v0, Lf0/m1;->x:I

    if-le v4, v6, :cond_a

    move v4, v6

    :cond_a
    neg-int v4, v4

    iget-boolean v2, v2, Lf0/o1;->P:Z

    if-eqz v2, :cond_b

    move v6, v5

    goto :goto_6

    :cond_b
    move v6, v4

    :goto_6
    if-eqz v2, :cond_c

    goto :goto_7

    :cond_c
    move v4, v5

    :goto_7
    const/4 v2, 0x1

    iput-boolean v2, v1, Ly2/i1;->w:Z

    invoke-static {v3, v6, v4, v1}, Ly2/i1;->o(Ly2/j1;IILy2/i1;)V

    iput-boolean v5, v1, Ly2/i1;->w:Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
