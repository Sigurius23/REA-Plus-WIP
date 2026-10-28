.class public final Lio/getstream/chat/android/client/transformer/ApiModelTransformers;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;",
        "",
        "outgoingMessageTransformer",
        "Lio/getstream/chat/android/models/MessageTransformer;",
        "incomingMessageTransformer",
        "incomingChannelTransformer",
        "Lio/getstream/chat/android/models/ChannelTransformer;",
        "outgoingUserTransformers",
        "Lio/getstream/chat/android/models/UserTransformer;",
        "incomingUserTransformer",
        "<init>",
        "(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;)V",
        "getOutgoingMessageTransformer",
        "()Lio/getstream/chat/android/models/MessageTransformer;",
        "getIncomingMessageTransformer",
        "getIncomingChannelTransformer",
        "()Lio/getstream/chat/android/models/ChannelTransformer;",
        "getOutgoingUserTransformers",
        "()Lio/getstream/chat/android/models/UserTransformer;",
        "getIncomingUserTransformer",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final incomingChannelTransformer:Lio/getstream/chat/android/models/ChannelTransformer;

.field private final incomingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

.field private final incomingUserTransformer:Lio/getstream/chat/android/models/UserTransformer;

.field private final outgoingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

.field private final outgoingUserTransformers:Lio/getstream/chat/android/models/UserTransformer;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;-><init>(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;)V
    .locals 1

    const-string v0, "outgoingMessageTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomingMessageTransformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomingChannelTransformer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outgoingUserTransformers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomingUserTransformer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->outgoingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingChannelTransformer:Lio/getstream/chat/android/models/ChannelTransformer;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->outgoingUserTransformers:Lio/getstream/chat/android/models/UserTransformer;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingUserTransformer:Lio/getstream/chat/android/models/UserTransformer;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 8
    sget-object p1, Lio/getstream/chat/android/models/NoOpMessageTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpMessageTransformer;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 9
    sget-object p2, Lio/getstream/chat/android/models/NoOpMessageTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpMessageTransformer;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 10
    sget-object p3, Lio/getstream/chat/android/models/NoOpChannelTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpChannelTransformer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 11
    sget-object p4, Lio/getstream/chat/android/models/NoOpUserTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpUserTransformer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 12
    sget-object p5, Lio/getstream/chat/android/models/NoOpUserTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpUserTransformer;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 13
    invoke-direct/range {p2 .. p7}, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;-><init>(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;)V

    return-void
.end method


# virtual methods
.method public final getIncomingChannelTransformer()Lio/getstream/chat/android/models/ChannelTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingChannelTransformer:Lio/getstream/chat/android/models/ChannelTransformer;

    return-object v0
.end method

.method public final getIncomingMessageTransformer()Lio/getstream/chat/android/models/MessageTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    return-object v0
.end method

.method public final getIncomingUserTransformer()Lio/getstream/chat/android/models/UserTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->incomingUserTransformer:Lio/getstream/chat/android/models/UserTransformer;

    return-object v0
.end method

.method public final getOutgoingMessageTransformer()Lio/getstream/chat/android/models/MessageTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->outgoingMessageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    return-object v0
.end method

.method public final getOutgoingUserTransformers()Lio/getstream/chat/android/models/UserTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;->outgoingUserTransformers:Lio/getstream/chat/android/models/UserTransformer;

    return-object v0
.end method
