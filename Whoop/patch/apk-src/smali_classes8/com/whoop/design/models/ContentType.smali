.class public final enum Lcom/whoop/design/models/ContentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/ContentType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/ContentType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/ContentType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DYNAMIC_LOTTIE",
        "LOTTIE",
        "ICON",
        "IMAGE",
        "UNKNOWN",
        "Companion",
        "design-models_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/ContentType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/design/models/ContentType$Companion;

.field public static final enum DYNAMIC_LOTTIE:Lcom/whoop/design/models/ContentType;

.field public static final enum ICON:Lcom/whoop/design/models/ContentType;

.field public static final enum IMAGE:Lcom/whoop/design/models/ContentType;

.field public static final enum LOTTIE:Lcom/whoop/design/models/ContentType;

.field public static final enum UNKNOWN:Lcom/whoop/design/models/ContentType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/ContentType;
    .locals 5

    sget-object v0, Lcom/whoop/design/models/ContentType;->DYNAMIC_LOTTIE:Lcom/whoop/design/models/ContentType;

    sget-object v1, Lcom/whoop/design/models/ContentType;->LOTTIE:Lcom/whoop/design/models/ContentType;

    sget-object v2, Lcom/whoop/design/models/ContentType;->ICON:Lcom/whoop/design/models/ContentType;

    sget-object v3, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    sget-object v4, Lcom/whoop/design/models/ContentType;->UNKNOWN:Lcom/whoop/design/models/ContentType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/design/models/ContentType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/ContentType;

    const-string v1, "DYNAMIC_LOTTIE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->DYNAMIC_LOTTIE:Lcom/whoop/design/models/ContentType;

    new-instance v0, Lcom/whoop/design/models/ContentType;

    const-string v1, "LOTTIE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->LOTTIE:Lcom/whoop/design/models/ContentType;

    new-instance v0, Lcom/whoop/design/models/ContentType;

    const-string v1, "ICON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->ICON:Lcom/whoop/design/models/ContentType;

    new-instance v0, Lcom/whoop/design/models/ContentType;

    const-string v1, "IMAGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    new-instance v0, Lcom/whoop/design/models/ContentType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->UNKNOWN:Lcom/whoop/design/models/ContentType;

    invoke-static {}, Lcom/whoop/design/models/ContentType;->$values()[Lcom/whoop/design/models/ContentType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/ContentType;->$VALUES:[Lcom/whoop/design/models/ContentType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/ContentType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/ContentType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/ContentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/ContentType;->Companion:Lcom/whoop/design/models/ContentType$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lcom/whoop/core/details/network/model/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/ContentType;->$cachedSerializer$delegate:Ll83/h;

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

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.ContentType"

    invoke-static {}, Lcom/whoop/design/models/ContentType;->values()[Lcom/whoop/design/models/ContentType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ContentType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ContentType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/design/models/ContentType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/ContentType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/ContentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/ContentType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/ContentType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ContentType;->$VALUES:[Lcom/whoop/design/models/ContentType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/ContentType;

    return-object v0
.end method
