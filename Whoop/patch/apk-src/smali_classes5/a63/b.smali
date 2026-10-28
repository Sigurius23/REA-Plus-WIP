.class public final La63/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lr63/e;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    iput p2, p0, La63/b;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La63/b;->w:I

    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    packed-switch v0, :pswitch_data_0

    new-instance v0, La63/b;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p3}, La63/b;-><init>(IILq83/d;)V

    iput-object p1, v0, La63/b;->y:Lr63/e;

    iput-object p2, v0, La63/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, La63/b;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p3}, La63/b;-><init>(IILq83/d;)V

    iput-object p1, v0, La63/b;->y:Lr63/e;

    iput-object p2, v0, La63/b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, La63/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, La63/b;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/b;->y:Lr63/e;

    iget-object v2, p0, La63/b;->z:Ljava/lang/Object;

    iget-object v5, p1, Lr63/e;->w:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Le63/d;

    iget-object v6, v6, Le63/d;->c:Li63/n;

    sget-object v7, Li63/r;->a:Ljava/util/List;

    const-string v7, "Accept"

    invoke-virtual {v6, v7}, Lal/a;->w0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move-object v6, v5

    check-cast v6, Le63/d;

    iget-object v6, v6, Le63/d;->c:Li63/n;

    const-string v8, "*/*"

    invoke-virtual {v6, v7, v8}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move-object v6, v5

    check-cast v6, Le63/d;

    invoke-static {v6}, Lts/o;->i(Le63/d;)Li63/d;

    move-result-object v6

    instance-of v7, v2, Ljava/lang/String;

    if-eqz v7, :cond_4

    new-instance v7, Lj63/e;

    check-cast v2, Ljava/lang/String;

    if-nez v6, :cond_3

    invoke-static {}, Li63/c;->a()Li63/d;

    move-result-object v6

    :cond_3
    invoke-direct {v7, v2, v6}, Lj63/e;-><init>(Ljava/lang/String;Li63/d;)V

    goto :goto_0

    :cond_4
    instance-of v7, v2, [B

    if-eqz v7, :cond_5

    new-instance v7, La63/h;

    invoke-direct {v7, v6, v2}, La63/h;-><init>(Li63/d;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    instance-of v7, v2, Lio/ktor/utils/io/q;

    if-eqz v7, :cond_6

    new-instance v7, La63/i;

    invoke-direct {v7, p1, v6, v2}, La63/i;-><init>(Lr63/e;Li63/d;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    instance-of v7, v2, Lj63/d;

    if-eqz v7, :cond_7

    move-object v7, v2

    check-cast v7, Lj63/d;

    goto :goto_0

    :cond_7
    move-object v7, v5

    check-cast v7, Le63/d;

    const-string v8, "context"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "body"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v8, v2, Ljava/io/InputStream;

    if-eqz v8, :cond_8

    new-instance v8, La63/i;

    invoke-direct {v8, v7, v6, v2}, La63/i;-><init>(Le63/d;Li63/d;Ljava/lang/Object;)V

    move-object v7, v8

    goto :goto_0

    :cond_8
    move-object v7, v3

    :goto_0
    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lj63/d;->b()Li63/d;

    move-result-object v2

    goto :goto_1

    :cond_9
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_a

    check-cast v5, Le63/d;

    iget-object v2, v5, Le63/d;->c:Li63/n;

    iget-object v2, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-string v5, "Content-Type"

    invoke-interface {v2, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v3, p0, La63/b;->y:Lr63/e;

    iput v4, p0, La63/b;->x:I

    invoke-virtual {p1, v7, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    move-object v1, v0

    :cond_a
    :goto_2
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, La63/b;->x:I

    if-eqz v5, :cond_c

    if-ne v5, v4, :cond_b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/b;->y:Lr63/e;

    iget-object v2, p0, La63/b;->z:Ljava/lang/Object;

    iget-object v5, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v5, Le63/d;

    iget-object v5, v5, Le63/d;->f:Lo63/f;

    sget-object v6, La63/e;->a:Lo63/a;

    invoke-virtual {v5, v6}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function3;

    if-nez v5, :cond_d

    goto :goto_3

    :cond_d
    new-instance v6, Lx53/a;

    const-string v7, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lj63/d;

    iget-object v7, p1, Lr63/e;->w:Ljava/lang/Object;

    check-cast v7, Le63/d;

    iget-object v7, v7, Le63/d;->e:Lbc3/e2;

    invoke-direct {v6, v2, v7, v5}, Lx53/a;-><init>(Lj63/d;Lbc3/e2;Lkotlin/jvm/functions/Function3;)V

    iput-object v3, p0, La63/b;->y:Lr63/e;

    iput v4, p0, La63/b;->x:I

    invoke-virtual {p1, v6, p0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    move-object v1, v0

    :cond_e
    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
