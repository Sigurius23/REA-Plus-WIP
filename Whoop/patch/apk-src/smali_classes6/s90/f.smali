.class public final synthetic Ls90/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ls90/f;->w:I

    iput-object p1, p0, Ls90/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Ls90/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Ls90/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p4, p0, Ls90/f;->w:I

    iput-object p1, p0, Ls90/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Ls90/f;->x:Ljava/lang/Object;

    iput-object p3, p0, Ls90/f;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Ls90/f;->w:I

    iput-object p1, p0, Ls90/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Ls90/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls90/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lmc0/c;Ljava/lang/String;)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Ls90/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls90/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Ls90/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls90/f;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Ls90/f;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x3

    const-wide v5, 0xffffffffL

    const/4 v7, 0x1

    const-string v8, "$this$fromEnvironment"

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    iget-object v13, v1, Ls90/f;->x:Ljava/lang/Object;

    iget-object v14, v1, Ls90/f;->z:Ljava/lang/Object;

    iget-object v15, v1, Ls90/f;->y:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v15, Lwc/d1;

    check-cast v14, Lmg/h;

    check-cast v13, Lgf/b;

    check-cast v0, Lqd/e;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v15, Lwc/d1;->y:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "aws-global"

    :cond_0
    iput-object v2, v0, Lqd/e;->d:Ljava/lang/String;

    iget-object v2, v15, Lwc/d1;->w:Lve/f;

    iput-object v2, v0, Lqd/e;->g:Lve/f;

    iget-object v2, v15, Lwc/d1;->z:Lpf/a;

    iget-object v3, v0, Lqd/e;->a:Lzt/q;

    invoke-virtual {v3, v2}, Lzt/q;->G(Lpf/a;)V

    iput-object v14, v0, Lqd/e;->k:Lmg/h;

    sget-object v2, Lcf/l;->d:Lgf/a;

    invoke-interface {v13, v2}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcf/e;

    iput-object v2, v0, Lqd/e;->j:Lcf/e;

    sget-object v2, Lyd/d;->a:Lgf/a;

    invoke-interface {v13, v2}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, v0, Lqd/e;->n:Ljava/lang/String;

    return-object v12

    :pswitch_0
    check-cast v15, Lwc/p0;

    check-cast v14, Lmg/h;

    check-cast v13, Lgf/b;

    check-cast v0, Led/e;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v15, Lwc/p0;->z:Ljava/lang/String;

    iput-object v2, v0, Led/e;->d:Ljava/lang/String;

    iget-object v2, v15, Lwc/p0;->F:Lpf/a;

    iget-object v3, v0, Led/e;->a:Lzt/q;

    invoke-virtual {v3, v2}, Lzt/q;->G(Lpf/a;)V

    iput-object v14, v0, Led/e;->j:Lmg/h;

    sget-object v2, Lcf/l;->d:Lgf/a;

    invoke-interface {v13, v2}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcf/e;

    iput-object v2, v0, Led/e;->i:Lcf/e;

    sget-object v2, Lyd/d;->a:Lgf/a;

    invoke-interface {v13, v2}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, v0, Led/e;->m:Ljava/lang/String;

    return-object v12

    :pswitch_1
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Lw71/c0;

    check-cast v13, Lp1/c1;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v15, v14, v13, v0}, Lw71/e0;->d(Lkotlin/jvm/functions/Function1;Lw71/c0;Lp1/c1;F)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v15, Lt60/a;

    check-cast v14, Lt60/c;

    check-cast v13, Ll83/h;

    check-cast v0, Lu60/a;

    invoke-static {v15, v14, v13, v0}, Lw60/f;->f(Lt60/a;Lt60/c;Ll83/h;Lu60/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v15, Lwt2/p;

    check-cast v14, Lls2/b;

    check-cast v13, Lvt2/h;

    invoke-static {v15, v14, v13, v0}, Lvt2/f;->a(Lwt2/p;Lls2/b;Lvt2/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Lwo1/n0;

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v14, v13, v0}, Lvo1/r;->D(Lkotlin/jvm/functions/Function1;Lwo1/n0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v14, Lp1/h1;

    check-cast v13, Lso1/p$f;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v14, v13, v15, v0}, Lvo1/d;->r(Lp1/h1;Lso1/p$f;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v14, Lso1/p$f;

    check-cast v13, Lp1/a1;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v13, v15, v0}, Lvo1/d;->m(Lso1/p$f;Lp1/a1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v14, Ljava/util/List;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v13, Lp1/c1;

    check-cast v0, Ln0/q;

    invoke-static {v14, v15, v13, v0}, Lv41/j;->a(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v14, Lv01/g;

    check-cast v13, Lm91/o;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v13, v15, v0}, Lv01/l;->c(Lv01/g;Lm91/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v14, Ltz1/b;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v13, Lp1/c1;

    check-cast v0, Ln0/q;

    invoke-static {v14, v15, v13, v0}, Luz1/h;->e(Ltz1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v15, Lqi0/a;

    check-cast v14, Lqi0/d;

    check-cast v13, Ll83/h;

    check-cast v0, Lri0/b;

    invoke-static {v15, v14, v13, v0}, Lui0/n;->a(Lqi0/a;Lqi0/d;Ll83/h;Lri0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v15, Lrf0/a;

    check-cast v14, Lrf0/c;

    check-cast v13, Ll83/h;

    check-cast v0, Lsf0/a;

    invoke-static {v15, v14, v13, v0}, Luf0/h;->a(Lrf0/a;Lrf0/c;Ll83/h;Lsf0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v15, Lu0/k0;

    check-cast v14, Lu0/h1;

    check-cast v13, Lkotlin/jvm/internal/b0;

    check-cast v0, Lf1/g1;

    sget-object v2, Lu0/g1;->a:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v2, v2, v8

    const/4 v8, -0x1

    packed-switch v2, :pswitch_data_1

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_d
    iget-object v0, v14, Lu0/h1;->h:Lu0/t1;

    if-eqz v0, :cond_1c

    iget-object v2, v0, Lu0/t1;->b:Lq3/i;

    if-eqz v2, :cond_1

    iget-object v3, v2, Lq3/i;->x:Ljava/lang/Object;

    check-cast v3, Lq3/i;

    iput-object v3, v0, Lu0/t1;->b:Lq3/i;

    iget-object v3, v2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v3, Lq3/y;

    iget-object v4, v0, Lu0/t1;->a:Lq3/i;

    new-instance v5, Lq3/i;

    invoke-direct {v5, v4, v3, v11}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v5, v0, Lu0/t1;->a:Lq3/i;

    iget v4, v0, Lu0/t1;->c:I

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v4

    iput v3, v0, Lu0/t1;->c:I

    iget-object v0, v2, Lq3/i;->w:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lq3/y;

    :cond_1
    if-eqz v10, :cond_1c

    iget-object v0, v14, Lu0/h1;->k:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_e
    iget-object v2, v14, Lu0/h1;->h:Lu0/t1;

    if-eqz v2, :cond_2

    iget-object v3, v0, Lf1/g1;->h:Lq3/y;

    iget-object v4, v0, Lf1/g1;->g:Ll3/g;

    iget-wide v5, v0, Lf1/g1;->f:J

    invoke-static {v3, v4, v5, v6, v9}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v0

    invoke-virtual {v2, v0}, Lu0/t1;->a(Lq3/y;)V

    :cond_2
    iget-object v0, v14, Lu0/h1;->h:Lu0/t1;

    if-eqz v0, :cond_1c

    iget-object v2, v0, Lu0/t1;->a:Lq3/i;

    if-eqz v2, :cond_3

    iget-object v3, v2, Lq3/i;->x:Ljava/lang/Object;

    check-cast v3, Lq3/i;

    if-eqz v3, :cond_3

    iput-object v3, v0, Lu0/t1;->a:Lq3/i;

    iget v4, v0, Lu0/t1;->c:I

    iget-object v5, v2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v5, Lq3/y;

    iget-object v5, v5, Lq3/y;->a:Ll3/g;

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v4, v5

    iput v4, v0, Lu0/t1;->c:I

    iget-object v2, v2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Lq3/y;

    iget-object v4, v0, Lu0/t1;->b:Lq3/i;

    new-instance v5, Lq3/i;

    invoke-direct {v5, v4, v2, v11}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v5, v0, Lu0/t1;->b:Lq3/i;

    iget-object v0, v3, Lq3/i;->w:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lq3/y;

    :cond_3
    if-eqz v10, :cond_1c

    iget-object v0, v14, Lu0/h1;->k:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_f
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-wide v2, v0, Lf1/g1;->f:J

    sget v4, Ll3/u0;->c:I

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_10
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_4
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_11
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    invoke-virtual {v0, v11, v11}, Lf1/g1;->q(II)V

    :cond_5
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_12
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    iget-object v2, v0, Lf1/g1;->i:Lu0/p1;

    if-eqz v2, :cond_6

    invoke-virtual {v0, v2, v7}, Lf1/g1;->h(Lu0/p1;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_6
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_13
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    iget-object v2, v0, Lf1/g1;->i:Lu0/p1;

    if-eqz v2, :cond_7

    invoke-virtual {v0, v2, v8}, Lf1/g1;->h(Lu0/p1;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_7
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_14
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_8

    iget-object v2, v0, Lf1/g1;->c:Ll3/r0;

    if-eqz v2, :cond_8

    invoke-virtual {v0, v2, v7}, Lf1/g1;->g(Ll3/r0;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_8
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_15
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_9

    iget-object v2, v0, Lf1/g1;->c:Ll3/r0;

    if-eqz v2, :cond_9

    invoke-virtual {v0, v2, v8}, Lf1/g1;->g(Ll3/r0;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_9
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_16
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_b

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lf1/g1;->n()V

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, Lf1/g1;->o()V

    :cond_b
    :goto_0
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_17
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_d

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v0}, Lf1/g1;->o()V

    goto :goto_1

    :cond_c
    invoke-virtual {v0}, Lf1/g1;->n()V

    :cond_d
    :goto_1
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_18
    invoke-virtual {v0}, Lf1/g1;->n()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_19
    invoke-virtual {v0}, Lf1/g1;->o()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1a
    invoke-virtual {v0}, Lf1/g1;->j()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1b
    invoke-virtual {v0}, Lf1/g1;->l()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1c
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v3, v0, Lf1/g1;->g:Ll3/g;

    iget-object v4, v3, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_f

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v4

    if-eqz v4, :cond_e

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_f

    invoke-virtual {v0}, Lf1/g1;->d()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_2

    :cond_e
    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_f

    invoke-virtual {v0}, Lf1/g1;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_f
    :goto_2
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1d
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v3, v0, Lf1/g1;->g:Ll3/g;

    iget-object v4, v3, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_11

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v4

    if-eqz v4, :cond_10

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_11

    invoke-virtual {v0}, Lf1/g1;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_3

    :cond_10
    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_11

    invoke-virtual {v0}, Lf1/g1;->d()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    :cond_11
    :goto_3
    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1e
    invoke-virtual {v0}, Lf1/g1;->m()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_1f
    invoke-virtual {v0}, Lf1/g1;->i()V

    invoke-virtual {v0}, Lf1/g1;->p()V

    goto/16 :goto_4

    :pswitch_20
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1c

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v11, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_21
    iget-boolean v0, v14, Lu0/h1;->e:Z

    if-nez v0, :cond_12

    new-instance v0, Lq3/a;

    const-string v2, "\t"

    invoke-direct {v0, v2, v7}, Lq3/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :cond_12
    iput-boolean v11, v13, Lkotlin/jvm/internal/b0;->w:Z

    goto/16 :goto_4

    :pswitch_22
    iget-boolean v0, v14, Lu0/h1;->e:Z

    if-nez v0, :cond_13

    new-instance v0, Lq3/a;

    const-string v2, "\n"

    invoke-direct {v0, v2, v7}, Lq3/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :cond_13
    iget-object v0, v14, Lu0/h1;->a:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->x:Lu0/v;

    iget v2, v14, Lu0/h1;->l:I

    iget-object v0, v0, Lu0/v;->x:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->r:Lu0/o0;

    invoke-virtual {v0, v2}, Lu0/o0;->c(I)Z

    move-result v0

    iput-boolean v0, v13, Lkotlin/jvm/internal/b0;->w:Z

    goto/16 :goto_4

    :pswitch_23
    new-instance v2, Lu0/r;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_24
    new-instance v2, Lu0/r;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_25
    new-instance v2, Lu0/r;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_26
    new-instance v2, Lu0/r;

    invoke-direct {v2, v9}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_27
    new-instance v2, Lu0/r;

    invoke-direct {v2, v4}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_28
    new-instance v2, Lu0/r;

    invoke-direct {v2, v3}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v2}, Lf1/g1;->a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v14, v0}, Lu0/h1;->a(Ljava/util/List;)V

    goto/16 :goto_4

    :pswitch_29
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1c

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_2a
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0, v11, v11}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_2b
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v0}, Lf1/g1;->n()V

    goto/16 :goto_4

    :cond_14
    invoke-virtual {v0}, Lf1/g1;->o()V

    goto/16 :goto_4

    :pswitch_2c
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v0}, Lf1/g1;->o()V

    goto/16 :goto_4

    :cond_15
    invoke-virtual {v0}, Lf1/g1;->n()V

    goto/16 :goto_4

    :pswitch_2d
    invoke-virtual {v0}, Lf1/g1;->n()V

    goto/16 :goto_4

    :pswitch_2e
    invoke-virtual {v0}, Lf1/g1;->o()V

    goto/16 :goto_4

    :pswitch_2f
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-object v2, v0, Lf1/g1;->i:Lu0/p1;

    if-eqz v2, :cond_1c

    invoke-virtual {v0, v2, v7}, Lf1/g1;->h(Lu0/p1;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_30
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-object v2, v0, Lf1/g1;->i:Lu0/p1;

    if-eqz v2, :cond_1c

    invoke-virtual {v0, v2, v8}, Lf1/g1;->h(Lu0/p1;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_31
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-object v2, v0, Lf1/g1;->c:Ll3/r0;

    if-eqz v2, :cond_1c

    invoke-virtual {v0, v2, v7}, Lf1/g1;->g(Ll3/r0;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_32
    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-object v2, v0, Lf1/g1;->c:Ll3/r0;

    if-eqz v2, :cond_1c

    invoke-virtual {v0, v2, v8}, Lf1/g1;->g(Ll3/r0;I)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_33
    invoke-virtual {v0}, Lf1/g1;->j()V

    goto/16 :goto_4

    :pswitch_34
    invoke-virtual {v0}, Lf1/g1;->l()V

    goto/16 :goto_4

    :pswitch_35
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v3, v0, Lf1/g1;->g:Ll3/g;

    iget-object v4, v3, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v4

    if-eqz v4, :cond_16

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->d()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :cond_16
    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_36
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v3, v0, Lf1/g1;->g:Ll3/g;

    iget-object v4, v3, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v4

    if-eqz v4, :cond_17

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :cond_17
    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lf1/g1;->d()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto/16 :goto_4

    :pswitch_37
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v0}, Lf1/g1;->m()V

    goto :goto_4

    :cond_18
    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_19

    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_4

    :cond_19
    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_4

    :pswitch_38
    iget-object v2, v0, Lf1/g1;->e:Lf1/x1;

    iput-object v10, v2, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, v0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v0}, Lf1/g1;->i()V

    goto :goto_4

    :cond_1a
    invoke-virtual {v0}, Lf1/g1;->f()Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_4

    :cond_1b
    iget-wide v2, v0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v2

    invoke-virtual {v0, v2, v2}, Lf1/g1;->q(II)V

    goto :goto_4

    :pswitch_39
    iget-object v0, v14, Lu0/h1;->b:Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->f()V

    goto :goto_4

    :pswitch_3a
    iget-object v0, v14, Lu0/h1;->b:Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->o()V

    goto :goto_4

    :pswitch_3b
    iget-object v0, v14, Lu0/h1;->b:Lf1/s1;

    invoke-virtual {v0, v11}, Lf1/s1;->d(Z)Lbc3/c2;

    :cond_1c
    :goto_4
    :pswitch_3c
    return-object v12

    :pswitch_3d
    check-cast v14, Lq3/i;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v13, Lkotlin/jvm/internal/g0;

    check-cast v0, Ljava/util/List;

    iget-object v2, v13, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lq3/d0;

    invoke-virtual {v14, v0}, Lq3/i;->b(Ljava/util/List;)Lq3/y;

    move-result-object v0

    if-eqz v2, :cond_1d

    invoke-virtual {v2, v10, v0}, Lq3/d0;->a(Lq3/y;Lq3/y;)V

    :cond_1d
    invoke-interface {v15, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v12

    :pswitch_3e
    check-cast v15, Lkotlin/jvm/internal/b0;

    check-cast v14, Ll3/e;

    check-cast v13, Ll3/m0;

    check-cast v0, Ll3/e;

    iget-boolean v2, v15, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v2, :cond_1f

    iget-object v2, v0, Ll3/e;->a:Ljava/lang/Object;

    iget v3, v0, Ll3/e;->c:I

    iget v4, v0, Ll3/e;->b:I

    instance-of v2, v2, Ll3/m0;

    if-eqz v2, :cond_1f

    iget v2, v14, Ll3/e;->b:I

    if-ne v4, v2, :cond_1f

    iget v2, v14, Ll3/e;->c:I

    if-ne v3, v2, :cond_1f

    new-instance v2, Ll3/e;

    if-nez v13, :cond_1e

    new-instance v16, Ll3/m0;

    const/16 v34, 0x0

    const v35, 0xffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v16 .. v35}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v13, v16

    :cond_1e
    invoke-direct {v2, v13, v4, v3}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    goto :goto_5

    :cond_1f
    move-object v2, v0

    :goto_5
    invoke-virtual {v14, v0}, Ll3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, v15, Lkotlin/jvm/internal/b0;->w:Z

    return-object v2

    :pswitch_3f
    check-cast v15, Lu0/s0;

    check-cast v14, Lq3/y;

    check-cast v13, Lq3/r;

    check-cast v0, Lk2/e;

    invoke-virtual {v15}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-eqz v2, :cond_2f

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v0

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v3

    iget-object v0, v15, Lu0/s0;->A:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/u0;

    iget-wide v8, v0, Ll3/u0;->a:J

    iget-object v0, v15, Lu0/s0;->B:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/u0;

    move-wide/from16 v16, v5

    iget-wide v5, v0, Ll3/u0;->a:J

    iget-object v0, v2, Lu0/p1;->a:Ll3/r0;

    iget-object v2, v0, Ll3/r0;->b:Ll3/w;

    iget-object v7, v0, Ll3/r0;->a:Ll3/q0;

    move-object/from16 v19, v10

    iget-object v10, v15, Lu0/s0;->y:Li2/h;

    move-object/from16 v23, v12

    iget-wide v11, v15, Lu0/s0;->z:J

    invoke-static {v8, v9}, Ll3/u0;->c(J)Z

    move-result v15

    if-nez v15, :cond_20

    invoke-virtual {v10, v11, v12}, Li2/h;->e(J)V

    invoke-static {v8, v9}, Ll3/u0;->f(J)I

    move-result v5

    invoke-interface {v13, v5}, Lq3/r;->x(I)I

    move-result v5

    invoke-static {v8, v9}, Ll3/u0;->e(J)I

    move-result v6

    invoke-interface {v13, v6}, Lq3/r;->x(I)I

    move-result v6

    if-eq v5, v6, :cond_24

    invoke-virtual {v0, v5, v6}, Ll3/r0;->j(II)Li2/j;

    move-result-object v5

    invoke-interface {v3, v5, v10}, Li2/v;->t(Li2/s0;Li2/q0;)V

    goto :goto_7

    :cond_20
    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result v8

    if-nez v8, :cond_23

    iget-object v8, v7, Ll3/q0;->b:Ll3/v0;

    invoke-virtual {v8}, Ll3/v0;->c()J

    move-result-wide v8

    new-instance v11, Li2/x;

    invoke-direct {v11, v8, v9}, Li2/x;-><init>(J)V

    const-wide/16 v14, 0x10

    cmp-long v8, v8, v14

    if-nez v8, :cond_21

    move-object/from16 v11, v19

    :cond_21
    if-eqz v11, :cond_22

    iget-wide v8, v11, Li2/x;->a:J

    goto :goto_6

    :cond_22
    sget-wide v8, Li2/x;->b:J

    :goto_6
    invoke-static {v8, v9}, Li2/x;->e(J)F

    move-result v11

    const v12, 0x3e4ccccd    # 0.2f

    mul-float/2addr v11, v12

    invoke-static {v11, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    invoke-virtual {v10, v8, v9}, Li2/h;->e(J)V

    invoke-static {v5, v6}, Ll3/u0;->f(J)I

    move-result v8

    invoke-interface {v13, v8}, Lq3/r;->x(I)I

    move-result v8

    invoke-static {v5, v6}, Ll3/u0;->e(J)I

    move-result v5

    invoke-interface {v13, v5}, Lq3/r;->x(I)I

    move-result v5

    if-eq v8, v5, :cond_24

    invoke-virtual {v0, v8, v5}, Ll3/r0;->j(II)Li2/j;

    move-result-object v5

    invoke-interface {v3, v5, v10}, Li2/v;->t(Li2/s0;Li2/q0;)V

    goto :goto_7

    :cond_23
    iget-wide v5, v14, Lq3/y;->b:J

    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result v5

    if-nez v5, :cond_24

    invoke-virtual {v10, v11, v12}, Li2/h;->e(J)V

    iget-wide v5, v14, Lq3/y;->b:J

    invoke-static {v5, v6}, Ll3/u0;->f(J)I

    move-result v8

    invoke-interface {v13, v8}, Lq3/r;->x(I)I

    move-result v8

    invoke-static {v5, v6}, Ll3/u0;->e(J)I

    move-result v5

    invoke-interface {v13, v5}, Lq3/r;->x(I)I

    move-result v5

    if-eq v8, v5, :cond_24

    invoke-virtual {v0, v8, v5}, Ll3/r0;->j(II)Li2/j;

    move-result-object v5

    invoke-interface {v3, v5, v10}, Li2/v;->t(Li2/s0;Li2/q0;)V

    :cond_24
    :goto_7
    invoke-virtual {v0}, Ll3/r0;->e()Z

    move-result v5

    if-eqz v5, :cond_26

    iget v5, v7, Ll3/q0;->f:I

    if-ne v5, v4, :cond_25

    goto :goto_8

    :cond_25
    const/4 v4, 0x1

    goto :goto_9

    :cond_26
    :goto_8
    const/4 v4, 0x0

    :goto_9
    if-eqz v4, :cond_27

    iget-wide v5, v0, Ll3/r0;->c:J

    const/16 v0, 0x20

    shr-long v8, v5, v0

    long-to-int v8, v8

    int-to-float v8, v8

    and-long v5, v5, v16

    long-to-int v5, v5

    int-to-float v5, v5

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v8, v6

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v8, v0

    and-long v5, v5, v16

    or-long/2addr v5, v8

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v5, v6}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v0

    invoke-interface {v3}, Li2/v;->q()V

    invoke-static {v3, v0}, Li2/v;->h(Li2/v;Lh2/c;)V

    :cond_27
    iget-object v0, v7, Ll3/q0;->b:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v5, v0, Ll3/m0;->m:Lw3/l;

    iget-object v6, v0, Ll3/m0;->a:Lw3/o;

    if-nez v5, :cond_28

    sget-object v5, Lw3/l;->b:Lw3/l;

    :cond_28
    move-object/from16 v21, v5

    iget-object v5, v0, Ll3/m0;->n:Li2/z0;

    if-nez v5, :cond_29

    sget-object v5, Li2/z0;->d:Li2/z0;

    :cond_29
    move-object/from16 v20, v5

    iget-object v0, v0, Ll3/m0;->p:Lk2/f;

    if-nez v0, :cond_2a

    sget-object v0, Lk2/h;->a:Lk2/h;

    :cond_2a
    move-object/from16 v22, v0

    :try_start_0
    invoke-interface {v6}, Lw3/o;->c()Li2/t;

    move-result-object v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lw3/n;->a:Lw3/n;

    if-eqz v18, :cond_2c

    if-eq v6, v0, :cond_2b

    :try_start_1
    invoke-interface {v6}, Lw3/o;->a()F

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_a
    move/from16 v19, v0

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    goto :goto_b

    :catchall_0
    move-exception v0

    move-object/from16 v17, v3

    goto :goto_f

    :cond_2b
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_a

    :goto_b
    :try_start_2
    invoke-static/range {v16 .. v22}, Ll3/w;->j(Ll3/w;Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V

    goto :goto_e

    :catchall_1
    move-exception v0

    goto :goto_f

    :cond_2c
    move-object/from16 v16, v2

    move-object/from16 v17, v3

    if-eq v6, v0, :cond_2d

    invoke-interface {v6}, Lw3/o;->b()J

    move-result-wide v2

    :goto_c
    move-wide/from16 v18, v2

    goto :goto_d

    :cond_2d
    sget-wide v2, Li2/x;->b:J

    goto :goto_c

    :goto_d
    invoke-static/range {v16 .. v22}, Ll3/w;->i(Ll3/w;Li2/v;JLi2/z0;Lw3/l;Lk2/f;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_e
    if-eqz v4, :cond_30

    invoke-interface/range {v17 .. v17}, Li2/v;->g()V

    goto :goto_10

    :goto_f
    if-eqz v4, :cond_2e

    invoke-interface/range {v17 .. v17}, Li2/v;->g()V

    :cond_2e
    throw v0

    :cond_2f
    move-object/from16 v23, v12

    :cond_30
    :goto_10
    return-object v23

    :pswitch_40
    check-cast v14, Luw1/f;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v13, Lp1/t2;

    check-cast v0, Leb/s0;

    invoke-static {v14, v15, v13, v0}, Lcom/whoop/membership/familyPlan/navigation/a;->c(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_41
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Ltu1/g;

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v14, v13, v0}, Ltu1/f;->e(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_42
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Lsp0/d;

    check-cast v13, Lc93/a;

    check-cast v0, Lorg/joda/time/LocalDate;

    invoke-static {v15, v14, v13, v0}, Ltp0/b;->c(Lkotlin/jvm/functions/Function1;Lsp0/d;Lc93/a;Lorg/joda/time/LocalDate;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_43
    check-cast v15, Loo2/c;

    check-cast v14, Ll83/h;

    check-cast v13, Ll83/h;

    check-cast v0, Lpo2/a;

    invoke-static {v15, v14, v13, v0}, Lto2/a;->c(Loo2/c;Ll83/h;Ll83/h;Lpo2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_44
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Ln82/c;

    check-cast v13, Lp1/a1;

    invoke-static {v15, v14, v13, v0}, Ltg2/j;->d(Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/a1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_45
    move-object/from16 v19, v10

    move-object v12, v15

    check-cast v12, Lt20/w;

    move-object v2, v14

    check-cast v2, Lj/k;

    move-object v4, v13

    check-cast v4, Lt20/n;

    check-cast v0, Lp1/i0;

    const-string v5, "$this$DisposableEffect"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v12, Lt20/w;->w:Lt20/v;

    iget-boolean v5, v0, Lt20/v;->a:Z

    iget-object v6, v0, Lt20/v;->m:Ljava/lang/String;

    if-eqz v5, :cond_31

    iget-object v0, v0, Lt20/v;->n:Lf20/b;

    new-instance v10, Lq00/h0;

    const/16 v16, 0x0

    const/16 v17, 0x19

    const/4 v11, 0x1

    const-class v13, Lt20/w;

    const-string v14, "handleInstantDebitsResult"

    const-string v15, "handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V"

    invoke-direct/range {v10 .. v17}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v2}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;

    invoke-direct {v3}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;-><init>()V

    new-instance v5, Laq0/o;

    const/16 v7, 0x11

    invoke-direct {v5, v10, v7}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    const-string v7, "CollectBankAccountForInstantDebitsLauncher"

    invoke-virtual {v2, v7, v3, v5}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object v2

    new-instance v3, Lw10/e;

    invoke-direct {v3, v2, v0, v6}, Lw10/e;-><init>(Lj/i;Lf20/b;Ljava/lang/String;)V

    goto :goto_11

    :cond_31
    new-instance v10, Lq00/h0;

    const/16 v16, 0x0

    const/16 v17, 0x1a

    const/4 v11, 0x1

    const-class v13, Lt20/w;

    const-string v14, "handleCollectBankAccountResult"

    const-string v15, "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V"

    invoke-direct/range {v10 .. v17}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v2}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    new-instance v2, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;

    invoke-direct {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;-><init>()V

    new-instance v5, Lg20/q;

    invoke-direct {v5, v10, v3}, Lg20/q;-><init>(Ljava/lang/Object;I)V

    const-string v3, "CollectBankAccountLauncher"

    invoke-virtual {v0, v3, v2, v5}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Lf20/a;->a(Ly00/u1;)Lf20/b;

    move-result-object v2

    new-instance v3, Lw10/e;

    invoke-direct {v3, v0, v6, v2}, Lw10/e;-><init>(Lj/i;Ljava/lang/String;Lf20/b;)V

    :goto_11
    iput-object v3, v12, Lt20/w;->e0:Lw10/e;

    new-instance v0, Ld0/b2;

    invoke-direct {v0, v9, v4, v12}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_46
    check-cast v14, Lbc3/c0;

    check-cast v13, Lp1/c1;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ljava/lang/String;

    invoke-static {v14, v13, v15, v0}, Lsy2/p;->a(Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_47
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Lty2/a$a$b;

    check-cast v13, Lp1/c1;

    check-cast v0, Lorg/joda/time/LocalDate;

    invoke-static {v15, v14, v13, v0}, Lsy2/e;->e(Lkotlin/jvm/functions/Function1;Lty2/a$a$b;Lp1/c1;Lorg/joda/time/LocalDate;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_48
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Lp1/t2;

    check-cast v13, Llv0/b;

    check-cast v0, Leb/s0;

    invoke-static {v15, v14, v13, v0}, Lsv0/b;->c(Lkotlin/jvm/functions/Function1;Lp1/t2;Llv0/b;Leb/s0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_49
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Ll83/h;

    check-cast v13, Ll83/h;

    check-cast v0, Lqu1/c;

    invoke-static {v15, v14, v13, v0}, Lsu1/f;->f(Lkotlin/jvm/functions/Function1;Ll83/h;Ll83/h;Lqu1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4a
    check-cast v15, Lpc0/a;

    check-cast v14, Lpc0/c;

    check-cast v13, Ll83/h;

    check-cast v0, Lqc0/a;

    invoke-static {v15, v14, v13, v0}, Lsc0/h;->e(Lpc0/a;Lpc0/c;Ll83/h;Lqc0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4b
    check-cast v13, Lp1/c1;

    check-cast v15, Lmc0/c;

    check-cast v14, Ljava/lang/String;

    check-cast v0, Lp1/i0;

    invoke-static {v13, v15, v14, v0}, Lsc0/h;->a(Lp1/c1;Lmc0/c;Ljava/lang/String;Lp1/i0;)Lp1/h0;

    move-result-object v0

    return-object v0

    :pswitch_4c
    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v14, Ls90/c;

    check-cast v13, Lp1/c1;

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v15, v14, v13, v0}, Ls90/g;->h(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
.end method
