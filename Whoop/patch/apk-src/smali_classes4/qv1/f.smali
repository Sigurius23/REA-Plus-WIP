.class public final Lqv1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqv1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqv1/f;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/membership/comunityraf/CommunityRafModel;",
        "Lqv1/h;",
        "b",
        "(Lcom/whoop/membership/comunityraf/CommunityRafModel;)Lqv1/h;",
        "Lqv1/c;",
        "result",
        "a",
        "(Lqv1/c;)Lqv1/h;",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/whoop/membership/comunityraf/CommunityRafModel;)Lqv1/h;
    .locals 27

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/comunityraf/CommunityRafModel;->getHeaderStyle()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    sget-object v3, Lqv1/i;->SECTION_HEADER:Lqv1/i;

    invoke-static {}, Lqv1/i;->values()[Lqv1/i;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_2

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v9

    :goto_2
    sget-object v1, Lqv1/f$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    invoke-static {v8, v3, v8}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/comunityraf/CommunityRafModel;->getHeader()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v18, Lcom/whoop/design/models/items/HeaderStyle;->NONE:Lcom/whoop/design/models/items/HeaderStyle;

    new-instance v9, Lcom/whoop/design/models/items/HeaderModel;

    const/16 v25, 0x7efc

    const/16 v26, 0x0

    const-string v10, "RafCommunityHeaderId"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v9 .. v26}, Lcom/whoop/design/models/items/HeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v8, v3, v8}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/comunityraf/CommunityRafModel;->getHeader()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v18, Lcom/whoop/design/models/items/HeaderStyle;->LARGE:Lcom/whoop/design/models/items/HeaderStyle;

    new-instance v9, Lcom/whoop/design/models/items/HeaderModel;

    const/16 v25, 0x7cfc

    const/16 v26, 0x0

    const-string v10, "RafCommunityHeaderId"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v19, "T1"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v9 .. v26}, Lcom/whoop/design/models/items/HeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/comunityraf/CommunityRafModel;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/comunityraf/RafItem;

    invoke-virtual {v4}, Lcom/whoop/membership/comunityraf/RafItem;->getMenuItemStyle()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    move-object v5, v2

    :cond_5
    sget-object v7, Lqv1/j;->STANDARD:Lqv1/j;

    invoke-static {}, Lqv1/j;->values()[Lqv1/j;

    move-result-object v9

    array-length v10, v9

    move v11, v6

    :goto_5
    if-ge v11, v10, :cond_7

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_7
    move-object v12, v8

    :goto_6
    if-nez v12, :cond_8

    goto :goto_7

    :cond_8
    move-object v7, v12

    :goto_7
    sget-object v5, Lqv1/f$a;->b:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v5, v5, v7

    if-ne v5, v3, :cond_9

    const-string v5, "RAF_MENU_ITEM"

    :goto_8
    move-object/from16 v17, v5

    goto :goto_9

    :cond_9
    const-string v5, "OUTLINED"

    goto :goto_8

    :goto_9
    invoke-static {v8, v3, v8}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v5

    new-instance v9, Lcom/whoop/design/models/items/MenuItemModel;

    invoke-virtual {v4}, Lcom/whoop/membership/comunityraf/RafItem;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/membership/comunityraf/RafItem;->getSubtitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/membership/comunityraf/RafItem;->getIcon()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lcom/whoop/membership/comunityraf/RafItem;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v18

    const/16 v21, 0x400

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v9 .. v22}, Lcom/whoop/design/models/items/MenuItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v9}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    invoke-virtual {v0, v4}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    new-instance v1, Lqv1/h$b;

    new-instance v2, Lqv1/g;

    invoke-direct {v2, v0}, Lqv1/g;-><init>(Ljava/util/List;)V

    invoke-direct {v1, v2}, Lqv1/h$b;-><init>(Lqv1/g;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lqv1/c;)Lqv1/h;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqv1/c$b;

    if-eqz v0, :cond_0

    check-cast p1, Lqv1/c$b;

    invoke-virtual {p1}, Lqv1/c$b;->a()Lcom/whoop/membership/comunityraf/CommunityRafModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lqv1/f;->b(Lcom/whoop/membership/comunityraf/CommunityRafModel;)Lqv1/h;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, p1, Lqv1/c$a;

    if-eqz p1, :cond_1

    sget-object p1, Lqv1/h$a;->a:Lqv1/h$a;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
