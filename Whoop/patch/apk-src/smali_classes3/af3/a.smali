.class public abstract Laf3/a;
.super Laf3/t;
.source "SourceFile"


# virtual methods
.method public final d()Laf3/t;
    .locals 1

    iget-object v0, p0, Laf3/t;->a:Laf3/t;

    check-cast v0, Laf3/a;

    return-object v0
.end method

.method public final g(Laf3/t;)V
    .locals 1

    instance-of v0, p1, Laf3/a;

    if-eqz v0, :cond_0

    iput-object p1, p0, Laf3/t;->a:Laf3/t;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parent of block must also be block (can not be inline)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
