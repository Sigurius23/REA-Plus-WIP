.class public final Lzx/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzx/n;

.field public final b:Lq83/j;

.field public final c:Lq83/j;

.field public final d:Lzx/x;

.field public final e:Lux/a;

.field public final f:Lux/b;

.field public final g:Lq30/u0;

.field public final h:Lbc3/c0;

.field public final i:Z

.field public final j:Ln53/e;

.field public k:Lzx/a;

.field public final l:Lec3/h2;

.field public final m:Lec3/h2;

.field public final n:Lbm/g;

.field public o:Lbc3/k1;


# direct methods
.method public constructor <init>(Lzx/n;Lq83/j;Lq83/j;Lzx/x;Lux/a;Lux/b;Lq30/u0;Lhc3/d;I)V
    .locals 1

    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_0

    sget-object p5, Lux/f;->w:Lux/f;

    :cond_0
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_1

    sget-object p6, Lux/h;->w:Lux/h;

    :cond_1
    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_2

    const/4 p7, 0x0

    :cond_2
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_3

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p8

    :cond_3
    const-string p9, "cardAccountRangeRepository"

    invoke-static {p1, p9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p9, "uiContext"

    invoke-static {p2, p9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p9, "workContext"

    invoke-static {p3, p9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx/s;->a:Lzx/n;

    iput-object p2, p0, Lzx/s;->b:Lq83/j;

    iput-object p3, p0, Lzx/s;->c:Lq83/j;

    iput-object p4, p0, Lzx/s;->d:Lzx/x;

    iput-object p5, p0, Lzx/s;->e:Lux/a;

    iput-object p6, p0, Lzx/s;->f:Lux/b;

    iput-object p7, p0, Lzx/s;->g:Lq30/u0;

    iput-object p8, p0, Lzx/s;->h:Lbc3/c0;

    sget-object p1, Ly00/j;->H:Lt83/b;

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lm83/a;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly00/j;

    iget-object p4, p0, Lzx/s;->f:Lux/b;

    invoke-interface {p4, p3}, Lux/b;->F(Ly00/j;)Z

    move-result p3

    if-nez p3, :cond_5

    const/4 p2, 0x1

    :cond_6
    :goto_0
    iput-boolean p2, p0, Lzx/s;->i:Z

    iget-object p1, p0, Lzx/s;->a:Lzx/n;

    iget-object p1, p1, Lzx/n;->e:Ln53/e;

    iput-object p1, p0, Lzx/s;->j:Ln53/e;

    new-instance p1, Lzx/d;

    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, p2, p2}, Lzx/d;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lzx/s;->l:Lec3/h2;

    iput-object p1, p0, Lzx/s;->m:Lec3/h2;

    new-instance p2, Lbm/g;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lbm/g;

    const/4 p3, 0x6

    invoke-direct {p1, p2, p3}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lzx/s;->n:Lbm/g;

    return-void
.end method


# virtual methods
.method public final a()Ly00/b;
    .locals 1

    iget-object v0, p0, Lzx/s;->m:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzx/e;

    invoke-interface {v0}, Lzx/e;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/b;

    return-object v0
.end method

.method public final b(Lzx/g;Z)V
    .locals 8

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p2, :cond_1

    iget v1, p1, Lzx/g;->e:I

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lzx/s;->d(Ljava/util/List;)V

    return-void

    :cond_1
    :goto_0
    const/4 v1, 0x0

    if-eqz p2, :cond_6

    sget-object v2, Lzx/j;->a:Ljava/lang/Object;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p1, Lzx/g;->d:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v6, v5, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_2
    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, v2

    :cond_6
    :goto_3
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p0, v0}, Lzx/s;->d(Ljava/util/List;)V

    return-void

    :cond_7
    iget-object v0, p0, Lzx/s;->d:Lzx/x;

    check-cast v0, Lzx/t;

    invoke-virtual {v0, p1}, Lzx/t;->a(Lzx/g;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez p2, :cond_c

    iget-boolean p2, p0, Lzx/s;->i:Z

    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_b

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly00/b;

    if-eqz p2, :cond_9

    iget-object p2, p2, Ly00/b;->y:Ly00/a;

    iget-object v1, p2, Ly00/a;->x:Ly00/i;

    :cond_9
    if-nez v1, :cond_a

    const/4 p2, -0x1

    goto :goto_4

    :cond_a
    sget-object p2, Lzx/p;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p2, p2, v1

    :goto_4
    const/4 v1, 0x1

    if-eq p2, v1, :cond_b

    const/4 v1, 0x2

    if-eq p2, v1, :cond_b

    invoke-virtual {p0, v0}, Lzx/s;->d(Ljava/util/List;)V

    return-void

    :cond_b
    invoke-virtual {p0, p1}, Lzx/s;->c(Lzx/g;)V

    return-void

    :cond_c
    :goto_5
    invoke-virtual {p0, p1}, Lzx/s;->c(Lzx/g;)V

    return-void
.end method

.method public final c(Lzx/g;)V
    .locals 4

    iget-object v0, p1, Lzx/g;->g:Lzx/a;

    invoke-virtual {p0}, Lzx/s;->a()Ly00/b;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    iget-object v1, v1, Ly00/b;->w:Ly00/f;

    invoke-virtual {v1, p1}, Ly00/f;->b(Lzx/g;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzx/s;->k:Lzx/a;

    invoke-virtual {v0, v1}, Lzx/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-object v0, p0, Lzx/s;->k:Lzx/a;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lzx/s;->o:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iput-object v1, p0, Lzx/s;->o:Lbc3/k1;

    iget-object v0, p0, Lzx/s;->l:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lzx/c;->a:Lzx/c;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Ls40/c0;

    const/16 v2, 0x1c

    invoke-direct {v0, p1, p0, v1, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    iget-object v2, p0, Lzx/s;->h:Lbc3/c0;

    iget-object v3, p0, Lzx/s;->c:Lq83/j;

    invoke-static {v2, v3, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lzx/s;->o:Lbc3/k1;

    :cond_3
    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 6

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ly00/b;

    iget-object v4, v4, Ly00/b;->y:Ly00/a;

    iget-object v4, v4, Ly00/a;->x:Ly00/i;

    iget-object v5, p0, Lzx/s;->e:Lux/a;

    invoke-interface {v5, v4}, Lux/a;->o(Ly00/i;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Lzx/d;

    invoke-direct {v2, v1, p1}, Lzx/d;-><init>(Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, Lzx/s;->l:Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lzx/s;->g:Lq30/u0;

    if-eqz p1, :cond_6

    iget-object p1, p1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->f(Lcom/stripe/android/view/CardNumberEditText;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/b;

    iget-object v4, v4, Ly00/b;->y:Ly00/a;

    iget-object v4, v4, Ly00/a;->x:Ly00/i;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/i;

    if-nez v2, :cond_3

    sget-object v2, Ly00/i;->X:Ly00/i;

    :cond_3
    invoke-virtual {p1, v2}, Lcom/stripe/android/view/CardNumberEditText;->setCardBrand$payments_core_release(Ly00/i;)V

    iget-boolean v2, p1, Lcom/stripe/android/view/CardNumberEditText;->l0:Z

    if-eqz v2, :cond_6

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly00/i;

    if-nez v1, :cond_4

    sget-object v1, Ly00/i;->X:Ly00/i;

    :cond_4
    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setImplicitCardBrandForCbc$payments_core_release(Ly00/i;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/b;

    iget-object v2, v2, Ly00/b;->y:Ly00/a;

    iget-object v2, v2, Ly00/a;->x:Ly00/i;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->setPossibleCardBrands$payments_core_release(Ljava/util/List;)V

    :cond_6
    return-void
.end method
