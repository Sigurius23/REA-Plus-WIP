.class public final synthetic Lcom/whoop/data/local/room/dao/wipeable/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->w:I

    iput p1, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->x:I

    iput-object p2, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->w:I

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->y:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->w:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->y:Ljava/lang/Object;

    iget v6, p0, Lcom/whoop/data/local/room/dao/wipeable/c;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast v5, Lp1/a1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v6, v5, p1}, Lz80/a;->f(ILp1/a1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v5, Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v6, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v5, Lo0/y;

    check-cast p1, Lp0/i0;

    iget-object v0, v5, Lo0/y;->a:Lo0/a;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-static {v5}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v8

    invoke-static {v5, v8, v7}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Lp0/i0;->a:I

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    add-int v0, v6, v3

    invoke-virtual {p1, v0}, Lp0/i0;->b(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v4

    :pswitch_2
    check-cast v5, Ljy1/c;

    check-cast p1, Ltb/a;

    invoke-static {v5, v6, p1}, Ljy1/c;->f(Ljy1/c;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast v5, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v6, v5, p1}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->c(ILio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v6, v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->g(ILio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v5, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v5, v6, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->b(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;II)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_6
    check-cast v5, Landroid/webkit/WebView;

    check-cast p1, Landroid/content/Context;

    sget v0, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-object v5

    :pswitch_7
    check-cast v5, Lg2/i;

    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v6}, Luf/c0;->c0(Lg2/i;I)V

    return-object v4

    :pswitch_8
    check-cast v5, Ljava/util/ArrayList;

    check-cast p1, Ly2/i1;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v3

    :goto_2
    if-ge v2, v0, :cond_3

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly2/j1;

    iget v8, v7, Ly2/j1;->x:I

    sub-int v8, v6, v8

    div-int/2addr v8, v1

    invoke-static {v7, v3, v8, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-object v4

    :pswitch_9
    check-cast v5, Ly2/j1;

    check-cast p1, Ly2/i1;

    neg-int v0, v6

    invoke-static {v5, v3, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    return-object v4

    :pswitch_a
    check-cast v5, Lfu0/f;

    check-cast p1, Ltb/a;

    invoke-static {v5, v6, p1}, Lfu0/f;->f(Lfu0/f;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v5, Lfu0/c;

    check-cast p1, Ltb/a;

    invoke-static {v5, v6, p1}, Lfu0/c;->f(Lfu0/c;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v5, Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v6, v5, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->a(ILjava/lang/String;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast v5, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v5, v6, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->h(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast v5, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v5, v6, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->e(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;ILtb/a;)Lcom/whoop/domain/model/teams/FeatureTeam;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
