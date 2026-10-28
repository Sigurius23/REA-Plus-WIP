.class public final Lt0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p4

    new-instance v0, Lh2/e;

    invoke-direct {v0, p1, p2}, Lh2/e;-><init>(J)V

    sget-object p1, Loj/t;->w:Loj/t;

    invoke-virtual {p1, p4, v0, p3}, Loj/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4}, Li2/j;->f()V

    new-instance p1, Li2/m0;

    invoke-direct {p1, p4}, Li2/m0;-><init>(Li2/s0;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt0/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lt0/f;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    sget-object v0, Loj/t;->w:Loj/t;

    if-eqz p1, :cond_2

    move-object v1, v0

    :cond_2
    if-ne v1, v0, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    sget-object v0, Loj/t;->w:Loj/t;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
