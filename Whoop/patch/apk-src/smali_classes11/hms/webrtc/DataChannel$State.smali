.class public final enum Lhms/webrtc/DataChannel$State;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/DataChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/DataChannel$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/DataChannel$State;

.field public static final enum CLOSED:Lhms/webrtc/DataChannel$State;

.field public static final enum CLOSING:Lhms/webrtc/DataChannel$State;

.field public static final enum CONNECTING:Lhms/webrtc/DataChannel$State;

.field public static final enum OPEN:Lhms/webrtc/DataChannel$State;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lhms/webrtc/DataChannel$State;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/DataChannel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/DataChannel$State;->CONNECTING:Lhms/webrtc/DataChannel$State;

    new-instance v1, Lhms/webrtc/DataChannel$State;

    const-string v2, "OPEN"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/DataChannel$State;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/DataChannel$State;->OPEN:Lhms/webrtc/DataChannel$State;

    new-instance v2, Lhms/webrtc/DataChannel$State;

    const-string v3, "CLOSING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lhms/webrtc/DataChannel$State;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lhms/webrtc/DataChannel$State;->CLOSING:Lhms/webrtc/DataChannel$State;

    new-instance v3, Lhms/webrtc/DataChannel$State;

    const-string v4, "CLOSED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lhms/webrtc/DataChannel$State;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lhms/webrtc/DataChannel$State;->CLOSED:Lhms/webrtc/DataChannel$State;

    filled-new-array {v0, v1, v2, v3}, [Lhms/webrtc/DataChannel$State;

    move-result-object v0

    sput-object v0, Lhms/webrtc/DataChannel$State;->$VALUES:[Lhms/webrtc/DataChannel$State;

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

.method public static fromNativeIndex(I)Lhms/webrtc/DataChannel$State;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
        value = "State"
    .end annotation

    invoke-static {}, Lhms/webrtc/DataChannel$State;->values()[Lhms/webrtc/DataChannel$State;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/DataChannel$State;
    .locals 1

    const-class v0, Lhms/webrtc/DataChannel$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/DataChannel$State;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/DataChannel$State;
    .locals 1

    sget-object v0, Lhms/webrtc/DataChannel$State;->$VALUES:[Lhms/webrtc/DataChannel$State;

    invoke-virtual {v0}, [Lhms/webrtc/DataChannel$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/DataChannel$State;

    return-object v0
.end method
