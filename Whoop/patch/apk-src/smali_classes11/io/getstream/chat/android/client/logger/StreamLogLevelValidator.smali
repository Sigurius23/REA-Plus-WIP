.class public final Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb23/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/logger/StreamLogLevelValidator$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;",
        "Lb23/e;",
        "Lio/getstream/chat/android/client/logger/ChatLogLevel;",
        "logLevel",
        "<init>",
        "(Lio/getstream/chat/android/client/logger/ChatLogLevel;)V",
        "Lb23/g;",
        "priority",
        "",
        "tag",
        "",
        "isLoggable",
        "(Lb23/g;Ljava/lang/String;)Z",
        "Lio/getstream/chat/android/client/logger/ChatLogLevel;",
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
.field private final logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/logger/ChatLogLevel;)V
    .locals 1

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    return-void
.end method


# virtual methods
.method public final isLoggable(Lb23/g;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Lb23/g;->w:I

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    sget-object v0, Lio/getstream/chat/android/client/logger/StreamLogLevelValidator$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v1, 0x2

    if-eq p2, v1, :cond_3

    const/4 v1, 0x3

    if-eq p2, v1, :cond_2

    const/4 v1, 0x4

    const/4 v2, 0x5

    if-eq p2, v1, :cond_1

    if-ne p2, v2, :cond_0

    sget-object p2, Lb23/g;->x:Lb23/g;

    const/4 p2, 0x6

    if-lt p1, p2, :cond_4

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p2, Lb23/g;->x:Lb23/g;

    if-lt p1, v2, :cond_4

    goto :goto_0

    :cond_2
    sget-object p2, Lb23/g;->x:Lb23/g;

    if-lt p1, v1, :cond_4

    :cond_3
    :goto_0
    return v0

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
