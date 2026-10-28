.class public final Llive/hms/video/media/settings/HMSTrackSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/events/IAnalyticsPropertiesProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/settings/HMSTrackSettings$Builder;,
        Llive/hms/video/media/settings/HMSTrackSettings$InitState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B%\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0014j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0011H\u0016\u00a2\u0006\u0002\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "Llive/hms/video/events/IAnalyticsPropertiesProvider;",
        "videoSettings",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "audioSettings",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "simulcast",
        "",
        "<init>",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)V",
        "getVideoSettings",
        "()Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "getAudioSettings",
        "()Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "getSimulcast",
        "()Z",
        "toAnalyticsProperties",
        "Lkotlin/collections/HashMap;",
        "",
        "",
        "Ljava/util/HashMap;",
        "()Ljava/util/HashMap;",
        "InitState",
        "Builder",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

.field private final simulcast:Z

.field private final videoSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;


# direct methods
.method private constructor <init>(Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llive/hms/video/media/settings/HMSTrackSettings;->videoSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    .line 4
    iput-object p2, p0, Llive/hms/video/media/settings/HMSTrackSettings;->audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    .line 5
    iput-boolean p3, p0, Llive/hms/video/media/settings/HMSTrackSettings;->simulcast:Z

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/settings/HMSAudioTrackSettings;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/settings/HMSTrackSettings;-><init>(Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)V

    return-void
.end method


# virtual methods
.method public final getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSTrackSettings;->audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    return-object v0
.end method

.method public final getSimulcast()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSTrackSettings;->simulcast:Z

    return v0
.end method

.method public final getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSTrackSettings;->videoSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object v0
.end method

.method public toAnalyticsProperties()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/media/settings/HMSTrackSettings;->audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "audio_enabled"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/settings/HMSTrackSettings;->videoSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "video_enabled"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSTrackSettings;->audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->toAnalyticsProperties()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_2
    iget-object v1, p0, Llive/hms/video/media/settings/HMSTrackSettings;->videoSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->toAnalyticsProperties()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_3
    return-object v0
.end method
