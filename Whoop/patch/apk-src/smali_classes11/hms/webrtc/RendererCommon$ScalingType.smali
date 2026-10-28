.class public final enum Lhms/webrtc/RendererCommon$ScalingType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/RendererCommon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ScalingType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/RendererCommon$ScalingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/RendererCommon$ScalingType;

.field public static final enum SCALE_ASPECT_BALANCED:Lhms/webrtc/RendererCommon$ScalingType;

.field public static final enum SCALE_ASPECT_FILL:Lhms/webrtc/RendererCommon$ScalingType;

.field public static final enum SCALE_ASPECT_FIT:Lhms/webrtc/RendererCommon$ScalingType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lhms/webrtc/RendererCommon$ScalingType;

    const-string v1, "SCALE_ASPECT_FIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/RendererCommon$ScalingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/RendererCommon$ScalingType;->SCALE_ASPECT_FIT:Lhms/webrtc/RendererCommon$ScalingType;

    new-instance v1, Lhms/webrtc/RendererCommon$ScalingType;

    const-string v2, "SCALE_ASPECT_FILL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/RendererCommon$ScalingType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/RendererCommon$ScalingType;->SCALE_ASPECT_FILL:Lhms/webrtc/RendererCommon$ScalingType;

    new-instance v2, Lhms/webrtc/RendererCommon$ScalingType;

    const-string v3, "SCALE_ASPECT_BALANCED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lhms/webrtc/RendererCommon$ScalingType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lhms/webrtc/RendererCommon$ScalingType;->SCALE_ASPECT_BALANCED:Lhms/webrtc/RendererCommon$ScalingType;

    filled-new-array {v0, v1, v2}, [Lhms/webrtc/RendererCommon$ScalingType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/RendererCommon$ScalingType;->$VALUES:[Lhms/webrtc/RendererCommon$ScalingType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/RendererCommon$ScalingType;
    .locals 1

    const-class v0, Lhms/webrtc/RendererCommon$ScalingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/RendererCommon$ScalingType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/RendererCommon$ScalingType;
    .locals 1

    sget-object v0, Lhms/webrtc/RendererCommon$ScalingType;->$VALUES:[Lhms/webrtc/RendererCommon$ScalingType;

    invoke-virtual {v0}, [Lhms/webrtc/RendererCommon$ScalingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/RendererCommon$ScalingType;

    return-object v0
.end method
