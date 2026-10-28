.class public final Lq00/n0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ly00/c0;

.field public final synthetic z:Lq00/p0;


# direct methods
.method public constructor <init>(Lq00/p0;Ly00/c0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq00/n0;->w:I

    .line 1
    iput-object p1, p0, Lq00/n0;->z:Lq00/p0;

    iput-object p2, p0, Lq00/n0;->y:Ly00/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ly00/c0;Lq00/p0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq00/n0;->w:I

    .line 2
    iput-object p1, p0, Lq00/n0;->y:Ly00/c0;

    iput-object p2, p0, Lq00/n0;->z:Lq00/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lq00/n0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lq00/n0;

    iget-object v0, p0, Lq00/n0;->y:Ly00/c0;

    iget-object v1, p0, Lq00/n0;->z:Lq00/p0;

    invoke-direct {p1, v0, v1, p2}, Lq00/n0;-><init>(Ly00/c0;Lq00/p0;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lq00/n0;

    iget-object v0, p0, Lq00/n0;->z:Lq00/p0;

    iget-object v1, p0, Lq00/n0;->y:Ly00/c0;

    invoke-direct {p1, v0, v1, p2}, Lq00/n0;-><init>(Lq00/p0;Ly00/c0;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq00/n0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq00/n0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/n0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq00/n0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq00/n0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq00/n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lq00/n0;->w:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq00/n0;->x:I

    const/4 v3, 0x0

    iget-object v4, v0, Lq00/n0;->y:Ly00/c0;

    const/4 v5, 0x1

    iget-object v6, v0, Lq00/n0;->z:Lq00/p0;

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Ly00/i0;

    invoke-virtual {v4}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v9, v6, Lq00/p0;->w:Lwz/g0;

    iget-object v9, v9, Lwz/g0;->i0:Ly00/n;

    invoke-virtual {v9}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v9

    check-cast v9, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v7, v8, v3, v9}, Ly00/i0;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    iget-object v7, v6, Lq00/p0;->y:Lxz/x;

    iput v5, v0, Lq00/n0;->x:I

    invoke-virtual {v7, v2, v3, v0}, Lxz/x;->x(Ly00/i0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_4

    :cond_2
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_8

    check-cast v1, Ly00/d0;

    iget-object v1, v6, Lq00/p0;->M:Lec3/h2;

    :cond_3
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lq00/i0;

    iget-object v6, v5, Lq00/i0;->a:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly00/c0;

    instance-of v9, v8, Ly00/x;

    if-eqz v9, :cond_4

    check-cast v8, Ly00/x;

    invoke-virtual {v4}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v8, Ly00/x;->y:Ljava/lang/String;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/16 v10, 0xfb

    invoke-static {v8, v9, v3, v3, v10}, Ly00/x;->i(Ly00/x;ZLy00/y;Ljava/lang/String;I)Ly00/x;

    move-result-object v8

    goto :goto_2

    :cond_4
    instance-of v9, v8, Ly00/a0;

    if-eqz v9, :cond_5

    check-cast v8, Ly00/a0;

    invoke-virtual {v4}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v8, Ly00/a0;->y:Ljava/lang/String;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/16 v10, 0xffb

    invoke-static {v8, v9, v3, v3, v10}, Ly00/a0;->i(Ly00/a0;ZLy00/y;Ljava/lang/String;I)Ly00/a0;

    move-result-object v8

    goto :goto_2

    :cond_5
    instance-of v9, v8, Ly00/b0;

    if-eqz v9, :cond_6

    :goto_2
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    const/4 v15, 0x0

    const v16, 0xffefffe

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_8
    const-string v1, "Failed to set payment method as default"

    invoke-static {v6, v2, v1}, Lq00/p0;->l(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    :pswitch_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq00/n0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, v0, Lq00/n0;->z:Lq00/p0;

    if-eqz v2, :cond_b

    if-eq v2, v4, :cond_a

    if-ne v2, v3, :cond_9

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_5

    :cond_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Lq00/p0;->y:Lxz/x;

    iget-object v6, v0, Lq00/n0;->y:Ly00/c0;

    invoke-virtual {v6}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v6

    iput v4, v0, Lq00/n0;->x:I

    invoke-virtual {v2, v6, v0}, Lxz/x;->e(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    goto :goto_8

    :cond_c
    :goto_5
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_e

    check-cast v2, Ll83/a0;

    iget-object v2, v5, Lq00/p0;->N:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq00/i0;

    invoke-virtual {v2}, Lq00/i0;->d()Ly00/c0;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_d
    const/4 v2, 0x0

    :goto_6
    iput v3, v0, Lq00/n0;->x:I

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0}, Lq00/p0;->o(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_f

    goto :goto_8

    :cond_e
    const-string v1, "Failed to delete payment method"

    invoke-static {v5, v4, v1}, Lq00/p0;->l(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_f
    :goto_7
    iget-object v1, v5, Lq00/p0;->M:Lec3/h2;

    :cond_10
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lq00/i0;

    const/4 v13, 0x0

    const v14, 0xffeffff

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v3 .. v14}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
