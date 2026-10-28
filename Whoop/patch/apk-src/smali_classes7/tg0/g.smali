.class public abstract Ltg0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0000H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lxg0/c;",
        "existingModels",
        "",
        "incomingFileSizes",
        "Ltg0/f;",
        "a",
        "(Ljava/util/List;Ljava/util/List;)Ltg0/f;",
        "bot_release"
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
.method public static final a(Ljava/util/List;Ljava/util/List;)Ltg0/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxg0/c;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ltg0/f;"
        }
    .end annotation

    const-string v0, "existingModels"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomingFileSizes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-le v2, v0, :cond_0

    sget-object v0, Ltg0/e$b;->a:Ltg0/e$b;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v4, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxg0/c;

    invoke-virtual {v2}, Lxg0/c;->d()J

    move-result-wide v6

    add-long/2addr v4, v6

    goto :goto_1

    :cond_1
    move-object p0, p1

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    add-long/2addr v4, v6

    const-wide/32 v6, 0x3200000

    cmp-long v6, v4, v6

    if-gtz v6, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-ge v2, v1, :cond_3

    sget-object p0, Ltg0/e$a;->a:Ltg0/e$a;

    goto :goto_3

    :cond_3
    move-object p0, v3

    :goto_3
    if-eqz p0, :cond_4

    new-instance p1, Ltg0/f;

    invoke-direct {p1, v2, p0}, Ltg0/f;-><init>(ILtg0/e;)V

    return-object p1

    :cond_4
    if-eqz v0, :cond_5

    new-instance p0, Ltg0/f;

    invoke-direct {p0, v1, v0}, Ltg0/f;-><init>(ILtg0/e;)V

    return-object p0

    :cond_5
    new-instance p0, Ltg0/f;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, p1, v3}, Ltg0/f;-><init>(ILtg0/e;)V

    return-object p0
.end method
