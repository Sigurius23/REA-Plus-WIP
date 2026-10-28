.class public final synthetic Le1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le1/s;


# direct methods
.method public synthetic constructor <init>(Le1/s;I)V
    .locals 0

    iput p2, p0, Le1/q;->w:I

    iput-object p1, p0, Le1/q;->x:Le1/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    iget v1, v0, Le1/q;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, Le1/q;->x:Le1/s;

    iget-object v3, v2, Le1/s;->Z:Le1/r;

    if-nez v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iput-boolean v1, v3, Le1/r;->c:Z

    invoke-static {v2}, La3/g;->j(La3/j2;)V

    invoke-static {v2}, La3/g;->i(La3/c0;)V

    invoke-static {v2}, La3/g;->h(La3/r;)V

    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll3/g;

    iget-object v3, v1, Ll3/g;->x:Ljava/lang/String;

    iget-object v1, v0, Le1/q;->x:Le1/s;

    iget-object v2, v1, Le1/s;->Z:Le1/r;

    if-eqz v2, :cond_2

    iget-object v4, v2, Le1/r;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    iput-object v3, v2, Le1/r;->b:Ljava/lang/String;

    iget-object v2, v2, Le1/r;->d:Le1/g;

    if-eqz v2, :cond_3

    iget-object v4, v1, Le1/s;->P:Ll3/v0;

    iget-object v5, v1, Le1/s;->Q:Lp3/h;

    iget v6, v1, Le1/s;->R:I

    iget-boolean v7, v1, Le1/s;->S:Z

    iget v8, v1, Le1/s;->T:I

    iget v9, v1, Le1/s;->U:I

    iput-object v3, v2, Le1/g;->a:Ljava/lang/String;

    iput-object v4, v2, Le1/g;->b:Ll3/v0;

    iput-object v5, v2, Le1/g;->c:Lp3/h;

    iput v6, v2, Le1/g;->d:I

    iput-boolean v7, v2, Le1/g;->e:Z

    iput v8, v2, Le1/g;->f:I

    iput v9, v2, Le1/g;->g:I

    iget-wide v3, v2, Le1/g;->s:J

    const/4 v5, 0x2

    shl-long/2addr v3, v5

    const-wide/16 v5, 0x2

    or-long/2addr v3, v5

    iput-wide v3, v2, Le1/g;->s:J

    invoke-virtual {v2}, Le1/g;->c()V

    goto :goto_1

    :cond_2
    new-instance v10, Le1/r;

    iget-object v2, v1, Le1/s;->O:Ljava/lang/String;

    invoke-direct {v10, v2, v3}, Le1/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Le1/g;

    iget-object v4, v1, Le1/s;->P:Ll3/v0;

    iget-object v5, v1, Le1/s;->Q:Lp3/h;

    iget v6, v1, Le1/s;->R:I

    iget-boolean v7, v1, Le1/s;->S:Z

    iget v8, v1, Le1/s;->T:I

    iget v9, v1, Le1/s;->U:I

    invoke-direct/range {v2 .. v9}, Le1/g;-><init>(Ljava/lang/String;Ll3/v0;Lp3/h;IZII)V

    invoke-virtual {v1}, Le1/s;->X0()Le1/g;

    move-result-object v3

    iget-object v3, v3, Le1/g;->i:Ly3/c;

    invoke-virtual {v2, v3}, Le1/g;->d(Ly3/c;)V

    iput-object v2, v10, Le1/r;->d:Le1/g;

    iput-object v10, v1, Le1/s;->Z:Le1/r;

    :cond_3
    :goto_1
    invoke-static {v1}, La3/g;->j(La3/j2;)V

    invoke-static {v1}, La3/g;->i(La3/c0;)V

    invoke-static {v1}, La3/g;->h(La3/r;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Le1/q;->x:Le1/s;

    invoke-virtual {v2}, Le1/s;->X0()Le1/g;

    move-result-object v3

    iget-object v4, v2, Le1/s;->P:Ll3/v0;

    iget-object v2, v2, Le1/s;->V:Li2/a0;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Li2/a0;->a()J

    move-result-wide v5

    goto :goto_2

    :cond_4
    sget-wide v5, Li2/x;->n:J

    :goto_2
    const-wide/16 v16, 0x0

    const v18, 0xfffffe

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v18}, Ll3/v0;->f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;

    move-result-object v21

    iget-object v2, v3, Le1/g;->o:Ly3/m;

    const/4 v4, 0x0

    if-nez v2, :cond_5

    :goto_3
    move-object v7, v4

    goto :goto_4

    :cond_5
    iget-object v5, v3, Le1/g;->i:Ly3/c;

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    new-instance v6, Ll3/g;

    iget-object v7, v3, Le1/g;->a:Ljava/lang/String;

    invoke-direct {v6, v7}, Ll3/g;-><init>(Ljava/lang/String;)V

    iget-object v7, v3, Le1/g;->j:Ll3/a;

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    iget-object v7, v3, Le1/g;->n:Ll3/a0;

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    iget-wide v7, v3, Le1/g;->p:J

    const-wide v9, -0x1fffffffdL

    and-long v29, v7, v9

    new-instance v7, Ll3/r0;

    new-instance v19, Ll3/q0;

    iget v8, v3, Le1/g;->f:I

    iget-boolean v9, v3, Le1/g;->e:Z

    iget v10, v3, Le1/g;->d:I

    iget-object v11, v3, Le1/g;->c:Lp3/h;

    sget-object v22, Lm83/y;->w:Lm83/y;

    move-object/from16 v27, v2

    move-object/from16 v26, v5

    move-object/from16 v20, v6

    move/from16 v23, v8

    move/from16 v24, v9

    move/from16 v25, v10

    move-object/from16 v28, v11

    invoke-direct/range {v19 .. v30}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    move-object/from16 v2, v19

    move-object/from16 v23, v26

    move-object/from16 v24, v28

    new-instance v11, Ll3/w;

    new-instance v19, Laa3/i1;

    invoke-direct/range {v19 .. v24}, Laa3/i1;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V

    iget v15, v3, Le1/g;->f:I

    iget v5, v3, Le1/g;->d:I

    move/from16 v16, v5

    move-object/from16 v12, v19

    move-wide/from16 v13, v29

    invoke-direct/range {v11 .. v16}, Ll3/w;-><init>(Laa3/i1;JII)V

    iget-wide v5, v3, Le1/g;->l:J

    invoke-direct {v7, v2, v11, v5, v6}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    :goto_4
    if-eqz v7, :cond_9

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v4, v7

    :cond_9
    if-eqz v4, :cond_a

    const/4 v1, 0x1

    goto :goto_5

    :cond_a
    const/4 v1, 0x0

    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
