.class public final enum Lorg/webrtc/NetworkChangeDetector$NetworkSlice;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/NetworkChangeDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NetworkSlice"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/NetworkChangeDetector$NetworkSlice;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

.field public static final enum NO_SLICE:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

.field public static final enum UNIFIED_COMMUNICATIONS:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;


# instance fields
.field public final code:I


# direct methods
.method private static synthetic $values()[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;
    .locals 2

    sget-object v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->NO_SLICE:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    sget-object v1, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->UNIFIED_COMMUNICATIONS:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    filled-new-array {v0, v1}, [Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    const-string v1, "NO_SLICE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->NO_SLICE:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    new-instance v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    const-string v1, "UNIFIED_COMMUNICATIONS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->UNIFIED_COMMUNICATIONS:Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    invoke-static {}, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->$values()[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    move-result-object v0

    sput-object v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->$VALUES:[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

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

    iput p3, p0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/NetworkChangeDetector$NetworkSlice;
    .locals 1

    const-class v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;
    .locals 1

    sget-object v0, Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->$VALUES:[Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    invoke-virtual {v0}, [Lorg/webrtc/NetworkChangeDetector$NetworkSlice;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/NetworkChangeDetector$NetworkSlice;

    return-object v0
.end method
