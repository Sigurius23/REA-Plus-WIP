.class public final Lag/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lag/e;->a:I

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lag/e;->b:Ljava/lang/Object;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lag/e;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lag/e;->a:I

    iput-object p1, p0, Lag/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lyf/e;Ls83/c;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lag/e;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2, p3}, Lag/e;->b(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2, p3}, Lag/e;->b(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lag/e;->b:Ljava/lang/Object;

    check-cast v0, Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2, p1, p3}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [Lag/b;

    invoke-virtual {v0, v1}, Lm83/m;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lag/b;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lag/b;

    invoke-static {p2, v0}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object p2

    invoke-interface {p2, p1, p3}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_2
    instance-of v0, p3, Lag/d;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Lag/d;

    iget v1, v0, Lag/d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lag/d;->z:I

    goto :goto_1

    :cond_1
    new-instance v0, Lag/d;

    invoke-direct {v0, p0, p3}, Lag/d;-><init>(Lag/e;Ls83/c;)V

    :goto_1
    iget-object p3, v0, Lag/d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lag/d;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p2, v0, Lag/d;->w:Lyf/e;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lag/e;->b:Ljava/lang/Object;

    check-cast p3, Luf/o;

    iput-object p2, v0, Lag/d;->w:Lyf/e;

    iput v4, v0, Lag/d;->z:I

    invoke-interface {p3, p1, v0}, Luf/o;->d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, Lag/d;->w:Lyf/e;

    iput v3, v0, Lag/d;->z:I

    invoke-interface {p2, p3, v0}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_3
    move-object p3, v1

    :cond_6
    :goto_4
    return-object p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lag/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lag/e;->b:Ljava/lang/Object;

    check-cast v0, La30/w0;

    iget-object v1, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Ldg/a;

    instance-of v3, p3, Luf/n;

    if-eqz v3, :cond_0

    move-object v3, p3

    check-cast v3, Luf/n;

    iget v4, v3, Luf/n;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Luf/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Luf/n;

    check-cast p3, Ls83/c;

    invoke-direct {v3, p0, p3}, Luf/n;-><init>(Lag/e;Ls83/c;)V

    :goto_0
    iget-object p3, v3, Luf/n;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Luf/n;->E:I

    const-string v6, "Required value was null."

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v3, Luf/n;->x:Lyf/e;

    iget-object p1, v3, Luf/n;->w:Luf/u;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast p3, Lvf/b;

    const-string v5, "<this>"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lvf/g;

    invoke-direct {v5, p3, v8}, Lvf/g;-><init>(Lvf/b;Z)V

    iput-object p1, v3, Luf/n;->w:Luf/u;

    iput-object p2, v3, Luf/n;->x:Lyf/e;

    iput v8, v3, Luf/n;->E:I

    invoke-virtual {v0, v5, v3}, La30/w0;->C(Lvf/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v4, :cond_4

    goto :goto_5

    :cond_4
    :goto_1
    check-cast p3, Lvf/a;

    invoke-static {p3}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object p3

    invoke-static {p1, p3}, Luf/u;->a(Luf/u;Ljava/lang/Object;)Luf/u;

    move-result-object p1

    iget-object p3, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast p3, Lvf/b;

    invoke-static {p3}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object p3

    iput-object p3, v0, La30/w0;->F:Ljava/lang/Object;

    iget-object v5, v0, La30/w0;->E:Ljava/lang/Object;

    if-eqz v5, :cond_9

    new-instance v8, Lsf/e;

    invoke-direct {v8, v5, p3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    move-object p3, v1

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcf/a;

    invoke-interface {v5, v8}, Lcf/a;->j(Lsf/e;)V

    goto :goto_2

    :cond_5
    const/4 p3, 0x0

    iput-object p3, v3, Luf/n;->w:Luf/u;

    iput-object p3, v3, Luf/n;->x:Lyf/e;

    iput v7, v3, Luf/n;->E:I

    invoke-interface {p2, p1, v3}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v4, :cond_6

    goto :goto_5

    :cond_6
    :goto_3
    move-object v4, p3

    check-cast v4, Lrf/l;

    const-string p1, "call"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v4, Lrf/l;->w:Lvf/a;

    iget-object p2, v4, Lrf/l;->x:Lwf/a;

    iget-object p3, v0, La30/w0;->E:Ljava/lang/Object;

    if-eqz p3, :cond_8

    new-instance v0, Lsf/f;

    invoke-direct {v0, p3, p1, p2, v2}, Lsf/f;-><init>(Ljava/lang/Object;Lvf/a;Lwf/a;Ldg/a;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcf/a;

    invoke-interface {p2, v0}, Lcf/a;->m(Lsf/f;)V

    goto :goto_4

    :cond_7
    :goto_5
    return-object v4

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lag/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    instance-of v1, p3, Luf/g;

    if-eqz v1, :cond_a

    move-object v1, p3

    check-cast v1, Luf/g;

    iget v2, v1, Luf/g;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_a

    sub-int/2addr v2, v3

    iput v2, v1, Luf/g;->E:I

    goto :goto_6

    :cond_a
    new-instance v1, Luf/g;

    check-cast p3, Ls83/c;

    invoke-direct {v1, p0, p3}, Luf/g;-><init>(Lag/e;Ls83/c;)V

    :goto_6
    iget-object p3, v1, Luf/g;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Luf/g;->E:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_d

    if-eq v3, v5, :cond_c

    if-ne v3, v4, :cond_b

    iget-object p1, v1, Luf/g;->w:Luf/u;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    iget-object p2, v1, Luf/g;->x:Lyf/e;

    iget-object p1, v1, Luf/g;->w:Luf/u;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_e

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrf/l;

    iput-object p1, v1, Luf/g;->w:Luf/u;

    iput-object p2, v1, Luf/g;->x:Lyf/e;

    iput v5, v1, Luf/g;->E:I

    invoke-static {p3, v1}, Lx43/j;->q(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_e

    goto :goto_9

    :cond_e
    :goto_7
    iput-object p1, v1, Luf/g;->w:Luf/u;

    const/4 p3, 0x0

    iput-object p3, v1, Luf/g;->x:Lyf/e;

    iput v4, v1, Luf/g;->E:I

    invoke-interface {p2, p1, v1}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    move-object v2, p3

    check-cast v2, Lrf/l;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Luf/u;->a:Ldg/a;

    sget-object p2, Luf/i;->d:Lgf/a;

    invoke-virtual {p1, p2, v0}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    :goto_9
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lag/b;Lag/f;)V
    .locals 2

    iget-object v0, p0, Lag/e;->b:Ljava/lang/Object;

    check-cast v0, Lm83/m;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    invoke-virtual {v0, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {v0, p1}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    return-void
.end method
