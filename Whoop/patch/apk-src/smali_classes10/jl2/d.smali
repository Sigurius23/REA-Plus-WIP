.class public abstract Ljl2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
        "",
        "units",
        "",
        "areEditable",
        "Lsz0/s1;",
        "a",
        "(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;",
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
.method public static final a(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lsz0/s1;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "units"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Ljl2/a;->ZONE_1:Ljl2/a;

    invoke-static {}, Ljl2/a;->values()[Ljl2/a;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_1

    aget-object v10, v6, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_2
    if-nez v10, :cond_2

    goto :goto_3

    :cond_2
    move-object v5, v10

    :goto_3
    invoke-virtual {v5}, Ljl2/a;->toWhoopColorKey()Ly81/f;

    move-result-object v5

    new-instance v9, Lsz0/u1;

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMin()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMin()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v9, v2, v6, p2}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v10, Lsz0/u1;

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMax()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getMax()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v7, Ljl2/a;->ZONE_5:Ljl2/a;

    invoke-virtual {v7}, Ljl2/a;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_4

    :cond_3
    move v8, p2

    :goto_4
    invoke-direct {v10, v2, v6, v8}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v2, Lsz0/s1;

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v12}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    return-object v0
.end method
