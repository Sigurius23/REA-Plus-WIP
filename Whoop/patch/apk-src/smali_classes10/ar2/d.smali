.class public abstract Lar2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Lkd1/o;",
        "imageSource",
        "Landroid/graphics/Bitmap;",
        "a",
        "(Landroid/content/Context;Lkd1/o;Lq83/d;)Ljava/lang/Object;",
        "user-journey_release"
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
.method public static final a(Landroid/content/Context;Lkd1/o;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkd1/o;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lar2/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lar2/d$a;

    iget v1, v0, Lar2/d$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lar2/d$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lar2/d$a;

    invoke-direct {v0, p2}, Lar2/d$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lar2/d$a;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lar2/d$a;->H:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lar2/d$a;->E:Ljava/lang/Object;

    check-cast p0, Lmh/j;

    iget-object p0, v0, Lar2/d$a;->z:Ljava/lang/Object;

    check-cast p0, Lbh/e;

    iget-object p0, v0, Lar2/d$a;->y:Ljava/lang/Object;

    check-cast p0, Lkd1/o$c;

    iget-object p0, v0, Lar2/d$a;->x:Ljava/lang/Object;

    check-cast p0, Lkd1/o;

    iget-object p0, v0, Lar2/d$a;->w:Ljava/lang/Object;

    check-cast p0, Landroid/content/Context;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lkd1/o$c;

    if-eqz p2, :cond_3

    check-cast p1, Lkd1/o$c;

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_5

    invoke-static {p0}, Lkotlin/jvm/internal/j;->x(Landroid/content/Context;)Lbh/j;

    move-result-object p2

    new-instance v2, Lmh/h;

    invoke-direct {v2, p0}, Lmh/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lkd1/o$c;->a()Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v2, Lmh/h;->c:Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p0, v2, Lmh/h;->n:Ljava/lang/Boolean;

    invoke-virtual {v2}, Lmh/h;->a()Lmh/j;

    move-result-object p0

    iput-object v4, v0, Lar2/d$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Lar2/d$a;->x:Ljava/lang/Object;

    iput-object v4, v0, Lar2/d$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lar2/d$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lar2/d$a;->E:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lar2/d$a;->F:I

    iput v3, v0, Lar2/d$a;->H:I

    invoke-virtual {p2, p0, v0}, Lbh/j;->b(Lmh/j;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p2, Lmh/k;

    invoke-virtual {p2}, Lmh/k;->a()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, Ls4/d;->j(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v4
.end method
