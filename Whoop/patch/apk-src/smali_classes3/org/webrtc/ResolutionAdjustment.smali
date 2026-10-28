.class public final enum Lorg/webrtc/ResolutionAdjustment;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/ResolutionAdjustment;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/ResolutionAdjustment;

.field public static final enum MULTIPLE_OF_16:Lorg/webrtc/ResolutionAdjustment;

.field public static final enum MULTIPLE_OF_2:Lorg/webrtc/ResolutionAdjustment;

.field public static final enum MULTIPLE_OF_4:Lorg/webrtc/ResolutionAdjustment;

.field public static final enum MULTIPLE_OF_8:Lorg/webrtc/ResolutionAdjustment;

.field public static final enum NONE:Lorg/webrtc/ResolutionAdjustment;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lorg/webrtc/ResolutionAdjustment;
    .locals 5

    sget-object v0, Lorg/webrtc/ResolutionAdjustment;->NONE:Lorg/webrtc/ResolutionAdjustment;

    sget-object v1, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_2:Lorg/webrtc/ResolutionAdjustment;

    sget-object v2, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_4:Lorg/webrtc/ResolutionAdjustment;

    sget-object v3, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_8:Lorg/webrtc/ResolutionAdjustment;

    sget-object v4, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_16:Lorg/webrtc/ResolutionAdjustment;

    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/webrtc/ResolutionAdjustment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/webrtc/ResolutionAdjustment;

    const-string v1, "NONE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/webrtc/ResolutionAdjustment;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->NONE:Lorg/webrtc/ResolutionAdjustment;

    new-instance v0, Lorg/webrtc/ResolutionAdjustment;

    const-string v1, "MULTIPLE_OF_2"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lorg/webrtc/ResolutionAdjustment;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_2:Lorg/webrtc/ResolutionAdjustment;

    new-instance v0, Lorg/webrtc/ResolutionAdjustment;

    const-string v1, "MULTIPLE_OF_4"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lorg/webrtc/ResolutionAdjustment;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_4:Lorg/webrtc/ResolutionAdjustment;

    new-instance v0, Lorg/webrtc/ResolutionAdjustment;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v4, "MULTIPLE_OF_8"

    invoke-direct {v0, v4, v1, v2}, Lorg/webrtc/ResolutionAdjustment;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_8:Lorg/webrtc/ResolutionAdjustment;

    new-instance v0, Lorg/webrtc/ResolutionAdjustment;

    const-string v1, "MULTIPLE_OF_16"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v3, v2}, Lorg/webrtc/ResolutionAdjustment;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_16:Lorg/webrtc/ResolutionAdjustment;

    invoke-static {}, Lorg/webrtc/ResolutionAdjustment;->$values()[Lorg/webrtc/ResolutionAdjustment;

    move-result-object v0

    sput-object v0, Lorg/webrtc/ResolutionAdjustment;->$VALUES:[Lorg/webrtc/ResolutionAdjustment;

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

    iput p3, p0, Lorg/webrtc/ResolutionAdjustment;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/ResolutionAdjustment;
    .locals 1

    const-class v0, Lorg/webrtc/ResolutionAdjustment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/ResolutionAdjustment;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/ResolutionAdjustment;
    .locals 1

    sget-object v0, Lorg/webrtc/ResolutionAdjustment;->$VALUES:[Lorg/webrtc/ResolutionAdjustment;

    invoke-virtual {v0}, [Lorg/webrtc/ResolutionAdjustment;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/ResolutionAdjustment;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lorg/webrtc/ResolutionAdjustment;->value:I

    return v0
.end method
