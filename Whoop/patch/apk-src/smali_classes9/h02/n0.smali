.class public final synthetic Lh02/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lh02/n0;->w:I

    iput-object p1, p0, Lh02/n0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lh02/n0;->w:I

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lh02/n0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;->a(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;)V

    return-object v2

    :pswitch_0
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->c(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;)V

    return-object v2

    :pswitch_1
    check-cast v3, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->A(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v3, Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getMessageReceiptManager$stream_chat_android_client_release()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-static {v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->a(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;)Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->d(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/w1;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v3, Lio/getstream/chat/android/models/Message;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->UpdateMessageIdentifier(Lio/getstream/chat/android/models/Message;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v3, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->QueryChannelsIdentifier(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v3, Lio/getstream/chat/android/models/User;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->ConnectUserIdentifier(Lio/getstream/chat/android/models/User;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v3, Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;

    invoke-static {v3}, Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;->y(Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v3, Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;

    invoke-static {v3}, Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;->y(Lcom/whoop/advancedlabsjoin/feature/updatetests/view/UpdateTestsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v3, Lbf/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Business metric \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Lbf/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' will be skipped due to length being > 2. This is likely a bug. Please raise an issue at https://github.com/awslabs/aws-sdk-kotlin/issues/new/choose"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v3, Lgd0/c$e;

    invoke-static {v3}, Lid0/c;->e(Lgd0/c$e;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v3, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;

    invoke-static {v3}, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;->z(Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v3, Lcom/whoop/settings/email/EditEmailFragment;

    invoke-static {v3}, Lcom/whoop/settings/email/EditEmailFragment;->y(Lcom/whoop/settings/email/EditEmailFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v3, Landroid/app/Activity;

    invoke-static {v3}, Lia2/b;->e(Landroid/app/Activity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v3, Li31/g;

    invoke-static {v3}, Li31/h;->c(Li31/g;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v3, Li20/j1;

    iget-object v0, v3, Li20/j1;->x:Li20/k1;

    invoke-static {v0}, Li20/l1;->k(Li20/k1;)V

    return-object v2

    :pswitch_11
    check-cast v3, Li20/v0;

    iget-object v0, v3, Li20/v0;->I:Lg40/f3;

    const-string v4, ""

    invoke-virtual {v0, v4}, Lg40/f3;->s(Ljava/lang/String;)V

    iget-object v0, v3, Li20/v0;->z:Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-object v2

    :pswitch_12
    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lhk0/m;->Y(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v3, Lhj0/o;

    invoke-static {v3}, Lhj0/o;->g(Lhj0/o;)Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v3, Lcom/whoop/settings/debug/QnaFormDebugFragment;

    invoke-static {v3}, Lcom/whoop/settings/debug/QnaFormDebugFragment;->y(Lcom/whoop/settings/debug/QnaFormDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v3, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;

    invoke-static {v3}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->y(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v3, Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;

    invoke-static {v3}, Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;->y(Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v3, Lh40/d;

    iget-object v0, v3, Lh40/d;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :pswitch_18
    check-cast v3, Lh20/z4;

    iget-object v0, v3, Lh20/z4;->a:Ljava/lang/Object;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lv00/c0;->H:Lw30/c;

    :cond_0
    instance-of v0, v1, Lw30/a;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v3, Lh20/k4;

    iget-object v0, v3, Lh20/k4;->i0:Lec3/w1;

    new-instance v1, Lh20/z3;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lh20/z3;-><init>(Z)V

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-object v2

    :pswitch_1a
    check-cast v3, Lh20/l1;

    iget-object v0, v3, Lh20/l1;->F:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v3, La00/g;

    iget-object v0, v3, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "DefaultPrefsRepository"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v3, Lh02/p0;

    invoke-static {v3}, Lh02/o0;->b(Lh02/p0;)Lp1/c1;

    move-result-object v0

    return-object v0

    nop

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
