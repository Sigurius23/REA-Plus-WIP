.class public final Lio/getstream/chat/android/client/attachment/AttachmentsSender;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ.\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J.\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J.\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ6\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0080@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010!\u001a\u00020\u0019\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010%R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\'R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010+R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/AttachmentsSender;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;",
        "networkType",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;",
        "verifier",
        "<init>",
        "(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "channelType",
        "channelId",
        "Ln23/h;",
        "retryMessage",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "uploadAttachments",
        "newMessage",
        "waitForAttachmentsToBeSent",
        "Ll83/a0;",
        "enqueueAttachmentUpload",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "isRetrying",
        "sendAttachments$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "sendAttachments",
        "cancelJobs",
        "()V",
        "Landroid/content/Context;",
        "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;",
        "",
        "Lbc3/k1;",
        "jobsMap",
        "Ljava/util/Map;",
        "",
        "Ljava/util/UUID;",
        "uploadIds",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final context:Landroid/content/Context;

.field private jobsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lbc3/k1;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final networkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

.field private final scope:Lbc3/c0;

.field private final uploadIds:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final verifier:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verifier"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->networkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->scope:Lbc3/c0;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->verifier:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

    .line 7
    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadIds:Ljava/util/Map;

    .line 9
    const-string p1, "Chat:AttachmentsSender"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 10
    sget-object p5, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;-><init>(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;)V

    return-void
.end method

.method public static final synthetic access$getJobsMap$p(Lio/getstream/chat/android/client/attachment/AttachmentsSender;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    return-object p0
.end method

.method public static final access$retryMessage(Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$uploadAttachments(Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$waitForAttachmentsToBeSent(Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->waitForAttachmentsToBeSent(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final enqueueAttachmentUpload(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    sget-object v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;->Companion:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->networkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;->start(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Ljava/util/UUID;

    move-result-object p2

    iget-object p3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadIds:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final retryMessage(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->waitForAttachmentsToBeSent(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->enqueueAttachmentUpload(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object p2

    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object p3

    sget-object p4, Lb23/g;->y:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, p4, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object p3

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[uploadAttachments] Chat is offline, not sending message with id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, p4, p2, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p2, Ln23/f;

    new-instance p3, Ln23/a;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Chat is offline, not sending message with id "

    const-string v1, " and text "

    invoke-static {v0, p4, v1, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Ln23/f;-><init>(Ln23/e;)V

    return-object p2
.end method

.method private final waitForAttachmentsToBeSent(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v1, p1

    move-object/from16 v0, p4

    instance-of v2, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;

    iget v3, v2, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v3, v5

    if-eqz v6, :cond_0

    sub-int/2addr v3, v5

    iput v3, v2, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->label:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;

    invoke-direct {v2, v4, v0}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;-><init>(Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->label:I

    const/4 v8, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v8, :cond_1

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/b0;

    iget-object v3, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v57, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, v57

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    const/4 v9, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0, v9}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    new-instance v3, Lkotlin/jvm/internal/b0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->updateMessageAttachments(Lio/getstream/chat/android/models/Message;)V

    iget-object v10, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->scope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;-><init>(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v12, v9, v9, v0, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    new-instance v5, Ll83/k;

    invoke-direct {v5, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    invoke-direct/range {p0 .. p3}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->enqueueAttachmentUpload(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_4

    iput-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$0:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$1:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$2:Ljava/lang/Object;

    iput-object v3, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$3:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->L$4:Ljava/lang/Object;

    iput v8, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$1;->label:I

    invoke-interface {v0, v6}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    return-object v7

    :cond_4
    :goto_2
    iget-boolean v0, v3, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_6

    invoke-direct {v4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    const-string v7, "[waitForAttachmentsToBeSent] All attachments for message "

    const-string v8, " uploaded"

    invoke-static {v7, v6, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v5, v0, v6}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    new-instance v0, Ln23/g;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/models/Message;

    const v55, 0xffff

    const/16 v56, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-string v21, "regular"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v54, -0x8001

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-direct {v0, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-direct {v4}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[waitForAttachmentsToBeSent] Could not upload attachments for message "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v0, v5}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    new-instance v0, Ln23/f;

    new-instance v2, Ln23/a;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Could not upload attachments, not sending message with id "

    invoke-static {v5, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ln23/f;-><init>(Ln23/e;)V

    :goto_3
    sget-object v2, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->removeMessageAttachmentsState(Ljava/lang/String;)V

    iget-object v2, v4, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadIds:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final cancelJobs()V
    .locals 4

    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->clearStates()V

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->jobsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadIds:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/UUID;

    sget-object v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;->Companion:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;

    iget-object v3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->context:Landroid/content/Context;

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;->stop(Landroid/content/Context;Ljava/util/UUID;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final sendAttachments$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    instance-of v6, v5, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;

    iget v7, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->label:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;

    invoke-direct {v6, v0, v5}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;-><init>(Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lq83/d;)V

    :goto_0
    iget-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->label:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v10, :cond_2

    if-ne v8, v9, :cond_1

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v5, 0x0

    if-nez v4, :cond_8

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->hasPendingAttachments(Lio/getstream/chat/android/models/Message;)Z

    move-result v8

    const-string v9, "[sendAttachments] Message "

    if-eqz v8, :cond_6

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object v8

    invoke-virtual {v8}, Lb23/k;->c()Lb23/e;

    move-result-object v11

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v8}, Lb23/k;->a()Lb23/j;

    move-result-object v11

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    const-string v15, " has "

    const-string v10, " pending attachments"

    invoke-static {v14, v9, v13, v15, v10}, Ldc/b;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v11, v12, v8, v9}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$2:Ljava/lang/Object;

    iput-boolean v4, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->Z$0:Z

    const/4 v4, 0x1

    iput v4, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->label:I

    invoke-direct {v0, v1, v2, v3, v6}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast v5, Ln23/h;

    goto :goto_4

    :cond_6
    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v6, " without attachments"

    invoke-static {v9, v5, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v2, v5}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    new-instance v5, Ln23/g;

    invoke-direct {v5, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->getLogger()Lb23/k;

    move-result-object v8

    invoke-virtual {v8}, Lb23/k;->c()Lb23/e;

    move-result-object v10

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v11, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v8}, Lb23/k;->a()Lb23/j;

    move-result-object v10

    invoke-virtual {v8}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "[sendAttachments] Retrying Message "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v11, v8, v12}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->L$2:Ljava/lang/Object;

    iput-boolean v4, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->Z$0:Z

    iput v9, v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender$sendAttachments$1;->label:I

    invoke-direct {v0, v1, v2, v3, v6}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->uploadAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_a

    :goto_2
    return-object v7

    :cond_a
    :goto_3
    check-cast v5, Ln23/h;

    :goto_4
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->verifier:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->verifyAttachments$stream_chat_android_client_release(Ln23/h;)Ln23/h;

    move-result-object v1

    return-object v1
.end method
