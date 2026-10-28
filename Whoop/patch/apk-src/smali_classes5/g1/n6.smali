.class public final Lg1/n6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lmc3/c;

.field public final b:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lg1/n6;->a:Lmc3/c;

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lg1/n6;->b:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lg1/h6;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lg1/m6;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lg1/m6;

    iget v1, v0, Lg1/m6;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/m6;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/m6;

    invoke-direct {v0, p0, p3}, Lg1/m6;-><init>(Lg1/n6;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lg1/m6;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/m6;->G:I

    iget-object v3, p0, Lg1/n6;->b:Lp1/k1;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lg1/m6;->z:Lmc3/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lg1/m6;->z:Lmc3/a;

    iget-object p2, v0, Lg1/m6;->y:Lg1/h6;

    iget-object v2, v0, Lg1/m6;->x:Ljava/lang/String;

    iget-object v7, v0, Lg1/m6;->w:Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v7

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lg1/m6;->w:Ljava/lang/String;

    iput-object v4, v0, Lg1/m6;->x:Ljava/lang/String;

    iput-object p2, v0, Lg1/m6;->y:Lg1/h6;

    iget-object p3, p0, Lg1/n6;->a:Lmc3/c;

    iput-object p3, v0, Lg1/m6;->z:Lmc3/a;

    iput v6, v0, Lg1/m6;->G:I

    invoke-virtual {p3, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v4

    :goto_1
    :try_start_1
    iput-object p1, v0, Lg1/m6;->w:Ljava/lang/String;

    iput-object v2, v0, Lg1/m6;->x:Ljava/lang/String;

    iput-object p2, v0, Lg1/m6;->y:Lg1/h6;

    iput-object p3, v0, Lg1/m6;->z:Lmc3/a;

    iput v5, v0, Lg1/m6;->G:I

    new-instance v5, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v5}, Lbc3/m;->s()V

    new-instance v0, Lg1/l6;

    invoke-direct {v0, p1, v2, p2, v5}, Lg1/l6;-><init>(Ljava/lang/String;Ljava/lang/String;Lg1/h6;Lbc3/m;)V

    invoke-virtual {v3, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v8, p3

    move-object p3, p1

    move-object p1, v8

    :goto_3
    :try_start_2
    invoke-virtual {v3, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p3

    :catchall_1
    move-exception p2

    goto :goto_5

    :catchall_2
    move-exception p2

    move-object p1, p3

    :goto_4
    :try_start_3
    invoke-virtual {v3, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_5
    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method
