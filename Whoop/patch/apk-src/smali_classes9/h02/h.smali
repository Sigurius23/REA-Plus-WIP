.class public final synthetic Lh02/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh02/h;->w:I

    iput-object p2, p0, Lh02/h;->x:Ljava/lang/Object;

    iput-object p3, p0, Lh02/h;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lh02/h;->w:I

    iput-object p1, p0, Lh02/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh02/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh02/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->c(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ltb/a;

    check-cast p1, La0/g;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->a(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;La0/g;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->f(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->b(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->c(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->E(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->a(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ltb/a;

    check-cast p1, La0/g;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->g(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;La0/g;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->i(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->h(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->f(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/ChatClient;->r(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhh2/f;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lih2/b;->m(Lhh2/f;Lc93/m;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Leh2/a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lih2/b;->g(Lc93/m;Leh2/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lfd0/b;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lgd0/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;->B(Lfd0/b;Ll83/h;Lgd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lic2/a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lic2/f;->h(Lc93/m;Lic2/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, v0, Li20/j1;->O:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->b(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhy0/n1;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lhy0/i1;->a(Lhy0/n1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    check-cast p1, Lu0/p0;

    invoke-static {v0, v1, p1}, Lhy0/v0;->f(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhy0/r;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Error;

    invoke-static {v0, v1, p1}, Lhy0/n;->l(Lhy0/r;Lp1/c1;Lcoil/compose/AsyncImagePainter$State$Error;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhv2/k$c;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lhv2/i;->u(Lhv2/k$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhv2/a;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lgv2/a;

    invoke-static {v0, v1, p1}, Lhv2/i;->c(Lhv2/a;Ll83/h;Lgv2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lhh2/g;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stealthmode/view/StealthModeFragment;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, p1}, Lcom/whoop/stealthmode/view/StealthModeFragment;->G(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v1, Lge2/f$b;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lhe2/h;->b(Lkotlin/jvm/functions/Function1;Lge2/f$b;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/myaccount/MyAccountFragment;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/remote/domain/response/growth/AffiliateType;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/whoop/settings/myaccount/MyAccountFragment;->Q(Lcom/whoop/settings/myaccount/MyAccountFragment;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lh61/a;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, v1, p1}, Lh71/g;->g(Lh61/a;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lf60/c$c;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, p1}, Lh60/g;->b(Lf60/c$c;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1, p1}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->y(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lh02/h;->x:Ljava/lang/Object;

    check-cast v0, Lb02/a;

    iget-object v1, p0, Lh02/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lh02/j;->b(Lb02/a;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

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
