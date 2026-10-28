.class public abstract Llh3/k;
.super Lxg3/g;
.source "SourceFile"

# interfaces
.implements Lxg3/h;


# virtual methods
.method public final X()Llh3/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llh3/j;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Llh3/j;

    if-ne v0, v1, :cond_0

    move-object v0, p0

    check-cast v0, Llh3/j;

    return-object v0

    :cond_0
    new-instance v0, Llh3/j;

    invoke-direct {v0, p0}, Llh3/j;-><init>(Llh3/k;)V

    return-object v0
.end method
