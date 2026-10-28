.class public final enum Llive/hms/video/media/settings/HMSLayer;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/media/settings/HMSLayer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSLayer;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "LOW",
        "MEDIUM",
        "HIGH",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Llive/hms/video/media/settings/HMSLayer;

.field public static final enum HIGH:Llive/hms/video/media/settings/HMSLayer;

.field public static final enum LOW:Llive/hms/video/media/settings/HMSLayer;

.field public static final enum MEDIUM:Llive/hms/video/media/settings/HMSLayer;


# direct methods
.method private static final synthetic $values()[Llive/hms/video/media/settings/HMSLayer;
    .locals 3

    sget-object v0, Llive/hms/video/media/settings/HMSLayer;->LOW:Llive/hms/video/media/settings/HMSLayer;

    sget-object v1, Llive/hms/video/media/settings/HMSLayer;->MEDIUM:Llive/hms/video/media/settings/HMSLayer;

    sget-object v2, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    filled-new-array {v0, v1, v2}, [Llive/hms/video/media/settings/HMSLayer;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/media/settings/HMSLayer;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/media/settings/HMSLayer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/media/settings/HMSLayer;->LOW:Llive/hms/video/media/settings/HMSLayer;

    new-instance v0, Llive/hms/video/media/settings/HMSLayer;

    const-string v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/media/settings/HMSLayer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/media/settings/HMSLayer;->MEDIUM:Llive/hms/video/media/settings/HMSLayer;

    new-instance v0, Llive/hms/video/media/settings/HMSLayer;

    const-string v1, "HIGH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/media/settings/HMSLayer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    invoke-static {}, Llive/hms/video/media/settings/HMSLayer;->$values()[Llive/hms/video/media/settings/HMSLayer;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/HMSLayer;->$VALUES:[Llive/hms/video/media/settings/HMSLayer;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/settings/HMSLayer;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/media/settings/HMSLayer;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    const-class v0, Llive/hms/video/media/settings/HMSLayer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/media/settings/HMSLayer;

    return-object p0
.end method

.method public static values()[Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    sget-object v0, Llive/hms/video/media/settings/HMSLayer;->$VALUES:[Llive/hms/video/media/settings/HMSLayer;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/media/settings/HMSLayer;

    return-object v0
.end method
