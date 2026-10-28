.class public final synthetic Le1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le1/p;


# direct methods
.method public synthetic constructor <init>(Le1/p;I)V
    .locals 0

    iput p2, p0, Le1/n;->w:I

    iput-object p1, p0, Le1/n;->x:Le1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Le1/n;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, Le1/n;->x:Le1/p;

    iget-object v3, v2, Le1/p;->f0:Le1/o;

    if-nez v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v4, v2, Le1/p;->b0:Lkotlin/jvm/functions/Function1;

    if-eqz v4, :cond_1

    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v3, v2, Le1/p;->f0:Le1/o;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v1}, Le1/o;->f(Z)V

    :cond_2
    invoke-static {v2}, La3/g;->j(La3/j2;)V

    invoke-static {v2}, La3/g;->i(La3/c0;)V

    invoke-static {v2}, La3/g;->h(La3/r;)V

    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v3, p1

    check-cast v3, Ll3/g;

    iget-object v1, v0, Le1/n;->x:Le1/p;

    iget-object v2, v1, Le1/p;->f0:Le1/o;

    sget-object v10, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Le1/o;->c()Ll3/g;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v3}, Le1/o;->g(Ll3/g;)V

    invoke-virtual {v2}, Le1/o;->a()Le1/e;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v4, v1, Le1/p;->P:Ll3/v0;

    iget-object v5, v1, Le1/p;->Q:Lp3/h;

    iget v6, v1, Le1/p;->S:I

    iget-boolean v7, v1, Le1/p;->T:Z

    iget v8, v1, Le1/p;->U:I

    iget v9, v1, Le1/p;->V:I

    iget-object v11, v1, Le1/p;->a0:Lu0/z0;

    iput-object v3, v2, Le1/e;->a:Ll3/g;

    invoke-virtual {v2, v4}, Le1/e;->f(Ll3/v0;)V

    iput-object v5, v2, Le1/e;->b:Lp3/h;

    iput v6, v2, Le1/e;->c:I

    iput-boolean v7, v2, Le1/e;->d:Z

    iput v8, v2, Le1/e;->e:I

    iput v9, v2, Le1/e;->f:I

    iput-object v10, v2, Le1/e;->g:Ljava/util/List;

    iput-object v11, v2, Le1/e;->h:Lu0/z0;

    iget-wide v3, v2, Le1/e;->s:J

    const/4 v5, 0x2

    shl-long/2addr v3, v5

    const-wide/16 v5, 0x2

    or-long/2addr v3, v5

    iput-wide v3, v2, Le1/e;->s:J

    const/4 v3, 0x0

    iput-object v3, v2, Le1/e;->m:Laa3/i1;

    iput-object v3, v2, Le1/e;->o:Ll3/r0;

    const/4 v4, -0x1

    iput v4, v2, Le1/e;->q:I

    iput v4, v2, Le1/e;->p:I

    iput-object v3, v2, Le1/e;->r:Le1/d;

    goto :goto_1

    :cond_4
    new-instance v12, Le1/o;

    iget-object v2, v1, Le1/p;->O:Ll3/g;

    invoke-direct {v12, v2, v3}, Le1/o;-><init>(Ll3/g;Ll3/g;)V

    new-instance v2, Le1/e;

    iget-object v4, v1, Le1/p;->P:Ll3/v0;

    iget-object v5, v1, Le1/p;->Q:Lp3/h;

    iget v6, v1, Le1/p;->S:I

    iget-boolean v7, v1, Le1/p;->T:Z

    iget v8, v1, Le1/p;->U:I

    iget v9, v1, Le1/p;->V:I

    iget-object v11, v1, Le1/p;->a0:Lu0/z0;

    invoke-direct/range {v2 .. v11}, Le1/e;-><init>(Ll3/g;Ll3/v0;Lp3/h;IZIILjava/util/List;Lu0/z0;)V

    invoke-virtual {v1}, Le1/p;->Y0()Le1/e;

    move-result-object v3

    iget-object v3, v3, Le1/e;->k:Ly3/c;

    invoke-virtual {v2, v3}, Le1/e;->d(Ly3/c;)V

    invoke-virtual {v12, v2}, Le1/o;->e(Le1/e;)V

    iput-object v12, v1, Le1/p;->f0:Le1/o;

    :cond_5
    :goto_1
    invoke-static {v1}, La3/g;->j(La3/j2;)V

    invoke-static {v1}, La3/g;->i(La3/c0;)V

    invoke-static {v1}, La3/g;->h(La3/r;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Le1/n;->x:Le1/p;

    invoke-virtual {v2}, Le1/p;->Y0()Le1/e;

    move-result-object v3

    iget-object v3, v3, Le1/e;->o:Ll3/r0;

    if-eqz v3, :cond_7

    iget-object v4, v3, Ll3/r0;->a:Ll3/q0;

    new-instance v5, Ll3/q0;

    iget-object v6, v4, Ll3/q0;->a:Ll3/g;

    iget-object v7, v2, Le1/p;->P:Ll3/v0;

    iget-object v2, v2, Le1/p;->Z:Li2/a0;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Li2/a0;->a()J

    move-result-wide v8

    goto :goto_2

    :cond_6
    sget-wide v8, Li2/x;->n:J

    :goto_2
    const-wide/16 v19, 0x0

    const v21, 0xfffffe

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v7 .. v21}, Ll3/v0;->f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;

    move-result-object v7

    iget-object v8, v4, Ll3/q0;->c:Ljava/util/List;

    iget v9, v4, Ll3/q0;->d:I

    iget-boolean v10, v4, Ll3/q0;->e:Z

    iget v11, v4, Ll3/q0;->f:I

    iget-object v12, v4, Ll3/q0;->g:Ly3/c;

    iget-object v13, v4, Ll3/q0;->h:Ly3/m;

    iget-object v14, v4, Ll3/q0;->i:Lp3/h;

    move-object/from16 p1, v5

    iget-wide v4, v4, Ll3/q0;->j:J

    move-wide v15, v4

    move-object/from16 v5, p1

    invoke-direct/range {v5 .. v16}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    iget-wide v6, v3, Ll3/r0;->c:J

    new-instance v2, Ll3/r0;

    iget-object v3, v3, Ll3/r0;->b:Ll3/w;

    invoke-direct {v2, v5, v3, v6, v7}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_8

    const/4 v1, 0x1

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
