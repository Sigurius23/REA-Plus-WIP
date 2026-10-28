.class public final enum Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "PLAIN",
        "CONTAINED",
        "community-moments_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum CONTAINED:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;

.field public static final enum PLAIN:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 2

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->PLAIN:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    sget-object v1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->CONTAINED:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    filled-new-array {v0, v1}, [Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    const-string v1, "PLAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->PLAIN:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    const-string v1, "CONTAINED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->CONTAINED:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$values()[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$VALUES:[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->Companion:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lur0/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lur0/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$cachedSerializer$delegate:Ll83/h;

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

    const-string v0, "com.whoop.communitymoments.domain.models.MenuAnchorButtonStyle"

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->values()[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 1

    const-class v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->$VALUES:[Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    return-object v0
.end method
