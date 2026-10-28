.class public final La6/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public E:Ljava/util/Iterator;

.field public F:I

.field public G:I

.field public final synthetic H:La6/i0;

.field public final synthetic I:Lzt/q;

.field public w:Ljava/lang/Object;

.field public x:Ljava/io/Serializable;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La6/i0;Lzt/q;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La6/n;->H:La6/i0;

    iput-object p2, p0, La6/n;->I:Lzt/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, La6/n;

    iget-object v1, p0, La6/n;->H:La6/i0;

    iget-object v2, p0, La6/n;->I:Lzt/q;

    invoke-direct {v0, v1, v2, p1}, La6/n;-><init>(La6/i0;Lzt/q;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, La6/n;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/n;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/n;->G:I

    iget-object v2, p0, La6/n;->I:Lzt/q;

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    iget-object v6, p0, La6/n;->H:La6/i0;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v7, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, La6/n;->F:I

    iget-object v1, p0, La6/n;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, La6/n;->y:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object v2, p0, La6/n;->x:Ljava/io/Serializable;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, p0, La6/n;->w:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/b0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v1, p0, La6/n;->E:Ljava/util/Iterator;

    iget-object v9, p0, La6/n;->z:Ljava/lang/Object;

    check-cast v9, La6/m;

    iget-object v10, p0, La6/n;->y:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/g0;

    iget-object v11, p0, La6/n;->x:Ljava/io/Serializable;

    check-cast v11, Lkotlin/jvm/internal/b0;

    iget-object v12, p0, La6/n;->w:Ljava/lang/Object;

    check-cast v12, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, La6/n;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v9, p0, La6/n;->y:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/g0;

    iget-object v10, p0, La6/n;->x:Ljava/io/Serializable;

    check-cast v10, Lkotlin/jvm/internal/b0;

    iget-object v11, p0, La6/n;->w:Ljava/lang/Object;

    check-cast v11, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v11

    new-instance v10, Lkotlin/jvm/internal/b0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v11, p0, La6/n;->w:Ljava/lang/Object;

    iput-object v10, p0, La6/n;->x:Ljava/io/Serializable;

    iput-object v1, p0, La6/n;->y:Ljava/lang/Object;

    iput-object v1, p0, La6/n;->z:Ljava/lang/Object;

    iput v7, p0, La6/n;->G:I

    invoke-static {v6, v7, p0}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_5

    :cond_5
    move-object v9, v1

    :goto_0
    check-cast p1, La6/b;

    iget-object p1, p1, La6/b;->b:Ljava/lang/Object;

    iput-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p1, La6/m;

    invoke-direct {p1, v11, v10, v9, v6}, La6/m;-><init>(Lmc3/a;Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;La6/i0;)V

    iget-object v1, v2, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, p1

    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/m;

    iput-object v12, p0, La6/n;->w:Ljava/lang/Object;

    iput-object v11, p0, La6/n;->x:Ljava/io/Serializable;

    iput-object v10, p0, La6/n;->y:Ljava/lang/Object;

    iput-object v9, p0, La6/n;->z:Ljava/lang/Object;

    iput-object v1, p0, La6/n;->E:Ljava/util/Iterator;

    iput v5, p0, La6/n;->G:I

    invoke-interface {p1, v9, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_5

    :cond_7
    move-object v9, v10

    move-object v10, v11

    move-object v1, v12

    goto :goto_2

    :cond_8
    move-object v1, v11

    :goto_2
    iput-object v8, v2, Lzt/q;->z:Ljava/lang/Object;

    iput-object v10, p0, La6/n;->w:Ljava/lang/Object;

    iput-object v9, p0, La6/n;->x:Ljava/io/Serializable;

    iput-object v1, p0, La6/n;->y:Ljava/lang/Object;

    iput-object v8, p0, La6/n;->z:Ljava/lang/Object;

    iput-object v8, p0, La6/n;->E:Ljava/util/Iterator;

    iput v4, p0, La6/n;->G:I

    invoke-interface {v1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_5

    :cond_9
    move-object v2, v9

    move-object v4, v10

    :goto_3
    :try_start_0
    iput-boolean v7, v4, Lkotlin/jvm/internal/b0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_4

    :cond_a
    const/4 p1, 0x0

    :goto_4
    invoke-virtual {v6}, La6/i0;->h()La6/d1;

    move-result-object v2

    iput-object v1, p0, La6/n;->w:Ljava/lang/Object;

    iput-object v8, p0, La6/n;->x:Ljava/io/Serializable;

    iput-object v8, p0, La6/n;->y:Ljava/lang/Object;

    iput p1, p0, La6/n;->F:I

    iput v3, p0, La6/n;->G:I

    invoke-virtual {v2}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object v2

    if-ne v2, v0, :cond_b

    :goto_5
    return-object v0

    :cond_b
    move v0, p1

    move-object p1, v2

    :goto_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v2, La6/b;

    invoke-direct {v2, v1, v0, p1}, La6/b;-><init>(Ljava/lang/Object;II)V

    return-object v2

    :catchall_0
    move-exception p1

    invoke-interface {v1, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
