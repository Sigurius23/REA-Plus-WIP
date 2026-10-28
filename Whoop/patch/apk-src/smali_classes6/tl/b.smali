.class public final Ltl/b;
.super La0/g;
.source "SourceFile"


# instance fields
.field public G:I


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltl/b;->G:I

    invoke-super {p0}, La0/f1;->clear()V

    return-void
.end method

.method public final h(La0/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltl/b;->G:I

    invoke-super {p0, p1}, La0/f1;->h(La0/g;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ltl/b;->G:I

    if-nez v0, :cond_0

    invoke-super {p0}, La0/f1;->hashCode()I

    move-result v0

    iput v0, p0, Ltl/b;->G:I

    :cond_0
    iget v0, p0, Ltl/b;->G:I

    return v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltl/b;->G:I

    invoke-super {p0, p1}, La0/f1;->i(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltl/b;->G:I

    invoke-super {p0, p1, p2}, La0/f1;->j(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltl/b;->G:I

    invoke-super {p0, p1, p2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
