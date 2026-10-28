.class public final Lx30/v;
.super Lg40/a3;
.source "SourceFile"


# instance fields
.field public final b:Lw30/c;

.field public final c:Lx30/t;

.field public final d:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;)V
    .locals 7

    new-instance v0, Lx30/t;

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lx30/t;-><init>(Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;)V

    const-string p2, "cardAccountRangeRepositoryFactory"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cbcEligibility"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cardBrandFilter"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cardFundingFilter"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg40/a3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object v4, p0, Lx30/v;->b:Lw30/c;

    iput-object v0, p0, Lx30/v;->c:Lx30/t;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx30/v;->d:Z

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lx30/v;->c:Lx30/t;

    invoke-virtual {v0, p1}, Lx30/t;->b(Z)V

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/v;->d:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 7

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    iget-object v1, p0, Lx30/v;->c:Lx30/t;

    iget-object v2, v1, Lx30/t;->b:Lg40/c3;

    iget-object v3, v1, Lx30/t;->e:Lg40/c3;

    iget-object v4, v1, Lx30/t;->c:Lx30/z;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v2}, Lg40/k1;->j()Lec3/f2;

    move-result-object v2

    new-instance v5, Lx30/u;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lx30/u;-><init>(Lx30/v;I)V

    invoke-static {v2, v5}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v2, v4, Lx30/z;->c:Lx30/p0;

    iget-object v2, v2, Lx30/p0;->D:Ln53/e;

    new-instance v5, Lx30/u;

    const/4 v6, 0x1

    invoke-direct {v5, p0, v6}, Lx30/u;-><init>(Lx30/v;I)V

    invoke-static {v2, v5}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, Lx30/t;->d:Lx30/f0;

    iget-object v1, v1, Lx30/f0;->c:Lx30/e0;

    iget-object v1, v1, Lx30/e0;->q:Ln53/e;

    new-instance v2, Lx30/u;

    const/4 v5, 0x2

    invoke-direct {v2, p0, v5}, Lx30/u;-><init>(Lx30/v;I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, v4, Lx30/z;->c:Lx30/p0;

    iget-object v1, v1, Lx30/p0;->u:Lec3/f2;

    new-instance v2, Lwz/h1;

    const/4 v5, 0x5

    invoke-direct {v2, v5}, Lwz/h1;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lx30/v;->b:Lw30/c;

    instance-of v1, v1, Lw30/a;

    if-eqz v1, :cond_1

    iget-object v1, v4, Lx30/z;->c:Lx30/p0;

    iget-object v1, v1, Lx30/p0;->s:Ln53/e;

    new-instance v2, Lwz/h1;

    const/4 v4, 0x6

    invoke-direct {v2, v4}, Lwz/h1;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, v3, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v1}, Lg40/k1;->j()Lec3/f2;

    move-result-object v1

    new-instance v2, Lwz/h1;

    const/4 v4, 0x7

    invoke-direct {v2, v4}, Lwz/h1;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v1}, Lg40/k1;->j()Lec3/f2;

    move-result-object v1

    new-instance v2, Lwz/h1;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lwz/h1;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    invoke-virtual {v0}, Ln83/c;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Lec3/l;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v2, Lg40/c;

    const/16 v3, 0xd

    invoke-direct {v2, v1, v3}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v1, v2

    :goto_0
    new-instance v2, Lbg/j;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Ln53/e;

    invoke-direct {v0, v1, v2}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 9

    iget-object v0, p0, Lx30/v;->c:Lx30/t;

    iget-object v1, v0, Lx30/t;->b:Lg40/c3;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lg40/c3;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    iget-object v1, v0, Lx30/t;->c:Lx30/z;

    iget-object v4, v1, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, v0, Lx30/t;->e:Lg40/c3;

    iget-object v5, v1, Lg40/c3;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v0, v0, Lx30/t;->d:Lx30/f0;

    iget-object v6, v0, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPreferredCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Lx30/v;->b:Lw30/c;

    instance-of v1, v1, Lw30/a;

    if-eqz v1, :cond_1

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v8, v2

    :goto_1
    filled-new-array/range {v3 .. v8}, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/util/Map;)V
    .locals 1

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    iget-object v0, p0, Lx30/v;->c:Lx30/t;

    return-object v0
.end method
