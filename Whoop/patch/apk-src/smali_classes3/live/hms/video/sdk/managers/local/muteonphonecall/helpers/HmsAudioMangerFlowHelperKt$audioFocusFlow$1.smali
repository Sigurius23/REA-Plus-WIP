.class final Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt;->audioFocusFlow(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1"
    f = "HmsAudioMangerFlowHelper.kt"
    l = {
        0x45
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field final synthetic $audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

.field final synthetic $this_audioFocusFlow:Llive/hms/video/audio/HMSAudioManager;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/events/AnalyticsEventsService;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager;",
            "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$this_audioFocusFlow:Llive/hms/video/audio/HMSAudioManager;

    iput-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iput-object p3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->invokeSuspend$lambda$0(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Llive/hms/video/audio/HMSAudioManager;->removeAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$this_audioFocusFlow:Llive/hms/video/audio/HMSAudioManager;

    iget-object v2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iget-object v3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-direct {v0, v1, v2, v3, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;-><init>(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/events/AnalyticsEventsService;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;

    iget-object v3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$audioSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iget-object v4, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-direct {v1, p1, v3, v4}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;-><init>(Ldc3/u;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V

    iget-object v3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$this_audioFocusFlow:Llive/hms/video/audio/HMSAudioManager;

    invoke-interface {v3, v1}, Llive/hms/video/audio/HMSAudioManager;->addAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V

    iget-object v3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->$this_audioFocusFlow:Llive/hms/video/audio/HMSAudioManager;

    new-instance v4, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;

    invoke-direct {v4, v3, v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;-><init>(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)V

    iput v2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->label:I

    invoke-static {p1, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
