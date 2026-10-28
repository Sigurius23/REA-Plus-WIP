.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->B(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "thread_load_older_to_newer"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "show_header"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "message_id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "theme_res_id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/d;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->C(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
