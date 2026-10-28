.class public final synthetic Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/ChatEventListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/ChatEventListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->p(Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->e(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->a(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
