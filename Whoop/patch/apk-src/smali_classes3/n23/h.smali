.class public abstract Ln23/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a()Ln23/e;
    .locals 1

    instance-of v0, p0, Ln23/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    instance-of v0, p0, Ln23/f;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ln23/g;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    return-object v0

    :cond_0
    instance-of v0, p0, Ln23/f;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Ln23/g;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    return-object v0

    :cond_0
    instance-of v0, p0, Ln23/f;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The Success::value cannot be accessed as the Result is a Failure."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final d()Ln23/h;
    .locals 2

    instance-of v0, p0, Ln23/g;

    if-eqz v0, :cond_0

    new-instance v0, Ln23/g;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Ln23/f;

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
