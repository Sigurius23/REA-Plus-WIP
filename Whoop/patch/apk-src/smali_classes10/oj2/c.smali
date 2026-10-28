.class public abstract Loj2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "(Ljava/util/List;)Lcom/whoop/design/util/TextResource;",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "a",
        "(Lcom/whoop/educationModels/FeatureEducationDto;)Lcom/whoop/design/util/TextResource;",
        "stress_release"
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
.method public static final a(Lcom/whoop/educationModels/FeatureEducationDto;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/educationModels/FeatureEducationDto;->getNavBar()Lcom/whoop/educationModels/NavBarDto;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/educationModels/NavBarDto;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/educationModels/FeatureEducationDto;->getScreens()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Loj2/c;->b(Ljava/util/List;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;)Lcom/whoop/design/util/TextResource;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
            ">;)",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getNavBar()Lcom/whoop/educationModels/NavBarDto;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getNavBar()Lcom/whoop/educationModels/NavBarDto;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/educationModels/NavBarDto;->getTitle()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lej2/c;->e:I

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
