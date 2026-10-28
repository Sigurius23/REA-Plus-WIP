.class public final synthetic Lio/getstream/chat/android/client/notifications/handler/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/notifications/handler/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/c;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/notifications/handler/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/c;->x:Landroid/content/Context;

    invoke-static {v0}, Lor2/u0;->b(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/c;->x:Landroid/content/Context;

    invoke-static {v0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->c(Landroid/content/Context;)Landroid/app/NotificationChannel;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
