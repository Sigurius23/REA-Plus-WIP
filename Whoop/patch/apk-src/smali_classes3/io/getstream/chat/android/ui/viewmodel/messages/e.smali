.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->setAlsoSendToChannel(Z)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->d(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->pauseRecording()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    check-cast p1, Lio/getstream/chat/android/models/CreatePollParams;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->b(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/CreatePollParams;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->c(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Command;)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->a(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/User;)V

    goto :goto_0

    :pswitch_5
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/e;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->seekRecordingTo(F)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
