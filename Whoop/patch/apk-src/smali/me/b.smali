.class public final Lme/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lff/a;


# instance fields
.field public final w:[Lff/a;

.field public final x:Ls/m2;


# direct methods
.method public constructor <init>(Lvg/n;Ls/m2;I)V
    .locals 8

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    sget-object p1, Lvg/n;->a:Lvg/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lvg/m;->b:Lvg/r;

    :cond_0
    new-instance v0, Lma1/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    const/4 v2, 0x4

    and-int/2addr p3, v2

    if-eqz p3, :cond_1

    new-instance p2, Lme/a;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lme/a;-><init>(Lvg/n;Lq83/d;)V

    new-instance p3, Ls/m2;

    invoke-direct {p3, p2}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object p2, p3

    :cond_1
    const-string p3, "platformProvider"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "profile"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lme/e;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lme/c;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lme/c;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lme/c;

    const/4 v6, 0x1

    invoke-direct {v5, p2, v6}, Lme/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lme/d;

    invoke-direct {p2, v0, p1}, Lme/d;-><init>(Ll83/h;Lvg/n;)V

    new-array p1, v2, [Lff/a;

    aput-object p3, p1, v4

    aput-object v3, p1, v6

    aput-object v5, p1, v1

    const/4 p3, 0x3

    aput-object p2, p1, p3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/b;->w:[Lff/a;

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v1, 0x1

    const-class v3, Lme/b;

    const-string v4, "resolveRegion"

    const-string v5, "resolveRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance p1, Ls/m2;

    invoke-direct {p1, v0}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v2, Lme/b;->x:Ls/m2;

    return-void
.end method

.method public static final h(Lme/b;Lq83/d;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lff/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lff/b;

    iget v1, v0, Lff/b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lff/b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lff/b;

    invoke-direct {v0, p0, p1}, Lff/b;-><init>(Lme/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lff/b;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lff/b;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lff/b;->E:I

    iget v2, v0, Lff/b;->z:I

    iget-object v4, v0, Lff/b;->y:Lff/a;

    iget-object v5, v0, Lff/b;->x:[Ljava/lang/Object;

    check-cast v5, [Lff/a;

    iget-object v6, v0, Lff/b;->w:Log/g;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    const-class v2, Lme/b;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {p1, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p1

    iget-object p0, p0, Lme/b;->w:[Lff/a;

    array-length v2, p0

    const/4 v4, 0x0

    move-object v5, p0

    move-object v6, p1

    move p0, v2

    move v2, v4

    :goto_1
    if-ge v2, p0, :cond_5

    aget-object v4, v5, v2

    :try_start_1
    iput-object v6, v0, Lff/b;->w:Log/g;

    iput-object v5, v0, Lff/b;->x:[Ljava/lang/Object;

    iput-object v4, v0, Lff/b;->y:Lff/a;

    iput v2, v0, Lff/b;->z:I

    iput p0, v0, Lff/b;->E:I

    iput v3, v0, Lff/b;->H:I

    invoke-interface {v4, v0}, Lff/a;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    new-instance v7, Lf1/w1;

    const/4 v8, 0x3

    invoke-direct {v7, v8, p1, v4}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Log/g;->m(Log/g;Lc93/a;)V

    move-object v1, p1

    goto :goto_5

    :cond_4
    new-instance p1, Ld1/i;

    const/16 v7, 0x13

    invoke-direct {p1, v4, v7}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {v6, p1}, Log/g;->m(Log/g;Lc93/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_3
    new-instance v7, Lf1/w1;

    const/4 v8, 0x4

    invoke-direct {v7, v8, v4, p1}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Log/g;->m(Log/g;Lc93/a;)V

    :goto_4
    add-int/2addr v2, v3

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_5
    return-object v1

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lme/b;->x:Ls/m2;

    invoke-virtual {v0, p1}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 5

    iget-object v0, p0, Lme/b;->w:[Lff/a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    instance-of v4, v3, Ljava/io/Closeable;

    if-eqz v4, :cond_0

    check-cast v3, Ljava/io/Closeable;

    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, Lme/b;->w:[Lff/a;

    invoke-static {v0, v1}, Lm83/s;->h1(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lff/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, " -> "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
