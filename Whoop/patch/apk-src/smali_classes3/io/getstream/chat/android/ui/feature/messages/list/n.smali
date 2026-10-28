.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->z(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->X0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/n;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->f(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
