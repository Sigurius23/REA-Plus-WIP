.class public final synthetic Lio/getstream/chat/android/client/api/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/api/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/internal/a;->x:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/internal/a;->y:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/api/internal/a;->E:I

    iput-object p4, p0, Lio/getstream/chat/android/client/api/internal/a;->z:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/api/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/internal/a;->x:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/internal/a;->y:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/internal/a;->z:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/api/internal/a;->E:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/api/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/internal/a;->z:Ljava/lang/String;

    iget v1, p0, Lio/getstream/chat/android/client/api/internal/a;->E:I

    iget-object v2, p0, Lio/getstream/chat/android/client/api/internal/a;->x:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/internal/a;->y:Ljava/lang/String;

    invoke-static {v2, v3, v1, v0}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->h(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;ILjava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lio/getstream/chat/android/client/api/internal/a;->E:I

    iget-object v1, p0, Lio/getstream/chat/android/client/api/internal/a;->z:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/internal/a;->x:Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/internal/a;->y:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->b(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;ILjava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
