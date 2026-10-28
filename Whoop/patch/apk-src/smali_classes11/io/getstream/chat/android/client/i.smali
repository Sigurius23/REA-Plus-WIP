.class public final synthetic Lio/getstream/chat/android/client/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/i;->x:I

    iput-object p2, p0, Lio/getstream/chat/android/client/i;->y:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/i;->y:Ljava/lang/String;

    iput p2, p0, Lio/getstream/chat/android/client/i;->x:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/i;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/client/i;->y:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/i;->x:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Command completed with nonzero exit code "

    const-string v3, ": "

    invoke-static {v2, v0, v3, v1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v1, v2}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->GetRepliesIdentifier(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
