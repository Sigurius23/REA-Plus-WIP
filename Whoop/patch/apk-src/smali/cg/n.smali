.class public final Lcg/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcg/n;Ljava/lang/String;)Lcg/o;
    .locals 12

    sget-object v6, Lcg/t;->c:Lcg/p;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "#"

    const-string v8, "?"

    const-string v4, "/"

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoding"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v9, Lcg/j;

    invoke-direct {v9}, Lcg/j;-><init>()V

    new-instance v10, Lcom/iterable/iterableapi/b;

    invoke-direct {v10, p1}, Lcom/iterable/iterableapi/b;-><init>(Ljava/lang/String;)V

    const-string v0, "://"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcg/k;

    const/4 v2, 0x0

    invoke-direct {v1, v9, v2}, Lcg/k;-><init>(Lcg/j;I)V

    invoke-virtual {v10, v0, v1}, Lcom/iterable/iterableapi/b;->b([Ljava/lang/String;Lcg/k;)V

    filled-new-array {v4, v8, v7}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcg/k;

    const/4 v2, 0x1

    invoke-direct {v1, v9, v2}, Lcg/k;-><init>(Lcg/j;I)V

    invoke-virtual {v10, v0, v1}, Lcom/iterable/iterableapi/b;->c([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v11, Lcg/l;

    const/4 v0, 0x0

    invoke-direct {v11, v10, v9, v6, v0}, Lcg/l;-><init>(Lcom/iterable/iterableapi/b;Lcg/j;Lcg/t;I)V

    iget v0, v10, Lcom/iterable/iterableapi/b;->c:I

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x1

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lyb3/y;->I(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v11}, Lcg/l;->invoke()Ljava/lang/Object;

    :cond_0
    new-instance v11, Lcg/l;

    const/4 v0, 0x1

    invoke-direct {v11, v10, v9, v6, v0}, Lcg/l;-><init>(Lcom/iterable/iterableapi/b;Lcg/j;Lcg/t;I)V

    iget v0, v10, Lcom/iterable/iterableapi/b;->c:I

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x1

    move-object v3, p1

    move-object v4, v8

    invoke-static/range {v0 .. v5}, Lyb3/y;->I(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v11}, Lcg/l;->invoke()Ljava/lang/Object;

    :cond_1
    iget v0, v10, Lcom/iterable/iterableapi/b;->c:I

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x1

    move-object v3, p1

    move-object v4, v7

    invoke-static/range {v0 .. v5}, Lyb3/y;->I(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v10, Lcom/iterable/iterableapi/b;->c:I

    const/4 v1, 0x1

    add-int/2addr v1, v0

    iput v1, v10, Lcom/iterable/iterableapi/b;->c:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    new-instance v1, Lcg/m;

    const/4 v2, 0x1

    invoke-direct {v1, v9, v6, v2}, Lcg/m;-><init>(Lcg/j;Lcg/t;I)V

    invoke-virtual {v10, v0, v1}, Lcom/iterable/iterableapi/b;->c([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    invoke-virtual {v9}, Lcg/j;->b()Lcg/o;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot parse \""

    const-string v4, "\" as a URL"

    invoke-static {v2, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
