.class public final enum Llive/hms/video/connection/models/HMSConnectionRole;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/models/HMSConnectionRole$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "PUBLISH",
        "SUBSCRIBE",
        "Companion",
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

.field private static final synthetic $VALUES:[Llive/hms/video/connection/models/HMSConnectionRole;

.field public static final Companion:Llive/hms/video/connection/models/HMSConnectionRole$Companion;

.field public static final enum PUBLISH:Llive/hms/video/connection/models/HMSConnectionRole;

.field public static final enum SUBSCRIBE:Llive/hms/video/connection/models/HMSConnectionRole;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 2

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->PUBLISH:Llive/hms/video/connection/models/HMSConnectionRole;

    sget-object v1, Llive/hms/video/connection/models/HMSConnectionRole;->SUBSCRIBE:Llive/hms/video/connection/models/HMSConnectionRole;

    filled-new-array {v0, v1}, [Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/connection/models/HMSConnectionRole;

    const-string v1, "PUBLISH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Llive/hms/video/connection/models/HMSConnectionRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->PUBLISH:Llive/hms/video/connection/models/HMSConnectionRole;

    new-instance v0, Llive/hms/video/connection/models/HMSConnectionRole;

    const-string v1, "SUBSCRIBE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Llive/hms/video/connection/models/HMSConnectionRole;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->SUBSCRIBE:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-static {}, Llive/hms/video/connection/models/HMSConnectionRole;->$values()[Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v0

    sput-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->$VALUES:[Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->$ENTRIES:Lt83/a;

    new-instance v0, Llive/hms/video/connection/models/HMSConnectionRole$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/models/HMSConnectionRole$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->Companion:Llive/hms/video/connection/models/HMSConnectionRole$Companion;

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

    iput p3, p0, Llive/hms/video/connection/models/HMSConnectionRole;->value:I

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

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 1

    const-class v0, Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/connection/models/HMSConnectionRole;

    return-object p0
.end method

.method public static values()[Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 1

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->$VALUES:[Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/connection/models/HMSConnectionRole;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/models/HMSConnectionRole;->value:I

    return v0
.end method
