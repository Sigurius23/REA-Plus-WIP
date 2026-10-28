.class public abstract Lhl2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a+\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0007\u001a#\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0004\u001a\'\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0000*\u0008\u0012\u0004\u0012\u00020\u000b0\u00002\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
        "Lcom/whoop/hrZones/network/Zone;",
        "e",
        "(Ljava/util/List;)Ljava/util/List;",
        "zoneRows",
        "d",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "zones",
        "f",
        "b",
        "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
        "",
        "maxHr",
        "c",
        "(Ljava/util/List;I)Ljava/util/List;",
        "training_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lhl2/g;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v2}, Lcom/whoop/hrZones/network/Zone;->getId()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v2

    sget-object v3, Lcom/whoop/hrZones/network/ZoneID;->ZONE_0:Lcom/whoop/hrZones/network/ZoneID;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/whoop/hrZones/network/Zone;

    const/16 v0, 0xa

    if-nez v1, :cond_3

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Lcom/whoop/hrZones/network/Zone;

    sget-object v3, Lcom/whoop/hrZones/network/ZoneID;->ZONE_0:Lcom/whoop/hrZones/network/ZoneID;

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {p0}, Lcom/whoop/hrZones/network/Zone;->getMin()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, p0}, Lcom/whoop/hrZones/network/Zone;-><init>(Lcom/whoop/hrZones/network/ZoneID;II)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object p0

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    move-object v0, p0

    check-cast v0, Li93/i;

    iget-boolean v0, v0, Li93/i;->y:Z

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lm83/e0;

    invoke-virtual {v0}, Lm83/e0;->nextInt()I

    move-result v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v2

    :cond_3
    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    move-object v1, v0

    check-cast v1, Li93/i;

    iget-boolean v1, v1, Li93/i;->y:Z

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lm83/e0;

    invoke-virtual {v1}, Lm83/e0;->nextInt()I

    move-result v1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v2
.end method

.method public static final c(Ljava/util/List;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    const/16 v10, 0x7b

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v5, p1

    invoke-static/range {v2 .. v11}, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->copy$default(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static final d(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneRows"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v3

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/hrZones/network/Zone;

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v3}, Lcom/whoop/hrZones/network/Zone;->getId()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v3

    sget-object v4, Lcom/whoop/hrZones/network/ZoneID;->ZONE_0:Lcom/whoop/hrZones/network/ZoneID;

    if-eq v3, v4, :cond_1

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_3

    check-cast v2, Lcom/whoop/hrZones/network/Zone;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    invoke-virtual {v2}, Lcom/whoop/hrZones/network/Zone;->getMin()I

    move-result v8

    invoke-virtual {v2}, Lcom/whoop/hrZones/network/Zone;->getMax()I

    move-result v9

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v11}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->copy$default(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_2

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_4
    return-object v0
.end method

.method public static final e(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    new-instance v2, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/hrZones/network/ZoneID;->valueOf(Ljava/lang/String;)Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMin()I

    move-result v4

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMax()I

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lcom/whoop/hrZones/network/Zone;-><init>(Lcom/whoop/hrZones/network/ZoneID;II)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final f(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zones"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/hrZones/network/Zone;

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/whoop/hrZones/network/Zone;

    invoke-virtual {v3}, Lcom/whoop/hrZones/network/Zone;->getId()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v3

    sget-object v4, Lcom/whoop/hrZones/network/ZoneID;->ZONE_0:Lcom/whoop/hrZones/network/ZoneID;

    if-eq v3, v4, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_4

    check-cast v2, Lcom/whoop/hrZones/network/Zone;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    invoke-virtual {v4}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "ZONE_5"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    invoke-virtual {v2}, Lcom/whoop/hrZones/network/Zone;->getMax()I

    move-result v9

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->copy$default(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    move-result-object v1

    goto :goto_3

    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    :goto_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_2

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_5
    return-object v0
.end method
