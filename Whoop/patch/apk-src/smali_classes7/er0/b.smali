.class public abstract Ler0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;",
        "Ljb1/a;",
        "designItemReducer",
        "Lv01/a;",
        "c",
        "(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;",
        "Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;",
        "",
        "Lv01/d;",
        "b",
        "(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;)Ljava/util/List;",
        "community-follower-container-arch-mini_release"
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
.method public static final synthetic a(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;
    .locals 0

    invoke-static {p0, p1}, Ler0/b;->c(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;",
            ")",
            "Ljava/util/List<",
            "Lv01/d;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;->getItems()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez p0, :cond_1

    move-object p0, v1

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v3}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/design/models/items/FlowRowModel;

    if-eqz v4, :cond_3

    check-cast v3, Lcom/whoop/design/models/items/FlowRowModel;

    goto :goto_2

    :cond_3
    move-object v3, v0

    :goto_2
    if-eqz v3, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/FlowRowModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/FlowRowModel;->getItems()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_5

    move-object v3, v1

    :cond_5
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {p0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/items/TagModel;

    if-eqz v3, :cond_8

    check-cast v2, Lcom/whoop/design/models/items/TagModel;

    goto :goto_5

    :cond_8
    move-object v2, v0

    :goto_5
    if-eqz v2, :cond_7

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/TagModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->getValue()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_b

    move-object v4, v0

    goto :goto_8

    :cond_b
    new-instance v4, Lv01/d;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->getTagStyle()Lcom/whoop/design/models/items/TagBackgroundStyle;

    move-result-object v2

    sget-object v6, Lcom/whoop/design/models/items/TagBackgroundStyle;->SELECTED:Lcom/whoop/design/models/items/TagBackgroundStyle;

    if-ne v2, v6, :cond_c

    const/4 v2, 0x1

    goto :goto_7

    :cond_c
    const/4 v2, 0x0

    :goto_7
    invoke-direct {v4, v5, v3, v2}, Lv01/d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V

    :goto_8
    if-eqz v4, :cond_a

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    return-object p0
.end method

.method private static final c(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;->getFilters()Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;->getFilters()Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;

    move-result-object v0

    invoke-static {v0}, Ler0/b;->b(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;->getSorts()Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v4, v0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;->getSorts()Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;

    move-result-object v0

    invoke-static {v0}, Ler0/b;->b(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;->getCta()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p1, p0}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object p0

    :goto_6
    move-object v6, p0

    goto :goto_7

    :cond_4
    const/4 p0, 0x0

    goto :goto_6

    :goto_7
    new-instance v1, Lv01/a;

    invoke-direct/range {v1 .. v6}, Lv01/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/o;)V

    return-object v1
.end method
