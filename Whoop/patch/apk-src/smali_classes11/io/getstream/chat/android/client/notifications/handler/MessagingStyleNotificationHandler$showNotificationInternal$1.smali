.class final Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->showNotificationInternal(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationHandler$showNotificationInternal$1"
    f = "MessagingStyleNotificationHandler.kt"
    l = {
        0x7b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

.field I$0:I

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;",
            "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->I$0:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-static {p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$getFactory(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createNotificationId$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result p1

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-static {v1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$getFactory(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    move-result-object v1

    iget-object v3, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    iput p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->label:I

    invoke-virtual {v1, v3, p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createNotification$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Landroid/app/Notification;

    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    instance-of v2, v1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    if-eqz v2, :cond_3

    check-cast v1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$trackChannelNotificationId(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$trackNotificationId(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;I)V

    :goto_1
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-static {v1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$getNotificationManager(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/app/NotificationManager;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;

    invoke-static {p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->access$getLogger(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Lb23/k;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;->$chatNotification:Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[showNotificationInternal] Failed to create notification for: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
