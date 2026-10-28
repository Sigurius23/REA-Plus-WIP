.class public final Lio/getstream/chat/android/models/PendingMessage$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/PendingMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u001a\u0010\r\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/models/PendingMessage$Builder;",
        "",
        "<init>",
        "()V",
        "pendingMessage",
        "Lio/getstream/chat/android/models/PendingMessage;",
        "(Lio/getstream/chat/android/models/PendingMessage;)V",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "metadata",
        "",
        "",
        "withMessage",
        "withMetadata",
        "build",
        "stream-chat-android-core"
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
.field private message:Lio/getstream/chat/android/models/Message;

.field private metadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 53

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Lio/getstream/chat/android/models/Message;

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const/16 v21, 0x0

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

    const/16 v50, -0x1

    invoke-direct/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lio/getstream/chat/android/models/PendingMessage$Builder;->message:Lio/getstream/chat/android/models/Message;

    .line 3
    sget-object v1, Lm83/z;->w:Lm83/z;

    iput-object v1, v0, Lio/getstream/chat/android/models/PendingMessage$Builder;->metadata:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/PendingMessage;)V
    .locals 1

    const-string v0, "pendingMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lio/getstream/chat/android/models/PendingMessage$Builder;-><init>()V

    .line 5
    invoke-virtual {p1}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->message:Lio/getstream/chat/android/models/Message;

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/models/PendingMessage;->getMetadata()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->metadata:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/PendingMessage;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/PendingMessage;

    iget-object v1, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->message:Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->metadata:Ljava/util/Map;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/models/PendingMessage;-><init>(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V

    return-object v0
.end method

.method public final withMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/PendingMessage$Builder;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->message:Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public final withMetadata(Ljava/util/Map;)Lio/getstream/chat/android/models/PendingMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/PendingMessage$Builder;"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/PendingMessage$Builder;->metadata:Ljava/util/Map;

    return-object p0
.end method
