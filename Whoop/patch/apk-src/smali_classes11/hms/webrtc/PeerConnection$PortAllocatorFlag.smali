.class public final enum Lhms/webrtc/PeerConnection$PortAllocatorFlag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PortAllocatorFlag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$PortAllocatorFlag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_ADAPTER_ENUMERATION:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_COSTLY_NETWORKS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_DEFAULT_LOCAL_CANDIDATE:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_LINK_LOCAL_NETWORKS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_RELAY:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_STUN:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_TCP:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_UDP:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum DISABLE_UDP_RELAY:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum ENABLE_ANY_ADDRESS_PORTS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum ENABLE_IPV6:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum ENABLE_IPV6_ON_WIFI:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum ENABLE_SHARED_SOCKET:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

.field public static final enum ENABLE_STUN_RETRANSMIT_ATTRIBUTE:Lhms/webrtc/PeerConnection$PortAllocatorFlag;


# instance fields
.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v1, "DISABLE_UDP"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_UDP:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v1, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v2, "DISABLE_STUN"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_STUN:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v2, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v3, "DISABLE_RELAY"

    const/4 v5, 0x4

    invoke-direct {v2, v3, v4, v5}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_RELAY:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v3, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v4, "DISABLE_TCP"

    const/4 v6, 0x3

    const/16 v7, 0x8

    invoke-direct {v3, v4, v6, v7}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_TCP:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v4, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v6, "ENABLE_IPV6"

    const/16 v8, 0x40

    invoke-direct {v4, v6, v5, v8}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_IPV6:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v5, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/4 v6, 0x5

    const/16 v8, 0x100

    const-string v9, "ENABLE_SHARED_SOCKET"

    invoke-direct {v5, v9, v6, v8}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_SHARED_SOCKET:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v6, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/4 v8, 0x6

    const/16 v9, 0x200

    const-string v10, "ENABLE_STUN_RETRANSMIT_ATTRIBUTE"

    invoke-direct {v6, v10, v8, v9}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_STUN_RETRANSMIT_ATTRIBUTE:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v8, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/4 v9, 0x7

    const/16 v10, 0x400

    const-string v11, "DISABLE_ADAPTER_ENUMERATION"

    invoke-direct {v8, v11, v9, v10}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_ADAPTER_ENUMERATION:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    move-object v9, v8

    new-instance v8, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const-string v10, "DISABLE_DEFAULT_LOCAL_CANDIDATE"

    const/16 v11, 0x800

    invoke-direct {v8, v10, v7, v11}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_DEFAULT_LOCAL_CANDIDATE:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    move-object v7, v9

    new-instance v9, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/16 v10, 0x9

    const/16 v11, 0x1000

    const-string v12, "DISABLE_UDP_RELAY"

    invoke-direct {v9, v12, v10, v11}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_UDP_RELAY:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v10, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/16 v11, 0xa

    const/16 v12, 0x2000

    const-string v13, "DISABLE_COSTLY_NETWORKS"

    invoke-direct {v10, v13, v11, v12}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_COSTLY_NETWORKS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v11, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/16 v12, 0xb

    const/16 v13, 0x4000

    const-string v14, "ENABLE_IPV6_ON_WIFI"

    invoke-direct {v11, v14, v12, v13}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_IPV6_ON_WIFI:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v12, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/16 v13, 0xc

    const v14, 0x8000

    const-string v15, "ENABLE_ANY_ADDRESS_PORTS"

    invoke-direct {v12, v15, v13, v14}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->ENABLE_ANY_ADDRESS_PORTS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    new-instance v13, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    const/16 v14, 0xd

    const/high16 v15, 0x10000

    move-object/from16 v16, v0

    const-string v0, "DISABLE_LINK_LOCAL_NETWORKS"

    invoke-direct {v13, v0, v14, v15}, Lhms/webrtc/PeerConnection$PortAllocatorFlag;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->DISABLE_LINK_LOCAL_NETWORKS:Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    move-object/from16 v0, v16

    filled-new-array/range {v0 .. v13}, [Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->$VALUES:[Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->id:I

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/PeerConnection$PortAllocatorFlag;)I
    .locals 0

    iget p0, p0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->id:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$PortAllocatorFlag;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$PortAllocatorFlag;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$PortAllocatorFlag;->$VALUES:[Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$PortAllocatorFlag;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$PortAllocatorFlag;

    return-object v0
.end method
