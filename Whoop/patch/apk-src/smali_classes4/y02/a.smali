.class public abstract Ly02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lf63/c;",
        "Lne3/l;",
        "a",
        "(Lf63/c;Lq83/d;)Ljava/lang/Object;",
        "network_release"
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
.method public static final a(Lf63/c;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf63/c;",
            "Lq83/d<",
            "-",
            "Lne3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ly02/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ly02/a$a;

    iget v1, v0, Ly02/a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly02/a$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly02/a$a;

    invoke-direct {v0, p1}, Ly02/a$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ly02/a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly02/a$a;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Ly02/a$a;->y:Ljava/lang/Object;

    check-cast p0, Lne3/k;

    iget-object v1, v0, Ly02/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lf63/c;

    iget-object v0, v0, Ly02/a$a;->w:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lne3/l;->z:Lne3/k;

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object p0

    const-class v2, [B

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v5

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v4, v5}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v2

    const/4 v4, 0x0

    iput-object v4, v0, Ly02/a$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Ly02/a$a;->x:Ljava/lang/Object;

    iput-object p1, v0, Ly02/a$a;->y:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v0, Ly02/a$a;->z:I

    iput v3, v0, Ly02/a$a;->F:I

    invoke-virtual {p0, v2, v0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    :goto_1
    if-eqz p1, :cond_4

    check-cast p1, [B

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p0, -0x499602d2

    invoke-static {p0, p1}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
