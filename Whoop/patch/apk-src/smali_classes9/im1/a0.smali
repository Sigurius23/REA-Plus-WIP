.class public final synthetic Lim1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lim1/a0;->w:I

    iput-object p4, p0, Lim1/a0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lim1/a0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lim1/a0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lim1/a0;->w:I

    iput-object p1, p0, Lim1/a0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lim1/a0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lim1/a0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lji2/f;Ljava/lang/String;)V
    .locals 1

    .line 3
    const/16 v0, 0x1c

    iput v0, p0, Lim1/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/a0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lim1/a0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lim1/a0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lim1/a0;->w:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Lim1/a0;->z:Ljava/lang/Object;

    iget-object v5, p0, Lim1/a0;->y:Ljava/lang/Object;

    iget-object v6, p0, Lim1/a0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Ljava/lang/String;

    check-cast v5, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    check-cast v4, Ljava/lang/String;

    invoke-static {v6, v5, v4}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->a(Ljava/lang/String;Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;)Lec3/l;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lji2/f;

    check-cast v6, Ljava/lang/String;

    invoke-static {v5, v4, v6}, Lmi2/i;->g(Lkotlin/jvm/functions/Function1;Lji2/f;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v5, Lkotlin/jvm/internal/b0;

    check-cast v6, Landroid/net/ConnectivityManager;

    check-cast v4, Lcom/iterable/iterableapi/r1;

    iget-boolean v0, v5, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Lmc/i;->a:Ljava/lang/String;

    const-string v2, "NetworkRequestConstraintController unregister callback"

    invoke-virtual {v0, v1, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    :cond_0
    return-object v3

    :pswitch_2
    check-cast v5, Lcom/whoop/activation/domain/models/EmailDialogInfo;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Lm80/d;->g(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v5, Ll1/x4;

    check-cast v6, Lbc3/c0;

    check-cast v4, Lp1/c1;

    invoke-virtual {v5}, Ll1/x4;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, La13/h;

    const/16 v7, 0xf

    invoke-direct {v0, v5, v2, v7}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v6, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-object v3

    :pswitch_4
    check-cast v5, Llw1/k;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Llw1/f;->a(Llw1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Llw1/d;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/OrderOption;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v5, Leq2/b;

    check-cast v6, Lc93/a;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Llq2/r;->m(Leq2/b;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v5, Lld0/q;

    check-cast v6, Lp1/c1;

    check-cast v4, Lp1/t2;

    invoke-static {v5, v6, v4}, Llf0/o1;->e(Lld0/q;Lp1/c1;Lp1/t2;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lj72/m;

    check-cast v4, Lz1/p;

    invoke-static {v5, v6, v4}, Ll72/p;->e(Lkotlin/jvm/functions/Function1;Lj72/m;Lz1/p;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lj72/j;

    invoke-static {v5, v6, v4}, Ll72/o;->x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v5, Ll1/w3;

    check-cast v6, Lbc3/c0;

    check-cast v4, Ll1/w3;

    iget-object v0, v5, Ll1/w3;->e:Lm1/g;

    iget-object v0, v0, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    sget-object v3, Ll1/x3;->x:Ll1/x3;

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ll1/k2;

    const/4 v3, 0x6

    invoke-direct {v0, v4, v2, v3}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    invoke-static {v6, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_b
    check-cast v5, Li93/e;

    check-cast v6, Lf0/r1;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Lkk1/g;->f(Li93/e;Lf0/r1;Lp1/c1;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v5, Lkd0/c$g;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lny0/h;

    invoke-static {v5, v6, v4}, Lkf0/f;->u(Lkd0/c$g;Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v5, Lf0/r1;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Lkf0/f;->g(Lf0/r1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v5, Lit1/c$b;

    check-cast v6, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v4}, Ljt1/c;->j(Lit1/c$b;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v4, v6}, Ljp1/m;->e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lhp1/e;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Ljp1/h;->f(Lkotlin/jvm/functions/Function1;Lhp1/e;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v5, Lhp1/d;

    check-cast v6, Lcp1/d;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v4}, Ljp1/g;->d(Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lcom/whoop/navigation/models/GenericInteraction;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Ljg2/c;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v5, Lc93/a;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lis0/f;

    invoke-static {v5, v6, v4}, Lis0/x0;->h(Lc93/a;Lkotlin/jvm/functions/Function1;Lis0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v5, Lm91/w;

    check-cast v6, Lc93/a;

    check-cast v4, Lp1/a1;

    invoke-static {v5, v6, v4}, Lis0/j0;->o(Lm91/w;Lc93/a;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lio2/o0;

    check-cast v4, Lp1/c1;

    invoke-static {v5, v6, v4}, Lio2/m0;->b(Lkotlin/jvm/functions/Function1;Lio2/o0;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;

    check-cast v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    check-cast v4, Lio/getstream/chat/android/models/Poll;

    invoke-static {v5, v6, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;)V

    return-object v3

    :pswitch_17
    check-cast v5, Lio/getstream/chat/android/client/ChatClient;

    check-cast v6, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    check-cast v4, Lbc3/c0;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->Companion:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;

    invoke-static {v5, v6, v4}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryThreadsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v5, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;

    check-cast v6, Ljava/util/Map;

    check-cast v4, Ljava/util/Map;

    invoke-static {v5, v6, v4}, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->a(Lio/getstream/chat/android/client/notifications/ChatPushDelegate;Ljava/util/Map;Ljava/util/Map;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v5, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast v6, Ljava/lang/String;

    check-cast v4, Lio/getstream/chat/android/client/api/models/GetThreadOptions;

    invoke-static {v5, v6, v4}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->r(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/o;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v5, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast v6, Ljava/lang/String;

    check-cast v4, Ljava/lang/String;

    invoke-static {v5, v6, v4}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->h(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/lang/String;Ljava/lang/String;)Lo23/o;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v6, Ljava/lang/String;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-static {v4, v6, v5}, Lio/getstream/chat/android/client/ChatClient;->q(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v5, Lcom/whoop/home/view/HomeFragment;

    check-cast v6, Ljava/lang/String;

    check-cast v4, Lcom/whoop/navigation/AppScreen;

    invoke-static {v5, v6, v4}, Lcom/whoop/home/view/HomeFragment;->l0(Lcom/whoop/home/view/HomeFragment;Ljava/lang/String;Lcom/whoop/navigation/AppScreen;)Ll83/a0;

    move-result-object v0

    return-object v0

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
