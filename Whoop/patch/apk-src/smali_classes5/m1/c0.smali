.class public final Lm1/c0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;
.implements La3/j2;


# instance fields
.field public O:Ljs2/h;

.field public P:Z


# virtual methods
.method public final H0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lm1/d0;->a:Lm1/d0;

    return-object v0
.end method

.method public final n(Li3/z;)V
    .locals 1

    iget-boolean v0, p0, Lm1/c0;->P:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm1/c0;->O:Ljs2/h;

    invoke-virtual {v0, p1}, Ljs2/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
