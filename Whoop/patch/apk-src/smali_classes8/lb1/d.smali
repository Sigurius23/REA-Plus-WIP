.class public abstract Llb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "additionalInfoModel",
        "Lvz0/b;",
        "a",
        "(Lcom/whoop/design/models/items/AdditionalInfoTextModel;)Lvz0/b;",
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
.method public static final a(Lcom/whoop/design/models/items/AdditionalInfoTextModel;)Lvz0/b;
    .locals 9

    const-string v0, "additionalInfoModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    sget-object v3, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v2, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    move-object v2, v3

    :cond_2
    new-instance p0, Lvz0/b;

    invoke-direct {p0, v0, v1, v2}, Lvz0/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lgz0/m0;)V

    return-object p0
.end method
