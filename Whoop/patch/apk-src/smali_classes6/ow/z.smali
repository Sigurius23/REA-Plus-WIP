.class public abstract Low/z;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a()Low/y;
    .locals 1

    instance-of v0, p0, Low/y;

    if-nez v0, :cond_0

    new-instance v0, Low/y;

    invoke-direct {v0, p0}, Low/y;-><init>(Low/z;)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Low/y;

    return-object v0
.end method

.method public abstract b(Lww/a;)Ljava/lang/Object;
.end method

.method public abstract c(Lww/b;Ljava/lang/Object;)V
.end method
