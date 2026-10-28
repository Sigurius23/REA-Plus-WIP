.class public final Lmc2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lmc2/g;",
        "",
        "<init>",
        "()V",
        "Lmc2/b;",
        "result",
        "Lmc2/m;",
        "a",
        "(Lmc2/b;)Lmc2/m;",
        "settings_release"
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


# virtual methods
.method public final a(Lmc2/b;)Lmc2/m;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "result"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmc2/b$a;->a:Lmc2/b$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    new-instance v0, Lmc2/m;

    invoke-direct {v0, v3, v3, v2, v3}, Lmc2/m;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    sget-object v1, Lmc2/b$b;->a:Lmc2/b$b;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lmc2/m;

    invoke-direct {v0, v3, v3, v2, v3}, Lmc2/m;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    instance-of v1, v0, Lmc2/b$c;

    if-eqz v1, :cond_9

    check-cast v0, Lmc2/b$c;

    invoke-virtual {v0}, Lmc2/b$c;->a()Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;->getSectionHeader()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lmc2/b$c;->a()Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/settings/referafriendmenu/model/MenuItem;

    new-instance v5, Lmc2/h;

    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getStyle()Ljava/lang/String;

    move-result-object v8

    const-string v9, "TRIAL_REFER_A_FRIEND"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v8, Lmc2/d;->OUTLINED:Lmc2/d;

    goto :goto_1

    :cond_2
    sget-object v8, Lmc2/d;->RAF_MENU_ITEM:Lmc2/d;

    :goto_1
    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getLeftIcon()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v10

    goto :goto_2

    :cond_3
    move-object v10, v3

    :goto_2
    instance-of v11, v10, Lcom/whoop/navigation/ReferAFriendScreenModel;

    if-eqz v11, :cond_4

    check-cast v10, Lcom/whoop/navigation/ReferAFriendScreenModel;

    goto :goto_3

    :cond_4
    move-object v10, v3

    :goto_3
    if-eqz v10, :cond_5

    invoke-virtual {v10}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getShareMessage()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_6

    :cond_5
    const-string v10, ""

    :cond_6
    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/MenuItem;->getContent()Lcom/whoop/settings/referafriendmenu/model/ItemContent;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/settings/referafriendmenu/model/ItemContent;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    if-nez v4, :cond_7

    new-instance v11, Lcom/whoop/navigation/e;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_7
    move-object v11, v4

    :goto_4
    invoke-direct/range {v5 .. v11}, Lmc2/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lmc2/d;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    new-instance v0, Lmc2/m;

    invoke-direct {v0, v1, v2}, Lmc2/m;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
