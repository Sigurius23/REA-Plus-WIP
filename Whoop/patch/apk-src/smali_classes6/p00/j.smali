.class public final synthetic Lp00/j;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Lp00/j;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lp00/j;->w:I

    sget-object v2, Lt10/q;->w:Lt10/q;

    sget-object v3, Ln40/d;->a:Ln40/d;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lb1/f;

    invoke-interface {v1}, Lb1/f;->s()Lx0/c;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lx20/w;

    invoke-virtual {v1}, Lx20/w;->j()V

    return-object v8

    :pswitch_1
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lx20/w;

    iget-object v1, v1, Lx20/w;->y:Lec3/h2;

    :cond_0
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lx20/p;

    const/4 v13, 0x0

    const/4 v14, 0x7

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v8

    :pswitch_2
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    iget-object v2, v1, Lwz/y;->H:Landroidx/lifecycle/k1;

    const-string v3, "use_link_configuration_customer_info"

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lwz/y;->V:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lwz/q1;

    if-eqz v2, :cond_1

    iget-object v2, v1, Lwz/y;->y:Lxz/f0;

    new-instance v3, Lwz/d;

    invoke-direct {v3, v7, v7}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-virtual {v2, v3}, Lxz/f0;->a(Lwz/d;)V

    iget-object v1, v1, Lwz/y;->U:Lec3/h2;

    new-instance v2, Lwz/o1;

    sget-object v3, Lwz/z0;->d:Lwz/z0;

    invoke-direct {v2, v3}, Lwz/o1;-><init>(Lwz/e1;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v7, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v2, Lwz/z0;->d:Lwz/z0;

    invoke-static {v1, v2, v6}, Lwz/y;->q(Lwz/y;Lwz/e1;Z)V

    :goto_0
    return-object v8

    :pswitch_3
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    iget-object v2, v1, Lwz/y;->w:Lc00/a;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v2

    iget-boolean v2, v2, Lwz/m1;->a:Z

    if-eqz v2, :cond_2

    iget-object v1, v1, Lwz/y;->J:Ln40/g;

    iget-object v1, v1, Ln40/g;->a:Lec3/w1;

    invoke-virtual {v1, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_2
    return-object v8

    :pswitch_4
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    iget-object v2, v1, Lwz/y;->w:Lc00/a;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v2

    iget-boolean v2, v2, Lwz/m1;->a:Z

    if-eqz v2, :cond_3

    new-instance v2, Lwz/m;

    iget-object v3, v1, Lwz/y;->x:Lxz/x;

    invoke-static {v3}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v3

    invoke-direct {v2, v3}, Lwz/m;-><init>(Lwz/e;)V

    invoke-virtual {v1, v2}, Lwz/y;->l(Lwz/q;)V

    :cond_3
    return-object v8

    :pswitch_5
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    iget-object v2, v1, Lwz/y;->w:Lc00/a;

    invoke-virtual {v2}, Lc00/a;->a()Lwz/m1;

    move-result-object v2

    iget-boolean v2, v2, Lwz/m1;->a:Z

    if-eqz v2, :cond_4

    iget-object v1, v1, Lwz/y;->J:Ln40/g;

    iget-object v1, v1, Ln40/g;->a:Lec3/w1;

    invoke-virtual {v1, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_4
    return-object v8

    :pswitch_6
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    new-instance v2, Lwz/m;

    iget-object v3, v1, Lwz/y;->x:Lxz/x;

    invoke-static {v3}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v3

    invoke-direct {v2, v3}, Lwz/m;-><init>(Lwz/e;)V

    invoke-virtual {v1, v2}, Lwz/y;->l(Lwz/q;)V

    return-object v8

    :pswitch_7
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lu10/u;

    iget-object v2, v1, Lu10/u;->d:Lh20/f;

    iget-object v2, v2, Lh20/f;->c:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, v1, Lu10/u;->e:Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu10/q;

    new-instance v2, Lu10/l;

    invoke-direct {v2, v5}, Lu10/l;-><init>(Z)V

    invoke-virtual {v1, v2}, Lu10/q;->a(Lu10/j;)V

    :cond_5
    return-object v8

    :pswitch_8
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/z4;

    invoke-virtual {v1}, Lh20/z4;->e()V

    return-object v8

    :pswitch_9
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lt20/w;

    invoke-virtual {v1, v6}, Lt20/w;->q(Z)V

    return-object v8

    :pswitch_a
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lt20/w;

    iget-object v2, v1, Lt20/w;->Z:Ln53/e;

    iget-object v3, v1, Lt20/w;->N:Ln53/e;

    iget-object v4, v1, Lt20/w;->z:Landroidx/lifecycle/k1;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt20/g;

    iget-object v2, v2, Lt20/g;->z:Lt20/b;

    if-nez v2, :cond_10

    iget-object v2, v1, Lt20/w;->Y:Lec3/h2;

    :cond_6
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lt20/g;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v10, 0x1b

    invoke-static {v9, v6, v7, v10}, Lt20/g;->b(Lt20/g;ZLt20/b;I)Lt20/g;

    move-result-object v9

    invoke-virtual {v2, v5, v9}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v2, v1, Lt20/w;->w:Lt20/v;

    iget-object v12, v2, Lt20/v;->i:Ljava/lang/String;

    iget-boolean v5, v2, Lt20/v;->g:Z

    iget-boolean v6, v2, Lt20/v;->a:Z

    iget-object v9, v1, Lt20/w;->y:Lk83/a;

    const-string v10, "has_launched"

    invoke-virtual {v4, v10}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto/16 :goto_7

    :cond_7
    invoke-virtual {v4, v13, v10}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lt20/w;->a0:Lec3/w1;

    sget-object v10, Lt20/t;->a:Lt20/t;

    invoke-virtual {v4, v10}, Lec3/w1;->a(Ljava/lang/Object;)Z

    const-string v4, "publishableKey"

    if-eqz v12, :cond_a

    if-eqz v6, :cond_8

    new-instance v2, Lw10/a;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Lt20/w;->o()Ljz/e;

    move-result-object v6

    invoke-direct {v2, v3, v6}, Lw10/a;-><init>(Ljava/lang/String;Ljz/e;)V

    :goto_1
    move-object v13, v2

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lt20/w;->n()Lw10/c;

    move-result-object v2

    goto :goto_1

    :goto_2
    const-string v2, "clientSecret"

    if-eqz v5, :cond_9

    iget-object v1, v1, Lt20/w;->e0:Lw10/e;

    if-eqz v1, :cond_10

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lux/y;

    iget-object v10, v3, Lux/y;->w:Ljava/lang/String;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lux/y;

    iget-object v11, v3, Lux/y;->x:Ljava/lang/String;

    iget v3, v1, Lw10/e;->a:I

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v3, :pswitch_data_1

    iget-object v2, v1, Lw10/e;->b:Lj/i;

    iget-object v3, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    new-instance v9, Lz10/c;

    const/4 v14, 0x1

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lz10/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;ZLf20/b;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto/16 :goto_7

    :pswitch_b
    iget-object v2, v1, Lw10/e;->b:Lj/i;

    iget-object v3, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    new-instance v9, Lz10/c;

    const/4 v14, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lz10/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;ZLf20/b;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto/16 :goto_7

    :cond_9
    iget-object v1, v1, Lt20/w;->e0:Lw10/e;

    if-eqz v1, :cond_10

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lux/y;

    iget-object v10, v3, Lux/y;->w:Ljava/lang/String;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lux/y;

    iget-object v11, v3, Lux/y;->x:Ljava/lang/String;

    iget v3, v1, Lw10/e;->a:I

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v3, :pswitch_data_2

    iget-object v2, v1, Lw10/e;->b:Lj/i;

    iget-object v3, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    new-instance v9, Lz10/d;

    const/4 v14, 0x1

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lz10/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;ZLf20/b;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto/16 :goto_7

    :pswitch_c
    iget-object v2, v1, Lw10/e;->b:Lj/i;

    iget-object v3, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    new-instance v9, Lz10/d;

    const/4 v14, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lz10/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;ZLf20/b;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto/16 :goto_7

    :cond_a
    iget-object v10, v2, Lt20/v;->h:Ljava/lang/String;

    iget-object v11, v2, Lt20/v;->d:Ls20/a;

    if-nez v10, :cond_b

    goto/16 :goto_7

    :cond_b
    if-eqz v6, :cond_c

    new-instance v6, Lw10/a;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Lt20/w;->o()Ljz/e;

    move-result-object v12

    invoke-direct {v6, v3, v12}, Lw10/a;-><init>(Ljava/lang/String;Ljz/e;)V

    :goto_3
    move-object v13, v6

    goto :goto_4

    :cond_c
    invoke-virtual {v1}, Lt20/w;->n()Lw10/c;

    move-result-object v6

    goto :goto_3

    :goto_4
    const-string v3, "elementsSessionId"

    if-eqz v5, :cond_f

    iget-object v1, v1, Lt20/w;->e0:Lw10/e;

    if-eqz v1, :cond_10

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lux/y;

    iget-object v5, v5, Lux/y;->w:Ljava/lang/String;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lux/y;

    iget-object v12, v6, Lux/y;->x:Ljava/lang/String;

    iget-object v2, v2, Lt20/v;->j:Ljava/lang/String;

    iget-object v6, v11, Ls20/a;->d:Lu30/a;

    if-eqz v6, :cond_d

    iget-wide v14, v6, Lu30/a;->w:J

    long-to-int v6, v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v19, v6

    goto :goto_5

    :cond_d
    move-object/from16 v19, v7

    :goto_5
    iget-object v6, v11, Ls20/a;->d:Lu30/a;

    if-eqz v6, :cond_e

    iget-object v6, v6, Lu30/a;->x:Ljava/lang/String;

    move-object/from16 v20, v6

    goto :goto_6

    :cond_e
    move-object/from16 v20, v7

    :goto_6
    iget v6, v1, Lw10/e;->a:I

    packed-switch v6, :pswitch_data_3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lw10/e;->b:Lj/i;

    iget-object v15, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v14, v1, Lw10/e;->c:Lf20/b;

    move-object/from16 v16, v10

    new-instance v10, Lz10/a;

    const/16 v17, 0x0

    move-object/from16 v18, v2

    move-object v11, v5

    invoke-direct/range {v10 .. v20}, Lz10/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lw10/d;Lf20/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v3, v10, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto/16 :goto_7

    :pswitch_d
    move-object/from16 v18, v2

    move-object v11, v5

    move-object v2, v10

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lw10/e;->b:Lj/i;

    iget-object v15, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v14, v1, Lw10/e;->c:Lf20/b;

    new-instance v10, Lz10/a;

    const/16 v17, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v10 .. v20}, Lz10/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lw10/d;Lf20/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v3, v10, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_7

    :cond_f
    move-object v5, v10

    iget-object v1, v1, Lt20/w;->e0:Lw10/e;

    if-eqz v1, :cond_10

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lux/y;

    iget-object v11, v6, Lux/y;->w:Ljava/lang/String;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lux/y;

    iget-object v12, v6, Lux/y;->x:Ljava/lang/String;

    iget-object v2, v2, Lt20/v;->j:Ljava/lang/String;

    iget v6, v1, Lw10/e;->a:I

    packed-switch v6, :pswitch_data_4

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lw10/e;->b:Lj/i;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    iget-object v14, v1, Lw10/e;->d:Ljava/lang/String;

    new-instance v10, Lz10/b;

    const/16 v17, 0x0

    move-object/from16 v18, v2

    move-object/from16 v16, v5

    invoke-direct/range {v10 .. v18}, Lz10/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lw10/d;Ljava/lang/String;Lf20/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v10, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_7

    :pswitch_e
    move-object/from16 v18, v2

    move-object v2, v5

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lw10/e;->b:Lj/i;

    iget-object v14, v1, Lw10/e;->d:Ljava/lang/String;

    iget-object v15, v1, Lw10/e;->c:Lf20/b;

    new-instance v10, Lz10/b;

    const/16 v17, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v10 .. v18}, Lz10/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lw10/d;Ljava/lang/String;Lf20/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v10, v7}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_10
    :goto_7
    return-object v8

    :pswitch_f
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    sget v2, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lt10/r;

    invoke-direct {v2, v7, v6}, Lt10/r;-><init>(Lq20/y;Z)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->o(Lt10/s;)V

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-object v8

    :pswitch_10
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    sget v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->o(Lt10/s;)V

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-object v8

    :pswitch_11
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    sget v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->o(Lt10/s;)V

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-object v8

    :pswitch_12
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v2, v1, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lwz/m;

    sget-object v4, Lwz/l;->y:Lwz/l;

    iget-object v1, v1, Lq00/p0;->y:Lxz/x;

    invoke-static {v1}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lwz/m;-><init>(Lwz/l;Lwz/e;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v8

    :pswitch_13
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v1, v1, Lq00/p0;->M:Lec3/h2;

    :cond_11
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lq00/i0;

    const/16 v19, 0x0

    const v20, 0x7ffffff

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v9 .. v20}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    return-object v8

    :pswitch_14
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v2, v1, Lq00/p0;->M:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq00/i0;

    invoke-virtual {v2}, Lq00/i0;->d()Ly00/c0;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_9

    :cond_12
    invoke-static {v1, v6}, Lq00/p0;->t(Lq00/p0;Z)V

    instance-of v3, v2, Ly00/a0;

    if-eqz v3, :cond_13

    move-object v3, v2

    check-cast v3, Ly00/a0;

    goto :goto_8

    :cond_13
    move-object v3, v7

    :goto_8
    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ly00/a0;->k()Z

    move-result v3

    if-ne v3, v6, :cond_14

    move v5, v6

    :cond_14
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    new-instance v6, Landroidx/room/y0;

    invoke-direct {v6, v5, v1, v2, v7}, Landroidx/room/y0;-><init>(ZLq00/p0;Ly00/c0;Lq83/d;)V

    invoke-static {v3, v7, v7, v6, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_9
    return-object v8

    :pswitch_15
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v1, v1, Lq00/p0;->M:Lec3/h2;

    :cond_15
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lq00/i0;

    const/16 v19, 0x0

    const v20, 0xfdfffff

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v9 .. v20}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    return-object v8

    :pswitch_16
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    iput-boolean v6, v1, Lp00/o;->P:Z

    return-object v8

    :pswitch_17
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->j()V

    return-object v8

    :pswitch_18
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->l()V

    return-object v8

    :pswitch_19
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->o()V

    return-object v8

    :pswitch_1a
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->g()V

    iget-object v2, v1, Lp00/o;->I:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lp00/l;

    invoke-direct {v3, v1, v7, v5}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    invoke-static {v2, v7, v7, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_1b
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->g()V

    iget-object v2, v1, Lp00/o;->J:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v1, v1, Lp00/o;->z:Lyz/b;

    sget-object v2, Lyz/c;->P:Lyz/c;

    invoke-virtual {v1, v2, v7}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-object v8

    :pswitch_1c
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    iput-boolean v6, v1, Lp00/o;->P:Z

    return-object v8

    :pswitch_1d
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->j()V

    return-object v8

    :pswitch_1e
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->l()V

    return-object v8

    :pswitch_1f
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->o()V

    return-object v8

    :pswitch_20
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->g()V

    iget-object v2, v1, Lp00/o;->I:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lp00/l;

    invoke-direct {v3, v1, v7, v5}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    invoke-static {v2, v7, v7, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
    .packed-switch 0x0
        :pswitch_b
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_d
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_e
    .end packed-switch
.end method
