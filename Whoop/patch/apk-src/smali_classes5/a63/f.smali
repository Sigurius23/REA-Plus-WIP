.class public final La63/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, La63/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Ls83/i;-><init>(ILq83/d;)V

    iput-object p1, v0, La63/f;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf63/c;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La63/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La63/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La63/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La63/f;->x:I

    const/16 v2, 0x12c

    const/4 v3, 0x2

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, La63/f;->w:I

    iget-object v1, p0, La63/f;->y:Ljava/lang/Object;

    check-cast v1, Lf63/c;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/ktor/utils/io/charsets/MalformedInputException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, La63/f;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La63/f;->y:Ljava/lang/Object;

    check-cast p1, Lf63/c;

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object v1

    invoke-virtual {v1}, Lw53/b;->c()Le63/b;

    move-result-object v1

    invoke-interface {v1}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v1

    sget-object v6, La63/p;->a:Lo63/a;

    invoke-virtual {v1, v6}, Lo63/f;->b(Lo63/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {p1}, Lf63/c;->e()Li63/v;

    move-result-object v1

    iget v1, v1, Li63/v;->a:I

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    if-lt v1, v2, :cond_c

    invoke-virtual {p1}, Lw53/b;->c()Le63/b;

    move-result-object v6

    invoke-interface {v6}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v6

    sget-object v7, La63/g;->a:Lo63/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "key"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lo63/f;->c()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_6

    :cond_4
    iput v1, p0, La63/f;->w:I

    iput v5, p0, La63/f;->x:I

    invoke-static {p1, p0}, Lv63/h;->f(Lw53/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    check-cast p1, Lw53/b;

    invoke-virtual {p1}, Lw53/b;->c()Le63/b;

    move-result-object v5

    invoke-interface {v5}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v5

    sget-object v6, La63/g;->a:Lo63/a;

    invoke-virtual {v5, v6, v4}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lw53/b;->d()Lf63/c;

    move-result-object p1

    :try_start_1
    iput-object p1, p0, La63/f;->y:Ljava/lang/Object;

    iput v1, p0, La63/f;->w:I

    iput v3, p0, La63/f;->x:I

    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {p1, v3, p0}, Lj93/l0;->k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Lio/ktor/utils/io/charsets/MalformedInputException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v3, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    move v0, v1

    move-object v1, p1

    move-object p1, v3

    :goto_2
    :try_start_2
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catch Lio/ktor/utils/io/charsets/MalformedInputException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_0
    move v0, v1

    move-object v1, p1

    :catch_1
    const-string p1, "<body failed decoding>"

    :goto_3
    const/16 v3, 0x190

    if-gt v2, v0, :cond_8

    if-lt v0, v3, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Lio/ktor/client/plugins/RedirectResponseException;

    invoke-direct {v0, v1, p1}, Lio/ktor/client/plugins/RedirectResponseException;-><init>(Lf63/c;Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    const/16 v2, 0x1f4

    if-gt v3, v0, :cond_a

    if-lt v0, v2, :cond_9

    goto :goto_5

    :cond_9
    new-instance v0, Lio/ktor/client/plugins/ClientRequestException;

    invoke-direct {v0, v1, p1}, Lio/ktor/client/plugins/ClientRequestException;-><init>(Lf63/c;Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    if-gt v2, v0, :cond_b

    const/16 v2, 0x258

    if-ge v0, v2, :cond_b

    new-instance v0, Lio/ktor/client/plugins/ServerResponseException;

    invoke-direct {v0, v1, p1}, Lio/ktor/client/plugins/ServerResponseException;-><init>(Lf63/c;Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Lio/ktor/client/plugins/ResponseException;

    invoke-direct {v0, v1, p1}, Lio/ktor/client/plugins/ResponseException;-><init>(Lf63/c;Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    return-object v4
.end method
