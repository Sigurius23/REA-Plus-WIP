.class public final synthetic Lio/getstream/chat/android/ui/common/utils/extensions/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/common/utils/extensions/a;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lad3/g;

    invoke-static {p1}, Lio0/a0;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ln23/h;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;->a(Ln23/h;)V

    return-object v1

    :pswitch_1
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->b(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->a(Lbc3/k1;)Lbc3/e2;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lyb3/k;

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->a(Lyb3/k;)Li93/j;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->a(Landroidx/constraintlayout/widget/p;)V

    return-object v1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->a(Lio/getstream/chat/android/models/Message;)V

    return-object v1

    :pswitch_6
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->w:I

    return-object v1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->k0(Lio/getstream/chat/android/models/Command;)V

    return-object v1

    :pswitch_a
    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->z(Lio/getstream/chat/android/models/User;)V

    return-object v1

    :pswitch_b
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->s(Lio/getstream/chat/android/models/Attachment;)V

    return-object v1

    :pswitch_c
    check-cast p1, Lio/getstream/chat/android/models/CreatePollParams;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->H(Lio/getstream/chat/android/models/CreatePollParams;)V

    return-object v1

    :pswitch_d
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->p(Ljava/util/List;)V

    return-object v1

    :pswitch_e
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->w:I

    return-object v1

    :pswitch_f
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->a0(Ljava/lang/String;)V

    return-object v1

    :pswitch_10
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1

    :pswitch_11
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->a(Ljava/util/Map$Entry;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;->b(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;->a(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->e(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->g(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/d;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->d(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->h(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->b(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/c;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->k(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->d(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lc93/a;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->c(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->a(Ljava/lang/String;)Ljava/lang/String;

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
