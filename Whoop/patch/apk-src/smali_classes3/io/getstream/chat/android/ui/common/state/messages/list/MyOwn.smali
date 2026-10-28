.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;
.super Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "ts",
        "",
        "<init>",
        "(Ljava/lang/Long;)V",
        "getTs",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "component1",
        "copy",
        "(Ljava/lang/Long;)Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I


# instance fields
.field private final ts:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;Ljava/lang/Long;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;-><init>(Ljava/lang/Long;)V

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;)Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;-><init>(Ljava/lang/Long;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getTs()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;->ts:Ljava/lang/Long;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MyOwn(ts="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
