.class public final Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001fB=\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;",
        "",
        "name",
        "",
        "streamUrl",
        "quality",
        "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;",
        "streamKey",
        "layout",
        "Lio/getstream/android/video/generated/models/LayoutSettingsRequest;",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)V",
        "getLayout",
        "()Lio/getstream/android/video/generated/models/LayoutSettingsRequest;",
        "getName",
        "()Ljava/lang/String;",
        "getQuality",
        "()Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;",
        "getStreamKey",
        "getStreamUrl",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Quality",
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
.field private final layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

.field private final name:Ljava/lang/String;

.field private final quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

.field private final streamKey:Ljava/lang/String;

.field private final streamUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stream_url"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stream_key"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/LayoutSettingsRequest;
        .annotation runtime Lqx/q;
            name = "layout"
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/LayoutSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stream_url"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
        .annotation runtime Lqx/q;
            name = "quality"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stream_key"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/LayoutSettingsRequest;
        .annotation runtime Lqx/q;
            name = "layout"
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getLayout()Lio/getstream/android/video/generated/models/LayoutSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuality()Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    return-object v0
.end method

.method public final getStreamKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreamUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/LayoutSettingsRequest;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->name:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->quality:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->streamKey:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;->layout:Lio/getstream/android/video/generated/models/LayoutSettingsRequest;

    const-string v5, ", streamUrl="

    const-string v6, ", quality="

    const-string v7, "RTMPBroadcastRequest(name="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streamKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", layout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
