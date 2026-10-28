.class public final synthetic Lio/getstream/chat/android/client/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/f;->x:Ljava/lang/String;

    iput p2, p0, Lio/getstream/chat/android/client/f;->z:I

    iput-object p3, p0, Lio/getstream/chat/android/client/f;->y:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/f;->x:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/f;->y:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/f;->z:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/f;->w:I

    iget v1, p0, Lio/getstream/chat/android/client/f;->z:I

    iget-object v2, p0, Lio/getstream/chat/android/client/f;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/f;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3, v2, v1}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->GetRepliesMoreIdentifier(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3, v1, v2}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->getNewerRepliesIdentifier(Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
