.class public final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;",
        "Lic/x;",
        "toNetworkType",
        "(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lic/x;",
        "Landroid/content/Context;",
        "context",
        "",
        "channelType",
        "channelId",
        "messageId",
        "networkType",
        "Ljava/util/UUID;",
        "start",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Ljava/util/UUID;",
        "workId",
        "Ll83/a0;",
        "stop",
        "(Landroid/content/Context;Ljava/util/UUID;)V",
        "TAG",
        "Ljava/lang/String;",
        "DATA_MESSAGE_ID",
        "DATA_CHANNEL_TYPE",
        "DATA_CHANNEL_ID",
        "ERROR_KEY",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toNetworkType(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lic/x;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/x;->E:Lic/x;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/x;->z:Lic/x;

    return-object p1

    :cond_2
    sget-object p1, Lic/x;->y:Lic/x;

    return-object p1

    :cond_3
    sget-object p1, Lic/x;->x:Lic/x;

    return-object p1
.end method


# virtual methods
.method public final start(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Ljava/util/UUID;
    .locals 20

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "context"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "channelType"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "channelId"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "messageId"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "networkType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lic/z;

    const-class v6, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;

    invoke-direct {v4, v6}, Lic/q0;-><init>(Ljava/lang/Class;)V

    new-instance v6, Lrc/e;

    sget-object v6, Lic/x;->w:Lic/x;

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v7, p0

    invoke-direct {v7, v3}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;->toNetworkType(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lic/x;

    move-result-object v10

    new-instance v9, Lrc/e;

    const/4 v3, 0x0

    invoke-direct {v9, v3}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v6}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v19

    new-instance v8, Lic/e;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, -0x1

    move-wide/from16 v17, v15

    invoke-direct/range {v8 .. v19}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    invoke-virtual {v4, v8}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v4

    check-cast v4, Lic/z;

    new-instance v6, Ll83/k;

    const-string v8, "channel_id"

    invoke-direct {v6, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v9, "channel_type"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v9, "message_id"

    invoke-direct {v0, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v8, v0}, [Ll83/k;

    move-result-object v0

    new-instance v6, Lb0/b;

    const/4 v8, 0x1

    invoke-direct {v6, v8}, Lb0/b;-><init>(I)V

    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x3

    if-ge v8, v9, :cond_0

    aget-object v9, v0, v8

    iget-object v10, v9, Ll83/k;->w:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v6, v9, v10}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lb0/b;->b()Lic/g;

    move-result-object v0

    invoke-virtual {v4, v0}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    sget-object v4, Lb23/g;->y:Lb23/g;

    sget-object v6, Lb23/i;->a:Lb23/i;

    sget-object v6, Lb23/i;->d:Lb23/e;

    const-string v8, "Chat:SystemUploadWorker"

    invoke-interface {v6, v4, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, Lb23/i;->c:Lb23/j;

    const-string v9, "[start] #uploader; Enqueueing attachments upload work for "

    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v4, v8, v9, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-static {v5}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v3

    invoke-virtual/range {p3 .. p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lic/l;->x:Lic/l;

    invoke-virtual {v3, v1, v2, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    iget-object v0, v0, Lic/r0;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public final stop(Landroid/content/Context;Ljava/util/UUID;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/g;->y:Lb23/g;

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    const-string v2, "Chat:SystemUploadWorker"

    invoke-interface {v1, v0, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[stop] #uploader; upload attachments work cancelled"

    const/4 v4, 0x0

    invoke-interface {v1, v0, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljc/v;->f(Ljava/util/UUID;)Lic/f0;

    return-void
.end method
