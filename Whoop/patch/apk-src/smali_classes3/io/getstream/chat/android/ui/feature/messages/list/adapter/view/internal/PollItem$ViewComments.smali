.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewComments"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
        "count",
        "",
        "<init>",
        "(I)V",
        "getCount",
        "()I",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "stream-chat-android-ui-components_release"
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
.field private final count:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;IILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;-><init>(I)V

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    return v0
.end method

.method public final copy(I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;-><init>(I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    iget p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;->count:I

    const-string v1, "ViewComments(count="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
