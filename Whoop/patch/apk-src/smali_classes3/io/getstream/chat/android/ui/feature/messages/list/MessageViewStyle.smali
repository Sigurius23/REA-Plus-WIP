.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        ">",
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u000c\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0008J,\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;",
        "T",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "own",
        "theirs",
        "<init>",
        "(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)V",
        "getOwn",
        "()Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "getTheirs",
        "component1",
        "component2",
        "copy",
        "(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;",
        "equals",
        "",
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
.field private final own:Lio/getstream/chat/android/ui/helper/ViewStyle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;-><init>(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)V

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/ui/helper/ViewStyle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/helper/ViewStyle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;-><init>(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOwn()Lio/getstream/chat/android/ui/helper/ViewStyle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    return-object v0
.end method

.method public final getTheirs()Lio/getstream/chat/android/ui/helper/ViewStyle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->own:Lio/getstream/chat/android/ui/helper/ViewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;->theirs:Lio/getstream/chat/android/ui/helper/ViewStyle;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MessageViewStyle(own="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", theirs="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
