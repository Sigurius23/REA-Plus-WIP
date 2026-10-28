.class public final enum Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "UNKNOWN",
        "HARVARD",
        "MAVERICK",
        "PUFFIN",
        "GOOSE",
        "MONUMENT",
        "SYMPHONY",
        "connectivity-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName$a;

.field public static final enum GOOSE:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum HARVARD:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum MAVERICK:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum MONUMENT:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum SYMPHONY:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

.field public static final enum UNKNOWN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;
    .locals 7

    sget-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->UNKNOWN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v1, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->HARVARD:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v2, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MAVERICK:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v3, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v4, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->GOOSE:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v5, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MONUMENT:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    sget-object v6, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->SYMPHONY:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    filled-new-array/range {v0 .. v6}, [Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->UNKNOWN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "HARVARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->HARVARD:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "MAVERICK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MAVERICK:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "PUFFIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "GOOSE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->GOOSE:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "MONUMENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->MONUMENT:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    const-string v1, "SYMPHONY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->SYMPHONY:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$values()[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$VALUES:[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->Companion:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lga1/b;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lga1/b;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->serializedValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.connectivityCore.firmware.models.WhoopDeviceName"

    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->values()[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;
    .locals 1

    const-class v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    return-object p0
.end method

.method public static values()[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->$VALUES:[Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
