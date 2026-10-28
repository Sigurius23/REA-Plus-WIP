.class public final Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;",
        "",
        "enabled",
        "",
        "<init>",
        "(Z)V",
        "getEnabled",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final enabled:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;ZILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->copy(Z)Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    return v0
.end method

.method public final copy(Z)Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;->enabled:Z

    const-string v1, "TypingIndicatorsDto(enabled="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
