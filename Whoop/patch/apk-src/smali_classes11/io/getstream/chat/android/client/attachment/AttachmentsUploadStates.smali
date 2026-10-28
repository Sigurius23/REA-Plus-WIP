.class public final Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0003R.\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u00140\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "updateMessageAttachments",
        "(Lio/getstream/chat/android/models/Message;)V",
        "",
        "messageId",
        "Lec3/l;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "observeAttachments",
        "(Ljava/lang/String;)Lec3/l;",
        "removeMessageAttachmentsState",
        "(Ljava/lang/String;)V",
        "clearStates",
        "",
        "Lec3/p1;",
        "messagesStates",
        "Ljava/util/Map;",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

.field private static messagesStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lec3/p1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    sget-object v0, Lm83/z;->w:Lm83/z;

    sput-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final clearStates()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lm83/z;->w:Lm83/z;

    sput-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final observeAttachments(Ljava/lang/String;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast p1, Lec3/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final removeMessageAttachmentsState(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;

    invoke-static {p1, v0}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    sput-object p1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final updateMessageAttachments(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v0, Lec3/p1;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object v1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    invoke-direct {v2, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    sput-object p1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->messagesStates:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method
