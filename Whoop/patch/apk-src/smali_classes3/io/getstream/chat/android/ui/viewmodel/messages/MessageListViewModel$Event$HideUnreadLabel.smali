.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;
.super Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HideUnreadLabel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "navigateToFirstUnreadMessage",
        "",
        "<init>",
        "(Z)V",
        "getNavigateToFirstUnreadMessage",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
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
.field private final navigateToFirstUnreadMessage:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;-><init>(Z)V

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    return v0
.end method

.method public final copy(Z)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;-><init>(Z)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getNavigateToFirstUnreadMessage()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->navigateToFirstUnreadMessage:Z

    const-string v1, "HideUnreadLabel(navigateToFirstUnreadMessage="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
