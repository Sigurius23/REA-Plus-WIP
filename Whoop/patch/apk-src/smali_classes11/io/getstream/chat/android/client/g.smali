.class public final synthetic Lio/getstream/chat/android/client/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/models/Device;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Device;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/g;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/g;->x:Lio/getstream/chat/android/models/Device;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/g;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/client/g;->x:Lio/getstream/chat/android/models/Device;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->DeleteDeviceIdentifier(Lio/getstream/chat/android/models/Device;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->AddDeviceIdentifier(Lio/getstream/chat/android/models/Device;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
