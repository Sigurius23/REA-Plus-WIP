.class public final Lye3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye3/g;


# virtual methods
.method public final a(Lxe3/k;)Lpg3/p;
    .locals 7

    iget-object p1, p1, Lxe3/k;->e:Lab/l0;

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {p1, v1}, Lab/l0;->g(C)I

    move-result v2

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v3

    :cond_0
    invoke-virtual {p1, v1}, Lab/l0;->b(C)I

    move-result v4

    if-lez v4, :cond_4

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v4

    invoke-virtual {p1, v1}, Lab/l0;->g(C)I

    move-result v5

    if-ne v5, v2, :cond_0

    new-instance v0, Laf3/d;

    invoke-direct {v0}, Laf3/t;-><init>()V

    invoke-virtual {p1, v3, v4}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v1

    invoke-virtual {v1}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/16 v3, 0x20

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-lt v2, v4, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v3, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v3, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    :goto_0
    if-ge v2, v4, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_1
    if-eq v2, v4, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v5

    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, v0, Laf3/d;->g:Ljava/lang/String;

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object p1

    new-instance v1, Lpg3/p;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {v1, v0, p1, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object v1

    :cond_4
    invoke-virtual {p1, v0, v3}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object p1

    new-instance v0, Laf3/a0;

    invoke-virtual {p1}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Laf3/a0;-><init>(Ljava/lang/String;)V

    new-instance p1, Lpg3/p;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {p1, v0, v3, v2, v1}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object p1
.end method
