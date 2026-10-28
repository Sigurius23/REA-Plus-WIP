.class public final synthetic Lio/getstream/chat/android/ui/common/feature/messages/list/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final shouldAddDateSeparator(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->y(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)V

    :goto_0
    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->w(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->b(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->a(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
