.class public final Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ<\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;",
        "",
        "enabled",
        "",
        "defaultPin",
        "",
        "maxAttempts",
        "",
        "requiredPinDigits",
        "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "getDefaultPin",
        "()Ljava/lang/String;",
        "getEnabled",
        "()Z",
        "getMaxAttempts",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRequiredPinDigits",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final defaultPin:Ljava/lang/String;

.field private final enabled:Z

.field private final maxAttempts:Ljava/lang/Integer;

.field private final requiredPinDigits:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "default_pin"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_attempts"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "required_pin_digits"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;-><init>(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->copy(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "enabled"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "default_pin"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "max_attempts"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "required_pin_digits"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;-><init>(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDefaultPin()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    return v0
.end method

.method public final getMaxAttempts()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRequiredPinDigits()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

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

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->enabled:Z

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->defaultPin:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->maxAttempts:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;->requiredPinDigits:Ljava/lang/Integer;

    const-string v4, ", defaultPin="

    const-string v5, ", maxAttempts="

    const-string v6, "SIPPinProtectionConfigsResponse(enabled="

    invoke-static {v6, v4, v1, v5, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requiredPinDigits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
