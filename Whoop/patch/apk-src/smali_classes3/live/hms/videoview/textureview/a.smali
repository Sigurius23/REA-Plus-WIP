.class public final synthetic Llive/hms/videoview/textureview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/videoview/textureview/HMSTextureRenderer;


# direct methods
.method public synthetic constructor <init>(Llive/hms/videoview/textureview/HMSTextureRenderer;I)V
    .locals 0

    iput p2, p0, Llive/hms/videoview/textureview/a;->w:I

    iput-object p1, p0, Llive/hms/videoview/textureview/a;->x:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/videoview/textureview/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/videoview/textureview/a;->x:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-static {v0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->b(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/videoview/textureview/a;->x:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-static {v0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->e(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/videoview/textureview/a;->x:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-static {v0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->c(Llive/hms/videoview/textureview/HMSTextureRenderer;)Lhms/webrtc/VideoSink;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llive/hms/videoview/textureview/a;->x:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-static {v0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->d(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
