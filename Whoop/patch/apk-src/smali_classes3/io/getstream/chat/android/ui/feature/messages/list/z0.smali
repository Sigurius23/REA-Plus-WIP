.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

.field public final synthetic y:Lio/getstream/chat/android/models/Message;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->y:Lio/getstream/chat/android/models/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->C(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/z0;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->U0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
