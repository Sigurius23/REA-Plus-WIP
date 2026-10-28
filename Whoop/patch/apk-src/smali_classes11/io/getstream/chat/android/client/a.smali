.class public final synthetic Lio/getstream/chat/android/client/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/a;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/client/a;->x:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/a;->y:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/a;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/a;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/client/a;->z:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/a;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/a;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    const-string v0, "typing.stop"

    invoke-static {v0, v3, v2, v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->SendEventIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    const-string v0, "typing.start"

    invoke-static {v0, v3, v2, v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->SendEventIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :pswitch_1
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3, v2, v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->DeleteReactionIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
