.class public final enum Lhms/webrtc/PeerConnection$AdapterType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AdapterType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/PeerConnection$AdapterType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum ADAPTER_TYPE_ANY:Lhms/webrtc/PeerConnection$AdapterType;

.field private static final BY_BITMASK:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lhms/webrtc/PeerConnection$AdapterType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CELLULAR:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum CELLULAR_2G:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum CELLULAR_3G:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum CELLULAR_4G:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum CELLULAR_5G:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum ETHERNET:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum LOOPBACK:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum UNKNOWN:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum VPN:Lhms/webrtc/PeerConnection$AdapterType;

.field public static final enum WIFI:Lhms/webrtc/PeerConnection$AdapterType;


# instance fields
.field public final bitMask:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lhms/webrtc/PeerConnection$AdapterType;

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "UNKNOWN"

    invoke-direct {v0, v2, v11, v1}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lhms/webrtc/PeerConnection$AdapterType;->UNKNOWN:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v1, Lhms/webrtc/PeerConnection$AdapterType;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "ETHERNET"

    invoke-direct {v1, v4, v2, v3}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v1, Lhms/webrtc/PeerConnection$AdapterType;->ETHERNET:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v2, Lhms/webrtc/PeerConnection$AdapterType;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "WIFI"

    invoke-direct {v2, v5, v3, v4}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v2, Lhms/webrtc/PeerConnection$AdapterType;->WIFI:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v3, Lhms/webrtc/PeerConnection$AdapterType;

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "CELLULAR"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v5}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v3, Lhms/webrtc/PeerConnection$AdapterType;->CELLULAR:Lhms/webrtc/PeerConnection$AdapterType;

    move v5, v4

    new-instance v4, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "VPN"

    invoke-direct {v4, v8, v5, v7}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v4, Lhms/webrtc/PeerConnection$AdapterType;->VPN:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v5, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v7, 0x10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "LOOPBACK"

    const/4 v9, 0x5

    invoke-direct {v5, v8, v9, v7}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v5, Lhms/webrtc/PeerConnection$AdapterType;->LOOPBACK:Lhms/webrtc/PeerConnection$AdapterType;

    move v7, v6

    new-instance v6, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v8, 0x20

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "ADAPTER_TYPE_ANY"

    const/4 v10, 0x6

    invoke-direct {v6, v9, v10, v8}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v6, Lhms/webrtc/PeerConnection$AdapterType;->ADAPTER_TYPE_ANY:Lhms/webrtc/PeerConnection$AdapterType;

    move v8, v7

    new-instance v7, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v9, 0x40

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "CELLULAR_2G"

    const/4 v12, 0x7

    invoke-direct {v7, v10, v12, v9}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v7, Lhms/webrtc/PeerConnection$AdapterType;->CELLULAR_2G:Lhms/webrtc/PeerConnection$AdapterType;

    move v9, v8

    new-instance v8, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v10, 0x80

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v12, "CELLULAR_3G"

    invoke-direct {v8, v12, v9, v10}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v8, Lhms/webrtc/PeerConnection$AdapterType;->CELLULAR_3G:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v9, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v10, 0x100

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v12, "CELLULAR_4G"

    const/16 v13, 0x9

    invoke-direct {v9, v12, v13, v10}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v9, Lhms/webrtc/PeerConnection$AdapterType;->CELLULAR_4G:Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v10, Lhms/webrtc/PeerConnection$AdapterType;

    const/16 v12, 0x200

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "CELLULAR_5G"

    const/16 v14, 0xa

    invoke-direct {v10, v13, v14, v12}, Lhms/webrtc/PeerConnection$AdapterType;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v10, Lhms/webrtc/PeerConnection$AdapterType;->CELLULAR_5G:Lhms/webrtc/PeerConnection$AdapterType;

    filled-new-array/range {v0 .. v10}, [Lhms/webrtc/PeerConnection$AdapterType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/PeerConnection$AdapterType;->$VALUES:[Lhms/webrtc/PeerConnection$AdapterType;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lhms/webrtc/PeerConnection$AdapterType;->BY_BITMASK:Ljava/util/Map;

    invoke-static {}, Lhms/webrtc/PeerConnection$AdapterType;->values()[Lhms/webrtc/PeerConnection$AdapterType;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v11, v1, :cond_0

    aget-object v2, v0, v11

    sget-object v3, Lhms/webrtc/PeerConnection$AdapterType;->BY_BITMASK:Ljava/util/Map;

    iget-object v4, v2, Lhms/webrtc/PeerConnection$AdapterType;->bitMask:Ljava/lang/Integer;

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lhms/webrtc/PeerConnection$AdapterType;->bitMask:Ljava/lang/Integer;

    return-void
.end method

.method public static fromNativeIndex(I)Lhms/webrtc/PeerConnection$AdapterType;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
        value = "AdapterType"
    .end annotation

    sget-object v0, Lhms/webrtc/PeerConnection$AdapterType;->BY_BITMASK:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$AdapterType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/PeerConnection$AdapterType;
    .locals 1

    const-class v0, Lhms/webrtc/PeerConnection$AdapterType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/PeerConnection$AdapterType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/PeerConnection$AdapterType;
    .locals 1

    sget-object v0, Lhms/webrtc/PeerConnection$AdapterType;->$VALUES:[Lhms/webrtc/PeerConnection$AdapterType;

    invoke-virtual {v0}, [Lhms/webrtc/PeerConnection$AdapterType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/PeerConnection$AdapterType;

    return-object v0
.end method
