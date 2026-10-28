.class public final Ld9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# virtual methods
.method public a()Ld9/g;
    .locals 2

    iget-boolean v0, p0, Ld9/f;->a:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ld9/f;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ld9/f;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Secondary offload attribute fields are true but primary isFormatSupported is false"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Ld9/g;

    invoke-direct {v0, p0}, Ld9/g;-><init>(Ld9/f;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld9/f;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ld9/f;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Ld9/f;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
