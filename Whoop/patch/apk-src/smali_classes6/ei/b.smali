.class public final Lei/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lud3/l0;


# direct methods
.method public synthetic constructor <init>(Lud3/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei/b;->a:Lud3/l0;

    return-void
.end method

.method public static a(Lud3/l0;Lbi/r;Lbi/k;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lei/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lei/a;

    iget v1, v0, Lei/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lei/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lei/a;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lei/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lei/a;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lei/a;->w:Ljava/lang/Object;

    check-cast p0, Ljava/io/Closeable;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lei/a;->w:Ljava/lang/Object;

    check-cast p0, Lc93/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lei/a;->x:Lud3/l0;

    iget-object p1, v0, Lei/a;->w:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lc93/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p2, v0, Lei/a;->w:Ljava/lang/Object;

    iput-object p0, v0, Lei/a;->x:Lud3/l0;

    iput v5, v0, Lei/a;->z:I

    invoke-static {p1, v0}, Lv8/b;->h(Lbi/r;Ls83/c;)Lud3/o0;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p3, Lud3/o0;

    invoke-virtual {p0, p3}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p0

    iput-object p2, v0, Lei/a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lei/a;->x:Lud3/l0;

    iput v4, v0, Lei/a;->z:I

    new-instance p1, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    invoke-direct {p1, v5, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    new-instance p3, Landroidx/room/d;

    const/4 v2, 0x1

    invoke-direct {p3, v2, p0, p1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p3}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {p1, p3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p0, p2

    :goto_2
    move-object p1, p3

    check-cast p1, Ljava/io/Closeable;

    :try_start_1
    move-object p2, p1

    check-cast p2, Lud3/x0;

    invoke-static {p2}, Lv8/b;->g(Lud3/x0;)Lbi/s;

    move-result-object p2

    iput-object p1, v0, Lei/a;->w:Ljava/lang/Object;

    iput v3, v0, Lei/a;->z:I

    invoke-interface {p0, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object p0, p1

    :goto_4
    invoke-static {p0, v6}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p3

    :catchall_1
    move-exception p0

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    :goto_5
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lei/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lei/b;

    iget-object p1, p1, Lei/b;->a:Lud3/l0;

    iget-object v0, p0, Lei/b;->a:Lud3/l0;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lei/b;->a:Lud3/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CallFactoryNetworkClient(callFactory="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lei/b;->a:Lud3/l0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
