.class public final synthetic Laq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;I)V
    .locals 0

    iput p2, p0, Laq0/d;->w:I

    iput-object p1, p0, Laq0/d;->x:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laq0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/d;->x:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-static {v0}, Laq0/q;->W(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laq0/d;->x:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-static {v0}, Laq0/q;->V(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
