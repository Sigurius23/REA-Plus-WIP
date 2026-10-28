.class public abstract Lpe1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lcom/whoop/educationModels/FeatureEducationScreenDto;",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "(Ljava/util/List;)Lcom/whoop/design/util/TextResource;",
        "Lcom/whoop/educationModels/MediaHeader;",
        "a",
        "(Lcom/whoop/educationModels/MediaHeader;)Lcom/whoop/educationModels/MediaHeader;",
        "education_release"
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
.method public static final a(Lcom/whoop/educationModels/MediaHeader;)Lcom/whoop/educationModels/MediaHeader;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/educationModels/MediaHeader;->getPodcastPicker()Lcom/whoop/educationModels/PodcastPicker;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/educationModels/MediaHeader;->getPodcastPicker()Lcom/whoop/educationModels/PodcastPicker;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/educationModels/PodcastPicker;->getPodcastPlayers()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/educationModels/PodcastPlayer;

    invoke-virtual {v5}, Lcom/whoop/educationModels/PodcastPlayer;->getOperatingSystem()Lcom/whoop/educationModels/OperatingSystem;

    move-result-object v6

    sget-object v7, Lcom/whoop/educationModels/OperatingSystem;->ANDROID:Lcom/whoop/educationModels/OperatingSystem;

    if-eq v6, v7, :cond_1

    invoke-virtual {v5}, Lcom/whoop/educationModels/PodcastPlayer;->getOperatingSystem()Lcom/whoop/educationModels/OperatingSystem;

    move-result-object v5

    sget-object v6, Lcom/whoop/educationModels/OperatingSystem;->BOTH:Lcom/whoop/educationModels/OperatingSystem;

    if-ne v5, v6, :cond_0

    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_3
    const/4 v2, 0x1

    invoke-static {v0, v1, v3, v2, v1}, Lcom/whoop/educationModels/PodcastPicker;->copy$default(Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/educationModels/PodcastPicker;

    move-result-object v1

    :cond_4
    move-object v8, v1

    const/16 v10, 0x5f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v11}, Lcom/whoop/educationModels/MediaHeader;->copy$default(Lcom/whoop/educationModels/MediaHeader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/educationModels/MediaHeader;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;)Lcom/whoop/design/util/TextResource;
    .locals 2
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

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    invoke-virtual {v1}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getNavBar()Lcom/whoop/educationModels/NavBarDto;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

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
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method
