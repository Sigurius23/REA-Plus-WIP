.class public final enum Lcom/whoop/design/models/items/IconSize;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/IconSize$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/IconSize;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/IconSize;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "EXTRA_SMALL",
        "SMALL",
        "MEDIUM",
        "LARGE",
        "EXTRA_LARGE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/IconSize;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/design/models/items/IconSize$Companion;

.field public static final enum EXTRA_LARGE:Lcom/whoop/design/models/items/IconSize;

.field public static final enum EXTRA_SMALL:Lcom/whoop/design/models/items/IconSize;

.field public static final enum LARGE:Lcom/whoop/design/models/items/IconSize;

.field public static final enum MEDIUM:Lcom/whoop/design/models/items/IconSize;

.field public static final enum SMALL:Lcom/whoop/design/models/items/IconSize;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/IconSize;
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/IconSize;->EXTRA_SMALL:Lcom/whoop/design/models/items/IconSize;

    sget-object v1, Lcom/whoop/design/models/items/IconSize;->SMALL:Lcom/whoop/design/models/items/IconSize;

    sget-object v2, Lcom/whoop/design/models/items/IconSize;->MEDIUM:Lcom/whoop/design/models/items/IconSize;

    sget-object v3, Lcom/whoop/design/models/items/IconSize;->LARGE:Lcom/whoop/design/models/items/IconSize;

    sget-object v4, Lcom/whoop/design/models/items/IconSize;->EXTRA_LARGE:Lcom/whoop/design/models/items/IconSize;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/design/models/items/IconSize;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/IconSize;

    const-string v1, "EXTRA_SMALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/IconSize;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->EXTRA_SMALL:Lcom/whoop/design/models/items/IconSize;

    new-instance v0, Lcom/whoop/design/models/items/IconSize;

    const-string v1, "SMALL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/IconSize;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->SMALL:Lcom/whoop/design/models/items/IconSize;

    new-instance v0, Lcom/whoop/design/models/items/IconSize;

    const-string v1, "MEDIUM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/IconSize;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->MEDIUM:Lcom/whoop/design/models/items/IconSize;

    new-instance v0, Lcom/whoop/design/models/items/IconSize;

    const-string v1, "LARGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/IconSize;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->LARGE:Lcom/whoop/design/models/items/IconSize;

    new-instance v0, Lcom/whoop/design/models/items/IconSize;

    const-string v1, "EXTRA_LARGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/IconSize;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->EXTRA_LARGE:Lcom/whoop/design/models/items/IconSize;

    invoke-static {}, Lcom/whoop/design/models/items/IconSize;->$values()[Lcom/whoop/design/models/items/IconSize;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->$VALUES:[Lcom/whoop/design/models/items/IconSize;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/items/IconSize$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/IconSize$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->Companion:Lcom/whoop/design/models/items/IconSize$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lw91/f;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lw91/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/IconSize;->$cachedSerializer$delegate:Ll83/h;

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

    const-string v0, "com.whoop.design.models.items.IconSize"

    invoke-static {}, Lcom/whoop/design/models/items/IconSize;->values()[Lcom/whoop/design/models/items/IconSize;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/IconSize;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/IconSize;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/design/models/items/IconSize;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/IconSize;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/IconSize;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/IconSize;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/IconSize;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/IconSize;->$VALUES:[Lcom/whoop/design/models/items/IconSize;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/IconSize;

    return-object v0
.end method
