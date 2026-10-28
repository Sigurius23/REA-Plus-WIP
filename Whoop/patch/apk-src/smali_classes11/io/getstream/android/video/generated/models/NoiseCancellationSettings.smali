.class public final Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/NoiseCancellationSettings;",
        "",
        "mode",
        "Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;",
        "(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;)V",
        "getMode",
        "()Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Mode",
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
.field private final mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/NoiseCancellationSettings;Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->copy(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;)Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;)Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;
        .annotation runtime Lqx/q;
            name = "mode"
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;-><init>(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMode()Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->mode:Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NoiseCancellationSettings(mode="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
