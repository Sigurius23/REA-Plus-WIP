.class public final Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;",
        "",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "messageReceiptRepository",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "api",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V",
        "Ll83/a0;",
        "start",
        "()V",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "Lio/getstream/chat/android/client/api/ChatApi;",
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
.field private final api:Lio/getstream/chat/android/client/api/ChatApi;

.field private final logger$delegate:Ll83/h;

.field private final messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReceiptRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->api:Lio/getstream/chat/android/client/api/ChatApi;

    const-string p1, "Chat:MessageReceiptReporter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getApi$p(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lio/getstream/chat/android/client/api/ChatApi;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->api:Lio/getstream/chat/android/client/api/ChatApi;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMessageReceiptRepository$p(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final start()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Starting reporter\u2026"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
