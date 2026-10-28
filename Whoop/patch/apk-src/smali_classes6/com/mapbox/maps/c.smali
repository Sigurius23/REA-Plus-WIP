.class public final synthetic Lcom/mapbox/maps/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    iput p4, p0, Lcom/mapbox/maps/c;->w:I

    iput-object p1, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/mapbox/maps/c;->x:I

    iput p3, p0, Lcom/mapbox/maps/c;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/mapbox/maps/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SurfaceViewRenderer;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Lorg/webrtc/SurfaceViewRenderer;->a(Lorg/webrtc/SurfaceViewRenderer;II)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Lorg/webrtc/SurfaceTextureHelper;->e(Lorg/webrtc/SurfaceTextureHelper;II)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/services/ScreenCapturerAndroidCustom;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->a(Llive/hms/video/services/ScreenCapturerAndroidCustom;II)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/common/VideoTrackManager;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Llive/hms/videoview/common/VideoTrackManager;->a(Llive/hms/videoview/common/VideoTrackManager;II)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/SurfaceViewRenderer;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Lhms/webrtc/SurfaceViewRenderer;->a(Lhms/webrtc/SurfaceViewRenderer;II)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Lhms/webrtc/SurfaceTextureHelper;->e(Lhms/webrtc/SurfaceTextureHelper;II)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lcom/mapbox/maps/c;->z:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapController;

    iget v1, p0, Lcom/mapbox/maps/c;->x:I

    iget v2, p0, Lcom/mapbox/maps/c;->y:I

    invoke-static {v0, v1, v2}, Lcom/mapbox/maps/MapController;->b(Lcom/mapbox/maps/MapController;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
