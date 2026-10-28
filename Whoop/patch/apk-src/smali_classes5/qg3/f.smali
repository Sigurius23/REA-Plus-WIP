.class public final Lqg3/f;
.super Lpg3/f;
.source "SourceFile"


# virtual methods
.method public final get(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/g;
    .locals 8

    invoke-static {p1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lxg3/p;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, p3, :cond_0

    move v6, v0

    goto :goto_0

    :cond_0
    move v6, v1

    :goto_0
    const-class p3, Lxg3/d;

    if-ne p2, p3, :cond_1

    move p3, v0

    goto :goto_1

    :cond_1
    move p3, v1

    :goto_1
    const-class v2, Lxg3/g;

    if-eq p2, v2, :cond_2

    if-nez v6, :cond_2

    if-nez p3, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    if-eqz p3, :cond_3

    new-instance v0, Lqg3/e;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-class v1, Ljava/lang/Void;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct/range {v0 .. v5}, Lqg3/e;-><init>(Ljava/lang/reflect/Type;ZZZZ)V

    return-object v0

    :cond_3
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    if-nez p2, :cond_5

    if-eqz v6, :cond_4

    const-string p1, "Single"

    goto :goto_2

    :cond_4
    const-string p1, "Observable"

    :goto_2
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " return type must be parameterized as "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "<Foo> or "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "<? extends Foo>"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v1, p1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {p1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lpg3/v0;

    if-ne p2, p3, :cond_7

    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p2, :cond_6

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v1, p1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    move-object v3, p1

    move v4, v1

    move v5, v4

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Response must be parameterized as Response<Foo> or Response<? extends Foo>"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const-class p3, Lqg3/d;

    if-ne p2, p3, :cond_9

    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v1, p1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    move-object v3, p1

    move v4, v0

    move v5, v1

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Result must be parameterized as Result<Foo> or Result<? extends Foo>"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    move-object v3, p1

    move v5, v0

    move v4, v1

    :goto_3
    new-instance v2, Lqg3/e;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lqg3/e;-><init>(Ljava/lang/reflect/Type;ZZZZ)V

    return-object v2
.end method
