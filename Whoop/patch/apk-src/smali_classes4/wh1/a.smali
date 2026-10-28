.class public final Lwh1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\n2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lwh1/a;",
        "Lii1/a;",
        "Luh1/a;",
        "gpsLocationDao",
        "Ljs0/c;",
        "configurationRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Luh1/a;Ljs0/c;Ltr2/n;)V",
        "",
        "limit",
        "",
        "Lyh1/a;",
        "b",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "timestamps",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "location",
        "Ll83/a0;",
        "c",
        "(Lyh1/a;Lq83/d;)Ljava/lang/Object;",
        "Luh1/a;",
        "Ljs0/c;",
        "Ltr2/n;",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Luh1/a;

.field private final b:Ljs0/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Luh1/a;Ljs0/c;Ltr2/n;)V
    .locals 1

    const-string v0, "gpsLocationDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwh1/a;->a:Luh1/a;

    .line 3
    iput-object p2, p0, Lwh1/a;->b:Ljs0/c;

    .line 4
    iput-object p3, p0, Lwh1/a;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Luh1/a;Ljs0/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "RoomGpsStorage"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwh1/a;-><init>(Luh1/a;Ljs0/c;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwh1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwh1/a$a;

    iget v1, v0, Lwh1/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwh1/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwh1/a$a;

    invoke-direct {v0, p0, p2}, Lwh1/a$a;-><init>(Lwh1/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwh1/a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwh1/a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwh1/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lwh1/a;->a:Luh1/a;

    iput-object p1, v0, Lwh1/a$a;->w:Ljava/lang/Object;

    iput v3, v0, Lwh1/a$a;->z:I

    invoke-interface {p2, p1, v0}, Luh1/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v0, p0, Lwh1/a;->c:Ltr2/n;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v1, "Failed to delete GPS locations by timestamps="

    const-string v2, " items"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, p2, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move p1, v1

    :goto_3
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object p2
.end method

.method public b(ILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lyh1/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwh1/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwh1/a$b;

    iget v1, v0, Lwh1/a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwh1/a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwh1/a$b;

    invoke-direct {v0, p0, p2}, Lwh1/a$b;-><init>(Lwh1/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwh1/a$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwh1/a$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwh1/a;->a:Luh1/a;

    iput p1, v0, Lwh1/a$b;->w:I

    iput v3, v0, Lwh1/a$b;->z:I

    invoke-interface {p2, p1, v0}, Luh1/a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh1/a;

    invoke-virtual {v0}, Lvh1/a;->k()Lyh1/a;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object p1
.end method

.method public c(Lyh1/a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "GPS table size ("

    instance-of v1, p2, Lwh1/a$c;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lwh1/a$c;

    iget v2, v1, Lwh1/a$c;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lwh1/a$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lwh1/a$c;

    invoke-direct {v1, p0, p2}, Lwh1/a$c;-><init>(Lwh1/a;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lwh1/a$c;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lwh1/a$c;->G:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    check-cast p1, Lvh1/a;

    iget-object p1, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    check-cast p1, Lyh1/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    check-cast p1, Lvh1/a;

    iget-object p1, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    check-cast p1, Lyh1/a;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    iget-object p1, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    check-cast p1, Lvh1/a;

    iget-object p1, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    check-cast p1, Lyh1/a;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    sget-object p2, Lvh1/a;->k:Lvh1/a$a;

    invoke-virtual {p2, p1}, Lvh1/a$a;->a(Lyh1/a;)Lvh1/a;

    move-result-object p1

    iget-object p2, p0, Lwh1/a;->a:Luh1/a;

    iput-object v8, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    iput-object v8, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    iput v7, v1, Lwh1/a$c;->G:I

    invoke-interface {p2, p1, v1}, Luh1/a;->e(Lvh1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    iget-object p1, p0, Lwh1/a;->a:Luh1/a;

    iput-object v8, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    iput-object v8, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    iput v6, v1, Lwh1/a$c;->G:I

    invoke-interface {p1, v1}, Luh1/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_2
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p0, Lwh1/a;->b:Ljs0/c;

    sget-object v3, Lth1/a;->a:Lth1/a;

    invoke-virtual {p2}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p2

    invoke-virtual {v3}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v3

    const-class v7, Ljava/lang/Integer;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-static {p2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_3

    :cond_7
    move-object p2, v8

    goto/16 :goto_3

    :cond_8
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-static {p2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    goto :goto_3

    :cond_9
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-static {p2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p2

    goto :goto_3

    :cond_a
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-static {p2}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p2

    goto :goto_3

    :cond_b
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-static {p2}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_3

    :cond_c
    const-class v10, Ljava/lang/String;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {p2, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_3

    :cond_d
    move-object p2, v3

    :goto_3
    if-nez p2, :cond_e

    goto :goto_4

    :cond_e
    move-object v3, p2

    :goto_4
    if-eqz v3, :cond_f

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-le p1, p2, :cond_10

    iget-object v3, p0, Lwh1/a;->c:Ltr2/n;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") exceeds max ("

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "), pruning..."

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {v3, v0, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lwh1/a;->a:Luh1/a;

    iput-object v8, v1, Lwh1/a$c;->w:Ljava/lang/Object;

    iput-object v8, v1, Lwh1/a$c;->x:Ljava/lang/Object;

    iput p1, v1, Lwh1/a$c;->y:I

    iput p2, v1, Lwh1/a$c;->z:I

    iput v5, v1, Lwh1/a$c;->G:I

    invoke-interface {v0, p2, v1}, Luh1/a;->d(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_10

    :goto_5
    return-object v2

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_0

    :goto_6
    iget-object p2, p0, Lwh1/a;->c:Ltr2/n;

    const-string v0, "Failed to insert GPS location"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_10
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
