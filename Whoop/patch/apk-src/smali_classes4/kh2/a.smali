.class public abstract Lkh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a&\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a0\u0010\u0008\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u001a6\u0010\n\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "La6/g;",
        "Lf6/f;",
        "Lf6/d;",
        "key",
        "",
        "a",
        "(La6/g;Lf6/d;Lq83/d;)Ljava/lang/Object;",
        "T",
        "b",
        "value",
        "c",
        "(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;",
        "essentials_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(La6/g;Lf6/d;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lf6/d;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lkh2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkh2/a$a;

    iget v1, v0, Lkh2/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkh2/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkh2/a$a;

    invoke-direct {v0, p2}, Lkh2/a$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkh2/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkh2/a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lkh2/a$a;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lf6/d;

    iget-object p0, v0, Lkh2/a$a;->w:Ljava/lang/Object;

    check-cast p0, La6/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p0}, La6/g;->getData()Lec3/l;

    move-result-object p0

    const/4 p2, 0x0

    iput-object p2, v0, Lkh2/a$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lkh2/a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lkh2/a$a;->z:I

    invoke-static {p0, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lf6/f;

    check-cast p2, Lf6/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "key"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p2, Lf6/a;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final b(La6/g;Lf6/d;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La6/g;",
            "Lf6/d;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lkh2/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkh2/a$b;

    iget v1, v0, Lkh2/a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkh2/a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkh2/a$b;

    invoke-direct {v0, p2}, Lkh2/a$b;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkh2/a$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkh2/a$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lkh2/a$b;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lf6/d;

    iget-object p0, v0, Lkh2/a$b;->w:Ljava/lang/Object;

    check-cast p0, La6/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p0}, La6/g;->getData()Lec3/l;

    move-result-object p0

    const/4 p2, 0x0

    iput-object p2, v0, Lkh2/a$b;->w:Ljava/lang/Object;

    iput-object p1, v0, Lkh2/a$b;->x:Ljava/lang/Object;

    iput v3, v0, Lkh2/a$b;->z:I

    invoke-static {p0, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lf6/f;

    invoke-virtual {p2, p1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La6/g;",
            "Lf6/d;",
            "TT;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lkh2/a$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lkh2/a$c;

    iget v1, v0, Lkh2/a$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkh2/a$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkh2/a$c;

    invoke-direct {v0, p3}, Lkh2/a$c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lkh2/a$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkh2/a$c;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lkh2/a$c;->y:Ljava/lang/Object;

    iget-object p1, v0, Lkh2/a$c;->x:Ljava/lang/Object;

    check-cast p1, Lf6/d;

    iget-object p1, v0, Lkh2/a$c;->w:Ljava/lang/Object;

    check-cast p1, La6/g;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lkh2/a$d;

    const/4 v2, 0x0

    invoke-direct {p3, p1, p2, v2}, Lkh2/a$d;-><init>(Lf6/d;Ljava/lang/Object;Lq83/d;)V

    iput-object v2, v0, Lkh2/a$c;->w:Ljava/lang/Object;

    iput-object v2, v0, Lkh2/a$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkh2/a$c;->y:Ljava/lang/Object;

    iput v3, v0, Lkh2/a$c;->E:I

    invoke-static {p0, p3, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p2
.end method
