.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;
.super Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShadowBanUser"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "reason",
        "",
        "timeout",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getReason",
        "()Ljava/lang/String;",
        "getTimeout",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final reason:Ljava/lang/String;

.field private final timeout:Ljava/lang/Integer;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;-><init>(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->copy(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;-><init>(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeout()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->user:Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->reason:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->timeout:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ShadowBanUser(user="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reason="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeout="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
