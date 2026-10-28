.class public final synthetic Llive/hms/videoview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/videoview/HMSVideoView;


# direct methods
.method public synthetic constructor <init>(Llive/hms/videoview/HMSVideoView;I)V
    .locals 0

    iput p2, p0, Llive/hms/videoview/a;->w:I

    iput-object p1, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/videoview/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-static {v0}, Llive/hms/videoview/HMSVideoView;->f(Llive/hms/videoview/HMSVideoView;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-static {v0}, Llive/hms/videoview/HMSVideoView;->e(Llive/hms/videoview/HMSVideoView;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-static {v0}, Llive/hms/videoview/HMSVideoView;->d(Llive/hms/videoview/HMSVideoView;)Lhms/webrtc/VideoSink;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-static {v0}, Llive/hms/videoview/HMSVideoView;->g(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/ZoomPanManager;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Llive/hms/videoview/a;->x:Llive/hms/videoview/HMSVideoView;

    invoke-static {v0}, Llive/hms/videoview/HMSVideoView;->c(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
