.class public final Lzx/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lso/q;

.field public final b:Lzx/f;

.field public final c:Lt9/u;

.field public final d:Lbi/p;

.field public final e:Ln53/e;


# direct methods
.method public constructor <init>(Lso/q;Lzx/f;Lt9/u;Lbi/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx/n;->a:Lso/q;

    iput-object p2, p0, Lzx/n;->b:Lzx/f;

    iput-object p3, p0, Lzx/n;->c:Lt9/u;

    iput-object p4, p0, Lzx/n;->d:Lbi/p;

    iget-object p1, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p1, Lec3/r1;

    invoke-interface {p2}, Lzx/f;->getLoading()Lec3/r1;

    move-result-object p2

    iget-object p3, p3, Lt9/u;->x:Ljava/lang/Object;

    check-cast p3, Lec3/r1;

    new-instance p4, Lzc1/y0;

    const/16 v0, 0x13

    invoke-direct {p4, v0}, Lzc1/y0;-><init>(I)V

    invoke-static {p1, p2, p3, p4}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lzx/n;->e:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a(Lzx/g;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lzx/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzx/m;

    iget v1, v0, Lzx/m;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzx/m;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzx/m;

    invoke-direct {v0, p0, p2}, Lzx/m;-><init>(Lzx/n;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lzx/m;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzx/m;->E:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lzx/m;->x:Lzx/g;

    iget-object v2, v0, Lzx/m;->w:Lzx/n;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lzx/m;->x:Lzx/g;

    iget-object v2, v0, Lzx/m;->w:Lzx/n;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lzx/m;->x:Lzx/g;

    iget-object v2, v0, Lzx/m;->w:Lzx/n;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Lzx/g;->g:Lzx/a;

    if-eqz p2, :cond_e

    iput-object p0, v0, Lzx/m;->w:Lzx/n;

    iput-object p1, v0, Lzx/m;->x:Lzx/g;

    iput v6, v0, Lzx/m;->E:I

    iget-object v2, p0, Lzx/n;->d:Lbi/p;

    iget-object v2, v2, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_7

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, v2, Lzx/n;->a:Lso/q;

    iput-object v2, v0, Lzx/m;->w:Lzx/n;

    iput-object p1, v0, Lzx/m;->x:Lzx/g;

    iput v5, v0, Lzx/m;->E:I

    invoke-virtual {p2, p1, v0}, Lso/q;->d(Lzx/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_7

    :cond_7
    :goto_2
    check-cast p2, Ljava/util/List;

    goto :goto_4

    :cond_8
    iget-object p2, v2, Lzx/n;->b:Lzx/f;

    iput-object v2, v0, Lzx/m;->w:Lzx/n;

    iput-object p1, v0, Lzx/m;->x:Lzx/g;

    iput v4, v0, Lzx/m;->E:I

    invoke-interface {p2, p1, v0}, Lzx/f;->d(Lzx/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_7

    :cond_9
    :goto_3
    check-cast p2, Ljava/util/List;

    :goto_4
    if-eqz p2, :cond_c

    move-object v4, p2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    move-object p2, v7

    :goto_5
    if-nez p2, :cond_b

    goto :goto_6

    :cond_b
    return-object p2

    :cond_c
    :goto_6
    iget-object p2, v2, Lzx/n;->c:Lt9/u;

    iput-object v7, v0, Lzx/m;->w:Lzx/n;

    iput-object v7, v0, Lzx/m;->x:Lzx/g;

    iput v3, v0, Lzx/m;->E:I

    invoke-virtual {p2, p1, v0}, Lt9/u;->d(Lzx/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_d

    :goto_7
    return-object v1

    :cond_d
    :goto_8
    check-cast p2, Ljava/util/List;

    return-object p2

    :cond_e
    return-object v7
.end method
