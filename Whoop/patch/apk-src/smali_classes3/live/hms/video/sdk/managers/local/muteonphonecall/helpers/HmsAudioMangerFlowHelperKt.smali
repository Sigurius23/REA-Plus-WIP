.class public final Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/audio/HMSAudioManager;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "audioSettings",
        "Lec3/l;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "audioFocusFlow",
        "(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;)Lec3/l;",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final audioFocusFlow(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager;",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;-><init>(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/events/AnalyticsEventsService;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    return-object p0
.end method
