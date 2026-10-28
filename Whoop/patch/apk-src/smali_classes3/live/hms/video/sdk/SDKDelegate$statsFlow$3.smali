.class final Llive/hms/video/sdk/SDKDelegate$statsFlow$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;-><init>(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.SDKDelegate$statsFlow$3"
    f = "SDKDelegate.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$statsFlow$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;

    iget-object p2, p0, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;-><init>(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$statsFlow$3;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getWebrtcStatsMonitor$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->allowExtraStatsCollection(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
