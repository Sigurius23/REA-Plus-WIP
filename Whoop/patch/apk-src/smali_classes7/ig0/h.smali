.class public final synthetic Lig0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lig0/h;->w:I

    iput-object p1, p0, Lig0/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Lig0/h;->z:Ljava/lang/Object;

    iput-object p3, p0, Lig0/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lig0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, v2, p1}, Ljs2/i;->i(Landroidx/lifecycle/g0;Landroid/content/Context;Ll83/h;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, v2, p1}, Ljs2/i;->e(Landroidx/lifecycle/g0;Lp1/c1;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/integrations/view/IntegrationsFragment;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/integrations/view/IntegrationsFragment;->G(Landroidx/lifecycle/g0;Lcom/whoop/integrations/view/IntegrationsFragment;Lp1/t2;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lgr1/b;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2, p1}, Ljr1/d;->k(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Calendar;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/text/SimpleDateFormat;

    check-cast p1, Landroid/widget/CalendarView;

    invoke-static {v0, v1, v2, p1}, Ljp1/f;->f(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lk22/d;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, v2, p1}, Lj22/e;->y(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lk22/d;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Liw0/e;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Liw0/x;->F(Liw0/e;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lc41/w1;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Liw0/x;->w(Lc41/w1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Liw0/f;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Liw0/x;->W(Liw0/f;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lm91/w;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    check-cast p1, Ly3/l;

    invoke-static {v0, v1, v2, p1}, Lis0/j0;->j(Lm91/w;Lp1/t2;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lio2/o0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lio2/m0;->k(Lio2/o0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/navigation/e;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lio2/s;->l(Ll3/g;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    check-cast p1, Ln23/e;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->e(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;Lio/getstream/chat/android/models/Message;Ln23/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->j(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lc93/m;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->a(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->a(Ljava/lang/String;Ljava/util/Collection;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->f(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->i(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->C(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->c(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->G(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->j(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->b(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->o(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Poll;)Lo23/d;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lbm/t;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lim1/a1;->d(Lbc3/c0;Lbm/t;Ljava/util/List;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lim1/d0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lfm1/a;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lfm1/c;

    invoke-static {v0, v1, v2, p1}, Lim1/a1;->c(Lim1/d0;Lfm1/a;Lfm1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lim1/d0;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lm91/u;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lfm1/d;

    invoke-static {v0, v1, v2, p1}, Lim1/c;->c(Lim1/d0;Lm91/u;Lfm1/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lji2/l;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, v2, p1}, Lii2/a;->a(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lfh1/a;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lfh1/c;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lgh1/b;

    invoke-static {v0, v1, v2, p1}, Lih1/i;->c(Lfh1/a;Lfh1/c;Ll83/h;Lgh1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lig0/h;->y:Ljava/lang/Object;

    check-cast v0, Lfg0/a;

    iget-object v1, p0, Lig0/h;->z:Ljava/lang/Object;

    check-cast v1, Lfg0/c;

    iget-object v2, p0, Lig0/h;->x:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lgg0/a;

    invoke-static {v0, v1, v2, p1}, Lig0/i;->b(Lfg0/a;Lfg0/c;Ll83/h;Lgg0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
