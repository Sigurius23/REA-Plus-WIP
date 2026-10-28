.class public final synthetic Llive/hms/video/sdk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/sdk/a;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/SDKStore;

    check-cast p1, Llive/hms/video/signal/init/InitConfig;

    invoke-static {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->t(Llive/hms/video/sdk/SDKStore;Llive/hms/video/signal/init/InitConfig;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/RtcStatsObserverUseCase;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->e(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/sdk/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/RtcStatsObserverUseCase;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->c(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
