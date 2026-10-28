.class public final Lbe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/f;


# instance fields
.field public final w:Lvg/n;

.field public final x:Ls/m2;

.field public final y:Ls/m2;


# direct methods
.method public constructor <init>(Lvg/n;)V
    .locals 9

    const-string v0, "platformProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/k;->w:Lvg/n;

    new-instance v1, La1/e;

    const/4 v7, 0x0

    const/16 v8, 0xa

    const/4 v2, 0x1

    const-class v4, Lbe/k;

    const-string v5, "doResolveEndpoint"

    const-string v6, "doResolveEndpoint(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance p1, Ls/m2;

    invoke-direct {p1, v1}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v3, Lbe/k;->x:Ls/m2;

    new-instance p1, La6/e;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, p0, v0, v1}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v0, Ls/m2;

    invoke-direct {v0, p1}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v3, Lbe/k;->y:Ls/m2;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lbe/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbe/h;

    iget v1, v0, Lbe/h;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbe/h;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbe/h;

    invoke-direct {v0, p0, p1}, Lbe/h;-><init>(Lbe/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbe/h;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbe/h;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lbe/h;->y:I

    iget-object p1, p0, Lbe/k;->y:Ls/m2;

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lce/k;

    const-string v0, "ec2_metadata_service_endpoint"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lef/a;

    sget-object v1, Lcg/o;->i:Lcg/n;

    invoke-static {v1, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p1

    invoke-direct {v0, p1}, Lef/a;-><init>(Lcg/o;)V

    return-object v0

    :cond_4
    return-object v1
.end method

.method public final b(Ls83/c;)Ljava/lang/Enum;
    .locals 4

    instance-of v0, p1, Lbe/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbe/i;

    iget v1, v0, Lbe/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbe/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbe/i;

    invoke-direct {v0, p0, p1}, Lbe/i;-><init>(Lbe/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbe/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbe/i;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lbe/i;->y:I

    iget-object p1, p0, Lbe/k;->y:Ls/m2;

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lce/k;

    const-string v0, "ec2_metadata_service_endpoint_mode"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v0, Lbe/b;->x:Lbe/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lbe/a;->a(Ljava/lang/String;)Lbe/b;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v1
.end method

.method public final c(Luf/w;Lq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lbe/k;->x:Ls/m2;

    check-cast p2, Ls83/c;

    invoke-virtual {p1, p2}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lbe/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbe/j;

    iget v1, v0, Lbe/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbe/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbe/j;

    invoke-direct {v0, p0, p1}, Lbe/j;-><init>(Lbe/k;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lbe/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbe/j;->y:I

    iget-object v3, p0, Lbe/k;->w:Lvg/n;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lyd/f;->k:Ljf/a;

    invoke-static {p1, v3}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    new-instance v2, Lef/a;

    sget-object v7, Lcg/o;->i:Lcg/n;

    invoke-static {v7, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p1

    invoke-direct {v2, p1}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_1

    :cond_4
    move-object v2, v6

    :goto_1
    if-nez v2, :cond_6

    iput v5, v0, Lbe/j;->y:I

    invoke-virtual {p0, v0}, Lbe/k;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    move-object v2, p1

    check-cast v2, Lef/a;

    :cond_6
    if-eqz v2, :cond_7

    return-object v2

    :cond_7
    sget-object p1, Lyd/f;->l:Ljf/a;

    invoke-static {p1, v3}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    sget-object v2, Lbe/b;->x:Lbe/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lbe/a;->a(Ljava/lang/String;)Lbe/b;

    move-result-object v6

    :cond_8
    if-nez v6, :cond_a

    iput v4, v0, Lbe/j;->y:I

    invoke-virtual {p0, v0}, Lbe/k;->b(Ls83/c;)Ljava/lang/Enum;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    move-object v6, p1

    check-cast v6, Lbe/b;

    if-nez v6, :cond_a

    sget-object v6, Lbe/b;->y:Lbe/b;

    :cond_a
    iget-object p1, v6, Lbe/b;->w:Lef/a;

    return-object p1
.end method
