.class public final Lcom/whoop/design/models/items/OptionCommitPanelModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "matchesStateValue",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "stored",
        "",
        "design-models_release"
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
.method public static final synthetic access$matchesStateValue(Lkotlinx/serialization/json/JsonElement;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/design/models/items/OptionCommitPanelModelKt;->matchesStateValue(Lkotlinx/serialization/json/JsonElement;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final matchesStateValue(Lkotlinx/serialization/json/JsonElement;Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lu82/h;->e(Lkotlinx/serialization/json/JsonElement;ZILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, v2}, Lu82/h;->d(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v2
.end method
