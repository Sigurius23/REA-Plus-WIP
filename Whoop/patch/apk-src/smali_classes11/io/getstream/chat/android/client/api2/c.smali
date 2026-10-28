.class public final synthetic Lio/getstream/chat/android/client/api2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/api2/mapping/EventMapping;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api2/mapping/EventMapping;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/api2/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/c;->x:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/c;->x:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/SyncHistoryResponse;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->M(Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/model/response/SyncHistoryResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/c;->x:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/EventResponse;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->i0(Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/model/response/EventResponse;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
