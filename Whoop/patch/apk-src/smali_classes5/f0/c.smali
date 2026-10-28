.class public final Lf0/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLpj/b0;Ljava/lang/String;Lp1/c1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lf0/c;->w:I

    .line 1
    iput-wide p1, p0, Lf0/c;->y:J

    iput-object p3, p0, Lf0/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Lf0/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(JLt23/c0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lf0/c;->w:I

    .line 2
    iput-wide p1, p0, Lf0/c;->y:J

    iput-object p3, p0, Lf0/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p6, p0, Lf0/c;->w:I

    iput-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-wide p2, p0, Lf0/c;->y:J

    iput-object p4, p0, Lf0/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V
    .locals 0

    .line 4
    iput p6, p0, Lf0/c;->w:I

    iput-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object p2, p0, Lf0/c;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lf0/c;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;Lx6/d;JLq83/d;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lf0/c;->w:I

    .line 5
    iput-object p1, p0, Lf0/c;->E:Ljava/lang/Object;

    iput-object p2, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object p3, p0, Lf0/c;->z:Ljava/lang/Object;

    iput-wide p4, p0, Lf0/c;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lyf/t;Lyf/o;Lq83/d;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lf0/c;->w:I

    .line 6
    iput-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object p2, p0, Lf0/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    iget v0, p0, Lf0/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lf0/c;

    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lyf/t;

    iget-object v1, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v1, Lyf/o;

    invoke-direct {p1, v0, v1, p2}, Lf0/c;-><init>(Lyf/t;Lyf/o;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v2, Lf0/c;

    iget-object p1, p0, Lf0/c;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/internal/f0;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/internal/f0;

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lx6/d;

    iget-wide v6, p0, Lf0/c;->y:J

    move-object v8, p2

    invoke-direct/range {v2 .. v8}, Lf0/c;-><init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;Lx6/d;JLq83/d;)V

    return-object v2

    :pswitch_1
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-wide v5, p0, Lf0/c;->y:J

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lj0/i;

    const/4 v9, 0x7

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    return-object v3

    :pswitch_2
    move-object v8, p2

    new-instance p2, Lf0/c;

    iget-wide v0, p0, Lf0/c;->y:J

    iget-object v2, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v2, Lt23/c0;

    invoke-direct {p2, v0, v1, v2, v8}, Lf0/c;-><init>(JLt23/c0;Lq83/d;)V

    iput-object p1, p2, Lf0/c;->F:Ljava/lang/Object;

    return-object p2

    :pswitch_3
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-wide v4, p0, Lf0/c;->y:J

    iget-object p1, p0, Lf0/c;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lpj/b0;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    move-object v9, v8

    move-object v8, p1

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(JLpj/b0;Ljava/lang/String;Lp1/c1;Lq83/d;)V

    return-object v3

    :pswitch_4
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp0/t;

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld0/c0;

    iget-wide v6, p0, Lf0/c;->y:J

    const/4 v9, 0x4

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V

    return-object v3

    :pswitch_5
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p2, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lh0/c3;

    iget-wide v5, p0, Lf0/c;->y:J

    iget-object p2, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Lkotlin/jvm/internal/d0;

    const/4 v9, 0x3

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    iput-object p1, v3, Lf0/c;->E:Ljava/lang/Object;

    return-object v3

    :pswitch_6
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p2, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lf1/p;

    iget-object p2, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/lang/CharSequence;

    iget-wide v6, p0, Lf0/c;->y:J

    const/4 v9, 0x2

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V

    iput-object p1, v3, Lf0/c;->E:Ljava/lang/Object;

    return-object v3

    :pswitch_7
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lf0/w;

    iget-wide v5, p0, Lf0/c;->y:J

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lj0/i;

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    return-object v3

    :pswitch_8
    move-object v8, p2

    new-instance v3, Lf0/c;

    iget-object p1, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lf0/h;

    iget-wide v5, p0, Lf0/c;->y:J

    iget-object p1, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lj0/i;

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf0/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf0/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    iget v0, p0, Lf0/c;->w:I

    const/4 v6, 0x3

    const-wide/16 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lf0/c;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v3, :cond_0

    iget-wide v1, p0, Lf0/c;->y:J

    iget-object v5, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v5, Lyf/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v5, Lyf/t;

    invoke-static {v5}, Lyf/j;->a(Lyf/t;)Lyf/l;

    move-result-object v5

    :goto_0
    iget-object v6, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v6, Lyf/o;

    invoke-interface {v5}, Lyf/l;->f()Lyf/k;

    move-result-object v7

    iput-object v5, p0, Lf0/c;->E:Ljava/lang/Object;

    iput-wide v1, p0, Lf0/c;->y:J

    iput v3, p0, Lf0/c;->x:I

    const-wide/16 v8, 0x4000

    invoke-interface {v6, v7, v8, v9, p0}, Lyf/o;->b(Lyf/k;JLs83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-eqz v8, :cond_3

    add-long/2addr v1, v6

    invoke-interface {v5}, Lyf/l;->e()V

    goto :goto_0

    :cond_3
    invoke-interface {v5}, Lyf/l;->e()V

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    :goto_2
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v0, Lx6/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf0/c;->x:I

    if-eqz v2, :cond_6

    if-eq v2, v3, :cond_5

    if-ne v2, v8, :cond_4

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/f0;

    iget-wide v5, v2, Lkotlin/jvm/internal/f0;->w:J

    iget-object v2, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/f0;

    iget-wide v9, v2, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v2, v5, v9

    if-ltz v2, :cond_8

    iput v3, p0, Lf0/c;->x:I

    invoke-static {p0}, Lbc3/f0;->L(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_6

    :cond_7
    :goto_3
    iget-wide v1, p0, Lf0/c;->y:J

    iget-object v3, v0, Lx6/d;->y:Lp1/e;

    invoke-virtual {v3, v1, v2}, Lp1/e;->a(J)V

    iget-object v3, v0, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iput-wide v1, v0, Lx6/d;->F:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_8
    sub-long/2addr v9, v5

    const-wide/32 v2, 0xf4240

    div-long/2addr v9, v2

    iput v8, p0, Lf0/c;->x:I

    invoke-static {v9, v10, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_6

    :cond_9
    :goto_4
    iget-object v1, v0, Lx6/d;->x:Lwr1/f;

    invoke-virtual {v1}, Lwr1/f;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object v3, v0, Lx6/d;->y:Lp1/e;

    invoke-virtual {v3, v1, v2}, Lp1/e;->a(J)V

    iget-object v3, v0, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    iput-wide v1, v0, Lx6/d;->F:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v3

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v1

    :catchall_1
    move-exception v0

    monitor-exit v3

    throw v0

    :pswitch_1
    iget-object v0, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    iget-object v1, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lf0/c;->x:I

    if-eqz v5, :cond_c

    if-eq v5, v3, :cond_b

    if-ne v5, v8, :cond_a

    iget-object v0, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v0, Lj0/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    iget-object v3, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj0/l;

    if-eqz v5, :cond_e

    new-instance v6, Lj0/k;

    invoke-direct {v6, v5}, Lj0/k;-><init>(Lj0/l;)V

    if-eqz v0, :cond_d

    iput-object v1, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v3, p0, Lf0/c;->x:I

    move-object v3, v0

    check-cast v3, Lj0/j;

    invoke-virtual {v3, v6, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_d

    goto :goto_9

    :cond_d
    move-object v3, v1

    :goto_7
    invoke-interface {v3, v7}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_e
    new-instance v3, Lj0/l;

    iget-wide v5, p0, Lf0/c;->y:J

    invoke-direct {v3, v5, v6}, Lj0/l;-><init>(J)V

    if-eqz v0, :cond_10

    iput-object v3, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v8, p0, Lf0/c;->x:I

    check-cast v0, Lj0/j;

    invoke-virtual {v0, v3, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_f

    goto :goto_9

    :cond_f
    move-object v0, v3

    :goto_8
    move-object v3, v0

    :cond_10
    invoke-interface {v1, v3}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v2

    :pswitch_2
    iget-object v0, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lt23/c0;

    iget-wide v10, p0, Lf0/c;->y:J

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lf0/c;->x:I

    const/4 v13, 0x4

    if-eqz v0, :cond_15

    if-eq v0, v3, :cond_14

    if-eq v0, v8, :cond_13

    if-eq v0, v6, :cond_12

    if-ne v0, v13, :cond_11

    goto :goto_a

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    iget-object v0, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v1, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    move-object v14, v1

    goto :goto_d

    :cond_13
    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_14
    :goto_a
    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iput-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    iput v3, p0, Lf0/c;->x:I

    invoke-static {v10, v11, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_16

    goto :goto_e

    :cond_16
    :goto_b
    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v1

    if-eqz v1, :cond_1a

    iput-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    iput v8, p0, Lf0/c;->x:I

    invoke-static {v10, v11, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_17

    goto :goto_e

    :cond_17
    :goto_c
    iget-object v1, v9, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld33/h1;

    if-eqz v1, :cond_16

    iput-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object v1, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v6, p0, Lf0/c;->x:I

    invoke-virtual {v9, p0}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_18

    goto :goto_e

    :cond_18
    move-object v14, v0

    move-object v0, v1

    :goto_d
    move-object v1, v2

    check-cast v1, Lt23/u0;

    iput-object v14, p0, Lf0/c;->F:Ljava/lang/Object;

    iput-object v7, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v13, p0, Lf0/c;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_19

    goto :goto_e

    :cond_19
    move-object v0, v14

    goto :goto_b

    :cond_1a
    sget-object v12, Ll83/a0;->a:Ll83/a0;

    :goto_e
    return-object v12

    :pswitch_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, p0, Lf0/c;->x:I

    if-eqz v6, :cond_1d

    if-eq v6, v3, :cond_1c

    if-ne v6, v8, :cond_1b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v6, p0, Lf0/c;->y:J

    cmp-long v1, v6, v1

    if-lez v1, :cond_1e

    iput v3, p0, Lf0/c;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_1e

    goto :goto_11

    :cond_1e
    :goto_f
    sget-object v1, Lpj/d;->c:Lpj/d;

    new-instance v9, La00/f;

    iget-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lpj/b0;

    iget-object v2, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    iget-object v2, p0, Lf0/c;->z:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lp1/c1;

    const/4 v13, 0x0

    const/4 v14, 0x5

    invoke-direct/range {v9 .. v14}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v8, p0, Lf0/c;->x:I

    iget-boolean v2, v1, Lpj/d;->a:Z

    if-eqz v2, :cond_20

    iget-object v1, v1, Lpj/d;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    move-object v1, v0

    goto :goto_10

    :cond_20
    iput-boolean v3, v1, Lpj/d;->a:Z

    invoke-virtual {v9, p0}, La00/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_1f

    :goto_10
    if-ne v1, v5, :cond_21

    :goto_11
    move-object v0, v5

    :cond_21
    :goto_12
    return-object v0

    :pswitch_4
    iget-wide v0, p0, Lf0/c;->y:J

    iget-object v2, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v2, Ld0/c0;

    iget-object v5, p0, Lf0/c;->F:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Lp0/t;

    iget-object v5, v6, Lp0/t;->o:Ld0/e;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v10, p0, Lf0/c;->x:I

    if-eqz v10, :cond_24

    if-eq v10, v3, :cond_23

    if-ne v10, v8, :cond_22

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_15

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    iget-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v2, Ld0/c0;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_14

    :cond_24
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    invoke-virtual {v5}, Ld0/e;->f()Z

    move-result v10

    if-eqz v10, :cond_26

    instance-of v10, v2, Ld0/i1;

    if-eqz v10, :cond_25

    check-cast v2, Ld0/i1;

    goto :goto_13

    :cond_25
    sget-object v2, Lp0/u;->a:Ld0/i1;

    :cond_26
    :goto_13
    invoke-virtual {v5}, Ld0/e;->f()Z

    move-result v10

    if-nez v10, :cond_28

    new-instance v10, Ly3/j;

    invoke-direct {v10, v0, v1}, Ly3/j;-><init>(J)V

    iput-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v3, p0, Lf0/c;->x:I

    invoke-virtual {v5, v10, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_27

    goto :goto_16

    :cond_27
    :goto_14
    iget-object v3, v6, Lp0/t;->c:Lnr0/e;

    invoke-virtual {v3}, Lnr0/e;->invoke()Ljava/lang/Object;

    :cond_28
    invoke-virtual {v5}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/j;

    iget-wide v10, v3, Ly3/j;->a:J

    invoke-static {v10, v11, v0, v1}, Ly3/j;->c(JJ)J

    move-result-wide v0

    iget-object v3, v6, Lp0/t;->o:Ld0/e;

    new-instance v5, Ly3/j;

    invoke-direct {v5, v0, v1}, Ly3/j;-><init>(J)V

    move-object v10, v3

    new-instance v3, Lg1/d4;

    invoke-direct {v3, v6, v0, v1, v8}, Lg1/d4;-><init>(Ljava/lang/Object;JI)V

    iput-object v7, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v8, p0, Lf0/c;->x:I

    move-object v1, v5

    const/4 v5, 0x4

    move-object v4, p0

    move-object v0, v10

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_29

    goto :goto_16

    :cond_29
    :goto_15
    sget v0, Lp0/t;->t:I

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp0/t;->l(Z)V

    iput-boolean v0, v6, Lp0/t;->g:Z
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    sget-object v9, Ll83/a0;->a:Ll83/a0;

    :goto_16
    return-object v9

    :pswitch_5
    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lh0/c3;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/c;->x:I

    if-eqz v1, :cond_2b

    if-ne v1, v3, :cond_2a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v1, Lh0/a3;

    iget-wide v7, p0, Lf0/c;->y:J

    invoke-virtual {v0, v7, v8}, Lh0/c3;->g(J)F

    move-result v2

    iget-object v5, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/d0;

    new-instance v7, La01/d;

    const/16 v8, 0x13

    invoke-direct {v7, v5, v0, v1, v8}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v3, p0, Lf0/c;->x:I

    const/4 v0, 0x0

    move v1, v2

    const/4 v2, 0x0

    const/16 v5, 0xc

    move-object v4, p0

    move-object v3, v7

    invoke-static/range {v0 .. v5}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2c

    goto :goto_18

    :cond_2c
    :goto_17
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_18
    return-object v6

    :pswitch_6
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lf0/c;->x:I

    if-eqz v0, :cond_2e

    if-ne v0, v3, :cond_2d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    iget-object v1, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v1, Lf1/p;

    iget-object v2, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    iget-wide v7, p0, Lf0/c;->y:J

    iput v3, p0, Lf0/c;->x:I

    move-object v5, p0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v2

    move-wide v2, v7

    invoke-static/range {v0 .. v5}, Lf1/p;->a(Lf1/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2f

    goto :goto_1a

    :cond_2f
    :goto_19
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_1a
    return-object v6

    :pswitch_7
    iget-object v0, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf0/c;->x:I

    if-eqz v2, :cond_33

    if-eq v2, v3, :cond_32

    if-eq v2, v8, :cond_31

    if-ne v2, v6, :cond_30

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1d

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    iget-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v2, Lj0/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_32
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_33
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v2, Lf0/w;

    iget-object v2, v2, Lf0/h;->h0:Lbc3/c2;

    if-eqz v2, :cond_34

    iput v3, p0, Lf0/c;->x:I

    invoke-static {v2, p0}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_34

    goto :goto_1e

    :cond_34
    :goto_1b
    new-instance v2, Lj0/l;

    iget-wide v9, p0, Lf0/c;->y:J

    invoke-direct {v2, v9, v10}, Lj0/l;-><init>(J)V

    new-instance v3, Lj0/m;

    invoke-direct {v3, v2}, Lj0/m;-><init>(Lj0/l;)V

    iput-object v3, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v8, p0, Lf0/c;->x:I

    move-object v5, v0

    check-cast v5, Lj0/j;

    invoke-virtual {v5, v2, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_35

    goto :goto_1e

    :cond_35
    move-object v2, v3

    :goto_1c
    iput-object v7, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v6, p0, Lf0/c;->x:I

    check-cast v0, Lj0/j;

    invoke-virtual {v0, v2, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_36

    goto :goto_1e

    :cond_36
    :goto_1d
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1e
    return-object v1

    :pswitch_8
    iget-object v0, p0, Lf0/c;->F:Ljava/lang/Object;

    check-cast v0, Lf0/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf0/c;->x:I

    if-eqz v2, :cond_39

    if-eq v2, v3, :cond_38

    if-ne v2, v8, :cond_37

    iget-object v1, p0, Lf0/c;->E:Ljava/lang/Object;

    check-cast v1, Lj0/l;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_39
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf0/h;->c1()Z

    move-result v2

    if-eqz v2, :cond_3a

    sget-wide v5, Lf0/x;->a:J

    iput v3, p0, Lf0/c;->x:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3a

    goto :goto_21

    :cond_3a
    :goto_1f
    new-instance v2, Lj0/l;

    iget-wide v5, p0, Lf0/c;->y:J

    invoke-direct {v2, v5, v6}, Lj0/l;-><init>(J)V

    iget-object v3, p0, Lf0/c;->z:Ljava/lang/Object;

    check-cast v3, Lj0/i;

    iput-object v2, p0, Lf0/c;->E:Ljava/lang/Object;

    iput v8, p0, Lf0/c;->x:I

    check-cast v3, Lj0/j;

    invoke-virtual {v3, v2, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_3b

    goto :goto_21

    :cond_3b
    move-object v1, v2

    :goto_20
    iput-object v1, v0, Lf0/h;->b0:Lj0/l;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_21
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
