.class public final Lcom/whoop/domain/model/UnitSystemExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/UnitSystemExtKt$EntriesMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u00a8\u0006\t"
    }
    d2 = {
        "isImperial",
        "",
        "Lcom/whoop/domain/model/UnitSystem;",
        "isMetric",
        "unitSystemFromString",
        "value",
        "",
        "unitSystemFromStringOrDefault",
        "default",
        "core_release"
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
.method public static final isImperial(Lcom/whoop/domain/model/UnitSystem;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isMetric(Lcom/whoop/domain/model/UnitSystem;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/whoop/domain/model/UnitSystemExtKt$EntriesMappings;->entries$0:Lt83/a;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v3}, Lcom/whoop/domain/model/UnitSystem;->toName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, p0, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_2
    move-object v0, v2

    :cond_3
    check-cast v0, Lcom/whoop/domain/model/UnitSystem;

    :cond_4
    :goto_0
    return-object v0
.end method

.method public static final unitSystemFromStringOrDefault(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    const-string v0, "default"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static synthetic unitSystemFromStringOrDefault$default(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromStringOrDefault(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p0

    return-object p0
.end method
