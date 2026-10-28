.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->A(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->D(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
