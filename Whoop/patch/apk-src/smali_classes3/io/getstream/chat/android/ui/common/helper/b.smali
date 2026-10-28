.class public final synthetic Lio/getstream/chat/android/ui/common/helper/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/common/helper/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/helper/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/b;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->a(Landroid/content/Context;)Landroid/content/ClipboardManager;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;->a(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
