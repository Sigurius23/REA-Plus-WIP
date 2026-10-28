.class public final Luf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/e;


# instance fields
.field public final synthetic a:I

.field public final b:Lyf/e;

.field public final c:La30/w0;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyf/e;Luf/h;La30/w0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Luf/e;->a:I

    const-string v0, "deserializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Luf/e;->b:Lyf/e;

    .line 7
    iput-object p2, p0, Luf/e;->d:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, Luf/e;->c:La30/w0;

    return-void
.end method

.method public constructor <init>(Lyf/e;Luf/l;La30/w0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luf/e;->a:I

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luf/e;->b:Lyf/e;

    .line 3
    iput-object p2, p0, Luf/e;->d:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Luf/e;->c:La30/w0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luf/e;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2}, Luf/e;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2}, Luf/e;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Luf/u;Lq83/d;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Luf/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luf/e;->c:La30/w0;

    iget-object v1, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Ldg/a;

    instance-of v3, p2, Luf/d0;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Luf/d0;

    iget v4, v3, Luf/d0;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Luf/d0;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Luf/d0;

    check-cast p2, Ls83/c;

    invoke-direct {v3, p0, p2}, Luf/d0;-><init>(Luf/e;Ls83/c;)V

    :goto_0
    iget-object p2, v3, Luf/d0;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Luf/d0;->z:I

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    const/4 p1, 0x2

    if-eq v5, p1, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Lvf/b;

    move-object p1, v8

    goto :goto_3

    :cond_3
    iget-object p1, v3, Luf/d0;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Luf/u;->b:Ljava/lang/Object;

    iput-object p1, v3, Luf/d0;->w:Luf/u;

    iput v7, v3, Luf/d0;->z:I

    invoke-virtual {v0, p2, v3}, La30/w0;->A(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    invoke-static {p1, p2}, Luf/u;->a(Luf/u;Ljava/lang/Object;)Luf/u;

    move-result-object p2

    iget-object v5, p2, Luf/u;->b:Ljava/lang/Object;

    iput-object v5, v0, La30/w0;->E:Ljava/lang/Object;

    new-instance v7, Lsf/c;

    const-string v9, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v2, v5}, Lsf/c;-><init>(Ldg/a;Ljava/lang/Object;)V

    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcf/a;

    invoke-interface {v10, v7}, Lcf/a;->d(Lsf/c;)V

    goto :goto_2

    :cond_6
    iget-object p1, p1, Luf/u;->a:Ldg/a;

    sget-object v7, Luf/i;->f:Lgf/a;

    invoke-virtual {p1, v7, v5}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    iget-object p1, p0, Luf/e;->d:Ljava/lang/Object;

    check-cast p1, Luf/l;

    instance-of v7, p1, Luf/l;

    if-eqz v7, :cond_a

    check-cast p1, Luf/l;

    iget-object v7, p2, Luf/u;->a:Ldg/a;

    invoke-interface {p1, v7, v5}, Luf/l;->a(Ldg/a;Ljava/lang/Object;)Lvf/b;

    move-result-object p1

    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    :goto_3
    invoke-static {p2}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v5

    iput-object v5, v0, La30/w0;->F:Ljava/lang/Object;

    iget-object v0, v0, La30/w0;->E:Ljava/lang/Object;

    if-eqz v0, :cond_9

    new-instance v7, Lsf/e;

    invoke-direct {v7, v0, v5, v2}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcf/a;

    invoke-interface {v1, v7}, Lcf/a;->n(Lsf/e;)V

    goto :goto_4

    :cond_7
    new-instance v0, Luf/u;

    iget-object p1, p1, Luf/u;->a:Ldg/a;

    invoke-direct {v0, p1, p2}, Luf/u;-><init>(Ldg/a;Ljava/lang/Object;)V

    iput-object v8, v3, Luf/d0;->w:Luf/u;

    iput v6, v3, Luf/d0;->z:I

    iget-object p1, p0, Luf/e;->b:Lyf/e;

    invoke-interface {p1, v0, v3}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_8

    :goto_5
    move-object p2, v4

    :cond_8
    :goto_6
    return-object p2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Luf/e;->d:Ljava/lang/Object;

    check-cast v0, Luf/h;

    iget-object v1, p0, Luf/e;->c:La30/w0;

    iget-object v2, v1, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v1, La30/w0;->x:Ljava/lang/Object;

    check-cast v3, Ldg/a;

    instance-of v4, p2, Luf/d;

    if-eqz v4, :cond_b

    move-object v4, p2

    check-cast v4, Luf/d;

    iget v5, v4, Luf/d;->F:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_b

    sub-int/2addr v5, v6

    iput v5, v4, Luf/d;->F:I

    goto :goto_7

    :cond_b
    new-instance v4, Luf/d;

    check-cast p2, Ls83/c;

    invoke-direct {v4, p0, p2}, Luf/d;-><init>(Luf/e;Ls83/c;)V

    :goto_7
    iget-object p2, v4, Luf/d;->z:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Luf/d;->F:I

    const-string v7, "Required value was null."

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v6, :cond_10

    if-eq v6, v10, :cond_f

    if-eq v6, v9, :cond_e

    if-eq v6, v8, :cond_d

    const/4 p1, 0x4

    if-ne v6, p1, :cond_c

    iget-object p1, v4, Luf/d;->y:Lrf/l;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    iget-object p1, v4, Luf/d;->y:Lrf/l;

    iget-object v4, v4, Luf/d;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_e
    iget-object p1, v4, Luf/d;->x:Lrf/l;

    iget-object v6, v4, Luf/d;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    iget-object p1, v4, Luf/d;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v4, Luf/d;->w:Luf/u;

    iput v10, v4, Luf/d;->F:I

    iget-object p2, p0, Luf/e;->b:Lyf/e;

    invoke-interface {p2, p1, v4}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v5, :cond_11

    goto/16 :goto_e

    :cond_11
    :goto_8
    check-cast p2, Lrf/l;

    iput-object p1, v4, Luf/d;->w:Luf/u;

    iput-object p2, v4, Luf/d;->x:Lrf/l;

    iput v9, v4, Luf/d;->F:I

    invoke-virtual {v1, p2, v4}, La30/w0;->y(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_12

    goto/16 :goto_e

    :cond_12
    move-object v12, v6

    move-object v6, p1

    move-object p1, p2

    move-object p2, v12

    :goto_9
    check-cast p2, Lwf/a;

    invoke-static {p1, p2}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p1

    iget-object p2, p1, Lrf/l;->x:Lwf/a;

    iget-object v9, p1, Lrf/l;->w:Lvf/a;

    iget-object v10, v1, La30/w0;->E:Ljava/lang/Object;

    if-eqz v10, :cond_18

    new-instance v11, Lsf/f;

    invoke-direct {v11, v10, v9, p2, v3}, Lsf/f;-><init>(Ljava/lang/Object;Lvf/a;Lwf/a;Ldg/a;)V

    move-object v9, v2

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcf/a;

    invoke-interface {v10, v11}, Lcf/a;->i(Lsf/f;)V

    goto :goto_a

    :cond_13
    instance-of v9, v0, Luf/h;

    if-eqz v9, :cond_17

    iget-object p2, p2, Lwf/a;->c:Lmf/l;

    iput-object v6, v4, Luf/d;->w:Luf/u;

    const/4 v9, 0x0

    iput-object v9, v4, Luf/d;->x:Lrf/l;

    iput-object p1, v4, Luf/d;->y:Lrf/l;

    iput v8, v4, Luf/d;->F:I

    invoke-static {p2, v4}, Lx30/s0;->B(Lmf/l;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v5, :cond_14

    goto :goto_e

    :cond_14
    move-object v4, v6

    :goto_b
    check-cast p2, [B

    check-cast v0, Luf/h;

    iget-object v4, v4, Luf/u;->a:Ldg/a;

    invoke-interface {v0, v4, p1, p2}, Luf/h;->a(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object p2

    :goto_c
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, La30/w0;->E:Ljava/lang/Object;

    if-eqz v0, :cond_16

    const-string v1, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsf/d;

    invoke-direct {v1, v0, p2, p1, v3}, Lsf/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lrf/l;Ldg/a;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/a;

    invoke-interface {v0, v1}, Lcf/a;->h(Lsf/d;)V

    goto :goto_d

    :cond_15
    move-object v5, p2

    :goto_e
    return-object v5

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
