.class final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase"
    f = "SendMessageListenerDatabase.kt"
    l = {
        0x3a,
        0x3d,
        0x3e
    }
    m = "onMessageSendResult"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->this$0:Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->this$0:Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
