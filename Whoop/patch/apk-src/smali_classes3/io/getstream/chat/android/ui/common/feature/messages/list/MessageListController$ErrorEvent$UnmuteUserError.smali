.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;
.super Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UnmuteUserError"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;",
        "Ln23/e;",
        "streamError",
        "<init>",
        "(Ln23/e;)V",
        "component1",
        "()Ln23/e;",
        "copy",
        "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ln23/e;",
        "getStreamError",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final streamError:Ln23/e;


# direct methods
.method public constructor <init>(Ln23/e;)V
    .locals 1

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;-><init>(Ln23/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;Ln23/e;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->copy(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ln23/e;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    return-object v0
.end method

.method public final copy(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;
    .locals 1

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getStreamError()Ln23/e;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;->streamError:Ln23/e;

    const-string v1, "UnmuteUserError(streamError="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lhc3/i;->e(Ljava/lang/String;Ln23/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
