.class public final synthetic Lio/getstream/chat/android/client/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/d;->x:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/d;->x:Lio/getstream/chat/android/client/ChatClient;

    check-cast p1, Lio/getstream/chat/android/client/ChatEventListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->b(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/d;->x:Lio/getstream/chat/android/client/ChatClient;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->f(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
