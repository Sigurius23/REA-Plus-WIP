.class public final Lg40/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzy/c;


# direct methods
.method public synthetic constructor <init>(Lzy/c;I)V
    .locals 0

    iput p2, p0, Lg40/x0;->w:I

    iput-object p1, p0, Lg40/x0;->x:Lzy/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Lg40/x0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v2, v0, Lg40/x0;->x:Lzy/c;

    invoke-static {v2, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Lp1/q;

    const v4, -0x548d6062

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/e;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    iget-object v4, v4, Lg00/e;->b:Ll3/v0;

    const v6, -0x1a6f7841

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/b;

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    iget-wide v5, v6, Lg00/b;->m:J

    const/16 v25, 0x0

    const v26, 0xfffa

    const/4 v3, 0x0

    move-object/from16 v22, v4

    move-wide v4, v5

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

    move-object/from16 v23, v1

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

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

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v2, v0, Lg40/x0;->x:Lzy/c;

    invoke-static {v2, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v4, v1, v5, v3}, Lce/w;->o(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
