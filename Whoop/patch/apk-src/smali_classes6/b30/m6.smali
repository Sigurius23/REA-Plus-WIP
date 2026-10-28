.class public final Lb30/m6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lb30/m6;->w:I

    iput-object p1, p0, Lb30/m6;->x:Ljava/lang/String;

    iput-object p2, p0, Lb30/m6;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Lb30/m6;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lb30/m6;->y:Ljava/lang/String;

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, v0, Lb30/m6;->x:Ljava/lang/String;

    invoke-static {v4, v2, v1, v3}, Lsb3/a;->k(Ljava/lang/String;Ljava/lang/String;Lp1/q;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v6, v0, Lb30/m6;->x:Ljava/lang/String;

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lb30/m6;->y:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_3

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_4

    :cond_3
    new-instance v4, La23/b;

    const/4 v2, 0x5

    iget-object v7, v0, Lb30/m6;->x:Ljava/lang/String;

    invoke-direct {v4, v7, v3, v2}, La23/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v25, 0x0

    const v26, 0x3fffc

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v1

    invoke-static/range {v6 .. v26}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_5
    move-object/from16 v23, v1

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_7

    move-object v1, v14

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v15, 0x0

    const/16 v16, 0xffc

    iget-object v2, v0, Lb30/m6;->x:Ljava/lang/String;

    iget-object v3, v0, Lb30/m6;->y:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v16}, Luf/c0;->h(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/m;ZZLq3/g0;Lu0/r0;Lu0/q0;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
