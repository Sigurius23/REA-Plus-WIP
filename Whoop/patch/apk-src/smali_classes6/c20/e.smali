.class public abstract Lc20/e;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lj/c;Lj/b;)V
    .locals 0

    return-void
.end method

.method public final c(Ls40/a;Ljava/lang/Object;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lc20/d;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lc20/d;

    iget v1, v0, Lc20/d;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc20/d;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lc20/d;

    invoke-direct {v0, p0, p4}, Lc20/d;-><init>(Lc20/e;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lc20/d;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lc20/d;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Lc20/d;->z:Lyy/f;

    iget-object p2, v0, Lc20/d;->y:Ljava/lang/Object;

    iget-object p1, v0, Lc20/d;->x:Ls40/a;

    iget-object v2, v0, Lc20/d;->w:Lc20/e;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p1, Ls40/a;->c:Lg/l;

    iput-object p0, v0, Lc20/d;->w:Lc20/e;

    iput-object p1, v0, Lc20/d;->x:Ls40/a;

    iput-object p2, v0, Lc20/d;->y:Ljava/lang/Object;

    iput-object p3, v0, Lc20/d;->z:Lyy/f;

    iput v4, v0, Lc20/d;->G:I

    invoke-static {p4, v0}, Lcom/squareup/wire/n;->h(Lg/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    const/4 p4, 0x0

    iput-object p4, v0, Lc20/d;->w:Lc20/e;

    iput-object p4, v0, Lc20/d;->x:Ls40/a;

    iput-object p4, v0, Lc20/d;->y:Ljava/lang/Object;

    iput-object p4, v0, Lc20/d;->z:Lyy/f;

    iput v3, v0, Lc20/d;->G:I

    invoke-virtual {v2, p1, p2, p3, v0}, Lc20/e;->d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public abstract d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
.end method
