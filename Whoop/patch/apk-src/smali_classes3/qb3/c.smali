.class public final Lqb3/c;
.super Llb3/s0;
.source "SourceFile"


# virtual methods
.method public final g(Llb3/q0;)Llb3/u0;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lza3/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lza3/b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1}, Lza3/b;->b()Llb3/u0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/u0;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Llb3/v0;

    sget-object v1, Llb3/g1;->E:Llb3/g1;

    invoke-interface {p1}, Lza3/b;->b()Llb3/u0;

    move-result-object p1

    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object p1

    invoke-direct {v0, p1, v1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v0

    :cond_2
    invoke-interface {p1}, Lza3/b;->b()Llb3/u0;

    move-result-object p1

    return-object p1
.end method
