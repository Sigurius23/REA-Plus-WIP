.class public final enum Lb33/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb33/f;


# static fields
.field public static final enum E:Lb33/d;

.field public static final enum F:Lb33/d;

.field public static final enum G:Lb33/d;

.field public static final synthetic H:[Lb33/d;

.field public static final enum x:Lb33/d;

.field public static final enum y:Lb33/d;

.field public static final enum z:Lb33/d;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lb33/d;

    const/4 v1, 0x0

    const-string v2, "JoinInitiated"

    const-string v3, "JOIN_INITIATED"

    invoke-direct {v0, v3, v1, v2}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb33/d;->x:Lb33/d;

    new-instance v1, Lb33/d;

    const/4 v2, 0x1

    const-string v3, "CoordinatorJoin"

    const-string v4, "COORDINATOR_JOIN"

    invoke-direct {v1, v4, v2, v3}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb33/d;->y:Lb33/d;

    new-instance v2, Lb33/d;

    const/4 v3, 0x2

    const-string v4, "WSJoin"

    const-string v5, "WS_JOIN"

    invoke-direct {v2, v5, v3, v4}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lb33/d;->z:Lb33/d;

    new-instance v3, Lb33/d;

    const/4 v4, 0x3

    const-string v5, "PeerConnectionConnect"

    const-string v6, "PEER_CONNECTION_CONNECT"

    invoke-direct {v3, v6, v4, v5}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lb33/d;->E:Lb33/d;

    new-instance v4, Lb33/d;

    const/4 v5, 0x4

    const-string v6, "FirstAudioFrame"

    const-string v7, "FIRST_AUDIO_FRAME_RENDERED"

    invoke-direct {v4, v7, v5, v6}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lb33/d;->F:Lb33/d;

    new-instance v5, Lb33/d;

    const/4 v6, 0x5

    const-string v7, "FirstVideoFrame"

    const-string v8, "FIRST_VIDEO_FRAME_RENDERED"

    invoke-direct {v5, v8, v6, v7}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lb33/d;

    const/4 v7, 0x6

    const-string v8, "MediaDevicePermission"

    const-string v9, "MEDIA_DEVICE_PERMISSION"

    invoke-direct {v6, v9, v7, v8}, Lb33/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lb33/d;->G:Lb33/d;

    filled-new-array/range {v0 .. v6}, [Lb33/d;

    move-result-object v0

    sput-object v0, Lb33/d;->H:[Lb33/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb33/d;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb33/d;
    .locals 1

    const-class v0, Lb33/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb33/d;

    return-object p0
.end method

.method public static values()[Lb33/d;
    .locals 1

    sget-object v0, Lb33/d;->H:[Lb33/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb33/d;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb33/d;->w:Ljava/lang/String;

    return-object v0
.end method
