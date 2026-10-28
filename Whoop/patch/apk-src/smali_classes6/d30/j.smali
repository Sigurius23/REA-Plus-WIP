.class public final synthetic Ld30/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/u;


# direct methods
.method public synthetic constructor <init>(Ld30/u;I)V
    .locals 0

    iput p2, p0, Ld30/j;->w:I

    iput-object p1, p0, Ld30/j;->x:Ld30/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Ld30/j;->w:I

    const/16 v2, 0xa

    const-string v4, "paymentMethods"

    iget-object v5, v0, Ld30/j;->x:Ld30/u;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    move-object/from16 v6, p2

    check-cast v6, La30/n1;

    move-object/from16 v7, p3

    check-cast v7, Ly00/o4;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v7, :cond_0

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ly00/o4;

    :cond_0
    if-eqz v7, :cond_1

    iget-object v3, v7, Ly00/o4;->E:Ly00/f4;

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v1, v5, Ld30/u;->p:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu00/f;

    iget-object v2, v2, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    if-eqz v3, :cond_3

    const-string v2, "saved"

    invoke-virtual {v1, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v6, :cond_4

    sget-object v2, La30/g1;->x:La30/g1;

    invoke-virtual {v6, v2}, La30/n1;->b(La30/g1;)La30/m1;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v2, Ly00/f4;->G:Lt9/c0;

    const-string v2, "link"

    invoke-virtual {v1, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v6, :cond_5

    sget-object v2, La30/g1;->x:La30/g1;

    invoke-virtual {v6, v2}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v2

    if-eqz v2, :cond_5

    const-string v2, "google_pay"

    invoke-virtual {v1, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v1, v4}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    move-object/from16 v6, p2

    check-cast v6, La30/n1;

    move-object/from16 v7, p3

    check-cast v7, Lq20/c;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v5, Ld30/u;->p:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v9, 0x0

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu00/f;

    if-eqz v7, :cond_6

    iget-object v10, v4, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v7, v10}, Lq20/c;->b(Ljava/lang/String;)Lq20/c;

    move-result-object v10

    goto :goto_3

    :cond_6
    const/4 v10, 0x0

    :goto_3
    new-instance v11, Ld30/l;

    invoke-direct {v11, v9, v5, v4}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Ly00/f4;->I:Ly00/f4;

    move-object v12, v1

    check-cast v12, Ljava/lang/Iterable;

    instance-of v13, v12, Ljava/util/Collection;

    if-eqz v13, :cond_7

    move-object v13, v12

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly00/o4;

    iget-object v13, v13, Ly00/o4;->E:Ly00/f4;

    if-ne v13, v9, :cond_8

    iget-object v9, v4, Lu00/f;->a:Ljava/lang/String;

    const-string v12, "card"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const v9, 0x7f14108a

    invoke-static {v9}, Ls4/i;->h(I)Lzy/b;

    move-result-object v9

    :goto_4
    move-object v14, v9

    goto :goto_6

    :cond_9
    :goto_5
    iget-object v9, v4, Lu00/f;->c:Lzy/c;

    goto :goto_4

    :goto_6
    iget-object v12, v4, Lu00/f;->a:Ljava/lang/String;

    iget-object v13, v4, Lu00/f;->b:Ljava/lang/String;

    iget v15, v4, Lu00/f;->d:I

    iget-object v9, v4, Lu00/f;->e:Ljava/lang/Integer;

    iget-object v3, v4, Lu00/f;->j:Ljava/lang/Integer;

    iget-object v0, v4, Lu00/f;->f:Ljava/lang/String;

    move-object/from16 v17, v0

    iget-object v0, v4, Lu00/f;->g:Ljava/lang/String;

    move-object/from16 v18, v0

    iget-boolean v0, v4, Lu00/f;->h:Z

    iget-object v4, v4, Lu00/f;->i:Lzy/c;

    if-eqz v10, :cond_a

    iget-object v10, v10, Lq20/c;->x:Ljava/lang/String;

    move-object/from16 v21, v10

    :goto_7
    move-object/from16 v22, v11

    goto :goto_8

    :cond_a
    const/16 v21, 0x0

    goto :goto_7

    :goto_8
    new-instance v11, Ld30/w;

    move/from16 v19, v0

    move-object/from16 v23, v3

    move-object/from16 v20, v4

    move-object/from16 v16, v9

    invoke-direct/range {v11 .. v23}, Ld30/w;-><init>(Ljava/lang/String;Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/String;Lc93/a;Ljava/lang/Integer;)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz v6, :cond_f

    sget-object v1, La30/g1;->x:La30/g1;

    invoke-virtual {v6, v1}, La30/n1;->b(La30/g1;)La30/m1;

    move-result-object v1

    if-eqz v1, :cond_f

    iget-object v1, v1, La30/m1;->a:Lse/h;

    instance-of v2, v1, Lh00/r;

    if-eqz v2, :cond_c

    check-cast v1, Lh00/r;

    iget-object v1, v1, Lh00/r;->a:Ljava/lang/String;

    invoke-static {v1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v1

    :goto_9
    move-object v14, v1

    goto :goto_b

    :cond_c
    instance-of v2, v1, Lh00/q;

    if-nez v2, :cond_e

    instance-of v1, v1, Lh00/p;

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_a
    const v1, 0x7f141041

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    goto :goto_9

    :goto_b
    new-instance v10, Ld30/w;

    sget-object v1, Ly00/f4;->G:Lt9/c0;

    const v1, 0x7f14102c

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v12

    new-instance v15, Ld30/m;

    invoke-direct {v15, v5, v9}, Ld30/m;-><init>(Ld30/u;I)V

    const-string v11, "link"

    const v13, 0x7f08080d

    invoke-direct/range {v10 .. v15}, Ld30/w;-><init>(Ljava/lang/String;Lzy/b;ILzy/c;Lc93/a;)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    if-eqz v6, :cond_10

    sget-object v1, La30/g1;->x:La30/g1;

    invoke-virtual {v6, v1}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v1

    if-eqz v1, :cond_10

    new-instance v9, Ld30/w;

    const v1, 0x7f14100d

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v11

    new-instance v14, Ld30/m;

    const/4 v1, 0x1

    invoke-direct {v14, v5, v1}, Ld30/m;-><init>(Ld30/u;I)V

    const-string v10, "google_pay"

    const v12, 0x7f0807a0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v14}, Ld30/w;-><init>(Ljava/lang/String;Lzy/b;ILzy/c;Lc93/a;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-static {v0, v8}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
