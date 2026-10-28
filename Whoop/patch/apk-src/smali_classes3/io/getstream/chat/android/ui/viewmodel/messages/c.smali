.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-static {v2, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->completeRecording$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->lockRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->toggleCommandsVisibility()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->dismissSuggestionsPopup()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->stopRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->dismissMessageActions()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->startRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->cancelRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->toggleRecordingPlayback()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->cancelRecording()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_a
    const/4 v0, 0x0

    const/4 v1, 0x3

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-static {v2, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0

    :pswitch_b
    const/4 v0, 0x0

    const/4 v1, 0x3

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/c;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-static {v2, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
