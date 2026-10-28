.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->C(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Channel;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    check-cast p1, Lio/getstream/chat/android/models/Member;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->B(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Member;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
