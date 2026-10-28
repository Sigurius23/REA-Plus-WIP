.class public final Lv10/k;
.super Lv10/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc93/a;Lb10/c1;Lqy/d;Lq83/j;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lb10/a;

    const/4 v0, 0x3

    invoke-direct {v3, p2, v0}, Lb10/a;-><init>(Lc93/a;I)V

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lv10/g;-><init>(Landroid/content/Context;Lk83/a;Lb10/c1;Lqy/d;Lq83/j;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lv10/h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv10/h;

    iget v1, v0, Lv10/h;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv10/h;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv10/h;

    invoke-direct {v0, p0, p3}, Lv10/h;-><init>(Lv10/k;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lv10/h;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv10/h;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lv10/h;->y:I

    iget-object p3, p0, Lv10/g;->b:Lb10/c1;

    check-cast p3, Lb10/z0;

    invoke-virtual {p3, p1, p2, v0, p4}, Lb10/z0;->e(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final d(Ly00/c8;ILjava/lang/String;)Lux/m0;
    .locals 1

    check-cast p1, Ly00/l3;

    new-instance v0, Lux/z;

    invoke-direct {v0, p1, p2, p3}, Lux/z;-><init>(Ly00/l3;ILjava/lang/String;)V

    return-object v0
.end method

.method public final f(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lv10/i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv10/i;

    iget v1, v0, Lv10/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv10/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv10/i;

    invoke-direct {v0, p0, p3}, Lv10/i;-><init>(Lv10/k;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lv10/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv10/i;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lv10/i;->y:I

    iget-object p3, p0, Lv10/g;->b:Lb10/c1;

    check-cast p3, Lb10/z0;

    invoke-virtual {p3, p1, p2, v0}, Lb10/z0;->K(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lv10/j;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lv10/j;

    iget v1, v0, Lv10/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv10/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv10/j;

    invoke-direct {v0, p0, p4}, Lv10/j;-><init>(Lv10/k;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lv10/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv10/j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lv10/j;->y:I

    iget-object p4, p0, Lv10/g;->b:Lb10/c1;

    check-cast p4, Lb10/z0;

    invoke-virtual {p4, p1, p2, p3, v0}, Lb10/z0;->Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
