.class public final La63/s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:La63/u;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lr63/e;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La63/u;Lq83/d;I)V
    .locals 0

    iput p3, p0, La63/s;->w:I

    iput-object p1, p0, La63/s;->E:La63/u;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La63/s;->w:I

    check-cast p1, Lr63/e;

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/s;

    iget-object v1, p0, La63/s;->E:La63/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p3, v2}, La63/s;-><init>(La63/u;Lq83/d;I)V

    iput-object p1, v0, La63/s;->y:Lr63/e;

    iput-object p2, v0, La63/s;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p3, Lq83/d;

    new-instance v0, La63/s;

    iget-object v1, p0, La63/s;->E:La63/u;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p3, v2}, La63/s;-><init>(La63/u;Lq83/d;I)V

    iput-object p1, v0, La63/s;->y:Lr63/e;

    iput-object p2, v0, La63/s;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, La63/s;->w:I

    iget-object v1, p0, La63/s;->E:La63/u;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, La63/s;->x:I

    const/4 v7, 0x2

    if-eqz v6, :cond_2

    if-eq v6, v4, :cond_1

    if-ne v6, v7, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, La63/s;->z:Ljava/lang/Object;

    check-cast v2, Ls63/a;

    iget-object v4, p0, La63/s;->y:Lr63/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/s;->y:Lr63/e;

    iget-object v2, p0, La63/s;->z:Ljava/lang/Object;

    check-cast v2, Lf63/d;

    iget-object v6, v2, Lf63/d;->a:Ls63/a;

    iget-object v2, v2, Lf63/d;->b:Ljava/lang/Object;

    iget-object v8, v6, Ls63/a;->a:Lj93/d;

    const-class v9, Ljava/lang/String;

    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    instance-of v8, v2, Lio/ktor/utils/io/q;

    if-nez v8, :cond_3

    goto :goto_4

    :cond_3
    check-cast v2, Lio/ktor/utils/io/q;

    iput-object p1, p0, La63/s;->y:Lr63/e;

    iput-object v6, p0, La63/s;->z:Ljava/lang/Object;

    iput v4, p0, La63/s;->x:I

    check-cast v2, Lio/ktor/utils/io/m;

    invoke-virtual {v2, p0}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, p1

    move-object p1, v2

    move-object v2, v6

    :goto_0
    check-cast p1, Lv63/e;

    iget-object v6, v4, Lr63/e;->w:Ljava/lang/Object;

    check-cast v6, Lw53/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "call"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "body"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lw53/b;->d()Lf63/c;

    move-result-object v6

    invoke-interface {v6}, Li63/s;->getHeaders()Li63/m;

    move-result-object v6

    sget-object v8, Li63/r;->a:Ljava/util/List;

    const-string v8, "Content-Type"

    invoke-interface {v6, v8}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    sget-object v8, Li63/d;->f:Li63/d;

    invoke-static {v6}, Ljc/x;->h0(Ljava/lang/String;)Li63/d;

    move-result-object v6

    goto :goto_1

    :cond_5
    move-object v6, v3

    :goto_1
    if-eqz v6, :cond_6

    invoke-static {v6}, Lpf/c;->m(Li63/d;)Ljava/nio/charset/Charset;

    move-result-object v6

    goto :goto_2

    :cond_6
    move-object v6, v3

    :goto_2
    if-nez v6, :cond_7

    iget-object v6, v1, La63/u;->a:Ljava/nio/charset/Charset;

    :cond_7
    invoke-static {p1, v6}, Lv63/h;->e(Lv63/e;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lf63/d;

    invoke-direct {v1, v2, p1}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iput-object v3, p0, La63/s;->y:Lr63/e;

    iput-object v3, p0, La63/s;->z:Ljava/lang/Object;

    iput v7, p0, La63/s;->x:I

    invoke-virtual {v4, v1, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    move-object v5, v0

    :cond_8
    :goto_4
    return-object v5

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, La63/s;->x:I

    if-eqz v6, :cond_a

    if-ne v6, v4, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/s;->y:Lr63/e;

    iget-object v2, p0, La63/s;->z:Ljava/lang/Object;

    iget-object v6, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v6, Le63/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "context"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v6, Le63/d;->c:Li63/n;

    sget-object v7, Li63/r;->a:Ljava/util/List;

    const-string v7, "Accept-Charset"

    invoke-virtual {v6, v7}, Lal/a;->w0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_b

    goto :goto_5

    :cond_b
    iget-object v8, v1, La63/u;->c:Ljava/lang/String;

    const-string v9, "value"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Li63/n;->F0(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lal/a;->v0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->clear()V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    instance-of v6, v2, Ljava/lang/String;

    if-nez v6, :cond_c

    goto :goto_7

    :cond_c
    iget-object v6, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v6, Le63/d;

    invoke-static {v6}, Lts/o;->i(Le63/d;)Li63/d;

    move-result-object v6

    if-eqz v6, :cond_d

    iget-object v7, v6, Li63/d;->d:Ljava/lang/String;

    invoke-static {}, Li63/c;->a()Li63/d;

    move-result-object v8

    iget-object v8, v8, Li63/d;->d:Ljava/lang/String;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_7

    :cond_d
    check-cast v2, Ljava/lang/String;

    if-nez v6, :cond_e

    invoke-static {}, Li63/c;->a()Li63/d;

    move-result-object v7

    goto :goto_6

    :cond_e
    move-object v7, v6

    :goto_6
    if-eqz v6, :cond_f

    invoke-static {v6}, Lpf/c;->m(Li63/d;)Ljava/nio/charset/Charset;

    move-result-object v6

    if-nez v6, :cond_10

    :cond_f
    iget-object v6, v1, La63/u;->b:Ljava/nio/charset/Charset;

    :cond_10
    new-instance v1, Lj63/e;

    const-string v8, "<this>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "charset"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lu63/a;->c(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Li63/d;->g(Ljava/lang/String;)Li63/d;

    move-result-object v6

    invoke-direct {v1, v2, v6}, Lj63/e;-><init>(Ljava/lang/String;Li63/d;)V

    iput-object v3, p0, La63/s;->y:Lr63/e;

    iput v4, p0, La63/s;->x:I

    invoke-virtual {p1, v1, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    move-object v5, v0

    :cond_11
    :goto_7
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
