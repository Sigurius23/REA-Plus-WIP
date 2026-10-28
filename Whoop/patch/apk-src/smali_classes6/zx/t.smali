.class public final Lzx/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzx/x;


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static final b:Ljava/util/ArrayList;

.field public static final c:Ljava/util/ArrayList;

.field public static final d:Ljava/util/ArrayList;

.field public static final e:Ljava/util/ArrayList;

.field public static final f:Ljava/util/ArrayList;

.field public static final g:Ljava/util/ArrayList;

.field public static final h:Ljava/util/ArrayList;

.field public static final i:Ljava/util/ArrayList;

.field public static final j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ly00/f;

    const-string v1, "4000000000000000"

    const-string v2, "4999999999999999"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x10

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->y:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lzx/t;->a:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "2221000000000000"

    const-string v4, "2720999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "5100000000000000"

    const-string v6, "5599999999999999"

    invoke-direct {v1, v4, v6, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->z:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sput-object v1, Lzx/t;->b:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "340000000000000"

    const-string v4, "349999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "370000000000000"

    const-string v6, "379999999999999"

    invoke-direct {v1, v4, v6, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->E:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    const/16 v8, 0xf

    invoke-direct {v6, v4, v8, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sput-object v1, Lzx/t;->c:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "6000000000000000"

    const-string v4, "6099999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "6400000000000000"

    const-string v6, "6499999999999999"

    invoke-direct {v1, v4, v6, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v4, Ly00/f;

    const-string v6, "6500000000000000"

    const-string v7, "6599999999999999"

    invoke-direct {v4, v6, v7, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1, v4}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->H:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    sput-object v1, Lzx/t;->d:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "3528000000000000"

    const-string v4, "3589999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->F:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    sput-object v1, Lzx/t;->e:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "6200000000000000"

    const-string v4, "6216828049999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "6216828060000000"

    const-string v6, "6299999999999999"

    invoke-direct {v1, v4, v6, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v4, Ly00/f;

    const-string v6, "8100000000000000"

    const-string v7, "8199999999999999"

    invoke-direct {v4, v6, v7, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1, v4}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->I:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    sput-object v1, Lzx/t;->f:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "6216828050000000000"

    const-string v4, "6216828059999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->I:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    const/16 v8, 0x13

    invoke-direct {v6, v4, v8, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    sput-object v1, Lzx/t;->g:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "3000000000000000"

    const-string v4, "3059999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "3095000000000000"

    const-string v6, "3095999999999999"

    invoke-direct {v1, v4, v6, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v4, Ly00/f;

    const-string v6, "3800000000000000"

    const-string v7, "3999999999999999"

    invoke-direct {v4, v6, v7, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1, v4}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->G:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    invoke-direct {v6, v4, v5, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    sput-object v1, Lzx/t;->h:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "36000000000000"

    const-string v4, "36999999999999"

    invoke-direct {v0, v1, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/f;

    new-instance v6, Ly00/b;

    sget-object v7, Ly00/a;->G:Ly00/a;

    sget-object v8, Ly00/j;->x:Lt9/p;

    const/16 v8, 0xe

    invoke-direct {v6, v4, v8, v7}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_8
    sput-object v1, Lzx/t;->i:Ljava/util/ArrayList;

    new-instance v0, Ly00/f;

    const-string v1, "4000002500001001"

    invoke-direct {v0, v1, v1, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Ly00/f;

    const-string v4, "5555552500001001"

    invoke-direct {v1, v4, v4, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v1}, [Ly00/f;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/f;

    new-instance v3, Ly00/b;

    sget-object v4, Ly00/a;->J:Ly00/a;

    sget-object v6, Ly00/j;->x:Lt9/p;

    invoke-direct {v3, v2, v5, v4}, Ly00/b;-><init>(Ly00/f;ILy00/a;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_9
    sget-object v0, Lzx/t;->a:Ljava/util/ArrayList;

    sget-object v2, Lzx/t;->b:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->c:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->d:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->e:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->f:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->g:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->h:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lzx/t;->i:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lzx/t;->j:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lzx/g;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lzx/t;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ly00/b;

    iget-object v3, v3, Ly00/b;->w:Ly00/f;

    invoke-virtual {v3, p1}, Ly00/f;->b(Lzx/g;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
