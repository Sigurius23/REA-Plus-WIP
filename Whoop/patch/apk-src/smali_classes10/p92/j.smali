.class public final Lp92/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lp92/j;",
        "",
        "",
        "Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "recStrainMappings",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "strain1",
        "strain2",
        "e",
        "(DD)D",
        "scaled",
        "f",
        "(D)D",
        "",
        "recoveryValue",
        "dayStrain",
        "a",
        "(ID)Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "c",
        "",
        "Ljava/util/Map;",
        "strainRecoveryMap",
        "",
        "d",
        "()Z",
        "isEmpty",
        "core_release"
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
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/whoop/domain/model/StrainRecoveryMapping;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/StrainRecoveryMapping;",
            ">;)V"
        }
    .end annotation

    const-string v0, "recStrainMappings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/StrainRecoveryMapping;

    invoke-virtual {v1}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getRecovery()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lp92/j;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic b(Lp92/j;IDILjava/lang/Object;)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lp92/j;->a(ID)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object p0

    return-object p0
.end method

.method private final e(DD)D
    .locals 0

    invoke-direct {p0, p1, p2}, Lp92/j;->f(D)D

    move-result-wide p1

    invoke-direct {p0, p3, p4}, Lp92/j;->f(D)D

    move-result-wide p3

    sub-double/2addr p1, p3

    const-wide/16 p3, 0x0

    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    invoke-static {p1, p2}, Lgi0/f;->j(D)D

    move-result-wide p1

    return-wide p1
.end method

.method private final f(D)D
    .locals 13

    sget-object v0, Lgi0/g;->a:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const-wide/16 v2, 0x0

    if-ltz v1, :cond_1

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v8, 0x1

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    add-int/lit8 v9, v5, 0x1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    if-nez v6, :cond_0

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    cmpl-double v7, p1, v11

    if-ltz v7, :cond_0

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    cmpg-double v7, p1, v10

    if-gez v7, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    move v6, v8

    :cond_0
    if-eq v5, v1, :cond_1

    move v5, v9

    goto :goto_0

    :cond_1
    return-wide v2
.end method


# virtual methods
.method public final a(ID)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 10

    iget-object v0, p0, Lp92/j;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.domain.model.StrainRecoveryMapping"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/domain/model/StrainRecoveryMapping;

    const-wide/16 v1, 0x0

    cmpg-double v1, p2, v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/domain/model/StrainRecoveryMapping;

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getLowerRecStrain()D

    move-result-wide v3

    invoke-direct {p0, v3, v4, p2, p3}, Lp92/j;->e(DD)D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getRecStrain()D

    move-result-wide v6

    invoke-direct {p0, v6, v7, p2, p3}, Lp92/j;->e(DD)D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getUpperRecStrain()D

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2, p3}, Lp92/j;->e(DD)D

    move-result-wide v8

    move v3, p1

    invoke-direct/range {v2 .. v9}, Lcom/whoop/domain/model/StrainRecoveryMapping;-><init>(IDDD)V

    return-object v2
.end method

.method public final c(ID)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 10

    iget-object v0, p0, Lp92/j;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.domain.model.StrainRecoveryMapping"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/domain/model/StrainRecoveryMapping;

    const-wide/16 v1, 0x0

    cmpg-double v1, p2, v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/domain/model/StrainRecoveryMapping;

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getLowerRecStrain()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getRecStrain()D

    move-result-wide v6

    invoke-direct {p0, v6, v7, p2, p3}, Lp92/j;->e(DD)D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getUpperRecStrain()D

    move-result-wide v8

    move v3, p1

    invoke-direct/range {v2 .. v9}, Lcom/whoop/domain/model/StrainRecoveryMapping;-><init>(IDDD)V

    return-object v2
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lp92/j;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method
