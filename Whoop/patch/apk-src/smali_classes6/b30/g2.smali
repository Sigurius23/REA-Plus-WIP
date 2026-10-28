.class public final Lb30/g2;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lb30/g2;->x:I

    iput-object p1, p0, Lb30/g2;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lb30/g2;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lb30/g2;

    iget-object v1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v1, Lu2/l;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/g2;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lb30/g2;

    iget-object v1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/g2;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lb30/g2;

    iget-object v1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v1, Lf0/k;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/g2;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance v0, Lb30/g2;

    iget-object v1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/g2;->z:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/g2;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/g2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/g2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/g2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/g2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/g2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/g2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/g2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/g2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/g2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/g2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/g2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/g2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb30/g2;->x:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/g2;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast p1, Lu2/b;

    iget-object v1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v1, Lu2/l;

    iput v2, p0, Lb30/g2;->y:I

    invoke-static {p1, v1, p0}, Lh0/o3;->j(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lb30/g2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    if-eq v2, v3, :cond_5

    if-ne v2, v5, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v1, v4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v2, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast v2, Lxb3/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    check-cast v0, Landroid/view/ViewGroup;

    const/4 p1, 0x0

    iput-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    iput v5, p0, Lb30/g2;->y:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lh5/z;

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-direct {p1, v3}, Lh5/z;-><init>(Lh5/r0;)V

    iget-object v0, p1, Lh5/z;->x:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    move-object p1, v4

    goto :goto_1

    :cond_6
    iput-object p1, v2, Lxb3/j;->y:Ljava/util/Iterator;

    iput v5, v2, Lxb3/j;->w:I

    iput-object p0, v2, Lxb3/j;->z:Lq83/d;

    move-object p1, v1

    :goto_1
    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v4

    :goto_2
    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast p1, Lxb3/j;

    iput-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    iput v3, p0, Lb30/g2;->y:I

    invoke-virtual {p1, v0, p0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    :goto_3
    return-object v1

    :pswitch_1
    iget-object v0, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast v0, Lf0/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lb30/g2;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_b

    if-eq v2, v4, :cond_a

    if-ne v2, v3, :cond_9

    iget-object v2, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    iget-object v2, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lu2/b;

    iput-object v2, p0, Lb30/g2;->z:Ljava/lang/Object;

    iput v4, p0, Lb30/g2;->y:I

    invoke-static {v2, p0, v3}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    goto/16 :goto_9

    :cond_c
    :goto_4
    check-cast p1, Lu2/r;

    iget-wide v4, p1, Lu2/r;->a:J

    iput-wide v4, v0, Lf0/k;->h:J

    iget-wide v4, p1, Lu2/r;->c:J

    iput-wide v4, v0, Lf0/k;->b:J

    :cond_d
    iput-object v2, p0, Lb30/g2;->z:Ljava/lang/Object;

    iput v3, p0, Lb30/g2;->y:I

    invoke-static {v2, p0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_9

    :cond_e
    :goto_5
    check-cast p1, Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object v5, p1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_6
    if-ge v7, v5, :cond_10

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lu2/r;

    iget-boolean v9, v9, Lu2/r;->d:Z

    if-eqz v9, :cond_f

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_7
    if-ge v6, p1, :cond_12

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lu2/r;

    iget-wide v7, v7, Lu2/r;->a:J

    iget-wide v9, v0, Lf0/k;->h:J

    invoke-static {v7, v8, v9, v10}, Lu2/q;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_12
    const/4 v5, 0x0

    :goto_8
    check-cast v5, Lu2/r;

    if-nez v5, :cond_13

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lu2/r;

    :cond_13
    if-eqz v5, :cond_14

    iget-wide v6, v5, Lu2/r;->a:J

    iput-wide v6, v0, Lf0/k;->h:J

    iget-wide v5, v5, Lu2/r;->c:J

    iput-wide v5, v0, Lf0/k;->b:J

    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_d

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lf0/k;->h:J

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/g2;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_16

    if-ne v1, v2, :cond_15

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb30/g2;->z:Ljava/lang/Object;

    check-cast p1, Lu2/b;

    iput v2, p0, Lb30/g2;->y:I

    invoke-static {p1, p0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_17

    goto :goto_b

    :cond_17
    :goto_a
    check-cast p1, Lu2/k;

    iget p1, p1, Lu2/k;->f:I

    if-ne p1, v2, :cond_18

    iget-object p1, p0, Lb30/g2;->E:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
