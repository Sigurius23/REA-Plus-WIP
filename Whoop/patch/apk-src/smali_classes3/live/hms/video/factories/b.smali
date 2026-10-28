.class public final synthetic Llive/hms/video/factories/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Llive/hms/video/factories/HMSPeerConnectionFactory;

.field public final synthetic x:Llive/hms/video/media/settings/HMSTrackSettings;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/b;->w:Llive/hms/video/factories/HMSPeerConnectionFactory;

    iput-object p2, p0, Llive/hms/video/factories/b;->x:Llive/hms/video/media/settings/HMSTrackSettings;

    iput-boolean p3, p0, Llive/hms/video/factories/b;->y:Z

    iput-boolean p4, p0, Llive/hms/video/factories/b;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Llive/hms/video/factories/b;->y:Z

    iget-boolean v1, p0, Llive/hms/video/factories/b;->z:Z

    iget-object v2, p0, Llive/hms/video/factories/b;->w:Llive/hms/video/factories/HMSPeerConnectionFactory;

    iget-object v3, p0, Llive/hms/video/factories/b;->x:Llive/hms/video/media/settings/HMSTrackSettings;

    invoke-static {v2, v3, v0, v1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->b(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)Lhms/webrtc/PeerConnectionFactory;

    move-result-object v0

    return-object v0
.end method
