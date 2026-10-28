.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/b;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/b;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->F(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/b;->x:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->D(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
