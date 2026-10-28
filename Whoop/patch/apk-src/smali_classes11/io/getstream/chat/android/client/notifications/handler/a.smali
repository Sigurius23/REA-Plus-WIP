.class public final synthetic Lio/getstream/chat/android/client/notifications/handler/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/notifications/handler/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/a;->x:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/notifications/handler/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/a;->x:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;

    invoke-static {v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->c(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/app/NotificationManager;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/a;->x:Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;

    invoke-static {v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->a(Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
