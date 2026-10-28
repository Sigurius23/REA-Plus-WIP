.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/b;
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

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->l(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->a(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->c(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Lec3/r1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
