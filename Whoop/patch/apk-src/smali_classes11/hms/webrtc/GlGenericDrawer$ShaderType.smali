.class public final enum Lhms/webrtc/GlGenericDrawer$ShaderType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/GlGenericDrawer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ShaderType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/GlGenericDrawer$ShaderType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/GlGenericDrawer$ShaderType;

.field public static final enum OES:Lhms/webrtc/GlGenericDrawer$ShaderType;

.field public static final enum RGB:Lhms/webrtc/GlGenericDrawer$ShaderType;

.field public static final enum YUV:Lhms/webrtc/GlGenericDrawer$ShaderType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lhms/webrtc/GlGenericDrawer$ShaderType;

    const-string v1, "OES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/GlGenericDrawer$ShaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/GlGenericDrawer$ShaderType;->OES:Lhms/webrtc/GlGenericDrawer$ShaderType;

    new-instance v1, Lhms/webrtc/GlGenericDrawer$ShaderType;

    const-string v2, "RGB"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/GlGenericDrawer$ShaderType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/GlGenericDrawer$ShaderType;->RGB:Lhms/webrtc/GlGenericDrawer$ShaderType;

    new-instance v2, Lhms/webrtc/GlGenericDrawer$ShaderType;

    const-string v3, "YUV"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lhms/webrtc/GlGenericDrawer$ShaderType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lhms/webrtc/GlGenericDrawer$ShaderType;->YUV:Lhms/webrtc/GlGenericDrawer$ShaderType;

    filled-new-array {v0, v1, v2}, [Lhms/webrtc/GlGenericDrawer$ShaderType;

    move-result-object v0

    sput-object v0, Lhms/webrtc/GlGenericDrawer$ShaderType;->$VALUES:[Lhms/webrtc/GlGenericDrawer$ShaderType;

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

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/GlGenericDrawer$ShaderType;
    .locals 1

    const-class v0, Lhms/webrtc/GlGenericDrawer$ShaderType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/GlGenericDrawer$ShaderType;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/GlGenericDrawer$ShaderType;
    .locals 1

    sget-object v0, Lhms/webrtc/GlGenericDrawer$ShaderType;->$VALUES:[Lhms/webrtc/GlGenericDrawer$ShaderType;

    invoke-virtual {v0}, [Lhms/webrtc/GlGenericDrawer$ShaderType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/GlGenericDrawer$ShaderType;

    return-object v0
.end method
